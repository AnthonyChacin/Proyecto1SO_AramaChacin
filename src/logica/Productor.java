package logica;
import java.util.concurrent.Semaphore;
/**
 *
 * @autores: Anthony Chacin, carné: 20171110998
 *            Elías Arama, carné: 20171110178
 */
public abstract class Productor extends Thread {
    
    Almacen almacen;
    protected Semaphore sProductor;
    protected Semaphore sMutex;
    
    
       
}
