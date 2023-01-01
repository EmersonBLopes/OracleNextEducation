package javaLang;

import javax.swing.*;  

public class JavaSwingTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();//creating instance of JFrame  
        
		JButton b=new JButton("click");//creating instance of JButton  
		JTextArea t = new JTextArea("Hello World!");
		b.setBounds(130,100,100, 80);//x axis, y axis, width, height  
		t.setBounds(80,90,100, 80);
		f.add(b);//adding button in JFrame  
		f.add(t);
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}
}
