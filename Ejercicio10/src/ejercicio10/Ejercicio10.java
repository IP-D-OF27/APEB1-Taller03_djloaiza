package ejercicio10;

public class Ejercicio10 {
    public static void main(String[] args) {
        int valor1 = 25;
        int valor2 = 10;
        int valor3 = 100;
        int valor4 = 5;
        int valor5 = 2;
        boolean valorV1 = true;
        boolean valorV2 = false;
        double ValorC1 = Math.sqrt(valor1) * valor2;
        double ValorC2 = valor2 / valor4;
        boolean respuesta = (ValorC1 >= valor3) && (valorV1) || (valorV2) || (ValorC2 >= valor5);
        System.out.println("Solucion");
        System.out.println(respuesta);
    }
    
}
