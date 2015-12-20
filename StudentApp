    import javax.swing.JOptionPane;   
    import javax.swing.*;  
    import java.awt.*;  
    import java.awt.event.*;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.DriverManager;
    import java.awt.Dimension;
    import java.awt.Toolkit;
    import java.io.File;
    import javax.swing.JFileChooser;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;   
    import java.awt.HeadlessException;
    import java.sql.ResultSet;
    import java.sql.Statement;


public class StudentApp extends javax.swing.JFrame implements ActionListener{
    
 Connection con = null;
 PreparedStatement ps = null;
 
    public StudentApp() {
        initComponents();

    //Apps Initialization
     
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setTitle("Application Developed by Vtech int");
    setResizable(false);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    //Components Initialization

    BtnSaveForm.addActionListener(this);
    BtnResetForm.addActionListener(this);  
    BtnDelete.addActionListener(this);
    BtnUpdate.addActionListener(this);
    BtnSearchPage.addActionListener(this);
    BtnGet.addActionListener(this);
     
//ADD

     //ADD
    }

 
 @Override
    public void actionPerformed(ActionEvent evt)  {  
                         try {
                   
                  Class.forName("com.mysql.jdbc.Driver");
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb1","root","");
                 
}   catch (     ClassNotFoundException | SQLException ex) {
        Logger.getLogger(StudentApp.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        
 if (evt.getSource() == BtnSaveForm)
         {

     String s1 =  SrStudentId.getText();     
     String s2 =  SrFname.getText();
     String s3 =  SrLname.getText();
     String s4 =  SrGender.getSelectedItem().toString();
     String s5 =  SrAge.getText();
     String s6 =  SrAddress.getText();
     String s7 =  SrAboutMe.getText();
     String s8 =  SrBirthDay.getSelectedItem().toString();
     String s9 =  SrBirthMonth.getSelectedItem().toString();
     String s10 =  SrBirthYear.getSelectedItem().toString();
     String s11 =  SrCity.getText();
     String s12 =  SrCountry.getSelectedItem().toString();
     String s13 =  SrCourse.getText();
     String s14 =  SrEmail.getText();
     String s15 =  SrEndDay.getSelectedItem().toString();
     String s16 =  SrEndMonth.getSelectedItem().toString();
     String s17 =  SrEndYear.getSelectedItem().toString();
     String s18 =  SrIntakeCode.getText();
     String s19 =  SrPaymentType.getSelectedItem().toString();
     String s20 =  SrPhone.getText();
     String s21 =  SrProgram.getSelectedItem().toString();
     String s22 =  SrStartDay.getSelectedItem().toString();
     String s23 =  SrStartMonth.getSelectedItem().toString();
     String s24 =  SrStartYear.getSelectedItem().toString();   
     String s25 =  SrTitle.getSelectedItem().toString();
     String s26 =  SrzipCode.getText();
     String s27 = String.valueOf(password1.getPassword());
     String s28 = String.valueOf(password2.getPassword());   
     String s29 =  FilePath.getText();
     String s30 =  SrHealthDes.getText();
     String s31 =  SrDisYes.getText();
     String s32 =  SrHeltYes.getText();
     String s33 = SrPostCode.getText();
     


     
            
                  //VALIDATION
  if (
        password1.getText().length()==0 
     || password2.getPassword().length ==0
     || SrAboutMe.getText().length()==0
     || SrAge.getText().length()==0
     || SrAddress.getText().length()==0
     || SrCity.getText().length()==0
     || SrCourse.getText().length()==0
     || SrEmail.getText().length()==0
     || SrFname.getText().length()==0
     || SrIntakeCode.getText().length()==0
     || SrLname.getText().length()==0
     || SrPhone.getText().length()==0
     || SrStudentId.getText().length()==0
     || SrzipCode.getText().length()==0
                 ){
         JOptionPane.showMessageDialog(null, "All fields required !\r\n Please fill up Empty fields","warning!!",
                                        JOptionPane.WARNING_MESSAGE);        
 }
  else if (String.valueOf(password2.getPassword()).length()<6
          || String.valueOf(password2.getPassword()).length()<6){
    JOptionPane.showMessageDialog(null, "Password not strong !\r\n Enter more than 6 characters","warning!!",
                                        JOptionPane.WARNING_MESSAGE);  
  }
  
  else if(SrAge.getText().length()<0){
      JOptionPane.showMessageDialog(null, "Invalid age range","warning!!",
                                        JOptionPane.WARNING_MESSAGE);}
    else if(SrPhone.getText().length()<0){
      JOptionPane.showMessageDialog(null, "Invalid mobile number","warning!!",
                                        JOptionPane.WARNING_MESSAGE);}
        else if(SrzipCode.getText().length()>5){
      JOptionPane.showMessageDialog(null, "Invalid Area code","warning!!",
                                        JOptionPane.WARNING_MESSAGE);}
                else if(s24.equals(s17)){
      JOptionPane.showMessageDialog(null, "Your start date and End date can't be same","warning!!",
                                        JOptionPane.WARNING_MESSAGE);}

   //VALIDATION

                 
      else if (s27.equals(s28))
           {
               
               try {
                   
   
     ps = con.prepareStatement("INSERT INTO studentstab VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,Status='Active')");  
                   
                    
                    ps.setString(1, s1);
                    ps.setString(2, s2);
                    ps.setString(3, s3);
                    ps.setString(4, s4);
                    ps.setString(5, s5);
                    ps.setString(6, s6);              
                    ps.setString(7, s7);
                    ps.setString(8, s8);
                    ps.setString(9, s9);
                    ps.setString(10, s10);
                    ps.setString(11, s11);
                    ps.setString(12, s12);
                    ps.setString(13, s13);
                    ps.setString(14, s14);
                    ps.setString(15, s15);
                    ps.setString(16, s16);
                    ps.setString(17, s17);
                    ps.setString(18, s18);
                    ps.setString(19, s19);
                    ps.setString(20, s20);
                    ps.setString(21, s21);
                    ps.setString(22, s22);
                    ps.setString(23, s23);
                    ps.setString(24, s24);
                    ps.setString(25, s25);
                    ps.setString(26, s26);
                    ps.setString(27, s27);
                    ps.setString(28, s28);
                    ps.setString(29, s29);
                    ps.setString(30, s30);
                    ps.setString(31, s31);
                    ps.setString(32, s32);
                    ps.setString(33, s33);

                   int i = ps.executeUpdate();
          
                    i++;

                    if (1 > 0){
                        
                        JOptionPane.showMessageDialog(null, "New Student Record Was Successfully added","Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                        ClearPeterForm();
                        
                          
                           
                    }
                              else
           {

                JOptionPane.showMessageDialog(null, "Data not saved!","Error!!",
                                        JOptionPane.WARNING_MESSAGE);

            } 
               }
 
               
               catch (SQLException | HeadlessException e) {
			System.out.println("Exception1 is " + e);
                        JOptionPane.showMessageDialog(null, e,"Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
		}

            }
          else
           {

                JOptionPane.showMessageDialog(null, "Password Does Not Match","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);

            } 

        }

 
//UPDATE

 
     if (evt.getSource() == BtnUpdate)
{

     String s1 =  SrStudentId.getText();     
     String s2 =  SrFname.getText();
     String s3 =  SrLname.getText();
     String s4 =  SrGender.getSelectedItem().toString();
     String s5 =  SrAge.getText();
     String s6 =  SrAddress.getText();
     String s7 =  SrAboutMe.getText();
     String s8 =  SrBirthDay.getSelectedItem().toString();
     String s9 =  SrBirthMonth.getSelectedItem().toString();
     String s10 =  SrBirthYear.getSelectedItem().toString();
     String s11 =  SrCity.getText();
     String s12 =  SrCountry.getSelectedItem().toString();
     String s13 =  SrCourse.getText();
     String s14 =  SrEmail.getText();
     String s15 =  SrEndDay.getSelectedItem().toString();
     String s16 =  SrEndMonth.getSelectedItem().toString();
     String s17 =  SrEndYear.getSelectedItem().toString();
     String s18 =  SrIntakeCode.getText();
     String s19 =  SrPaymentType.getSelectedItem().toString();
     String s20 =  SrPhone.getText();
     String s21 =  SrProgram.getSelectedItem().toString();
     String s22 =  SrStartDay.getSelectedItem().toString();
     String s23 =  SrStartMonth.getSelectedItem().toString();
     String s24 =  SrStartYear.getSelectedItem().toString();   
     String s25 =  SrTitle.getSelectedItem().toString();
     String s26 =  SrzipCode.getText();
     String s27 = String.valueOf(password1.getPassword());
     String s28 = String.valueOf(password2.getPassword());
     String s29 =  FilePath.getText();
     String s30 =  SrHealthDes.getText();
     String s31 =  SrDisYes.getText();
     String s32 =  SrHeltYes.getText();
     String s33 = SrPostCode.getText();
     
        if (    GetSelect.getText().length()==0){

                JOptionPane.showMessageDialog(null, "No Student id found", "Failde",
                                        JOptionPane.ERROR_MESSAGE);
           }
        else if( String.valueOf(password1.getPassword()).length()==0
                || String.valueOf(password2.getPassword()).length()==0
                || SrEmail.getText().length()==0
                || SrFname.getText().length()==0
                || SrIntakeCode.getText().length()==0){
            
             JOptionPane.showMessageDialog(null, "Please fill required filed", "Failde",
                                        JOptionPane.INFORMATION_MESSAGE);
        }
          else if (String.valueOf(password2.getPassword()).length()<6
          || String.valueOf(password2.getPassword()).length()<6){
    JOptionPane.showMessageDialog(null, "Password not strong !\r\n Enter more than 6 characters","warning!!",
                                        JOptionPane.WARNING_MESSAGE);  
  }
        else if (s27.equals(s28))
           {
try{
PreparedStatement ps = con.prepareStatement("UPDATE studentstab SET SrStudentId=?,SrFname=?,SrLname=?,SrGender=?,SrAge=?,SrAddress=?,SrAboutMe=?,SrBirthDay=?,SrBirthMonth=?,SrBirthYear=?,SrCity=?,SrCountry=?,SrCourse=?,SrEmail=?,SrEndDay=?,SrEndMonth=?,SrEndYear=?,SrIntakeCode=?,SrPaymentType=?,SrPhone=?,SrProgram=?,SrStartDay=?,SrStartMonth=?,SrStartYear=?,SrTitle=?,SrzipCode=?,password1=?,password2=?,FilePath=?,SrHealthDes=?,SrDisYes=?,SrHeltYes=?,SrPostCode=? WHERE SrStudentId='"+GetSelect.getText()+"'");
                    
                    ps.setString(1, s1);
                    ps.setString(2, s2);
                    ps.setString(3, s3);
                    ps.setString(4, s4);
                    ps.setString(5, s5);
                    ps.setString(6, s6);              
                    ps.setString(7, s7);
                    ps.setString(8, s8);
                    ps.setString(9, s9);
                    ps.setString(10, s10);
                    ps.setString(11, s11);
                    ps.setString(12, s12);
                    ps.setString(13, s13);
                    ps.setString(14, s14);
                    ps.setString(15, s15);
                    ps.setString(16, s16);
                    ps.setString(17, s17);
                    ps.setString(18, s18);
                    ps.setString(19, s19);
                    ps.setString(20, s20);
                    ps.setString(21, s21);
                    ps.setString(22, s22);
                    ps.setString(23, s23);
                    ps.setString(24, s24);
                    ps.setString(25, s25);
                    ps.setString(26, s26);
                    ps.setString(27, s27);
                    ps.setString(28, s28);
                    ps.setString(29, s29);
                    ps.setString(30, s30);
                    ps.setString(31, s31);
                    ps.setString(32, s32);
                    ps.setString(33, s33);
                    ps.executeUpdate();
JOptionPane.showMessageDialog(null,"Account Successfully Updated ID" +GetSelect.getText(),"Updated!",
                                        JOptionPane.INFORMATION_MESSAGE);
SucMeUp.setText("1 record edited");
ClearPeterForm();
}
 catch (SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
                  }
            
            
            
                }
          else
           {

                JOptionPane.showMessageDialog(null, "Password Does Not Match","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);

            } 
}
           
 
//UPDATE END
     
     //SELECT ALL FOR EDITING
 if (evt.getSource() == BtnGet){
   //String SrStudentId = GetSelect.getText();

 try{
String query1="SELECT * FROM studentstab WHERE SrStudentId='"+GetSelect.getText()+"'";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(query1);

while(rs.next())
{
      SrStudentId.setText(rs.getString("SrStudentId"));
      SrFname.setText(rs.getString("SrFname"));
      SrLname.setText(rs.getString("SrLname"));
      SrGender.setSelectedItem(rs.getString("SrGender"));
      SrAge.setText(rs.getString("SrAge"));
      SrAddress.setText(rs.getString("SrAddress"));
      SrAboutMe.setText(rs.getString("SrAboutMe"));
      SrBirthDay.setSelectedItem(rs.getString("SrBirthDay"));
      SrBirthMonth.setSelectedItem(rs.getString("SrBirthMonth"));
      SrBirthYear.setSelectedItem(rs.getString("SrBirthYear"));
      SrCity.setText(rs.getString("SrCity"));
      SrCountry.setSelectedItem(rs.getString("SrCountry"));
      SrCourse.setText(rs.getString("SrCourse"));
      SrEmail.setText(rs.getString("SrEmail"));
      SrEndDay.setSelectedItem(rs.getString("SrEndDay"));
      SrEndMonth.setSelectedItem(rs.getString("SrEndMonth"));
      SrEndYear.setSelectedItem(rs.getString("SrEndYear"));
      SrIntakeCode.setText(rs.getString("SrIntakeCode"));
      SrPaymentType.setSelectedItem(rs.getString("SrPaymentType"));
      SrPhone.setText(rs.getString("SrPhone"));
      SrProgram.setSelectedItem(rs.getString("SrProgram"));
      SrStartDay.setSelectedItem(rs.getString("SrStartDay"));
      SrStartMonth.setSelectedItem(rs.getString("SrStartMonth"));
      SrStartYear.setSelectedItem(rs.getString("SrStartYear"));
      SrTitle.setSelectedItem(rs.getString("SrTitle"));
      SrzipCode.setText(rs.getString("SrzipCode"));
      password1.setText(rs.getString("password1"));
      password2.setText(rs.getString("password2"));
      SrHealthDes.setText(rs.getString("SrHealthDes"));
      SrDisYes.setText(rs.getString("SrDisYes"));
      SrHeltYes.setText(rs.getString("SrHeltYes"));
      SrPostCode.setText(rs.getString("SrPostCode"));
 SucMeUp.setText("Record Selected");

}
}
 catch (SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
                  }
         }  
     
     //SLECT
     
     //DELETE
            if (evt.getSource() == BtnDelete){

String s1 =  GetSelect.getText(); 
        if (GetSelect.getText().length() > 0){

try{
PreparedStatement ps = con.prepareStatement("DELETE FROM studentstab WHERE SrStudentId='"+GetSelect.getText()+"'");
//ps.setString(1, s1);
ps.executeUpdate();
JOptionPane.showMessageDialog(null,"Account Successfully deleted" ,"Deleted!",
                                        JOptionPane.PLAIN_MESSAGE);
GetSelect.setText("");
}

 catch (SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
                  }
}
        
 else{
JOptionPane.showMessageDialog(null, "No account Id to delete", "Failde",
                                        JOptionPane.ERROR_MESSAGE);
            }
    }
     //DELETE
          

    } 
    
    public void ClearPeterForm(){
      SrStudentId.setText("");
      SrFname.setText("");
      SrLname.setText("");
      SrGender.setSelectedItem("");
      SrAge.setText("");
      SrAddress.setText("");
      SrAboutMe.setText("");
      SrBirthDay.setSelectedItem("");
      SrBirthMonth.setSelectedItem("");
      SrBirthYear.setSelectedItem("");
      SrCity.setText("");
      SrCountry.setSelectedItem("");
      SrCourse.setText("");
      SrEmail.setText("");
      SrEndDay.setSelectedItem("");
      SrEndMonth.setSelectedItem("");
      SrEndYear.setSelectedItem("");
      SrIntakeCode.setText("");
      SrPaymentType.setSelectedItem("");
      SrPhone.setText("");
      SrProgram.setSelectedItem("");
      SrStartDay.setSelectedItem("");
      SrStartMonth.setSelectedItem("");
      SrStartYear.setSelectedItem("");
      SrTitle.setSelectedItem("");
      SrzipCode.setText("");
      password1.setText("");
      password2.setText("");
      FilePath.setText("");
      SrHealthDes.setText("");
      SrDisYes.setText("");
      SrHeltYes.setText("");
      SrPostCode.setText("");
      
      SucMeUp.setText("Cleard");
      SucMeUp.setText("One New record received");
      SucMeUp.setForeground(new java.awt.Color(153, 0, 0));
     
    }
        
    //MY FILE OPTION GOSE

         public void Initialize(){
     Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/PROGEAPPS/user_male_add2.png"));
    ImageIcon icon = new ImageIcon( );
    setIconImage(icon.getImage());
         }
        // add the component to the frame

    //MY FILE IS BACK



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        SrPaymentType = new javax.swing.JComboBox();
        SrIntakeCode = new javax.swing.JTextField();
        SrStudentId = new javax.swing.JTextField();
        SrProgram = new javax.swing.JComboBox();
        SrStartDay = new javax.swing.JComboBox();
        SrStartMonth = new javax.swing.JComboBox();
        SrStartYear = new javax.swing.JComboBox();
        SrEndDay = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        SrEndMonth = new javax.swing.JComboBox();
        SrEndYear = new javax.swing.JComboBox();
        SrCourse = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        password2 = new javax.swing.JPasswordField();
        BtnSaveForm = new javax.swing.JButton();
        BtnResetForm = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        BtnGet = new javax.swing.JButton();
        GetSelect = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        SrBirthMonth = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        SrBirthDay = new javax.swing.JComboBox();
        SrGender = new javax.swing.JComboBox();
        SrDisYes = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        SrDisNo = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SrLname = new javax.swing.JTextField();
        SrHealthDes = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        SrzipCode = new javax.swing.JTextField();
        SrBirthYear = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        SrAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PhotoFbrowse = new javax.swing.JPanel();
        JFilePickerBTN1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        FilePath = new javax.swing.JTextField();
        SrPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SrTitle = new javax.swing.JComboBox();
        SrEmail = new javax.swing.JTextField();
        SrCountry = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SrAboutMe = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        SrAddress = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        SrCity = new javax.swing.JTextField();
        SrHeltYes = new javax.swing.JCheckBox();
        SrFname = new javax.swing.JTextField();
        SrHeltNo = new javax.swing.JCheckBox();
        SrPostCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel26.setText("Fill enrolment and course information details for current students applying for FTMS collage Malaysia.");

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setForeground(new java.awt.Color(204, 51, 0));

        jLabel12.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Enrollment Type");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel14.setText("Start on:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel16.setText("Program:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel17.setText("Student Id No.:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 11));

        jLabel18.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel18.setText("Intake Code:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel19.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel19.setText("Payment type:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        SrPaymentType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrPaymentType.setForeground(new java.awt.Color(204, 51, 0));
        SrPaymentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Installmentally", "On time payment", "Scholarship" }));
        jPanel3.add(SrPaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 234, -1));
        jPanel3.add(SrIntakeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 244, -1));
        jPanel3.add(SrStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 244, -1));

        SrProgram.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrProgram.setForeground(new java.awt.Color(204, 51, 0));
        SrProgram.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Degree", "Foundation", "Masters" }));
        jPanel3.add(SrProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 163, -1));

        SrStartDay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrStartDay.setForeground(new java.awt.Color(204, 51, 0));
        SrStartDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "01", "02", "03", "04", "05", "06" }));
        jPanel3.add(SrStartDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, -1));

        SrStartMonth.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrStartMonth.setForeground(new java.awt.Color(204, 51, 0));
        SrStartMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Jan", "Feb", "Mar", "Apr", "May", "June" }));
        jPanel3.add(SrStartMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 70, -1));

        SrStartYear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrStartYear.setForeground(new java.awt.Color(204, 51, 0));
        SrStartYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "2014", "2015", "2016", "2017", "2018" }));
        jPanel3.add(SrStartYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 90, -1));

        SrEndDay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrEndDay.setForeground(new java.awt.Color(204, 51, 0));
        SrEndDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "01", "02", "03", "04", "05", "06" }));
        jPanel3.add(SrEndDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 70, -1));

        jLabel15.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel15.setText("End on:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel23.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel23.setText("Course:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        SrEndMonth.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrEndMonth.setForeground(new java.awt.Color(204, 51, 0));
        SrEndMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Jan", "Feb", "Mar", "Apr", "May", "Jun" }));
        jPanel3.add(SrEndMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 70, -1));

        SrEndYear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrEndYear.setForeground(new java.awt.Color(204, 51, 0));
        SrEndYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "2014", "2015", "2016", "2017", "2018" }));
        jPanel3.add(SrEndYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 80, -1));
        jPanel3.add(SrCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 240, -1));

        jLabel28.setFont(new java.awt.Font("Batang", 0, 11)); // NOI18N
        jLabel28.setText("Enter student password for online access");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 229, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 0, 0));
        jLabel29.setText(" (Leave empty for default pass)");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));
        jPanel3.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 115, 205, -1));
        jPanel3.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 146, 152, -1));

        BtnSaveForm.setBackground(new java.awt.Color(204, 51, 0));
        BtnSaveForm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnSaveForm.setForeground(new java.awt.Color(255, 255, 255));
        BtnSaveForm.setText("Register");
        BtnSaveForm.setToolTipText("Click to save");
        BtnSaveForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveFormActionPerformed(evt);
            }
        });
        jPanel3.add(BtnSaveForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 121, 30));

        BtnResetForm.setBackground(new java.awt.Color(204, 51, 0));
        BtnResetForm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnResetForm.setForeground(new java.awt.Color(255, 255, 255));
        BtnResetForm.setText("Reset");
        BtnResetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetFormActionPerformed(evt);
            }
        });
        jPanel3.add(BtnResetForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, 30));

        jLabel27.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel27.setText("Retype Password:");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 148, -1, -1));

        jLabel25.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel25.setText("Password:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 117, -1, -1));

        BtnUpdate.setBackground(new java.awt.Color(204, 51, 0));
        BtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        BtnUpdate.setText("Save edited");
        jPanel3.add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, 30));

        BtnDelete.setBackground(new java.awt.Color(204, 51, 0));
        BtnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        BtnDelete.setText("Delete");
        jPanel3.add(BtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, 30));

        jLabel34.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("V1.0 By Vtech inc http://codesoftlab.net");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        BtnGet.setBackground(new java.awt.Color(204, 51, 0));
        BtnGet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnGet.setForeground(new java.awt.Color(255, 255, 255));
        BtnGet.setText("Get");
        BtnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGetActionPerformed(evt);
            }
        });
        jPanel3.add(BtnGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 60, 30));
        jPanel3.add(GetSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 110, 27));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        SrBirthMonth.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrBirthMonth.setForeground(new java.awt.Color(204, 51, 0));
        SrBirthMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Jan", "Feb", "Mar", "Apr", "May", "Jun" }));

        jLabel2.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel2.setText("Last Name:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Disability?");

        SrBirthDay.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrBirthDay.setForeground(new java.awt.Color(204, 51, 0));
        SrBirthDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14" }));

        SrGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrGender.setForeground(new java.awt.Color(204, 51, 0));
        SrGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Male", "Female", "Trans", "She male", "Lady boy" }));

        SrDisYes.setBackground(new java.awt.Color(0, 204, 102));
        SrDisYes.setFont(new java.awt.Font("Batang", 1, 11)); // NOI18N
        SrDisYes.setForeground(new java.awt.Color(255, 255, 255));
        SrDisYes.setText("Yes");
        SrDisYes.setToolTipText("No disability");
        SrDisYes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel22.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel22.setText("Age:");

        SrDisNo.setBackground(new java.awt.Color(204, 0, 0));
        SrDisNo.setFont(new java.awt.Font("Batang", 1, 11)); // NOI18N
        SrDisNo.setForeground(new java.awt.Color(255, 255, 255));
        SrDisNo.setText("No");
        SrDisNo.setToolTipText("Disabled");
        SrDisNo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel21.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel21.setText("Title:");

        jLabel10.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel10.setText("Phone No.:");

        SrLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SrLnameActionPerformed(evt);
            }
        });

        SrHealthDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SrHealthDesActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Health Issues?");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 0, 0));
        jLabel33.setText("If yes describe here..");

        SrBirthYear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrBirthYear.setForeground(new java.awt.Color(204, 51, 0));
        SrBirthYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1990", "1991", "1992", "1993", "1995", "1996", "1997" }));

        jLabel1.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel1.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel4.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel8.setText("Zip Code:");

        jLabel7.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel7.setText("City:");

        PhotoFbrowse.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PhotoFbrowse.setForeground(new java.awt.Color(255, 255, 255));

        JFilePickerBTN1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JFilePickerBTN1.setForeground(new java.awt.Color(204, 51, 0));
        JFilePickerBTN1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Desktop\\PROGEAPPS\\gray-attach-icon.png")); // NOI18N
        JFilePickerBTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JFilePickerBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFilePickerBTN1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("28X28");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Photo:");

        jLabel30.setText("Choose Passport Size");

        javax.swing.GroupLayout PhotoFbrowseLayout = new javax.swing.GroupLayout(PhotoFbrowse);
        PhotoFbrowse.setLayout(PhotoFbrowseLayout);
        PhotoFbrowseLayout.setHorizontalGroup(
            PhotoFbrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhotoFbrowseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PhotoFbrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PhotoFbrowseLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FilePath)
                        .addGap(4, 4, 4)
                        .addComponent(JFilePickerBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(PhotoFbrowseLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(0, 7, Short.MAX_VALUE))))
        );
        PhotoFbrowseLayout.setVerticalGroup(
            PhotoFbrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhotoFbrowseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PhotoFbrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PhotoFbrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FilePath)
                    .addComponent(jLabel24)
                    .addComponent(JFilePickerBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel6.setText("Natiomality:");

        jLabel11.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel11.setText("E-mail:");

        SrTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrTitle.setForeground(new java.awt.Color(204, 51, 0));
        SrTitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Miss", "Mr", "Sir", "Mrs", "Dr" }));

        SrEmail.setText("@");

        SrCountry.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SrCountry.setForeground(new java.awt.Color(204, 51, 0));
        SrCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Nigeria", "Malaysia", "United State", "India" }));

        jLabel9.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel9.setText("Address:");

        SrAboutMe.setColumns(20);
        SrAboutMe.setRows(5);
        jScrollPane2.setViewportView(SrAboutMe);

        SrAddress.setColumns(20);
        SrAddress.setRows(5);
        jScrollPane1.setViewportView(SrAddress);

        jLabel5.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel5.setText("DOB");

        jLabel20.setFont(new java.awt.Font("Batang", 1, 12)); // NOI18N
        jLabel20.setText("About me:");

        SrHeltYes.setBackground(new java.awt.Color(0, 204, 102));
        SrHeltYes.setFont(new java.awt.Font("Batang", 1, 11)); // NOI18N
        SrHeltYes.setForeground(new java.awt.Color(255, 255, 255));
        SrHeltYes.setText("Yes");
        SrHeltYes.setToolTipText("Secect if yes");
        SrHeltYes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        SrHeltNo.setBackground(new java.awt.Color(204, 0, 0));
        SrHeltNo.setFont(new java.awt.Font("Batang", 1, 11)); // NOI18N
        SrHeltNo.setForeground(new java.awt.Color(255, 255, 255));
        SrHeltNo.setText("No");
        SrHeltNo.setToolTipText("Secect if no");
        SrHeltNo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Batang", 1, 11)); // NOI18N
        jLabel3.setText("Post Code");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel21))
                            .addComponent(jLabel20)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SrCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(SrzipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SrTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SrGender, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(SrFname, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SrBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SrBirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SrBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SrAge, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PhotoFbrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SrLname, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(SrPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SrDisYes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SrDisNo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel31)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SrHeltNo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SrHeltYes))
                                    .addComponent(jLabel32))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SrHealthDes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SrPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel11))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(SrCity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(SrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SrLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SrTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(SrFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PhotoFbrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SrPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(SrGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(SrBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SrBirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SrBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22)
                                            .addComponent(SrAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(SrCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(SrzipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(SrCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(SrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(SrHealthDes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel33))
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SrDisYes)
                                    .addComponent(SrDisNo)
                                    .addComponent(SrHeltNo)
                                    .addComponent(SrHeltYes))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(SrPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel20)))
                        .addContainerGap(22, Short.MAX_VALUE))))
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
                .addGap(140, 140, 140)
                .addComponent(SucMeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSearchPage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
    SignOuTCODE();      
    }//GEN-LAST:event_SignOutActionPerformed

    private void BtnResetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetFormActionPerformed
        ClearPeterForm();
        SucMeUp.setText("Form Cleard");
    }//GEN-LAST:event_BtnResetFormActionPerformed

    private void BtnSaveFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSaveFormActionPerformed

    private void SrLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SrLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SrLnameActionPerformed

    private void SrHealthDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SrHealthDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SrHealthDesActionPerformed

    private void JFilePickerBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFilePickerBTN1ActionPerformed

        // TODO add your handling code here:
        JFileChooser chooserPath= new JFileChooser();
        chooserPath.showOpenDialog(this);

        File F = chooserPath.getSelectedFile();
        String filename = F.getAbsolutePath();
        FilePath.setText(filename);
    }//GEN-LAST:event_JFilePickerBTN1ActionPerformed

    private void BtnSearchPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchPageActionPerformed
        ActionsPage HomeCp = new  ActionsPage();
        HomeCp.setVisible(true);
        close();
    }//GEN-LAST:event_BtnSearchPageActionPerformed

    private void HOME_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOME_BTNActionPerformed
        AdminCpanel OpenHome = new AdminCpanel();
        OpenHome.setVisible(true);
        close();

    }//GEN-LAST:event_HOME_BTNActionPerformed

    private void OpenNewWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenNewWindowActionPerformed
        int i = 2;i++;
        StudentApp NewWind = new StudentApp();
        NewWind.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        NewWind.setLocation(dim.width/2-NewWind.getSize().width/i, dim.height/2-NewWind.getSize().height/2);
    }//GEN-LAST:event_OpenNewWindowActionPerformed

    private void OpTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpTONActionPerformed
        AdminTabS();
    }//GEN-LAST:event_OpTONActionPerformed

    private void AddSDNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSDNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddSDNTActionPerformed

    private void EdiTSTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdiTSTDActionPerformed

    }//GEN-LAST:event_EdiTSTDActionPerformed

    private void PrintPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintPageActionPerformed
        System.out.print(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_PrintPageActionPerformed

    private void BrowseDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseDBActionPerformed
        try {
            close();
            BrowserRecords regFace = new BrowserRecords();
            regFace.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BrowseDBActionPerformed

    private void BtnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGetActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
          
            @Override
            public void run() {
                new StudentApp().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSDNT;
    private javax.swing.JButton BrowseDB;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnGet;
    private javax.swing.JButton BtnResetForm;
    private javax.swing.JButton BtnSaveForm;
    private javax.swing.JButton BtnSearchPage;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton EdiTSTD;
    private javax.swing.JTextField FilePath;
    private javax.swing.JTextField GetSelect;
    private javax.swing.JButton HOME_BTN;
    private javax.swing.JButton JFilePickerBTN1;
    private javax.swing.JButton OpTON;
    private javax.swing.JButton OpenNewWindow;
    private javax.swing.JPanel PhotoFbrowse;
    private javax.swing.JButton PrintPage;
    private javax.swing.JButton SignOut;
    private javax.swing.JTextArea SrAboutMe;
    private javax.swing.JTextArea SrAddress;
    private javax.swing.JTextField SrAge;
    private javax.swing.JComboBox SrBirthDay;
    private javax.swing.JComboBox SrBirthMonth;
    private javax.swing.JComboBox SrBirthYear;
    private javax.swing.JTextField SrCity;
    private javax.swing.JComboBox SrCountry;
    private javax.swing.JTextField SrCourse;
    private javax.swing.JRadioButton SrDisNo;
    private javax.swing.JRadioButton SrDisYes;
    private javax.swing.JTextField SrEmail;
    private javax.swing.JComboBox SrEndDay;
    private javax.swing.JComboBox SrEndMonth;
    private javax.swing.JComboBox SrEndYear;
    private javax.swing.JTextField SrFname;
    private javax.swing.JComboBox SrGender;
    private javax.swing.JTextField SrHealthDes;
    private javax.swing.JCheckBox SrHeltNo;
    private javax.swing.JCheckBox SrHeltYes;
    private javax.swing.JTextField SrIntakeCode;
    private javax.swing.JTextField SrLname;
    private javax.swing.JComboBox SrPaymentType;
    private javax.swing.JTextField SrPhone;
    private javax.swing.JTextField SrPostCode;
    private javax.swing.JComboBox SrProgram;
    private javax.swing.JComboBox SrStartDay;
    private javax.swing.JComboBox SrStartMonth;
    private javax.swing.JComboBox SrStartYear;
    private javax.swing.JTextField SrStudentId;
    private javax.swing.JComboBox SrTitle;
    private javax.swing.JTextField SrzipCode;
    private javax.swing.JLabel SucMeUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JMenu print;
    private javax.swing.JMenu signout1;
    // End of variables declaration//GEN-END:variables
 
    
    private void close() {
             setVisible(false);
             dispose();
    }                                       

    private void SignOuTCODE() {
                                close();
            AppHome regFace2 = new AppHome();
            regFace2.setVisible(true); 
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
