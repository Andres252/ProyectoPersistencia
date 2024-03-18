package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

class ViewEliminar extends JPanel {
    private JLabel posTeam;
    private JTextField tfPosTeam;
    private JButton btEliminar;

    public ViewEliminar() {
        setLayout(new GridBagLayout());
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 

        posTeam = new JLabel("Ingrese la posición del Equipo:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(posTeam, gbc);

        tfPosTeam = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(tfPosTeam, gbc);

        btEliminar = new JButton("Eliminar");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(btEliminar, gbc);
    }

    public JTextField getTextFieldPosicionEquipo() {
        return tfPosTeam;
    }

    public JButton getBotonEliminar() {
        return btEliminar;
    }
}

