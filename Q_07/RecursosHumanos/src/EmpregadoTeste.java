public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("Luis", "Silva", 5000);
        Empregado emp2 = new Empregado("Arthur", "Oliveira", 7500);

        CalculadoraSalarioAnual calculadora = new CalculadoraPadraoSalarioAnual();
        AumentoSalarial aumento10 = new AumentoPercentual(10);

        System.out.println("Salários anuais antes do aumento:");
        System.out.println(emp1.getNome() + ": R$ " + calculadora.calcularSalarioAnual(emp1));
        System.out.println(emp2.getNome() + ": R$ " + calculadora.calcularSalarioAnual(emp2));

        aumento10.aplicarAumento(emp1);
        aumento10.aplicarAumento(emp2);

        System.out.println("\nSalários anuais após aumento de 10%:");
        System.out.println(emp1.getNome() + ": R$ " + calculadora.calcularSalarioAnual(emp1));
        System.out.println(emp2.getNome() + ": R$ " + calculadora.calcularSalarioAnual(emp2));
    }
}
