public class EvenOddFrom2Thread {

	int i = 0;
	int j = 1;

	public void printOdd() throws Exception {
		synchronized(this) {
			System.out.println(j);
			j = j+2;
			notify();
			if(j < 10)wait();
		}
	}

	public void printEven() throws Exception {
		synchronized(this) {
			System.out.println(i);
			i = i + 2;
			notify();
			wait();
		}	
	}

	public static void main(String[] args) {
		EvenOddFrom2Thread c = new EvenOddFrom2Thread();
		
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				int p = 0;
				try {
					while(p < 5) {
					p++;
					c.printEven();				
					}
				} catch(Exception exception) {
					System.out.printf("%s%n", exception);
				}
				System.out.printf("Thread even terminated");
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				int p = 0;
				try {
						while(p < 5) {
						p++;
						c.printOdd();
						}
				} catch(Exception exception) {
					System.out.printf("%s%n", exception);
				}
				System.out.printf("Thread odd terminated");
			}
		});
		t.start();
		t2.start();
		System.out.println("main terminated");
	}
}
