package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;

class ViewDatos extends JPanel {

    private JButton bCreate;
    private JButton bRemove;
    private JButton bEdit;
    private JButton bShow;

    public ViewDatos() {
        setLayout(null); 
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        JPanel Panel_DW = new JPanel();
        JPanel Panel_UP = new JPanel();
        Panel_DW.setBackground(Color.WHITE);
        Panel_UP.setBackground(Color.LIGHT_GRAY);

        bCreate = new JButton("Agregar");
        bCreate.setBounds(0, 10, 80, 30);
        Panel_UP.add(bCreate);

        bRemove = new JButton("Eliminar");
        bRemove.setBounds(120, 10, 80, 30);
        Panel_UP.add(bRemove);
        
        bEdit = new JButton("Editar"); 
        bEdit.setBounds(10, 50, 80, 30);
        Panel_UP.add(bEdit);
        
        bShow = new JButton("Mostrar");
        bShow.setBounds(120, 50, 80, 30);
        Panel_UP.add(bShow);

        Panel_UP.setBounds(0, 0, 450, 50);
        Panel_DW.setBounds(0, 50, 450, 250); 

        add(Panel_UP); 
        add(Panel_DW); 
    }
}