import java.util.Scanner;
public class StringAssignment {
    public static void main (String[] args){
        String name = "David Kim";
        System.out.println("My name is: " + name);

        Scanner keybd = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keybd.nextLine();
        System.out.println("Your name is: " + name);

    }
}
