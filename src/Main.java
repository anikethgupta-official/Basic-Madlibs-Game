import java.util.Scanner;

        public class Main{

            public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter Your Name: ");
                String name = scanner.nextLine();
        System.out.println("Hi " + name + " !\nWelcome To My Basic Game Of Madlibs!");

        System.out.println(" ");

        System.out.print("Enter An Adjective: ");
        String adjective1 = scanner.nextLine();

        System.out.println(" ");

        System.out.print("Enter An Adjective Again: ");
        String adjective2 = scanner.nextLine();

        System.out.println(" ");

        System.out.print("Enter Any Type Of Bird: ");
        String typeofbird1 = scanner.nextLine();

        System.out.println(" ");

        System.out.println("Woah " + name + " ! You're Fantastic");

        System.out.println(" ");

        System.out.print("Enter Any Room In The House: ");
        String roominahouse1 = scanner.nextLine();

        System.out.println(" ");

        System.out.print("Enter A Verb (Past Tense): ");
        String verbpasttense1 = scanner.nextLine();

        System.out.println(" ");

        System.out.print("Enter A Verb: ");
        String verb1 = scanner.nextLine();

        System.out.println(" ");

        System.out.println("Woah " + name + " ! You're Going Great");

        System.out.println(" ");

        System.out.print("Enter The Name Of Any Realative: ");
        String relativename1 = scanner.nextLine();

        System.out.println(" ");

        System.out.print("Enter A Noun: ");
        String noun1 = scanner.nextLine();

        System.out.println(" ");

        System.out.print("Enter Any Liquid: ");
        String liquid1 = scanner.nextLine();

        System.out.println(" ");

        System.out.println("Woah " + name + " ! You're Excellent");

        System.out.println(" ");

        System.out.print("Enter A Vern (Ing): ");
        String verbing1 = scanner.nextLine();

        System.out.println(" ");

        System.out.print("Enter A Part Of The Body (In Plural): ");
        String bodypart1 = scanner.nextLine();

        System.out.println(" ");

        System.out.print("Enter A Plural Noun: ");
        String pluralnoun1 = scanner.nextLine();

        System.out.println(" ");

        System.out.println("Woah " + name + " ! You're Awesome");

        System.out.println(" ");

        System.out.print("Enter A Vern (Ing): ");
        String verbing2 = scanner.nextLine();

        System.out.println(" ");

        System.out.print("Enter A Noun: ");
        String noun3 = scanner.nextLine();

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Thank You " + name + " ! For Your Patience And Efforts!\nHere I Present You A Madlibs :)");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("It was a " + adjective1 + " ,cold November day.I");
        System.out.println("woke up to the " + adjective2 + " smell of " + typeofbird1);
        System.out.println("roasting in the " + roominahouse1 + " downstairs.I");
        System.out.println(verbpasttense1 + " down the stairs to see if I could");
        System.out.println("help " + verb1 + " the dinner.My mom said,");
        System.out.println("\"see if " + relativename1 + " needs a fresh " + noun1 + ".\"So I");
        System.out.println("carried a tray of glasses full of " + liquid1 + " into");
        System.out.println("the " + verbing1 + " room.When I got there,I");
        System.out.println("could'nt believe my " + bodypart1 + "!There were");
        System.out.println(pluralnoun1 + " " + verbing2 + " on the " + noun3 + "!");

        scanner.close();
    }
}