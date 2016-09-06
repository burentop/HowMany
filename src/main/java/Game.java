public class Game {
    public static void main(String[] args) {

        Console console = System.console();

        String item = "";
        int capacity = 0;

        System.out.println("ADMINISTRATOR SETUP");
        System.out.println("=====================");
        item = console.readLine("Name of the items in the jar: ");
        capacity = console.readLine("Maximum number of " + item +
                                    " in the jar: ");

        Jar jar = new Jar(item, capacity);

        System.out.println("PLAYER");
        System.out.println("=======================");
        System.out.println("Your goal is to guess how many " + item +
                           " are in the jar. Your guess should be between" +
                           " 1 and 5.");
        System.out.println();

        String isReady = console.readLine("Ready? (press enter to start" +
                                          " guessing)");

        playGame(jar);

    }

    private void playGame(Jar jar) {
        int guess = console.readInt("Guess: ");
        
    }
}
