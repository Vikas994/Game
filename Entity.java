package snake;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Entity {
	private int x,y,size;
	public Entity(int size){
		this.size=size;
	}
	public int getX(){
	return x;
}
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x=x;
	}
		public void setY(int y){
			this.y=y;
		}
		public void setPosition(int x,int y){
			this.x=x;
			this.y=y;
		}
		
		public void move(int mx,int my)
			{
				x += mx;
				y += my;
			}
		public Rectangle getBound(){
			return new Rectangle(x, y, size, size);
		}
		public boolean isCollision(Entity e){
			if(e == this) 
			return false;
			return getBound().intersects(e.getBound());
		}
		public void render(Graphics2D g2D){
			g2D.fillRect(x + 1, y + 1, size - 2, size - 2);
		}
}

