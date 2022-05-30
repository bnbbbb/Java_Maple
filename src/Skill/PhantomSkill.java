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
		
		System.out.println("스킬 리스트를 초기화 j를 눌러주세요");
		String j = input.nextLine();
		if("j".equals(j)){
			list.clear();
		}
		while(list.size()<1) {
		System.out.println("스킬 리스트를 보려면 k를 눌러주세요.\n"
				+ "다음으로 넘어가시려면 아무키나 눌러주세요.");
//		public LinkedList list = new LinkedList(s);
//		List list = linkedList;
		String skilllist;
		skilllist = input.nextLine();
		if("k".equals(skilllist)) {
			System.out.println(list);
//			System.out.println(list.get(1)); // list에서 index(1) 출력
		}
		String job1;
		String skill;
		System.out.println("->어떤 계열 스킬을 훔치시겠습니까\n"
				+ "1.전사\t 2.도적\n"
				+ "전사, 도적으로 입력해주세요."); // 전사 , 도적
		
		String job = input.nextLine();
		if ("전사".equals(job)) {

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
					skill1();
//					System.out.println(phantom.attack);
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
			} else if ("팔라딘".equals(job1)) {
				Paladin p = new Paladin();
				p.Skillinfo();
				System.out.println("\n어떤 스킬 가져오시겠습니까.\n" + "(1).블래스트 \t(2).생츄어리 \t(3).스마이트\n"
						+ "(1), (2), (3)으로 입력해주세요.");
				skill = input.nextLine();
				if ("(1)".equals(skill)) {
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
	}
	}

		
