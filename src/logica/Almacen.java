
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

    public int getVectorAlmacen(int i) {
        return vectorAlmacen[i];
    }

    public void setVectorAlmacen(int i, int valor) {
        this.vectorAlmacen[i] = valor;
    }

    public int getTamanioAlmacen() {
        return tamanioAlmacen;
    }
    public void imprimir(){
        for(int i=0; i<tamanioAlmacen; i++){
            System.out.print(vectorAlmacen[i]+" ");
        }
        System.out.println("");
    }
}
