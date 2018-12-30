import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	Rocketship RS;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	
	long enemyTimer = 0;
	int enemySpawnTime = 1500;
	int score = 0;
	
	public ObjectManager(Rocketship RS) {
	this.RS=RS;
		
		
		
	}
	void update() {
		RS.update();
		for(Projectile p: projectiles){
			p.update();
		}
		for(Alien a: aliens){
			a.update();
		}
		
		
	}
	void draw(Graphics g) {
		RS.draw(g);
		for(Projectile p: projectiles){
			p.draw(g);
		}
		for(Alien a: aliens){
			a.draw(g);
		}
	}
	
	void addProjectile(Projectile projectileObjects){
		projectiles.add(projectileObjects);
		
		
	}
	void addAlien(Alien alienObjects){
		aliens.add(alienObjects);
		
		
	}
	
	public void manageEnemies(){
        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
        			
                addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
        }
}
	
	
	void purgeObjects() {
    	for(int i = 0; i < aliens.size(); i++) {
    		if(aliens.get(i).isAlive==false) {
    			aliens.remove(i);
    		}
    	}
    	for(int i = 0; i< projectiles.size(); i++) {
    		if(projectiles.get(i).isAlive==false) {
    			projectiles.remove(i);
    		}
   	
    }
	}
	
	public int getScore() {
		
		return score;
	}
	
	void checkCollsion() {
		for(Alien a : aliens){

	        if(RS.collisionBox.intersects(a.collisionBox)) {

	                RS.isAlive = false;
	                

	        }
	    for(Projectile p : projectiles) {
	        if(p.collisionBox.intersects(a.collisionBox)) {
	        	score++;
	        p.isAlive=false;
	        a.isAlive=false;
	        }
	}
	}
	}
	
	
	
	
	
	
	
}















