import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{ //add unimplement methods from r.click Player

	public Player(int x, int y, ID id) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillRect(x,y,32,32);
		
	}
	
	

}
