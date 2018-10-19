package logica;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaz.HomePage;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998 Elías Arama, carné: 20171110178
 */
public class ProductorCableConexion extends Productor {

    public ProductorCableConexion(Almacen almacen, Semaphore sP, Semaphore sC, Semaphore sMutex, int proximoProducir, int valor, Parametros param, int tp) {
        super(almacen, sP, sC, sMutex, proximoProducir, valor, param, tp);
    }

    @Override
    public void run() {
        while (true) {
            try {
                //Determinar de acuerdo al tipo de productor cuanto tiempo va a tradar por cada cosa que produzca
                sP.acquire();
                Thread.sleep(param.getUnDiaEnSegs()*1000);
                sMutex.acquire();
                this.producir();
                HomePage.textFieldAlmacenCables.setText("");
                HomePage.textFieldAlmacenCables.setText(String.valueOf(this.almacen.getCantUnidades()));
                sMutex.release();
                sC.release(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorCableConexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
