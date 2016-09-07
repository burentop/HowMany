/*
 * This program is Project 1 of the Treehouse Java Techdegree
 * The program prompts the user for the max size of a "jar" and
 * the type of item in the jar; then prompts the player to guess
 * how many items are in the jar.
 */

public class Game {
    public static void main(String[] args) {

        // Creates the I/O prompter
        Prompter prompter = new Prompter();
        // These methods setup the game, and then initiate play
        prompter.admin();
        prompter.play();
    }
}