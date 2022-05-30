package JobCharacter;

import java.util.Scanner;

public class DualBlade {
	void indent() {
		Scanner a = new Scanner(System.in) ;
				a.nextLine();
	}
	public void Skillinfo() {
		indent();
		System.out.println("1. 블레이드 퓨리\n"
				+ "비화원의 선풍의 비기로 양손의 검을 이용해 빠르게 회전하며 주변의 적들을 동시에 베어낸다.\n"
				+ "660% 데미지로 1번 공격");
		indent();
		System.out.println("2. 팬텀 블로우\n"
				+ "비화원 격노의 비기로 전방의 적들에게 치명적인 연속공격을 가한다. "
				+ "660%로 1명의 적을 1번 공격합니다.");
		indent();
		System.out.println("3. 아수라\n"
				+ "빠르게 회전하여 보이지 않는 진공의 칼날을 주위에 두른 채 적들을 섬멸한다. "
				+ "아수라는 공격 반사 상태의 적을 공격해도 피해를 입지 않고 어떠한 공격에도 밀리지 않는다.\n"
				+ "660% 데미지로 최대 1명의 적을 공격합니다.");
	}
}
