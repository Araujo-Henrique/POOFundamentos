public abstract class Funcionario {
    protected double salarioBase;

    public double getSalario() {
        return this.salarioBase + getGratificacao();
    }

    protected abstract double getGratificacao();
}