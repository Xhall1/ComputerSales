
package Perifericos;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamano){
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    public int getIdMonitor(){
        return this.idMonitor;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public static void setContadorMonitores(int contadorMonitores) {
        Monitor.contadorMonitores = contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamano + '}';
    }
    
}
