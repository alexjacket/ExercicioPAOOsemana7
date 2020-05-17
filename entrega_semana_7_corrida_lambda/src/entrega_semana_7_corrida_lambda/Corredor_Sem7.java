package entrega_semana_7_corrida_lambda;

public class Corredor_Sem7 implements Runnable {
	private double distanciaTotalDaCorrida = 500;
	private double distanciaTotalPercorrida = 0;
	private Thread mainThread;
	private double percentualCorredor;
	
	public Corredor_Sem7 (Thread mainThread, double percentualCorredor) {
		this.mainThread = mainThread;
		this.percentualCorredor = percentualCorredor;
	}
	
	
	@Override
	public void run() {
		
		try {
			mainThread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while (distanciaTotalPercorrida < distanciaTotalDaCorrida) {
			distanciaTotalPercorrida += Math.random() * percentualCorredor;
			System.out.printf("%s: %.2fm\n", Thread.currentThread().getName(), distanciaTotalPercorrida);
			if (distanciaTotalPercorrida > distanciaTotalDaCorrida) {
				System.out.println(Thread.currentThread().getName() + " acabou.");
			}
			try {
				Thread.sleep(2000 + (int)Math.random()*10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
