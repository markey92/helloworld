package VolatileTest;

public class MyThread extends Thread {
    public static int count;

    private void addCount() {
    	synchronized (this) {
            for (int i = 0; i < 100; i++) {
        		count++;
            }
		}
    	try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("count=" + count);
        
    }

    @Override
    public void run() {
        addCount();
    }
}
