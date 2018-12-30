import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
boolean up = false;
boolean down = false;
boolean right = false;
boolean left = false;
	int speed;	
	
		public Rocketship(int x, int y, int width, int height) {
			
			
			
			
			super(x, y, width, height);
			// TODO Auto-generated constructor stub
			speed = 5;
			
			
		} 

		void update() {
			super.update();
			if(up==true) {
				y-=speed;
			}
			if(down==true) {
				y+=speed;
			}
			if(right==true) {
				x+=speed;
			}
			if(left==true) {
				x-=speed;
			}
			
			if(x<=0) {
				x=0;
				left=false;
			} else if(x>=450) {
				x=450;
				right=false;
			}
			if(y<=0) {
				y=0;
				up=false;
			} else if(y>=750) {
				y=750;
				down=false;
			}
			
			
			
		}
		
		void draw(Graphics g) {
	        g.drawImage(GamePanel.rocketImg, x, y, width, height, null);


			
		}
		
	}
	
	

