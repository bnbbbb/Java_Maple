package Monster;
import Character.*;
public class Slime extends Monster {
	//MonsterInfo m = new MonsterInfo();
	Phantom c = new Phantom();
	Slime(int hp, int maxhp, int attack, int defence, String name, int size){
		super(hp, maxhp, attack, defence, name, size);
	}
	public Slime() {
		this(2000, 2000,300, 300, "슬라임", 10);
	}
	
	public void attack(Phantom phantom) {
		System.out.println(this.name + "몸통박치기!");
		phantom.setHp(phantom.getHp() - (this.getAttack()-phantom.getDefence()));
		System.out.println("데미지는" + attack +"입니다.");
		System.out.println("팬텀 hp가 "+c.getHp()+"이(가) 되었습니다.");
	
	}
//	public void attacked(int sum)
//	{
//		if(defence > c.attack) {
//			hp =- 0;
//		}
//		else {
//			hp = hp + defence -c.attack;
//		}
//	}
}
