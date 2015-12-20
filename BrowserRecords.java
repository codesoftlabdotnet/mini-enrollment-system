    import javax.swing.JOptionPane;   
    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Toolkit;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.ResultSetMetaData;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.Vector;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.table.DefaultTableModel;
    


public class BrowserRecords extends javax.swing.JFrame {


    public BrowserRecords()throws ClassNotFoundException{
        initComponents();
            //Apps Initialization
    setSize(770, 600);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setTitle("Browse Student record");
    setBackground(Color.DARK_GRAY);
    setResizable(false);

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    //Components Initialization

//SERVER CODE
         try {
                       Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb1","root","");
                        Statement state = con.createStatement();
                        ResultSet rs = state.executeQuery("SELECT SrStudentId,SrTitle,SrFname,SrLname,SrGender,SrAge,SrCountry,SrIntakeCode,SrzipCode,password1,Status,SrPostCode FROM studentstab");

                        
     ResultSetMetaData rsmetadata = rs.getMetaData(); 
     
   int columns = rsmetadata.getColumnCount(); 
   DefaultTableModel dtm = new DefaultTableModel();
   Vector columns_name = new Vector();
   Vector data_rows = new Vector();
   
   for(int i=1; i < columns; i++){
      columns_name.addElement(rsmetadata.getColumnName(i));
   }
   
   dtm.setColumnIdentifiers(columns_name);
   
   while (rs.next()){
       
       data_rows = new Vector();
        for(int j=1; j < columns; j++){
       data_rows.addElement(rs.getString(j));     
        }
 dtm.addRow(data_rows); 
   }
     myTable.setModel(dtm); 
}
           
        
 catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BrowserRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
   //SERVER CODE END
    }
    
