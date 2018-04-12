import java.util.concurrent.CountDownLatch;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		int count = 10;
		CountDownLatch latch = new CountDownLatch(count);
		Thread[] t = new Thread[count];
		for(int i=0;i<t.length;i++){
			final int flag = i;
			t[i] = new Thread(new Runnable(){
				@Override
				public void run() {
					System.out.println(flag+1);
				}
				
			});
		}
		for(int i=0;i<t.length;i++){
			t[i].start();
			t[i].join();
		}
		System.out.println("最终用时:"+(System.currentTimeMillis()-startTime));
	}
	
}
