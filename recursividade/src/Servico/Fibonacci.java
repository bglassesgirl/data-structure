package Servico;
import java.util.Arrays;

public class Fibonacci {

    public String fibonacci() {
        int result = 1;
        int aux = 0;

        String fibonacci = aux + " - " + result;

        for (int cont = 0; result <= 100; cont++) {
            result = result + aux;
            aux = result - aux;

            fibonacci += " - " + result;
        }

        return fibonacci;
    }

    public String calcularVetor() {
        int fibo[] = new int[13];

        fibo[0] = 0;
        fibo[1] = 1;

        calcularFibonacciRecursivo(fibo, 2);

        System.out.println(Arrays.toString(fibo));

        String fibonacci = Arrays.toString(Arrays.copyOf(fibo, fibo.length - 1)).replaceAll("[\\[\\],]", "");

        return fibonacci;
    }

    private void calcularFibonacciRecursivo(int[] fibo, int n) {
        if (n >= fibo.length) {
            return;
        }

        fibo[n] = fibo[n - 1] + fibo[n - 2];
        calcularFibonacciRecursivo(fibo, n + 1);
    }

   
}


