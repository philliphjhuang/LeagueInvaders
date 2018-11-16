import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	
	Timer timer;
	GameObject GO;
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;
	
	int currentState = MENU_STATE;
	
	void updateState() {
	Part 6, step 4	
		
	}
	
	public GamePanel() {
		
		GO = new GameObject(10,10,100,100);


	timer = new Timer(1000/60,this);
	

	
	
	

	}
void startGame() {
	timer.start();
	
	
}
	



	
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
repaint();
GO.update();
repaint();
	
	
	
	
	
	
}
@Override

public void paintComponent(Graphics g){
	GO.draw(g);
        

}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("aaa");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("aaa");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("aaa");
}




	
	
	
}
	





