package com.juaracoding;

public class PolaSegitigaAngka {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            for (int j = i; j <= 9; j++) {
                if ((i+j)  >10) {break;
                } else if (j % 2 == 0) {
                System.out.print("_");
                }
                else {
                    System.out.print(j + "");
                }
            }
            System.out.println();
        }

    }
}

