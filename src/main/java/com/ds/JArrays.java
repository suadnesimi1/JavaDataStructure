package com.ds;

import java.util.Arrays;

public class JArrays {
    public static void main(String[] args) {


        String[] colors = new String[7];
        colors[0] = "black";
        colors[1] = "red";
        colors[2] = "yellow";
        colors[3] = "blue";
        colors[4] = "green";
        colors[5] = "tuques";
        colors[6] = "purple";

        //the length of the array and not the numbers inside the array
        System.out.println("\nLength of the array: "+colors.length);

        System.out.println("\nPrint all the colors");
        System.out.println(Arrays.toString(colors));


        System.out.println("\nNormal Loop");
        // the way to access the array through the loop
        for (int i=0; i< colors.length;i++){
            System.out.println(colors[i]);
        }

        System.out.println("\nReverse Loop");
        // this loop starts in reverse form
        for (int i = colors.length -1; i>=0 ; i--) {
            System.out.println(colors[i]);

        }

        System.out.println("\nEnhanced loop");
        //this is enhanced for loop
        for (String color :colors){
            System.out.println(color);
        }

        System.out.println("\nUsing Streams");
        //using Streams
        Arrays.stream(colors).forEach(System.out::println);





    }
}