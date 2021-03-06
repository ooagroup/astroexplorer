package engine.character;

public class Statistics {

    private double fuel = 100;
    private double health = 100;
    private double oxygen = 100;
    private int inventorySize = 0;

    public double getFuel() {
        return this.fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void modifyFuel(double mod) {
        this.fuel += mod;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void modifyHealth(double mod) {
        this.health += mod;
    }

    public double getOxygen() {
        return this.oxygen;
    }

    public void setOxygen(double oxygen) {
        this.oxygen = oxygen;
    }

    public void modifyOxygen(double mod) {
        this.oxygen += mod;
    }

    public int getInventorySize() {
        return this.inventorySize;
    }

    public void setInventorySize(int inventorySize) {
        this.inventorySize = inventorySize;
    }

    public boolean getStats() {
        if (getFuel() == 0 || getHealth() == 0 || getOxygen() == 0)
            return false;

        System.out.println("STATS");
        System.out.println("----------------");
        System.out.println("Fuel:" + getFuel());
        System.out.println("Health:" + getHealth());
        System.out.println("Oxygen:" + getOxygen());
        return true;
    }

    public void reset() {
        this.fuel = 100;
        this.health = 100;
        this.oxygen = 100;
        this.inventorySize = 10;
    }

    public String toString(){
       return "STATS\n" +
        "----------------\n" +
        "Fuel:" + getFuel() + "\n" +
        "Health:" + getHealth() + "\n"  +
        "Oxygen:" + getOxygen() + "\n";
    }

}
