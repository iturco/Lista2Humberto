public class Gerente extends Empregado{
    private double salario;
    private double bonus;
    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    } 

    //construtor
    public Gerente (String nome, String cpf){
       super(nome, cpf);
    }

}
