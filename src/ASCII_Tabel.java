import java.util.Scanner;
public class ASCII_Tabel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String s = scanner.next();
        // char c = s.CharAt(0);
        // System.out.println(c);

        while (true) {

            String s = scanner.next();
            if (s.equals("exit")) {
                break;
            }
            char c = s.charAt(0);

            if (c >= 65 && c <= 90) {
                System.out.println("Tegnet er et stort bogstav");
            } else if (c >= 97 && c <= 122) {
                System.out.println("Tegnet er et lille bogstav");
            } else if (c >= 48 && c <= 57) {
                System.out.println("Tegnet er et tal\" for 0-9 ");
            } else if (c == 33 || c == 35 || c = 43 || c = 92) {
                System.out.println("Tegnet er et af de 4 specieltegn");
                else{
                    System.out.println("Tegnet er ikke kendt af dette program");
                    System.out.println("Jeg elsker cacomilk");
                    System.out.println("ja, det er meget dejligt");
                }
                System.out.println("stop med at drikke så meget cacomilk");
            }
        }
    }
}
