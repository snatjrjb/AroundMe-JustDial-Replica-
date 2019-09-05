package FrontEnd;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginWindow {
	
	JFrame login;
	JTextField username;
	JButton okay;
	JLabel lblu; //background;
	//ImageIcon img;
	
	public void func()
	{
		login = new JFrame("Login window ");
	
		lblu = new JLabel("Enter user name here");
		username= new JTextField(20);
	
		okay = new JButton("Login ");
		okay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String un = username.getText().toString();
				
				if(un.equals("admin"))
				{
					
				   Design obj = new Design();
				   obj.functions();
				   login.dispose();
				   
				}
				else 
				{
				   JOptionPane.showMessageDialog(login,"Sorry not registered");
					
				}

			}

		});
		login.add(lblu);
		login.add(username);
		login.add(okay );
		
		FlowLayout layout =new FlowLayout();
		login.setLayout(layout);
		login.setSize(350,350);
		login.setVisible(true );
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}