class Quarto {
    protected int numQuarto;
    protected boolean statusQuarto;
    protected String nomeReserva;
    protected double precoDiaria;
    protected String comodidades;

//construtor de quarto
    public Quarto(int numQuarto, double precoDiaria, String comodidades, boolean statusQuarto, String nomeReserva) {
        this.numQuarto = numQuarto;
        this.statusQuarto = false;
        this.nomeReserva = "";
        this.precoDiaria = precoDiaria;
        this.comodidades = comodidades;

    }
    public int getNumero(){
        return numQuarto;
    }
       
   protected boolean reservado(int numQuarto, String nomeCliente) {
       if (!statusQuarto) {
           this.numQuarto = numQuarto;  // Assign the room number
           nomeReserva = nomeCliente;
           statusQuarto = true;
           System.out.println("Quarto " + numQuarto + " reservado para " + nomeCliente);
           return true;
       } else {
           System.out.println("O quarto " + numQuarto + " já está ocupado.");
           return false;
       }
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
    public void checkout(Quarto quarto, String nomeCliente, String password){
        
    }
}

