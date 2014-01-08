package shape;

public class BasicObject extends UMLObject {
	protected Port portUP;
	protected Port portDOWN;
	protected Port portLEFT;
	protected Port portRIGHT;
	
	public Port getPortUP() {
		return portUP;
	}
	public Port getPortDOWN() {
		return portDOWN;
	}
	public Port getPortLEFT() {
		return portLEFT;
	}
	public Port getPortRIGHT() {
		return portRIGHT;
	}
}
