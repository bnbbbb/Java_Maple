package Boss;

public abstract class Boss {
	public int hp, damage, armor;
	
	
	Boss(int hp, int damage, int armor){
		this.hp =hp;
		this.damage=damage;
		this.armor=armor;
	}
	public int attack() {
		return damage;
	}
}
class SlimeKing extends Boss {
	SlimeKing(){
		super(1000, 300, 300);//¼öÄ¡·Î 
	}
}
