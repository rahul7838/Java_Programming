class MultiThread {
	int i = 1;
	int n;
	MultiThread(int n) {
		this.n = n;
	}

	public static void main(String[] args) throws Exception {
		MultiThread m = new MultiThread(20);
			Thread one = new Thread(new Runnable() {

				@Override
				public void run() {
					
					try {
						m.printFizzBuzz();
					} catch(Exception e) {
						System.out.println(e);
					}
				}
			});

			Thread two = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						m.printFizz();
					} catch(Exception e) {
						System.out.println(e);
					}
				}
			});

			Thread three = new Thread(new Runnable() {

				@Override
				public void run() {
					
					try {
						m.printBuzz();
					} catch(Exception e) {
						System.out.println(e);
					}
				}
			});

			Thread four = new Thread(new Runnable() {

				@Override
				public void run() {
					
					try {
						m.printNumber();
					} catch(Exception e) {
						System.out.println(e);
					}
				}
			});

			one.start();
			two.start();
			three.start();
			four.start();

	}


	public void printFizzBuzz() throws Exception {
		while(true) {
			synchronized(this) {
				if(i > n) {
					notifyAll();
				 break;
				}
				if(i%3 == 0 && i%5 == 0) {
				   System.out.println("FizzBuzz");	
				   i++;
				}
				notifyAll();
				wait();
			}
			
		}
	}
	public void printFizz() throws Exception {
		while(true) {
			synchronized(this) {
				if(i > n) {
					notifyAll();
				break;
				}
				if(i%3 == 0 && i%5 !=0) {
				   System.out.println("Fizz");	
				   i++;
				}
				notifyAll();
				wait();
				
			}
			
		}
	}

	public void printBuzz() throws Exception {
		while(true) {
			synchronized(this) {
				if(i > n) {
					notifyAll();
				break;
				}
				if(i%5 == 0 && i %3 != 0) {
				   System.out.println("Buzz");	
				   i++;
				}
				notifyAll();
				wait();
			}
			
		}
	}

	public void printNumber() throws Exception {
		while(true) {
			synchronized(this) {
				if(i > n) {
					notifyAll();
				break;
				}

				if(i%3 != 0 && i%5 != 0) {
				   System.out.println(i);
				   i++;	
				}
				notifyAll();
				wait();
				
			}
			
		}
	}

}