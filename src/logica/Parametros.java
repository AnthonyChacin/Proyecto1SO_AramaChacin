
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
    
    private final int DEFAULT_UN_DIA_EN_SEGS = 10,
                      DEFAULT_NUM_DIAS_ENTRE_DESPACHOS = 10,
                      DEFAULT_MAX_ALMAC_BATERIAS = 25,
                      DEFAULT_MAX_ALMAC_PANTALLAS = 30,
                      DEFAULT_MAX_ALMAC_CABLES = 35,
                      DEFAULT_NUM_INI_PROD_BAT = 2,
                      DEFAULT_NUM_MAX_PROD_BAT = 4,
                      DEFAULT_NUM_INI_PROD_PAN = 3,
                      DEFAULT_NUM_MAX_PROD_PAN = 8,
                      DEFAULT_NUM_INI_PROD_CAB = 1,
                      DEFAULT_NUM_MAX_PROD_CAB = 3,
                      DEFAULT_NUM_INI_ENSAMB = 1,
                      DEFAULT_NUM_MAX_ENSAMB = 5;
                      
    
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
            //Los datos están separados por 2 \t
            String str[] = line.split("\t\t");
            
            // Validacion
            if(esIntPositivo(str[0])){
                this.unDiaEnSegs = Integer.parseInt(str[0]);
            } else {
                this.unDiaEnSegs = DEFAULT_UN_DIA_EN_SEGS;
            }
            
            if(esIntPositivo(str[1])){
                this.numDiasEntreDespachos = Integer.parseInt(str[1]);
            } else {
                this.numDiasEntreDespachos = DEFAULT_NUM_DIAS_ENTRE_DESPACHOS;
            }
            
            if(esIntPositivo(str[2])){
                this.maxAlmacBaterias = Integer.parseInt(str[2]);
            } else {
                this.maxAlmacBaterias = DEFAULT_MAX_ALMAC_BATERIAS;
            }
            
            if(esIntPositivo(str[3])){
                this.maxAlmacPantallas = Integer.parseInt(str[3]);
            } else {
                this.maxAlmacPantallas = DEFAULT_MAX_ALMAC_PANTALLAS;
            }
            
            if(esIntPositivo(str[4])){
                this.maxAlmacCables = Integer.parseInt(str[4]);
            } else {
                this.maxAlmacCables = DEFAULT_MAX_ALMAC_CABLES;
            }
            
            if(esIntNoNegativo(str[5])){
                this.numIniProdBat = Integer.parseInt(str[5]);
            } else {
                this.numIniProdBat = DEFAULT_NUM_INI_PROD_BAT;
            }
            
            if(esIntPositivo(str[6])){
                // Validar que el inicial no sea mayor que el máximo
                if(this.numIniProdBat <= Integer.parseInt(str[6])){
                    this.numMaxProdBat = Integer.parseInt(str[6]);
                } else {
                    this.numMaxProdBat = this.numIniProdBat;
                }
            } else {
                // Intentar asignar el default (comprobar que no sea menor que el mínimo)
                if(this.numIniProdBat <= DEFAULT_NUM_MAX_PROD_BAT){
                    this.numMaxProdBat = DEFAULT_NUM_MAX_PROD_BAT;
                } else {
                    this.numMaxProdBat = this.numIniProdBat;
                }
            }
            
            if(esIntNoNegativo(str[7])){
                this.numIniProdPan = Integer.parseInt(str[7]);
            } else {
                this.numIniProdPan = DEFAULT_NUM_INI_PROD_PAN;
            }
            
            if(esIntPositivo(str[8])){
                // Validar que el inicial no sea mayor que el máximo
                if(this.numIniProdPan <= Integer.parseInt(str[8])){
                    this.numMaxProdPan = Integer.parseInt(str[8]);
                } else {
                    this.numMaxProdPan = this.numIniProdPan;
                }
            } else {
                // Intentar asignar el default (comprobar que no sea menor que el mínimo)
                if(this.numIniProdPan <= DEFAULT_NUM_MAX_PROD_PAN){
                    this.numMaxProdPan = DEFAULT_NUM_MAX_PROD_PAN;
                } else {
                    this.numMaxProdPan = this.numIniProdPan;
                }
            }
            
            if(esIntNoNegativo(str[9])){
                this.numIniProdCab = Integer.parseInt(str[9]);
            } else {
                this.numIniProdCab = DEFAULT_NUM_INI_PROD_CAB;
            }
            
            if(esIntPositivo(str[8])){
                // Validar que el inicial no sea mayor que el máximo
                if(this.numIniProdCab <= Integer.parseInt(str[10])){
                    this.numMaxProdCab = Integer.parseInt(str[10]);
                } else {
                    this.numMaxProdCab = this.numIniProdCab;
                }
            } else {
                // Intentar asignar el default (comprobar que no sea menor que el mínimo)
                if(this.numIniProdCab <= DEFAULT_NUM_MAX_PROD_CAB){
                    this.numMaxProdCab = DEFAULT_NUM_MAX_PROD_CAB;
                } else {
                    this.numMaxProdCab = this.numIniProdCab;
                }
            }
            
            if(esIntNoNegativo(str[11])){
                this.numIniEnsamb = Integer.parseInt(str[11]);
            } else {
                this.numIniEnsamb = DEFAULT_NUM_INI_ENSAMB;
            }
            
            if(esIntPositivo(str[12])){
                // Validar que el inicial no sea mayor que el máximo
                if(this.numIniEnsamb <= Integer.parseInt(str[12])){
                    this.numMaxEnsamb = Integer.parseInt(str[12]);
                } else {
                    this.numMaxEnsamb = this.numIniEnsamb;
                }
            } else {
                // Intentar asignar el default (comprobar que no sea menor que el mínimo)
                if(this.numIniEnsamb <= DEFAULT_NUM_MAX_ENSAMB){
                    this.numMaxEnsamb = DEFAULT_NUM_MAX_ENSAMB;
                } else {
                    this.numMaxEnsamb = this.numIniEnsamb;
                }
            }
            
        }catch(IOException e){
            System.out.println("Archivo no encontrado");
        }
    }
    
    public boolean esIntNoNegativo(String valor){
        try{
            int x = Integer.parseInt(valor);
            if (x<0) {
                return false;
            } else {
                return true;
            }
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    public boolean esIntPositivo(String valor){
        if(esIntNoNegativo(valor)){
            if(Integer.parseInt(valor) > 0){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
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
