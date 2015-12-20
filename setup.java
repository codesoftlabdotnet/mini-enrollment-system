public class setup {
    
 public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppHome().setVisible(true);
            }
        });
}
}
