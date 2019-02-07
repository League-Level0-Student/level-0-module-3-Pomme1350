import javax.swing.JOptionPane;

public class areyouhappy {
public static void main(String[] args) {
	String happy=JOptionPane.showInputDialog(null, "Are you happy?");
	
	if(happy.equals("Yes")|| happy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing and stay happy!");
	}
	else
		if(happy.equals("No")||happy.equals("no")) {
			String happiness=JOptionPane.showInputDialog(null,"Do you want to be happy?");
			if(happiness.equals("No")|| happiness.equals("no")) {
				JOptionPane.showMessageDialog(null, "Then keep doing what you are doing.");
				
			}
			else
				if(happiness.equals("Yes")|| happiness.equals("yes")) {
					JOptionPane.showMessageDialog(null, "Then do something");
				}
		}
}
}
