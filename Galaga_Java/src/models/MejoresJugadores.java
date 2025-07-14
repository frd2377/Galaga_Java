package models;

import java.nio.file.Files;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import patron_grupo_v_10.archivos;

public class MejoresJugadores {

	private archivos file = new archivos("src/jugadores/mejoresJugadores.txt");
	private String tiemposTexto = "";

	public MejoresJugadores() {
		
	}
	
	public Boolean listaVacia() throws Exception{
		if (file.readerFile().isBlank()) {
			return true;
		}
		return false;
	}
	
	
	public synchronized void guardarTiempo(String tiempo) throws Exception{
		if (listaVacia().equals(true) || (file.readerFile().split("\n").length >=0 && file.readerFile().split("\n").length <= 9)) {
			file.writeFile(tiempo, false);
		}else {
			String texto = "";
			String [] lineas = file.readerFile().split("\n");
			for (int i = 0; i < lineas.length-1; i++) {
				texto += lineas[i];
			}
			texto += tiempo;
			System.out.println(texto);
			file.writeFile(texto, true);
			
		}
	}
	
	public synchronized void ordenarTiempos(){
		try {
			String texto= "";
			// Tu cadena de tiempos en formato MM:SS
            tiemposTexto = file.readerFile();

            // Dividir la cadena en líneas
            String[] lineas = tiemposTexto.split("\n");

            // Convertir las cadenas en objetos LocalTime
            List<LocalTime> tiempos = new ArrayList<>();
            for (int i = 0; i < lineas.length; i++) {
                try {
                    // Limpiar espacios y analizar el tiempo
                    LocalTime tiempo = LocalTime.parse(lineas[i].trim());
                    tiempos.add(tiempo);
                } catch (Exception e) {
                    // Capturar cualquier excepción al analizar la cadena y mostrar el mensaje de error
                    System.err.println("Error al analizar el tiempo en la línea " + (i + 1) + ": " + e.getMessage());
                }
            }

            // Ordenar la lista de tiempos
            Collections.sort(tiempos);

            for (LocalTime tiempo : tiempos) {
                texto += tiempo.toString()+"\n";
            }
            
            System.out.println("Mejores Tiempos:");
            System.out.println(texto);
       
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
