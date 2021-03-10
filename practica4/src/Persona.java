import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class Persona {
    private String nombre = " ";
    private int edad = 0;
    private int cedula;
    private String sexo = "H";
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

    Persona(String nombre, int edad, int cedula, String sexo, double peso,
     double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
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

    public int calcular_peso_ideal(double altura, double peso){
        double pesoIdeal = convertir_libra_kilogramos(peso) / (Math.pow(convertir_pie_metro(peso), 2));
        if (pesoIdeal < 20) {
            return -1;
        }
        else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            System.out.print("Estas por debajo de tu peso ideal");
            return 0;
        }
        System.out.print("Estas por encima de tu peso ideal");
        return 1;
    }
    public String mayor_edad(int edad){
        if (edad < 18) {
            return "es menor de edad";
        }
        return "es mayor de edad";
    }
    public void comprobar_sexo(){
        if (getSexo() == "M") {
            setSexo(sexo);
        }
    }  
    public double generar_cedula(){
        double cedula = Math.random()*10000000000l;
        return cedula;
    }
    public String toString(){
        return " ";
    }

    /********************************************************** */
    public static void main(String[] args) {
       Persona pr = new Persona();
       System.out.print(pr.generar_cedula());
       pr.setSexo();
       pr.comprobar_sexo();
    }
    
}
