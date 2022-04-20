package thread;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.WindowEvent;
import java.awt.event.WindowAdapter;

public class ThreadDemo2 extends Frame implements Runnable {
	TextField t1, t2;
	Thread th1, th2;
	int i,j;
	
	public ThreadDemo2() {
		setLayout(new FlowLayout());
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		th1 = new Thread(this);
		th2 = new Thread(this);
		th1.start();
		th2.start();
		
		addWindowListener(new WindowAdapter() {
        public void windowClosing(windowEvent e) {
        	System.exit(0);
        }
	
	});
		setSize(500,500);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadDemo2();
		

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			Thread th = Thread.currentThread();
			if(th.equals(th1)) {
				t1.setText(String.valueOf(i));
				if(i==100)
					i=0;
				else
					i++;
				
			}
			if(th.equals(th2)) {
				t2.setText(String.valueOf(j));
				if(j==100)
					j=0;
				else
					j++;
				}
			try {
				Thread.sleep(10);
				
			}
			catch(Exception e) {
			
		}
		
	}

}
}
