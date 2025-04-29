public class Caminhao extends Motor {
    private Veiculo veiculo;
    private int toneladas;
    private int alturaMaxima;
    private int comprimento;

    public Caminhao() {
        this(new Veiculo(), 0, 0, 0);
    }

    public Caminhao(Veiculo veiculo, int toneladas, int alturaMaxima, int comprimento) {
        super();
        this.veiculo = veiculo;
        this.toneladas = toneladas;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void set(java.util.Scanner scanner) {
        super.set(scanner);
        veiculo.set(scanner);
        System.out.print("Toneladas: ");
        setToneladas(scanner.nextInt());
        System.out.print("Altura máxima (cm): ");
        setAlturaMaxima(scanner.nextInt());
        System.out.print("Comprimento (cm): ");
        setComprimento(scanner.nextInt());
    }

    public void print() {
        System.out.println("--- Caminhão ---");
        super.print();
        veiculo.print();
        System.out.println("Toneladas: " + toneladas);
        System.out.println("Altura Máxima: " + alturaMaxima + " cm");
        System.out.println("Comprimento: " + comprimento + " cm");
    }
}
