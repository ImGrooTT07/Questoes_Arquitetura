public class Motor {
    private int numCilindros;
    private int potencia;

    public Motor() {
        this(0, 0);
    }

    public Motor(int numCilindros, int potencia) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void set(java.util.Scanner scanner) {
        System.out.println("--- Inserir dados do Motor ---");
        System.out.print("Número de cilindros: ");
        setNumCilindros(scanner.nextInt());
        System.out.print("Potência (cv): ");
        setPotencia(scanner.nextInt());
    }

    public void print() {
        System.out.println("Número de cilindros: " + numCilindros);
        System.out.println("Potência: " + potencia + " cv");
    }
}
