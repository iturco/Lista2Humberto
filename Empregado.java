public class Empregado extends Pessoa {
    protected String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //construtor
    public Empregado(String nome, String cpf){
        super(nome, cpf);
    }

}
