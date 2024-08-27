/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ChuongTrinhXoSo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        int lotteryNumber = rand.nextInt(100) + 1;

        System.out.print("Enter your guess (1-100): ");
        int userGuess = sc.nextInt();

        if (userGuess == lotteryNumber) {
            System.out.println("Congratulations! You guessed the correct number: " + lotteryNumber);
        } else {
            System.out.println("Sorry, the correct number was: " + lotteryNumber);
        }
    }
}
