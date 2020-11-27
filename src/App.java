import java.util.Scanner;

/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name :");
        String name = sc.next();
        System.out.print("Customer Email :");
        String email = sc.next();
        //System.out.println(name+email);

        ServicePrice sp = new ServicePrice();
        sp.displayService();
        int choose = sc.nextInt();
        System.out.println(choose);
    }
}
