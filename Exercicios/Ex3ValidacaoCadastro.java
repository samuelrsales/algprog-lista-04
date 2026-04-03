import java.util.Scanner;

public class Ex3ValidacaoCadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        do {
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();

        } while(nome.length() <= 3);


        sc.close();
    }
}
