package Character;


import java.util.Scanner;

import Monster.Monster;


public class Phantom extends Character {
	
	Phantom(int level, int hp, int attack, int defence, int maxattack, int maxhp){
		super(level, hp, attack, defence, maxattack, maxhp);
	}
	
	public Phantom() {
		this(1, 500, 400, 200, 400, 500);
		
	}

	
public void attack(Monster monster)
{
	monster.setHp(monster.getHp()-this.getAttack());
	
}
public void LevelUp(int n) { //임의로 
//	level += n;
//	hp += 500*n;
//	attack += 300*n;
//	defence += 100*n;
	this.setHp(this.getHp()*n);
	this.attack += 400*n;
			
	this.level += n;
//	this.hp = hp*n;
//	this.attack += 300*n;
	this.maxattack = this.attack;
	this.defence += 100*n;
	System.out.println("level "+"+"+ n+"up\t" +level+"level이 되었습니다.");
	}
//public void attacked(int attack)
//{
//	if(defence > attack) {
//		hp =- 0;
//	}
//	else {
//		hp = hp + defence -attack;
//	}
//}

}
