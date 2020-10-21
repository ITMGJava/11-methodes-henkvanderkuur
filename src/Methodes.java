import java.util.Scanner;

public class Methodes {
    public static void main(String[] args) {
        helloWorld();
        groet();
        System.out.println();

        Scanner s = new Scanner(System.in);
        System.out.println("Wat is je naam? ");
        String naam = s.nextLine();
        groet(naam);

    }

    static void helloWorld() {
        System.out.println("Hello World");
    }

    static void groet() {
        System.out.println("Hallo, User");
    }

    //   static void groet(String naam){
    //       System.out.println("Dank je wel " +naam);


    static String groet(String naam) {
        System.out.println("Dank je wel " +naam);
    }

}



