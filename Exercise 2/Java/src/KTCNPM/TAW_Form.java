/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KTCNPM;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author haibk
 */
public class TAW_Form extends javax.swing.JFrame {

    /**
     * Creates new form TAW_Form
     */
    MainForm mainForm;
    public TAW_Form(MainForm mainForm) {
        this.mainForm = mainForm;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dongian = new javax.swing.JTextField();
        trungbinh = new javax.swing.JTextField();
        phuctap = new javax.swing.JTextField();
        btnTAW = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(226, 229, 253));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Loại tác nhân");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Đơn giản");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Trung bình");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Phức tạp");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Số tác nhân");

        dongian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dongian.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        trungbinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        trungbinh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        phuctap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phuctap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnTAW.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTAW.setText("OK");
        btnTAW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTAWActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(dongian)
                    .addComponent(trungbinh)
                    .addComponent(phuctap))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTAW, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dongian)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(trungbinh, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(phuctap, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTAW, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean isNumericOnlyNumber(String str)
    {
        return str.matches("\\d+");
    }  
    
    private void btnTAWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTAWActionPerformed
        boolean check = true;
        if (check && dongian.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập số tác nhân đơn giản");
            check = false;
        }
        if(check && !isNumericOnlyNumber(dongian.getText())){
            JOptionPane.showMessageDialog(rootPane, "Số tác nhân đơn giản phải là số nguyên dương");
            check = false;
        }
        
        if (check && trungbinh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập số tác nhân trung bình");
            check = false;
        }
        if(check && !isNumericOnlyNumber(trungbinh.getText())){
            JOptionPane.showMessageDialog(rootPane, "Số tác nhân trung bình phải là số nguyên dương");
            check = false;
        }
        if (check && phuctap.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập số tác nhân phức tạp");
            check = false;
        }
        if(check && !isNumericOnlyNumber(phuctap.getText())){
            JOptionPane.showMessageDialog(rootPane, "Số tác nhân phức tạp phải là số nguyên dương");
            check = false;
        }
        
        if(check){
            ArrayList<String> list = new ArrayList<>();
            int num1 = Integer.parseInt(dongian.getText());
            int num2 = Integer.parseInt(trungbinh.getText());
            int num3 = Integer.parseInt(phuctap.getText());
            
            int sum = num1*1 + num2*2 + num3*3;
            mainForm.setTextTAW(Integer.toString(sum));
            list.add("STT"); list.add("Loại tác nhân");list.add("Số tác nhân");list.add("Trọng số");  list.add("Tổng");
            list.add("1"); list.add("Đơn giản");list.add(Integer.toString(num1));list.add("1"); list.add(Integer.toString(num1)); 
            list.add("2"); list.add("Trung bình"); list.add(Integer.toString(num2));list.add("2"); list.add(Integer.toString(num2*2));
            list.add("3"); list.add("Phức tạp"); list.add(Integer.toString(num3));list.add("3"); list.add(Integer.toString(num3*3));
            list.add(" "); list.add("Cộng (1+2+3)"); list.add("TAW");list.add(""); list.add(Integer.toString(sum));
            
            mainForm.setListTAW(list);
            this.dispose();
        }
    }//GEN-LAST:event_btnTAWActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTAW;
    private javax.swing.JTextField dongian;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField phuctap;
    private javax.swing.JTextField trungbinh;
    // End of variables declaration//GEN-END:variables
}
