package engine.entity;

import engine.world.Location;

public abstract class MovableEntity extends Entity {

    private double velocityX = 0;
    private double velocityY = 0;
    private double direction = 0;

    public MovableEntity(Location position, int height, int width, boolean solid) {
        super(position, height, width, solid);
    }

    public MovableEntity(int sprite, int height, int width, boolean solid, double direction) {
        super(sprite, height, width, solid);
        this.direction = direction;
    }

    public MovableEntity(int sprite, int height, int width, boolean solid, double direction, double velocityX, double velocityY) {
        super(sprite, height, width, solid);
        this.direction = direction;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public abstract void move();

    public double getVelocityX() {
        return this.velocityX;
    }

    public void setVelocityX(double velocityX) {
        this.velocityX = velocityX;
    }

    public void addVelocityX(double velocityX) {
        this.velocityX += velocityX;
    }

    public double getVelocityY() {
        return this.velocityY;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
    }

    public void addVelocityY(double velocityY) {
        this.velocityY += velocityY;
    }

    public void setVelocity(double velocityX, double velocityY) {
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public void addVelocity(double velocityX, double velocityY) {
        this.velocityX += velocityX;
        this.velocityY += velocityY;
    }

    public void setVelocity(double velocity) {
        this.velocityX += velocity;
        this.velocityY += velocity;
    }

    public double getDirection() {
        return this.direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

}
