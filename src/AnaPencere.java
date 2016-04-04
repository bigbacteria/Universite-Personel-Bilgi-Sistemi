import javax.swing.*;
import javax.swing.plaf.metal.*;
import java.awt.*;
import java.awt.event.*;

public class AnaPencere extends JFrame {
   
   final static String LOOKANDFEEL = "Metal";
   final static String THEME = "Ocean";
   final static int WIDTH = 500;
   final static int HEIGHT = 400;

   final Color lightCyan = new Color(224,255,255);
   final Color paleTurquoise = new Color(175,238,238);

   public static JPanel jpnlContent;
   private static final JPanel jpnlCaption = new JPanel( new BorderLayout() );
   public static JLabel jlblImg;

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
      this.setTitle( "University Staff Information" );
      this.setSize( WIDTH, HEIGHT );
      this.setResizable( false );
      this.setUndecorated( true );
      this.setLayout( new BorderLayout() );
      this.setLocationRelativeTo( null );

      this.addMouseListener( new MouseAdapter()
      {
         @Override
         public void mousePressed( MouseEvent e ) {
            posX = e.getX();
            posY = e.getY();
            jpnlCaption.setBackground( paleTurquoise ); 
         }

         @Override
         public void mouseReleased( MouseEvent e ) {
            jpnlCaption.setBackground( Color.white ); 
         }

      } );

      this.addMouseMotionListener( new MouseAdapter()
      {
         public void mouseDragged( MouseEvent e ) {
            setLocation( e.getXOnScreen()-posX, e.getYOnScreen()-posY );
         }
      } );
      /* JFrame */



      /* jpnlCaption - defined private static final in the global scope */
      jpnlCaption.setBackground( Color.white );
      jpnlCaption.setBorder( BorderFactory.createLineBorder(new Color(0,120,130)) );
      this.add( jpnlCaption, BorderLayout.PAGE_START );

      JPanel jpnlTools = new JPanel();
      jpnlTools.setPreferredSize( new Dimension(20,20) );
      jpnlTools.setOpaque( false );
      jpnlCaption.add( jpnlTools, BorderLayout.LINE_START );

      JPanel jpnlTitle = new JPanel();
      jpnlTitle.setOpaque( false );
      jpnlCaption.add( jpnlTitle, BorderLayout.CENTER );
      
      JLabel jlblTitle = new JLabel( "University Staff Information" );
      
      ImageIcon imgClose = new ImageIcon( "res/close.png" );
      final JButton jbClose = new JButton( imgClose );
      jbClose.setOpaque( false );
      jbClose.setFocusPainted( false );
      jbClose.setBorderPainted( false );
      jbClose.setContentAreaFilled( false );
      jbClose.setBorder( BorderFactory.createEmptyBorder(0,0,0,0) );
      jbClose.setVisible( false );

      //For color touch-ups
      jpnlCaption.addMouseListener( new MouseListener()
      {
         @Override
         public void mouseClicked( MouseEvent e ) {
         }

         @Override
         public void mouseEntered( MouseEvent e ) {
            jpnlCaption.setBackground( lightCyan );
            jbClose.setVisible( true );

         }

         @Override
         public void mouseExited( MouseEvent e ) {
            jpnlCaption.setBackground( Color.white );
            jbClose.setVisible( false );
         }

         @Override
         public void mousePressed( MouseEvent e ) {
            jpnlCaption.setBackground( paleTurquoise );

            //This code is to make the JFrame draggable through this panel
            posX = e.getX();
            posY = e.getY();
         }

         @Override
         public void mouseReleased( MouseEvent e ) {
         }

      } );

      //This code is also complementary to the above one about dragging.
      jpnlCaption.addMouseMotionListener( new MouseAdapter()
      {
         public void mouseDragged( MouseEvent e ) {
            setLocation( e.getXOnScreen()-posX, e.getYOnScreen()-posY );
         }
      } );
      


