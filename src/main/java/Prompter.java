import java.util.Scanner;

/*
 * This class administers all of the I/O for the game.
 */

public class Prompter {

    Scanner in = new Scanner(System.in);

    private Jar mJar;
    private int mGuess;
    private int mGuesses;
    private String mItem;
    private int mCapacity;

    public Prompter() {
        mGuess = -1;
        mGuesses = 0;
        mCapacity = 0;
        mJar = new Jar("", 0);
    }

    public void play() {
        System.out.println("PLAYER");
        System.out.println("=======================");
        System.out.println("Your goal is to guess how many " + mItem +
                           " are in the jar. Your guess should be between" +
                           " 1 and " + mCapacity + ".");
        System.out.println();

        guessLoop();

        System.out.println("Congratulations - you guessed that there are " +
            mJar.getInJar() + " " + mItem + " in the jar! You got" +
            " it in " + mJar.getGuesses() + " attempts.");
    }

    public void guessLoop() {
        // Indicates when the amount is guessed
        boolean guessed = false;
        while (!guessed) {
            System.out.print("How many " + mJar.getItem() + "? (Between 1 and "
                 + mJar.getCapacity() + ") ");
            mGuess = in.nextInt();
            
            // Ensure guess is within range
            if (mGuess > mCapacity) {
                System.out.println("Your guess must be less than " +
                     mCapacity);
            } else if (mGuess < 1) {
                System.out.println("Your guess must be greater than zero.");
            }
            // Check if equal, high or low
            switch(mJar.compareGuess(mGuess)) {
                case 0:
                    guessed = true;
                    break;
                case 1:
                    System.out.println("Too high");
                    break;
                case -1:
                    System.out.println("Too low");
                    break;
                default:
                    break;

            }
            System.out.println();
        }
    }

    public void admin() {
        System.out.println("ADMINISTRATOR SETUP");
        System.out.println("=====================");
        System.out.print("What type of item? ");
        mItem = in.nextLine();
      
        while (mCapacity < 2) {
          System.out.print("What is the maximum amount of " + mItem +"? ");
          mCapacity = in.nextInt();
        }

        // Fill the jar with the provided information.
        mJar.setItem(mItem);
        mJar.setCapacity(mCapacity);
        mJar.setInJar();
    }
}