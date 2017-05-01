import engine.text.Constants;

import java.util.Scanner;

public class AstroExplorerText {

    private boolean running = true;
    private Scanner in = new Scanner(System.in);

    /**
     * Starts the game loop. This will block until the
     * game exits.
     */
    public void start() {
        System.out.println(Constants.WELCOME);

        while (this.running) {
            String in = this.prompt();
            this.dispatch(in);
        }
    }

    /**
     * Exit the game. This will only run when invoked within
     * the game loop, because the main thread will be blocked.
     */
    public void exit() {
        this.running = false;
    }

    /**
     * Blocks and prompts for a response from the player.
     * @return String the player's response
     */
    public String prompt() {
        return this.in.next();
    }

    /**
     * Handles a player response.
     * @param input The command to be run
     */
    public void dispatch(String input) {
        System.out.println("DISPATCH: " + input);
    }

    public static void main(String args[]) {
        AstroExplorerText game = new AstroExplorerText();
        game.start();

        /*
        boolean inGame = true;
        boolean alive = true;
        Scanner reader = new Scanner(System.in);
        String input;

        while(inGame && alive){
            System.out.println("Welcome brave astroexplorer. Your ship has broken down in the middle of an asteroid field." +
                    "You must gather surrounding resources to fix it. but be careful you only have a limited supply of fuel and" +
                    "oxygen. You will need to return to the ship to resupply.");
            input = reader.next();
            inGame = false;


        }
        */
    }

}
