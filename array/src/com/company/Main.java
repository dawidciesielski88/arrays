package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    int[] myIntegers = getIntegers(5);


    public static void main(String[] args) {
        //arrays starts to count form 0
//        int[] myIntArray = new int[24];
//        myIntArray[5] = 50;
//
//        for (int i =0; i<myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }
//        printArray(myIntArray);
//    }
//    public static void printArray (int[] array) {
//        for (int i=0; i<array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
        int[] myIntegers = getIntegers(5);
        for (int i=0; i<myIntegers.length; i++) {
            System.out.println("Enter " + i + ", typed values was " + myIntegers[i]);
        }
        System.out.println("the average is " + getAverage(myIntegers));

    }
    public static int[] getIntegers(int number) {
        //.\r takes input in console to another line
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int [number];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage (int[] array) {
        int sum=0;
        for (int i=0; i< array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}