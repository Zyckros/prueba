package manejoDeStrings;
import java.util.List;


public final class cambioString {

	
	/**
	 * Esta funcion recibe dos parametros que son una String y un List. reemplaza parte del texto con los datos del List y devuelve el texto modificado.
	 * 
	 * @param texto - String
	 * @param nombres - List<String>
	 * @return
	 */
	public static String cambioTexto(String texto, List <String> nombres) {
		
		String juntandoNombres = nombres.toString();
		
		juntandoNombres = juntandoNombres.replace("[", "");
		juntandoNombres = juntandoNombres.replace("]", "");
		juntandoNombres += ".";
		
		texto = texto.replace("\"AQUI_VAN_LOS_NOMBRES\"", juntandoNombres);
		
		return texto;
	}
	
	
}
