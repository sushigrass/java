
public class ExampleThread implements Runnable{
	
	int param;
	
	ExampleThread(int param) {
		this.param = param;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < this.param; i++) {
			System.out.println("iterating: "+i);
		}
		
	}

}
