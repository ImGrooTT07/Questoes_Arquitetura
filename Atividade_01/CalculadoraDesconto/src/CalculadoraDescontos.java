public class CalculadoraDescontos {
    public double calcularDesconto(double preco, double desconto) {
        return preco - (preco * desconto);
    }

    public double calcularDescontoProdutoA(double preco) {
        return calcularDesconto(preco, 0.10);
    }

    public double calcularDescontoProdutoB(double preco) {
        return calcularDesconto(preco, 0.15);
    }

    public double calcularDescontoProdutoC(double preco) {
        return calcularDesconto(preco, 0.20);
    }
}
