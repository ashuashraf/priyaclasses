package trainig;

public class Mammal extends Animal {
	
	

	public Mammal(String type,String sound) {

	this.type=type;
	this.sound=sound;
	}

	public Mammal() {
		super();
		
	}

	
	@Override
	public String toString() {
		return "Mammal [type=" + type + ", sound=" + sound + ", getType()=" + getType() + ", getSound()=" + getSound()+
				 "]";
	}

	@Override
	public void setType(String type) {
		super.type=type;
				
	}

	@Override
	public String getType() {
		
		return type;
	}

	@Override
	public void setSound(String sound) {
		super.sound=sound;
	}

	@Override
	public String getSound() {
		
		return sound;
	}

	
}