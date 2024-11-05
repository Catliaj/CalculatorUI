package calculatorUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Calculator extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
    private double firstNum;
    private double secondNum;
    private String operator;
    private JTextField textField_1;
    private double result;
 	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/calculatorUI/calculator.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 823);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 671, 787);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 50));
		textField.setBounds(145, 147, 511, 99);
		panel.add(textField);
		textField.setColumns(10);
		
	    textField_1 = new JTextField();
	    textField_1.setFont(new Font("Times New Roman", Font.BOLD, 50));
	    textField_1.setColumns(10);
	    textField_1.setBounds(145, 10, 511, 99);
	    panel.add(textField_1);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn1.setBounds(10, 256, 85, 89);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText() + "1");
				 textField_1.setText(textField_1.getText() + "1");
			}
		});
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn2.setBounds(105, 256, 85, 89);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
				textField_1.setText(textField_1.getText() + "2");
			}
		});
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn3.setBounds(205, 256, 85, 89);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
				textField_1.setText(textField_1.getText() + "3");
			}
		});
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn4.setBounds(10, 355, 85, 89);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
				textField_1.setText(textField_1.getText() + "4");
			}
		});
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn5.setBounds(105, 355, 85, 89);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
				textField_1.setText(textField_1.getText() + "5");
			}
		});
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn6.setBounds(205, 355, 85, 89);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
				textField_1.setText(textField_1.getText() + "6");
			}
		});
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn7.setBounds(10, 454, 85, 89);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
				textField_1.setText(textField_1.getText() + "7");
			}
		});
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn8.setBounds(105, 454, 85, 89);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
				textField_1.setText(textField_1.getText() + "8");
			}
		});
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn9.setBounds(205, 454, 85, 89);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
				textField_1.setText(textField_1.getText() + "9");
			}
		});
		panel.add(btn9);
		
		JButton dot = new JButton(".");
		dot.setFont(new Font("Tahoma", Font.BOLD, 24));
		dot.setBounds(10, 553, 85, 89);
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			
			}
		});
		panel.add(dot);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn0.setBounds(105, 553, 85, 89);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
				textField_1.setText(textField_1.getText() + "0");
			}
		});
		panel.add(btn0);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(205, 553, 85, 89);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		panel.add(btnClear);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPlus.setBounds(300, 454, 170, 188);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	              firstNum = Double.parseDouble(textField.getText());
	              operator = "+";
	              textField.setText("");
	              textField_1.setText(textField_1.getText() + " + ");
			}
		});
		panel.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnMinus.setBounds(300, 256, 170, 188);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	              firstNum = Double.parseDouble(textField.getText());
	              operator = "-";
	              textField.setText(" ");
	              textField_1.setText(textField_1.getText() + " - ");
	           ;
			}
		});
		panel.add(btnMinus);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDivide.setBounds(480, 256, 174, 188);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	              firstNum = Double.parseDouble(textField.getText());
	              operator = "/";
	              textField.setText("");
	              textField_1.setText(textField_1.getText() + " / ");
			}
		});
		panel.add(btnDivide);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnMultiply.setBounds(480, 454, 174, 188);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	              firstNum = Double.parseDouble(textField.getText());
	              operator = "x";
	              textField.setText("");
	              textField_1.setText(textField_1.getText() + " x ");
			}
		});
		panel.add(btnMultiply);
		
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnEqual.setBounds(10, 652, 646, 115);
        btnEqual.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                secondNum =Double.parseDouble(textField.getText());
             

                switch (operator) {
                    case "+":
                        result = firstNum + secondNum;
                        break;
                    case "-":
                        result = firstNum - secondNum;
                        break;
                    case "x":
                        result = firstNum * secondNum;
                        break;
                    case "/":
                        if (secondNum != 0) {
                            result = firstNum / secondNum;
                        } else {
                            textField.setText("Error: Division by 0");
                            return;
                        }
                        break;
                }
                
                textField_1.setText(textField_1.getText() + " = ");
                textField.setText(String.valueOf(result));
                textField_1.setText(textField_1.getText() + result);
            }
        });
      panel.add(btnEqual);
      
      JLabel lblNewLabel = new JLabel("CALCULATION:");
      lblNewLabel.setForeground(Color.WHITE);
      lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
      lblNewLabel.setBackground(Color.WHITE);
      lblNewLabel.setBounds(10, 10, 125, 99);
      panel.add(lblNewLabel);
      
      JLabel lblInput = new JLabel("INPUT:");
      lblInput.setForeground(Color.WHITE);
      lblInput.setFont(new Font("Times New Roman", Font.BOLD, 30));
      lblInput.setBounds(10, 147, 125, 99);
      panel.add(lblInput);
      

      
		
	}
}
