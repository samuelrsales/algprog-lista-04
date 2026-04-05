import java.util.Scanner;

public class Ex8SomaMedia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int somador = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número: ");
            int numeroDigitado = sc.nextInt();

            somador += numeroDigitado;
        }

        System.out.println("Soma total dos números: " + somador);
        System.out.println("Média dos números: " + (somador / 5) );

        sc.close();

    }
}
