package multithread;

	public class ThreadOverloading extends Thread {



		public void start()
		{
		System.out.println("Start Thread is running");
		}

		public void run()
		{
		System.out.println("Run Thread is running");
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadOverloading t1 = new ThreadOverloading();
		t1.start();
		System.out.println("Main Method");
		}
		
		}

