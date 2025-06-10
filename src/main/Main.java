package main;

import metodos.Operaciones;

public class Main {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        
        // Invocar métodos
        op.bienvenida();
        
        // Ejemplo 1
        // op.sumar();
        // op.restar();
        
        // Ejemplo 2
        // op.sumar(2,3);
        // op.restar(4,5);
        
        // Ejemplo 3
        System.out.println("La suma es " + op.sumar(3,5));
        System.out.println("La resta es " + op.restar(5,5));
        // op.resultado();
    }

}
