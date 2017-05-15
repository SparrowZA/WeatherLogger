/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherlogger;

/**
 *
 * @author Marc
 */
public class OptionUI extends javax.swing.JFrame {
    //OptionsObject options = new OptionsObject();
    //private final OptionsObject options = OptionsObject();
//    private int windUnit; //Set wind unit to default value of 1
//    private int tempUnit; //Set temperature unit to default value of 1
    private OptionsObject optionValues;    
    /**
     * Creates new form OptionUI
     */
    public OptionUI(OptionsObject test) {
        optionValues = test;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        windGroup = new javax.swing.ButtonGroup();
        tempGroup = new javax.swing.ButtonGroup();
        jMenuItem3 = new javax.swing.JMenuItem();
        saveGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kphRButton = new javax.swing.JRadioButton();
        mphRButton = new javax.swing.JRadioButton();
        celsiusRButton = new javax.swing.JRadioButton();
        farRButton = new javax.swing.JRadioButton();
        okButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textfileButton = new javax.swing.JRadioButton();
        dbButton = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        statsItem = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Wind speed measurement units");

        jLabel2.setText("Temperature measurement units");

        windGroup.add(kphRButton);
        kphRButton.setText("Kilometer per hour");

        windGroup.add(mphRButton);
        mphRButton.setText("Miles per hour");

        tempGroup.add(celsiusRButton);
        celsiusRButton.setText("Celsius");

        tempGroup.add(farRButton);
        farRButton.setText("Fahrenheit");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Save location");

        saveGroup.add(textfileButton);
        textfileButton.setText("Text file");

        saveGroup.add(dbButton);
        dbButton.setText("Database");

        jMenu1.setText("File");

        jMenuItem1.setText("Record");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        statsItem.setText("Stats");
        statsItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsActionPerformed(evt);
            }
        });
        jMenu1.add(statsItem);

        jMenuItem4.setText("Exit");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dbButton)
                        .addComponent(textfileButton, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kphRButton)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mphRButton)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(farRButton)
                            .addComponent(celsiusRButton)
                            .addComponent(jLabel2))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kphRButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mphRButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(celsiusRButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(farRButton)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dbButton)
                .addGap(48, 48, 48)
                .addComponent(okButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordActionPerformed
        this.dispose();
    }//GEN-LAST:event_recordActionPerformed

    private void statsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsActionPerformed
        this.dispose();
        new StatsUI().setVisible(true);
    }//GEN-LAST:event_statsActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        //Check which wind speed unit was selected
        if(kphRButton.isSelected()){
            optionValues.setWindOption(1);
        }
        if(mphRButton.isSelected()){
            optionValues.setWindOption(2);
        }
        
        //Check which temperature unit was selected
        if(celsiusRButton.isSelected()){
            optionValues.setTempOption(1);
        }
        if(farRButton.isSelected()){
            optionValues.setTempOption(2);
        }
        
        //Check which save location was selected
        if(textfileButton.isSelected()){
            optionValues.setLocation(1);
        }
        if(dbButton.isSelected()){
            optionValues.setLocation(2);
        }
        //options.setOptions(windUnit, tempUnit);
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton celsiusRButton;
    private javax.swing.JRadioButton dbButton;
    private javax.swing.JRadioButton farRButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JRadioButton kphRButton;
    private javax.swing.JRadioButton mphRButton;
    private javax.swing.JButton okButton;
    private javax.swing.ButtonGroup saveGroup;
    private javax.swing.JMenuItem statsItem;
    private javax.swing.ButtonGroup tempGroup;
    private javax.swing.JRadioButton textfileButton;
    private javax.swing.ButtonGroup windGroup;
    // End of variables declaration//GEN-END:variables
}
