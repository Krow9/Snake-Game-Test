import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Gstatus = "Inizalizing";
        String Input = "A";
        System.out.println(Gstatus);

        System.out.println("Ready?");
        Input = input.next();
            String Gstatus = "Running";
            System.out.println(Gstatus);
        
        while (Input.equals("yes")) {
            System.out.println("");
    }
}
