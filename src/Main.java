import java.util.Objects;
import java.util.Scanner;
public class Main { // class Main
    public static void main(String[] args) // main()
    {
        Scanner in = new Scanner(System.in);
        String trash = "";                                           // String partyAffiliation
        System.out.print("Enter your affiliated party (D, R, I): "); // output "Enter your affiliated party (D,R,I): "
        String partyAffiliation = in.next();                         // input partyAffiliation
        if(partyAffiliation.equals("D"))                             // if partyAffiliation == "D"
                                                                     //     output ("You get a democratic donkey"
        {                                                            // else if partyAffiliation == "R"
                                                                        //     output ("You get a Republican elephant"
                                                                     // else if partyAffiliation == "I"
                                                                    //     output ("You get a democratic donkey"
                                                                    // else
                                                                   //     output ("You get other")

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
    } // return()
} //end class