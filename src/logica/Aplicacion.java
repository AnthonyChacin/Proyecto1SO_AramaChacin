
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
    private Ensamblador[] ensambladores;
    private Semaphore sProductorBateria, sMutexBateria;
    private Semaphore sProductorPantalla, sMutexPantalla;
    private Semaphore sProductorCable, sMutexCable;
    private Semaphore sConsumidorBateria, sConsumidorPantalla, sConsumidorCable;
    private int proximoProducirB, proximoProducirP, proximoProducirC;
    private int proximoConsumirB, proximoConsumirP, proximoConsumirC;
    
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
        this.proximoProducirB = 0;
        this.proximoProducirP = 0;
        this.proximoProducirC = 0;
        this.proximoConsumirB = 0;
        this.proximoConsumirP = 0;
        this.proximoConsumirC = 0;
        
        this.inicializarEnsamblador(param);
        this.inicializarProductores(param);
    }

    public Parametros getParam() {
        return param;
    }
    
    public void inicializarProductores(Parametros param){
        
        //Inicializar productores de baterias
        for(int i = 0; i < param.getNumIniProdBat(); i++){
            this.productoresBaterias[i] = new ProductorBateria(this.aBaterias,this.sProductorBateria,this.sConsumidorBateria,this.sMutexBateria, this.proximoProducirB,1, param, 1);
        }
        this.productoresBaterias[0].start();
        this.productoresBaterias[1].start();
        
        //Inicializar productores de pantallas
        for(int i = 0; i < param.getNumIniProdPan(); i++){
            this.productoresPantallas[i] = new ProductorPantalla(this.aPantallas,this.sProductorPantalla,this.sConsumidorPantalla,this.sMutexPantalla, this.proximoProducirP,1, param, 2);
        }
        this.productoresPantallas[0].start();
        this.productoresPantallas[1].start();
        this.productoresPantallas[2].start();
        
        //Inicializar productores de cables de conexión
        for(int i = 0; i < param.getNumMaxProdCab(); i++){
            this.productoresCables[i] = new ProductorCableConexion(this.aCables,this.sProductorCable,this.sConsumidorCable,this.sMutexCable, this.proximoProducirC,1, param, 3);
        }
        this.productoresCables[0].start();   
    }
    
    public void inicializarEnsamblador(Parametros param){
        
        for(int i = 0; i < param.getNumIniEnsamb(); i++){
            this.ensambladores[i] = new Ensamblador(aBaterias,aPantallas,aCables,this.sProductorBateria,this.sProductorPantalla,this.sProductorCable,this.sConsumidorBateria,this.sConsumidorPantalla,this.sConsumidorCable,this.sMutexBateria,this.sMutexPantalla,this.sMutexCable, this.param, this.proximoConsumirB, this.proximoConsumirP, this.proximoConsumirC);
        }
        this.ensambladores[0].start();
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
    
    
    
}
