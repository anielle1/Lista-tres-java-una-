import java.util.Scanner;

public class Exercicio01{
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma nota entre 0 a 10: ");
       double nota = scanner.nextDouble();

        while(nota < 0 || nota > 10 ){
            System.out.println("Valor invalido, informe um valor valido: ");
            nota = scanner.nextDouble();
        }
        scanner.close();
      }
}
