package practicamatrices;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Dibujo extends Canvas {
	
	private int[][] matriz;
	
	public Dibujo (int[][] matriz) {
		this.setMatriz(matriz);
	}
	
	public void setMatriz (int[][] matriz) {
		this.matriz = matriz;
		this.setSize(matriz[0].length, matriz.length);
		this.setBackground(Color.WHITE);
		this.repaint();
	}
	
	@Override
	public void paint(Graphics gr) {
		for (int i =0; i < this.matriz.length ; i++) {
			for (int j =0; j < this.matriz[i].length ; j++) {
				int r = matriz[i][j] >> 16 & 0xFF;
				int g = matriz[i][j] >> 8 & 0xFF;
				int b = matriz[i][j]  & 0xFF;
				gr.setColor( new Color (r, g, b) );
				gr.drawLine(j, i, j, i);
			}
		}
	}
}
