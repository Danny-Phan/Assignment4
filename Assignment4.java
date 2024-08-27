/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Assignment4 {

    //LECTURE 4 + 5.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Bai 1
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        //Bai 2
        int place = sc.nextInt();
        if (place == 1) {
            System.out.println("Gold medal");
        } else if (place == 2) {
            System.out.println("Silver medal");
        } else if (place == 3) {
            System.out.println("Bronze medal");
        }

        //Bai 3
        float a = sc.nextInt(), b = sc.nextInt(), x1;
        if (b == 0) {
            System.out.println("x = 0");
        } else if (a == 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (a != 0 && b != 0) {
            x1 = -b / a;
            System.out.printf("x = %.2f", x1);
        }

        //Bai 4
        int c = sc.nextInt(), d = sc.nextInt(), max;
        if (c > d) {
            System.out.println("Max = " + c);
        } else {
            System.out.println("Max = " + d);
        }

        //Bai 5 
        int k;
        do {
            k = sc.nextInt();
            switch (k) {
                case 0: {
                    System.out.println("Chuong trinh da ket thuc");
                    break;
                }
                case 1: {
                    System.out.println("One");
                }
                case 2: {
                    System.out.println("Two");
                    break;
                }
                case 3: {
                    System.out.println("Three");
                    break;
                }
                case 4: {
                    System.out.println("Four");
                    break;
                }
                case 5: {
                    System.out.println("Five");
                    break;
                }
                default:
                    System.out.println("Gia tri khong hop le");
            }
        } while (k != 0);

        //Bai 6
        for (int i = 0; i < 7; i++) {
            System.out.println("1 squared = " + (i * i));
        }

        //Bai 7
        System.out.println("T-minus ");
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + ",  ");
        }
        System.out.println("blastoff! ");
        System.out.println("The end. ");

        //Bai 8
        for (int e = 1; e <= 5; e++) {
            for (int f = 1; f <= 10; f++) {
                System.out.println("*");
            }
            System.out.println("");
        }

        //Bai 9 
        int num = 1, sum = 0;
        while (num != -1) {
            System.out.println("Enter number (-1 to quit): ");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("Tong = " + sum);

        //Bai 10
        String phrase;
        do {
            System.out.println("Type your password: ");
            phrase = sc.next();
        } while (!phrase.equals("duytan"));
    }
}
