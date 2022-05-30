package Skill;
import Character.*;
import Battle.*;
import Monster.Monster;

public class Skill {
	Phantom phantom = new Phantom();
	public void skill1() {
		//비홀더 쇼크
		phantom.setAttack(phantom.getAttack()*3);
	}
	public void skill2(Monster monster) {
		//라만차 스피어
		phantom.setAttack(phantom.getAttack()*3);
		monster.setHp(monster.getHp()-(phantom.getAttack()-monster.getDefence()));
		System.out.println("스킬 데미지: "+(phantom.getAttack()-monster.getDefence()));
//		phantom.setMaxAttack(phantom.getMaxAttack());
		phantom.setAttack(phantom.getMaxAttack());
		
	}
	public void skill3() {
		//돌진
		phantom.setAttack(phantom.getAttack()*3);
	}
	public void skill4() {
		//블래스트
		phantom.setAttack(phantom.getAttack()*4);
	}
	public void skill5() {
		//생츄어리
		phantom.setAttack(phantom.getAttack()*3);
	}
	public void skill6() {
		//스마이트
		phantom.setAttack(phantom.getAttack()*3);
	}
	public void skill7() {
		//쿼드러플 스로우
		phantom.setAttack(phantom.getAttack());
	}
	public void skill8() {
		//써든레이드
	}
	public void skill9() {
		//포 시즌
	}
	public void skill10() {
		//블레이드 퓨리
	}
	public void skill11() {
		//팬텀 블로우
	}
	public void skill12() {
		//아수라
	}
	public void Skilluse() {
		
	}
	
}
