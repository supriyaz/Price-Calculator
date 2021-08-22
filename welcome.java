import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
class welcome extends JFrame
{
	
	JButton b1;
	JLabel l1,l2,l3,bck,descr ,abt;
	ImageIcon  img;
	public welcome()
	{
		setLayout(null);
		setVisible(true);
		l3=new JLabel("WELCOME");
		l3.setFont(new Font("Sans Serif",Font.ITALIC,50));
		l1=new JLabel(" Free And Fast Price Calculator ");
		descr=new JLabel(" Fell free to use our simple calculator to calculate the price of product according to quantity and size");
		abt=new JLabel("If you wish to use the calculator click on below button and use our username and password to login");
		descr.setForeground(Color.WHITE);
		abt.setForeground(Color.WHITE);
		l1.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		l1.setFont(new Font("DIALOG",Font.BOLD,35));
		descr.setFont(new Font("Serif",Font.ITALIC,27));
		abt.setFont(new Font("Serif",Font.ITALIC,27));
		
		b1=new JButton(" GET STARTED");
	   b1.setFont(new Font("Sans Serif",Font.BOLD,17));
		b1.setBackground(Color.GRAY);
		b1.setForeground(Color.white);

		l3.setBounds(550,-130,600,500);
		l1.setBounds(500,0,900,600);
		descr.setBounds(260,45,1200,630);
		abt.setBounds(260,85,1200,630);
		b1.setBounds(610,500,190,50);
		ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("back.jpg"));
		JLabel img = new JLabel(logo);
		img.setBounds(2,0,1700,801);
		validate();
	  
       
		add(l3);
		add(l1);
		add(b1);
        add(descr);
        add(abt);
        add(img);		
		setSize(1500,800);
	    
        
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{

		
		new login();
			}


	});

	




	
}


	
	public static void main(String args[])
	{
		new welcome();
	}


	
}