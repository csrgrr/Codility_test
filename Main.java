
public class Main {
	
	public static int solution(int[] X, int[] Y, String colors) {
    	char[] colores = colors.toCharArray();
    	int[][] puntosRojos = new int[2][colores.length];
    	int[][] puntosVerdes = new int[2][colores.length];

    	int contadorRojo = 0;
    	int contadorVerde = 0;
    	int contador = 0;
    	
    	for (int i = 0; i < colores.length; i++) {
    		if(colores[i] == 'R') {
    			puntosRojos[0][i] = X[i];
    			puntosRojos[1][i] = Y[i];
    		} else if (colores[i] == 'G') {
    			puntosVerdes[0][i] = X[i];
    			puntosVerdes[1][i] = Y[i];
    		}
		}
    	for (int i = 0; i < colores.length; i++) {
    		while(contadorRojo+1 == contadorVerde || contadorRojo == contadorVerde+1 || contadorRojo == contadorVerde) {
    		if(i == Math.abs(puntosRojos[i][i])){
    			contadorRojo++;
    			contador++;
    			
    		} 
    		
    		if (i == Math.abs(puntosVerdes[i][i])) {
    			contadorVerde++;
    			contador++;
    		}
		}
    	}
		return contador;

       }
    
    public static void main(String[] args) {
    	 int[] X = {4, 0, 2, -2};
    	 int[] Y = {4, 1, 2, -3};
    	 String colors = "RGRR";
    	
    	
    	System.out.println(solution(X, Y, colors));
	}
}
