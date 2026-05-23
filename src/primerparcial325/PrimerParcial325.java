
package primerparcial325;

import java.util.Scanner;

public class PrimerParcial325 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agencia agencia = new Agencia();
        int opcion;
        
        do {
            mostrarMenu();
            System.out.println("Seleccione una opcion: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Ingrese una opcion valida.");
                teclado.next();
            }
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1: {
                    mostrarOpciones();
                    System.out.println("Seleccione una opcion: ");
                    while (!teclado.hasNextInt()){teclado.next();}
                    int tipoVehiculo = teclado.nextInt();
                    switch (tipoVehiculo) {
                        case 1: {
                            System.out.println("Cantidad de pisos: ");
                            int pisos = teclado.nextInt();
                            System.out.println("Marca: ");
                            String marca = teclado.next();
                            System.out.println("Patente: ");
                            String patente = teclado.next();
                            System.out.println("Cantidad de pasajeros:");
                            int pasajeros = teclado.nextInt();
                            System.out.println("Año: ");
                            int anio = teclado.nextInt();
                            
                            ColectivoTuristico colectivo = new ColectivoTuristico(pisos,patente, marca, pasajeros, anio);
                            agencia.agregarVehiculo(colectivo);
                            break;
                        }
                        case 2: {
                            System.out.println("Aire Acondicionado: ");
                            boolean aire = teclado.nextBoolean();
                            System.out.println("patente:");
                            String patente = teclado.next();
                            System.out.println("Marca:");
                            String marca = teclado.next();
                            System.out.println("Cantidad pasajeros: ");
                            int pasajeros = teclado.nextInt();
                            System.out.println("Año de fabricacion: ");
                            int anio = teclado.nextInt();
                            
                            VanEjecutiva van = new VanEjecutiva(aire, patente, marca, pasajeros, anio);
                            agencia.agregarVehiculo(van);
                            break;
                        }
                        case 3:{
                            System.out.println("Tipo de motor: NAFTA | DIESEL | ELECTRICO ");
                            int motor = teclado.nextInt();
                            System.out.println("Patente: ");
                            String patente = teclado.next();
                            System.out.println("Marca: ");
                            String marca = teclado.next();
                            System.out.println("Cantidad Pasajeros: ");
                            int pasajeros = teclado.nextInt();
                            System.out.println("Año de fabricacion: ");
                            int anio = teclado.nextInt();
                            
                            LanchaTuristica.TipoMotor tipo = LanchaTuristica.TipoMotor.values()[motor -1];
                            LanchaTuristica lancha = new LanchaTuristica(tipo, patente, marca, pasajeros, anio);
                            break;
                        }
                        default:
                            System.out.println("Tipo invalido");
                    }
                    break;
                }
                    
                case 2:
                    agencia.mostrarVehiculos();
                    break;
                    
             
                
                
                
            }
            
            
            
        } while (opcion != 8);
                teclado.close();
        
    }
    
    public static void mostrarMenu() {
        System.out.println("--- MENU ----");
        System.out.println("1. Agregar vehiculos");
        System.out.println("2. Mostrar todos los vehiculos");
        System.out.println("3. Realizar servicios turisticos");
        System.out.println("4. Buscar vehiculo por patente");
        System.out.println("5. Mostrar todos los vehiculos con capacidad mayor a un valor ingresado");
        System.out.println("6. Mostrar vehiculos ordenados por año de fabricacion descendente");
        System.out.println("7. Mostrar vehiculos ordenados por capacidad de pasajeros descendente");
        System.out.println("8. Salir");
        System.out.println("----------------------------------------------------------------------");
    }
    
    public static void mostrarOpciones() {
        System.out.println("---Tipo de Vehiculo ---");
        System.out.println("1. Colectivo Turistico");
        System.out.println("2. Van Ejecutiva");
        System.out.println("3.Lancha Turistica");
    }
    
}
