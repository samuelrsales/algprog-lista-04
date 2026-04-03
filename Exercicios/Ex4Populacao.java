public class Ex4Populacao {
    public static void main(String[] args) {
        
        int populacaoCidadeA = 80000;
        double crescimentoCidadeA = 3;

        int populacaoCidadeB = 200000;
        double crescimentoCidadeB = 1.5;

        int qtdeAnos = 0;

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
