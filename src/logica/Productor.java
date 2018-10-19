package logica;

import java.util.concurrent.Semaphore;

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
    public abstract void run();

    public void producir() {
        almacen.setVAlmacen(this.proximoProducir, this.valor);
        almacen.cantUnidades++;
        this.proximoProducir = (this.proximoProducir + 1) % almacen.getTAlmacen();
    }
}
