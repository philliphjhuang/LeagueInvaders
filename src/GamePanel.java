import java.awt.Color;
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
	
	
	void updateMenuState() {
		
	}
	void updateGameState() {
		
	}
	void updateEndState() {
		
	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		
		g.fillRect(0,0, WIDTH,HEIGHT);    
		
	}
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0,0, 9999, 9999); 
	}
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0,0, 9999, 9999); 
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

if(currentState == MENU_STATE){

    updateMenuState();

}else if(currentState == GAME_STATE){

    updateGameState();

}else if(currentState == END_STATE){

    updateEndState();

}


	
	
	
	
	
}
@Override

public void paintComponent(Graphics g){
	GO.draw(g);
	
	if(currentState == MENU_STATE){

	    drawMenuState(g);

	}else if(currentState == GAME_STATE){

	    drawGameState(g);

	}else if(currentState == END_STATE){

	    drawEndState(g);

	}

        

}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub

}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub

	if(e.getKeyCode()==KeyEvent.VK_ENTER) {
		System.out.println(WIDTH+" "+HEIGHT);
		currentState ++;
	}
	
	if(currentState > END_STATE){
		
        currentState = MENU_STATE;
	}
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub

}




	
	
	
}
	





