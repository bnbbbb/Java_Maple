package Thread;

public class SkillThread implements Runnable {
	public void run() {
		String[] Skillscript = {"��","��"," ","��","��"," ","��","ų","��"," ","��","ġ","��","��","��","��","��"};
		for(int i=0; i<Skillscript.length; i++) {
			System.out.print(Skillscript[i]);
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
			}
		}
		System.out.println("");
	}

	
	
}
