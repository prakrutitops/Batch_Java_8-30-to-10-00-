package com.a2112;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyFrameEx 
{
	
	JFrame frame;
	JTextField tf1;
	JPasswordField tf2;
	JLabel l1,l2;
	JButton btn1;
	
	public MyFrameEx() 
	{
		frame = new JFrame("Tops App");
		
		
		l1 =new JLabel("Name");
		l1.setBounds(83, 52, 76, 14);
		
		l2 =new JLabel("Surname");
		l2.setBounds(83, 81, 76, 14);
		
		tf1 =new JTextField();
		tf1.setBounds(166, 49, 86, 20);
		
		tf2 =new JPasswordField();
		tf2.setBounds(166, 78, 86, 20);
		
		btn1 = new JButton("Submit");
		btn1.setBounds(126, 116, 89, 23);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				
					if(e.getSource()==btn1)
					{
						String name = tf1.getText().toString();
						String pass = tf2.getText().toString();
						
						if(pass.equals("tops?123"))
						{
							System.out.println("Welcome "+name);
						}
						else
						{
							System.out.println("Login Details are Incorrect");
						}
					}
				
			}
		});
		frame.add(l1);
		frame.add(l2);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		
		new MyFrameEx();
		
	}
}
