import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frmScientificCalculator;
	private JTextField textField;

	double first;
	double second;
	double result;
	String operaction;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmScientificCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScientificCalculator = new JFrame();
		frmScientificCalculator.getContentPane().setBackground(new Color(0, 0, 0));
		frmScientificCalculator.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 15));
		frmScientificCalculator.setTitle("Scientific Calculator");
		frmScientificCalculator.setBounds(100, 100, 413, 554);
		frmScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScientificCalculator.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBackground(new Color(209, 209, 209));
		textField.setFont(new Font("Yu Gothic Medium", Font.BOLD, 27));
		textField.setBounds(10, 11, 376, 75);
		frmScientificCalculator.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setBackground(new Color(206, 206, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 97, 82, 50);
		frmScientificCalculator.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.setBackground(new Color(206, 206, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1 / (Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_1.setBounds(10, 158, 82, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("x^y");
		btnNewButton_2.setBackground(new Color(206, 206, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operaction = "x^y";
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_2.setBounds(10, 225, 128, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("x^3");
		btnNewButton_3.setBackground(new Color(206, 206, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_3.setBounds(11, 281, 129, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("x^2");
		btnNewButton_4.setBackground(new Color(206, 206, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_4.setBounds(11, 337, 129, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("n!");
		btnNewButton_5.setBackground(new Color(206, 206, 255));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while (a != 0) {
					fact = fact * a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText() + fact);
			}
		});
		btnNewButton_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_5.setBounds(11, 394, 129, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_5);

		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setBackground(new Color(206, 206, 255));
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a * (-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnPlusMinus.setBounds(11, 449, 129, 52);
		frmScientificCalculator.getContentPane().add(btnPlusMinus);

		JButton btnNewButton_7 = new JButton("e^x");
		btnNewButton_7.setBackground(new Color(206, 206, 255));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_7.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_7.setBounds(97, 96, 62, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.setBackground(new Color(206, 206, 255));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(97, 158, 61, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_1);

		JButton btnPercent = new JButton("%");
		btnPercent.setBackground(new Color(206, 206, 255));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operaction = "%";
			}
		});
		btnPercent.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnPercent.setBounds(150, 223, 51, 52);
		frmScientificCalculator.getContentPane().add(btnPercent);

		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(216, 253, 198));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(150, 278, 51, 52);
		frmScientificCalculator.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(216, 253, 198));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(150, 334, 51, 52);
		frmScientificCalculator.getContentPane().add(btn4);

		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(216, 253, 198));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(150, 391, 51, 52);
		frmScientificCalculator.getContentPane().add(btn1);

		JButton btnNewButton_8 = new JButton("Sin");
		btnNewButton_8.setBackground(new Color(255, 213, 170));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_8.setBounds(162, 96, 62, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_8);

		JButton btnNewButton_1_2 = new JButton("Sinh");
		btnNewButton_1_2.setBackground(new Color(255, 213, 170));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(162, 158, 62, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_2);

		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(253, 198, 211));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnClear.setBounds(211, 223, 51, 52);
		frmScientificCalculator.getContentPane().add(btnClear);

		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(216, 253, 198));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(211, 278, 51, 52);
		frmScientificCalculator.getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(216, 253, 198));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(211, 334, 51, 52);
		frmScientificCalculator.getContentPane().add(btn5);

		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(216, 253, 198));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(211, 391, 51, 52);
		frmScientificCalculator.getContentPane().add(btn2);

		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(216, 253, 198));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(150, 446, 112, 52);
		frmScientificCalculator.getContentPane().add(btn0);

		JButton btnNewButton_9 = new JButton("Cos");
		btnNewButton_9.setBackground(new Color(255, 213, 170));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_9.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_9.setBounds(225, 96, 69, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_1_3 = new JButton("Cosh");
		btnNewButton_1_3.setBackground(new Color(255, 213, 170));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_1_3.setBounds(225, 158, 69, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_3);

		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.setBackground(new Color(253, 198, 211));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;

				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnBackSpace.setBounds(272, 223, 51, 52);
		frmScientificCalculator.getContentPane().add(btnBackSpace);

		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(216, 253, 198));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(272, 278, 51, 52);
		frmScientificCalculator.getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(216, 253, 198));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(272, 334, 51, 52);
		frmScientificCalculator.getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(216, 253, 198));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(272, 391, 51, 52);
		frmScientificCalculator.getContentPane().add(btn3);

		JButton btnDot = new JButton(".");
		btnDot.setBackground(new Color(216, 253, 198));
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(272, 446, 51, 52);
		frmScientificCalculator.getContentPane().add(btnDot);

		JButton btnNewButton_10 = new JButton("Tan");
		btnNewButton_10.setBackground(new Color(255, 213, 170));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_10.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_10.setBounds(297, 96, 89, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_10);

		JButton btnNewButton_1_4 = new JButton("Tanh");
		btnNewButton_1_4.setBackground(new Color(255, 213, 170));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnNewButton_1_4.setBounds(297, 158, 89, 52);
		frmScientificCalculator.getContentPane().add(btnNewButton_1_4);

		JButton btnAdd = new JButton("+");
		btnAdd.setBackground(new Color(206, 206, 255));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operaction = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(333, 223, 51, 52);
		frmScientificCalculator.getContentPane().add(btnAdd);

		JButton btnSub = new JButton("-");
		btnSub.setBackground(new Color(206, 206, 255));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operaction = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSub.setBounds(333, 277, 51, 52);
		frmScientificCalculator.getContentPane().add(btnSub);

		JButton btnMul = new JButton("*");
		btnMul.setBackground(new Color(206, 206, 255));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operaction = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMul.setBounds(333, 333, 51, 52);
		frmScientificCalculator.getContentPane().add(btnMul);

		JButton btnDevide = new JButton("/");
		btnDevide.setBackground(new Color(206, 206, 255));
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operaction = "/";
			}
		});
		btnDevide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDevide.setBounds(333, 390, 51, 52);
		frmScientificCalculator.getContentPane().add(btnDevide);

		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(206, 206, 255));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());

				if (operaction == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operaction == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operaction == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operaction == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operaction == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operaction == "x^y") {
					double result2 = 1;
					for (int i = 0; i < second; i++) {
						result2 = first*result2;
					}

					answer = String.format("%.2f", result2);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEqual.setBounds(333, 445, 51, 52);
		frmScientificCalculator.getContentPane().add(btnEqual);
	}
}
