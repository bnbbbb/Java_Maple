package Thread;
import java.util.*;

public class LoadingThread implements Runnable{
	private String type;

	public LoadingThread(String type){
		this.type=type;
	}
	public void Loading() {
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
		System.out.print("�ε���");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');
		
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
			}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	public void Moving() {
		System.out.print("������ ���ϴ�");
		for(int i=0; i<20; i++ ) {
			System.out.print('.');

			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
			}
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}
	}
	@Override
	public void run() {
		switch(type) {
		case "Loading":
			Loading();
			break;
		case "Moving":
			Moving();
			break;
		}
	}

}
