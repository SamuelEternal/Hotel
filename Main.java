import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

class Quarto{
    protected int num_Quarto;
    protected Boolean status_quarto = false;

    public Quarto(int num_Quarto, boolean status_quarto){
        this.num_Quarto = num_Quarto;
        this.status_quarto = status_quarto;

    }

    public boolean reservado(int num_Quarto,String cpf_Cliente){
        if(status_quarto != true){
            return true;
        }
        else{
            return false;
        }
    public boolean getStatus(int num_Quarto){
        return status_quarto; // precisamos trabalhar nessas funções de reserva e de checkar status dos quartos (ocupado/vago)
    }
        

    }

}


class Employee{
    String name_Employee;
    int id_Employee;
    String job;

    public Employee(String name_Employee, int id_Employee, String job){
        this.name_Employee = name_Employee;
        this.id_Employee = id_Employee;
        this.job = job;
    }


}

class Cliente{
    String nome_Cliente;
    String cpf_Cliente;
    String password;

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
    public String getPassword(String nome_Cliente){
        return password;
    }
    public String reservar_Quarto(int num_Quarto, String cpf_Cliente){
        //terminar função de reservas chamando outra função de quarto
        


    }
    private boolean checkPassword(String nomeCliente, String password) {
    String storedPassword = getPassword(nomeCliente);
    return storedPassword != null && storedPassword.equals(password);
    }
    }

class Normal{

}
class Gold{

}
class Premium{

}



public class Main{
    public static void main(String[] args){

    }
}