package logica;

import interfaz.HomePage;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998 Elías Arama, carné: 20171110178
 */
public class Ensamblador extends Thread {
    
    private ArrayList<Integer> unidadesProducidas;
    private Parametros param;
    //Todos los almacenes
    private Almacen aBaterias, aPantallas, aCables;

    //Semaforos para poderproducir en los tres almacenes
    private Semaphore sPB, sPP, sPC;

    //Semaforos para consumir de los tres almacenes
    private Semaphore sCB, sCP, sCC;

    //Semaforos para la exclusión mutua de la zona crítica los tres almacenes 
    private Semaphore sMutexB, sMutexP, sMutexC;

    public Ensamblador(Almacen aBaterias, Almacen aPantallas, Almacen aCables, Semaphore sPB, Semaphore sPP, Semaphore sPC, Semaphore sCB, Semaphore sCP, Semaphore sCC, Semaphore sMutexB, Semaphore sMutexP, Semaphore sMutexC, Parametros param, ArrayList<Integer> unidadesProducidas) {
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
        this.unidadesProducidas = unidadesProducidas;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sCB.acquire();
                sCP.acquire();
                sCC.acquire(2);
                
                sMutexB.acquire();
                this.consumir(aBaterias, 1);
                HomePage.textFieldAlmacenBaterias.setText("");
                HomePage.textFieldAlmacenBaterias.setText(String.valueOf(aBaterias.getAlmacen().size()));
                Thread.sleep(this.param.getUnDiaEnSegs()*500);
                sMutexB.release();
                
                sMutexP.acquire();
                this.consumir(aPantallas, 2);
                HomePage.textFieldAlmacenPantallas.setText("");
                HomePage.textFieldAlmacenPantallas.setText(String.valueOf(aPantallas.getAlmacen().size()));
                Thread.sleep(this.param.getUnDiaEnSegs()*500);
                sMutexP.release();
                
                sMutexC.acquire();
                this.consumir(aCables, 3);
                HomePage.textFieldAlmacenCables.setText("");
                HomePage.textFieldAlmacenCables.setText(String.valueOf(aCables.getAlmacen().size()));
                Thread.sleep(this.param.getUnDiaEnSegs()*1000);
                this.unidadesProducidas.add(1);
                sMutexC.release();
                
                HomePage.textFieldCelularesEnsamblados.setText(String.valueOf(unidadesProducidas.size()));
                sPC.release(2);
                sPP.release();
                sPB.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorBateria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void consumir(Almacen almacen, int tipo) {

        if (tipo == 3) {
            int position = almacen.getAlmacen().size() - 1;
            almacen.getAlmacen().remove(position);
        }

        int position = almacen.getAlmacen().size() - 1;
        almacen.getAlmacen().remove(position);
    }

}
