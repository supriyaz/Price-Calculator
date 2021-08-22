import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class shop extends JFrame 
{
	JLabel l1,l2,l3,l4,l6; 	
	JTextField t1 ,t2,t3;
	JButton b1,b2;
	Choice c1,c2,c3,c4;
	public shop()
	{
		super("Calculate Price");
		setSize(1200,710);
		setLayout(null);
		ImageIcon icon =new ImageIcon("calculator.png");
		setIconImage(icon.getImage());		
        this.getContentPane();
		getContentPane().setBackground(Color.LIGHT_GRAY);
		JLabel msg =  new JLabel("Select Your Products");
		l1=new JLabel("Television");
		l6=new JLabel("Liters");
		t1=new JTextField();
		l2=new JLabel("Screen Size");
		l3=new JLabel("Quantity");
		l4=new JLabel("Refrigerator");
		b1=new JButton("Total");
		b2=new JButton("Exit");
		Font f1 = new Font("SERIF",Font.BOLD,50);
		Font f2 = new Font("SERIF",Font.PLAIN,40);
		Font f3 = new Font("SANS SERIF",Font.BOLD,40);
		
		msg.setFont(f1);
		l4.setFont(f2);
		l1.setFont(f2);
		l6.setFont(f2);
		l3.setFont(f2);
		l2.setFont(f2);
		b2.setFont(f3);
		b1.setFont(f3);
		t1.setFont(f2);
		
	    b1.setForeground(Color.black);
		b2.setForeground(Color.black);
		t2=new JTextField("0");
		t3=new JTextField("0");
		c1=new Choice();
		c1.add("Select product");
		c1.add("Samsung");
		c1.add("Sony");
		c2=new Choice();
		c2.add("Select Product");
		c2.add("Samsung");
		c2.add("LG");
		c3=new Choice();
		c3.add("Select Size");
		c3.add("32 inch");
		c3.add("43 inch");
		c4=new Choice();
		c4.add("Select Volume");
		c4.add("192liter");
		c4.add("253liter");
		msg.setBounds(350,115,700,40);
		
		l1.setBounds(300,250,400,40);
		l2.setBounds(550,250,300,40);
		l3.setBounds(800,250,300,40);
		c1.setBounds(310,300,200,300);
		c3.setBounds(550,300,200,300);
		t2.setBounds(440,150,50,30);
		l4.setBounds(300,350,400,44);
		l6.setBounds(550,350,300,40);
		c2.setBounds(310,400,200,300);
		c4.setBounds(550,400,200,300);
		t3.setBounds(830,300,70,30);
		t2.setBounds(830,400,70,30);
		t3.setBackground(Color.BLUE);
		t1.setBackground(Color.WHITE);
		t1.setForeground(Color.BLACK);
		t2.setBackground(Color.BLUE);
		t2.setForeground(Color.WHITE);
		t3.setForeground(Color.WHITE);
		c1.setBackground(Color.BLUE);
		c2.setBackground(Color.BLUE);
		c3.setBackground(Color.BLUE);
		c4.setBackground(Color.BLUE);
		c1.setForeground(Color.white);
		c2.setForeground(Color.white);
		c3.setForeground(Color.white);
		c4.setForeground(Color.white);
		b1.setBounds(300,500,250,50);
		b2.setBounds(750,500,250,50);
        Font f4 = new Font("Sans Serif",Font.PLAIN,20);
        c1.setFont(f4);
		c2.setFont(f4);
		c3.setFont(f4);
		c4.setFont(f4);
		//t1.setFont(f4);
		t2.setFont(f4);
		t3.setFont(f4);
		
		t1.setBounds(750,450,250,40);
		//t1.setFont(f4);

		add(l1);		
		add(l2);	
        
		add(l3);
		add(c1);
		add(c3);
		add(t2);
		add(l4); 		
		add(l6);
		add(c2);
		add(c4);
		add(t3);
		add(b1);
		
		add(t1);
		add(b2);
        add(msg);		
		setVisible(true);

	b1.addActionListener(new ActionListener()
	{
	
	public void actionPerformed(ActionEvent e)
	{
		String b,s,i,t;
		int  p,q1,RS,q2 ;
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		b=(String)c1.getSelectedItem();
		s=(String)c3.getSelectedItem();
		i=(String)c2.getSelectedItem();
		t=(String)c4.getSelectedItem();
		   q1=Integer.parseInt(t2.getText());
		   q2=Integer.parseInt(t3.getText());
		if(b.equals("Samsung")&&s.equals("32 inch")&&i.equals("Samsung")&&t.equals("192liter"))
		{					
		  RS=q1*30299;			
		  RS=RS+(q2*16490); 
		 t1.setText(Integer.toString(RS));

		}
		
		if(b.equals("Samsung")&&s.equals("43 inch")&&i.equals("Samsung")&&t.equals("253liter"))
		{					
		  RS=q1*39999;			
		  RS=RS+(q2*23490); 
		 t1.setText(Integer.toString(RS));

		}
	

	if(b.equals("Sony")&&s.equals("32 inch")&&i.equals("LG")&&t.equals("192liter"))
		{					
		  RS=q1*32299;			
		  RS=RS+(q2*14490); 
		 t1.setText(Integer.toString(RS));
		}

		if(b.equals("Sony")&&s.equals("43 inch")&&i.equals("LG")&&t.equals("253liter"))
		{					
		  RS=q1*44890;			
		  RS=RS+(q2*23490); 
		 t1.setText(Integer.toString(RS));

		}
		
		if(b.equals("Sony")&&s.equals("43 inch")&&i.equals("Samsung")&&t.equals("253liter"))
		{					
		  RS=q1*44890;			
		  RS=RS+(q2*23490); 
		 t1.setText(Integer.toString(RS));
		}
		
		if(b.equals("Samsung")&&s.equals("43 inch")&&i.equals("LG")&&t.equals("253liter"))
		{					
		  RS=q1*39999;			
		  RS=RS+(q2*23490); 
		 t1.setText(Integer.toString(RS));
		}

		if(b.equals("Samsung")&&s.equals("32 inch")&&i.equals("LG")&&t.equals("192liter"))
		{					
		  RS=q1*39999;			
		  RS=RS+(q2*14490); 
		 t1.setText(Integer.toString(RS));
		}

		if(b.equals("Sony")&&s.equals("32 inch")&&i.equals("Samsung")&&t.equals("192liter"))
		{					
		  RS=q1*32299;			
		  RS=RS+(q2*23490); 
		 t1.setText(Integer.toString(RS));

		}

		if(b.equals("Sony")&&s.equals("43 inch")&&i.equals("LG")&&t.equals("253liter"))
		{					
		  RS=q1*44890;			
		  RS=RS+(q2*23490); 
		 t1.setText(Integer.toString(RS));
		}
		
		if(b.equals("Sony")&&s.equals("43 inch")&&i.equals("LG")&&t.equals("192liter"))
		{					
		  RS=q1*39999;			
		  RS=RS+(q2*23490); 
		 t1.setText(Integer.toString(RS));

		}
		if(b.equals("Sony")&&s.equals("32 inch")&&i.equals("Samsung")&&t.equals("253liter"))
		{					
		  RS=q1*39999;			
		  RS=RS+(q2*23490); 
		 t1.setText(Integer.toString(RS));
		}
		
		if(b.equals("Sony")&&s.equals("43 inch")&&i.equals("Samsung")&&t.equals("192liter"))
		{					
		  RS=q1*44890;			
		  RS=RS+(q2*16490); 
		 t1.setText(Integer.toString(RS));

		}
		
		
		if(b.equals("Sony")&&s.equals("32 inch")&&i.equals("LG")&&t.equals("253liter"))
		{					
		  RS=q1*39999;			
		  RS=RS+(q2*23490); 
		 t1.setText(Integer.toString(RS));

			}
			

		}
	});
	
	b2.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
	{	
		System.exit(0);
	}
	});

	c1.addItemListener(new ItemListener()
	{
	public void itemStateChanged(ItemEvent  e)
	{
		
		
	}
	
	});
	c2.addItemListener(new ItemListener()
	{
	public void itemStateChanged(ItemEvent  e)
	{
		
		
	}
	
	});
	c3.addItemListener(new ItemListener()
	{
	public void itemStateChanged(ItemEvent  e)
	{
		
		
	}
	
	});
	c4.addItemListener(new ItemListener()
	{
	public void itemStateChanged(ItemEvent  e)
	{
		
		
	}
	
	});



}
	public static void main(String args[])
	{
		new shop();
	}
	
}		