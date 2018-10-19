
package logica;

import java.util.ArrayList;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998
 *            Elías Arama, carné: 20171110178
 */
public class Almacen {
    
    ArrayList<Integer> almacen;
    
    public Almacen(){
        almacen = new ArrayList<>();
    }

    public ArrayList<Integer> getAlmacen() {
        return almacen;
    }

    public void setAlmacen(ArrayList<Integer> almacen) {
        this.almacen = almacen;
    }
    
}
