
package primerparcial325;

import java.util.ArrayList;
import java.util.Collections;

public class Agencia {
    private ArrayList <Vehiculo> vehiculo = new ArrayList<>();
    
    public void mostrarVehiculos() {
        for(Vehiculo vehiculo : vehiculo) {
            System.out.println("Marca del vehiculo" + vehiculo.getMarca());
            System.out.println("Año de Fabricacion: " + vehiculo.getAnioFabricacion());
            System.out.println("Capacidad de carga: " + vehiculo.getCapacidadPasajeros());
            System.out.println("Patente: " + vehiculo.getPatente());     
        }       
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        if (vehiculo.getPatente().contains(vehiculo.getPatente())) {
            System.out.println("Ya existe un vehiculo con esa Patente.");
        } else {
            
        }
        
        
        
    }
}
