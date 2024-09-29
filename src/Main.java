import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        System.out.print("Enter your affiliated party (D, R, I): ");
        String partyAffiliation = in.next();
        if(partyAffiliation.equals("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if(partyAffiliation.equals("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if(partyAffiliation.equals("I"))
        {
            System.out.println("You get an Independent Man");
        }
        else
        {
            System.out.println("You get other");
        }
    }
}