
package logica;

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
    
    public Cronometrador(int contador, int diaEnSegundos){
        this.contador = contador;
        this.diaEnSegundos = diaEnSegundos;
        this.horasEscribiendo = ((this.diaEnSegundos*1000)/24)*1.5;
        this.horasDurmiendo = (this.diaEnSegundos*1000) - this.horasEscribiendo;
    }
    
    public void configurarHoras(){
        
    }
    
    @Override
    public void run(){
        
    } 
}
