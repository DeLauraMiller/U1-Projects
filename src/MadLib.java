import jdk.nashorn.internal.scripts.JO;

import java.sql.SQLOutput;
import java.util.Scanner;
public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String noun;
        String pNoun;
        String noun2;
        String place;
        String adj;
        String noun3;

        System.out.println("Enter a noun");
        noun = read.nextLine();

        System.out.println("Enter a plural noun");
        pNoun = read.nextLine();

        System.out.println("Enter a place");
        place = read.nextLine();

        System.out.println("Enter a adj");
        adj = read.nextLine();

        System.out.println("Enter another noun");
        noun3 =read.nextLine();

        System.out.println("LOOK there's a " + noun + ", it's the most hunted " + noun + " in the world!");
        System.out.println("This " + noun + " created the most gnarly " + pNoun + " as its protection against those hunters.");
        System.out.println("The " + noun + " resides in " + place);
        System.out.println("Beware " + place  +  " is the most " + adj + " place you'll ever see!");
        System.out.println("The final " + noun3 + " is the hardest obstacle to find the " + noun);
        System.out.println("Good luck hunter!");


    }
}