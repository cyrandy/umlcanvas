package shape;

public class Port {
	private int posX;
	private int posY;
	
	public Port(int x, int y){
		posX = x;
		posY = y;
	}
	public int getPosX(){
		return posX;
	}
	
	public int getPosY(){
		return posY;
	}
	
	public void setPosX(int newPosX){
		posX = newPosX;
	}
	
	public void setPosY(int newPosY){
		posY = newPosY;
	}
}
