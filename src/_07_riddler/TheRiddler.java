package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
// score
		int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

String answer=JOptionPane.showInputDialog("Stabbed and tied, have never died. Old as old can be, Push me to the moral ends I'm all for modesty. Often lost and all alone Find me without teeth, The holes I wear. I bear with pride");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.contentEquals("you are a button")) {
	JOptionPane.showMessageDialog(null, "correct");
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong");	
}
		// 6. Add some more riddles
String anser=JOptionPane.showInputDialog("Treasure waits beyond the reach gold within a hold, remnants of the dead are stitched to keep the living whole Broken bones among the weeds scattered 'round and round, where untouched gems wait silently o'er blades upon the ground. ");
if (anser.contentEquals("this is a bird nest")) {
	JOptionPane.showMessageDialog(null, "correct");
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "wrong");	
}

// 2. Make a pop up to show the score.
	JOptionPane.showMessageDialog(null,"your score is "+ score);																													
	}
}

