package practicamatrices;

public class MatricesProvider {
	
	public static int[][] getMatriz(String text) {
		if (text.equals("bandera_jamaica"))
			return getBanderaJamaica();
		if (text.equals("bandera_argentina"))
			return getBanderaArgentina();
		if (text.equals("bandera_francia"))
			return getBanderaFrancesa();
		if (text.equals("pabellon_francia"))
			return getPabellonFrances();
		if (text.equals("pleno_lila"))
			return getPleno();
		return getPleno(10, 10, 0xFF, 0xFF, 0xFF);			
	}
	
	/**
	 * Devuelve la Bandera Argentina. En una matriz de enteros representando los colores en RGB. 
	 *
	 * @see https://es.wikipedia.org/wiki/Bandera_de_la_Argentina
	 * @return Una matriz con la representación de la bandera argentina (sin el sol de mayo).
	 */
	private static int[][] getBanderaArgentina() {
		int alto = 100;
		int ancho = alto / 5 * 8; // La proporción oficial es 5 a 8
		int[][] m = new int[alto][ancho];
		 
		for (int j = 0 ; j < ancho; j++) { //  
			for (int i = 0 ; i < alto / 3 ; i++) {
				m[i][j] = 0x75AADB; // El color celeste oficial en RGB (117, 170, 219)
			}
			for (int i = alto / 3 ; i < alto/3*2; i++) {
				m[i][j] = 0xFFFFFF; // Blanco
			}
			for (int i = alto/3*2 ; i < alto; i++) {
				m[i][j] = 0x75AADB;
			}
		}
		return m;
	}

	/**
	 * Devuelve una matriz de 100 x 100 con todas sus celdas representando el color Lila RGB(182, 107, 232).
	 * 
	 * @return La matriz con la representación deseada. 
	 */
	private static int[][] getPleno() {
		return getPleno (100, 100, 182, 107, 232);		
	}

	/**
	 * Devuelve una matriz de ancho x alto con todas sus celdas representando el color RGB indicado.
	 * 
	 * @param alto El alto de la mtriz
	 * @param ancho El ancho de la matriz.
	 * @param red El componente rojo del color.
	 * @param green El componente verde del color.
	 * @param blue El componente azul del color.
	 * @return
	 */
	private static int[][] getPleno(int alto, int ancho, int red, int green, int blue) {
		// Implementar adecuadamente 
		return new int[150][150];
	}
	
	/**
	 * Devuelve la Bandera Francesa. En una matriz de enteros representando los colores en RGB.
	 *  
	 * @see https://es.wikipedia.org/wiki/Bandera_de_Francia 
	 * @return Una matriz con la representación de la bandera francesa.
	 */
	private static int[][] getBanderaFrancesa() {
		// Implementar adecuadamente
		int [][] m = new int[150][150];
		for (int i = m.length / 2 - 30; i < m.length / 2 + 30 ; i ++) {
			m[i][i-1] =  0xFF;
			m[i][i] =  0xFF;
			m[i][i+1] =  0xFF;
		}
		return m;
	}

	/**
	 * Devuelve el Pabellón Nancional Frances. En una matriz de enteros representando los colores en RGB.
	 *  
	 * @see https://es.wikipedia.org/wiki/Bandera_de_Francia 
	 * @return Una matriz con la representación del pabellón francés.
	 */	
	private static int[][] getPabellonFrances() {
		// Implementar adecuadamente
		// Prestar atención a la diferencia de proporciones entre las franjas para la
		// bandera y el pabellón de Francia
		int [][] m = new int[150][150];
		for (int i = m.length / 2 - 30; i < m.length / 2 + 30 ; i ++) {
			m[m.length-i][i-1] =  0xFF;
			m[m.length-i][i] =  0xFF;
			m[m.length-i][i+1] =  0xFF;
		}
		return m;
	}
	
	/**
	 * Devuelve la Bandera Jamaiquina. En una matriz de enteros representando los colores en RGB.
	 *  
	 * @see https://es.wikipedia.org/wiki/Bandera_de_Jamaica 
	 * @return Una matriz con la representación de la bandera de Jamaica.
	 */
	private static int[][] getBanderaJamaica() {
		int [][] m = new int[150][150];
		for (int i = m.length / 2 - 30; i < m.length / 2 + 30 ; i ++) {
			m[m.length/2-1][i] = 0xFF;
			m[m.length/2  ][i] = 0xFF;
			m[m.length/2+1][i] = 0xFF;
		}
		return m;
	}
		
}
