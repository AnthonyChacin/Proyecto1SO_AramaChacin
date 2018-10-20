
package logica;

import interfaz.HomePage;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Elias
 */
public class Aplicacion {
    private Parametros param;
    private Almacen aBaterias, aPantallas, aCables;
    private ProductorBateria[] productoresBaterias;
    private ProductorPantalla[] productoresPantallas;
    private ProductorCableConexion[] productoresCables;
    private Cronometrador cronometrador;
    private Gerente gerente;
    private Ensamblador[] ensambladores;
    private Semaphore sProductorBateria, sMutexBateria;
    private Semaphore sProductorPantalla, sMutexPantalla;
    private Semaphore sProductorCable, sMutexCable;
    private Semaphore sConsumidorBateria, sConsumidorPantalla, sConsumidorCable;
    private Semaphore sContador;
    private int proximoProducirB, proximoProducirP, proximoProducirC;
    private int proximoConsumirB, proximoConsumirP, proximoConsumirC;
    private static int celularesEnsamblados;
    private int cantProductoresB, cantProductoresP, cantProductoresC, cantEnsambladores; 
    
    public Aplicacion(){
        main();
    }
    
    public void main(){
        param = new Parametros("parametros_fabrica.txt");
        this.aBaterias = new Almacen(param.getMaxAlmacBaterias());
        this.aPantallas = new Almacen(param.getMaxAlmacPantallas());
        this.aCables = new Almacen(param.getMaxAlmacCables());
        this.productoresBaterias = new ProductorBateria[param.getNumMaxProdBat()];
        this.productoresPantallas = new ProductorPantalla[param.getNumMaxProdPan()];
        this.productoresCables = new ProductorCableConexion[param.getNumMaxProdCab()];
        this.ensambladores = new Ensamblador[param.getNumMaxEnsamb()];
        this.sProductorBateria = new Semaphore(param.getMaxAlmacBaterias());
        this.sConsumidorBateria = new Semaphore(0);
        this.sMutexBateria = new Semaphore(1);
        this.sProductorPantalla = new Semaphore(param.getMaxAlmacPantallas());
        this.sConsumidorPantalla = new Semaphore(0);
        this.sMutexPantalla = new Semaphore(1);
        this.sProductorCable = new Semaphore(param.getMaxAlmacCables());
        this.sConsumidorCable = new Semaphore(0);
        this.sMutexCable = new Semaphore(1);
        this.sContador = new Semaphore(1);
        this.proximoProducirB = 0;
        this.proximoProducirP = 0;
        this.proximoProducirC = 0;
        this.proximoConsumirB = 0;
        this.proximoConsumirP = 0;
        this.proximoConsumirC = 0;
        this.cantProductoresB = 0;
        this.cantProductoresP = 0;
        this.cantProductoresC = 0;
        this.cantEnsambladores = 0;
        celularesEnsamblados = 0;
        
        this.cronometrador = new Cronometrador(sContador, this.param);
        this.cronometrador.start();
        
        this.gerente = new Gerente(sContador, this.param, this.cronometrador);
        this.gerente.start();
        
        this.inicializarEnsamblador();
        this.inicializarProductores();
    }

    public Parametros getParam() {
        return param;
    }

    public Cronometrador getCronometrador() {
        return cronometrador;
    }

    public Gerente getGerente() {
        return gerente;
    }
    
    public void inicializarProductores(){
        
        //Inicializar productores de baterias
        for(int i = 0; i < this.param.getNumIniProdBat(); i++){
            this.contratarProductorBateria();
        }
        
        //Inicializar productores de pantallas
        for(int i = 0; i < this.param.getNumIniProdPan(); i++){
            this.contratarProductorPantalla();
        }
        
        //Inicializar productores de cables de conexión
        for(int i = 0; i < this.param.getNumIniProdCab(); i++){
            this.contratarProductorCableConexion();
        }  
    }
    
    public void inicializarEnsamblador(){
        
        for(int i = 0; i < this.param.getNumIniEnsamb(); i++){
            this.contratarEnsamblador();
        }
    }
    
    public void contratarProductorBateria(){
        int cont=0;
        for(int i = 0; i < this.productoresBaterias.length; i++){
            if(this.productoresBaterias[i] == null){
                this.productoresBaterias[i] = new ProductorBateria(this.aBaterias,this.sProductorBateria,this.sConsumidorBateria,this.sMutexBateria, this.proximoProducirB,1, param, 1);;
                this.productoresBaterias[i].start();
                this.cantProductoresB++;
                break;
            }
            cont++;
        }
        if(cont == this.productoresBaterias.length){
            System.out.println("Ha alcanzado el límite de productores de baterias ("+ this.param.getNumMaxProdBat()+")");
        }else{
            System.out.println("Productor de baterias contratado con éxito");
        }
    }
    
