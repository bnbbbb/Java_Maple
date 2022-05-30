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
			System.out.println("�κ��丮�� �� á���ϴ�.");

	}

//	   static void battle (Phantom lu ,Boss boss) {
//	      
//	      while(true) {
//	                  Scanner input = new Scanner(System.in);
//	                  
//	                  System.out.println("\n[Battle]� �ൿ�� �Ͻðڽ��ϱ� >>");
//	                  String act = input.nextLine();
//	            if("q".equals(act)) {
//	                  lu.attack(boss);
//	                  if(boss.hp>0)
//	                        System.out.printf("���� HP = "+boss.hp);      
//	                  else
//	                        System.out.println("������ �׾����ϴ�.");
//	                  }
//	            if ("w".equals(act)) {
//	                     System.out.println("��!");
//	                     lu.heal();
//	                  
//	                  }
//	            if("e".equals(act)) {
//	               System.out.println("���");
//	                  }
//	            
//	            if(boss.hp<=0) {
//	               System.out.println("�������� �¸��߽��ϴ�.\n");
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
		/*---------------------�ε�--------------------------*/
//		Loading.start();
//		try {
//			Loading.join();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		while (true) {
			/*--------------------------------��ųset-------------------------------*/
//			z.skillset();
			System.out.println("��ų ����Ʈ�� �ʱ�ȭ j�� �����ּ���");
			String j = input.nextLine();
			if("j".equals(j)){
				list.clear();
			}
			while(list.size()<1) {
			System.out.println("��ų ����Ʈ�� ������ k�� �����ּ���.\n"
					+ "�������� �Ѿ�÷��� �ƹ�Ű�� �����ּ���.");
//			public LinkedList list = new LinkedList(s);
//			List list = linkedList;
			String skilllist;
			skilllist = input.nextLine();
			if("k".equals(skilllist)) {
				System.out.println(list);
				System.out.println(list.get(0)); // list���� index(1) ���
			}
			String job1;
			String skill;
			SkillTh.start();
			try {
				SkillTh.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("->� �迭 ��ų�� ��ġ�ðڽ��ϱ�\n"
					+ "1.����\t 2.����\n"
					+ "����, �������� �Է����ּ���."); // ���� , ����
			
			String job = input.nextLine();
			if ("1".equals(job)) {

				System.out.println("� ������ ��ġ�ðڽ��ϱ�?\n1.��ũ����Ʈ \t2.�ȶ��\n"
						+ "�������� �Է����ּ���.");
				job1 = input.nextLine();
				System.out.println("Enter�� ���� ��ĥ ��ų ������ Ȯ�� �ϼ���.");
				if ("��ũ����Ʈ".equals(job1)) {
					DarkNight d = new DarkNight();
					d.Skillinfo();
					System.out.println("\n� ��ų �������ðڽ��ϱ�.\n" + "(1).��Ȧ�� ��ũ \t(2).���� ���Ǿ� \t(3).����\n"
							+ "(1), (2), (3)���� �Է����ּ���.");
					skill = input.nextLine();
					if ("(1)".equals(skill)) {
						list.add("��Ȧ�� ��ũ");  	//hashset���� ��ų ���� 
//						System.out.println(phantom.attack);
						continue;
					}
					if ("(2)".equals(skill)) {
						list.add("���� ���Ǿ�");
						continue;
					}
					if ("(3)".equals(skill)) {
						list.add("����");
						continue;
					}
				} else if ("2".equals(job1)) {
					Paladin p = new Paladin();
					p.Skillinfo();
					System.out.println("\n� ��ų �������ðڽ��ϱ�.\n" + "(1).����Ʈ \t(2).���� \t(3).������Ʈ\n"
							+ "(1), (2), (3)���� �Է����ּ���.");
					skill = input.nextLine();
					if ("1".equals(skill)) {
						list.add("����Ʈ");
						continue;
					}
					if ("(2)".equals(skill)) {
						list.add("����");
						continue;
					}
					if ("(3)".equals(skill)) {
						list.add("������Ʈ");
						continue;
					}
				}

			} else if ("����".equals(job)) {
				System.out.println("� ���� �� ��ġ�ðڽ��ϱ�?\n1.����Ʈ�ε� \t2.�����̵�\n"
						+ "�������� �Է����ּ���.");
				job1 = input.nextLine();
				System.out.println("Enter�� ���� ��ĥ ��ų ������ Ȯ�� �ϼ���.");
				if ("����Ʈ�ε�".equals(job1)) {
					NightLoad n = new NightLoad();
					n.Skillinfo();
					System.out.println("\n� ��ų �������ðڽ��ϱ�.\n" 
					+ "(1).���巯�� ���ο� \t(2).��緹�̵� \t(3).�� ����\n"
					+ "(1), (2), (3)���� �Է����ּ���.");
					skill = input.nextLine();
					if ("(1)".equals(skill)) {
						list.add("��Ʈ���� ���ο�");
						continue;
					}
					if ("(2)".equals(skill)) {
						list.add("��緹�̵�");
						continue;
					}
					if ("(3)".equals(skill)) {
						list.add("�� ����");
						continue;
					}
				} else if ("�����̵�".equals(job1)) {
					DualBlade d = new DualBlade();
					d.Skillinfo();
					System.out.println("\n� ��ų �������ðڽ��ϱ�.\n" 
					+ "(1).���̵� ǻ�� \t(2).���� ��ο� \t(3).�Ƽ���\n"
					+ "(1), (2), (3)���� �Է����ּ���.");
					skill = input.nextLine();
					if ("(1)".equals(skill)) {
						list.add("���̵� ǻ��");
						continue;
					}
					if ("(2)".equals(skill)) {
						list.add("���� ��ο�");
						continue;
					}
					if ("(3)".equals(skill)) {
						list.add("�Ƽ���");
						continue;
					}
				}
			}
			}
			/*----------------------------------����-------------------------------*/
			System.out.println("������ ���÷��� g�� �Է����ּ���.\n"
					+ "�� �� �ൿ�� �Ͻ÷��� �ƹ�Ű�� �����ּ���.");// ���? 
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
					System.out.println("�������� �����÷��� exit�� �Է����ּ���.");
					String exit = input.nextLine();
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
//									String s1;
									if(list.get(0)=="����Ʈ") {
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
										System.out.println(sl.name+"hp��" + sl.hp+"���ҽ��ϴ�.");
//										ph.attack(sl);
										System.out.println(ph.getAttack());
										
									}
							
//									System.out.println(list.get(0));
//									ps.list.get(0);
//									if(s1=="����Ʈ") {
//										System.out.println(sl.name + sl.hp);
//									}
									}
								if(sl.getHp() < 1) {
									System.out.println(sl.name + "�� �׾����ϴ�.");
									ph.LevelUp(2);	
//									ph.setAttack(ph.getMaxAttack());
									ph.status();
//										System.out.println("������ ! ! "+ph.LevelUp());
									sl.size--;
									System.out.println("���� ������ ���� "+sl.size+"���� �Դϴ�.");
									sl.setHp(sl.getMaxhp());
									if(sl.size == 0)
										break;
								}
							}
						}
			}
