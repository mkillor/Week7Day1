package com.company.killoran;

enum Direction {NORTH, SOUTH, EAST, WEST};

class Storm{
    private double latitude;
    private double longitude;
    private double speed;
    private Direction direction;

    static int numStorms;

    public Storm() {
        numStorms++;
    }

    public Storm(double latitude, double longitude, double speed, Direction direction) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.direction = direction;

        numStorms++;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void display(){
        System.out.println("The storm is currently located at (" + latitude +","+longitude + ") moving at a speed of "+ speed + " MPH " + direction);
    }

    public void destroy(String a){
        System.out.println("I am a storm, destroying the city of :" + a);
    }

}


class Sharknado extends Storm{
    private boolean isTornadoPresent;
    private int numSharks;

    public Sharknado(double latitude, double longitude, double speed, Direction direction, boolean isTornadoPresent, int numSharks) {
        super(latitude, longitude, speed, direction);
        this.isTornadoPresent = isTornadoPresent;
        this.numSharks = numSharks;
    }

    public boolean isTornadoPresent() {
        return isTornadoPresent;
    }

    public void setTornadoPresent(boolean tornadoPresent) {
        isTornadoPresent = tornadoPresent;
    }

    public int getNumSharks() {
        return numSharks;
    }

    public void setNumSharks(int numSharks) {
        this.numSharks = numSharks;
    }

    @Override
    public void display() {
        super.display();

    }
}

public class Main {

    public static void main(String[] args) {
        Storm storm1 = new Storm(39.97,-82.98,33,Direction.EAST);
        storm1.display();
        Storm storm2 = new Storm();
        storm2.display();

        Sharknado storm3 = new Sharknado(40.7,-120.8,135,Direction.NORTH,true,5000);
        storm3.display();

        System.out.println(Storm.numStorms);
        storm1.destroy("Cleveland");
    }
}
