package question3;

public class ThreadA implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(5000);
				}
				catch(Exception e) {
					e.setStackTrace(null);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Thread th=new Thread(new ThreadA());
		th.start();
	}
	

}
