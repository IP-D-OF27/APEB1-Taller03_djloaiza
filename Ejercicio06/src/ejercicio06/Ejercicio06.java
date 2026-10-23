package ejercicio06;
public class Ejercicio06 {
    public static void main(String[] args) {
        int valor1 = 81;
        int valor2 = 9;
        int valor3 = 3;
        int valor4 = 10;
        int valor5 = 1;
        System.out.println("Solucion");
        double valorCompuesto = (Math.sqrt(valor1) + valor2) / valor3;
        boolean valorVerdad1 = valorCompuesto == valor2;
        boolean valorVerdad2 = valor4 > valor5;
        boolean resultado = valorVerdad1 || valorVerdad2;
        System.out.println(resultado);
    }
    
}
