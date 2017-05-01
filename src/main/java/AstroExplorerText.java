import engine.character.Character;
import engine.text.Constants;
import engine.world.Location;
import engine.world.World;
import org.apache.commons.lang3.text.WordUtils;
import engine.character.*;
import java.util.Scanner;

public class AstroExplorerText {

    // the game will block on this unless System.exit(); is called
    private boolean running = true;
    private Scanner in = new Scanner(System.in);

    // toggle this to increase verbosity
    private static final boolean debug = true;

    /**
     * Starts the game loop. This will block until the
     * game exits.
     */
    public void start() {
        this.display(Constants.WELCOME);
        // System.out.println(Constants.MAINMENU);
        //load character into world
        this.display(Constants.NAMEPROPMT);
        String name = this.prompt();
        this.dispatch(name);

        //need to load world.
        World world = new World();
        Location startingPosition = new Location(1.0,2.0,world);

        Character chr = new Character(0,1,1,true,0.0, "player");
        WalkingCharacter player = new WalkingCharacter(startingPosition, 1,1,chr);

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
        debug("dispatch: " + input);
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

    public void display(String message) {
        System.out.println(WordUtils.wrap(message, 80));
    }

    public static void debug(String message) {
        if (!AstroExplorerText.debug) return;
        System.out.printf("[DEBUG] %s\n", message);
    }

}