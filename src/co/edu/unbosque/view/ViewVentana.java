package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class ViewVentana extends JFrame {

    private ViewDatos viewdata;

    public ViewVentana() {
        setTitle("Equipos");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void inicializarComponentes() {
        viewdata = new ViewDatos();
        getContentPane().add(viewdata);
    }
}

