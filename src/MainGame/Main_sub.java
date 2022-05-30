package MainGame;

import java.util.*;
import Character.*;
import Quest.*;
import JobCharacter.*;
import Boss.*;
import NPC.*;
import Monster.*;
import Battle.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import Skill.*;
import Thread.AttackThread;
import Thread.LoadingThread;
import Thread.SkillThread;

public class Main_sub {

	static void indent() {
		System.out.printf("\n\t\t\t\t\tENTER\n");
		Scanner ch = new Scanner(System.in);
		ch.nextLine();

	}

	static Queue inventory_p = new LinkedList();

	// static Queue armor = new LinkedList();

	static void save(String input) {

		if (inventory_p.size() < 5)
			inventory_p.offer(input);

		else
			System.out.println("인벤토리가 꽉 찼습니다.");

	}

//	   static void battle (Phantom lu ,Boss boss) {
//	      
//	      while(true) {
//	                  Scanner input = new Scanner(System.in);
//	                  
//	                  System.out.println("\n[Battle]어떤 행동을 하시겠습니까 >>");
//	                  String act = input.nextLine();
//	            if("q".equals(act)) {
//	                  lu.attack(boss);
//	                  if(boss.hp>0)
//	                        System.out.printf("보스 HP = "+boss.hp);      
//	                  else
//	                        System.out.println("보스가 죽었습니다.");
//	                  }
//	            if ("w".equals(act)) {
//	                     System.out.println("힐!");
//	                     lu.heal();
//	                  
//	                  }
//	            if("e".equals(act)) {
//	               System.out.println("대기");
//	                  }
//	            
//	            if(boss.hp<=0) {
//	               System.out.println("전투에서 승리했습니다.\n");
//	                  break;
//	                  }
//	   
//	      indent();
//	      boss.attack(lu);
//	}
//	      
//	   }
	public static void main(String[] args) {
		Battle b = new Battle();
		PhantomSkill z = new PhantomSkill();
//		HashSet<String> s = new HashSet<String>();
		Scanner input = new Scanner(System.in);
		Phantom ph = new Phantom();
		Slime sl = new Slime();
		Skill k = new Skill();
		PhantomSkill ps = new PhantomSkill();
		Thread Loading = new Thread(new LoadingThread("Loading"));
		Thread Moving = new Thread(new LoadingThread("Moving"));
		Thread SkillTh = new Thread(new SkillThread());
		Thread AttackSkill = new Thread(new AttackThread("PhantomAttack"));
		LinkedList<String> list = new LinkedList<String>();
		/*---------------------로딩--------------------------*/
//		Loading.start();
//		try {
//			Loading.join();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		while (true) {
			/*--------------------------------스킬set-------------------------------*/
//			z.skillset();
			System.out.println("스킬 리스트를 초기화 j를 눌러주세요");
			String j = input.nextLine();
			if("j".equals(j)){
				list.clear();
			}
			while(list.size()<1) {
			System.out.println("스킬 리스트를 보려면 k를 눌러주세요.\n"
					+ "다음으로 넘어가시려면 아무키나 눌러주세요.");
//			public LinkedList list = new LinkedList(s);
//			List list = linkedList;
			String skilllist;
			skilllist = input.nextLine();
			if("k".equals(skilllist)) {
				System.out.println(list);
				System.out.println(list.get(0)); // list에서 index(1) 출력
			}
			String job1;
			String skill;
			SkillTh.start();
			try {
				SkillTh.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("->어떤 계열 스킬을 훔치시겠습니까\n"
					+ "1.전사\t 2.도적\n"
					+ "전사, 도적으로 입력해주세요."); // 전사 , 도적
			
			String job = input.nextLine();
			if ("1".equals(job)) {

				System.out.println("어떤 직업을 훔치시겠습니까?\n1.다크나이트 \t2.팔라딘\n"
						+ "직업명을 입력해주세요.");
				job1 = input.nextLine();
				System.out.println("Enter를 눌러 훔칠 스킬 내용을 확인 하세요.");
				if ("다크나이트".equals(job1)) {
					DarkNight d = new DarkNight();
					d.Skillinfo();
					System.out.println("\n어떤 스킬 가져오시겠습니까.\n" + "(1).비홀더 쇼크 \t(2).라만차 스피어 \t(3).돌진\n"
							+ "(1), (2), (3)으로 입력해주세요.");
					skill = input.nextLine();
					if ("(1)".equals(skill)) {
						list.add("비홀더 쇼크");  	//hashset으로 스킬 저장 
//						System.out.println(phantom.attack);
						continue;
					}
					if ("(2)".equals(skill)) {
						list.add("라만차 스피어");
						continue;
					}
					if ("(3)".equals(skill)) {
						list.add("돌진");
						continue;
					}
				} else if ("2".equals(job1)) {
					Paladin p = new Paladin();
					p.Skillinfo();
					System.out.println("\n어떤 스킬 가져오시겠습니까.\n" + "(1).블래스트 \t(2).생츄어리 \t(3).스마이트\n"
							+ "(1), (2), (3)으로 입력해주세요.");
					skill = input.nextLine();
					if ("1".equals(skill)) {
						list.add("블래스트");
						continue;
					}
					if ("(2)".equals(skill)) {
						list.add("생츄어리");
						continue;
					}
					if ("(3)".equals(skill)) {
						list.add("스마이트");
						continue;
					}
				}

			} else if ("도적".equals(job)) {
				System.out.println("어떤 직업 을 훔치시겠습니까?\n1.나이트로드 \t2.듀얼블레이드\n"
						+ "직업명을 입력해주세요.");
				job1 = input.nextLine();
				System.out.println("Enter를 눌러 훔칠 스킬 내용을 확인 하세요.");
				if ("나이트로드".equals(job1)) {
					NightLoad n = new NightLoad();
					n.Skillinfo();
					System.out.println("\n어떤 스킬 가져오시겠습니까.\n" 
					+ "(1).쿼드러플 스로우 \t(2).써든레이드 \t(3).포 시즌\n"
					+ "(1), (2), (3)으로 입력해주세요.");
					skill = input.nextLine();
					if ("(1)".equals(skill)) {
						list.add("쿼트러플 스로우");
						continue;
					}
					if ("(2)".equals(skill)) {
						list.add("써든레이드");
						continue;
					}
					if ("(3)".equals(skill)) {
						list.add("포 시즌");
						continue;
					}
				} else if ("듀얼블레이드".equals(job1)) {
					DualBlade d = new DualBlade();
					d.Skillinfo();
					System.out.println("\n어떤 스킬 가져오시겠습니까.\n" 
					+ "(1).블레이드 퓨리 \t(2).팬텀 블로우 \t(3).아수라\n"
					+ "(1), (2), (3)으로 입력해주세요.");
					skill = input.nextLine();
					if ("(1)".equals(skill)) {
						list.add("블레이드 퓨리");
						continue;
					}
					if ("(2)".equals(skill)) {
						list.add("팬텀 블로우");
						continue;
					}
					if ("(3)".equals(skill)) {
						list.add("아수라");
						continue;
					}
				}
			}
			}
			/*----------------------------------던전-------------------------------*/
			System.out.println("던전에 들어가시려면 g를 입력해주세요.\n"
					+ "그 외 행동을 하시려면 아무키를 눌러주세요.");// 어떻게? 
			String monster = input.next();
			if("g".equals(monster)) {
//					b.battle();
//				Moving.start();
//				try {
//					Moving.join();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				while(true) {
					System.out.println("던전에서 나가시려면 exit를 입력해주세요.");
					String exit = input.nextLine();
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
//									String s1;
									if(list.get(0)=="블래스트") {
										System.out.println(list.get(0));
//										AttackSkill.start();
//										try {
//											AttackSkill.join();
//										} catch (Exception e1) {
//											e1.printStackTrace();
//										}
//										try {
//											Thread.sleep(10);
//										}catch(InterruptedException e) {
//											e.printStackTrace();
//										}
										k.skill2(sl);
										System.out.println(sl.name+"hp가" + sl.hp+"남았습니다.");
//										ph.attack(sl);
										System.out.println(ph.getAttack());
										
									}
							
//									System.out.println(list.get(0));
//									ps.list.get(0);
//									if(s1=="블래스트") {
//										System.out.println(sl.name + sl.hp);
//									}
									}
								if(sl.getHp() < 1) {
									System.out.println(sl.name + "이 죽었습니다.");
									ph.LevelUp(2);	
//									ph.setAttack(ph.getMaxAttack());
									ph.status();
//										System.out.println("레벨업 ! ! "+ph.LevelUp());
									sl.size--;
									System.out.println("남은 슬라임 수는 "+sl.size+"마리 입니다.");
									sl.setHp(sl.getMaxhp());
									if(sl.size == 0)
										break;
								}
							}
						}
			}
