/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.team2;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.BSONObject;
import org.bson.Document;

/**
 *
 * @author David
 */
public class Game extends javax.swing.JFrame {
    
 MongoClientURI uri = new MongoClientURI(
   "mongodb://DavidMcMahon1983:Karena_14@davidcluster1-shard-00-00-bzzsk.mongodb.net:27017,davidcluster1-shard-00-01-bzzsk.mongodb.net:27017,davidcluster1-shard-00-02-bzzsk.mongodb.net:27017/DavidCluster1?ssl=true&replicaSet=DavidCluster1-shard-0&authSource=admin");

MongoClient mongoClient = new MongoClient(uri);
MongoDatabase database = mongoClient.getDatabase("test");
MongoCollection collx =  database.getCollection("TeamCity");



methods methd = new methods();

String num1 = "";
int number1 = 0;
String num2 = "";
int number2 = 0;
int tsttc = 0;


    /**
     * Creates new form Game
     */
    public Game() {
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

        jPanel1 = new javax.swing.JPanel();
        Textbox1 = new javax.swing.JTextField();
        ComputeButton = new javax.swing.JButton();
        Textbox2 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        TextboxAnswer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Textbox1.setText("VALUE2");

        ComputeButton.setText("COMPUTE");
        ComputeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputeButtonActionPerformed(evt);
            }
        });

        Textbox2.setText("VALUE2");
        Textbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Textbox2ActionPerformed(evt);
            }
        });

        jLabel1.setText("          Please Enter Your Values");

        ClearButton.setText("CLEAR");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "ADD", "SUBTRACT", "DIVIDE", "MULTIPLY", "COUNTRY", "CURRENYCONVERT", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        TextboxAnswer.setText("Answer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComputeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Textbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Textbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextboxAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Textbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Textbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextboxAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(ComputeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComputeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputeButtonActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem().toString().equals("ADD")){
             System.out.println("Heelo dropdown");
             num1 = Textbox1.getText();
             num2 = Textbox2.getText();
             number1 = Integer.parseInt(num1);
             number2 = Integer.parseInt(num2);
             int answer = methd.addNum(number1,number2);
             String answerAsString = Integer.toString(answer);
             TextboxAnswer.setText(answerAsString);
             
              Document doc = new Document();
              doc.put("ADD",answerAsString);
              collx.insertOne(doc);
              System.out.println("Inserted to log");
             /* DBCursor cursor = (DBCursor) collx.find();
              int i = 1;
              while(cursor.hasNext()){
                  System.out.println("Inserted Document: " + i);
                  System.out.println(cursor.next());
                  i++;
              }
             */
        }
        
        if(jComboBox1.getSelectedItem().toString().equals("SUBTRACT")){
             System.out.println("Heelo dropdown");
             num1 = Textbox1.getText();
             num2 = Textbox2.getText();
             number1 = Integer.parseInt(num1);
             number2 = Integer.parseInt(num2);
             int answer = methd.subNum(number1,number2);
             String answerAsString = Integer.toString(answer);
             TextboxAnswer.setText(answerAsString);
              try{
              MongoCollection collx =  database.getCollection("TeamCity");
              BasicDBObject doc = new BasicDBObject();
              doc.put("SUBTRACT",answerAsString);
              collx.insertOne(doc);
              DBCursor cursor = (DBCursor) collx.find();
              int i = 1;
              while(cursor.hasNext()){
                  System.out.println("Inserted Document: " + i);
                  System.out.println(cursor.next());
                  i++;
              } 
             }catch(Exception e){
                 System.out.println("Catch The answer");
             }
        }
        
        if(jComboBox1.getSelectedItem().toString().equals("DIVIDE")){
             System.out.println("Heelo dropdown");
             num1 = Textbox1.getText();
             num2 = Textbox2.getText();
             number1 = Integer.parseInt(num1);
             number2 = Integer.parseInt(num2);
             int answer = methd.divNum(number1,number2);
             String answerAsString = Integer.toString(answer);
             TextboxAnswer.setText(answerAsString);
              try{
              BasicDBObject doc = new BasicDBObject();
              doc.put("DIVIDE",answerAsString);
              collx.insertOne(doc);
               DBCursor cursor = (DBCursor) collx.find();
              int i = 1;
              while(cursor.hasNext()){
                  System.out.println("Inserted Document: " + i);
                  System.out.println(cursor.next());
                  i++;
              }
             }catch(Exception e){
                 System.out.println("Catch The answer");
             }
        }
        
        if(jComboBox1.getSelectedItem().toString().equals("MULTIPLY")){
             System.out.println("Heelo dropdown");
             num1 = Textbox1.getText();
             num2 = Textbox2.getText();
             number1 = Integer.parseInt(num1);
             number2 = Integer.parseInt(num2);
             int answer = methd.mulNum(number1,number2);
             String answerAsString = Integer.toString(answer);
             TextboxAnswer.setText(answerAsString);
              try{
              BasicDBObject doc = new BasicDBObject();
              doc.put("MULTIPLY",answerAsString);
              collx.insertOne(doc);
               DBCursor cursor = (DBCursor) collx.find();
              int i = 1;
              while(cursor.hasNext()){
                  System.out.println("Inserted Document: " + i);
                  System.out.println(cursor.next());
                  i++;
              }
             }catch(Exception e){
                 System.out.println("Catch The answer");
             }
        }
        
        if(jComboBox1.getSelectedItem().toString().equals("COUNTRY")){
             System.out.println("Heelo dropdown");
             num1 = Textbox1.getText();
             num2 = Textbox2.getText();
             number1 = Integer.parseInt(num1);
             number2 = Integer.parseInt(num2);
             int answer = methd.retCountry(number1,number2);
             String answerAsString = methd.getCountry();
             TextboxAnswer.setText(answerAsString);
              try{
              BasicDBObject doc = new BasicDBObject();
              doc.put("COUNTRY",answerAsString);
              collx.insertOne(doc);
               DBCursor cursor = (DBCursor) collx.find();
              int i = 1;
              while(cursor.hasNext()){
                  System.out.println("Inserted Document: " + i);
                  System.out.println(cursor.next());
                  i++;
              }
             }catch(Exception e){
                 System.out.println("Catch The answer");
             }
        }
             
    }//GEN-LAST:event_ComputeButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Textbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Textbox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox2ActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        Textbox1.setText("");
        Textbox2.setText("");
        TextboxAnswer.setText("");
        
    }//GEN-LAST:event_ClearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton ComputeButton;
    private javax.swing.JTextField Textbox1;
    private javax.swing.JTextField Textbox2;
    private javax.swing.JTextField TextboxAnswer;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
