import javax.swing.text.StyledEditorKit.BoldAction;

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
               
    public String reservarQuarto(int numQuarto, String nomeCliente){
        // fazer do zero
    }
    public boolean passwordCheck(String password, String nome_Cliente){
        return getPassword().equals(password);
    }
   



