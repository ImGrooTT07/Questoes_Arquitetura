public class Resultado {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();

        System.out.println("Soma: " + calc.somar(5, 3));
        System.out.println("Subtração: " + calc.subtrair(5, 3));
        System.out.println("Multiplicação: " + calc.multiplicar(5, 3));
        System.out.println("Divisão: " + calc.dividir(10, 2));
        System.out.println("Raiz Quadrada: " + calc.raizQuadrada(16));
        System.out.println("Potência: " + calc.potencia(2, 4));
    }
}
