import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String item = "";
        int capacity = 0;

        System.out.println("ADMINISTRATOR SETUP");
        System.out.println("=====================");
        System.out.print("What type of item? ");
        item = in.nextLine();
      
        while (capacity < 1) {
          System.out.print("What is the maximum amount of " + item +"? ");
          capacity = in.nextInt();
        }

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
            System.out.print("How many " + item + "? (Between 1 and " + capacity + ") ");
            guess = in.nextInt();
            guesses++;
            if (guess == jar.getInJar()) break;
            if (guess < jar.getInJar()) System.out.println("Too low");
            if (guess > jar.getInJar()) System.out.println("Too high");
            System.out.println();
        }
        System.out.println("Congratulations - you guessed that there are " + 
            jar.getInJar() + " " + jar.getItem() + " in the jar! You got it in " 
            + guesses + " attempts.");
    }
}