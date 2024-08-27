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
public class HomeWorkLecture5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Random rand = new Random();
        
        int point = 0, wrong = 0;
        while(wrong < 3){
            int operands = rand.nextInt(4)  + 2;
            int total = 0;
            for(int i = 0; i < operands; i++){
                int numbers = rand.nextInt(100) + 1;
                total += numbers;
                System.out.print(numbers);
                if(i < operands -1){
                    System.out.print(" + ");
                }
            }
            System.out.print(" = ");
            
            int userAnswer = sc.nextInt();
            if(userAnswer == total){
                point++;
                System.out.println("Correct! Your point: "+point);
            }
            else {
                wrong++;
                System.out.println("Wrong! the answer was: "+total);
            }
        }
        System.out.println("You eared "+point+" total points");
    }
}
