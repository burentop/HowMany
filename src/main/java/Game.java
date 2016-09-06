import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String item = "";
        int capacity = 0;

        System.out.println("ADMINISTRATOR SETUP");
        System.out.println("=====================");
        System.out.print("Name of the items in the jar: ");
        item = in.nextLine();
        System.out.print("Maximum number of " + item +
                                    " in the jar: ");
        capacity = in.nextInt();

        Jar jar = new Jar(item, capacity);

        System.out.println("PLAYER");
        System.out.println("=======================");
        System.out.println("Your goal is to guess how many " + item +
                           " are in the jar. Your guess should be between" +
                           " 1 and " + capacity + ".");
        System.out.println();

        jar.setInJar();

        int guess = 0;
        int guesses = 0;
        while (guess != jar.getInJar()) {
            System.out.print("Guess: ");
            guess = in.nextInt();
            guesses++;
        }
        System.out.println("Congratulations - you guessed that there are " + 
            jar.getInJar() + " " + jar.getItem() + " in the jar! It took you " 
            + guesses + " guess(es) to get it right.");
    }
}
