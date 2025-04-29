public class Main {
    public static void main(String[] args) {
        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        double precoA = 1000.0;
        double precoB = 2000.0;
        double precoC = 3000.0;

        double precoComDescontoA = calculadora.calcularDescontoProdutoA(precoA);
        double precoComDescontoB = calculadora.calcularDescontoProdutoB(precoB);
        double precoComDescontoC = calculadora.calcularDescontoProdutoC(precoC);

        System.out.println("Produto A com desconto: R$ " + precoComDescontoA);
        System.out.println("Produto B com desconto: R$ " + precoComDescontoB);
        System.out.println("Produto C com desconto: R$ " + precoComDescontoC);
    }
}

