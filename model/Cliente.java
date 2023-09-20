package model;
import exception.QuartoOcupadoException;
import exception.QuartoReservadoException;
import exception.SenhaIncorretaException;

public class Cliente{
    private String nomeCliente;
    private String password;
    private Quarto quartoReservado;

// construtor de cliente
    public Cliente(String nomeCliente, String password){
        this.nomeCliente = nomeCliente;
        this.password = password;
        this.quartoReservado = null;
    }
// gets e sets
    public String getNome(){
        return nomeCliente;
    }
    public void setNome(String nomeNovo){
        this.nomeCliente = nomeNovo;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String senhaNova){
        this.password = senhaNova;
    }

    public Quarto getQuartoReservado() {
        return quartoReservado;
    }

    public void setQuartoReservado(Quarto quartoReservado) {
        this.quartoReservado = quartoReservado;
    }

    public void reservarQuarto(Quarto quarto, String nomeCliente, String password, String tipoQuarto) {
        try {
            if (quarto.getStatus()) {
                throw new QuartoOcupadoException("O quarto " + quarto.getNumero() + " já está ocupado");
            }

            if (!passwordCheck(password, nomeCliente)) {
                throw new SenhaIncorretaException("Senha incorreta.");
            }

            boolean reservadoComSucesso = quarto.reservado(nomeCliente);
            if (reservadoComSucesso) {
                setQuartoReservado(quarto);
                System.out.println(tipoQuarto + " reservado com sucesso para " + nomeCliente);
                System.out.println("Preço da diária: " + quarto.getPrecoDiaria());
                System.out.println("Comodidades: " + quarto.getComodidades());
            } else {
                System.out.println(tipoQuarto + " reservado anteriormente, tente novamente.");
            }
        } catch (QuartoOcupadoException | SenhaIncorretaException | QuartoReservadoException e) {
            System.out.println(e.getMessage());
        }
    }



    public boolean passwordCheck(String password, String nomeCliente){
            if(getNome().equals(nomeCliente)){
                return getPassword().equals(password);
            }else{
                return false;
            }
        }
    }
    


