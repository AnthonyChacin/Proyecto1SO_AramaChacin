
package logica;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @autores: Anthony Chacin, carné: 20171110998
 *            Elías Arama, carné: 20171110178
 */
public class Cronometrador extends Thread {
    
    private int contador;
    private double horasEscribiendo;
    private double horasDurmiendo;
    private int diaEnSegundos;
    private Semaphore sContador;
    private String estatus;
    private Parametros param;
    
    public Cronometrador(Semaphore sContador, Parametros param){
        this.sContador = sContador;
        this.contador = param.getNumDiasEntreDespachos();
        this.diaEnSegundos = param.getUnDiaEnSegs();
        this.horasEscribiendo = ((this.diaEnSegundos*1000)/24)*1.5;
        this.horasDurmiendo = (this.diaEnSegundos*1000) - this.horasEscribiendo;
        this.estatus = "Durmiendo";
        this.param = param;
    }
    
    @Override
    public void run(){
        
        int horasE = (int)this.horasEscribiendo;
        int horasD = (int)this.horasDurmiendo;
        String estatus1 = "Modificando contador";
        String estatus2 = "Durmiendo";
        
        while(true){
            try {
                Thread.sleep(horasD);
                this.sContador.acquire();
                this.estatus = estatus1;
                Thread.sleep(horasE);
                this.contador--;
                
                if(this.contador < 0){
                    this.contador = this.param.getNumDiasEntreDespachos();
                }
                sContador.release();
                this.estatus = estatus2;
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    } 

    public String getEstatus() {
        return this.estatus;
    }

    public int getContador() {
        return contador;
    }
}
