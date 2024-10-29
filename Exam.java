package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Exam {
    public static void main(String [] args) {

   Scanner scanner = new Scanner(System.in);

//        1. Write a Java program that accept
//        three numbers from the user and print the largest number .

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        int larger = Math.max(Math.max(num1, num2), num3);
        System.out.println("The largest number is: " + larger);

//
//       2. Write a Java program that accept a String and a number from the user,
//        then print the character in the given index .

        System.out.println("Enter a string: ");
        String word = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Enter a number: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        for(int s = 0; s < word.length(); s++){

            if(s == index){
                System.out.println("The character is: " + word.charAt(s));
            }


        }

//
//        3. Write a program to enter the numbers till the user wants and
//        at the end it should display the sum entered .

        int userNum = 0;
        int sum = 0;
        do{

            System.out.println("Enter any number and -1 to stop: ");
            userNum = scanner.nextInt();

            if(userNum == -1){
                break;
            }

            sum = sum +userNum;




        }while(userNum != -1);

        System.out.println("Sum of numbers = " + sum);



//       4. Write a Java program to find positive and negative numbers of a given array:
//        -  Original Array:
//      [10, -21 , 30, 31, -25]
//        -  Expected Output:
//        10  is a positive number
//        -21 is a negative number
//        30 is a positive number
//        31 is a positive number
//        -25 is a negative number

        int [] array = {10, -21 , 30, 31, -25};

        for(int num : array){

            if(num > 0){
                System.out.println(num + " is a positive number");

            }else System.out.println(num + " is a negative number");

        }


//        5. Write a Java program to find a shortest word of a given array:
//        - Original Array:
//         [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
//        - Expected Output:
//          JAVA

        String [] words = {"Tuwaiq", "Bootcamp" , "Student","JAVA"};
        System.out.println("Original Array: " + Arrays.toString(words));

        int length = 0;
        String first = words[0];
        String shortest = null;

        for(int i = 1; i < words.length; i++){

            first = words[0];
            length = first.length();

            String w = words[i];

            if(length < w.length()) {
                shortest = first;
            }

        }
        System.out.println(shortest);















    }
}
