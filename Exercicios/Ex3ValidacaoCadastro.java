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

            if (nome.length() <= 3) {
                System.out.println("Digite um nome com mais de 3 caracteres.");
            }
            
        } while(nome.length() <= 3);
        
        do {
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
    
            if (idade < 0 || idade > 150) {
                System.out.println("Digite uma idade entre 0 e 150");
            }

        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Digite seu salário: ");
            salario = sc.nextDouble();
            
            if (salario <= 0) {
                System.out.println("O valor do salário precisa ser maior que 0");
            }

        } while (salario <= 0);

        do {
            System.out.println("Digite seu sexo (m/f): ");
            sexo = sc.next().charAt(0);
            
            if (sexo != 'm' && sexo != 'f') {
                System.out.println("Digite apenas 'm' ou 'f'.");
            }

        } while (sexo != 'm' && sexo != 'f');

        do {
            System.out.println("Digite seu estado civil (s/c/v/d): ");
            estadoCivil = sc.next().charAt(0);

            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("Digite um valor válido! (s/c/v/d)");
            }
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        sc.close();
    }
}
