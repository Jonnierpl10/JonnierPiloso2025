
package ec.edu.espoch.jonnierpilosoloor2025.calculadora;

import java.util.Stack;

public class Calculadora {
    
    private Stack<Integer> pilaResultado;
    private Stack<Integer> pilaRehacer;
    private int resultado;

    public Calculadora() {
        this.resultado = 0;
        this.pilaResultado = new Stack<>();
        this.pilaRehacer = new Stack<>();
    }
    
    
    public void Sumar(){
        
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
