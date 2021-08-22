import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
class login extends JFrame 
{
	JLabel user,password,login,l4;   
	JTextField t1;
	JButton log,reset;     
	JPasswordField t2;
	ImageIcon image1;  
	JCheckBox c1;
	
	
     public login()
      {
		  
	 	setTitle("Login Screen");
		setLayout(null);
	    
        ImageIcon icon =new ImageIcon("avatar.png");
		setIconImage(icon.getImage());		
        this.getContentPane();		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		login=new JLabel(" USER LOGIN");
		login.setFont(new Font("ARIAL",Font.BOLD,28));
		
		user=new JLabel(" Enter Username");
		password=new JLabel(" Enter Password");
		
		image1=new ImageIcon("avatar.png");
		l4=new JLabel(image1);
		
		log=new JButton("Login");
		reset=new JButton("Reset");
		
		t1=new JTextField();
		t2=new JPasswordField();
		
		c1 = new JCheckBox("Show Password");
		c1.setFont(new Font("Arial",Font.PLAIN,15));
		
		user.setFont(new Font("Arial",Font.PLAIN,18));
		password.setFont(new Font("Arial",Font.PLAIN,18));
		
		log.setFont(new Font("Arial",Font.BOLD,20));
		
		reset.setFont(new Font("Arial",Font.BOLD,20));
		log.setBackground(Color.GRAY);
		reset.setBackground(Color.GRAY);
        c1.setBackground(Color.LIGHT_GRAY);
		
		user.setBounds(400,200,150,20);
		password.setBounds(400,280,150,20);
		
		t1.setBounds(405,225,360,27);
		t2.setBounds(405,300,360,27);
		
		log.setBounds(625,390,140,40);
		reset.setBounds(400,390,140,40);
		 
		l4.setBounds(-25,80,450,450);
		
		
		login.setBounds(490,110,400,40);
	    c1.setBounds(405, 335, 150, 30);
	    
		
		add(l4);	
		add(login);
		add(password);
		add(user);
		add(t1);    		
		add(t2);
		add(c1);
		add(log);
		add(reset) ; 
		
		setSize(1200,690);
		setVisible(true);
	
	
		log.addActionListener(new ActionListener()
		{
		
			public void actionPerformed(ActionEvent e)
			{
				String un,pw;
			un=t1.getText();
			pw=t2.getText();		
			if(un.equals("")|| pw.equals(""))
			
			JOptionPane.showMessageDialog(null,"enter User Name and Password");
				
			else if(un.equals("project")&&pw.equals("1234"))
			{
			JOptionPane.showMessageDialog(null, "Login Successful");
			new shop();
			
			}
			else
				JOptionPane.showMessageDialog(null," invalid password or username");
			
			

      
		} 
		 
		});
		
		 reset.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) {  
		 if (e.getSource() == reset) {
            t1.setText("");
            t2.setText("");
		 }
		}
		});
		
		c1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) {
		if (e.getSource() == c1) {
            if (c1.isSelected()) {
                t2.setEchoChar((char) 0);
            } else {
                t2.setEchoChar('*');
            }
 
		}
		}
		});
		
		
		
		
}	
   
	


	public static void main(String args[])
		{
	
		login e=new login();
		}
		
}		
		
	





    