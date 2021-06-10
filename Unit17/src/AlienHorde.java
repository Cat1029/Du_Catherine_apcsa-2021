//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for(int i = 0; i < size; i++)
		{
			if(i == 0) {
				add(new Alien(0, 0, 2));
			}
			else if(aliens.get(i-1).getX()>=800) {
				add(new Alien(0, aliens.get(i-1).getY() + aliens.get(i-1).getHeight(), 2));
			}
			else {
				add(new Alien(aliens.get(i-1).getX() + 50, 0, 2));
			}
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien al : aliens)
		{
			al.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien al : aliens) {
			if( al.getX() + al.getWidth() + al.getSpeed() >= 800) {
				al.setSpeed(-al.getSpeed());
				al.setY(al.getY() + al.getHeight());
			}
				
			//collides with right wall	
			if((al.getX() + al.getSpeed() <= 0))
			{
				al.setSpeed(-al.getSpeed());
				al.setY(al.getY() + al.getHeight());
			}
			al.move("RIGHT");
			
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i = 0; i < aliens.size(); i++) {
			for (int j = 0; j < shots.size(); j++) {
				if ((shots.get(j).getX() > aliens.get(i).getX() 
						&& shots.get(j).getX() < (aliens.get(i).getX() + aliens.get(i).getWidth())) 
						&& (shots.get(j).getY() > aliens.get(i).getY() 
						&& shots.get(j).getY() < (aliens.get(i).getY() + aliens.get(i).getHeight()))) {
					shots.remove(j);
					aliens.remove(i);
					if (i<0) {
						break;
					}					
				}				
			}
		}
	}
	
	public boolean collide(Ship s) {
		for(Alien a: aliens) {
			if(s.getX()<=a.getX() && s.getY()<a.getY()) {
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		return "";
	}
}
