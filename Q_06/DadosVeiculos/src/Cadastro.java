import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Cadastro de Carro de Passeio ====");
        CarroPasseio carro = new CarroPasseio();
        carro.set(scanner);
        carro.print();

        System.out.println("\n==== Cadastro de Caminhão ====");
        Caminhao caminhao = new Caminhao();
        caminhao.set(scanner);
        caminhao.print();

        scanner.close(); // fechar apenas uma vez
    }
}