    public void Initialize(){
            this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Premium.png")));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        NexT = new java.awt.Button();
        JumP = new java.awt.Button();
        N1P = new java.awt.Button();
        Prev = new java.awt.Button();
        N2P = new java.awt.Button();
        N3P = new java.awt.Button();
        NLaNp = new java.awt.Button();
        MorP = new java.awt.Button();
        N4P = new java.awt.Button();
        RemovSelected = new javax.swing.JButton();
        DeleteStudnT = new javax.swing.JButton();
        EdiTsTudent = new javax.swing.JButton();
        ViewStudent = new javax.swing.JButton();
        BlockStudent = new javax.swing.JButton();
        SaveChange = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel5 = new javax.swing.JPanel();
        BrowseDB = new javax.swing.JButton();
        PrintPage = new javax.swing.JButton();
        EdiTSTD = new javax.swing.JButton();
        AddSDNT = new javax.swing.JButton();
        OpTON = new javax.swing.JButton();
        OpenNewWindow = new javax.swing.JButton();
        HOME_BTN = new javax.swing.JButton();
        SucMeUp = new javax.swing.JLabel();
        BtnSearchPage = new javax.swing.JButton();
        SignOut = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        signout1 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        print = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Full Name", "Intake Code", "Mobile", "Country", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(myTable);

        NexT.setBackground(new java.awt.Color(204, 51, 0));
        NexT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        NexT.setForeground(new java.awt.Color(255, 255, 255));
        NexT.setLabel(">>|");

        JumP.setBackground(new java.awt.Color(204, 51, 0));
        JumP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        JumP.setForeground(new java.awt.Color(255, 255, 255));
        JumP.setLabel("last");

        N1P.setBackground(new java.awt.Color(204, 51, 0));
        N1P.setForeground(new java.awt.Color(255, 255, 255));
        N1P.setLabel("1");

        Prev.setBackground(new java.awt.Color(204, 51, 0));
        Prev.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Prev.setForeground(new java.awt.Color(255, 255, 255));
        Prev.setLabel("|<<");

        N2P.setBackground(new java.awt.Color(204, 51, 0));
        N2P.setForeground(new java.awt.Color(255, 255, 255));
        N2P.setLabel("2");

        N3P.setBackground(new java.awt.Color(204, 51, 0));
        N3P.setForeground(new java.awt.Color(255, 255, 255));
        N3P.setLabel("3");

        NLaNp.setBackground(new java.awt.Color(204, 51, 0));
        NLaNp.setForeground(new java.awt.Color(255, 255, 255));
        NLaNp.setLabel("1000..");

        MorP.setBackground(new java.awt.Color(204, 51, 0));
        MorP.setForeground(new java.awt.Color(255, 255, 255));
        MorP.setLabel("...");

        N4P.setBackground(new java.awt.Color(204, 51, 0));
        N4P.setForeground(new java.awt.Color(255, 255, 255));
        N4P.setLabel("4");

        RemovSelected.setBackground(new java.awt.Color(204, 51, 0));
        RemovSelected.setForeground(new java.awt.Color(255, 255, 255));
        RemovSelected.setText("Remove selected student");

        DeleteStudnT.setBackground(new java.awt.Color(204, 51, 0));
        DeleteStudnT.setForeground(new java.awt.Color(255, 255, 255));
        DeleteStudnT.setText("Delet");

        EdiTsTudent.setBackground(new java.awt.Color(204, 51, 0));
        EdiTsTudent.setForeground(new java.awt.Color(255, 255, 255));
        EdiTsTudent.setText("Edit");

        ViewStudent.setBackground(new java.awt.Color(204, 51, 0));
        ViewStudent.setForeground(new java.awt.Color(255, 255, 255));
        ViewStudent.setText("View");

        BlockStudent.setBackground(new java.awt.Color(204, 51, 0));
        BlockStudent.setForeground(new java.awt.Color(255, 255, 255));
        BlockStudent.setText("Block Account");

        SaveChange.setBackground(new java.awt.Color(204, 51, 0));
        SaveChange.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SaveChange.setForeground(new java.awt.Color(255, 255, 255));
        SaveChange.setText("Save changes");
        SaveChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveChangeActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUDENT RECORD LIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jToolBar1.setBackground(new java.awt.Color(153, 153, 153));
        jToolBar1.setRollover(true);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        BrowseDB.setBackground(new java.awt.Color(153, 153, 153));
        BrowseDB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BrowseDB.setForeground(new java.awt.Color(255, 255, 255));
        BrowseDB.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\folder-explore-icon.png")); // NOI18N
        BrowseDB.setFocusable(false);
        BrowseDB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BrowseDB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BrowseDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseDBActionPerformed(evt);
            }
        });

        PrintPage.setBackground(new java.awt.Color(153, 153, 153));
        PrintPage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PrintPage.setForeground(new java.awt.Color(255, 255, 255));
        PrintPage.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\print-icon.png")); // NOI18N
        PrintPage.setFocusable(false);
        PrintPage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PrintPage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PrintPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintPageActionPerformed(evt);
            }
        });

        EdiTSTD.setBackground(new java.awt.Color(153, 153, 153));
        EdiTSTD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EdiTSTD.setForeground(new java.awt.Color(255, 255, 255));
        EdiTSTD.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\EditIcon.png")); // NOI18N
        EdiTSTD.setFocusable(false);
        EdiTSTD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EdiTSTD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EdiTSTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdiTSTDActionPerformed(evt);
            }
        });

        AddSDNT.setBackground(new java.awt.Color(153, 153, 153));
        AddSDNT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddSDNT.setForeground(new java.awt.Color(255, 255, 255));
        AddSDNT.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\user_male_add2.png")); // NOI18N
        AddSDNT.setFocusable(false);
        AddSDNT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddSDNT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddSDNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSDNTActionPerformed(evt);
            }
        });

        OpTON.setBackground(new java.awt.Color(0, 153, 204));
        OpTON.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OpTON.setForeground(new java.awt.Color(255, 255, 255));
        OpTON.setText("Moderators");
        OpTON.setFocusable(false);
        OpTON.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OpTON.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        OpTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpTONActionPerformed(evt);
            }
        });

        OpenNewWindow.setBackground(new java.awt.Color(153, 153, 153));
        OpenNewWindow.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OpenNewWindow.setForeground(new java.awt.Color(255, 255, 255));
        OpenNewWindow.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\new_window.gif")); // NOI18N
        OpenNewWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenNewWindowActionPerformed(evt);
            }
        });

        HOME_BTN.setBackground(new java.awt.Color(153, 153, 153));
        HOME_BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\iconTinyHome.png")); // NOI18N
        HOME_BTN.setFocusable(false);
        HOME_BTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HOME_BTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        HOME_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOME_BTNActionPerformed(evt);
            }
        });

        SucMeUp.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        BtnSearchPage.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\search-icon.png")); // NOI18N
        BtnSearchPage.setFocusable(false);
        BtnSearchPage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSearchPage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSearchPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchPageActionPerformed(evt);
            }
        });

        SignOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\logout.png")); // NOI18N
        SignOut.setFocusable(false);
        SignOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SignOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(HOME_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(AddSDNT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EdiTSTD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintPage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BrowseDB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpenNewWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpTON)
                .addGap(40, 40, 40)
                .addComponent(SucMeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(BtnSearchPage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSearchPage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BrowseDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HOME_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OpenNewWindow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(AddSDNT)
                            .addComponent(SignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrintPage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdiTSTD)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SucMeUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OpTON, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jToolBar1.add(jPanel5);

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jToolBar1.add(jPanel14);

        jMenuBar1.setBackground(new java.awt.Color(204, 51, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        signout1.setForeground(new java.awt.Color(255, 255, 255));
        signout1.setText("File");
        jMenuBar1.add(signout1);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Help");
        jMenuBar1.add(jMenu1);

        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        jMenuBar1.add(print);

        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setText("Search");
        jMenuBar1.add(jMenu6);

        jMenu7.setForeground(new java.awt.Color(255, 255, 255));
        jMenu7.setText("Setting");
        jMenuBar1.add(jMenu7);

        jMenu8.setForeground(new java.awt.Color(255, 255, 255));
        jMenu8.setText("Window");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Prev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N1P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(N2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(N3P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(N4P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(MorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NexT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(JumP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(NLaNp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RemovSelected)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BlockStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteStudnT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EdiTsTudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveChange)
                        .addGap(93, 93, 93))))
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NexT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JumP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N1P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Prev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N3P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NLaNp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N4P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemovSelected)
                    .addComponent(BlockStudent)
                    .addComponent(DeleteStudnT)
                    .addComponent(EdiTsTudent)
                    .addComponent(ViewStudent)
                    .addComponent(SaveChange))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private javax.swing.JTextField SrFname;
    private javax.swing.JTextField SrLname;
    private javax.swing.JComboBox SrGender;
    private javax.swing.JTextField SrAge;
    private javax.swing.JTextField SrAddress;
    private javax.swing.JTextField SrAboutMe;
    private javax.swing.JComboBox SrBirthDay;
   
    private void SaveChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveChangeActionPerformed
    
String s1 = SrFname.getText();
String s2 = SrLname.getText();
String s3 = SrGender.getSelectedItem().toString();
String s4 = SrAge.getText();
String s5 = SrAddress.getText();
String s6 = SrAboutMe.getText();
String s7 = SrBirthDay.getSelectedItem().toString();
    


try{
     Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb1","root","");
                        Statement state = con.createStatement();
PreparedStatement rs = con.prepareStatement("Update studentstab set SID=?,SrFname=?,SrLname=?,SrGender=?,SrAge=?,SrAddress=?,SrAboutMe=?,SrBirthDay=? where SID=?");
rs.setString(1,s1);
rs.setString(2,s2);
rs.setString(3,s3);
rs.setString(4,s4);
rs.setString(5,s5);
rs.setString(6,s6);
rs.setString(7,s7);
rs.setString(8,s1);
rs.executeUpdate();
JOptionPane.showMessageDialog(null,"Successfully Updated");
}
catch(Exception ex)
{}

    }//GEN-LAST:event_SaveChangeActionPerformed

    private void BrowseDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseDBActionPerformed
        try {
            close();
            BrowserRecords regFace = new BrowserRecords();
            regFace.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BrowseDBActionPerformed

    private void PrintPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintPageActionPerformed
        System.out.print(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_PrintPageActionPerformed

    private void EdiTSTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdiTSTDActionPerformed

    }//GEN-LAST:event_EdiTSTDActionPerformed

    private void AddSDNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSDNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddSDNTActionPerformed

    private void OpTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpTONActionPerformed
        AdminTabS();
    }//GEN-LAST:event_OpTONActionPerformed

    private void OpenNewWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenNewWindowActionPerformed
        int i = 2;i++;
        StudentApp NewWind = new StudentApp();
        NewWind.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        NewWind.setLocation(dim.width/2-NewWind.getSize().width/i, dim.height/2-NewWind.getSize().height/2);
    }//GEN-LAST:event_OpenNewWindowActionPerformed

    private void HOME_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOME_BTNActionPerformed
        AdminCpanel OpenHome = new AdminCpanel();
        OpenHome.setVisible(true);
        close();
    }//GEN-LAST:event_HOME_BTNActionPerformed

    private void BtnSearchPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchPageActionPerformed
        ActionsPage HomeCp = new  ActionsPage();
        HomeCp.setVisible(true);
        close();
    }//GEN-LAST:event_BtnSearchPageActionPerformed

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        SignOuTCODE();
    }//GEN-LAST:event_SignOutActionPerformed
