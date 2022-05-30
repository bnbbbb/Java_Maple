package JobCharacter;

import java.util.Scanner;

public class NightLoad {
	void indent() {
		Scanner a = new Scanner(System.in) ;
				a.nextLine();
	}
	public void Skillinfo() {
		indent();
		System.out.println("1. 쿼드러플 스로우 \n"
				+ "4개의 표창을 연속으로 던진다.\n"
				+ "650% 데미지로 1번 공격");
		indent();
		System.out.println("2. 써든레이드\n"
				+ "숨어 있던 동료들을 총동원하여 적들을 공격한다. "
				+ "650%로 1명의 적을 1번 공격합니다.");
		indent();
		System.out.println("3. 포 시즌\n"
				+ "네 개의 표창을 소환하여 하나의 거대한 표창을 이루어 공격한다. \n"
				+ "650% 데미지로 최대 1명의 적을 공격합니다.");
	}
}
