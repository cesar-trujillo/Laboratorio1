import Billetera.BilleteraParque;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BilleteraParque billetera1 = new BilleteraParque(100);
        Scanner scaner = new Scanner(System.in);
        int opcion;
        int cantidad;
        int premio;
        
        do {
            System.out.println("\n");
            System.out.println("==Administrador de billeteras para parques temáticos==");
            System.out.println("1.- Agregar tickets");
            System.out.println("2.- Establecer tickets");
            System.out.println("3.- Comprar premio");
            System.out.println("4.- Establecer festivo");
            System.out.println("5.- Salir");
            System.out.println("Tu billetera tiene: " + billetera1.getTickets() + " boletos");
            System.out.println("Ingrese la opcion: ");
            opcion = scaner.nextInt(); 

            scaner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    System.out.println("¿Cuántos boletos se agregan?");
                    cantidad = scaner.nextInt();
                    billetera1.agregarTickets(cantidad);

                    scaner.nextLine();
                    break;

                case 2:
                    System.out.println("Establecer saldo de tickets en:");
                    cantidad = scaner.nextInt();
                    billetera1.setTickets(cantidad);

                    scaner.nextLine();
                    break;

                case 3:
                    if(BilleteraParque.getFestivo() == true){
                    System.out.println("\n");
                    System.out.println("1. Camiseta (75 tickets)");
                    System.out.println("2. Sombrero (175 tickets)");
                    System.out.println("3. Tenis (300 tickets)");
                    System.out.println("¿Qué premio desea comprar?");

                    premio = scaner.nextInt();
                        switch (premio) {
                            case 1:
                                if(billetera1.getTickets() >= 75){
                                    billetera1.removerTickets(75);
                                    System.out.println("su compra se realizó correctamente\n");
                                }else{
                                    System.out.println("No tiene suficientes tickets para comprar la camisa\n");
                                }
                                
                                break;

                            case 2:
                                if(billetera1.getTickets() >= 175){
                                    billetera1.removerTickets(175);
                                    System.out.println("su compra se realizó correctamente\n");
                                }else{
                                    System.out.println("No tiene suficientes tickets para comprar el sombrero\n");
                                }
                                
                                break;

                            case 3:
                                if(billetera1.getTickets() >= 300){
                                    billetera1.removerTickets(300);
                                    System.out.println("su compra se realizó correctamente\n");
                                }else{
                                    System.out.println("No tiene suficientes tickets para comprar los tenis\n");
                                }
                                
                                break;
                        
                            default: System.out.println("opcion incorrecta\n");
                            break;
                        }
                    }else{
                    System.out.println("\n");
                    System.out.println("1. Camiseta (150 tickets)");
                    System.out.println("2. Sombrero (350 tickets)");
                    System.out.println("3. Tenis (600 tickets)");
                    System.out.println("¿Qué premio desea comprar?");

                    premio = scaner.nextInt();
                        switch (premio) {
                            case 1:
                                if(billetera1.getTickets() >= 150){
                                    billetera1.removerTickets(150);
                                    System.out.println("su compra se realizó correctamente\n");
                                }else{
                                    System.out.println("No tiene suficientes tickets para comprar la camisa\n");
                                }
                                
                                break;

                            case 2:
                                if(billetera1.getTickets() >= 350){
                                    billetera1.removerTickets(350);
                                    System.out.println("su compra se realizó correctamente\n");
                                }else{
                                    System.out.println("No tiene suficientes tickets para comprar el sombrero\n");
                                }
                                
                                break;

                            case 3:
                                if(billetera1.getTickets() >= 600){
                                    billetera1.removerTickets(600);
                                    System.out.println("su compra se realizó correctamente\n");
                                }else{
                                    System.out.println("No tiene suficientes tickets para comprar los tenis\n");
                                }
                                
                                break;
                        
                            default: System.out.println("opcion incorrecta\n");
                            break;
                        }

                    }

                    break;

                case 4:
                    BilleteraParque.setFestivo();
                    System.out.println("Ahora es un dia festivo\n");

                    break;

                case 5:
                    System.out.println("Saliendo del programa...\n");

                break;

                default:
                System.out.println("Opcion incorrecta\n");
                    break;
            }

        } while (opcion != 5);

        scaner.close();
    }
}


