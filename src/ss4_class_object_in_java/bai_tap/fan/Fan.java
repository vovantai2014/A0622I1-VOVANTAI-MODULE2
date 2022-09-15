package ss4_class_object_in_java.bai_tap.fan;

import com.sun.scenario.effect.impl.prism.PrImage;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, double radius, String color, boolean status) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.status = status;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStatus() {
        return status;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean on) {
        this.status = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.status) {
            return "Fan is on ! " + "speed :" + this.speed + " , color :" + this.color + " , radius :" + this.radius;
        } else {
            return "Fan is off !" + "color :" + this.color + " , radius :" + this.radius;
        }
    }
}
