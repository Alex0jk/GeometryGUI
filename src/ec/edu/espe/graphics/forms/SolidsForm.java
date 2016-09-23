/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.graphics.forms;

import ec.edu.espe.graphics.forms.text.ComonText;
import ec.edu.espe.graphics.forms.text.SolidsCatalog;
import ec.edu.espe.graphics.forms.text.TransformationComonText;
import ec.edu.espe.math.geometry.solids.circularsolids.Cone;
import ec.edu.espe.math.geometry.solids.circularsolids.Cylinder;
import ec.edu.espe.math.geometry.solids.circularsolids.Frustum;
import ec.edu.espe.math.geometry.solids.circularsolids.Sphere;
import ec.edu.espe.math.geometry.solids.cubicsolids.Cube;
import ec.edu.espe.math.geometry.solids.solids.SolidInterface;
import ec.edu.espe.util.GeometricConstants;
import ec.edu.espe.util.SupportUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author alexander
 */
public class SolidsForm extends javax.swing.JFrame {

    /**
     * Creates new form SolidsForm
     */
    public SolidsForm() {
        initComponents();
        initializeComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SpherePanel = new javax.swing.JPanel();
        lblRadius = new javax.swing.JLabel();
        txtRadius = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        lblArea = new javax.swing.JLabel();
        lblVolume = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtVolume = new javax.swing.JTextField();
        cmbIn = new javax.swing.JComboBox<>();
        cmbOut = new javax.swing.JComboBox<>();
        CubePanel = new javax.swing.JPanel();
        lblSide = new javax.swing.JLabel();
        txtSide = new javax.swing.JTextField();
        lblArea2 = new javax.swing.JLabel();
        txtArea2 = new javax.swing.JTextField();
        lblVolume2 = new javax.swing.JLabel();
        txtVolume2 = new javax.swing.JTextField();
        Calculate1 = new javax.swing.JButton();
        cmbIn1 = new javax.swing.JComboBox<>();
        cmbOut1 = new javax.swing.JComboBox<>();
        ConePanel = new javax.swing.JPanel();
        lblHeight = new javax.swing.JLabel();
        lblRadius2 = new javax.swing.JLabel();
        txtRadius2 = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        lblArea3 = new javax.swing.JLabel();
        txtArea3 = new javax.swing.JTextField();
        lblVolume3 = new javax.swing.JLabel();
        txtVolume3 = new javax.swing.JTextField();
        Calculate2 = new javax.swing.JButton();
        cmbIn2 = new javax.swing.JComboBox<>();
        cmbOut2 = new javax.swing.JComboBox<>();
        CilinderPanel = new javax.swing.JPanel();
        lblHeight2 = new javax.swing.JLabel();
        lblRadius3 = new javax.swing.JLabel();
        txtRadius3 = new javax.swing.JTextField();
        txtHeight2 = new javax.swing.JTextField();
        lblArea4 = new javax.swing.JLabel();
        txtArea4 = new javax.swing.JTextField();
        lblVolume4 = new javax.swing.JLabel();
        txtVolume4 = new javax.swing.JTextField();
        Calculate3 = new javax.swing.JButton();
        cmbIn3 = new javax.swing.JComboBox<>();
        cmbOut3 = new javax.swing.JComboBox<>();
        FrustumPanel = new javax.swing.JPanel();
        lblHeight3 = new javax.swing.JLabel();
        lblMinRadius = new javax.swing.JLabel();
        txtRadiusMin = new javax.swing.JTextField();
        txtHeight3 = new javax.swing.JTextField();
        lblRadius4 = new javax.swing.JLabel();
        txtRadius4 = new javax.swing.JTextField();
        lblArea5 = new javax.swing.JLabel();
        txtArea5 = new javax.swing.JTextField();
        lblVolume5 = new javax.swing.JLabel();
        txtVolume5 = new javax.swing.JTextField();
        Calculate4 = new javax.swing.JButton();
        cmbIn4 = new javax.swing.JComboBox<>();
        cmbOut4 = new javax.swing.JComboBox<>();
        btnReturn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 660));
        getContentPane().setLayout(null);

        SpherePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        SpherePanel.setLayout(null);

        lblRadius.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRadius.setText("jLabel2");
        SpherePanel.add(lblRadius);
        lblRadius.setBounds(10, 20, 80, 14);
        SpherePanel.add(txtRadius);
        txtRadius.setBounds(140, 20, 90, 20);

        Calculate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Calculate.setText("jButton1");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        SpherePanel.add(Calculate);
        Calculate.setBounds(10, 100, 120, 23);

        lblArea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblArea.setText("jLabel5");
        SpherePanel.add(lblArea);
        lblArea.setBounds(10, 150, 110, 14);

        lblVolume.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVolume.setText("jLabel6");
        SpherePanel.add(lblVolume);
        lblVolume.setBounds(10, 180, 120, 14);

        txtArea.setEnabled(false);
        SpherePanel.add(txtArea);
        txtArea.setBounds(160, 150, 120, 20);

        txtVolume.setEnabled(false);
        txtVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolumeActionPerformed(evt);
            }
        });
        SpherePanel.add(txtVolume);
        txtVolume.setBounds(160, 180, 120, 20);

        cmbIn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\\Km", "Hm", "Dm", "m", "dm", "cm", "mm" }));
        SpherePanel.add(cmbIn);
        cmbIn.setBounds(253, 20, 60, 20);

        cmbOut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\\Km", "Hm", "Dm", "m", "dm", "cm", "mm" }));
        SpherePanel.add(cmbOut);
        cmbOut.setBounds(250, 100, 60, 20);

        getContentPane().add(SpherePanel);
        SpherePanel.setBounds(10, 70, 320, 220);

        CubePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        CubePanel.setLayout(null);

        lblSide.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSide.setText("jLabel2");
        CubePanel.add(lblSide);
        lblSide.setBounds(10, 20, 70, 14);
        CubePanel.add(txtSide);
        txtSide.setBounds(140, 20, 110, 20);

        lblArea2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblArea2.setText("jLabel5");
        CubePanel.add(lblArea2);
        lblArea2.setBounds(10, 150, 120, 14);

        txtArea2.setEnabled(false);
        CubePanel.add(txtArea2);
        txtArea2.setBounds(160, 140, 120, 20);

        lblVolume2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVolume2.setText("jLabel6");
        CubePanel.add(lblVolume2);
        lblVolume2.setBounds(10, 180, 120, 14);

        txtVolume2.setEnabled(false);
        CubePanel.add(txtVolume2);
        txtVolume2.setBounds(160, 170, 120, 20);

        Calculate1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Calculate1.setText("jButton1");
        Calculate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate1ActionPerformed(evt);
            }
        });
        CubePanel.add(Calculate1);
        Calculate1.setBounds(10, 100, 110, 23);

        cmbIn1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\\Km", "Hm", "Dm", "m", "dm", "cm", "mm" }));
        CubePanel.add(cmbIn1);
        cmbIn1.setBounds(273, 20, 60, 20);

        cmbOut1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\\Km", "Hm", "Dm", "m", "dm", "cm", "mm" }));
        CubePanel.add(cmbOut1);
        cmbOut1.setBounds(273, 110, 60, 20);

        getContentPane().add(CubePanel);
        CubePanel.setBounds(340, 70, 340, 220);

        ConePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        ConePanel.setLayout(null);

        lblHeight.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHeight.setText("jLabel2");
        ConePanel.add(lblHeight);
        lblHeight.setBounds(10, 20, 70, 14);

        lblRadius2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRadius2.setText("jLabel3");
        ConePanel.add(lblRadius2);
        lblRadius2.setBounds(10, 50, 80, 14);
        ConePanel.add(txtRadius2);
        txtRadius2.setBounds(160, 50, 90, 20);
        ConePanel.add(txtHeight);
        txtHeight.setBounds(160, 20, 90, 20);

        lblArea3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblArea3.setText("jLabel5");
        ConePanel.add(lblArea3);
        lblArea3.setBounds(10, 150, 110, 14);

        txtArea3.setEnabled(false);
        ConePanel.add(txtArea3);
        txtArea3.setBounds(160, 150, 120, 20);

        lblVolume3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVolume3.setText("jLabel6");
        ConePanel.add(lblVolume3);
        lblVolume3.setBounds(10, 174, 110, 20);

        txtVolume3.setEnabled(false);
        ConePanel.add(txtVolume3);
        txtVolume3.setBounds(160, 180, 120, 20);

        Calculate2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Calculate2.setText("jButton1");
        Calculate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate2ActionPerformed(evt);
            }
        });
        ConePanel.add(Calculate2);
        Calculate2.setBounds(10, 110, 120, 23);

        cmbIn2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\\Km", "Hm", "Dm", "m", "dm", "cm", "mm" }));
        ConePanel.add(cmbIn2);
        cmbIn2.setBounds(263, 20, 60, 20);

        cmbOut2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\\Km", "Hm", "Dm", "m", "dm", "cm", "mm" }));
        ConePanel.add(cmbOut2);
        cmbOut2.setBounds(263, 110, 60, 20);

        getContentPane().add(ConePanel);
        ConePanel.setBounds(690, 70, 340, 220);

        CilinderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        CilinderPanel.setLayout(null);

        lblHeight2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHeight2.setText("jLabel2");
        CilinderPanel.add(lblHeight2);
        lblHeight2.setBounds(10, 20, 80, 14);

        lblRadius3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRadius3.setText("jLabel3");
        CilinderPanel.add(lblRadius3);
        lblRadius3.setBounds(10, 50, 80, 14);
        CilinderPanel.add(txtRadius3);
        txtRadius3.setBounds(180, 50, 80, 20);
        CilinderPanel.add(txtHeight2);
        txtHeight2.setBounds(180, 20, 80, 20);

        lblArea4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblArea4.setText("jLabel5");
        CilinderPanel.add(lblArea4);
        lblArea4.setBounds(10, 140, 110, 14);

        txtArea4.setEnabled(false);
        CilinderPanel.add(txtArea4);
        txtArea4.setBounds(170, 140, 120, 20);

        lblVolume4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVolume4.setText("jLabel6");
        CilinderPanel.add(lblVolume4);
        lblVolume4.setBounds(10, 170, 120, 14);

        txtVolume4.setEnabled(false);
        CilinderPanel.add(txtVolume4);
        txtVolume4.setBounds(170, 170, 120, 20);

        Calculate3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Calculate3.setText("jButton1");
        Calculate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate3ActionPerformed(evt);
            }
        });
        CilinderPanel.add(Calculate3);
        Calculate3.setBounds(10, 110, 120, 23);

        cmbIn3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\\Km", "Hm", "Dm", "m", "dm", "cm", "mm" }));
        CilinderPanel.add(cmbIn3);
        cmbIn3.setBounds(263, 20, 60, 20);

        cmbOut3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\\Km", "Hm", "Dm", "m", "dm", "cm", "mm" }));
        CilinderPanel.add(cmbOut3);
        cmbOut3.setBounds(263, 110, 60, 20);

        getContentPane().add(CilinderPanel);
        CilinderPanel.setBounds(10, 330, 330, 210);

        FrustumPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        FrustumPanel.setLayout(null);

        lblHeight3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHeight3.setText("jLabel2");
        FrustumPanel.add(lblHeight3);
        lblHeight3.setBounds(10, 20, 70, 14);

        lblMinRadius.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMinRadius.setText("jLabel3");
        FrustumPanel.add(lblMinRadius);
        lblMinRadius.setBounds(10, 50, 70, 14);
        FrustumPanel.add(txtRadiusMin);
        txtRadiusMin.setBounds(189, 50, 100, 20);
        FrustumPanel.add(txtHeight3);
        txtHeight3.setBounds(189, 20, 100, 20);

        lblRadius4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRadius4.setText("jLabel4");
        FrustumPanel.add(lblRadius4);
        lblRadius4.setBounds(10, 80, 70, 14);
        FrustumPanel.add(txtRadius4);
        txtRadius4.setBounds(189, 80, 100, 20);

        lblArea5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblArea5.setText("jLabel5");
        FrustumPanel.add(lblArea5);
        lblArea5.setBounds(10, 140, 110, 14);

        txtArea5.setEnabled(false);
        FrustumPanel.add(txtArea5);
        txtArea5.setBounds(170, 140, 120, 20);

        lblVolume5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVolume5.setText("jLabel6");
        FrustumPanel.add(lblVolume5);
        lblVolume5.setBounds(10, 170, 120, 14);

        txtVolume5.setEnabled(false);
        FrustumPanel.add(txtVolume5);
        txtVolume5.setBounds(170, 170, 120, 20);

        Calculate4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Calculate4.setText("jButton1");
        Calculate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate4ActionPerformed(evt);
            }
        });
        FrustumPanel.add(Calculate4);
        Calculate4.setBounds(10, 110, 120, 23);

        cmbIn4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\\Km", "Hm", "Dm", "m", "dm", "cm", "mm" }));
        FrustumPanel.add(cmbIn4);
        cmbIn4.setBounds(293, 20, 60, 20);

        cmbOut4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\\Km", "Hm", "Dm", "m", "dm", "cm", "mm" }));
        FrustumPanel.add(cmbOut4);
        cmbOut4.setBounds(293, 110, 60, 20);

        getContentPane().add(FrustumPanel);
        FrustumPanel.setBounds(350, 330, 360, 210);

        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReturn.setText("Main Menu");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn);
        btnReturn.setBounds(790, 510, 140, 40);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Solids");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 30, 70, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Calculate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate1ActionPerformed
        //Calculate area and volume of Cube
        try{
        SolidInterface cube=new Cube(Float.parseFloat(txtSide.getText()));
        SupportUtil.showAreaVolume(cube, txtArea2, txtVolume2,cmbIn1.getSelectedIndex(),cmbOut1.getSelectedIndex());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, ComonText.ERROR);
        }
        
    }//GEN-LAST:event_Calculate1ActionPerformed

    private void txtVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolumeActionPerformed
        // BS
    }//GEN-LAST:event_txtVolumeActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // Calculate area and volume of sphere
        try{
        SolidInterface sphere=new Sphere(Float.parseFloat(txtRadius.getText()));
        SupportUtil.showAreaVolume(sphere, txtArea, txtVolume,cmbIn.getSelectedIndex(),cmbOut.getSelectedIndex());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, ComonText.ERROR);
        }
    }//GEN-LAST:event_CalculateActionPerformed

    private void Calculate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate2ActionPerformed
        // Calculate area and volume of cone
        try{
        SolidInterface cone=new Cone(Float.parseFloat(txtHeight.getText()),Float.parseFloat(txtRadius2.getText()));
        SupportUtil.showAreaVolume(cone, txtArea3, txtVolume3,cmbIn2.getSelectedIndex(),cmbOut2.getSelectedIndex());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, ComonText.ERROR);
        }
    }//GEN-LAST:event_Calculate2ActionPerformed

    private void Calculate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate3ActionPerformed
        // Calculate area and volume of cilinder
        try{
        SolidInterface cilinder=new Cylinder(Float.parseFloat(txtHeight2.getText()),Float.parseFloat(txtRadius3.getText()));
        SupportUtil.showAreaVolume(cilinder, txtArea4, txtVolume4,cmbIn3.getSelectedIndex(),cmbOut3.getSelectedIndex());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, ComonText.ERROR);
        }
    }//GEN-LAST:event_Calculate3ActionPerformed

    private void Calculate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate4ActionPerformed
        // Calculate area and volume of Frustum
        try{
        SolidInterface frustum=new Frustum(Float.parseFloat(txtHeight2.getText()),Float.parseFloat(txtRadiusMin.getText()),Float.parseFloat(txtRadius3.getText()));
        SupportUtil.showAreaVolume(frustum, txtArea5, txtVolume5,cmbIn4.getSelectedIndex(),cmbOut4.getSelectedIndex());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, ComonText.ERROR);
        }
    }//GEN-LAST:event_Calculate4ActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
       SupportUtil.openMainMenu(this);
    }//GEN-LAST:event_btnReturnActionPerformed
    private void initializeComponents(){
        SpherePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(SolidsCatalog.SPHERE));
        CubePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(SolidsCatalog.CUBE));
        ConePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(SolidsCatalog.CONE));
        CilinderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(SolidsCatalog.CILINDER));
        FrustumPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(SolidsCatalog.FRUSTUM));
        lblArea.setText(GeometricConstants.AREA);lblVolume.setText(GeometricConstants.VOLUME);
        lblArea2.setText(GeometricConstants.AREA);lblVolume2.setText(GeometricConstants.VOLUME);
        lblArea3.setText(GeometricConstants.AREA);lblVolume3.setText(GeometricConstants.VOLUME);
        lblArea4.setText(GeometricConstants.AREA);lblVolume4.setText(GeometricConstants.VOLUME);
        lblArea5.setText(GeometricConstants.AREA);lblVolume5.setText(GeometricConstants.VOLUME);
        lblRadius.setText(ComonText.RADIUS);lblHeight.setText(ComonText.HEIGHT);lblSide.setText(ComonText.SIDE);
        lblRadius2.setText(ComonText.RADIUS);lblHeight2.setText(ComonText.HEIGHT);lblMinRadius.setText(ComonText.MIN_RADIUS);
        lblRadius3.setText(ComonText.RADIUS);lblHeight3.setText(ComonText.HEIGHT);
        lblRadius4.setText(ComonText.RADIUS);
        Calculate.setText(ComonText.CALCULATE);
        Calculate1.setText(ComonText.CALCULATE);
        Calculate2.setText(ComonText.CALCULATE);
        Calculate3.setText(ComonText.CALCULATE);
        Calculate4.setText(ComonText.CALCULATE);
        cmbIn.setModel(new javax.swing.DefaultComboBoxModel<>(TransformationComonText.UNITS ));
        cmbIn1.setModel(new javax.swing.DefaultComboBoxModel<>(TransformationComonText.UNITS ));
        cmbIn2.setModel(new javax.swing.DefaultComboBoxModel<>(TransformationComonText.UNITS ));
        cmbIn3.setModel(new javax.swing.DefaultComboBoxModel<>(TransformationComonText.UNITS ));
        cmbIn4.setModel(new javax.swing.DefaultComboBoxModel<>(TransformationComonText.UNITS ));
        cmbOut.setModel(new javax.swing.DefaultComboBoxModel<>(TransformationComonText.UNITS ));
        cmbOut1.setModel(new javax.swing.DefaultComboBoxModel<>(TransformationComonText.UNITS ));
        cmbOut2.setModel(new javax.swing.DefaultComboBoxModel<>(TransformationComonText.UNITS ));
        cmbOut3.setModel(new javax.swing.DefaultComboBoxModel<>(TransformationComonText.UNITS ));
        cmbOut4.setModel(new javax.swing.DefaultComboBoxModel<>(TransformationComonText.UNITS ));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SolidsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolidsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolidsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolidsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolidsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Calculate1;
    private javax.swing.JButton Calculate2;
    private javax.swing.JButton Calculate3;
    private javax.swing.JButton Calculate4;
    private javax.swing.JPanel CilinderPanel;
    private javax.swing.JPanel ConePanel;
    private javax.swing.JPanel CubePanel;
    private javax.swing.JPanel FrustumPanel;
    private javax.swing.JPanel SpherePanel;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cmbIn;
    private javax.swing.JComboBox<String> cmbIn1;
    private javax.swing.JComboBox<String> cmbIn2;
    private javax.swing.JComboBox<String> cmbIn3;
    private javax.swing.JComboBox<String> cmbIn4;
    private javax.swing.JComboBox<String> cmbOut;
    private javax.swing.JComboBox<String> cmbOut1;
    private javax.swing.JComboBox<String> cmbOut2;
    private javax.swing.JComboBox<String> cmbOut3;
    private javax.swing.JComboBox<String> cmbOut4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblArea2;
    private javax.swing.JLabel lblArea3;
    private javax.swing.JLabel lblArea4;
    private javax.swing.JLabel lblArea5;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblHeight2;
    private javax.swing.JLabel lblHeight3;
    private javax.swing.JLabel lblMinRadius;
    private javax.swing.JLabel lblRadius;
    private javax.swing.JLabel lblRadius2;
    private javax.swing.JLabel lblRadius3;
    private javax.swing.JLabel lblRadius4;
    private javax.swing.JLabel lblSide;
    private javax.swing.JLabel lblVolume;
    private javax.swing.JLabel lblVolume2;
    private javax.swing.JLabel lblVolume3;
    private javax.swing.JLabel lblVolume4;
    private javax.swing.JLabel lblVolume5;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtArea2;
    private javax.swing.JTextField txtArea3;
    private javax.swing.JTextField txtArea4;
    private javax.swing.JTextField txtArea5;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtHeight2;
    private javax.swing.JTextField txtHeight3;
    private javax.swing.JTextField txtRadius;
    private javax.swing.JTextField txtRadius2;
    private javax.swing.JTextField txtRadius3;
    private javax.swing.JTextField txtRadius4;
    private javax.swing.JTextField txtRadiusMin;
    private javax.swing.JTextField txtSide;
    private javax.swing.JTextField txtVolume;
    private javax.swing.JTextField txtVolume2;
    private javax.swing.JTextField txtVolume3;
    private javax.swing.JTextField txtVolume4;
    private javax.swing.JTextField txtVolume5;
    // End of variables declaration//GEN-END:variables
}
