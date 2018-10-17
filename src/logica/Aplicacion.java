
package logica;

import interfaz.HomePage;

/**
 *
 * @author Elias
 */
public class Aplicacion {
    private Parametros param;

    /*
    public static void main(String args[]){
         // Iniciar interfaz
         HomePage homePage = new HomePage();
         homePage.main(args);
         
         // Leer archivo
         Parametros param = new Parametros("parametros_fabrica.txt");
         homePage.inicializarParametros(param);
         homePage.dispose();
         homePage.setVisible(true);
         
         
     }*/
    
    public Aplicacion(){
        main();
    }
    
    public void main(){
        param = new Parametros("parametros_fabrica.txt");
        
        //En las siguientes lineas verificamos que los datos obtenidos del
        //archivo de texto sean los correctos.
        /*System.out.println(" " + param.getUnDiaEnSegs());
        System.out.println(" " + param.getNumDiasEntreDespachos());
        System.out.println(" " + param.getMaxAlmacBaterias());
        System.out.println(" " + param.getMaxAlmacPantallas());
        System.out.println(" " + param.getMaxAlmacCables());
        System.out.println(" " + param.getNumIniProdBat());
        System.out.println(" " + param.getNumMaxProdBat());
        System.out.println(" " + param.getNumIniProdPan());
        System.out.println(" " + param.getNumMaxProdPan());
        System.out.println(" " + param.getNumIniProdCab());
        System.out.println(" " + param.getNumMaxProdCab());
        System.out.println(" " + param.getNumIniEnsamb());
        System.out.println(" " + param.getNumMaxEnsamb());*/
    }

    public Parametros getParam() {
        return param;
    }
    
    
}
