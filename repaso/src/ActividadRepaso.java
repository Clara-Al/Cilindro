import java.util.StringTokenizer;

public class ActividadRepaso {

	// para que se pueda mostrar la matriz
	static String matriz[][];
	
	public static void main(String[] args) {
		
		String lista = "Messi,Barcelona,Argentina,55000.0$Modric,RealMadrid,Croacia,52000.5$Iniesta,Barcelona,España,275000.0$Stoichkov,Barcelona,Bulgaria,752003.25$Ferrari,Sassuolo,Italia,99999.9";

		 
		System.out.println("Los datos de la lisata es"+lista);
		
		lista = lista.replaceAll("Barcelona", "FC Barcelona");
		
		// almacenar cada toquen por separado
		StringTokenizer  Equipos = new StringTokenizer(lista ,"\\$");
	    int cantidad = Equipos.countTokens();	
	    System.out.println(cantidad);

		StringTokenizer  jugadores = new StringTokenizer(Equipos.nextToken(),",");
		int cantidad1 = jugadores.countTokens();	
	    System.out.println(cantidad1);
	    
	    // para darle los valores de longitud de la mtriz (x , Y);
	    matriz = new String [cantidad][cantidad1];
	    		
		
		System.out.println(); 
		ingresaValores(matriz ,lista);
		System.out.println();
		imprimirMatriz(matriz);
		BuscarCroata(matriz);
	}
	

	public static void ingresaValores(String [][] matriz,String lista) {
		
		StringTokenizer  Equipos = new StringTokenizer(lista ,"\\$");
		
	for(int fila=0; fila<matriz.length;fila++) {
		
		StringTokenizer  jugadores = new StringTokenizer(Equipos.nextToken(),",");
		
		for(int columna=0; columna<matriz[0].length;columna++) {
			
			
			matriz[fila][columna]=jugadores.nextToken();
					
			
		}
	}
	}
	
	public static void	imprimirMatriz (String [][] matriz) {
		//recorro la matriz 
		
		for (int i=0; i<matriz.length;i++) {
			System.out.println();
			for (int j=0; j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+" "+" "); // mustro la matriz
	}
	System.out.println(); // hago un salto de linea -> para cada vez que recorra una columna salte de lines
}

}// cierra metodo imprimirMatriz
	
	
	public static void BuscarCroata (String [][] matriz){
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[0].length;j++) {
				
				if (matriz[i][j].equalsIgnoreCase("Croacia")) {
					System.out.println("Los datos del jugador croata son: ");
					for (int k=0;k<matriz[0].length;k++) {
						
						System.out.print(matriz[i][k]+" ");
					}
				}
			}
		}
	}
	
}

