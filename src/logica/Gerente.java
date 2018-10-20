/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import interfaz.HomePage;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998
 *            Elías Arama, carné: 20171110178
 */
public class Gerente extends Thread {
    private float msMinSleep, msMaxSleep;
    private Semaphore sMutex;
    private int contador;
    Random r = new Random();
    private int celulares;
    private final int diasDespacho;
    
    public Gerente(Parametros param, int contador, Semaphore sMutex, int celulares){
        this.contador = contador;
        this.sMutex = sMutex;
        this.msMinSleep = param.getUnDiaEnSegs()*1000 / 4; // 6h = 24h / 4
        this.msMaxSleep = this.msMinSleep * 3;             // 18h = 6h * 3
        this.celulares = celulares;
        this.diasDespacho = param.getNumDiasEntreDespachos();
        
    }
    
    @Override
    public void run(){
        while(true){
            long rSleep = (long) (r.nextInt((int) (this.msMaxSleep - this.msMinSleep + 1)) + this.msMinSleep);
            try {
                HomePage.textFieldGerente.setText("Dormido");
                Thread.sleep(rSleep);
                this.sMutex.acquire();
                HomePage.textFieldGerente.setText("Activo");
                
                // Probando
                System.out.println("Gerente Activo");
                System.out.println(this.contador); 
                System.out.println(this.celulares);
                
                if(this.contador == 0){
                    // Despachar celulares y reiniciar conteo
                    this.celulares = 0;
                    this.contador = this.diasDespacho;
                }
                this.sMutex.release();
                HomePage.textFieldGerente.setText("Dormido");
            } catch (InterruptedException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
}
