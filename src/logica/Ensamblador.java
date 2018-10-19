package logica;

import interfaz.HomePage;
import logica.Aplicacion;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998 Elías Arama, carné: 20171110178
 */
public class Ensamblador extends Thread {

    private Parametros param;
    //Todos los almacenes
    private Almacen aBaterias, aPantallas, aCables;

    //Semaforos para poderproducir en los tres almacenes
    private Semaphore sPB, sPP, sPC;

    //Semaforos para consumir de los tres almacenes
    private Semaphore sCB, sCP, sCC;

    //Semaforos para la exclusión mutua de la zona crítica los tres almacenes 
    private Semaphore sMutexB, sMutexP, sMutexC;
    private int proxCB, proxCP, proxCC;

    public Ensamblador(Almacen aBaterias, Almacen aPantallas, Almacen aCables, Semaphore sPB, Semaphore sPP, Semaphore sPC, Semaphore sCB, Semaphore sCP, Semaphore sCC, Semaphore sMutexB, Semaphore sMutexP, Semaphore sMutexC, Parametros param, int proxCB, int proxCP, int proxCC) {
        this.aBaterias = aBaterias;
        this.aPantallas = aPantallas;
        this.aCables = aCables;
        this.sPB = sPB;
        this.sPP = sPP;
        this.sPC = sPC;
        this.sCB = sCB;
        this.sCP = sCP;
        this.sCC = sCC;
        this.sMutexB = sMutexB;
        this.sMutexP = sMutexP;
        this.sMutexC = sMutexC;
        this.param = param;
        this.proxCB = proxCB;
        this.proxCP = proxCP;
        this.proxCC = proxCC;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sCB.acquire();
                sCP.acquire();
                sCC.acquire(2);
                
                Thread.sleep(this.param.getUnDiaEnSegs() * 1000 * 2);
                
                sMutexB.acquire();
                this.consumir(aBaterias, 1);
                //HomePage.textFieldAlmacenBaterias.setText("");
                //HomePage.textFieldAlmacenBaterias.setText(String.valueOf(this.aBaterias.getCantUnidades()));
                sMutexB.release();

                sMutexP.acquire();
                this.consumir(aPantallas, 2);
                //HomePage.textFieldAlmacenPantallas.setText("");
                //HomePage.textFieldAlmacenPantallas.setText(String.valueOf(this.aPantallas.getCantUnidades()));
                sMutexP.release();

                sMutexC.acquire();
                this.consumir(aCables, 3);
                //HomePage.textFieldAlmacenCables.setText("");
                //HomePage.textFieldAlmacenCables.setText(String.valueOf(this.aCables.getCantUnidades()));
                sMutexC.release();
                
                Aplicacion.setCelularesEnsamblados(Aplicacion.getCelularesEnsamblados() + 1);
                //HomePage.textFieldCelularesEnsamblados.setText(String.valueOf(Aplicacion.celularesEnsamblados));
                
                sPC.release(2);
                sPP.release();
                sPB.release();

            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorBateria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void consumir(Almacen almacen, int tipo) {

        if (tipo == 1) {
            almacen.setVAlmacen(this.proxCB, 0);
            this.proxCB = (this.proxCB + 1) % almacen.getTAlmacen();
            almacen.cantUnidades--;
        } else if (tipo == 2) {
            almacen.setVAlmacen(this.proxCP, 0);
            this.proxCP = (this.proxCP + 1) % almacen.getTAlmacen();
            almacen.cantUnidades--;
        } else if (tipo == 3) {
            almacen.setVAlmacen(this.proxCC, 0);
            this.proxCC = (this.proxCC + 1) % almacen.getTAlmacen();
            almacen.setVAlmacen(this.proxCC, 0);
            this.proxCC = (this.proxCC + 1) % almacen.getTAlmacen();
            almacen.cantUnidades--;
            almacen.cantUnidades--;
        }
    }
}
