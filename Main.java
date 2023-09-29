import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import model.Cliente;
import model.QuartoComum;
import model.QuartoPremium;
import model.Quarto;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static Cliente clienteLogado = null;
    private static Scanner scanner = new Scanner(System.in);
    QuartoComum quartoComum = new QuartoComum(204);
    QuartoPremium quartoPremium = new QuartoPremium(205);
    

    public static void main(String[] args) {
        Main main = new Main();
        main.iniciar();
    }

        private void iniciar() {
        System.out.println("\nBem-vindo ao Sistema de Reservas de Hotel");
        while (true) {
            try {
                System.out.println("1- Fazer login.");
                System.out.println("2- Fazer cadastro.");
                System.out.println("3- Sair");
                System.out.print("Por favor, escolha uma opção: ");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        fazerLogin();
                        break;
                    case 2:
                        fazerCadastro();
                        break;
                    case 3:
                        System.out.println("Até logo!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Escolha inválida. Por favor, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Escolha inválida. Por favor, insira um número válido.");
                scanner.nextLine();
            }
        }
    }

    private void fazerLogin() {
        System.out.print("\nDigite seu nome de usuário: ");
        String nomeUsuario = scanner.nextLine().trim();
        System.out.print("\nDigite sua senha: ");
        String senha = scanner.nextLine().trim();
    
        Cliente cliente = encontrarClientePorNome(nomeUsuario);
    
        if (cliente != null && cliente.passwordCheck(senha, nomeUsuario)) {
            clienteLogado = cliente;
            System.out.println("\nLogin bem-sucedido como " + cliente.getNome());
            menuPrincipal();
        } else {
            System.out.println("Login falhou. Verifique seu nome de usuário e senha.");
        }
    }

    private void fazerCadastro() {
        System.out.print("\nDigite seu nome de usuário: ");
        String nomeCadastro = scanner.nextLine();

        if (nomeUsuarioExistente(nomeCadastro)) {
            System.out.println("Nome de usuário já existe. Por favor, escolha outro nome.");
        } else {
            System.out.print("Digite sua senha de cadastro: ");
            String senhaCadastro = scanner.nextLine();
            Cliente cliente = new Cliente(nomeCadastro, senhaCadastro);
            clientes.add(cliente);
            System.out.println("\nCadastro bem-sucedido como " + nomeCadastro);
        }
    }

    private void menuPrincipal() {
        while (true) {
            try {
                System.out.println("\nMenu Principal");
                System.out.println("1- Ver quartos disponíveis");
                System.out.println("2- Verificar senha");
                System.out.println("3- Checkout");
                System.out.println("4- Sair");
                System.out.print("Por favor, escolha uma opção: ");
    
                int escolha = scanner.nextInt();
                scanner.nextLine();
    
                switch (escolha) {
                    case 1:
                        verQuartosDisponiveis(quartoComum, quartoPremium);
                        break;
                    case 2:
                        verificarSenha();
                        break;
                    case 3:
                        fazerCheckout();
                        break;
                    case 4:
                        System.out.println("Até logo!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Escolha inválida. Por favor, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Escolha inválida. Por favor, insira um número válido.");
                scanner.nextLine();
            }
        }
    }

    private void verQuartosDisponiveis(QuartoComum quartoComum, QuartoPremium quartoPremium) {
        if (clienteLogado == null) {
            System.out.println("\nPor favor, faça o login primeiro.\n");
        } else {
            System.out.println("\nQuartos Disponíveis:");
            System.out.println("\n1. Quarto Comum: \n" + quartoComum.getComodidades());
            System.out.println("\n2. Quarto Premium \n" + quartoPremium.getComodidades());
            System.out.println("\n3. Voltar ao menu principal\n");
            System.out.print("Selecione um tipo de quarto ou volte: ");
            int escolhaQuarto = scanner.nextInt();
            scanner.nextLine();
    
            switch (escolhaQuarto) {
                case 1:
                    clienteLogado.reservarQuarto(quartoComum, clienteLogado.getNome(), clienteLogado.getPassword(), "Quarto Comum");
                    break;
                case 2:
                    clienteLogado.reservarQuarto(quartoPremium, clienteLogado.getNome(), clienteLogado.getPassword(), "Quarto Premium");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }
    
    

    private void verificarSenha() {
        System.out.println("Digite o nome do usuário:");
        String nomeTeste = scanner.nextLine();
        System.out.println("Digite a senha a ser testada:");
        String senhaTeste = scanner.nextLine();
        if (clienteLogado != null && nomeTeste != null && senhaTeste != null) {
            boolean passwordMatch = clienteLogado.passwordCheck(senhaTeste, nomeTeste);
            System.out.println("Senha está correta? " + passwordMatch);
        } else {
            System.out.println("Erro: Cliente ou dados de entrada são nulos");
        }
    }

    private  void fazerCheckout() {
        if (clienteLogado == null) {
            System.out.println("Por favor, faça o login primeiro.");
            return;
        }
        Quarto quartoReservado = clienteLogado.getQuartoReservado();
        if (quartoReservado != null) {
            quartoReservado.checkout();
            System.out.println("Seu checkout foi realizado com sucesso " + clienteLogado.getNome());
            clienteLogado.setQuartoReservado(null);
        } else {
            System.out.println("Você não tem um quarto reservado para fazer o checkout.");
        }
    }

    private Cliente encontrarClientePorNome(String nomeUsuario) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nomeUsuario)) {
                return cliente;
            }
        }
        return null;
    }

    private  boolean nomeUsuarioExistente(String nomeUsuario) {
    for (Cliente cliente : clientes) {
        if (cliente.getNome().equals(nomeUsuario)) {
            return true;
        }
    }
    return false;
    }
}    