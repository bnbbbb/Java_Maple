package Monster;
import Character.*;
public class Slime extends Monster {
	//MonsterInfo m = new MonsterInfo();
	Phantom c = new Phantom();
	Slime(int hp, int maxhp, int attack, int defence, String name, int size){
		super(hp, maxhp, attack, defence, name, size);
	}
	public Slime() {
		this(2000, 2000,300, 300, "������", 10);
	}
	
	public void attack(Phantom phantom) {
		System.out.println(this.name + "�����ġ��!");
		phantom.setHp(phantom.getHp() - (this.getAttack()-phantom.getDefence()));
		System.out.println("��������" + attack +"�Դϴ�.");
		System.out.println("���� hp�� "+c.getHp()+"��(��) �Ǿ����ϴ�.");
	
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
