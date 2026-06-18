public class Concursado extends Funcionario {
    public int anosTrabalho;

    public Concursado(double salarioBase, int anosTrabalho){
        this.salarioBase = salarioBase;
        this.anosTrabalho = anosTrabalho;
    }

    protected double getGratificacao(){
        int quinquenio = this.anosTrabalho / 5;

        return quinquenio * 0.02 * this.salarioBase;
    }
}