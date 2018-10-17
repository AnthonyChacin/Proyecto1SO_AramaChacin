
package logica;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998
 *            Elías Arama, carné: 20171110178
 */
public class Almacen {
    
    int[] vectorAlmacen;
    int tamanioAlmacen;
    
    public Almacen(int tamanioAlmacen){
        this.tamanioAlmacen = tamanioAlmacen;
        vectorAlmacen = new int[tamanioAlmacen];
    }

    public int[] getVectorAlmacen() {
        return vectorAlmacen;
    }

    public void setVectorAlmacen(int[] vectorAlmacen) {
        this.vectorAlmacen = vectorAlmacen;
    }

    public int getTamanioAlmacen() {
        return tamanioAlmacen;
    }

    public void setTamanioAlmacen(int tamanioAlmacen) {
        this.tamanioAlmacen = tamanioAlmacen;
    }
}
