package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String jesse="You like memes. You prefer Spongebob memes. And Caliou. and whatever memes. You also are bad at spelling memes. You are also always constipated";
String dylan= "you are weird";
String lukas = "you are ok at drawing(I'm better though)";

	// 2. Ask the user to enter a name. Store their answer in a variable.
String input= JOptionPane.showInputDialog(null, "What is your name?"
		+ "(all lower case)");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(input.equals("jesse")) {
	JOptionPane.showMessageDialog(null, jesse);
}
if(input.equals("dylan")) {
JOptionPane.showMessageDialog(null, dylan);
}
if(input.equals("lukas")) {
JOptionPane.showMessageDialog(null, lukas);
}

}
	}


