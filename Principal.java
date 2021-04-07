import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Digite o numero do item desejado");
        System.out.println("1. Cadastar Empregado");
        System.out.println("2. Cadastar Cliente");
        System.out.println("3. Pesquisar");
        System.out.println("4. Lista de Empregados");
        System.out.println("5. Lista de Clientes");
        System.out.println("6. Remover");
        System.out.println("7. Finalizar");

        num = input.nextInt();

        switch (num) {
        case 1:
            lista.add(CadastrarEmpregado());
            break;
        case 2:
            lista.add(CadastrarCliente());
            break;
        case 3:
            
            break;
        case 4:
            ListarEmpregado(lista);
            break;
        case 5:
            ListarCliente(lista);
            break;
        case 6:
            RemoverPessoa(lista);
            break;
        default:
            break;
        }

    }

    
    public static Empregado CadastrarEmpregado() {

        Scanner input = new Scanner(System.in);
        Empregado empregado = null;

        System.out.println("Digite 1 para Gerente e 2 para Vendedor");
        int num = input.nextInt();
        switch (num) {
        case 1:
            empregado = CadastrarGerente();
            break;

        case 2:
            empregado = CadastrarVendedor();
            break;
        }
        return empregado;


    }

    public static Empregado CadastrarGerente() {
        System.out.print("Digite o cpf: ");
        String cpf = new Scanner(System.in).nextLine();

        // ce = cadastrar empregado
        Gerente ce = new Gerente();
        ce.setCpf(cpf);
        return ce;
    }

    public static Empregado CadastrarVendedor() {
        System.out.print("Digite o cpf: ");
        String cpf = new Scanner(System.in).nextLine();

        // ce = cadastrar empregado
        Vendedor ce = new Vendedor();
        ce.setCpf(cpf);
        return ce;
    }

    public static Cliente CadastrarCliente() {
        System.out.print("Digite o cpf: ");
        String cpf = new Scanner(System.in).nextLine();

        // cc = cadastrar cliente
        Cliente cc = new Cliente();
        cc.setCpf(cpf);
        return cc;
    }

    //PESQUISAR
    /*tirar o void e add o return
    public static void Pesquisar(List<Pessoa> lista) {
        System.out.print("Busca por cpf: ");
        String cpf = new Scanner(System.in).nextLine();

        for(int i = 0; i < lista.size(); i++) {
            if(lista.contains(cpf)) {
                
            }
        }
        
    }*/

    public static void RemoverPessoa(List<Pessoa> lista){
        System.out.print("Digite o cpf que deseja remover: ");
        String cpf = new Scanner(System.in).nextLine();

        lista.remove(cpf);
        if(lista.contains(cpf)) {
            System.out.print(cpf + "aqui está o cpf procurado");
        } else {
            System.out.print("cpf não encontrado");
        }
 
    }
    public static void ListarCliente(List<Pessoa> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista instanceof Cliente) {
                System.out.println(lista.get(i).getNome());
            }
        }
    }

    public static void ListarEmpregado(List<Pessoa> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista instanceof Empregado) {
                System.out.println(lista.get(i).getNome());
            }
        }
    }

}
