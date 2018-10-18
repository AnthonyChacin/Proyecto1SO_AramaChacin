package logica;
import java.util.concurrent.Semaphore;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998 Elías Arama, carné: 20171110178
 */
public class ProductorCableConexion extends Productor {

    public ProductorCableConexion(Almacen almacen, Semaphore sP, Semaphore sC, Semaphore sMutex, int proximoProducir, int valor, Parametros param, int tp) {
        super(almacen, sP, sC, sMutex, proximoProducir, valor, param,tp);
    }
}
