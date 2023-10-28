package com.juaracoding;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BizzBuzz {
    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {
            if (num %5==0 && num %3==0) {
                System.out.println("BizzBuzz");
            } else if (num % 5 == 0) {
                System.out.println("BUZZ");
            } else if (num % 3 == 0) {
                System.out.println("BIZZ");
            }else {
                System.out.println(num);
            }
        }
    }
}