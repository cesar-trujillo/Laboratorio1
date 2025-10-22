import Billetera.BilleteraParque;

public class App {
    public static void main(String[] args) throws Exception {
        BilleteraParque bill1 = new BilleteraParque(14);
        bill1.agregarTickets(5);
        System.out.println(bill1.getTickets());
    }
}
