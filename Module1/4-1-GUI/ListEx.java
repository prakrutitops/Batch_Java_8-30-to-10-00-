package com.a21;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class ListEx 
{
	
	 JFrame f;  
	
	
	public ListEx() 
	{
		// TODO Auto-generated constructor stub
		f = new JFrame();
		  DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Item1");  
          l1.addElement("Item2");  
          l1.addElement("Item3");  
          l1.addElement("Item4");  

          JList<String>list =new JList<>(l1);
          list.setBounds(100,100, 75,75);
          
          f.add(list);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
	
	
	}
	
	public static void main(String[] args)
	{
		new ListEx();
	}
}

//a=b//assign
//a==b//compare

//int ,Integer