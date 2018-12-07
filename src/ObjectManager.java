import java.awt.Graphics;

public class ObjectManager {

	Rocketship RS;
	
	
	
	
	public ObjectManager(Rocketship RS) {
	this.RS=RS;
		
		
		
	}
	void update() {
		RS.update();
	}
	void draw(Graphics g) {
		RS.draw(g);
	}
	
	
	
	
	
	
}
