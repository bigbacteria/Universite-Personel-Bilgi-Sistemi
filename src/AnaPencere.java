import javax.swing.*;
import javax.swing.plaf.metal.*;
import java.awt.*;
import java.awt.event.*;

public class AnaPencere extends JFrame {
   
   final static String LOOKANDFEEL = "Metal";
   final static String THEME = "Ocean";
   final static int WIDTH = 500;
   final static int HEIGHT = 400;

   public AnaPencere() {
      initUI();
   }

   
   private void initLnF() {
      String lookandfeel = null;

      if( LOOKANDFEEL != null ) {

         if( LOOKANDFEEL.equals( "Metal" ) )
            lookandfeel = UIManager.getCrossPlatformLookAndFeelClassName();
         else if( LOOKANDFEEL.equals( "System" ) )
            lookandfeel = UIManager.getSystemLookAndFeelClassName();
         else if( LOOKANDFEEL.equals( "Motif" ) )
            lookandfeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
         else if( LOOKANDFEEL.equals( "GTK" ) )
            lookandfeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
         else 
            lookandfeel = UIManager.getCrossPlatformLookAndFeelClassName();
      }

      try {
         UIManager.setLookAndFeel( lookandfeel );

         if( LOOKANDFEEL.equals( "Metal" ) ) {
            if( THEME.equals( "DefaultMetal" ) )
               MetalLookAndFeel.setCurrentTheme( new DefaultMetalTheme() );
            else if( THEME.equals( "Ocean" ) )
               MetalLookAndFeel.setCurrentTheme( new OceanTheme() );
            else
               //MetalLookAndFeel.setCurrentTheme( new TestTheme() );
            
            UIManager.setLookAndFeel( new MetalLookAndFeel() );
         }
      }
      catch( ClassNotFoundException e ) {
         
      }
      catch( UnsupportedLookAndFeelException e ) {
         
      }
      catch( Exception e ) {
         
      }

   }
   int posX = 0, posY = 0;
   private void initUI() {
      
      initLnF();
      
      /* JFrame */
      this.setDefaultCloseOperation( EXIT_ON_CLOSE );
      this.setTitle( "Üniversite Personel Bilgi Sistemi" );
      this.setSize( WIDTH, HEIGHT );
      this.setResizable( false );
      this.setUndecorated( true );
      this.setLayout( new BorderLayout() );

      this.addMouseListener( new MouseAdapter()
      {
         public void mousePressed( MouseEvent e ) {
            posX = e.getX();
            posY = e.getY();
         }
      } );

      this.addMouseMotionListener( new MouseAdapter()
      {
         public void mouseDragged( MouseEvent e ) {
            setLocation( e.getXOnScreen()-posX, e.getYOnScreen()-posY );
         }
      } );
      /* JFrame */

      /* PNLcaption */
      JPanel PNLcaption = new JPanel();
      PNLcaption.setBackground( Color.white );
      this.add( PNLcaption, BorderLayout.PAGE_START );
      
      JLabel LBLtitle = new JLabel( "University of Konoha" );
      PNLcaption.add( LBLtitle );
      /* PNLcaption */

      /* PNLmenu */
      JPanel PNLmenu = new JPanel();
      PNLmenu.setLayout( new BoxLayout(PNLmenu,BoxLayout.Y_AXIS) );
      PNLmenu.setBackground( new Color(250,128,114) );
      PNLmenu.setPreferredSize( new Dimension(155,HEIGHT) );
      PNLmenu.setOpaque( true );
      this.add( PNLmenu, BorderLayout.LINE_START );
      
      
      JButton BTNlist = new JButton( "List Personel" );
      BTNlist.setBorder( BorderFactory.createLineBorder(Color.black) );
      BTNlist.setBackground( new Color(75,0,130) ); // indigo
      BTNlist.setForeground( new Color(173,216,230)  ); // light blue
      //BTNlist.setFocusPainted( false );
      BTNlist.setCursor( new Cursor(Cursor.HAND_CURSOR) );
      BTNlist.setMaximumSize( new Dimension(155,25) );
      PNLmenu.add( BTNlist );

      JButton BTNbrowse = new JButton( "Browse Personel" );
      BTNbrowse.setBorder( BorderFactory.createLineBorder(Color.black) );
      BTNbrowse.setBackground( new Color(75,0,130) ); // indigo
      BTNbrowse.setForeground( new Color(173,216,230)  ); // light blue
      BTNbrowse.setCursor( new Cursor(Cursor.HAND_CURSOR) );
      BTNbrowse.setMaximumSize( new Dimension(155,25) );
      PNLmenu.add( BTNbrowse );

      JButton BTNadd = new JButton( "Add Personel" );
      BTNadd.setBorder( BorderFactory.createLineBorder(Color.black) );
      BTNadd.setBackground( new Color(75,0,130) ); // indigo
      BTNadd.setForeground( new Color(173,216,230)  ); // light blue
      BTNadd.setCursor( new Cursor(Cursor.HAND_CURSOR) );
      BTNadd.setMaximumSize( new Dimension(155,25) );
      PNLmenu.add( BTNadd );

      JButton BTNdel = new JButton( "Delete Personel" );
      BTNdel.setBorder( BorderFactory.createLineBorder(Color.black) );
      BTNdel.setBackground( new Color(75,0,130) ); // indigo
      BTNdel.setForeground( new Color(173,216,230)  ); // light blue
      BTNdel.setCursor( new Cursor(Cursor.HAND_CURSOR) );
      BTNdel.setMaximumSize( new Dimension(155,25) );
      PNLmenu.add( BTNdel );
      /* PNLmenu */

      /* PNLcontent */
      JPanel PNLcontent = new JPanel();
      PNLcontent.setPreferredSize( new Dimension(300,HEIGHT) );
      PNLcontent.setBackground( new Color(255,140,90) );
      this.add( PNLcontent );
      /* PNLcontent */

      this.pack();
      System.out.println( BTNbrowse.getSize().getHeight() );

   }

}
