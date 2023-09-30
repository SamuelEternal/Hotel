# Sistema de Hotel 🕋

### Descrição do projeto 📝💻
O presente trabalho envolve a hospitalidade e a gestão hoteleira, com foco no desenvolvimento de um sistema de hotel. O projeto visa criar um software que tem como objetivo o desenvolvimento de um sistema e permitirá que os hóspedes façam reservas online, escolham quartos com base em disponibilidade, comodidades e efetuem check-ins e check-outs de forma rápida e conveniente. 

### Justificativa

A gestão eficiente de hotéis desempenha um papel crucial na indústria de turismo e hospitalidade, que é um dos incentivadores da economia em muitos países. Ademais, um sistema de hotel bem projetado garante uma excelente experiência dos hóspedes, assim como, aumenta a eficiência operacional do hotel, maximizando receita e contribuindo para a sustentabilidade financeira dos hotéis. Outrossim, esse cenário vem em constante evolução tecnológica que desempenha um papel cada vez mais importante nas viagens e reservas, investir em um sistema de gestão hoteleira é essencial para a competitividade  e para garantir o sucesso na indústria.

### Objetivos

O sistema de hotel tem como objetivo melhorar a experiência tanto para os hóspedes quanto para a equipe do hotel, otimizando processos e oferecendo um serviço de alta qualidade. Além disso, o sistema manterá um registro completo de todos os quartos disponíveis, suas características e preços, garantindo que cada hóspede encontre a acomodação.


# Documentação do projeto
/**
 * Classe que representa um Cliente do hotel.
 */
public class Cliente {
    // ... (Atributos da classe)

    /**
     * Construtor da classe Cliente.
     *
     * @param nomeCliente O nome do cliente.
     * @param password A senha do cliente.
     */
    public Cliente(String nomeCliente, String password) {
        // Implementação do construtor
    }

    /**
     * Obtém o nome do cliente.
     *
     * @return O nome do cliente.
     */
    public String getNome() {
        // Implementação do método getNome
    }

    /**
     * Define um novo nome para o cliente.
     *
     * @param nomeNovo O novo nome do cliente.
     */
    public void setNome(String nomeNovo) {
        // Implementação do método setNome
    }

    /**
     * Obtém a senha do cliente.
     *
     * @return A senha do cliente.
     */
    public String getPassword() {
        // Implementação do método getPassword
    }

    /**
     * Define uma nova senha para o cliente.
     *
     * @param senhaNova A nova senha do cliente.
     */
    public void setPassword(String senhaNova) {
        // Implementação do método setPassword
    }

    /**
     * Obtém o quarto reservado pelo cliente.
     *
     * @return O objeto Quarto reservado pelo cliente, ou null se nenhum quarto foi reservado.
     */
    public Quarto getQuartoReservado() {
        // Implementação do método getQuartoReservado
    }

    /**
     * Define o quarto reservado pelo cliente.
     *
     * @param quartoReservado O objeto Quarto a ser reservado pelo cliente.
     */
    public void setQuartoReservado(Quarto quartoReservado) {
        // Implementação do método setQuartoReservado
    }

    /**
     * Reserva um quarto para o cliente.
     *
     * Este método permite que um cliente reserve um quarto do hotel.
     * Ele verifica se o quarto está disponível, se a senha do cliente está correta
     * e se o quarto já não foi reservado anteriormente pelo mesmo cliente. Se todas
     * as condições forem atendidas, a reserva é feita com sucesso.
     *
     * @param quarto O objeto do tipo Quarto a ser reservado.
     * @param nomeCliente O nome do cliente que está fazendo a reserva.
     * @param password A senha do cliente para verificar a autenticidade.
     * @param tipoQuarto Uma string que indica o tipo de quarto a ser reservado (ex: "Quarto Comum").
     *
     * @throws QuartoOcupadoException Se o quarto já estiver ocupado por outro cliente.
     * @throws SenhaIncorretaException Se a senha do cliente estiver incorreta.
     * @throws QuartoReservadoException Se o quarto já estiver reservado pelo mesmo cliente.
     */
    public void reservarQuarto(Quarto quarto, String nomeCliente, String password, String tipoQuarto) {
        // Implementação do método reservarQuarto
    }

    /**
     * Verifica se a senha fornecida corresponde à senha do cliente.
     *
     * @param password A senha a ser verificada.
     * @param nomeCliente O nome do cliente para o qual a senha deve ser verificada.
     * @return true se a senha for correta para o cliente especificado, false caso contrário.
     */
    public boolean passwordCheck(String password, String nomeCliente) {
        // Implementação do método passwordCheck
    }
}


### Apresentação

https://youtu.be/Z2tVUbGYYMg
