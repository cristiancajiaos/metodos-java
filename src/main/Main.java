package main;

import metodos.Operaciones;

public class Main {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        
        // Invocar métodos
        op.bienvenida();
        op.sumar();
        op.restar();
        op.resultado();
    }

}
