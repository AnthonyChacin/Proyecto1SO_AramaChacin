/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import interfaz.HomePage;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998
 *            Elías Arama, carné: 20171110178
 */
public class Cronometrador extends Thread {
    
    private float msMedirTiempo;
    private Semaphore sMutex;
    private int contador;
    private float unDiaEnSegs;
    
    
    public Cronometrador(Parametros param, int contador, Semaphore sMutex){
        this.contador = contador;
        this.sMutex = sMutex;
        this.msMedirTiempo = param.getUnDiaEnSegs()*1000 / 16; // 24h / 16 = 1,5h
        this.unDiaEnSegs = param.getUnDiaEnSegs();
    }
    
    @Override
    public void run(){
        try {
            
            while(true){
                if(this.contador > 0){
                    //Esperar a que pase un dia
                    HomePage.textFieldCronometrador.setText("Dormido");
                    Thread.sleep((long) (this.unDiaEnSegs * 1000));

                    //Modificar contador
                    HomePage.textFieldCronometrador.setText("Activo");
                    Thread.sleep((long) this.msMedirTiempo);
                    sMutex.acquire();
                    this.contador--;
                    HomePage.textFieldDias.setText(String.valueOf(this.contador));
                    sMutex.release();

                    HomePage.textFieldCronometrador.setText("Dormido");
                }
                
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Cronometrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
