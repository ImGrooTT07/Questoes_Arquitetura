public class CalculadoraCientifica extends Calculadora {

    public double raizQuadrada(double valor) {
        if (valor < 0) {
            throw new ArithmeticException("Raiz quadrada de número negativo não é permitida.");
        }
        return Math.sqrt(valor);
    }
    
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}

