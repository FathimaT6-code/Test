package com.learnig.practice;

import java.util.Scanner;

public class ColorCodeQ8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a valid color code from {B,G,Y,O,R,W}");
        char code = sc.next().charAt(0);

        switch(code) {
            case 'B':
                System.out.println(code+"->Blue"); break;
            case 'R':
                System.out.println(code+"->Red"); break;
            case 'G':
                System.out.println(code+"->Green"); break;
            case 'Y':
                System.out.println(code+"->Yellow"); break;
            case 'O':
                System.out.println(code+"->Orange"); break;
            case 'W':
                System.out.println(code+"->White"); break;
            default:
                System.out.println("Invalid code");
        }
    }
}
