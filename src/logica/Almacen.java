
package logica;

import java.util.ArrayList;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998
 *            Elías Arama, carné: 20171110178
 */
public class Almacen {
    
    private int tAlmacen;
    private int[] vAlmacen;
    int cantUnidades;
    
    public Almacen(int tAlmacen){
        this.tAlmacen = tAlmacen;
        this.vAlmacen = new int[this.tAlmacen];
        this.cantUnidades = 0;
    } 

    public int gettAlmacen() {
        return tAlmacen;
    }

    public void settAlmacen(int tAlmacen) {
        this.tAlmacen = tAlmacen;
    }

    public int[] getvAlmacen() {
        return vAlmacen;
    }

    public void setvAlmacen(int[] vAlmacen) {
        this.vAlmacen = vAlmacen;
    }

    public int getCantUnidades() {
        return cantUnidades;
    }

    public void setCantUnidades(int cantUnidades) {
        this.cantUnidades = cantUnidades;
    }
    
    public void imprimirAlmacen(){
        for(int i=0; i<vAlmacen.length; i++){
            System.out.print(vAlmacen[i] + " ");
        }
        System.out.println("");
    }
    
    public int unidadesAlmacen(){
        int cont = 0;
        for(int i=0; i<vAlmacen.length; i++){
            if(vAlmacen[i] == 1){
                cont++;
            }
        }
        return cont;
    }
    
    
    public int getTAlmacen() {
        return this.tAlmacen;
    }

    public int getVec(int i) {
        return this.vAlmacen[i];
    }

    public void setVAlmacen(int i, int val) {
        this.vAlmacen[i] = val;
    }
}
