package Thread;

public class AttackThread implements Runnable{
	private String type;
	public AttackThread(String type) {
		this.type = type;
	}
	public void PhantomAttack() {
		String[] attackimage = new String[2];
		attackimage[0] ="				\n"
				+ "--- -\n"
				+ "-    \n"
				+ "     \n"
				+ "-----\n"
				+ "-----\n"
				+ "     \n"
				+ "-    \n"
				+ "--- -\n";
				
		
		attackimage[1] ="							\n"
				+ "		------ --- -\n"
				+ " - -- - ---- 	\n"
				+ "q--we--e-		"
				+ "  qqeasd=--------\n"
				+ "---c-zsd---s-	\n"
				+ "---c-zsd---s-	\n"
				+ "  qqeasd=--------\n"
				+ " - -- - ---- 	\n"
				+ "		------ --- -\n";
				
		attackimage[2] ="							\n"
				+ "				------ --- -\n"
				+ "			- - -- - ---- 	\n"
				+ "		q--- q--we--e-		\n"
				+ "...q.q....qqeasd=--------\n"
				+ "c-a--c---c-zsd---s-		\n"
				+ "c-a--c---c-zsd---s-		\n"
				+ "...q.q....qqeasd=--------\n"
				+ "		q--- q--we--e-		\n"
				+ "			- - -- - ---- 	\n"
				+ "				------ --- -\\n";
		
		for(int i=0; i<100; i++) {
			System.out.println("");
		}
		for(int i=0; i<attackimage.length; i++) {
			for(int j=0; j<30; j++) {
				System.out.println("");
			}
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
			}
		}
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		switch(type) {
		case "skill1":
			this.PhantomAttack();
			break;
		}
	}
}
