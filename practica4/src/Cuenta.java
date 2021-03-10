import java.util.Scanner;

public class Cuenta {

    public String titular = " ";
    public double cuenta = 0;
    
    Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cuenta = cantidad;
    }

    public String getTitular(){
        return titular;

    }

    public void setTitular(String t){
        this.titular = t;
    }

    public void ingresar(double cantidad){
        if (cantidad < 0) {
            this.cuenta += 0;
        } else {
            this.cuenta += cantidad;
            System.out.print("La cantidad a sido ingresada\n\n");
        }        
    }
    public void retirar(double cantidad){
        if ((this.cuenta - cantidad )<= 0) {
            this.cuenta = 0;
        }
        this.cuenta -= cantidad;
        System.out.print("La cantidad a sido retirada\n\n");
        
    }
    public String toString(){
        return"El titular " + getTitular() + " tiene " + cuenta + " pesos en la cuenta\n \n";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String titular;
        double cantidad = 0;
        int menu = 0;
        System.out.print("Ingrese el nombre del titular: \n");
        titular = scanner.nextLine();
        Cuenta t1 = new Cuenta(titular, cantidad);
        
        while (true) {
            System.out.print("Bienvenido, "+titular+", elija lo que necesita: \n");
            System.out.print("1.Ingresar | 2.Retirar | 3.Consultar | 4.Salir: \n");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Ingresa la cantidad: \n");                
                    cantidad = scanner.nextDouble();
                    t1.ingresar(cantidad);                      
                    break;

                case 2:
                    System.out.print("Ingresa la cantidad: \n"); 
                    cantidad = scanner.nextDouble();
                    t1.retirar(cantidad);
                    break;

                case 3:                   
                    System.out.print(t1.toString());
                    break;
            
                default:
                    return;
            }
        }
    }
}