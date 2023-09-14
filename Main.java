
public class Main {
    public static void main(String[] args) {
        // Create instances of QuartoComum and QuartoPremium
        QuartoComum quartoComum = new QuartoComum(204);
        QuartoPremium quartoPremium = new QuartoPremium(204);

        // Create clients
        Cliente cliente1 = new Cliente("José", "senha123");
        Cliente cliente2 = new Cliente("Pedro", "batata");

        // Reserve rooms using the Cliente class
        cliente1.reservarQuarto(quartoComum, cliente1.getNome(), "senha123", "Quarto Comum");
        cliente2.reservarQuarto(quartoPremium, cliente2.getNome(), "batata", "Quarto Premium");


        // Print the status of the rooms
        System.out.println("Status of Quarto 204: " + quartoComum.getStatus());
        System.out.println("Status of Quarto 205: " + quartoPremium.getStatus());
    }
}
