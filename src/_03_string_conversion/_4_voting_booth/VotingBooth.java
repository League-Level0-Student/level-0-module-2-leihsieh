package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(input);
		if (age >= 18){
			JOptionPane.showInputDialog("Who do you think the next president will be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "No one cares what you think!");
		}
	}
}
