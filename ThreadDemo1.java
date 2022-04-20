package thread;

public abstract class ThreadDemo1 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ThreadDemo1());
		t.start();
		System.out.print(t.getName());
		

	}
	

}
