package programa;

import adaptadores.AdaptadorPS5ParaXbox2;
import controles.ControlePS5;
import sensores.SensorXbox2;

public class Programa {
	
	 public static void main(String[] args) {
	        
	        //Tem-se um Xbox2 e mas deseja-se usar um controle ps5:
	        SensorXbox2 adaptee = new SensorXbox2();
	        ControlePS5 target = new ControlePS5();
	        
	        //Cria-se um falso sensor de PS5 que, na verdade, traduz e repassa os comandos para o Xbox em quest�o:
	        AdaptadorPS5ParaXbox2 adapter = new AdaptadorPS5ParaXbox2(adaptee);
	        
	        //Conecta-se o controle ao adapter:
	        target.Conectar(adapter);
	    }
	

}