//			System.out.println(sl.name + "이 모두 죽었습니다. 던전에서 나가겠습니다.");				
		}
//					System.out.println("어느 던전으로 입장하시겠습니까?\n"
//							+ "1. 슬라임던전 \t2.초록버섯던전 \t3.시그너스던전");
//					String monster1 = input.next();
//					if("1".equals(monster1)) {
//						System.out.println("슬라임 던전입니다.");
//						b.battle();
//					}
				}
//			System.out.println("스킬 리스트를 초기화 j를 눌러주세요");
//			String j = input.nextLine();
//			if("j".equals(j)){
//				s.clear();
//			}
//			while(s.size()<3) {
//			System.out.println("스킬 리스트를 보려면 k를 눌러주세요.\n"
//					+ "다음으로 넘어가시려면 아무키나 눌러주세요.");
////			LinkedList list = new LinkedList(s);
////			List list = linkedList;
//			String skilllist;
//			skilllist = input.nextLine();
//			if("k".equals(skilllist)) {
//				System.out.println(s);
//			}
//			String job1;
//			String skill;
//			System.out.println("->어떤 계열 스킬을 훔치시겠습니까\n"
//					+ "1.전사\t 2.도적\n"
//					+ "전사, 도적으로 입력해주세요."); // 전사 , 도적
//			
//			String job = input.nextLine();
//			if ("전사".equals(job)) {
//
//				System.out.println("어떤 직업을 훔치시겠습니까?\n1.다크나이트 \t2.팔라딘\n"
//						+ "직업명을 입력해주세요.");
//				job1 = input.nextLine();
//				System.out.println("Enter를 눌러 훔칠 스킬 내용을 확인 하세요.");
//				if ("다크나이트".equals(job1)) {
//					DarkNight d = new DarkNight();
//					d.Skillinfo();
//					System.out.println("\n어떤 스킬 가져오시겠습니까.\n" + "(1).비홀더 쇼크 \t(2).라만차 스피어 \t(3).돌진\n"
//							+ "(1), (2), (3)으로 입력해주세요.");
//					skill = input.nextLine();
//					if ("(1)".equals(skill)) {
//						s.add("비홀더 쇼크");  	//hashset으로 스킬 저장 
//						continue;
//					}
//					if ("(2)".equals(skill)) {
//						s.add("라만차 스피어");
//						continue;
//					}
//					if ("(3)".equals(skill)) {
//						s.add("돌진");
//						continue;
//					}
//				} else if ("팔라딘".equals(job1)) {
//					Paladin p = new Paladin();
//					p.Skillinfo();
//					System.out.println("\n어떤 스킬 가져오시겠습니까.\n" + "(1).블래스트 \t(2).생츄어리 \t(3).스마이트\n"
//							+ "(1), (2), (3)으로 입력해주세요.");
//					skill = input.nextLine();
//					if ("(1)".equals(skill)) {
//						s.add("블래스트");
//						continue;
//					}
//					if ("(2)".equals(skill)) {
//						s.add("생츄어리");
//						continue;
//					}
//					if ("(3)".equals(skill)) {
//						s.add("스마이트");
//						continue;
//					}
//				}
//
//			} else if ("도적".equals(job)) {
//				System.out.println("어떤 직업 을 훔치시겠습니까?\n1.나이트로드 \t2.듀얼블레이드\n"
//						+ "직업명을 입력해주세요.");
//				job1 = input.nextLine();
//				System.out.println("Enter를 눌러 훔칠 스킬 내용을 확인 하세요.");
//				if ("나이트로드".equals(job1)) {
//					NightLoad n = new NightLoad();
//					n.Skillinfo();
//					System.out.println("\n어떤 스킬 가져오시겠습니까.\n" 
//					+ "(1).쿼드러플 스로우 \t(2).써든레이드 \t(3).포 시즌\n"
//					+ "(1), (2), (3)으로 입력해주세요.");
//					skill = input.nextLine();
//					if ("(1)".equals(skill)) {
//						s.add("쿼트러플 스로우");
//						continue;
//					}
//					if ("(2)".equals(skill)) {
//						s.add("써든레이드");
//						continue;
//					}
//					if ("(3)".equals(skill)) {
//						s.add("포 시즌");
//						continue;
//					}
//				} else if ("듀얼블레이드".equals(job1)) {
//					DualBlade d = new DualBlade();
//					d.Skillinfo();
//					System.out.println("\n어떤 스킬 가져오시겠습니까.\n" 
//					+ "(1).블레이드 퓨리 \t(2).팬텀 블로우 \t(3).아수라\n"
//					+ "(1), (2), (3)으로 입력해주세요.");
//					skill = input.nextLine();
//					if ("(1)".equals(skill)) {
//						s.add("블레이드 퓨리");
//						continue;
//					}
//					if ("(2)".equals(skill)) {
//						s.add("팬텀 블로우");
//						continue;
//					}
//					if ("(3)".equals(skill)) {
//						s.add("아수라");
//						continue;
//					}
//				} //else if ("듀얼블레이드".equals(job1)) 종료
//			}//else if ("도적".equals(job)) 종료
//			}//while(s.size()<3) 종료
			
