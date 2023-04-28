import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuario: ");
        String nome = scanner.next().toLowerCase();

        System.out.println("Digite a senha: ");
        String senha = scanner.next().toLowerCase();

        if(senha.equals(nome)){
            System.out.println("Erro,escreva novamente.");
        }
        while(senha.equals(nome));
        System.out.println("Seja Bem Vindo! ");

        scanner.close();

        
       


    }
    
}
