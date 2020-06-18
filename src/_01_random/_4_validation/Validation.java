//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		//System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if(randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "you have an amazing work ethic");
		}
		// 2. Repeat all the code above 10 times
		else if(randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "you have beautiful eyes");
		}
		else if(randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "you have exquisite taste");
		}
		else
			JOptionPane.showMessageDialog(null, "I enjoy your company");
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
