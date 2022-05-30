package JobCharacter;

import java.util.Scanner;

public class Paladin {
	void indent() {
		Scanner a = new Scanner(System.in) ;
				a.nextLine();
	}
	public void Skillinfo() {
		indent();
		System.out.println("1. 블래스트 \n"
				+ "성스러운 빛의 기사와 하나가 되어 적을 강력하게 공격한다.\n"
				+ "적에게 650% 데미지로 1번 공격합니다.");
		indent();
		System.out.println("2. 생츄어리\n"
				+ "거대한 망치로 지면을 내려쳐 적을 공격합니다. 생츄어리는 보스몬스터에게 추가 데미지를 "
				+ "입히며 시전하는 동안 적의 어떠한 공격에도 밀려나지 않는다.\n"
				+ "650%로 1명의 적을 1번 공격합니다.");
		indent();
		System.out.println("3. 스마이트\n"
				+ "신의 힘이 깃든 망치를 소환하여 주위 적에게 강력한 일격을 내리친다. \n"
				+ "650% 데미지로 최대 1명의 적을 공격합니다.");
	}
	

}
