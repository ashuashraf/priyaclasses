package multithread;


class  Demo implements Runnable {
	
	public void run() {
		System.out.println("thread task");
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		Thread th=new Thread(d);
		th.start();
		
	}

}