Connection con;

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
            java.util.logging.Logger.getLogger(BrowserRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrowserRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrowserRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrowserRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BrowserRecords().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(BrowserRecords.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSDNT;
    private javax.swing.JButton BlockStudent;
    private javax.swing.JButton BrowseDB;
    private javax.swing.JButton BtnSearchPage;
    private javax.swing.JButton DeleteStudnT;
    private javax.swing.JButton EdiTSTD;
    private javax.swing.JButton EdiTsTudent;
    private javax.swing.JButton HOME_BTN;
    private java.awt.Button JumP;
    private java.awt.Button MorP;
    private java.awt.Button N1P;
    private java.awt.Button N2P;
    private java.awt.Button N3P;
    private java.awt.Button N4P;
    private java.awt.Button NLaNp;
    private java.awt.Button NexT;
    private javax.swing.JButton OpTON;
    private javax.swing.JButton OpenNewWindow;
    private java.awt.Button Prev;
    private javax.swing.JButton PrintPage;
    private javax.swing.JButton RemovSelected;
    private javax.swing.JButton SaveChange;
    private javax.swing.JButton SignOut;
    private javax.swing.JLabel SucMeUp;
    private javax.swing.JButton ViewStudent;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable myTable;
    private javax.swing.JMenu print;
    private javax.swing.JMenu signout1;
    // End of variables declaration//GEN-END:variables
    private void close() {
             setVisible(false);
    }

    private void AdminTabS(){
        try {
            AdminTabS regFace3 = new AdminTabS();       
            regFace3.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BrowserRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    public void SignOuTCODE(){
        AppHome Logout = new  AppHome();
        Logout.setVisible(true);
        close();
}

}