      jpnlTitle.add( jlblTitle );
      jpnlTools.add( jbClose );
      /* jpnlCaption */



      /* jpnlMenu */
      JPanel jpnlMenu = new JPanel();
      jpnlMenu.setLayout( new BoxLayout(jpnlMenu,BoxLayout.Y_AXIS) );
      jpnlMenu.setBackground( new Color(107,0,130) );
      jpnlMenu.setPreferredSize( new Dimension(155,HEIGHT) );
      jpnlMenu.setOpaque( true );
      this.add( jpnlMenu, BorderLayout.LINE_START );
      


      JButton jbList = new JButton( "List Staff" );
      jbList.setBorder( BorderFactory.createLineBorder(Color.black) );
      jbList.setBackground( new Color(75,0,130) ); // indigo
      jbList.setForeground( new Color(173,216,230)  ); // light blue
      //jbList.setFocusPainted( false );
      jbList.setCursor( new Cursor(Cursor.HAND_CURSOR) );
      jbList.setMaximumSize( new Dimension(155,25) );
      jpnlMenu.add( jbList );



      JButton jbBrowse = new JButton( "Browse Personnel" );
      jbBrowse.setBorder( BorderFactory.createLineBorder(Color.black) );
      jbBrowse.setBackground( new Color(75,0,130) ); // indigo
      jbBrowse.setForeground( new Color(173,216,230)  ); // light blue
      jbBrowse.setCursor( new Cursor(Cursor.HAND_CURSOR) );
      jbBrowse.setMaximumSize( new Dimension(155,25) );
      jpnlMenu.add( jbBrowse );



      JButton jbAdd = new JButton( "Add Personnel" );
      jbAdd.setBorder( BorderFactory.createLineBorder(Color.black) );
      jbAdd.setBackground( new Color(75,0,130) ); // indigo
      jbAdd.setForeground( new Color(173,216,230)  ); // light blue
      jbAdd.setCursor( new Cursor(Cursor.HAND_CURSOR) );
      jbAdd.setMaximumSize( new Dimension(155,25) );
      jpnlMenu.add( jbAdd );



      JButton jbDel = new JButton( "Delete Personnel" );
      jbDel.setBorder( BorderFactory.createLineBorder(Color.black) );
      jbDel.setBackground( new Color(75,0,130) ); // indigo
      jbDel.setForeground( new Color(173,216,230)  ); // light blue
      jbDel.setCursor( new Cursor(Cursor.HAND_CURSOR) );
      jbDel.setMaximumSize( new Dimension(155,25) );
      jpnlMenu.add( jbDel );



      jlblImg = new JLabel();
      jpnlMenu.add( jlblImg );
      
      /* jpnlMenu */



      /* jpnlContent */
      jpnlContent = new JPanel();
      jpnlContent.setPreferredSize( new Dimension(WIDTH-(int)jpnlMenu.getSize().getWidth(),HEIGHT) );
      jpnlContent.setBackground( new Color(0,120,130) );
      this.add( jpnlContent );

      /* jpnlContent */



      //~~Listeners~~//
      MouseListener mouseListener = new Mlistener( jbList, jbBrowse, jbAdd, jbDel, jbClose );
      jbList.addMouseListener( mouseListener );
      jbBrowse.addMouseListener( mouseListener );
      jbAdd.addMouseListener( mouseListener );
      jbDel.addMouseListener( mouseListener );
      jbClose.addMouseListener( mouseListener );


      ActionListener actionListener = new Mlistener( jbList, jbBrowse, jbAdd, jbDel, jbClose );
      jbList.addActionListener( actionListener );
      jbBrowse.addActionListener( actionListener );
      jbAdd.addActionListener( actionListener );
      jbDel.addActionListener( actionListener );
      jbClose.addActionListener( actionListener );

      //~~Listeners~~//



      this.pack();
      System.out.println( jbBrowse.getSize().getHeight() );

   }

   /* getter method */
   public static JPanel getCaptionPanel() {
      return jpnlCaption;
   }

}
