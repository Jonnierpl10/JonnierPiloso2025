

package ec.edu.espoch.jonnierpilosoloor2025;

import ec.edu.espoch.jonnierpilosoloor2025.calculadora.Calculadora;
import java.util.Scanner;

public class JonnierPilosoLoor2025 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Calculadora objCalculadora = new Calculadora("");
        
        int opcion;
        do{
            System.out.println("Menu de Opciones: ");
            
            System.out.println("1.- Sumar");
            System.out.println("2.- Deshacer");
            System.out.println("3.- Rehacer");
            System.out.println("4.- Mostar resultado actual");
            System.out.println("5.- Salir");
            
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion){
                case 1: 
                    break;
                    
                case 2: 
                    break;
                
                case 3: 
                    break;
               
                case 4: 
                break;
                
                case 5: System.out.println("Saliendo del Progreama...");
                break;
                default: System.out.println("Opcion no valida. Por favor, intenta de nuevo");
            }
        }while (opcion != 5);
        scanner.close();
    }
}
