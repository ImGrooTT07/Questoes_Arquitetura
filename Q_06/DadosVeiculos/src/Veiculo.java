public class Veiculo {
    private int peso;
    private int velocidadeMaxima;
    private float preco;

    public Veiculo() {
        this(0, 0, 0f);
    }

    public Veiculo(int peso, int velocidadeMaxima, float preco) {
        this.peso = peso;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void set(java.util.Scanner scanner) {
        System.out.println("--- Inserir dados do Veículo ---");
        System.out.print("Peso (kg): ");
        setPeso(scanner.nextInt());
        System.out.print("Velocidade máxima (km/h): ");
        setVelocidadeMaxima(scanner.nextInt());
        System.out.print("Preço (R$): ");
        setPreco(scanner.nextFloat());
    }

    public void print() {
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Preço: R$" + preco);
    }
}
