package Skill;

import java.util.*;
import JobCharacter.DarkNight;
import JobCharacter.DualBlade;
import JobCharacter.NightLoad;
import JobCharacter.Paladin;

public class PhantomSkill extends Skill{
//	public HashSet<String> s = new HashSet<String>();
	public LinkedList<String> list = new LinkedList<String>();
//	ArrayList<String> l = new ArrayList<String>(s); 
	Scanner input = new Scanner(System.in);
	Skill sk = new Skill();
//	Skill sk = new Skill();
	public void skillset() {
		
		System.out.println("��ų ����Ʈ�� �ʱ�ȭ j�� �����ּ���");
		String j = input.nextLine();
		if("j".equals(j)){
			list.clear();
		}
		while(list.size()<1) {
		System.out.println("��ų ����Ʈ�� ������ k�� �����ּ���.\n"
				+ "�������� �Ѿ�÷��� �ƹ�Ű�� �����ּ���.");
//		public LinkedList list = new LinkedList(s);
//		List list = linkedList;
		String skilllist;
		skilllist = input.nextLine();
		if("k".equals(skilllist)) {
			System.out.println(list);
//			System.out.println(list.get(1)); // list���� index(1) ���
		}
		String job1;
		String skill;
		System.out.println("->� �迭 ��ų�� ��ġ�ðڽ��ϱ�\n"
				+ "1.����\t 2.����\n"
				+ "����, �������� �Է����ּ���."); // ���� , ����
		
		String job = input.nextLine();
		if ("����".equals(job)) {

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
					skill1();
//					System.out.println(phantom.attack);
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
			} else if ("�ȶ��".equals(job1)) {
				Paladin p = new Paladin();
				p.Skillinfo();
				System.out.println("\n� ��ų �������ðڽ��ϱ�.\n" + "(1).����Ʈ \t(2).���� \t(3).������Ʈ\n"
						+ "(1), (2), (3)���� �Է����ּ���.");
				skill = input.nextLine();
				if ("(1)".equals(skill)) {
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
	}
	}

		
