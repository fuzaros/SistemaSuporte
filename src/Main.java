import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== CADASTRO DE CHAMADOS - IT SOLUTIONS ===");

        for (int i = 1; i <= 3 ; i++){
            int numeroChamdo = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                try{
                    System.out.println("Informe o número inteiro para o chamado " + i + ": ");
                    numeroChamdo = scanner.nextInt();
                    scanner.nextLine();
                    entradaValida = true;
                }catch (InputMismatchException e){
                    System.out.println("[ERRO] Entrada inválida! Digite apenas números inteiros.");
                    scanner.nextLine();
                }
            }

            System.out.println("Digite a descrição do problema: ");
            String descricao = scanner.nextLine();

            new Chamado(numeroChamdo, descricao, "Aberto");
            System.out.println("Chamado " + i + " cadastro com sucesso!\n");
        }
        System.out.println("======================================");
        System.out.println("Total geral de chamados cadastrados no sistema: " + Chamado.getTotalChamados());
        System.out.println("======================================");

        scanner.close();
    }
}
