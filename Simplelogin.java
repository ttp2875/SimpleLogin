import javax.swing.JOptionPane;
	public class SimpleLogin {
	public static void main(String [] args ) {
	String input = JOptionPane.showInputDialog("Username ");
	String input2 = JOptionPane.showInputDialog("Password ");
	
	
	if (input.equals("ttp2875")) {
	
	JOptionPane.showMessageDialog(null, "Welcome to Prof.T's CSC200 Fall course!");
	} else { 
	JOptionPane.showMessageDialog(null,"The username that you entered is wrong, please try again. ");
	}
	if (input2.equals("csc200")) {
	//JOptionPane.showMessageDialog(null, "Welcome to Prof.T's CSC200 Fall course!");
	} else { 
 	JOptionPane.showMessageDialog(null,"The password that you entered is wrong, please try again. ");
	}
	}
}			
