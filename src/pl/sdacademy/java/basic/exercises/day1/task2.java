package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class task2 {
    private static final float PI = 3.14F; //Stałe piszemy z dużych liter z podkreślnikiem PI_VALUE

    public static void main(String[] args) {
        float pi = 3.14f;
        float radius = getDiameterFromUser() / 2;
        float circusference = calculateCircumferenceOfACircle(radius);
        float area = calculateCircumferenceOfACircle(radius);
        System.out.println("Circumference of a Circle:" +circusference);
        System.out.println();


    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter: ");
        //float diameter =scanner.nextFloat();
        //return diameter;
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfACircle(float radius) {
        //2 * pi * r
        //return 2 * PI * radius;
        return  (float)(Math.PI * Math.pow(radius, 2));
    }

    private static float calculateAreaOfCircle(float radius) {
        /// pi * r * r
        return PI * radius * radius;
    }
}

