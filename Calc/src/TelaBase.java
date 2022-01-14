import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaBase extends JFrame implements ActionListener {
	
	JTextField txtNumero1 = new JTextField();
	JTextField txtNumero2 = new JTextField();

	JLabel lblResultado = new JLabel("0.0");	
	
	JButton btSomar = new JButton("Somar");
	JButton btSubtrair = new JButton("Subtrair");
	JButton btMultiplicar = new JButton("Multiplicar");
	JButton btDividir = new JButton("Dividir");
	
	JPanel painel = new JPanel(new GridLayout());
	
	TelaBase(){
		setSize (400,150);
		setLayout(new GridLayout(4,2));
		setResizable(false);
		setVisible(true);
		btSomar.setBackground(Color.WHITE);
		btSubtrair.setBackground(Color.WHITE);
		btMultiplicar.setBackground(Color.WHITE);
		btDividir.setBackground(Color.WHITE);
		txtNumero1.setBackground(Color.LIGHT_GRAY);
		txtNumero2.setBackground(Color.LIGHT_GRAY);
		lblResultado.setBorder(BorderFactory.createLineBorder(Color.black));
		
		add(painel);
		add(lblResultado);
		add(txtNumero1);
		add(txtNumero2);
		add(btSomar);
		add(btSubtrair);
		add(btMultiplicar);
		add(btDividir);
		
		btSomar.addActionListener(this);
		btSubtrair.addActionListener(this);
		btMultiplicar.addActionListener(this);
		btDividir.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		if (e.getSource()==btSomar) {
			float N1 = Float.valueOf(txtNumero1.getText());
			float N2 = Float.valueOf(txtNumero2.getText());
			float M = N1+N2;
			lblResultado.setText(String.valueOf(M));	
		
		} if (e.getSource()==btMultiplicar) {
			float N3 = Float.valueOf(txtNumero1.getText());
			float N4 = Float.valueOf(txtNumero2.getText());
			float M1 = N3*N4;
			lblResultado.setText(String.valueOf(M1));	
		
		} if (e.getSource()==btDividir) {
			float N5 = Float.valueOf(txtNumero1.getText());
			float N6 = Float.valueOf(txtNumero2.getText());
			float M2 = N5/N6;
			lblResultado.setText(String.valueOf(M2));	
		
		} if (e.getSource()==btSubtrair) {
			float N7 = Float.valueOf(txtNumero1.getText());
			float N8 = Float.valueOf(txtNumero2.getText());
			float M3 = N7-N8;
			lblResultado.setText(String.valueOf(M3));	
		
		}
		} catch (NumberFormatException erro){
		lblResultado.setText("Digite somente números");
	} 
		
		
	}
}
