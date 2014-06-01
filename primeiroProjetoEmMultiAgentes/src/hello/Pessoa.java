package hello;

public class Pessoa implements Runnable{

	int clique = 0;
	private Thread t;
	private boolean rodando = true;
	
	public Pessoa(int p){
		t = new Thread(this	);
		t.setPriority(p);
	}

	@Override
	public void run() {
		while (rodando) {
			clique++;
		}
	}
	
	public void stop(){
		rodando = false;
	}
	
	public void start(){
		t.start();
	}
}
