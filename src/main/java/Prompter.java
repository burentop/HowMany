import java.util.Scanner;

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
            " it in " + mGuesses + " attempts.");
    }

    public void guessLoop() {
        while (mGuess != mJar.getInJar()) {
            System.out.print("How many " + mJar.getItem() + "? (Between 1 and "
                 + mJar.getCapacity() + ") ");
            mGuess = in.nextInt();
            mGuesses++;
            if (mGuess == mJar.getInJar()) break;
            if (mGuess > mJar.getCapacity()) {
                System.out.println("Your guess must be less than " +
                     mJar.getCapacity());
                mGuesses--;
            }
            if (mGuess < mJar.getInJar()) System.out.println("Too low");
            if (mGuess > mJar.getInJar()) System.out.println("Too high");
            System.out.println();
        }
    }

    public void admin() {
        System.out.println("ADMINISTRATOR SETUP");
        System.out.println("=====================");
        System.out.print("What type of item? ");
        mItem = in.nextLine();
      
        while (mCapacity < 1) {
          System.out.print("What is the maximum amount of " + mItem +"? ");
          mCapacity = in.nextInt();
        }

        mJar.setItem(mItem);
        mJar.setCapacity(mCapacity);
        mJar.setInJar();
    }
}