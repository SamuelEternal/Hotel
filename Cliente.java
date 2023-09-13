import javax.swing.text.StyledEditorKit.BoldAction;

public class Cliente{
    private String nomeCliente;
    private String password;

    public Cliente(String nomeCliente, String password){
        this.nomeCliente = nomeCliente;
        this.password = password;
    }
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

    }
               
    public String reservarQuarto(int numQuarto, String nomeCliente){
        if(reservado(numQuarto,nomeCliente)){
            System.out.println("Quarto reservado com sucesso!");
        }
        else{
            System.out.println("Quarto já reservado!");
        }
    }


    private boolean checkPassword(String nomeCliente, String password) {
        
        String storedPassword = getPassword(nomeCliente);
        return storedPassword != null && storedPassword.equals(password);
    }
    }
} 
