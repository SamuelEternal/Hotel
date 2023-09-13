import javax.swing.text.StyledEditorKit.BoldAction;

public class Cliente{
    private String nome_Cliente;
    private String cpf_Cliente;
    private String password;

    public Cliente(String nome_Cliente, String cpf_Cliente, String password){
        this.nome_Cliente = nome_Cliente;
        this.cpf_Cliente = cpf_Cliente;
        this.password = password;
    }
    public String getCpf(String nome_Cliente){
        return cpf_Cliente;
    }
    public String getNome(String cpf_Cliente){
        return nome_Cliente;
    }

    }
    public String getPassword(String nome_Cliente){
        return password;
    }
    public boolean passwordCheck(int password, String nome_Cliente){
        if(getPassword(nome_Cliente) = password){
            return true;
    }
        else{
            return false;
        }    
    public String reservarQuarto(int num_Quarto, String nome_Cliente){
        if(reservado(num_Quarto,nome_Cliente)){
            System.out.println("Quarto reservado com sucesso!");
        }
        else{
            System.out.println("Quarto já reservado!");
        }
    }
    private boolean checkPassword(String nome_Cliente, String password) {
        
        String storedPassword = getPassword(nome_Cliente);
        return storedPassword != null && storedPassword.equals(password);
    }
    } 
