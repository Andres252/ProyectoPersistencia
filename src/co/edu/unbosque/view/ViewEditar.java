package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

class ViewEditar extends JPanel {
    private JLabel posTeam;
    private JTextField tfPosTeam;
    private JLabel nameTeam;
    private JTextField tfNameTeam;
    private JButton btEditar;

    public ViewEditar() {
        setLayout(new GridBagLayout());
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        posTeam = new JLabel("Ingrese la ubicación del Equipo:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(posTeam, gbc);

        tfPosTeam = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(tfPosTeam, gbc);

        nameTeam = new JLabel("Cambiar nombre a:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(nameTeam, gbc);

        tfNameTeam = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(tfNameTeam, gbc);

        btEditar = new JButton("Editar");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(btEditar, gbc);
    }

    public JTextField getTextFieldUbicacionEquipo() {
        return tfPosTeam;
    }

    public JTextField getTextFieldNuevoNombre() {
        return tfNameTeam;
    }

    public JButton getBotonEditar() {
        return btEditar;
    }
}

