package entrega_semana_7_corrida_lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class poolCorredores {

	public static void main(String[] args) {
		
		
		ExecutorService pool = Executors.newFixedThreadPool(20);
		
		
		for (int i=0; i<20; i++) {
			Thread mainThread = Thread.currentThread();
			Runnable corredor = new Thread (new Corredor_Sem7(mainThread, 50+i), "corredor " + i);
			pool.submit(corredor);
	}
		
		
		
			//Professor, fiz o que eu achei que era a ideia... Não consegui aplicar o Lambda, mas ACREDITO que consegui fazer em 20 threads diferentes rodando dentro de uma pool
			//É isso. começando a proxima aula vou pedir pra você fazer esse exercício hehe
			//abraços até lá
		
	}

}
