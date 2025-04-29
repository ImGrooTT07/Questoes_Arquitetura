public class CalculadoraPadraoSalarioAnual implements CalculadoraSalarioAnual {
    @Override
    public double calcularSalarioAnual(Empregado empregado) {
        return empregado.getSalarioMensal() * 12;
    }
}
