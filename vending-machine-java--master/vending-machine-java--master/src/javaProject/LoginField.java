package javaProject;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
@SuppressWarnings("serial")
 class Input extends JFrame{
	private JTextField item1;
	private JPasswordField password;
	public Input() {
		super("Login Handle");
		setLayout(new FlowLayout());
		item1=new JTextField("enter your username");
		add(item1);
		password =new JPasswordField("Enter your Password");
		add(password);	
		thehandler handler =new thehandler();
		item1.addActionListener(handler);
	password.addActionListener(handler);
	
	
	}
	private class thehandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String string="";
			if(event.getSource()==item1){
				string=String.format("username is:%s", event.getActionCommand());
				
			}else if(event.getSource()==password){
				string=String.format("password field is:%s", event.getActionCommand());
				
			}
			JOptionPane.showMessageDialog(null,string);
		}

		
		
	}
	
	
}
public class LoginField{
	void loginMethod() {
		Input i=new Input();
		i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		i.setSize(325,180);
		i.setVisible(true);
	}
}
