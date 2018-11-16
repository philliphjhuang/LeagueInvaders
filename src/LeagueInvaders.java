import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {

	JFrame frame;
	final int WIDTH = 500; 
	final int HEIGHT = 800;
	GamePanel GP;
	
public LeagueInvaders() {
	
	
	frame = new JFrame();
	GP = new GamePanel();
	
}
	
public static void main(String[] args) {
	LeagueInvaders LI = new LeagueInvaders();
	LI.setUp();
	
	
}	

	void setUp() {
		
		frame.add(GP);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH,HEIGHT));
		frame.pack();
		GP.startGame();
		frame.addKeyListener(GP);
		
		
	}
	
	
	
	
	
	
	
}



















