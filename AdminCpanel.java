import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class AdminCpanel extends javax.swing.JFrame {

    public AdminCpanel() {
        initComponents();
           //Apps Initialization
    setSize(730, 550);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setTitle("Application Controll panel");
    setResizable(false);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    
    jMenuBar1 = new javax.swing.JMenuBar();

jMenuBar1.setBackground(new java.awt.Color(204, 51, 0));
    //Components Initialization

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        SELECT_BTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        PROFILE_BTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        STATIC_BTN = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ACCESS_BTN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        SETTING_BTN = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        INSERT_BTN = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        DataBase_BTN = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        DEBUGGER_BTN = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        WelCom = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));
        jPanel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        SELECT_BTN.setBackground(new java.awt.Color(255, 255, 255));
        SELECT_BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\BADGES\\index_files\\SOFT\\badges_Careers_Stage6.png")); // NOI18N
        SELECT_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELECT_BTNActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Browse");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SELECT_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SELECT_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        PROFILE_BTN.setBackground(new java.awt.Color(255, 255, 255));
        PROFILE_BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\BADGES\\index_files\\SOFT\\badges_Careers_Stage4.png")); // NOI18N
        PROFILE_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROFILE_BTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Profiles");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PROFILE_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PROFILE_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        STATIC_BTN.setBackground(new java.awt.Color(255, 255, 255));
        STATIC_BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\badges_DD_Console_Stage3.png")); // NOI18N
        STATIC_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STATIC_BTNActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("Access");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(STATIC_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(STATIC_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(31, 31, 31))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        ACCESS_BTN.setBackground(new java.awt.Color(255, 255, 255));
        ACCESS_BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\BADGES\\index_files\\SOFT\\badges_DD_Console_Stage2.png")); // NOI18N
        ACCESS_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACCESS_BTNActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("Blocked account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ACCESS_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ACCESS_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        SETTING_BTN.setBackground(new java.awt.Color(255, 255, 255));
        SETTING_BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\BADGES\\index_files\\SOFT\\badges_WP_BizOwners_Stage4.png")); // NOI18N
        SETTING_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SETTING_BTNActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Settings");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SETTING_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SETTING_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        INSERT_BTN.setBackground(new java.awt.Color(255, 255, 255));
        INSERT_BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\BADGES\\index_files\\SOFT\\badges_WP_BuildBlog_Stage2.png")); // NOI18N
        INSERT_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERT_BTNActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("Insert");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(INSERT_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(INSERT_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        DataBase_BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\badges_DD_Database_Stage6.png")); // NOI18N
        DataBase_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataBase_BTNActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setText("Database table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DataBase_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DataBase_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        DEBUGGER_BTN.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\badges_WP_BuildSites_Stage6.png")); // NOI18N
        DEBUGGER_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEBUGGER_BTNActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setText("Debugger");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DEBUGGER_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DEBUGGER_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(204, 51, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin CPanel Window");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        WelCom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WelCom.setForeground(new java.awt.Color(0, 51, 102));

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
                .addGap(56, 56, 56)
                .addComponent(SucMeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSearchPage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SucMeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OpTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OpenNewWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BrowseDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PrintPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EdiTSTD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddSDNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HOME_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BtnSearchPage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WelCom, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(WelCom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(80, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SELECT_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELECT_BTNActionPerformed
        ActionsPage regFace1 = new  ActionsPage();
        regFace1.setVisible(true);
        close();
    }//GEN-LAST:event_SELECT_BTNActionPerformed

    private void PROFILE_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROFILE_BTNActionPerformed
       ActionsPage regFace4 = new ActionsPage();
            regFace4.setVisible(true); 
            close();
    }//GEN-LAST:event_PROFILE_BTNActionPerformed

    private void STATIC_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STATIC_BTNActionPerformed
  
    }//GEN-LAST:event_STATIC_BTNActionPerformed

    private void ACCESS_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACCESS_BTNActionPerformed
 WelCom.setText("Function for blocke list not available");
    }//GEN-LAST:event_ACCESS_BTNActionPerformed

    private void SETTING_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SETTING_BTNActionPerformed
 WelCom.setText("Function for setting not available");
    }//GEN-LAST:event_SETTING_BTNActionPerformed

    private void INSERT_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERT_BTNActionPerformed
        StudentApp regFace6 = new StudentApp();
         regFace6.setVisible(true);
            close();   
              regFace6.pack();
    }//GEN-LAST:event_INSERT_BTNActionPerformed

    private void DEBUGGER_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEBUGGER_BTNActionPerformed
DebugerU Open = new DebugerU();
Open.setVisible(true);// TODO add your handling code here:
Open.pack();
    }//GEN-LAST:event_DEBUGGER_BTNActionPerformed

    private void DataBase_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataBase_BTNActionPerformed
           BrowserRecords regFace1 = null;  
        try {
            regFace1 = new BrowserRecords();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminCpanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            regFace1.setVisible(true);
            close();
    }//GEN-LAST:event_DataBase_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(AdminCpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCpanel().setVisible(true);
                new AdminCpanel().repaint();
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACCESS_BTN;
    private javax.swing.JButton AddSDNT;
    private javax.swing.JButton BrowseDB;
    private javax.swing.JButton BtnSearchPage;
    private javax.swing.JButton DEBUGGER_BTN;
    private javax.swing.JButton DataBase_BTN;
    private javax.swing.JButton EdiTSTD;
    private javax.swing.JButton HOME_BTN;
    private javax.swing.JButton INSERT_BTN;
    private javax.swing.JButton OpTON;
    private javax.swing.JButton OpenNewWindow;
    private javax.swing.JButton PROFILE_BTN;
    private javax.swing.JButton PrintPage;
    private javax.swing.JButton SELECT_BTN;
    private javax.swing.JButton SETTING_BTN;
    private javax.swing.JButton STATIC_BTN;
    private javax.swing.JButton SignOut;
    private javax.swing.JLabel SucMeUp;
    private javax.swing.JLabel WelCom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu print;
    private javax.swing.JMenu signout1;
    // End of variables declaration//GEN-END:variables
    private void close() {
             setVisible(false);
    }                                       

    private void SignOuTCODE() {
        AppHome Logout = new  AppHome();
        Logout.setVisible(true);
        close();
   JOptionPane.showMessageDialog(null, "You have logged out from the system?","Security Notice!!",
                                        JOptionPane.QUESTION_MESSAGE);
           WelCom.setText("You are now logged out");
    }
    
    private void AdminTabS(){
        try {
            AdminTabS regFace3 = new AdminTabS();       
            regFace3.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
