import java.util.Scanner;

public class Prompter {

    Scanner in = new Scanner(System.in);

    private Jar mJar;
    private int mGuess;
    private int mGuesses;

    public Prompter(Jar jar) {
        mJar = jar;
        mGuess = -1;
        mGuesses = 0;
    }

    public void play() {
        System.out.println("PLAYER");
        System.out.println("=======================");
        System.out.println("Your goal is to guess how many " + mJar.getItem() +
                           " are in the jar. Your guess should be between" +
                           " 1 and " + mJar.getCapacity() + ".");
        System.out.println();

        mJar.setInJar();
        guessLoop();

        System.out.println("Congratulations - you guessed that there are " +
            mJar.getInJar() + " " + mJar.getItem() + " in the jar! You got" +
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
}