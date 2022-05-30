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
						System.out.println("던전에서 나가시려면 exit를 입력해주세요.");
						String exit = input.next();
						if("exit".equals(exit)) {
							break;
						}
							System.out.println("어느 던전으로 입장하시겠습니까?\n"
									+ "1. 슬라임던전 \t2.초록버섯던전 \t3.시그너스던전");
							String monster1 = input.next();
							if("1".equals(monster1)) {
								System.out.println("슬라임 던전입니다.");
									System.out.println("현재 슬라임수는 "+ sl.size);
								while(true) {
									String skill = input.nextLine();
									System.out.println("스킬을 사용하시면 a를 눌러주세요");
									if("a".equals(skill)) {
										ph.attack(sl);
										System.out.println(sl.name + sl.hp);
										}
									if(sl.getHp() < 1) {
										System.out.println(sl.name + "이 죽었습니다.");
										ph.LevelUp(2);	
//											System.out.println("레벨업 ! ! "+ph.LevelUp());
										sl.size--;
										System.out.println("남은 슬라임 수는 "+sl.size+"마리 입니다.");
										sl.setHp(sl.getMaxhp());
										if(sl.size == 0)
											break;
									}
								}
							}
				}
//				System.out.println(sl.name + "이 모두 죽었습니다. 던전에서 나가겠습니다.");				
			}
	
	
}
