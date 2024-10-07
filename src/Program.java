import java.util.Scanner;

public class Program {

    public void Vegrehajt() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem az e átló értékét: ");
        String e_raw = scanner.nextLine();
        Double e = Double.parseDouble(e_raw);
        System.out.print("Kérem az f átló értékét: ");
        String f_raw = scanner.nextLine();
        Double f = Double.parseDouble(f_raw);
        scanner.close();

        Rombusz rombusz = new Rombusz();
        Double T = rombusz.Terulet(e, f);
        System.out.println("A rombusz területe: " + T);

    }

}
