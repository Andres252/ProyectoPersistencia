package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

class ViewAgregar extends JPanel {
    private JLabel nameTeam;
    private JTextField tfNameTeam;
    private JLabel winTeam;
    private JTextField tfWinTeam;
    private JButton btAgregar;

    public ViewAgregar() {
        setLayout(new GridBagLayout());
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 

        nameTeam = new JLabel("Ingrese el nombre del Equipo:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(nameTeam, gbc);

        tfNameTeam = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(tfNameTeam, gbc);

        winTeam = new JLabel("Ingrese las Victorias del Equipo:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        add(winTeam, gbc);

        tfWinTeam = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(tfWinTeam, gbc);

        btAgregar = new JButton("Agregar");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(btAgregar, gbc);
    }

    public JTextField getTextFieldNombreEquipo() {
        return tfNameTeam;
    }

    public JTextField getTextFieldVictoriasEquipo() {
        return tfWinTeam;
    }
    
    public JButton getBotonAgregar() {
        return btAgregar;
    }
}