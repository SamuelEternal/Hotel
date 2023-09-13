
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
    private String getPassword(){
        return password;
    }
    public void setPassword(String senhaNova){
        this.password = senhaNova;
    }
               // EM TESTES
    public boolean reservarQuarto(Quarto quarto, String nomeCliente, String password){
        if(passwordCheck(password, nomeCliente) && quarto.reservado(quarto.getNumero(), nomeCliente)){
            System.out.println("quarto reservado com sucesso!!");
            return true;
        }
        else{
            System.out.println("Quarto reservado anteriormente, tente novamente.");
            return false;

        }

        
    }
    public boolean passwordCheck(String password, String nome_Cliente){
        return getPassword().equals(password);
    }
}
   



