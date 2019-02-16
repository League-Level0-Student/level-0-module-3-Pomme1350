
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 17";
		String dadsBirthday = "November 11";
		String myBirthday = "October 20";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday =JOptionPane.showInputDialog(null, "Which birthday do you want?");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
		if(birthday .equals("mom") || birthday .equals("Mom")) {
			JOptionPane.showMessageDialog(null, "Her birthday is on November 17");
		}
		// 5. if user asked for "dad"
		else	 if(birthday .equals("dad") || birthday .equals("Dad")) {
			JOptionPane.showMessageDialog(null, "His birthday is on November 11");
		}
		// 6. if user asked for your name
		else	 if(birthday .equals("Kristina") || birthday .equals("kristina")) {
			JOptionPane.showMessageDialog(null, "Her birthday is on October 20");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else{
			JOptionPane.showMessageDialog(null, "Error! Computer does not recognize that person!");
		}
	} 
}
