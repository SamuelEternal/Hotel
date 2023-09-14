import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = null;

        QuartoComum quartoComum = new QuartoComum(204);
        QuartoPremium quartoPremium = new QuartoPremium(205);

        while (true) {
            System.out.println("Bem-vindo ao Sistema de Reservas de Hotel");
            System.out.println("1. Fazer login");
            System.out.println("2. Ver quartos disponíveis");
            System.out.println("3. Sair");
            System.out.print("Por favor, escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (escolha) {
                case 1 -> {
                    System.out.print("Digite seu nome de usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Digite sua senha: ");
                    String senha = scanner.nextLine();
                    cliente = new Cliente(nomeUsuario, senha);
                    System.out.println("Conectado como " + cliente.getNome());
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
                    System.out.println("Até logo!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }
    }
}
