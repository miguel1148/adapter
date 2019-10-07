package programa;

import adaptadores.AdaptadorNin64ParaXbox;
import adaptadores.AdaptadorPS5ParaXbox2;
import controles.ControleNin64;
import sensores.SensorXbox2;

public class Teste64 {
	
	 public static void main(String[] args) {
	        
	        //Tem-se um Xbox2 e mas deseja-se usar um controle ps5:
	        SensorXbox2 adaptee = new SensorXbox2();
	        ControleNin64 target = new ControleNin64();
	        
	        //Cria-se um falso sensor de PS5 que, na verdade, traduz e repassa os comandos para o Xbox em questão:
	        AdaptadorNin64ParaXbox adapter = new AdaptadorNin64ParaXbox(adaptee);
	        
	        //Conecta-se o controle ao adapter:
	        target.Conectar(adapter);
	    }

}
