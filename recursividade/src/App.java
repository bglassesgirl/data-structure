import Servico.BinaryToDecimal;
import Servico.Fibonacci;

public class App {
    public static void main(String[] args) throws Exception {
        
       // Recursividade recursao = new Recursividade();

       // System.out.println(recursao.soma(10));

       // Fibonacci fibo = new Fibonacci();
        // System.out.println(fibo.calcularVetor());

        String binaryNumber = "1101";
        int decimalNumber = BinaryToDecimal.binaryToDecimal(binaryNumber);
        System.out.println("Binary: " + binaryNumber + " to Decimal: " + decimalNumber);
    }
}