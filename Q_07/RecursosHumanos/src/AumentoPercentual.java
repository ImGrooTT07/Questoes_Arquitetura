public class AumentoPercentual implements AumentoSalarial {
    private double percentual;

    public AumentoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public void aplicarAumento(Empregado empregado) {
        double novoSalario = empregado.getSalarioMensal() * (1 + percentual / 100);
        empregado.setSalarioMensal(novoSalario);
    }
}
