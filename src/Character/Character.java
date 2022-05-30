package Character;

public abstract class Character {
	public String name;
	public int hp;
	public int level;
	public int defence;
	public int attack;
	public int maxattack;
	public int maxhp;
	
	public Character(int level, int hp, int attack, int defence, int maxattack, int maxhp){
		this.hp = hp;
		this.level = level;
		this.attack = attack;
		this.defence = defence;
		this.maxattack = maxattack;
		this.maxhp = maxhp;

	}
	public void status() {
		System.out.println("Level : "+level);
		System.out.println("HP : "+hp);
		System.out.println("attack : "+attack);
		System.out.println("defence : "+defence);
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getMaxAttack() {
		return maxattack;
	}
	public void setMaxAttack(int maxattack) {
		this.maxattack = maxattack;
	}
	public int getMaxHp() {
		return hp;
	}
	public void setMaxHp( int maxhp) {
		this.maxhp = maxhp;
	}
//	abstract void LevelUp(); 
	
//	Stack inventory = new Stack<>();
	



//public int attack()
//{
//	return attack;
//}
//public void attacked(int damage)
//{
//	if(defense > damage) {
//		hp =- 0;
//	}
//	else {
//		hp = hp + defense -damage;
//	}
//}
}
