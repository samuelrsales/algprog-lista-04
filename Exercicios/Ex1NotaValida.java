import java.util.Scanner;

public class Ex1NotaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        boolean notaValida;
        
        do {
            System.out.println("Digite uma nota entre 0 e 10");
            int nota = sc.nextInt();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota válida!");
                 notaValida = true;
            } else {
                System.out.println("Nota inválida!");
                 notaValida = false;
            }


        } while (notaValida == false);

        sc.close();
    }
}