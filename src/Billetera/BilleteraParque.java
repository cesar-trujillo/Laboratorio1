package Billetera;

public class BilleteraParque {
    private int tickets;
    private static boolean festivo = false;

    //constructores
    public BilleteraParque(){
        this.tickets = 0;
    }

    public BilleteraParque(int tickets){
        this.tickets = tickets;
    }

    //getter y setter tickets
    public int getTickets(){
        return this.tickets;
    }

    public void setTickets(int cantidad){
        this.tickets += cantidad;
    }

    //getter y setter festivo
    public static boolean getFestivo(){
        return festivo;
    }

    public static void setFestivo(){
         if(festivo = false){
            festivo = true;
        }else{
            festivo = false;
        }
    }

    public void agregarTickets(int cantidad){
        if(cantidad > 0){
            setTickets(cantidad);
        }
    }
  
}
