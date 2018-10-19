package logica;

import interfaz.HomePage;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998 Elías Arama, carné: 20171110178
 */
public class ProductorPantalla extends Productor {

    public ProductorPantalla(Almacen almacen, Semaphore sP, Semaphore sC, Semaphore sMutex, int proximoProducir, int valor, Parametros param, int tp) {
        super(almacen, sP, sC, sMutex, proximoProducir, valor, param, tp);
    }

    @Override
    public void run() {
        while (true) {
            try {
                //Determinar de acuerdo al tipo de productor cuanto tiempo va a tradar por cada cosa que produzca
                sP.acquire();
                Thread.sleep(param.getUnDiaEnSegs()*1000*2);
                sMutex.acquire();
                HomePage.textFieldAlmacenPantallas.setText("");
                HomePage.textFieldAlmacenPantallas.setText(String.valueOf(this.almacen.getCantUnidades()));
                this.producir();
                //Thread.sleep(param.getUnDiaEnSegs() * 1000 * 2);
                sMutex.release();
                sC.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorPantalla.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
