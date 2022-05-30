package Monster;
import Character.*;
public class Monster {
	
//	Phantom c = new Phantom();
	public int hp;
	public int maxhp;
	public int attack;
	public int defence;
	public String name;
	public int size;
	Monster(int hp, int maxhp,int attack, int defence, String name, int size){
		this.hp = hp;
		this.maxhp = maxhp;
		this.attack = attack;
		this.defence = defence;
		this.name = name;
		this.size = size;
	}
//	public int attack() {
//		return damage;
//	}
//	public void attacked(int damage)
//	{
//		if(armor > c.sum) {
//			hp =- 0;
//		}
//		else {
//			hp = hp + armor -c.sum;
//		}
//	}
//	public void attack(Phantom ph);
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMaxhp() {
		return maxhp;
	}
	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
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
}
