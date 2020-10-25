package com.chaiwala.udemy;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        int xA = this.getX(), xB = x, yA = this.getY(), yB = y;

        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point anotherPoint) {
        return distance(anotherPoint.getX(), anotherPoint.getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
