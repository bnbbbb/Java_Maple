package JobCharacter;
import java.util.Scanner;

//쿨타임 ? 
//패시브로 하려면 메소드로 해야되나? 
public class DarkNight {
	public void indent() {
		Scanner a = new Scanner(System.in) ;
				a.nextLine();
	}
	public void Skillinfo() {
		indent();
		System.out.println("1. 비홀더 쇼크 \n"
				+ "비홀더가 비명을 내질러 주위 적들을 기절시키고 피해를 준다.\n"
				+ "적에게 640% 데미지로 1번 공격합니다.");
		indent();
		System.out.println("2. 라만차 스피어\n"
				+ "창을 회전시켜 적을 공격합니다.\n"
				+ "640%로 1명의 적을 1번 공격합니다.");
		indent();
		System.out.println("3. 돌질\n"
				+ "전방으로 거칠게 돌격하여 자신 앞에 있는 적을 밀고 지나간다.\n"
				+ "640% 데미지로 최대 1명의 적을 공격합니다.");
	}
	
}
