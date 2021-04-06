import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

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
            Empregado.add(CadastrarEmpregado());
            break;
        case 2:

            break;
        case 3:

            break;
        case 4:

            break;
        case 5:

            break;
        case 6:

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

    public static Cliente cadastrarCliente() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o cpf: ");
        String cpf = new Scanner(System.in).nextLine();

        // cc = cadastrar cliente
        Cliente cc = new Cliente();
        cc.setCpf(cpf);
        return cc;
    }
}
