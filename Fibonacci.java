import java.util.Scanner;

public class Fibonacci {

    public int fibonacciCalculator(int N) throws IllegalArgumentException {
        if (N < 0) throw new IllegalArgumentException();
        return fibonacci(N);
    }

    private int fibonacci(int N) {
        int resposta = 0;
        if (N == 0) return N;
        if (N == 1) return N;
        if (N > 1) resposta = fibonacci(N - 1) + fibonacci(N - 2);
        return resposta;
    }

    public static class TesteFibonacci {
        public static void main(String[] args) {
            Fibonacci fibonacci = new Fibonacci();
            int N, f;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type value of N: ");
            N = scanner.nextInt();
            f = fibonacci.fibonacciCalculator(N);
            System.out.println("The Fibonacci number on sequence position [" + N + "] is " + f + ".");
        }
    }
}
