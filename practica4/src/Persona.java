import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class Persona {
    Random Rm = new Random();
    private String nombre = " ";
    private int edad = 0;
    private int cedula;
    private String sexo = " ";
    private double peso = 0;
    private double altura = 0;

    //SETTERS
    public void setNombre(String N){
        this.nombre = N;
    }
    public void setEdad(int E){
        this.edad = E;
    }
    public void setSexo(String S){
        this.sexo = S;
    }
    public void setPeso(double P){
        this.peso = P;
    }
    public void setAltura(double A){
        this.altura = A;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getSexo(){
        return this.sexo;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getAltura(){
        return this.altura;
    }

    Persona(){

    }
    
    Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;        
    }

    Persona(String nombre, int edad, String sexo, double peso,
     double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public double convertir_pie_metro(double pie){
        double metros = pie / 3.281;
        return metros;
    }

    public double convertir_libra_kilogramos(double libra){
        double kilogramos = libra / 2.205;
        return kilogramos;

    }

    public String calcular_peso_ideal(){
        double pesoIdeal = convertir_libra_kilogramos(getPeso()) / (Math.pow(convertir_pie_metro(getAltura()), 2));
        int save;
        if (pesoIdeal < 20) {
            save = -1;
        }
        else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            
            save = 0;
        }       
        save = 1;
        if (save == -1) {
            return " Estas por debajo de tu peso ideal";
        }
        else if(save == 0){
            return " Estas en tu peso ideal";
        }
        return " Estas por encima de tu peso ideal";
    }
    public String mayor_edad(){
        if (getEdad() < 18) {
            return " es menor de edad";
        }
        return " es mayor de edad";
    }
    public String comprobar_sexo(){
        if (getSexo() == "M") {
            setSexo(sexo);
        }
        return " ";

    }  
    private int generar_cedula(){
        int cedula = Rm.nextInt(900000000) + 100000000;
        return cedula;
    }
    public String toString(){
        return "\nSu nombre es: "+getNombre()+ "\nSu edad: " +getEdad()+""+mayor_edad()+ "\nSu cedula: " +generar_cedula()+ "\nSu sexo: "+getSexo()+ "" +comprobar_sexo()+
        "\nSu peso :"+getPeso()+ "" +calcular_peso_ideal()+ "\nSu altura :"+getAltura();
    }

    /********************************************************** */
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String nombre;
        int edad;
        String sexo;
        double peso;
        double altura;

        System.out.print("Ingrese su nombre: \n");
        nombre = SC.nextLine();

        System.out.print("Ingrese su edad: \n");
        edad = SC.nextInt();

        System.out.print("Ingrese su sexualidad \n");
        sexo = SC.next();

        System.out.print("Ingrese su peso \n");
        peso = SC.nextDouble();

        System.out.print("Ingrese su altura \n");
        altura = SC.nextDouble();

       Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
       
       System.out.println(p1.toString());

    }
    
}