    public void despedirProductorBateria(){
        int i = this.cantProductoresB;
        if(i > 0){
            this.productoresBaterias[i-1].setContratado(false);
            this.productoresBaterias[i-1] = null;
            this.cantProductoresB--;
            System.out.println("Productor de baterias despedido con éxito");
        }else{
            System.out.println("Ya ha despedido a todos los productores de batería");
        }
    }
    
    public void contratarProductorPantalla(){
        int cont=0;
        for(int i = 0; i < this.productoresPantallas.length; i++){
            if(this.productoresPantallas[i] == null){
                this.productoresPantallas[i] = new ProductorPantalla(this.aPantallas,this.sProductorPantalla,this.sConsumidorPantalla,this.sMutexPantalla, this.proximoProducirP,1, param, 2);
                this.productoresPantallas[i].start();
                this.cantProductoresP++;
                break;
            }
            cont++;
        }
        if(cont == this.productoresPantallas.length){
            System.out.println("Ha alcanzado el límite de productores de pantallas ("+ this.param.getNumMaxProdPan()+")");
        }else{
            System.out.println("Productor de pantallas contratado con éxito");
        }
    }
    
    public void despedirProductorPantalla(){
        int i = this.cantProductoresP;
        if(i > 0){
            this.productoresPantallas[i-1].setContratado(false);
            this.productoresPantallas[i-1] = null;
            this.cantProductoresP--;
            System.out.println("Productor de pantallas despedido con éxito");
        }else{
            System.out.println("Ya ha despedido a todos los productores de pantallas");
        }
    }
 
    public void contratarProductorCableConexion(){
        int cont=0;
        for(int i = 0; i < this.productoresCables.length; i++){
            if(this.productoresCables[i] == null){
                this.productoresCables[i] = new ProductorCableConexion(this.aCables,this.sProductorCable,this.sConsumidorCable,this.sMutexCable, this.proximoProducirC,1, param, 3);
                this.productoresCables[i].start();
                this.cantProductoresC++;
                break;
            }
            cont++;
        }
        if(cont == this.productoresCables.length){
            System.out.println("Ha alcanzado el límite de productores de cables de conexión ("+ this.param.getNumMaxProdCab()+")");
        }else{
            System.out.println("Productor de cables de conexión contratado con éxito");
        }
    }
     
    public void despedirProductorCableConexion(){
        int i = this.cantProductoresC;
        if(i > 0){
            this.productoresCables[i-1].setContratado(false);
            this.productoresCables[i-1] = null;
            this.cantProductoresC--;
            System.out.println("Productor de cables de conexión despedido con éxito");
        }else{
            System.out.println("Ya ha despedido a todos los productores de cables de conexión");
        }
    }
    
    public void contratarEnsamblador(){
        int cont=0;
        for(int i = 0; i < this.ensambladores.length; i++){
            if(this.ensambladores[i] == null){
                this.ensambladores[i] = new Ensamblador(aBaterias,aPantallas,aCables,this.sProductorBateria,this.sProductorPantalla,this.sProductorCable,this.sConsumidorBateria,this.sConsumidorPantalla,this.sConsumidorCable,this.sMutexBateria,this.sMutexPantalla,this.sMutexCable, this.param, this.proximoConsumirB, this.proximoConsumirP, this.proximoConsumirC);
                this.ensambladores[i].start();
                this.cantEnsambladores++;
                break;
            }
            cont++;
        }
        if(cont == this.ensambladores.length){
            System.out.println("Ha alcanzado el límite de ensambladores ("+ this.param.getNumMaxEnsamb()+")");
        }else{
            System.out.println("Ensamblador contratado con éxito");
        }
    }
    
    public void despedirEnsamblador(){
        int i = this.cantEnsambladores;
        if(i > 0){
            this.ensambladores[i-1].setContratado(false);
            this.ensambladores[i-1] = null;
            this.cantEnsambladores--;
            System.out.println("Ensamblador despedido con éxito");
        }else{
            System.out.println("Ya ha despedido a todos los ensambladores");
        }
    }

    public int getCantProductoresB() {
        return cantProductoresB;
    }

    public int getCantProductoresP() {
        return cantProductoresP;
    }

    public int getCantProductoresC() {
        return cantProductoresC;
    }

    public int getCantEnsambladores() {
        return cantEnsambladores;
    }

    public Almacen getaBaterias() {
        return aBaterias;
    }

