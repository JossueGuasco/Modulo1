package interfaz;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import negocio.GestorAnimales;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private GestorAnimales gestorAnimales;
    private JButton btnAnimales;
    private JButton btnSalir;

    public VentanaPrincipal()







    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAnimales) {
            VentanaAnimales ventana = new VentanaAnimales(gestorAnimales);
            ventana.setVisible(true);
        } else if (e.getSource() == btnSalir) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}
