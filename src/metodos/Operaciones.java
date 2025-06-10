package metodos;

public class Operaciones {
    // Atributos
    // int numero1 = 4;
    // int numero2 = 2;
    int suma, resta;
    
    public void bienvenida() {
        System.out.println("Bienvenido");
    }
    
    public int sumar(int numero1, int numero2){
        this.suma = numero1 + numero2;
        return this.suma;
    }
    
    public int restar(int numero1, int numero2) {
        this.resta = numero1 - numero2;
        return this.resta;
    }
    
    /*
    public void resultado() {
        System.out.println("Suma: " + this.suma);
        System.out.println("Resta: " + this.resta);
    }
    */
   
}