//			System.out.println(sl.name + "�� ��� �׾����ϴ�. �������� �����ڽ��ϴ�.");				
		}
//					System.out.println("��� �������� �����Ͻðڽ��ϱ�?\n"
//							+ "1. �����Ӵ��� \t2.�ʷϹ������� \t3.�ñ׳ʽ�����");
//					String monster1 = input.next();
//					if("1".equals(monster1)) {
//						System.out.println("������ �����Դϴ�.");
//						b.battle();
//					}
				}
//			System.out.println("��ų ����Ʈ�� �ʱ�ȭ j�� �����ּ���");
//			String j = input.nextLine();
//			if("j".equals(j)){
//				s.clear();
//			}
//			while(s.size()<3) {
//			System.out.println("��ų ����Ʈ�� ������ k�� �����ּ���.\n"
//					+ "�������� �Ѿ�÷��� �ƹ�Ű�� �����ּ���.");
////			LinkedList list = new LinkedList(s);
////			List list = linkedList;
//			String skilllist;
//			skilllist = input.nextLine();
//			if("k".equals(skilllist)) {
//				System.out.println(s);
//			}
//			String job1;
//			String skill;
//			System.out.println("->� �迭 ��ų�� ��ġ�ðڽ��ϱ�\n"
//					+ "1.����\t 2.����\n"
//					+ "����, �������� �Է����ּ���."); // ���� , ����
//			
//			String job = input.nextLine();
//			if ("����".equals(job)) {
//
//				System.out.println("� ������ ��ġ�ðڽ��ϱ�?\n1.��ũ����Ʈ \t2.�ȶ��\n"
//						+ "�������� �Է����ּ���.");
//				job1 = input.nextLine();
//				System.out.println("Enter�� ���� ��ĥ ��ų ������ Ȯ�� �ϼ���.");
//				if ("��ũ����Ʈ".equals(job1)) {
//					DarkNight d = new DarkNight();
//					d.Skillinfo();
//					System.out.println("\n� ��ų �������ðڽ��ϱ�.\n" + "(1).��Ȧ�� ��ũ \t(2).���� ���Ǿ� \t(3).����\n"
//							+ "(1), (2), (3)���� �Է����ּ���.");
//					skill = input.nextLine();
//					if ("(1)".equals(skill)) {
//						s.add("��Ȧ�� ��ũ");  	//hashset���� ��ų ���� 
//						continue;
//					}
//					if ("(2)".equals(skill)) {
//						s.add("���� ���Ǿ�");
//						continue;
//					}
//					if ("(3)".equals(skill)) {
//						s.add("����");
//						continue;
//					}
//				} else if ("�ȶ��".equals(job1)) {
//					Paladin p = new Paladin();
//					p.Skillinfo();
//					System.out.println("\n� ��ų �������ðڽ��ϱ�.\n" + "(1).����Ʈ \t(2).���� \t(3).������Ʈ\n"
//							+ "(1), (2), (3)���� �Է����ּ���.");
//					skill = input.nextLine();
//					if ("(1)".equals(skill)) {
//						s.add("����Ʈ");
//						continue;
//					}
//					if ("(2)".equals(skill)) {
//						s.add("����");
//						continue;
//					}
//					if ("(3)".equals(skill)) {
//						s.add("������Ʈ");
//						continue;
//					}
//				}
//
//			} else if ("����".equals(job)) {
//				System.out.println("� ���� �� ��ġ�ðڽ��ϱ�?\n1.����Ʈ�ε� \t2.�����̵�\n"
//						+ "�������� �Է����ּ���.");
//				job1 = input.nextLine();
//				System.out.println("Enter�� ���� ��ĥ ��ų ������ Ȯ�� �ϼ���.");
//				if ("����Ʈ�ε�".equals(job1)) {
//					NightLoad n = new NightLoad();
//					n.Skillinfo();
//					System.out.println("\n� ��ų �������ðڽ��ϱ�.\n" 
//					+ "(1).���巯�� ���ο� \t(2).��緹�̵� \t(3).�� ����\n"
//					+ "(1), (2), (3)���� �Է����ּ���.");
//					skill = input.nextLine();
//					if ("(1)".equals(skill)) {
//						s.add("��Ʈ���� ���ο�");
//						continue;
//					}
//					if ("(2)".equals(skill)) {
//						s.add("��緹�̵�");
//						continue;
//					}
//					if ("(3)".equals(skill)) {
//						s.add("�� ����");
//						continue;
//					}
//				} else if ("�����̵�".equals(job1)) {
//					DualBlade d = new DualBlade();
//					d.Skillinfo();
//					System.out.println("\n� ��ų �������ðڽ��ϱ�.\n" 
//					+ "(1).���̵� ǻ�� \t(2).���� ��ο� \t(3).�Ƽ���\n"
//					+ "(1), (2), (3)���� �Է����ּ���.");
//					skill = input.nextLine();
//					if ("(1)".equals(skill)) {
//						s.add("���̵� ǻ��");
//						continue;
//					}
//					if ("(2)".equals(skill)) {
//						s.add("���� ��ο�");
//						continue;
//					}
//					if ("(3)".equals(skill)) {
//						s.add("�Ƽ���");
//						continue;
//					}
//				} //else if ("�����̵�".equals(job1)) ����
//			}//else if ("����".equals(job)) ����
//			}//while(s.size()<3) ����
			
