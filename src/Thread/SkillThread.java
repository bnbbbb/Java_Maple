package Thread;

public class SkillThread implements Runnable {
	public void run() {
		String[] Skillscript = {"어","떤"," ","계","열"," ","스","킬","을"," ","훔","치","시","겠","습","니","까"};
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
