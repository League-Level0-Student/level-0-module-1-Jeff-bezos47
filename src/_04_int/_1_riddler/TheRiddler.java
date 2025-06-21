package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = JOptionPane.showInputDialog("What starts with T, ends with T, and has T in it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(input.equals("A teapot")) {
			JOptionPane.showMessageDialog(null,"Corrtect!");
			score+=1;
		}


		else {
			JOptionPane.showMessageDialog(null,"WRONG!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String imput = JOptionPane.showInputDialog("What has a head a tail, but no body");
		if(imput.equals("A coin")) {
			JOptionPane.showMessageDialog(null,"Corrtect!");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null,"WRONG!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		String inmput = JOptionPane.showInputDialog("what goes up but never comes down");
		if(inmput.equals("Your age")){
			JOptionPane.showMessageDialog(null,"Corrtect!");
			score+=1;
		}
		else {
			JOptionPane.showMessageDialog(null,"WRONG!!!!!!!!!!!!!!!!!!!!!!!!");
		}
			// 2. Make a pop up to show the score.
		String imnput = JOptionPane.showInputDialog("Your final score was" + score+ ".");
		
	}
}