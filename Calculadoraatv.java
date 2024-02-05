import java.util.Scanner;

class Calculadora{
    public int Somar(int a, int b){
        return a+b;
    }
}

public class Calculadoraatv{
    public static void main(String[] args) {
        int a;
        int b;
        Calculadora calculadora1 = new Calculadora();
        System.out.println("Soma = " + calculadora1.Somar(2, 2));
    }
}
