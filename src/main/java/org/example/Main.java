package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int getal1 = scan.nextInt();
        int getal2 = scan.nextInt();
        Calculator cal = new Calculator();
        int result = cal.telOp(getal1, getal2);

        System.out.println("De som is: " + result);
    }
}