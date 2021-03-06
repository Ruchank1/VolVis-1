/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import volvis.RaycastRenderer;

/**
 *
 * @author michel
 */
public class RaycastRendererPanel extends javax.swing.JPanel {

    RaycastRenderer renderer;
    TransferFunctionEditor tfEditor = null;
    TransferFunction2DEditor tfEditor2D = null;
    
    /**
     * Creates new form RaycastRendererPanel
     */
    public RaycastRendererPanel(RaycastRenderer renderer) {
        initComponents();
        this.renderer = renderer;
    }

    public void setSpeedLabel(String text) {
        renderingSpeedLabel.setText(text);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        renderingSpeedLabel = new javax.swing.JLabel();
        slicerButton = new javax.swing.JRadioButton();
        mipButton = new javax.swing.JRadioButton();
        compositingButton = new javax.swing.JRadioButton();
        tf2dButton = new javax.swing.JRadioButton();
        shadingCheckbox = new javax.swing.JCheckBox();
        blinnShadingCheckbox = new javax.swing.JCheckBox();
        goochShadingCheckbox = new javax.swing.JCheckBox();

        jLabel1.setText("Rendering time (ms):");

        renderingSpeedLabel.setText("jLabel2");

        buttonGroup1.add(slicerButton);
        slicerButton.setSelected(true);
        slicerButton.setText("Slicer");
        slicerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slicerButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(mipButton);
        mipButton.setText("MIP");
        mipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mipButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(compositingButton);
        compositingButton.setText("Compositing");
        compositingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositingButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(tf2dButton);
        tf2dButton.setText("2D Transfer function");
        tf2dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2dButtonActionPerformed(evt);
            }
        });

        shadingCheckbox.setText("Phong shading");
        shadingCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shadingCheckboxActionPerformed(evt);
            }
        });

        blinnShadingCheckbox.setText("Blinn shading");
        blinnShadingCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blinnShadingCheckboxActionPerformed(evt);
            }
        });

        goochShadingCheckbox.setText("Gooch tone shading (tried doesn't work");
        goochShadingCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goochShadingCheckboxActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(renderingSpeedLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(compositingButton)
                        .addComponent(tf2dButton)
                        .addComponent(mipButton)
                        .addComponent(slicerButton)
                        .addComponent(shadingCheckbox)
                            .addComponent(blinnShadingCheckbox)
                            .addComponent(goochShadingCheckbox)
                    ))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(renderingSpeedLabel))
                .addGap(49, 49, 49)
                .addComponent(slicerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mipButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(compositingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf2dButton)
                .addGap(18, 18, 18)
                .addComponent(shadingCheckbox)
                    .addGap(18, 18, 18)
                    .addComponent(blinnShadingCheckbox)
                    .addGap(18, 18, 18)
                    .addComponent(goochShadingCheckbox)
                .addContainerGap(137, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mipButtonActionPerformed
        renderer.setMIPMode();
    }//GEN-LAST:event_mipButtonActionPerformed

    private void slicerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slicerButtonActionPerformed
        renderer.setSlicerMode();
    }//GEN-LAST:event_slicerButtonActionPerformed

    private void compositingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositingButtonActionPerformed
        renderer.setCompositingMode();
    }//GEN-LAST:event_compositingButtonActionPerformed

    private void tf2dButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2dButtonActionPerformed
        renderer.setTF2DMode();
    }//GEN-LAST:event_tf2dButtonActionPerformed

    private void shadingCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadingCheckboxActionPerformed
        renderer.setPhongShadingMode(shadingCheckbox.isSelected());
    }//GEN-LAST:event_shadingCheckboxActionPerformed

    private void blinnShadingCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadingCheckboxActionPerformed
        renderer.setBlinnShadingMode(blinnShadingCheckbox.isSelected());
    }

    private void goochShadingCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadingCheckboxActionPerformed
        renderer.setGoochShadingMode(goochShadingCheckbox.isSelected());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton compositingButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton mipButton;
    private javax.swing.JLabel renderingSpeedLabel;
    private javax.swing.JCheckBox shadingCheckbox;
    private javax.swing.JRadioButton slicerButton;
    private javax.swing.JRadioButton tf2dButton;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JCheckBox blinnShadingCheckbox;
    private javax.swing.JCheckBox goochShadingCheckbox;

}
