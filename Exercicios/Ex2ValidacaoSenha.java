import java.util.Scanner;

public class Ex2ValidacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome, senha;

        do {

            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();

            System.out.println("Digite sua senha: ");
            senha = sc.nextLine();
            
            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Sua senha não pode ser igual ao seu nome. Escolha outra");
            } else {
                System.out.println("Senha válida!");
                break;
            }

        } while (nome.equalsIgnoreCase(senha));

        sc.close();
    }
}
