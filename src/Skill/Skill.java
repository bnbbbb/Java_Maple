package Skill;
import Character.*;
import Battle.*;
import Monster.Monster;

public class Skill {
	Phantom phantom = new Phantom();
	public void skill1() {
		//��Ȧ�� ��ũ
		phantom.setAttack(phantom.getAttack()*3);
	}
	public void skill2(Monster monster) {
		//���� ���Ǿ�
		phantom.setAttack(phantom.getAttack()*3);
		monster.setHp(monster.getHp()-(phantom.getAttack()-monster.getDefence()));
		System.out.println("��ų ������: "+(phantom.getAttack()-monster.getDefence()));
//		phantom.setMaxAttack(phantom.getMaxAttack());
		phantom.setAttack(phantom.getMaxAttack());
		
	}
	public void skill3() {
		//����
		phantom.setAttack(phantom.getAttack()*3);
	}
	public void skill4() {
		//����Ʈ
		phantom.setAttack(phantom.getAttack()*4);
	}
	public void skill5() {
		//����
		phantom.setAttack(phantom.getAttack()*3);
	}
	public void skill6() {
		//������Ʈ
		phantom.setAttack(phantom.getAttack()*3);
	}
	public void skill7() {
		//���巯�� ���ο�
		phantom.setAttack(phantom.getAttack());
	}
	public void skill8() {
		//��緹�̵�
	}
	public void skill9() {
		//�� ����
	}
	public void skill10() {
		//���̵� ǻ��
	}
	public void skill11() {
		//���� ��ο�
	}
	public void skill12() {
		//�Ƽ���
	}
	public void Skilluse() {
		
	}
	
}
