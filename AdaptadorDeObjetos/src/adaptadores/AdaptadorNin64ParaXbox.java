package adaptadores;

import sensores.Sensor64;
import sensores.SensorXbox2;

public class AdaptadorNin64ParaXbox extends Sensor64{

	private SensorXbox2 adaptee;

    public AdaptadorNin64ParaXbox(SensorXbox2 adaptee) {
        this.adaptee = adaptee;
    }

    //Override da solicitação
    public void conectar64() {
        adaptee.conectarXbox2();
        System.out.println("64 !");
    }
}
