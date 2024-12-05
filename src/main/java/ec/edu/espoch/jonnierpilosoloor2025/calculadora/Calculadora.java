
package ec.edu.espoch.jonnierpilosoloor2025.calculadora;

import java.util.Stack;

public class Calculadora {
    
    private int tamaño;
    private Stack<String> pilaDeshacer;
    private Stack<String> pilaRehacer;
    private String contenido;

    public Calculadora(String contenido) {
        this.pilaDeshacer = new Stack<>();
        this.pilaRehacer = new Stack<>();
        this.contenido = "";
    }
    
    
    
    public void pilaResultados(){
        
    }
    
     public void pilaRehacer(){
        if (!pilaRehacer.isEmpty()){
            pilaDeshacer.push(contenido);
            contenido = pilaRehacer.pop();
            System.out.println("Rehacer: " + contenido);
        } else {
            System.out.println("No hay acciones para rehacer");
        }
    }
    
    
}
