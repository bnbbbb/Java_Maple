package Battle;
import Character.*;
import Monster.Slime;
import java.util.*;
public class Battle {
	Phantom ph = new Phantom();
	Slime sl = new Slime();
	
	public void battle() {
		System.out.println(sl.hp);
		Scanner input = new Scanner(System.in);
				while(true) {
						System.out.println("�������� �����÷��� exit�� �Է����ּ���.");
						String exit = input.next();
						if("exit".equals(exit)) {
							break;
						}
							System.out.println("��� �������� �����Ͻðڽ��ϱ�?\n"
									+ "1. �����Ӵ��� \t2.�ʷϹ������� \t3.�ñ׳ʽ�����");
							String monster1 = input.next();
							if("1".equals(monster1)) {
								System.out.println("������ �����Դϴ�.");
									System.out.println("���� �����Ӽ��� "+ sl.size);
								while(true) {
									String skill = input.nextLine();
									System.out.println("��ų�� ����Ͻø� a�� �����ּ���");
									if("a".equals(skill)) {
										ph.attack(sl);
										System.out.println(sl.name + sl.hp);
										}
									if(sl.getHp() < 1) {
										System.out.println(sl.name + "�� �׾����ϴ�.");
										ph.LevelUp(2);	
//											System.out.println("������ ! ! "+ph.LevelUp());
										sl.size--;
										System.out.println("���� ������ ���� "+sl.size+"���� �Դϴ�.");
										sl.setHp(sl.getMaxhp());
										if(sl.size == 0)
											break;
									}
								}
							}
				}
//				System.out.println(sl.name + "�� ��� �׾����ϴ�. �������� �����ڽ��ϴ�.");				
			}
	
	
}
