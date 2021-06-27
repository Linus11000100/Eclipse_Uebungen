package gui;

public class Box_Layout extends javax.swing.JFrame {
	
    private javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    private javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private javax.swing.JButton jButton1 = new javax.swing.JButton();
    private javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    private javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
 
    public Box_Layout() {
 
    	
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        								
        jPanel1.setLayout( new javax.swing.BoxLayout(
                jPanel1, javax.swing.BoxLayout.Y_AXIS ) );
            							
        jLabel1.setText ( "1.  JLabel" );
        								
        jPanel1.add ( jLabel1 );
 
        jButton1.setText ( "2.  JButton" );
 

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        }); 
 
        jPanel1.add ( jButton1 ) ;
 
        jTextField1.setText ( "3.  JTextField" ) ;
        jPanel1.add ( jTextField1 ) ;
 
        jLabel2.setText ( "4.  JLabel usw." ) ;
        jPanel1.add ( jLabel2 ) ;
 
        this.getContentPane().add ( jPanel1 ) ;
 
        								
        pack();
    }
 
   
    private void jButton1ActionPerformed( java.awt.event.ActionEvent evt ) {
    	
    	System.out.println("Button gedrückt");
       
    }
 
    
    public static void main(String args[]) {
        new Box_Layout().setVisible ( true );
    }
}

