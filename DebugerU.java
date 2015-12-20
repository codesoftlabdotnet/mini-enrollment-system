
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.Dimension;


public class DebugerU extends javax.swing.JFrame implements ActionListener {

     handler handle;
     DebuggerConnct db = new DebuggerConnct();

    public DebugerU() {
        initComponents();
        
      db = new DebuggerConnct();
        handle = new handler();
      //swing components
         
    //Apps Initialization
    DebugBtn.addActionListener(handle);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setTitle("Debugging tool");
    setResizable(false);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    //Components Initialization
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    
  //an inner class .You can also write as a separate class
    class handler implements ActionListener
    {
        
    
        //must implement method
        //This is triggered whenever the user clicks the login button
        @Override
        
        public void actionPerformed(ActionEvent ae)
                
        {
             if(StudentId.getText().length()==0){
                    db0.setText("> Connecting to server...... Port: 8011,SID: 010110");
                c1.setText("[FAILED!]");
                db2.setText("> Request time out.");
                db2.setForeground(new java.awt.Color(255,0,0));
                db3.setText("> Request time out.");
                db3.setForeground(new java.awt.Color(255,0,0));
                db4.setText("> Request time out.");
                db4.setForeground(new java.awt.Color(255,0,0));
                db5.setText("> Packets: Sent = 3, Received = 0, Lost = 3 (100% loss)");
                db5.setForeground(new java.awt.Color(255,0,0));                
                
                }
            else if(Debugpassword.getText().length()==0){
                    db0.setText("> Connecting to server...... Port: 8011,SID: 010110");
                c1.setText("[FAILED!]");
                db2.setText("> Request time out.");
                db2.setForeground(new java.awt.Color(255,0,0));
                db3.setText("> Request time out.");
                db3.setForeground(new java.awt.Color(255,0,0));
                db4.setText("> Request time out.");
                db4.setForeground(new java.awt.Color(255,0,0));
                db5.setText("> Packets: Sent = 3, Received = 0, Lost = 3 (100% loss)");
                db5.setForeground(new java.awt.Color(255,0,0));
                }
            //checks if the button clicked
             else if(ae.getSource()==DebugBtn)
            {
               
                String DebuggingTool = Debugpassword.getText();
                String APIKey=null;
                APIKey = Debugpassword.getText();
                System.out.println("DebuggerId,APIKey:"+StudentId.getText()+","+APIKey);
 
                //The entered username and password are sent via "checkLogin()" which return boolean
                if(db.DebugUser(StudentId.getText(), APIKey))
                {
                db0.setText("> Connecting to server...... Port: 8011,SID: 010110");
                c1.setText("[Connected]");
                db1.setText("Debugging"+ StudentId.getText()+" Wait....");
                db2.setText("> Checking student.." +StudentId.getText()+ " ##ID#######");
                c2.setText("Done!");
                c2.setForeground(new java.awt.Color(204,204,0));
                db3.setText("> Checking password.."+ Debugpassword.getText()+ "##WUSIWYG###### ");
                c3.setText("Done!");
                c3.setForeground(new java.awt.Color(204,204,0));
                db4.setText("> Validating account ##O##U##T##P##U##T##");
                c4.setText("Done!");
                c4.setForeground(new java.awt.Color(204,204,0));
                db5.setText("> Packets: Sent = 1, Received = 1, Lost = 0 (0% loss)");
                c5.setText("(1)");
                c5.setForeground(new java.awt.Color(255,255,255));
                
 OkD.setText(":> Account with "+ StudentId.getText()+ " is valid");
OkD.setForeground(new java.awt.Color(0,102,255));

    }
                else
                {
                db0.setText("> Connecting to server...... Port: 8011,SID: 010110");
                c1.setText("[Connected]");
                db1.setText("Debugging"+ StudentId.getText()+" Wait....");
                db2.setText("> Checking student.." +StudentId.getText()+ " ##ID#######");
                db2.setForeground(new java.awt.Color(0,255,0));
                c2.setText("Failed!!");
                c2.setForeground(new java.awt.Color(255,0,0));
                db3.setText("> Checking password.."+ Debugpassword.getText()+ "##WUSIWYG###### ");
                db3.setForeground(new java.awt.Color(0,255,0));
                c3.setText("Failed!!");
                c3.setForeground(new java.awt.Color(255,0,0));
                db4.setText("> Validating account ##O##U##T##P##U##T##");
                db4.setForeground(new java.awt.Color(0,255,0));
                c4.setText("Failed!!");
                c4.setForeground(new java.awt.Color(255,0,0));
                db5.setText("> Packets: Sent = 1, Received = 0, Lost = 1 (100% loss)");
                db5.setForeground(new java.awt.Color(0,255,0));
                c5.setText("(0)");
                OkD.setText("> Error E45T.. Failed to debug data "+ StudentId.getText());
OkD.setForeground(new java.awt.Color(255,0,0));

                }
                
            

            }//if
            
        }//method
 
    }//inner class
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OkU = new javax.swing.JPanel();
        StudentId = new javax.swing.JTextField();
        DebugBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Debugpassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        OkD = new javax.swing.JLabel();
        db3 = new javax.swing.JLabel();
        db2 = new javax.swing.JLabel();
        dbname = new javax.swing.JLabel();
        db1 = new javax.swing.JLabel();
        db4 = new javax.swing.JLabel();
        db5 = new javax.swing.JLabel();
        db0 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentIdActionPerformed(evt);
            }
        });

        DebugBtn.setBackground(new java.awt.Color(204, 51, 0));
        DebugBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DebugBtn.setForeground(new java.awt.Color(255, 255, 255));
        DebugBtn.setText("Debug");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Student ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("Account debugger");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        OkD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        db3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        db3.setForeground(new java.awt.Color(0, 255, 0));

        db2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        db2.setForeground(new java.awt.Color(0, 255, 0));

        dbname.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        dbname.setForeground(new java.awt.Color(204, 204, 0));
        dbname.setText("Codesoftlab.net/debugger>>");

        db1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        db1.setForeground(new java.awt.Color(0, 255, 0));

        db4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        db4.setForeground(new java.awt.Color(0, 255, 0));

        db5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        db5.setForeground(new java.awt.Color(0, 255, 0));

        db0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        db0.setForeground(new java.awt.Color(0, 255, 0));

        c1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 102, 255));

        c2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 0, 0));

        c3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        c3.setForeground(new java.awt.Color(255, 0, 0));

        c4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        c4.setForeground(new java.awt.Color(255, 0, 0));

        c5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        c5.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dbname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(db1))
                            .addComponent(OkD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(db2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(db3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(db4, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(db0, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(db5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbname)
                    .addComponent(db1))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(db0)
                    .addComponent(c1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(db2)
                    .addComponent(c2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(db3)
                    .addComponent(c3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(db4)
                    .addComponent(c4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(db5)
                    .addComponent(c5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OkD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout OkULayout = new javax.swing.GroupLayout(OkU);
        OkU.setLayout(OkULayout);
        OkULayout.setHorizontalGroup(
            OkULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OkULayout.createSequentialGroup()
                .addGroup(OkULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OkULayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(StudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Debugpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DebugBtn)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(OkULayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(OkULayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OkULayout.setVerticalGroup(
            OkULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OkULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OkULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OkULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DebugBtn)
                    .addComponent(Debugpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OkU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(OkU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentIdActionPerformed

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
            java.util.logging.Logger.getLogger(DebugerU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DebugerU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DebugerU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DebugerU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DebugerU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DebugBtn;
    private javax.swing.JTextField Debugpassword;
    private javax.swing.JLabel OkD;
    private javax.swing.JPanel OkU;
    private javax.swing.JTextField StudentId;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel db0;
    private javax.swing.JLabel db1;
    private javax.swing.JLabel db2;
    private javax.swing.JLabel db3;
    private javax.swing.JLabel db4;
    private javax.swing.JLabel db5;
    private javax.swing.JLabel dbname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
