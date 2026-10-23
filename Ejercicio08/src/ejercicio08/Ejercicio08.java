package ejercicio08;
public class Ejercicio08 {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 9;
        int valor3 = 20;
        int valor4 = 500;
        int valor5 = 2;
        int valor6 = 3;
        int valor7 = 200;
        int valor8 = 50;
        int valor9 = 51;
        double ValorCompuesto1 = ((valor1 * valor2) + valor3 - (valor4 / valor5) + (Math.pow(valor6, valor5)));
        double ValorCompuesto2 = (valor8 - valor8 + valor9);
        boolean ValorVerdad1 = ValorCompuesto1 >= valor7;
        boolean ValorVerdad2 = valor8 >= ValorCompuesto2;
        boolean ValorFinal = ValorVerdad1 && ValorVerdad2;
        System.out.println(ValorFinal);
    }
    
}