//			Slime slime = new Slime();
//			Monster mon = new Monster();
			
		} //while (true) 종료 
	
//	public static void main(String[] args) {
//		while(true) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("->어디로 이동 (인벤토리를 보려면 i를 입력해주세요"); 
//		
//			String world = input.nextLine();
//			if() {
//			
//			}
//			else if("i".equals(world)) {
//            
//            LinkedList list = (LinkedList)inventory_p;
//            
//            final int SIZE = list.size();
//            for(int i = 0; i<SIZE;i++)
//               System.out.println(i+1+"."+list.get(i));
//         
//		}
//		}
//		// TODO Auto-generated method stub
//		Scanner c = new Scanner(System.in);
//		Phantom Phantom = new Phantom();
//		Quest1 q = new Quest1();
//		Slime slime = new Slime();
////		Skill s = new Skill();
//		System.out.println("********메이플스토리********");
//		System.out.println("1. 팬텀");
//		System.out.print("직업 번호 입력하세요:");
//		int number = c.nextInt();
//
//		if (number == 1) {
//			Phantom.attack = 40;
//			Phantom.exp = 0;
//			Phantom.level = 1;
//			Phantom.hp = 100;
//			Phantom.defense = 30;
//		}
//		System.out.print("영웅의 이름을 입력 : ");
//		Phantom.name = c.next();
//		System.out.println("이름이 입력되었습니다.");
//
//		while (true) {
//			if (Phantom.level == 1) {
//				System.out.println("1. 퀘스트");
//				System.out.print("입장할 장소 입력: ");
//				number = c.nextInt();
//				if (number == 1) {
//					System.out.println(q.s1);
//					System.out.println(q.s2);
//					System.out.println(q.s3);
//					System.out.println(q.s4);
//					System.out.println();
//					System.out.println("던전 입장 하겠습니다.");
//				}
//				System.out.println("=======슬라임 던전=======");
////			System.out.println(s.Skill1);
//				System.out.println(Phantom.name + "의 공격입니다.");
//				slime.attacked(Phantom.attack());
//				number = c.nextInt();
//				if (slime.hp <= 0) {
//					System.out.println(slime.name + "이 죽었습니다.");
//					break;
//				}
//				System.out.println(slime.name + "의 공격입니다.");
//				Phantom.attacked(slime.attack());
//				if(Phantom.hp <= 0) {
//					System.out.println(Phantom.name + "이 죽었습니다.");
//					Phantom.hp = 1;
//					System.out.println(Phantom.name + "체력"+Phantom.hp +"으로 부활했습니다.");
//					break;
//				}
//			}
//		}
//	}


