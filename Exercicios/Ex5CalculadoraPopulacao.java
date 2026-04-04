import java.util.Scanner;

public class Ex5CalculadoraPopulacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a população da cidade A: ");
        int populacaoCidadeA = sc.nextInt();
        
        System.out.println("Digite o crescimento (%) da cidade A: ");
        double crescimentoCidadeA = sc.nextDouble();

        System.out.println("Digite a população da cidade B: ");
        int populacaoCidadeB = sc.nextInt();
        
        System.out.println("Digite o crescimento (%) da cidade B: ");
        double crescimentoCidadeB = sc.nextDouble();

        int qtdeAnos = 0;

        sc.close();

        do {
            if (populacaoCidadeB > populacaoCidadeA) {
                populacaoCidadeA += populacaoCidadeA * (crescimentoCidadeA /100);
                populacaoCidadeB += populacaoCidadeB * (crescimentoCidadeB /100);
                qtdeAnos++;
            }
        } while (populacaoCidadeB > populacaoCidadeA);

        System.out.println("Resumo atual:");
        System.out.println("A cidade A ultrapassa a cidade B em " + qtdeAnos + " anos");
        System.out.println("População Cidade A: " + populacaoCidadeA + " habitantes.");
        System.out.println("População Cidade B: " + populacaoCidadeB + " habitantes.");
    }
}
