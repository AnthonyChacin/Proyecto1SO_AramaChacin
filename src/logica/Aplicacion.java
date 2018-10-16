/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    }

    public Parametros getParam() {
        return param;
    }
    
    
}
