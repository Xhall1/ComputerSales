
package Perifericos;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoMarca, String marca){
        super(tipoMarca, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString() + '}';
    }
    
}
