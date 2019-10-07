package controles;

import sensores.Sensor64;

public class ControleNin64 {
	
private Sensor64 sensorAQueSeConecta;
    
    public void Conectar(Sensor64 sensor){
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.conectar64();
    }

}
