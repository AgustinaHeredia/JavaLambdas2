package ExpresionesLambdas;

import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<String> listaPalabras = List.of("Juegos","Juego", "Oso", "Casa", "Marisopa", "Luz", "Estufa", "Contabilidad", "Luna");
        
        List<String> palabrasConO = listaPalabras.stream()
                .filter(s -> s.contains("o"))
                .filter(s -> s.length()> 5)
                .collect(Collectors.toList());
                
        System.out.println(palabrasConO);

	}

}
