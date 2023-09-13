class Quarto {
    protected int numQuarto;
    protected boolean statusQuarto;
    protected String nomeReserva;
//construtor de quarto
    public Quarto(int numQuarto, boolean statusQuarto, String nomeReserva) {
        this.numQuarto = numQuarto;
        this.statusQuarto = false;
        this.nomeReserva = "";
    }
    public int getNumero(){
        return numQuarto;
    }
        // EM TESTES
    public boolean reservado(int numQuarto, String nome_Cliente) {
        if (nome_Cliente != nomeReserva) {
            this.nomeReserva = nome_Cliente;
            statusQuarto = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean getStatus() {
        return statusQuarto;
    }

    public void checkIn(String nomeCliente, int numQuarto) {
        if (!this.statusQuarto) {
            System.out.println("Check-in no quarto " + numQuarto + " realizado com sucesso");
            statusQuarto = true;
        } else {
            System.out.println("O quarto " + numQuarto + " já está ocupado.");
        }
    }
}
