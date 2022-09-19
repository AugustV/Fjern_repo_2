import java.util.Scanner;
import java.lang.Math.*;
public class Password {
    public static void main(String[] args) {
        Scanner Password = new Scanner(System.in);
        System.out.print("Skriv dit Password");
        String password = Password.nextLine();
        System.out.println("Din kode er");
        System.out.println(password);

        int length = password.length();
        System.out.println(length);
        if(length>=9) {
            System.out.println ("din kode er for lang");
        } else if (length >=4&&length<=9){
            // hvis man ønsker at finde noget i intervallet mellem 2 tal.
            // kan man benytte sig af && tegne, men husk at bruge length hvergang.
            System.out.println("god kode");
        } else if (length < 4) {
            System.out.println ("koden er for kort");
        } System.out.prinln("hej drenge!");
         



    }
}

// jaja
