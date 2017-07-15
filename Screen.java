import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Screen extends JFrame
{


	private Rational ratio;
	private Container contentPane;
	private JButton divideJButton,multiplyJButton,addJButton,subtractJButton,equalsJButton;
	private JPanel equationJPanel,operationJPanel,numberJPanel;
	private JTextField numOneJTextField,numTwoJTextField,numThreeJTextField,deOneJTextField,deTwoJTextField,deThreeJTextField,signJTextField,equalsJTextField;
	private JLabel line1JLabel,line2JLabel,line3JLabel;

	int x = 0;
	
	public Screen()
	
	{
		
		int n = 0;
		int d = 0;
		ratio = new Rational( n,d);
		
		 n = ratio.getNumerator();
		 d = ratio.getDenominator();
		
		constructUserInterface();
		
	}
	
	public void constructUserInterface()
	
	{
		
		contentPane = getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.GRAY);
		
		
		
		
		//First part
		numOneJTextField = new JTextField("");
		numOneJTextField.setFont(new Font ("Times New Roman",Font.BOLD,20));
		numOneJTextField.setForeground(Color.black);
		numOneJTextField.setHorizontalAlignment(JTextField.CENTER);
		numOneJTextField.setBounds(30,40,50,25);
		contentPane.add(numOneJTextField);
		
		line1JLabel = new JLabel("-----");
		line1JLabel.setFont(new Font ("Times New Roman",Font.BOLD,30));
		line1JLabel.setForeground(Color.black);
		line1JLabel.setBounds(30,60,50,25);
		contentPane.add(line1JLabel);
		
		deOneJTextField = new JTextField("");
		deOneJTextField.setFont(new Font ("Times New Roman",Font.BOLD,20));
		deOneJTextField.setForeground(Color.black);
		deOneJTextField.setHorizontalAlignment(JTextField.CENTER);
		deOneJTextField.setBounds(30,80,50,25);
		contentPane.add(deOneJTextField);
		
		//second part
		
		signJTextField = new JTextField("");
		signJTextField.setEditable(false);
		signJTextField.setFont(new Font ("Times New Roman",Font.BOLD,30));
		signJTextField.setForeground(Color.black);
		signJTextField.setHorizontalAlignment(JTextField.CENTER);
		signJTextField.setBounds(100,60,50,25);
		contentPane.add(signJTextField);
		
		//third part
		numTwoJTextField = new JTextField("");
		numTwoJTextField.setFont(new Font ("Times New Roman",Font.BOLD,20));
		numTwoJTextField.setForeground(Color.black);
		numTwoJTextField.setHorizontalAlignment(JTextField.CENTER);
		numTwoJTextField.setBounds(175,40,50,25);
		contentPane.add(numTwoJTextField);
		
		line2JLabel = new JLabel("-----");
		line2JLabel.setFont(new Font ("Times New Roman",Font.BOLD,30));
		line2JLabel.setForeground(Color.black);
		line2JLabel.setBounds(175,60,50,25);
		contentPane.add(line2JLabel);
		
		deTwoJTextField = new JTextField("");
		deTwoJTextField.setFont(new Font ("Times New Roman",Font.BOLD,20));
		deTwoJTextField.setForeground(Color.black);
		deTwoJTextField.setHorizontalAlignment(JTextField.CENTER);
		deTwoJTextField.setBounds(175,80,50,25);
		contentPane.add(deTwoJTextField);
		
		//fourth part
		equalsJTextField = new JTextField("=");
		equalsJTextField.setFont(new Font ("Times New Roman",Font.BOLD,30));
		equalsJTextField.setForeground(Color.black);
		equalsJTextField.setHorizontalAlignment(JTextField.CENTER);
		equalsJTextField.setBounds(250,60,50,25);
		contentPane.add(equalsJTextField);
		
		//fifth part
		numThreeJTextField = new JTextField("");
		numThreeJTextField.setFont(new Font ("Times New Roman",Font.BOLD,20));
		numThreeJTextField.setForeground(Color.black);
		numThreeJTextField.setHorizontalAlignment(JTextField.CENTER);
		numThreeJTextField.setBounds(320,40,50,25);
		contentPane.add(numThreeJTextField);
				
		line3JLabel = new JLabel("-----");
		line3JLabel.setFont(new Font ("Times New Roman",Font.BOLD,30));
		line3JLabel.setForeground(Color.black);
		line3JLabel.setBounds(320,60,50,25);
		contentPane.add(line3JLabel);
				
		deThreeJTextField = new JTextField("");
		deThreeJTextField.setFont(new Font ("Times New Roman",Font.BOLD,20));
		deThreeJTextField.setForeground(Color.black);
		deThreeJTextField.setHorizontalAlignment(JTextField.CENTER);
		deThreeJTextField.setBounds(320,80,50,25);
		contentPane.add(deThreeJTextField);
		
		//Equations
		
		divideJButton = new JButton();
		divideJButton.setText("÷");
		divideJButton.setFont(new Font ("Times New Roman",Font.BOLD,30));
		divideJButton.setForeground(Color.GRAY);
		divideJButton.setBounds(30,475,50,50);
		contentPane.add(divideJButton);
		
		divideJButton.addActionListener(
				
				new ActionListener()
				
				{
					
					public void actionPerformed(ActionEvent event)
					
					{
						
						x = 4;
						signJTextField.setText("÷");
						
						
					}
					
				}
				
			);
		
		multiplyJButton = new JButton();
		multiplyJButton.setText("X");
		multiplyJButton.setFont(new Font ("Times New Roman",Font.BOLD,30));
		multiplyJButton.setForeground(Color.GRAY);
		multiplyJButton.setBounds(100,475,50,50);
		contentPane.add(multiplyJButton);
		
		multiplyJButton.addActionListener(
				
				new ActionListener()
				
				{
					
					public void actionPerformed(ActionEvent event)
					
					{
						
						x = 3;
						signJTextField.setText("X");
						
					}
					
				}
				
			);
		
		subtractJButton = new JButton();
		subtractJButton.setText("-");
		subtractJButton.setFont(new Font ("Times New Roman",Font.BOLD,30));
		subtractJButton.setForeground(Color.GRAY);
		subtractJButton.setBounds(170,475,50,50);
		contentPane.add(subtractJButton);
		
		subtractJButton.addActionListener(
				
				new ActionListener()
				
				{
					
					public void actionPerformed(ActionEvent event)
					
					{
						
						x = 2;
						signJTextField.setText("-");
						
					}
					
				}
				
			);
		
		addJButton = new JButton();
		addJButton.setText("+");
		addJButton.setFont(new Font ("Times New Roman",Font.BOLD,30));
		addJButton.setForeground(Color.GRAY);
		addJButton.setBounds(240,475,50,50);
		contentPane.add(addJButton);
		
		addJButton.addActionListener(
				
				new ActionListener()
				
				{
					
					public void actionPerformed(ActionEvent event)
					
					{
						
						x = 1;
						signJTextField.setText("+");
						
					}
					
				}
				
			);
		
		equalsJButton = new JButton();
		equalsJButton.setBounds(310,475,50,50);
		equalsJButton.setFont(new Font("Times New Roman",Font.PLAIN,30));
		equalsJButton.setText("=");
		contentPane.add(equalsJButton);
		equalsJButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(x == 0)
				{
					JOptionPane.showMessageDialog(null, "You Have To Select A Mathematical Sign!!"
							+ "", "ERROR!!", JOptionPane.ERROR_MESSAGE);
				}
				
				else
				{
					if(numOneJTextField.getText().isEmpty() || numTwoJTextField.getText().isEmpty() || deOneJTextField.getText().isEmpty() ||deTwoJTextField.getText().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "You Forgot To Fill Out A Field!!"
								+ "", "ERROR!!", JOptionPane.ERROR_MESSAGE);
					}
					//Something in the fields
					else
					{
						if(x == 1)
						{
							int n1= Integer.parseInt(numOneJTextField.getText());
							int d1= Integer.parseInt(deOneJTextField.getText());
							int n2= Integer.parseInt(numTwoJTextField.getText());
							int d2= Integer.parseInt(deTwoJTextField.getText());
							Rational r1 = new Rational(n1, d1);
							Rational r2 = new Rational(n2, d2);
							Rational r3= new Rational(1,1);
							r3=r1.add(r1,  r2);
							System.out.println(r3.add(r1,  r2));
							int n3= r3.getNumerator();
							int d3 = r3.getDenominator();
							numThreeJTextField.setText(Integer.toString(n3));
							deThreeJTextField.setText(Integer.toString(d3));
						}
						else if(x == 2)
						{
							int n1= Integer.parseInt(numOneJTextField.getText());
							int d1= Integer.parseInt(deOneJTextField.getText());
							int n2= Integer.parseInt(numTwoJTextField.getText());
							int d2= Integer.parseInt(deTwoJTextField.getText());
							Rational r1 = new Rational(n1, d1);
							Rational r2 = new Rational(n2, d2);
							Rational r3= new Rational(1,1);
							r3=r1.subtract(r1,  r2);
							System.out.println(r3.subtract(r1,  r2));
							int n3= r3.getNumerator();
							int d3 = r3.getDenominator();
							numThreeJTextField.setText(Integer.toString(n3));
							deThreeJTextField.setText(Integer.toString(d3));
						}
						else if(x == 3)
						{
							int n1= Integer.parseInt(numOneJTextField.getText());
							int d1= Integer.parseInt(deOneJTextField.getText());
							int n2= Integer.parseInt(numTwoJTextField.getText());
							int d2= Integer.parseInt(deTwoJTextField.getText());
							Rational r1 = new Rational(n1, d1);
							Rational r2 = new Rational(n2, d2);
							Rational r3= new Rational(1,1);
							r3=r1.multiply(r1,  r2);
							System.out.println(r3.multiply(r1,  r2));
							int n3= r3.getNumerator();
							int d3 = r3.getDenominator();
							numThreeJTextField.setText(Integer.toString(n3));
							deThreeJTextField.setText(Integer.toString(d3));
						}
						else if(x == 4)
						{
							int n1= Integer.parseInt(numOneJTextField.getText());
							int d1= Integer.parseInt(deOneJTextField.getText());
							int n2= Integer.parseInt(numTwoJTextField.getText());
							int d2= Integer.parseInt(deTwoJTextField.getText());
							Rational r1 = new Rational(n1, d1);
							Rational r2 = new Rational(n2, d2);
							Rational r3= new Rational(1,1);
							r3=r1.divide(r1,  r2);
							System.out.println(r3.divide(r1,  r2));
							int n3= r3.getNumerator();
							int d3 = r3.getDenominator();
							numThreeJTextField.setText(Integer.toString(n3));
							deThreeJTextField.setText(Integer.toString(d3));
						}
					}
				}
				
			}
		}
		  
		);
		
		//JPanels
		
		equationJPanel = new JPanel();
		equationJPanel.setForeground(Color.BLACK);
		equationJPanel.setBounds(25,25,350,100);
		contentPane.add(equationJPanel);
		
		operationJPanel = new JPanel();
		operationJPanel.setForeground(Color.BLACK);
		operationJPanel.setBounds(25,150,350,275);
		contentPane.add(operationJPanel);
		
		numberJPanel = new JPanel();
		numberJPanel.setForeground(Color.BLACK);
		numberJPanel.setBounds(25,450,350,100);
		contentPane.add(numberJPanel);
		
		this.setTitle("Calculator");
		this.setVisible(true);
		this.setSize(400,600);
		this.setResizable(true);
		
	}
	
	public static void main(String[] args) 
	{
		
		Screen app = new Screen();
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}

}

