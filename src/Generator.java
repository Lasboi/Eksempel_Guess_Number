import java.util.Scanner;

public class Generator {

    static int number;
    static int guess;

    /*
    Vi generere et tilfældigt tal mellem 1-10
     */
    public static void setup() {
        number = (int) (Math.random() * 10 + 1);
        System.out.println("******************************");
        System.out.println("Du skal nu gætte et tal mellem 1-10!");
        System.out.println("******************************");
    }

    /*
    Vi beder brugeren om at gætte det tal som er blevet genereret
     */
    public static void guessLoop() {
        Scanner scanner = new Scanner(System.in);

        while (number != guess) {
            System.out.print("Hvilket tal tror du jeg tænker på?: ");
            guess = scanner.nextInt();
            if (number == guess) {
                System.out.println("Det er korrekt! Tallet var " + number);
                System.out.println("******************************");
            }
            else if (number < 0 || number > 10) {
                System.out.println("Din dumpap... Jeg skrev tallet var mellem 1-10...");
            }
            else {
                for (int i = 0; i < 20; ++i) System.out.println();
                System.out.println("Det er desværre forkert. Tallet var ikke " + guess);
                System.out.println("******************************");
            }
        }
    }

    static void madeBy() {
        System.out.println("");
        System.out.println("******************************");
        System.out.println("******* Kodet af Lasse *******");
        System.out.println("******************************");
    }

}
