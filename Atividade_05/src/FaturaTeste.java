import java.util.Scanner;

public class FaturaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Fatura ===");
        System.out.print("Número do item: ");
        String numero = scanner.nextLine();

        System.out.print("Descrição do item: ");
        String descricao = scanner.nextLine();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Preço por item: ");
        double preco = scanner.nextDouble();

        Fatura fatura = new Fatura(numero, descricao, quantidade, preco);

        System.out.println("\n=== Detalhes da Fatura ===");
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: R$" + fatura.getPrecoPorItem());
        System.out.println("Total da fatura: R$" + fatura.getTotalFatura());

        scanner.close();
    }
}
