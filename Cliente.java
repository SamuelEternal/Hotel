
public class Cliente{
    private String nomeCliente;
    private String password;

// construtor de cliente
    public Cliente(String nomeCliente, String password){
        this.nomeCliente = nomeCliente;
        this.password = password;
    }
// gets e sets
    public String getNome(){
        return nomeCliente;
    }
    public void setNome(String nomeNovo){
        this.nomeCliente = nomeNovo;
    }
    String getPassword(){
        return password;
    }
    public void setPassword(String senhaNova){
        this.password = senhaNova;
    }
               // EM TESTES
    public boolean reservarQuarto(Quarto quarto, String nomeCliente, String password, String tipoQuarto) {
        if (!quarto.getStatus()) {
            if (passwordCheck(password, nomeCliente) && quarto.reservado(quarto.getNumero(), nomeCliente)) {
                System.out.println(tipoQuarto + " reservado com sucesso para " + nomeCliente);
                System.out.println("Preço da diária: " + quarto.getPrecoDiaria());
                System.out.println("Comodidades: " + quarto.getComodidades());
                return true;
            } else {
                System.out.println(tipoQuarto + " reservado anteriormente, tente novamente.");

            }
        } else {
            System.out.println("O quarto " + quarto.getNumero() + " já está ocupado");
        }
        return false;
    }

    public boolean passwordCheck(String password, String nome_Cliente){
        return getPassword().equals(password);
    }
}
   



