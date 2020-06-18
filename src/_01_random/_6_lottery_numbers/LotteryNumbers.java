package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
	
	Random ran = new Random();
	int num = 0;
	
	System.out.println("Lottery Numbers:");
	for(int i = 0; i <= 6; i++) {
		num = ran.nextInt(100);
		System.out.println(num);
		}
		
	}
}
