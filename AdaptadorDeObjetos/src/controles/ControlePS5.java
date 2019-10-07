package controles;

import sensores.SensorPs5;

public class ControlePS5 {
	
	 private SensorPs5 sensorAQueSeConecta;
	    
	    public void Conectar(SensorPs5 sensor){
	        this.sensorAQueSeConecta = sensor;
	        sensorAQueSeConecta.conectarPS5();
	    }

}
