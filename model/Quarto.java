package model;
import exception.QuartoReservadoException;


public class Quarto {
    protected int numQuarto;
    protected boolean statusQuarto;
    protected String nomeReserva;
    protected double precoDiaria;
    protected String comodidades;

    //construtor de quarto
    public Quarto(int numQuarto, double precoDiaria, String comodidades) {
        this.numQuarto = numQuarto;
        this.statusQuarto = false;
        this.nomeReserva = "";
        this.precoDiaria = precoDiaria;
        this.comodidades = comodidades;

    }


    public int getNumero() {
        return numQuarto;
    }



    public boolean getStatus() {
        return statusQuarto;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public String getComodidades() {
        return comodidades;
    }

    // checkout tem que restaurar o objeto ao estado que ele estava antes de ser reservado

    protected boolean reservado(String nomeCliente) throws QuartoReservadoException {
        if (!statusQuarto) {
            nomeReserva = nomeCliente;
            statusQuarto = true;
            System.out.println("Quarto " + numQuarto + " reservado para " + nomeCliente);
            return true;
        } else {
            throw new QuartoReservadoException("O quarto " + numQuarto + " já está ocupado.");
        }
    }

    public void checkout() {
        if (statusQuarto) {
            // Realize o checkout, marcando o quarto como não reservado
            statusQuarto = false;
            nomeReserva = "";
            System.out.println("Checkout realizado com sucesso.");
        } else {
            System.out.println("Este quarto já está liberado.");
        }
    }

}

