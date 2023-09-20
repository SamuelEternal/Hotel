import model.QuartoComum;
import model.QuartoPremium;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Cliente;
import model.Quarto;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = null;

        QuartoComum quartoComum = new QuartoComum(204);
        QuartoPremium quartoPremium = new QuartoPremium(205);

        while (true) {
            try {
                System.out.println("Bem-vindo ao Sistema de Reservas de Hotel");
                System.out.println("1. Fazer login");
                System.out.println("2. Ver quartos disponíveis");
                System.out.println("3. Verificar senha");
                System.out.println("4. Checkout");
                System.out.println("5. Sair");
                System.out.print("Por favor, escolha uma opção: ");

                int escolha = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (escolha) {
                    case 1 -> {
                        System.out.print("Digite seu nome de usuário: ");
                        String nomeUsuario = scanner.nextLine().trim();
                        System.out.print("Digite sua senha: ");
                        String senha = scanner.nextLine().trim(); // trim removes leading/trailing spaces
                        if (nomeUsuario.isEmpty() || senha.isEmpty()) {
                            System.out.println("Nome de usuário e senha são obrigatórios.");
                        } else {
                            cliente = new Cliente(nomeUsuario, senha);
                            System.out.println("Conectado como " + cliente.getNome());
                        }
                    }
                    case 2 -> {
                        if (cliente == null) {
                            System.out.println("Por favor, faça o login primeiro.");
                        } else {
                            System.out.println("Quartos Disponíveis:");
                            System.out.println("1. Quarto Comum (204)");
                            System.out.println("2. Quarto Premium (205)");
                            System.out.println("3. Voltar ao menu principal");
                            System.out.print("Selecione um tipo de quarto ou volte: ");
                            int escolhaQuarto = scanner.nextInt();
                            scanner.nextLine(); // Consumir a quebra de linha

                            switch (escolhaQuarto) {
                                case 1 ->
                                        cliente.reservarQuarto(quartoComum, cliente.getNome(), cliente.getPassword(), "Quarto Comum");
                                case 2 ->
                                        cliente.reservarQuarto(quartoPremium, cliente.getNome(), cliente.getPassword(), "Quarto Premium");
                                case 3 -> {
                                }
                                // Voltar para o menu principal
                                default -> System.out.println("Escolha inválida.");
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("Digite o nome do usuário:");
                        String nomeTeste = scanner.nextLine();
                        System.out.println("Digite a senha a ser testada:");
                        String senhaTeste = scanner.nextLine();
                        if (cliente != null && nomeTeste != null && senhaTeste != null) {
                            boolean passwordMatch = cliente.passwordCheck(senhaTeste, nomeTeste);
                            System.out.println("Senha está correta? " + passwordMatch);
                        } else {
                            System.out.println("Erro: Cliente ou dados de entrada são nulos");
                        }
                    }
                    case 4 -> {
                        if (cliente != null) {
                            Quarto quartoReservado = cliente.getQuartoReservado();
                            if (quartoReservado != null) {
                                quartoReservado.checkout();
                                System.out.println("Seu checkout foi realizado com sucesso " + cliente.getNome());
                                cliente.setQuartoReservado(null);
                            } else {
                                System.out.println("Você não tem um quarto reservado para fazer o checkout.");
                            }
                        } else {
                            System.out.println("Por favor, faça o login primeiro.");
                        }
                    }
                    case 5 -> {
                        System.out.println("Até logo!");
                        scanner.close();
                        System.exit(0);
                    }
                    default -> System.out.println("Escolha inválida. Por favor, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Escolha inválida. Por favor, insira um número válido.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }
}
