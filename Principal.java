import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int num;

        do {
            System.out.println();
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
                lista.add(CadastrarPessoa(lista, num));
                break;
            case 2:
                lista.add(CadastrarPessoa(lista, num));
                break;
            case 3:
                Pesquisar(lista);
                break;
            case 4:
                ListarEmpregado(lista);
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i) instanceof Empregado) {
                        System.out.println(lista.get(i).getNome());
                    }
                }
                break;
            case 5:
                ListarCliente(lista);
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i) instanceof Cliente) {
                        System.out.println(lista.get(i).getNome());
                    }
                }

                break;
            case 6:
                RemoverPessoa(lista);
                break;
            }

        } while (num != 7);
        System.out.println("Finish, Finalizado, c'est fini, Fetig");

    }

    private static Pessoa CadastrarPessoa(List<Pessoa> lista, int num) {
        Scanner sc = new Scanner(System.in);
        // Pessoa novo;
        Pessoa usuario = null;
        if (num == 1) {
            System.out.println("11 para gerente");
            System.out.println("12 para vendedor");

            int teste = sc.nextInt();
            switch (teste) {
            case 11:
                usuario = CadastrarEmpregado(num);
                break;

            case 12:
                usuario = CadastrarEmpregado(num);
                break;
            }
        } else {
            usuario = CadastrarCliente();
        }
        return usuario;

    }

    public static Empregado CadastrarEmpregado(int num) {
        Scanner input = new Scanner(System.in);

        Empregado emp = null;

        String nome;
        String cpf;

        switch (num) {
        case 1:
            System.out.println("Digite o nome");
            nome = input.next();
            System.out.println("Digite o cpf");
            cpf = input.next();

            emp = new Gerente(nome, cpf);
            // emp = CadastrarGerente();
            return emp;

        case 2:
            System.out.println("Digite o nome");
            nome = input.nextLine();
            System.out.println("Digite o cpf");
            cpf = input.nextLine();

            emp = new Vendedor(nome, cpf);
            // emp = CadastrarVendedor();
            return emp;
        }
        return emp;

    }

    public static Empregado CadastrarGerente() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Cpf: ");
        String cpf = input.nextLine();

        Empregado ger = new Empregado(nome, cpf);
        return ger;
    }

    public static Empregado CadastrarVendedor() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Cpf: ");
        String cpf = input.nextLine();

        Vendedor ven = new Vendedor(nome, cpf);
        return ven;
    }

    public static Cliente CadastrarCliente() {
        System.out.print("Digite o nome: ");
        String nome = new Scanner(System.in).nextLine();

        System.out.print("Digite o cpf: ");
        String cpf = new Scanner(System.in).nextLine();

        // cc = cadastrar cliente
        Cliente cc = new Cliente(nome, cpf);
        return cc;
    }

    public static void Pesquisar(List<Pessoa> lista) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < lista.size(); i++) {
            System.out.print("Digite o cpf que procura: ");
            String cpfP = input.next();
            if (lista.get(i) instanceof Cliente) {
                System.out.println(cpfP + " pertence a Cliente");
                break;
            } else {
                System.out.println(cpfP + " pertence a Empregado");
                break;
            }
        }
    }

    public static void RemoverPessoa(List<Pessoa> lista) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Digite SIM para continutar e deletar ou digite NAO para voltar ao menu");
            String apagar = sc.nextLine();
            if (apagar.toLowerCase() != "nao" || apagar.toLowerCase() != "não") {
                System.out.print("Digite o cpf que deseja remover: ");

                Pessoa ParaApagar = lista.get(i);

                String ProcuraCpf = sc.nextLine();
                if (ParaApagar.getCpf().equals(ProcuraCpf)) {
                    lista.remove(ParaApagar);
                }
            } else {
                break;
            }
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
