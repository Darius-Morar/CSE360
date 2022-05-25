//File 1

import javax.swing.*;
import java.awt.*;

public class ProjectOne extends JFrame {

	public static void main(String[] args) {
		ProjectOne po = new ProjectOne();
		po.setSize(500, 500);
		po.setVisible(true);
	}
	
	public ProjectOne() {
		GridLayout g = new GridLayout(3, 5);
		setLayout(g);
		JPanel[] p = new JPanel[15];
		
		int i;
		for(i = 0; i < 14; i++) {
			p[i] = new JPanel();
			add(p[i]);
		}
		
/*		JLabel label0 = new JLabel("hello");
		p[0].add(label0);
*/		
	}

}
