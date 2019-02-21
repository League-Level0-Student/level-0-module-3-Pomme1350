import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	String sign =JOptionPane.showInputDialog(null,"What is your star sign?");
	if(sign .equals("Aries")) {
		JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
	}
	
	else if(sign .equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
	}
	
	
	else if(sign .equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
	}
	
	
	else if(sign .equals("Cancer")) {
		JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
	}
	
	
	else if(sign .equals("Leo")) {
		JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
	}
	
	
	else if(sign .equals("Virgo")) {
		JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
	}
	
	
	else if(sign .equals("Libra")) {
		JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
	}
	
	
	else if(sign .equals("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
	}
	
	
	else if(sign .equals("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
	}
	
	
	else if(sign .equals("Capricorn")) {
		JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious.");
	}
	
	
	else if(sign .equals("Aquarius")) {
		JOptionPane.showMessageDialog(null,"Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
	}
	
	
	else if(sign .equals("Pisces")) {
		JOptionPane.showMessageDialog(null,"Likeable, energetic, passionate, sensitive.");
	}
	
	
	else {
		JOptionPane.showMessageDialog(null, "That is not a star sign");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
