package bggd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;

public class Main extends JFrame {
	double volume = 0.65 * 0.3 * 3;
	private JTextField input = new JTextField("");
	private JTextField pole = new JTextField("�������� ������ ��������� �� ���� ��������� ����������� - ������� 6");
	private JLabel label = new JLabel("��-220");
	private JButton button = new JButton("������");
	private JButton button2 = new JButton("����������");
	private JLabel label2 = new JLabel("�������� ���� ����������");
	private JLabel label3 = new JLabel("��������� ����� ����������");
	private JLabel label4 = new JLabel("��������� ������ ��������");
	private JLabel label9 = new JLabel("������� ���� ���������");
	private JLabel label5 = new JLabel("����� ��");
	private JLabel label6 = new JLabel("�������� ��������������� ����������� ����������� �����������");
	private JLabel label7 = new JLabel("");
	private JLabel label10 = new JLabel("");
	private JLabel label8 = new JLabel("");
	private JLabel label12 = new JLabel("");

	public Main() {

		super("BGGD");
		this.setBounds(0, 0, 780, 388);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new ButtonEventListener());
		
		 setContentPane(new JLabel(new ImageIcon("img.jpg")));
		 Container container = this.getContentPane();
		container.setLayout(new GridLayout(15, 1, 2, 2));
		
		container.add(label5);
		container.add(label6);
		container.add(label);
		
		container.add(label2);
		

		container.add(label3);
		

		container.add(label4);
		container.add(label7);

		container.add(label9);
		container.add(label10);

		container.add(input);
		

		container.add(button);
		container.add(button2);
		container.add(pole);
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schema m = new Schema();
				new Mnem();
				m.setVisible(true);
			}
		});
	}

	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				int a = 55 * Integer.parseInt(input.getText()) * 100 / 100;
				label8.setText("����� ��������������� �����: " + a + " ���. �.");
			}  catch (NumberFormatException use) {
				JOptionPane.showMessageDialog(Main.this, "���� ��������!");
				
			}
		}
			
		}
	

	public static void main(String[] args) {
		Main app = new Main();
		app.setVisible(true);
	}
}
class Schema extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Schema() {
		setBounds(100, 100, 700, 900);
		setResizable(false);
		setContentPane(new Mnem());
		getContentPane();
		setVisible(true);

	}
}

class Mnem extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		Image image = null;
		try {
			image = ImageIO.read(new File("����.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.paintComponent(g);
		g.drawImage(image, 0, 0, null);
	}
}
