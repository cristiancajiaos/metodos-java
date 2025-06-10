package metodos;

public class Operaciones {
    // Atributos
    int numero1 = 2;
    int numero2 = 4;
    int suma, resta;
    
    public void bienvenida() {
        System.out.println("Bienvenido");
    }
    
    public void sumar(){
        this.suma = this.numero1 + this.numero2;
    }
    
    public void restar() {
        this.resta = this.numero1 - this.numero2;
    }
    
    public void resultado() {
        System.out.println("Suma: " + this.suma);
        System.out.println("Resta: " + this.resta);
    }
   
}
