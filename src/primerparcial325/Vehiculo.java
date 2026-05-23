
package primerparcial325;

/**
 *
 * @author ernesto
 */
public abstract  class Vehiculo {
    private String patente;
    private String marca;
    private int capacidadPasajeros;
    private int anioFabricacion;

    public Vehiculo(String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.anioFabricacion = anioFabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    
    public String mostrarVehiculos() {
        return "Patente: " + this.patente + " Marca: " + this.marca + "\n" +
                "Capacidad de Pasajeros: " + this.capacidadPasajeros + " Año de Fabricacion:  " + this.anioFabricacion;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehiculo) {
            Vehiculo unvehiculo = (Vehiculo) obj;
            if(this.patente.equals(unvehiculo.getPatente())) {
                return true;
            }
        }
        return false;
    }
}