    public void setaBaterias(Almacen aBaterias) {
        this.aBaterias = aBaterias;
    }

    public Almacen getaPantallas() {
        return aPantallas;
    }

    public void setaPantallas(Almacen aPantallas) {
        this.aPantallas = aPantallas;
    }

    public Almacen getaCables() {
        return aCables;
    }

    public void setaCables(Almacen aCables) {
        this.aCables = aCables;
    }

    public ProductorBateria[] getProductoresBaterias() {
        return productoresBaterias;
    }

    public void setProductoresBaterias(ProductorBateria[] productoresBaterias) {
        this.productoresBaterias = productoresBaterias;
    }

    public ProductorPantalla[] getProductoresPantallas() {
        return productoresPantallas;
    }

    public void setProductoresPantallas(ProductorPantalla[] productoresPantallas) {
        this.productoresPantallas = productoresPantallas;
    }

    public ProductorCableConexion[] getProductoresCables() {
        return productoresCables;
    }

    public void setProductoresCables(ProductorCableConexion[] productoresCables) {
        this.productoresCables = productoresCables;
    }

    public Ensamblador[] getEnsambladores() {
        return ensambladores;
    }

    public void setEnsambladores(Ensamblador[] ensambladores) {
        this.ensambladores = ensambladores;
    }

    public Semaphore getsProductorBateria() {
        return sProductorBateria;
    }

    public void setsProductorBateria(Semaphore sProductorBateria) {
        this.sProductorBateria = sProductorBateria;
    }

    public Semaphore getsMutexBateria() {
        return sMutexBateria;
    }

    public void setsMutexBateria(Semaphore sMutexBateria) {
        this.sMutexBateria = sMutexBateria;
    }

    public Semaphore getsProductorPantalla() {
        return sProductorPantalla;
    }

    public void setsProductorPantalla(Semaphore sProductorPantalla) {
        this.sProductorPantalla = sProductorPantalla;
    }

    public Semaphore getsMutexPantalla() {
        return sMutexPantalla;
    }

    public void setsMutexPantalla(Semaphore sMutexPantalla) {
        this.sMutexPantalla = sMutexPantalla;
    }

    public Semaphore getsProductorCable() {
        return sProductorCable;
    }

    public void setsProductorCable(Semaphore sProductorCable) {
        this.sProductorCable = sProductorCable;
    }

    public Semaphore getsMutexCable() {
        return sMutexCable;
    }

    public void setsMutexCable(Semaphore sMutexCable) {
        this.sMutexCable = sMutexCable;
    }

    public Semaphore getsConsumidorBateria() {
        return sConsumidorBateria;
    }

    public void setsConsumidorBateria(Semaphore sConsumidorBateria) {
        this.sConsumidorBateria = sConsumidorBateria;
    }

    public Semaphore getsConsumidorPantalla() {
        return sConsumidorPantalla;
    }

    public void setsConsumidorPantalla(Semaphore sConsumidorPantalla) {
        this.sConsumidorPantalla = sConsumidorPantalla;
    }

    public Semaphore getsConsumidorCable() {
        return sConsumidorCable;
    }

    public void setsConsumidorCable(Semaphore sConsumidorCable) {
        this.sConsumidorCable = sConsumidorCable;
    }

    public int getProximoProducirB() {
        return proximoProducirB;
    }

    public void setProximoProducirB(int proximoProducirB) {
        this.proximoProducirB = proximoProducirB;
    }

    public int getProximoProducirP() {
        return proximoProducirP;
    }

    public void setProximoProducirP(int proximoProducirP) {
        this.proximoProducirP = proximoProducirP;
    }

    public int getProximoProducirC() {
        return proximoProducirC;
    }

    public void setProximoProducirC(int proximoProducirC) {
        this.proximoProducirC = proximoProducirC;
    }

    public int getProximoConsumirB() {
        return proximoConsumirB;
    }

    public void setProximoConsumirB(int proximoConsumirB) {
        this.proximoConsumirB = proximoConsumirB;
    }

    public int getProximoConsumirP() {
        return proximoConsumirP;
    }

    public void setProximoConsumirP(int proximoConsumirP) {
        this.proximoConsumirP = proximoConsumirP;
    }

    public int getProximoConsumirC() {
        return proximoConsumirC;
    }

    public void setProximoConsumirC(int proximoConsumirC) {
        this.proximoConsumirC = proximoConsumirC;
    }

    public static int getCelularesEnsamblados() {
        return celularesEnsamblados;
    }

    public static void setCelularesEnsamblados(int celularesEnsamblados) {
        Aplicacion.celularesEnsamblados = celularesEnsamblados;
    }
    
}
