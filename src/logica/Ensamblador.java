
package logica;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998
 *            Elías Arama, carné: 20171110178
 */
public class Ensamblador extends Thread{
    
    //Todos los almacenes
    private Almacen aBaterias, aPantallas, aCables;
    
    //Semaforos para poderproducir en los tres almacenes
    private Semaphore sPB, sPP, sPC;
    
    //Semaforos para consumir de los tres almacenes
    private Semaphore sCB, sCP, sCC;
    
    //Semaforos para la exclusión mutua de la zona crítica los tres almacenes 
    private Semaphore sMutexB, sMutexP, sMutexC;
    
    //Proximo a consumir de los tres almacenes 
    private int proximoConsumirB, proximoConsumirP, proximoConsumirC;
    
    private int valorB, valorP, valorC;
    
    public Ensamblador(Almacen aBaterias, Almacen aPantallas, Almacen aCables, Semaphore sPB, Semaphore sPP, Semaphore sPC, Semaphore sCB, Semaphore sCP, Semaphore sCC, Semaphore sMutexB, Semaphore sMutexP, Semaphore sMutexC, int proximoConsumirB, int proximoConsumirP, int proximoConsumirC, int valorB, int valorP, int valorC){
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
        this.proximoConsumirB = proximoConsumirB;
        this.proximoConsumirP = proximoConsumirP;
        this.proximoConsumirC = proximoConsumirC;
        this.valorB = valorB;
        this.valorP = valorP;
        this.valorC = valorC;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                sCB.acquire();
                sMutexB.acquire();
                int aux = proximoConsumirB;
                aBaterias.setVectorAlmacen(proximoConsumirB, 0);
                proximoConsumirB = (proximoConsumirB+1)%aBaterias.getTamanioAlmacen();
                sMutexB.release();
                sPB.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorBateria.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                sCP.acquire();
                sMutexP.acquire();
                int aux = proximoConsumirP;
                aPantallas.setVectorAlmacen(proximoConsumirP, 0);
                proximoConsumirP = (proximoConsumirP+1)%aPantallas.getTamanioAlmacen();
                sMutexP.release();
                sPP.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorBateria.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                sCC.acquire(2);
                sMutexC.acquire();
                int aux = proximoConsumirC;
                aCables.setVectorAlmacen(proximoConsumirC, 0);
                proximoConsumirC = (proximoConsumirC+2)%aCables.getTamanioAlmacen();
                sMutexC.release();
                sPC.release(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorBateria.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
