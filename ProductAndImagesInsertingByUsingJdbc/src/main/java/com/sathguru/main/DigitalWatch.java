package com.sathguru.main;

////////
//
////
////////import java.awt.event.*;
////////import javax.swing.*;
////////
public class DigitalWatch {
	public static void main(String[] args) {
//		float f = 2.123f;
		double d = 2.123;
		System.out.println(d);
	}

}
////////	public static void main(String[] args) {
////////		JFrame f = new JFrame("Button Example");
////////		final JTextField tf = new JTextField();
////////		tf.setBounds(50, 50, 150, 20);
////////		JButton b = new JButton("Click Here");
////////		b.setBounds(50, 100, 95, 30);
////////		b.addActionListener(new ActionListener() {
////////			public void actionPerformed(ActionEvent e) {
////////				tf.setText("Welcome to Javatpoint.");
////////			}
////////		});
////////		f.add(b);
////////		f.add(tf);
////////		f.setSize(400, 400);
////////		f.setLayout(null);
////////		f.setVisible(true);
////////	}
////////}
//////
//////import javax.swing.*;
//////
//////public class LabelExample {
//////	public static void main(String args[]) {
//////		JFrame f = new JFrame("Label Example");
//////		JLabel l1, l2;
//////		l1 = new JLabel("First Label.");
//////		l1.setBounds(50, 50, 100, 30);
//////		l2 = new JLabel("Second Label.");
//////		l2.setBounds(50, 100, 100, 30);
//////		f.add(l1);
//////		f.add(l2);
//////		f.setSize(300, 300);
//////		f.setLayout(null);
//////		f.setVisible(true);
//////	}
//////}
////
////import javax.swing.*;
////import java.awt.*;
////import java.awt.event.*;
////
////public class LabelExample extends Frame implements ActionListener {
////	JTextField tf;
////	JLabel l;
////	JButton b;
////
////	LabelExample() {
////		tf = new JTextField();
////		tf.setBounds(50, 50, 150, 20);
////		l = new JLabel();
////		l.setBounds(50, 100, 250, 20);
////		b = new JButton("Find IP");
////		b.setBounds(50, 150, 95, 30);
////		b.addActionListener(this);
////		add(b);
////		add(tf);
////		add(l);
////		setSize(400, 400);
////		setLayout(null);
////		setVisible(true);
////	}
////
////	public void actionPerformed(ActionEvent e) {
////		try {
////			String host = tf.getText();
////			String ip = java.net.InetAddress.getByName(host).getHostAddress();
////			l.setText("IP of " + host + " is: " + ip);
////		} catch (Exception ex) {
////			System.out.println(ex);
////		}
////	}
////
////	public static void main(String[] args) {
////		new LabelExample();
////	}
////}
//
//import javax.swing.*;
//import java.awt.*;
//import java.text.*;
//import java.util.*;
//
//public class DigitalWatch implements Runnable {
//	JFrame f;
//	Thread t = null;
//	int hours = 0, minutes = 0, seconds = 0;
//	String timeString = "";
//	JButton b;
//
//	DigitalWatch() {
//		f = new JFrame();
//
//		t = new Thread(this);
//		t.start();
//
//		b = new JButton();
//		b.setBounds(100, 100, 100, 50);
//
//		f.add(b);
//		f.setSize(300, 400);
//		f.setLayout(null);
//		f.setVisible(true);
//	}
//
//	public void run() {
//		try {
//			while (true) {
//
//				Calendar cal = Calendar.getInstance();
//				hours = cal.get(Calendar.HOUR_OF_DAY);
//				if (hours > 12)
//					hours -= 12;
//				minutes = cal.get(Calendar.MINUTE);
//				seconds = cal.get(Calendar.SECOND);
//
//				SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
//				Date date = cal.getTime();
//				timeString = formatter.format(date);
//
//				printTime();
//
//				t.sleep(1000); // interval given in milliseconds
//			}
//		} catch (Exception e) {
//		}
//	}
//
//	public void printTime() {
//		b.setText(timeString);
//	}
//
//	public static void main(String[] args) {
//		new DigitalWatch();
//
//	}
//}
