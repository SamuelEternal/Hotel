class Quarto {
    protected int num_Quarto;
    protected boolean status_quarto;

    public Quarto(int num_Quarto) {
        this.num_Quarto = num_Quarto;
        this.status_quarto = false // O quarto começa como vago
    }

    public boolean reservado(int num_Quarto, String nome_Cliente) {
        if (!this.status_quarto) {
            status_quarto = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean getStatus() {
        return status_quarto;
    }

    public void checkIn(String nomeCliente, int num_Quarto) {
        if (!this.status_quarto) {
            System.out.println("Check-in no quarto " + num_Quarto + " realizado com sucesso");
            status_quarto = true;
        } else {
            System.out.println("O quarto " + num_Quarto + " já está ocupado.");
        }
    }
}