//			Slime slime = new Slime();
//			Monster mon = new Monster();
			
		} //while (true) ���� 
	
//	public static void main(String[] args) {
//		while(true) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("->���� �̵� (�κ��丮�� ������ i�� �Է����ּ���"); 
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
//		System.out.println("********�����ý��丮********");
//		System.out.println("1. ����");
//		System.out.print("���� ��ȣ �Է��ϼ���:");
//		int number = c.nextInt();
//
//		if (number == 1) {
//			Phantom.attack = 40;
//			Phantom.exp = 0;
//			Phantom.level = 1;
//			Phantom.hp = 100;
//			Phantom.defense = 30;
//		}
//		System.out.print("������ �̸��� �Է� : ");
//		Phantom.name = c.next();
//		System.out.println("�̸��� �ԷµǾ����ϴ�.");
//
//		while (true) {
//			if (Phantom.level == 1) {
//				System.out.println("1. ����Ʈ");
//				System.out.print("������ ��� �Է�: ");
//				number = c.nextInt();
//				if (number == 1) {
//					System.out.println(q.s1);
//					System.out.println(q.s2);
//					System.out.println(q.s3);
//					System.out.println(q.s4);
//					System.out.println();
//					System.out.println("���� ���� �ϰڽ��ϴ�.");
//				}
//				System.out.println("=======������ ����=======");
////			System.out.println(s.Skill1);
//				System.out.println(Phantom.name + "�� �����Դϴ�.");
//				slime.attacked(Phantom.attack());
//				number = c.nextInt();
//				if (slime.hp <= 0) {
//					System.out.println(slime.name + "�� �׾����ϴ�.");
//					break;
//				}
//				System.out.println(slime.name + "�� �����Դϴ�.");
//				Phantom.attacked(slime.attack());
//				if(Phantom.hp <= 0) {
//					System.out.println(Phantom.name + "�� �׾����ϴ�.");
//					Phantom.hp = 1;
//					System.out.println(Phantom.name + "ü��"+Phantom.hp +"���� ��Ȱ�߽��ϴ�.");
//					break;
//				}
//			}
//		}
//	}


