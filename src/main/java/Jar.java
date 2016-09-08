import java.util.Random;

/*
 * This class creates the jar and checks guesses
 */


public class Jar {

    Random random = new Random();

    private String mItem;
    private int mCapacity;
    private int mInJar;
    private int mGuesses;

    public Jar(String item, int capacity) {
        mItem = item;
        mCapacity = capacity;
        mGuesses = 0;
        mInJar = random.nextInt(mCapacity) + 1;
    }

    public String getItem() {
        return mItem;
    }

    public int getCapacity() {
        return mCapacity;
    }

    public int getInJar() {
        return mInJar;
    }

    public int getGuesses() {
        return mGuesses;
    }

    public void incGuesses() {
        mGuesses++;
    }

    public int compareTo(int guess) {
        if (guess == mInJar) return 0;
        else if (guess > mInJar) return 1;
        else return -1;
    }
}