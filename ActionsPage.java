
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;


public class ActionsPage extends javax.swing.JFrame implements ActionListener {

 Connection con = null;
 PreparedStatement ps = null;
 
    public ActionsPage() {
        initComponents();
        
        
    //Apps Initialization
    setSize(730, 550);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setTitle("Search result");
    setResizable(false);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    //Components Initialization
    
     
    BtnDelete.addActionListener(this);
    BtnSearch.addActionListener(this);
    BtnChistory.addActionListener(this);
    BtnBlock.addActionListener(this);
    BtnActive.addActionListener(this);
  
    }


 @Override
    public void actionPerformed(ActionEvent evt)  {  
                         try {
                   
                  Class.forName("com.mysql.jdbc.Driver");
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb1","root","");
                 
}   catch (     ClassNotFoundException | SQLException ex) {
        Logger.getLogger(StudentApp.class.getName()).log(Level.SEVERE, null, ex);
    }
                         

  if (evt.getSource() == BtnSearch)
         {

String SrStudentId = SearchInput.getText();
try{
String query1="SELECT SrStudentId,SrFname,SrLname,SrEmail,SrTitle,SrCity,SrIntakeCode,SrPhone,SrAboutMe,SrCountry,SrAddress,SrzipCode,SrProgram,SrCourse,FilePath,Status FROM studentstab WHERE SrStudentId='"+SearchInput.getText()+"'";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(query1);

while(rs.next())
{
Sid.setText(rs.getString("SrStudentId"));
Fname.setText(rs.getString("SrFname"));
Lname.setText(rs.getString("SrLname"));
Email.setText(rs.getString("SrEmail"));
InTake.setText(rs.getString("SrIntakeCode"));
Mobile.setText(rs.getString("SrPhone"));
Country.setText(rs.getString("SrCountry"));
Address.setText(rs.getString("SrAddress"));
ZipC.setText(rs.getString("SrzipCode"));
Program.setText(rs.getString("SrProgram"));
AboutResult.setText(rs.getString("SrAboutMe"));
Course.setText(rs.getString("SrCourse"));
Title.setText(rs.getString("SrTitle"));
City.setText(rs.getString("SrCity"));
Status.setText(rs.getString("Status"));



  FoundResult.setText("1 student record match for  " + "[" +SearchInput.getText() + "]");
  FoundResult.setForeground(new java.awt.Color(51,0,153));

}
}
 catch (SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
                  }
         }        
     
     
          //DELETE
                             if (SearchInput.getText().length()==0){
   JOptionPane.showMessageDialog(null,"Please enter student id number" ,"Error!",
                                        JOptionPane.ERROR_MESSAGE); 
}
                             
                             
  if (evt.getSource() == BtnDelete){

String s1 =  SearchInput.getText(); 
try{
PreparedStatement ps = con.prepareStatement("DELETE FROM studentstab WHERE SrStudentId='"+SearchInput.getText()+"'");
//ps.setString(1, Admin_ID);
ps.executeUpdate();
JOptionPane.showMessageDialog(null,"Student Successfully deleted" ,"Deleted!!",
                                        JOptionPane.INFORMATION_MESSAGE);
SearchInput.setText("");
ActionsPage wipe = new  ActionsPage();
wipe.setVisible(rootPaneCheckingEnabled);
close();
}
 catch (SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
                  }
}
                             
                             //DELETE
                             
  if(evt.getSource() == BtnBlock){

     if(SearchInput.getText().length() == 0){
   
   JOptionPane.showMessageDialog(null, "No account to block"); 
 }
     else{
         try{
PreparedStatement ps = con.prepareStatement("UPDATE studentstab SET Status='Blocked' WHERE SrStudentId='"+SearchInput.getText()+"'");
        ps.executeUpdate(); 
        
Status.setText("Blocked");
Status.setForeground(new java.awt.Color(204,0,0));
FoundResult.setText("Account was blocked");
FoundResult.setForeground(new java.awt.Color(204,0,0));
         } catch (SQLException ex) {
             Logger.getLogger(ActionsPage.class.getName()).log(Level.SEVERE, null, ex);
         }
 
     }
 }
     //BLOCK
                             
 //Activate
                            
   if(evt.getSource() == BtnActive){

     if(SearchInput.getText().length() == 0){
   
   JOptionPane.showMessageDialog(null, "No account to unblock"); 
 }
     else{
         try{
PreparedStatement ps = con.prepareStatement("UPDATE studentstab SET Status='Active' WHERE SrStudentId='"+SearchInput.getText()+"'");
        ps.executeUpdate(); 
        
Status.setText("Unblocked");
Status.setForeground(new java.awt.Color(0,153,0));
FoundResult.setText("Account was renabled");
FoundResult.setForeground(new java.awt.Color(0,51,102));
         } catch (SQLException ex) {
             Logger.getLogger(ActionsPage.class.getName()).log(Level.SEVERE, null, ex);
         }
 
     }
 }                           
//Active
   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ResultPanel = new javax.swing.JPanel();
        Jlabel = new javax.swing.JLabel();
        ShowPhotoPanel = new javax.swing.JPanel();
        PhotoShow = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Country = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        City = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Sid = new javax.swing.JLabel();
        Program = new javax.swing.JLabel();
        Course = new javax.swing.JLabel();
        ZipC = new javax.swing.JLabel();
        InTake = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        Jlabel1 = new javax.swing.JLabel();
        Jlabel2 = new javax.swing.JLabel();
        Mobile = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Jlabel3 = new javax.swing.JLabel();
        BtnChistory = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        SearchInput = new javax.swing.JTextField();
        BtnSearch = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        FoundResult = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        AboutResult = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        jPanel7 = new javax.swing.JPanel();
        BrowseDB2 = new javax.swing.JButton();
        PrintPage2 = new javax.swing.JButton();
        EdiTSTD2 = new javax.swing.JButton();
        AddSDNT2 = new javax.swing.JButton();
        OpTON2 = new javax.swing.JButton();
        OpenNewWindow2 = new javax.swing.JButton();
        HOME_BTN2 = new javax.swing.JButton();
        SucMeUp2 = new javax.swing.JLabel();
        Debugger1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        SignOut2 = new javax.swing.JButton();
        BtnSearchPage2 = new javax.swing.JButton();
        BtnBlock = new javax.swing.JButton();
        BtnActive = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        signout1 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        print = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.orange));
        jPanel2.setForeground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Full Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Country / Address:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("City / Zip:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Student ID:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Program:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Course:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        ResultPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Jlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jlabel.setForeground(new java.awt.Color(0, 51, 102));
        Jlabel.setText("Intake Code");

        ShowPhotoPanel.setBackground(new java.awt.Color(204, 204, 204));
        ShowPhotoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        PhotoShow.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\default-avatar-160.png")); // NOI18N

        javax.swing.GroupLayout ShowPhotoPanelLayout = new javax.swing.GroupLayout(ShowPhotoPanel);
        ShowPhotoPanel.setLayout(ShowPhotoPanelLayout);
        ShowPhotoPanelLayout.setHorizontalGroup(
            ShowPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowPhotoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PhotoShow)
                .addContainerGap())
        );
        ShowPhotoPanelLayout.setVerticalGroup(
            ShowPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PhotoShow)
        );

        Fname.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        Lname.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        Country.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        Address.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        City.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        Email.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        Sid.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        Program.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        Course.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        ZipC.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        InTake.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        Status.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Status.setForeground(new java.awt.Color(0, 153, 0));

        Jlabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jlabel1.setForeground(new java.awt.Color(0, 51, 102));
        Jlabel1.setText("Zip Cod");

        Jlabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jlabel2.setForeground(new java.awt.Color(0, 51, 102));
        Jlabel2.setText("Mobile");

        Mobile.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        Title.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        Jlabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jlabel3.setForeground(new java.awt.Color(0, 51, 102));
        Jlabel3.setText("Address");

        javax.swing.GroupLayout ResultPanelLayout = new javax.swing.GroupLayout(ResultPanel);
        ResultPanel.setLayout(ResultPanelLayout);
        ResultPanelLayout.setHorizontalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addComponent(Title)
                                .addGap(18, 18, 18)
                                .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(ShowPhotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addComponent(Jlabel1)
                                .addGap(18, 18, 18)
                                .addComponent(ZipC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9))
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Program, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Course, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ResultPanelLayout.createSequentialGroup()
                                        .addComponent(Country, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Jlabel3)))
                                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ResultPanelLayout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ResultPanelLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addComponent(Sid, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ResultPanelLayout.createSequentialGroup()
                                        .addComponent(Jlabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ResultPanelLayout.createSequentialGroup()
                                        .addComponent(Jlabel)
                                        .addGap(43, 43, 43)
                                        .addComponent(InTake, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        ResultPanelLayout.setVerticalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Fname)
                            .addComponent(Lname)
                            .addComponent(Title))
                        .addGap(18, 18, 18)
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Country)
                            .addComponent(Address)
                            .addComponent(Jlabel3))
                        .addGap(18, 18, 18)
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(City)
                            .addComponent(ZipC)
                            .addComponent(Jlabel1)))
                    .addComponent(ShowPhotoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Email)
                        .addComponent(Jlabel2)
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Mobile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabel)
                    .addComponent(Sid)
                    .addComponent(InTake))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Program)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Course)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        BtnChistory.setBackground(new java.awt.Color(204, 51, 0));
        BtnChistory.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnChistory.setForeground(new java.awt.Color(255, 255, 255));
        BtnChistory.setText("Clear history");
        BtnChistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChistoryActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(204, 51, 0));
        BtnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        BtnDelete.setText("Delete");

        BtnSearch.setBackground(new java.awt.Color(204, 51, 0));
        BtnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        BtnSearch.setText("GO");

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

        jPanel11.setBackground(new java.awt.Color(204, 51, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search result");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FoundResult.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Enter student ID number here to get result");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("About");

        AboutResult.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(33, 33, 33)
                .addComponent(AboutResult, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(AboutResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jToolBar3.setBackground(new java.awt.Color(153, 153, 153));
        jToolBar3.setRollover(true);

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        BrowseDB2.setBackground(new java.awt.Color(153, 153, 153));
        BrowseDB2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BrowseDB2.setForeground(new java.awt.Color(255, 255, 255));
        BrowseDB2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\folder-explore-icon.png")); // NOI18N
        BrowseDB2.setFocusable(false);
        BrowseDB2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BrowseDB2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BrowseDB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseDB2ActionPerformed(evt);
            }
        });

        PrintPage2.setBackground(new java.awt.Color(153, 153, 153));
        PrintPage2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PrintPage2.setForeground(new java.awt.Color(255, 255, 255));
        PrintPage2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\print-icon.png")); // NOI18N
        PrintPage2.setFocusable(false);
        PrintPage2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PrintPage2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PrintPage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintPage2ActionPerformed(evt);
            }
        });

        EdiTSTD2.setBackground(new java.awt.Color(153, 153, 153));
        EdiTSTD2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EdiTSTD2.setForeground(new java.awt.Color(255, 255, 255));
        EdiTSTD2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\EditIcon.png")); // NOI18N
        EdiTSTD2.setFocusable(false);
        EdiTSTD2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EdiTSTD2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EdiTSTD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdiTSTD2ActionPerformed(evt);
            }
        });

        AddSDNT2.setBackground(new java.awt.Color(153, 153, 153));
        AddSDNT2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddSDNT2.setForeground(new java.awt.Color(255, 255, 255));
        AddSDNT2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\user_male_add2.png")); // NOI18N
        AddSDNT2.setFocusable(false);
        AddSDNT2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddSDNT2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddSDNT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSDNT2ActionPerformed(evt);
            }
        });

        OpTON2.setBackground(new java.awt.Color(0, 153, 204));
        OpTON2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OpTON2.setForeground(new java.awt.Color(255, 255, 255));
        OpTON2.setText("Moderators");
        OpTON2.setFocusable(false);
        OpTON2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OpTON2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        OpTON2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpTON2ActionPerformed(evt);
            }
        });

        OpenNewWindow2.setBackground(new java.awt.Color(153, 153, 153));
        OpenNewWindow2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OpenNewWindow2.setForeground(new java.awt.Color(255, 255, 255));
        OpenNewWindow2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\new_window.gif")); // NOI18N
        OpenNewWindow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenNewWindow2ActionPerformed(evt);
            }
        });

        HOME_BTN2.setBackground(new java.awt.Color(153, 153, 153));
        HOME_BTN2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\iconTinyHome.png")); // NOI18N
        HOME_BTN2.setFocusable(false);
        HOME_BTN2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HOME_BTN2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        HOME_BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOME_BTN2ActionPerformed(evt);
            }
        });

        SucMeUp2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        Debugger1.setBackground(new java.awt.Color(153, 153, 153));
        Debugger1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Debugger1.setForeground(new java.awt.Color(255, 255, 255));
        Debugger1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\01figem05.jpg")); // NOI18N
        Debugger1.setFocusable(false);
        Debugger1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Debugger1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Debugger1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Debugger1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(HOME_BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(AddSDNT2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EdiTSTD2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BrowseDB2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpenNewWindow2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Debugger1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(OpTON2)
                .addGap(39, 39, 39)
                .addComponent(SucMeUp2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddSDNT2)
                    .addComponent(PrintPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EdiTSTD2)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SucMeUp2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OpTON2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BrowseDB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HOME_BTN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OpenNewWindow2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Debugger1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar3.add(jPanel7);

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));

        SignOut2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\logout.png")); // NOI18N
        SignOut2.setFocusable(false);
        SignOut2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SignOut2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SignOut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOut2ActionPerformed(evt);
            }
        });

        BtnSearchPage2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\search-icon.png")); // NOI18N
        BtnSearchPage2.setFocusable(false);
        BtnSearchPage2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSearchPage2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSearchPage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchPage2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSearchPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignOut2)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSearchPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SignOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jToolBar3.add(jPanel15);

        BtnBlock.setBackground(new java.awt.Color(204, 51, 0));
        BtnBlock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnBlock.setForeground(new java.awt.Color(255, 255, 255));
        BtnBlock.setText("Block");
        BtnBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBlockActionPerformed(evt);
            }
        });

        BtnActive.setBackground(new java.awt.Color(204, 51, 0));
        BtnActive.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnActive.setForeground(new java.awt.Color(255, 255, 255));
        BtnActive.setText("Unblock");

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSearch)
                                .addGap(25, 25, 25)
                                .addComponent(BtnBlock)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnActive)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnChistory))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel6))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(FoundResult, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FoundResult, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnChistory)
                        .addComponent(BtnBlock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnActive))
                    .addComponent(SearchInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearch, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnChistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChistoryActionPerformed
Sid.setText("");
Fname.setText("");
Lname.setText("");
Email.setText("");
InTake.setText("");
Mobile.setText("");
Country.setText("");
Address.setText("");
ZipC.setText("");
Program.setText("");
AboutResult.setText("");
Course.setText("");
Title.setText("");
City.setText("");
Status.setText(""); 
FoundResult.setText("Cleared");
SearchInput.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_BtnChistoryActionPerformed

    private void BtnBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBlockActionPerformed


    }//GEN-LAST:event_BtnBlockActionPerformed

    private void HOME_BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOME_BTN2ActionPerformed
        AdminCpanel OpenHome = new AdminCpanel();
        OpenHome.setVisible(true);
        close();
        dispose();
    }//GEN-LAST:event_HOME_BTN2ActionPerformed

    private void OpenNewWindow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenNewWindow2ActionPerformed
        int i = 2;i++;
        ActionsPage NewWind = new ActionsPage();
        NewWind.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        NewWind.setLocation(dim.width/2-NewWind.getSize().width/i, dim.height/2-NewWind.getSize().height/2);        // TODO add your handling code here:
    }//GEN-LAST:event_OpenNewWindow2ActionPerformed

    private void OpTON2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpTON2ActionPerformed
        AdminTabS();
    }//GEN-LAST:event_OpTON2ActionPerformed

    private void AddSDNT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSDNT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddSDNT2ActionPerformed

    private void EdiTSTD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdiTSTD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdiTSTD2ActionPerformed

    private void PrintPage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintPage2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintPage2ActionPerformed

    private void BrowseDB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseDB2ActionPerformed
        try {
            close();
            BrowserRecords regFace = new BrowserRecords();
            regFace.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentApp.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseDB2ActionPerformed

    private void BtnSearchPage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchPage2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSearchPage2ActionPerformed

    private void SignOut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOut2ActionPerformed
        SignOuTCODE();        // TODO add your handling code here:
    }//GEN-LAST:event_SignOut2ActionPerformed

    private void Debugger1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Debugger1ActionPerformed
    DebugerU deBug = new DebugerU();       
            deBug.setVisible(true);
    }//GEN-LAST:event_Debugger1ActionPerformed

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
            java.util.logging.Logger.getLogger(ActionsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActionsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActionsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActionsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ActionsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutResult;
    private javax.swing.JButton AddSDNT2;
    private javax.swing.JLabel Address;
    private javax.swing.JButton BrowseDB2;
    private javax.swing.JButton BtnActive;
    private javax.swing.JButton BtnBlock;
    private javax.swing.JButton BtnChistory;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JButton BtnSearchPage2;
    private javax.swing.JLabel City;
    private javax.swing.JLabel Country;
    private javax.swing.JLabel Course;
    private javax.swing.JButton Debugger1;
    private javax.swing.JButton EdiTSTD2;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel FoundResult;
    private javax.swing.JButton HOME_BTN2;
    private javax.swing.JLabel InTake;
    private javax.swing.JLabel Jlabel;
    private javax.swing.JLabel Jlabel1;
    private javax.swing.JLabel Jlabel2;
    private javax.swing.JLabel Jlabel3;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel Mobile;
    private javax.swing.JButton OpTON2;
    private javax.swing.JButton OpenNewWindow2;
    private javax.swing.JLabel PhotoShow;
    private javax.swing.JButton PrintPage2;
    private javax.swing.JLabel Program;
    private javax.swing.JPanel ResultPanel;
    private javax.swing.JTextField SearchInput;
    private javax.swing.JPanel ShowPhotoPanel;
    private javax.swing.JLabel Sid;
    private javax.swing.JButton SignOut2;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel SucMeUp2;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel ZipC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JMenu print;
    private javax.swing.JMenu signout1;
    // End of variables declaration//GEN-END:variables

    private void close() {
             setVisible(false);
             dispose();
    }                                       

    private void SignOuTCODE() {
        AppHome Logout = new  AppHome();
        Logout.setVisible(true);
        close();
   JOptionPane.showMessageDialog(null, "You have logged out from the system?","Security Notice!!",
                                        JOptionPane.QUESTION_MESSAGE);
      
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
