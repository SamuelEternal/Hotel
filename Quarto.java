class Quarto {
    private int numQuarto;
    private boolean statusQuarto = false;

    public Quarto(int numQuarto, boolean statusQuarto) {
        this.numQuarto = numQuarto;
        this.statusQuarto = statusQuarto;
    }

    public boolean reservado(int numQuarto, String nome_Cliente) {
        if (!this.statusQuarto) {
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
