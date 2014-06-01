package hello;

public class Ru {
	
	public static void main(String args[]) throws InterruptedException{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		Pessoa aluno = new Pessoa(Thread.NORM_PRIORITY-4);
		Pessoa professor = new Pessoa(Thread.NORM_PRIORITY);
		Pessoa pne = new Pessoa(Thread.NORM_PRIORITY+4);
		
		pne.start();
		Thread.sleep(100);
		professor.start();
		Thread.sleep(100);
		aluno.start();
		Thread.sleep(100);
		
		aluno.stop();
		professor.stop();
		pne.stop();
		
		System.out.println("Pne\n"+pne.clique);
		System.out.println("Professor\n"+professor.clique);
		System.out.println("Aluno\n"+aluno.clique);
	}
}
