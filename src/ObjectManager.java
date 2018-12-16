import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	Rocketship RS;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	
	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	
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
                addAlien(new Alien(new Random().nextInt(RS.width), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
        }
}
	
	
	
}
