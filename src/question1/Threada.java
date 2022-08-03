package question1;

public class Threada implements Runnable{
	int pro=1;
	

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			pro*=i;
		}
		
	}
	public static void main(String[] args) {
		Threada th=new Threada();
		Thread newth=new Thread(th);
		newth.start();
		try {
			newth.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int result=th.pro;
		System.out.println(result);
	}
	

}
