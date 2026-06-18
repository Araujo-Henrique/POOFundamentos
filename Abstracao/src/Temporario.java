public class Temporario extends Funcionario {
    public int mesesContrato;

    public Temporario(double salarioBase, int mesesContrato){
        this.salarioBase = salarioBase;
        this.mesesContrato = mesesContrato;
    }

    protected double getGratificacao(){
        return this.mesesContrato * 100;
    }
}