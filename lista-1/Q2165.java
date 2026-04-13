import java.util.Scanner;

public class Q2165 {

    public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);

         System.out.println("Faça um tweet: ");

         String T = input.nextLine();

         input.close();

         if(T.length() <= 140) {
            System.out.println("TWEET");
         }
         else {
            System.out.println("MUTE");
         }
    }
}