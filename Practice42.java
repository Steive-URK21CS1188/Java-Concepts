import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Practice42 {
	public static void main(String[] args) {
		JFrame F=new JFrame("Window");
		F.setSize(500, 400);
		F.setVisible(true);
		F.setDefaultCloseOperation(F.EXIT_ON_CLOSE);
		F.setLayout(null);
		JLabel l=new JLabel("Enter Dollar:");
		l.setBounds(20, 70, 200, 20);
		F.add(l);
		JTextField t=new JTextField(10);
		t.setBounds(100, 75, 100, 20);
		F.add(t);
		JButton b=new JButton("Convert");
		b.setBounds(85, 100, 100, 25);
		F.add(b);
		JLabel l3=new JLabel("     ");
		l3.setFont(new Font("Arial",Font.ITALIC,20));
		l3.setForeground(Color.blue);
		l3.setBounds(85, 125, 250, 125);
		F.add(l3);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				double d=Double.parseDouble(t.getText());
				double c=d*82;
				JOptionPane.showMessageDialog(F, "Rs."+c);
				l3.setText("Rupees:"+String.valueOf(c));
			}
		});	
	}
}