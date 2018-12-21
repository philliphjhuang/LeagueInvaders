import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{

	
	
	
	
	public Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	void update(){
		super.update();
	y+=3;
	
	
	}
	
	void draw(Graphics g){
	g.setColor(Color.PINK);
	g.fillRect(x, y, width, height);
		
	}
	
	
}
