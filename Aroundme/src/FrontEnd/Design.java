package FrontEnd;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import BackEnd.DesignBackend;

public class Design implements ActionListener {

	JFrame frame;
	ImageIcon img, icon1, best, med, car, hotel, logo;
	JLabel background, lbl1, lbl2, lbl3, label, bestlab, imglab, subm, lbllogo;
	JTextField txt1, t1, t2, t3, desc;
	JButton b1, b2, bt1, bt2, bt3, bt4, pb1, pb2, pb3, but1, but2, but3;
	JMenuBar menu;
	JMenu m1, m2;
	JMenuItem mi1, mi2, mi3, mi4;
	JPanel p1, p2, p3, p4, p5, p6, p7;
	Font f,f1;

	public void functions() {

		frame = new JFrame("J.D.R ----> VERSION 1.0");
		img = new ImageIcon("src\\images.jpg ");
		
		f1 = new Font("Serif",Font.BOLD,25);
		
		Image i = img.getImage();
		Image temp_img = i.getScaledInstance(1920, 1200, Image.SCALE_SMOOTH);
		img = new ImageIcon(temp_img);
		
		background = new JLabel(img);

		// Images
		best = new ImageIcon("src\\Photo_Banquet.jpg");
		
		Image im = best.getImage();
		Image temp_im = im.getScaledInstance(400, 300, Image.SCALE_SMOOTH);
		best = new ImageIcon(temp_im);
		
		bestlab = new JLabel(best);
		imglab = new JLabel("This is Royal Peper Banquet Hall");
		imglab.setFont(f1);
		imglab.setForeground(Color.white);

		logo = new ImageIcon("C:\\Users\\Archit\\Desktop\\imagess.jfif");

		car = new ImageIcon("C:\\Users\\Archit\\Desktop\\car.png");
		hotel = new ImageIcon("C:\\Users\\Archit\\Desktop\\hotel.png");
		med = new ImageIcon("C:\\Users\\Archit\\Desktop\\med.jpg");

		// Search Text Field and Button
		icon1 = new ImageIcon("src\\logo.jpg");
		b1 = new JButton("Search");
		b1.addActionListener(this);
		txt1 = new JTextField(34);
		b1.setBounds(450, 35, 100, 40);
		txt1.setBounds(550, 35, 300, 40);

		// Adding above to frame
		background.add(b1);
		background.add(txt1);

		// labels
		label = new JLabel("BANQUETS :- ");
		f = new Font("Arieal Black", Font.BOLD, 20);
		label.setFont(f);
		label.setForeground(Color.white);
		label.setBounds(20, 20, 300, 100);
		background.add(label);

		lbllogo = new JLabel(logo);

		subm = new JLabel("---->ARCHIT AND NISCHAY ");
		subm.setFont(f);
		subm.setForeground(Color.BLACK);

		// Panels
		p1 = new JPanel();
		p1.setBorder(BorderFactory.createTitledBorder(null,"Results",0,0,f,Color.white));
		p1.setBounds(500, 100, 400, 180);
		p1.setBackground(new Color(0,0,0,0));
		background.add(p1);

		p2 = new JPanel();
		p2.setBorder(BorderFactory.createTitledBorder(null,"Navigate",0,0,f,Color.white));
		p2.setBounds(950, 100, 400, 65);
		p2.setBackground(new Color(0,0,0,0));
		background.add(p2);

		p3 = new JPanel();
		p3.setBorder(BorderFactory.createTitledBorder(null,"Manipulate controller",0,0,f,Color.white));
		p3.setBounds(950, 200, 400, 65);
		p3.setBackground(new Color(0,0,0,0));
		background.add(p3);

		p4 = new JPanel();
		p4.setBorder(BorderFactory.createTitledBorder(null,"Description",0,0,f,Color.white));
		p4.setBounds(650, 300, 700, 400);
		p4.setBackground(new Color(0,0,0,0));
		background.add(p4);

		p5 = new JPanel();
		p5.setBorder(BorderFactory.createTitledBorder(null,"Submitted by ",0,0,f,Color.white));
		p5.setBounds(0, 900, 1920, 200);
		p5.setBackground(new Color(0,0,0,0));
		background.add(p5);

		p6 = new JPanel();
		p6.setBorder(BorderFactory.createTitledBorder(null,"User also search for",0,0,f,Color.white));
		p6.setBounds(40, 100, 400, 160);
		p6.setBackground(new Color(0,0,0,0));
		background.add(p6);

		p7 = new JPanel();
		p7.setBorder(BorderFactory.createTitledBorder(null,"Photo of the week",0,0,f,Color.white));
		p7.setBounds(60, 300, 550, 400);
		p7.setBackground(new Color(0,0,0,0));
		background.add(p7);
		p7.add(bestlab);
		p7.add(imglab);

		// Text field and labels
		lbl1 = new JLabel("Placename");
		lbl1.setForeground(Color.white);
		t1 = new JTextField(30);

		lbl2 = new JLabel("Address");
		lbl2.setForeground(Color.white);
		t2 = new JTextField(30);

		lbl3 = new JLabel("Standard");
		lbl3.setForeground(Color.white);
		t3 = new JTextField(30);

		p1.add(lbl1);
		p1.add(t1);
		p1.add(lbl2);
		p1.add(t2);
		p1.add(lbl3);
		p1.add(t3);

		desc = new JTextField(60);
		p4.add(desc);
		p4.add(lbllogo);

		bt1 = new JButton(">");
		bt1.addActionListener(this);
		bt2 = new JButton("<");
		bt2.addActionListener(this);
		bt3 = new JButton(">>");
		bt3.addActionListener(this);
		bt4 = new JButton("<<");
		bt4.addActionListener(this);

		pb1 = new JButton("Insert");
		pb1.addActionListener(this);
		pb2 = new JButton("Update");
		pb2.addActionListener(this);
		pb3 = new JButton("Delete");
		pb3.addActionListener(this);
		b2 = new JButton("Clear");
		b2.addActionListener(this);

		p2.add(bt4);
		p2.add(bt2);
		p2.add(bt1);
		p2.add(bt3);

		p3.add(pb1);
		p3.add(pb2);
		p3.add(pb3);
		p3.add(b2);

		p5.add(subm);

		but1 = new JButton("BANQUETS");
		but1.addActionListener(this);

		but2 = new JButton("AUTOMOBILES");
		but2.addActionListener(this);

		but3 = new JButton("MEDICAL STORES");
		but3.addActionListener(this);

		p6.add(but1);
		p6.add(but2);
		p6.add(but3);

		frame.add(background);
		frame.setSize(1920, 1200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	@Override
	public void actionPerformed(ActionEvent control) {
		// TODO Auto-generated method stub
		DesignBackend dbd;
		dbd = new DesignBackend();
		dbd.DatabaseConnect();
		if(control.getActionCommand()== "Insert")
		{
			
			dbd.rcrInsert(frame, t1, t2, t3, desc);
		
		}else if(control.getActionCommand()== "Clear")
		{
			
			dbd.rcrClear(frame, t1, t2, t3, desc);
		
		}else if(control.getActionCommand()== "Update")
		{
			
			dbd.rcrUpdate(frame, t1, t2, t3, desc);
		
		}else if(control.getActionCommand()== "Delete")
		{
			
			dbd.rcrDelete(frame, t1, t2, t3, desc);
		
		}else if(control.getActionCommand()== "Search")
		{
			
			dbd.rcrSearch(frame, t1, t2, t3, desc,txt1);
		
		}else if(control.getActionCommand()== ">")
		{
			
			dbd.rcrNext(t1, t2, t3, desc);
		
		}else if(control.getActionCommand()== "<")
		{
			
			dbd.rcrprev(t1, t2, t3, desc);
		
		}else if(control.getActionCommand()== ">>")
		{
			
			dbd.rcrLast(t1, t2, t3, desc);
		
		}else if(control.getActionCommand()== "<<")
		{
			
			dbd.rcrFirst(t1, t2, t3, desc);
		
		}else if(control.getActionCommand()== "BANQUETS")
		{
			
			JOptionPane.showMessageDialog(null, "Showing results for banquets ");
		
		}else if(control.getActionCommand()== "AUTOMOBILES")
		{
			
			frame.dispose();
			AutoMobiles mobj = new AutoMobiles();
			mobj.car();
			
		}else if(control.getActionCommand()== "MEDICAL STORES")
		{
			
			frame.dispose();
			MedStore obj = new MedStore();
			obj.Store();
		
		}
	}
}
/**
bt1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dbd.rcrNext(t1, t2, t3, desc);
	}
});

bt2.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dbd.rcrprev(t1, t2, t3, desc);
	}
});

bt3.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dbd.rcrLast(t1, t2, t3, desc);
	}
});

bt4.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dbd.rcrFirst(t1, t2, t3, desc);
	}
});

pb1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dbd.rcrInsert(frame, t1, t2, t3, desc);
	}
});

pb2.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dbd.rcrUpdate(frame, t1, t2, t3, desc);
	}
});

pb3.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dbd.rcrDelete(frame, t1, t2, t3, desc);
	}
});

b1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dbd.rcrSearch(frame, t1, t2, t3, desc, txt1);
	}
});

b2.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dbd.rcrClear(frame, t1, t2, t3, desc);
	}
});
**/
/**
// Menu bar
menu = new JMenuBar();
menu.setBounds(0, 0, 1920, 30);
background.add(menu);
m1 = new JMenu("File");
m2 = new JMenu("Find ");
m1.setBounds(0, 5, 70, 25);
m2.setBounds(72, 5, 70, 25);
menu.add(m1);
menu.add(m2);

// menu items
mi1 = new JMenuItem("menu item 1");
mi2 = new JMenuItem("menu item 2");
mi3 = new JMenuItem("menu item 3");
mi4 = new JMenuItem("menu item 4");
m1.add(mi1);
m1.add(mi2);
m2.add(mi3);
m2.add(mi4);
**/