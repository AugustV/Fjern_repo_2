import java.util.Scanner;
public class Afstand_mellem_linje_og_punkt {
    public static void main(String[] args) {

        {
            Scanner scan = new Scanner (System.in);
            System.out.println("a, b og dine kordinater fra ligningen");
            int a, b , y_0 , x_0;
            // Nu fortæller jeg maskinen at den skal huske på disse tal
            a = scan.nextInt();
            b = scan.nextInt();
            y_0 = scan.nextInt();
            x_0 = scan.nextInt();

            // Her skrives dobbel, grundet at der ikke kan skrives negative tal i int. derved skriver vi i dobbel.
            // Math.abs = abolutte tal . Math.sqrt = kvadratrod . Math.pow = når man ønsker at sætte et tal i ^2 (eller andet)

            double distance = Math.abs(a * x_0 - y_0 + b ) / Math.sqrt(1+Math.pow(a,2));
            System.out.println (distance);


        }
    }
}
