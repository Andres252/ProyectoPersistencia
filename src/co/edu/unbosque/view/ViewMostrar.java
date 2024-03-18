package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

class ViewMostrar extends JPanel {
    private JTextArea txMostrar;

    public ViewMostrar() {
        setLayout(new BorderLayout());
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        txMostrar = new JTextArea();
        txMostrar.setEditable(false); 
        JScrollPane scrollPane = new JScrollPane(txMostrar); 
        add(scrollPane, BorderLayout.CENTER);
    }

    public void setTextoMostrar(String texto) {
        txMostrar.setText(texto);
    }
}

