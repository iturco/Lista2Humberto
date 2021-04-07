public class Cliente extends Pessoa{
    private double valorDaDivida;

    public double getValorDaDivida() {
        return valorDaDivida;
    }

    public void setValorDaDivida(double valorDaDivida) {
        this.valorDaDivida = valorDaDivida;
    }

    //construtor
    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }    
}
