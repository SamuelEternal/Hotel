import java.util.ArrayList;
import java.util.Scanner;

class Quarto{
    String num_Quarto;
    String cpf_Cliente;

}

class Suite extends Quarto{


}

class King extends Quarto{

}

class Queen extends King{

}

class Funcionario{
    String nome_Funcionario;
    int id_Funcionario;
    String função;
}

class Cliente{
    String nome_Cliente;
    String cpf_Cliente;

    public Cliente(String nome_Cliente, String cpf_Cliente){
        this.nome_Cliente = nome_Cliente;
        this.cpf_Cliente = cpf_Cliente;
    }
    public String get_cpf(String nome_Cliente){
        return cpf_Cliente;
    }
    public String get_Nome(String cpf_Cliente){
        return nome_Cliente;
    }
    public String reservar_Quarto(String tipo_Quarto){
        return tipo_Quarto; // temporario


    }
    
}

public class Main{
    public static void main(String[] args){

    }
}