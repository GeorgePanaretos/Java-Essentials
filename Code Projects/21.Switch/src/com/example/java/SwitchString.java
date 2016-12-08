package com.example.java;

import java.util.Scanner;

public class SwitchString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        switch(input){
            case "Jan":
                System.out.println("The Month is January");
                break;
            case "Feb":
                System.out.println("The Month is February");
                break;
            case "Mar":
                System.out.println("The Month is MArch");
                break;
            default:
                System.out.println("You chose another month");
        }


    }

}
