import java.util.Scanner;

public class Ex10InvervaloNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o inicio do intervalo: ");
        int numeroInicial = sc.nextInt();
        
        System.out.println("Digite o fim do intervalo: ");
        int numeroFinal = sc.nextInt();

        for(int i = numeroInicial; i <= numeroFinal; i++) {
            System.out.print(i + " ");
        }


        sc.close();
    }
}
