package Bridgelabz_PPP.javabasics;
public class Areaofcircle {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double radius = 5;
        double area = calculateArea(radius);
        System.out.println("Area of circle with radius " + radius + " is " + area);
    }
}