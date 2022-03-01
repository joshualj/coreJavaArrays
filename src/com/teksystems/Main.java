package com.teksystems;

import com.teksystems.models.Car;
import com.teksystems.models.Truck;

import java.util.Arrays;

public class Main {

    static void printMyNameFormatted(String name){
        System.out.printf("My name is: %s\n", name);
    }

    public static void main(String[] args) {
//        printMyNameFormatted("Josh");
//
//        Car c1 = new Car("123", 4, "blue", "gas", 250, true);
//        Truck c2 = new Truck();
//            c1.acceleration();
//            c2.acceleration();
//        //        Vehicle v2 = new Vehicle();
////        System.out.println(c1.color);
////        c1.color = "red";
////        c1.vin = "hello";
////        System.out.println(c1.vin);
//
//        System.out.println(c1.getVin());




        problemOne();
        problemTwo();
        problemThree();
        problemFour();
        problemFive();
        problemSix();
        problemSeven();
        problemEight();
        problemNine();
        problemTen();

    }

    // Write a program that creates an array of integers with a length of 3.
    // Assign the values 1, 2, and 3 to the indexes.
    // Print out each array element.
    public static void problemOne() {
        int[] myArr = new int[3];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i;
        }
        System.out.println(Arrays.toString(myArr));
    }


    //Write a program that returns the middle element in an array.
    // Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
    public static void problemTwo() {
        Integer[] thisArr = new Integer[5];
        thisArr[0] = 13;
        thisArr[1] = 5;
        thisArr[2] = 7;
        thisArr[3] = 68;
        thisArr[4] = 2;

        System.out.println(thisArr[thisArr.length/2]);
    }


    //Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”.
    // Print out the array length. Make a copy using the clone( ) method.
    // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
    public static void problemThree() {
        String[] stringArr = {"red", "green", "blue", "yellow"};
        System.out.println(stringArr.length);
        String[] stringArr2 = stringArr.clone();
        System.out.println(Arrays.toString(stringArr2));
    }

    //Write a program that creates an integer array with 5 elements (i.e., numbers).
    // The numbers can be any integers.
    // Print out the value at the first index and the last index using length - 1 as the index.
    // Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
    // Notice the type of exception which is produced. Now try to assign a value to the array index 5.
    // You should get the same type of exception.
    public static void problemFour() {
        Integer[] arrFour = {5, 8, 3, 77, 11};
        System.out.printf("The number at index 0 is: %d,\n, the number at the last index is: %d", arrFour[0], arrFour[arrFour.length - 1]);
        //arrFour[arrFour.length] = 2; Intentional ArrayIndexOutOfBoundsException
    }


    //Write a program where you create an integer array with a length of 5.
    // Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
    public static void problemFive() {
        Integer[] arrFive = new Integer[5];
        for (int i = 0; i < arrFive.length; i++) {
            arrFive[i] = i;
        }
        System.out.println(Arrays.toString(arrFive));

    }
    public static void problemSix() {
        Integer[] arrSix = {5, 10, 15, 20, 25};
        for (int i = 0; i < arrSix.length; i++) {
            arrSix[i] = (arrSix[i]*2);
        }
        System.out.println(Arrays.toString(arrSix));
    }
    /* Write a problem where you create an integer of 5 numbers.
    Loop through the array and print the value of each element,
    except for the middle (index 2) element.
     */
    public static void problemSeven() {
        Integer[] arrSeven = {1, 2, 3, 4, 5};
        for (int j = 0; j < arrSeven.length; j++) {
            if(j == arrSeven.length/2){
                continue;
            }
            System.out.println(arrSeven[j]);
        }
    }
    /* Write a program that creates a String array of 5 elements and
    swaps the first element with the middle element without creating a new array.
    */

    public static void problemEight() {
        String[] arrEight = {"Chocolate", "Vanilla", "Coffee", "Peanut Butter", "Cookie Dough"};

        String x = arrEight[0];
        String y = arrEight[arrEight.length/2];

        arrEight[arrEight.length/2] = x;
        arrEight[0] = y;

        System.out.println(Arrays.toString(arrEight));
    }

    /*Write a program to sort the following int array in ascending order:
    {4, 2, 9, 13, 1, 0}.
    Print the array in ascending order,
    print the smallest and the largest element of the array.
    The output will look like the following:

    Array in ascending order: 0, 1, 2, 4, 9, 13

    The smallest number is 0

    The biggest number is 13

     */
    public static void problemNine() {
        Integer[] arrNine = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arrNine);
        System.out.println(Arrays.toString(arrNine));
        System.out.printf("The smallest number is %d\n", arrNine[0]);
        System.out.printf("The largest number is %d\n", arrNine[arrNine.length - 1]);
    }

    public static void problemTen() {
        Object[] arrTen = {7, "Beans", "Rice", "Guacamole", 10.95D};
        System.out.println(Arrays.toString(arrTen));
    }
}
