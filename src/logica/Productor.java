package logica;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998 Elías Arama, carné: 20171110178
 */
public abstract class Productor extends Thread {

    protected Parametros param;
    protected Almacen almacen;
    protected Semaphore sP;
    protected Semaphore sC;
    protected Semaphore sMutex;
    protected int proximoProducir;
    protected int valor;
    protected int tp;

    public Productor(Almacen almacen, Semaphore sP, Semaphore sC, Semaphore sMutex, int proximoProducir, int valor, Parametros param, int tp) {
        this.almacen = almacen;
        this.sP = sP;
        this.sC = sC;
        this.sMutex = sMutex;
        this.proximoProducir = proximoProducir;
        this.valor = valor;
        this.param = param;
        this.tp = tp;
    }

    @Override
    public void run() {
        while (true) {
            try {
                //Determinar de acuerdo al tipo de productor cuanto tiempo va a tradar por cada cosa que produzca
                sP.acquire();
                sMutex.acquire();
                almacen.setVectorAlmacen(proximoProducir, valor);
                proximoProducir = (proximoProducir + 1) % almacen.getTamanioAlmacen();
                Thread.sleep(param.getUnDiaEnSegs()*1000);
                sMutex.release();
                sC.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorBateria.class.getName()).log(Level.SEVERE, null, ex);
            }
            almacen.imprimir();

        }
    }

}
