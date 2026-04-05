import java.util.Scanner;

public class Ex7MaiorNumero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroMaior = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número: ");
            int numeroDigitado = sc.nextInt();

            if (numeroDigitado > numeroMaior) {
                numeroMaior = numeroDigitado;
            }
        }

        System.out.println("O maior número digitado foi: " + numeroMaior);

        sc.close();

    }
}
