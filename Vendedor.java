public class Vendedor extends Empregado{
    private double totalDasVendas;
    private double comissao;
    
    public double getTotalDasVendas() {
        return totalDasVendas;
    }
    public void setTotalDasVendas(double totalDasVendas) {
        this.totalDasVendas = totalDasVendas;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    //construtor
    public Vendedor(String nome, String cpf){
        super(nome, cpf);
    }
}
