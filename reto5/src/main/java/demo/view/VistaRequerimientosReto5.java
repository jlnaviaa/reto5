package demo.view;

import java.util.ArrayList;

import demo.controller.*;
import demo.model.vo.*;


public class VistaRequerimientosReto5 extends javax.swing.JFrame {
    
    
    // Declariacion de variables
    public static final Controlador control = new Controlador();                    
    private static javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    //private javax.swing.JTextArea jTextArea1;
    
    
    // Constructor del objeto VistaRequerimientosReto5
    public VistaRequerimientosReto5 () {
        initComponents();
    }
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Requerimientos Reto 5");
        setIconImages(null);

        jButton1.setText("Líder por salario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Proyectos por tipo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Líder por nombre");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Borrar consulta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jSplitPane1.setRightComponent(jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        requerimiento1();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        requerimiento2();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        requerimiento3();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextArea1.setText("");
    }           


               
    

    public static void requerimiento1() {
        String salida1 = "\t*** Lider por Salario ***\n\nNombre\tApellido\tID\tSalario\n";
        try {
            ArrayList<Liderporsalario> lista = control.requerimiento_1();
            
            for (Liderporsalario lider : lista) {

                salida1 += lider.getNombre();
                salida1 += "\t";
                salida1 += lider.getPrimerApellido();
                salida1 += "\t";
                salida1 += lider.getId_lider();
                salida1 += "\t";
                salida1 += lider.getSalario();
                salida1 += "\n";
            }
            jTextArea1.setText(salida1);
            
        } catch (Exception e) {

            System.err.println("Se produjo el siguiente error: "+ e.getMessage());
        }
    }

    public static void requerimiento2() {

        try {
            ArrayList<Proyectosportipo> lista = control.requerimiento_2();
            String salida2 = "\t*** Proyectos por tipo***\n\nID\tEstrato\tCiudad\tConstructora\n\n";
            for (Proyectosportipo proyecto : lista) {
                
                salida2 += proyecto.getId_proyecto();
                salida2 += "\t";
                salida2 += proyecto.getEstrato();
                salida2 += "\t";
                salida2 += proyecto.getCiudad();
                salida2 += "\t";
                salida2 += proyecto.getConstructora();
                salida2 += "\n";
                
            }
            jTextArea1.setText(salida2);

        } catch (Exception e) {
            System.out.println("Se produjo el siguiente error: " + e.getMessage());
        }

    }

    public static void requerimiento3() {

        try {
            ArrayList<Liderpornombre> lista = control.requerimiento_3();
            String salida3 = "\t*** Lider por nombre***\n\nID\tNombre\tApellido terminado en \'z\'\n";

            for (Liderpornombre lider : lista) {

                salida3 += lider.getId_lider();
                salida3 += "\t";
                salida3 += lider.getNombre();
                salida3 += "\t";
                salida3 += lider.getApellido();
                salida3 += "\n";
                
            }
            jTextArea1.setText(salida3);


        } catch (Exception e) {
            System.out.println("Se produjo el siguiente error: " + e.getMessage());
        }
    }
}