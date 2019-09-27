import java.util.Scanner;

public class UserNumber {

    static int number;
    static int guess = 1;

    /*
    Vi får brugeren til at vælge et tal og sætter det tal som variable til number
     */
    public static void pickNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("Nu ændre vi lidt på det...");
        System.out.println("Du skal skrive et tal mellem 1-10");
        System.out.println("Så vil jeg forsøge at gætte det!");
        System.out.println("******************************");
        System.out.print("Skriv det tal du vil have jeg skal gætte: ");
        number = scanner.nextInt();
    }

    /*
    Computeren forsøger at gætte tallet som brugeren har skrevet med et lille delay i koden på 1 sekund for hver
    gang der bliver gættet på et tal
     */
    public static void guessNumber() {
        while (number != guess) {
            System.out.println("Jeg gætter på at dit tal er: " + guess);
            if (number != guess)
                System.out.println("Satans! Dit tal var ikke " + guess);
            try { //Vi forsøger at kaste en Thread.sleep i programmet som laver en kort pause på 1 sekund
                Thread.sleep(1000);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            guess++;
        }

            if (number == guess)
                System.out.println("Hah! Jeg gættede dit tal det var " + number + " Noob!");

    }
}
