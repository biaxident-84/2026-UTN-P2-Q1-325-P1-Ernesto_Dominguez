
package primerparcial325;


public class ColectivoTuristico extends Vehiculo{
    private int cantidadPisos;

    public ColectivoTuristico(int cantidadPisos, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.cantidadPisos = cantidadPisos;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }
    
    
    
    
}
