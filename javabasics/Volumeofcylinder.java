package Bridgelabz_PPP.javabasics;
public class Volumeofcylinder {
    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        double radius = 3;
        double height = 10;
        double volume = calculateVolume(radius, height);
        System.out.println("Volume of cylinder with radius " + radius + " and height " + height + " is " + volume);
    }
}    