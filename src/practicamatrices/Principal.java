package practicamatrices;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Principal extends JFrame {
	
	private Dibujo dibujo = new Dibujo( MatricesProvider.getMatriz("bandera_argentina") ); 
	
	public Principal() {
		JPanel panel = new JPanel ();
		JPanel panelBotones = new JPanel();
		JButton banderaArgentina= new JButton("Argentina");
		JButton banderaFrancia= new JButton("Francia (bandera)");
		JButton pabellonFrancia= new JButton("Francia (pabellon)");
		JButton banderaJamaica = new JButton("Jamaica");
		JButton plenoLila = new JButton("Pleno Lila");

		
		this.setTitle("Trabajo con matrices");
		this.setSize(500, 300);
		this.getContentPane().setLayout(new BorderLayout());
		

		// Pone el Dibujo (Canvas) dentro de un Panel para que se acomode mejor ante cambio de tamaños   
		panel.add(dibujo);
		this.getContentPane().add(panel, BorderLayout.CENTER);
		
		// Panel de botones
		panelBotones.setLayout(new GridLayout(3, 2));
		panelBotones.add(banderaArgentina);
		panelBotones.add(banderaJamaica);
		panelBotones.add(banderaFrancia);
		panelBotones.add(pabellonFrancia);
		panelBotones.add(plenoLila);
		this.getContentPane().add(panelBotones, BorderLayout.SOUTH);

		banderaJamaica.setActionCommand("bandera_jamaica");
		banderaArgentina.setActionCommand("bandera_argentina");
		banderaFrancia.setActionCommand("bandera_francia");
		pabellonFrancia.setActionCommand("pabellon_francia");
		plenoLila.setActionCommand("pleno_lila");
		

		// Clase anónima para manejar las acciones de los botones 
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					dibujo.setMatriz(MatricesProvider.getMatriz(e.getActionCommand()));
				} catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(Principal.this,
						    ex.toString() + "\n" + "Vea el la salida de error para mas detalles",
						    "Error",
						    JOptionPane.ERROR_MESSAGE);
				}
			}
		};
		
		// Asocia los eventos de los botones al listener
		banderaJamaica.addActionListener(al);
		banderaArgentina.addActionListener(al);
		banderaFrancia.addActionListener(al);
		pabellonFrancia.addActionListener(al);
		plenoLila.addActionListener(al);

		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Principal pr = new Principal();
		pr.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
