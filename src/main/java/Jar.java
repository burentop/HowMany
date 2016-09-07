import java.util.Random;

public class Jar {

    Random random = new Random();

    private String mItem;
    private int mCapacity;
    private int mInJar;

    public Jar(String item, int capacity) {
        mItem = item;
        mCapacity = capacity;
    }

    public String getItem() {
        return mItem;
    }

    public int getCapacity() {
        return mCapacity;
    }

    public void setInJar() {
        mInJar = random.nextInt(mCapacity) + 1;
    }

    public int getInJar() {
        return mInJar;
    }

    public void setItem(String item) {
        mItem = item;
    }

    public void setCapacity(int capacity) {
        mCapacity = capacity;
    }


}