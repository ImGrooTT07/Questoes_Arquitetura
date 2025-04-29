public class CarroPasseio extends Motor {
    private Veiculo veiculo;
    private String cor;
    private String modelo;

    public CarroPasseio() {
        this(new Veiculo(), "", "");
    }

    public CarroPasseio(Veiculo veiculo, String cor, String modelo) {
        super();
        this.veiculo = veiculo;
        this.cor = cor;
        this.modelo = modelo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void set(java.util.Scanner scanner) {
        super.set(scanner);
        veiculo.set(scanner);
        scanner.nextLine(); // limpar o \n pendente
        System.out.print("Cor: ");
        setCor(scanner.nextLine());
        System.out.print("Modelo: ");
        setModelo(scanner.nextLine());
    }

    public void print() {
        System.out.println("--- Carro de Passeio ---");
        super.print();
        veiculo.print();
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
    }
}
