
package logica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elias
 */
public class Parametros {
    private int unDiaEnSegs,
                numDiasEntreDespachos,
                maxAlmacBaterias,
                maxAlmacPantallas,
                maxAlmacCables,
                numIniProdBat,
                numMaxProdBat,
                numIniProdPan,
                numMaxProdPan,
                numIniProdCab,
                numMaxProdCab,
                numIniEnsamb,
                numMaxEnsamb;
    
    public Parametros(String archivo){
        try{
            FileReader fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            
            String line;
            //Leemos hasta llegar a la 5ta línea, que es donde se encuentran los parametros.
            line=br.readLine();
            line=br.readLine();
            line=br.readLine();
            line=br.readLine();
            line=br.readLine();
            
            //Comienza a guardar en el vector sólo en la 5ta línea.
            String str[] = line.split("\t\t");
            
            this.unDiaEnSegs = Integer.parseInt(str[0]);
            this.numDiasEntreDespachos = Integer.parseInt(str[1]);
            this.maxAlmacBaterias = Integer.parseInt(str[2]);
            this.maxAlmacPantallas = Integer.parseInt(str[3]);
            this.maxAlmacCables = Integer.parseInt(str[4]);
            this.numIniProdBat = Integer.parseInt(str[5]);
            this.numMaxProdBat = Integer.parseInt(str[6]);
            this.numIniProdPan = Integer.parseInt(str[7]);
            this.numMaxProdPan = Integer.parseInt(str[8]);
            this.numIniProdCab = Integer.parseInt(str[9]);
            this.numMaxProdCab = Integer.parseInt(str[10]);
            this.numIniEnsamb = Integer.parseInt(str[11]);
            this.numMaxEnsamb = Integer.parseInt(str[12]);
            
            
        }catch(IOException e){
            System.out.println("Archivo no encontrado");
        }
    }

    public int getUnDiaEnSegs() {
        return unDiaEnSegs;
    }

    public void setUnDiaEnSegs(int unDiaEnSegs) {
        this.unDiaEnSegs = unDiaEnSegs;
    }

    public int getNumDiasEntreDespachos() {
        return numDiasEntreDespachos;
    }

    public void setNumDiasEntreDespachos(int numDiasEntreDespachos) {
        this.numDiasEntreDespachos = numDiasEntreDespachos;
    }

    public int getMaxAlmacBaterias() {
        return maxAlmacBaterias;
    }

    public void setMaxAlmacBaterias(int maxAlmacBaterias) {
        this.maxAlmacBaterias = maxAlmacBaterias;
    }

    public int getMaxAlmacPantallas() {
        return maxAlmacPantallas;
    }

    public void setMaxAlmacPantallas(int maxAlmacPantallas) {
        this.maxAlmacPantallas = maxAlmacPantallas;
    }

    public int getMaxAlmacCables() {
        return maxAlmacCables;
    }

    public void setMaxAlmacCables(int maxAlmacCables) {
        this.maxAlmacCables = maxAlmacCables;
    }

    public int getNumIniProdBat() {
        return numIniProdBat;
    }

    public void setNumIniProdBat(int numIniProdBat) {
        this.numIniProdBat = numIniProdBat;
    }

    public int getNumMaxProdBat() {
        return numMaxProdBat;
    }

    public void setNumMaxProdBat(int numMaxProdBat) {
        this.numMaxProdBat = numMaxProdBat;
    }

    public int getNumIniProdPan() {
        return numIniProdPan;
    }

    public void setNumIniProdPan(int numIniProdPan) {
        this.numIniProdPan = numIniProdPan;
    }

    public int getNumMaxProdPan() {
        return numMaxProdPan;
    }

    public void setNumMaxProdPan(int numMaxProdPan) {
        this.numMaxProdPan = numMaxProdPan;
    }

    public int getNumIniProdCab() {
        return numIniProdCab;
    }

    public void setNumIniProdCab(int numIniProdCab) {
        this.numIniProdCab = numIniProdCab;
    }

    public int getNumMaxProdCab() {
        return numMaxProdCab;
    }

    public void setNumMaxProdCab(int numMaxProdCab) {
        this.numMaxProdCab = numMaxProdCab;
    }

    public int getNumIniEnsamb() {
        return numIniEnsamb;
    }

    public void setNumIniEnsamb(int numIniEnsamb) {
        this.numIniEnsamb = numIniEnsamb;
    }

    public int getNumMaxEnsamb() {
        return numMaxEnsamb;
    }

    public void setNumMaxEnsamb(int numMaxEnsamb) {
        this.numMaxEnsamb = numMaxEnsamb;
    }
    
    

}
