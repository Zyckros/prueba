package manejoDeStrings;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] Args) {
		
		String texto = " \"AQUI_VAN_LOS_NOMBRES\"  hola esto es un texto de prueba donde los nombres de: \"AQUI_VAN_LOS_NOMBRES\" son las personas encargadas del area de programacion. \"AQUI_VAN_LOS_NOMBRES\" ";
		List<String> nombres = new ArrayList<String>();
	
			nombres.add("Luis");
			nombres.add("Mateo");	
			nombres.add("Juanjo");
			nombres.add("Perico");	
	
	texto = cambioString.cambioTexto(texto,nombres);
	
	System.out.println(texto);
	}
	
}
