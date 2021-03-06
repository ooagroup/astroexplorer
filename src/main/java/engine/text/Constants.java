package engine.text;

public class Constants {

    public static final String WELCOME = "Welcome brave astroexplorer. Your ship has broken down in the middle of an " +
            "asteroid field. You must gather resources from your surroundings to fix it. Be careful though! You only " +
            "have a limited supply of fuel and oxygen. You will need to return to the ship to resupply.\n If you need any help " +
            "or tips just enter HELP or HINTS";

    public static final String MAIN_MENU = "WELCOME TO ASTROEXPLORER\n-------------------------------\n" +
            "Enter the action you wish to perform:\n(1) Start\n" +
            "(2) Load\n(3) Quit";

    public static final String SHOP_MAIN = "===================SHOP===================\n +" +
            "Welcome to the Shop. What would you like to do?\n(1) Heal\n" +
            "(2) Upgrade \n(3) Repairs\n(4) Exit";

    public static final String REPAIRS = "===================UPGRADE===================\n +" +
            "What would you like to Upgrade?\n(1) Health\n" +
            "(2) Oxygen \n(3) Fuel\n(4) Back";

    public static final String NAME_PROMPT = "please enter your name:";

    public static final String HELP_MESSAGE =
            "here is a list of possible commands\n" +
                    "hints: lists some quick tips for the game\n" +
                    "WHILE MINING\n" +
                    "up: move up\n" +
                    "down: move down\n" +
                    "left: move left\n" +
                    "right: move right\n" +
                    "drill: mine a resource tile\n" +
                    "WHILE FLYING:\n" +
                    "up: propel up\n" +
                    "down: propel down\n" +
                    "left: propel left\n" +
                    "right: propel right\n" +
                    "GAME:\n" +
                    "stats: display player stats" +
                    "repairs: Check ship repair status" +
                    "inventory: display player inventory\n" +
                    "menu: pause game and open menu\n";

    public static final String HINTS_MESSAGE =
            "here are some hints to help you out\n" +
                    "The shop is at cordinates (1,1) and (1.0)\n" +
                    "Watch your stats! if you run out of anything you die!\n" +
                    "You don't lose oxygen or fuel in your spaceship\n";

}
