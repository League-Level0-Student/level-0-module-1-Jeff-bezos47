package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {

		// 1. Set a password in a String variable
		String password = "12345";
		// 2. Using a pop-up, ask the first person for a secret message and store it in
		// a variable
		String input = JOptionPane.showInputDialog("what is a secret message");

		// 3. Now use a pop-up to tell the NEXT user that they can only see the secret
		// message
		// if they can guess the passcode
		String something = JOptionPane
				.showInputDialog("You may only see the secret message if you can guess the password");
		// 4. If their guess matches the password, show them the secret message
		if (something.equals(password)) {
			JOptionPane.showMessageDialog(null, "correct!");
			JOptionPane.showMessageDialog(null, "the secret message is"+ input);
		}
		// 5. If the password does not match, pop-up "INTRUDER!!"
		else {
			JOptionPane.showMessageDialog(null, "Wrong! INTRUDER!");
		}
	}

}
