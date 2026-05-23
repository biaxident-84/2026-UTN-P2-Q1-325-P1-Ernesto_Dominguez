
package primerparcial325;


public class LanchaTuristica extends Vehiculo{
    private TipoMotor tipoMotor;
    public enum TipoMotor {
        NAFTA, DIESEL, ELECTRICO
    }

    public LanchaTuristica(TipoMotor tipoMotor, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.tipoMotor = tipoMotor;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }
    
    
    
    
}
