//Ameer Ahmed

import java.util.Scanner;

public class Madlibs {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        String name1;
        System.out.println(" Please enter a name. ");
        name1 = scanner.next();

        String adjective1;
        System.out.println(" Please enter an adjective. ");
        adjective1 = scanner.next();

        String adjective2;
        System.out.println(" Please enter another adjective. ");
        adjective2 = scanner.next();

        String noun1;
        System.out.println(" Please enter a noun. ");
        noun1 = scanner.next();

        String noun2;
        System.out.println(" Please enter another noun. ");
        noun2 = scanner.next();

        String verb1;
        System.out.println(" Please enter a verb. ");
        verb1 = scanner.next();

        String noun3;
        System.out.println(" Please enter a noun. ");
        noun3 = scanner.next();

        String noun4;
        System.out.println(" Please enter another noun. ");
        noun4 = scanner.next();

        String adjective3;
        System.out.println(" Please enter an adjective. ");
        adjective3 = scanner.next();

        String name2;
        System.out.println(" Please enter a name. ");
        name2 = scanner.next();

        String place1;
        System.out.println(" Please enter a place. ");
        place1 = scanner.next();

        String noun5;
        System.out.println(" Please enter a noun. ");
        noun5 = scanner.next();

        int number;
        System.out.println(" Please enter a year. ");
        number = scanner.nextInt();

        String noun6;
        System.out.println(" Please enter a noun. ");
        noun6 = scanner.next();

        System.out.print("This morning " + name1 + " woke up feeling " 
            + adjective1 + "." + " It is going to be a " + adjective2 + " day!"
            + " Outside a bunch of " + noun1 + "s were protesting to keep " 
            + noun2 + " in stores. They began to " + verb1 + " to the rhythm of" 
            + " the " + noun3 + ", which made all the " + noun4 +"s very " 
            + adjective3 + ". Concerned, " + name1 + " texted " + name2 + 
            ", who flew " +name1 +" to "+place1+" and dropped " + name1 
            + " in a puddle of frozen " +noun5+ "." + name1 +" woke up in the "
            + "year " +number+ ", in a world where " +noun6+ "s ruled the world.");

    }
}