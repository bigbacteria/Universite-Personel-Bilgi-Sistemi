import javax.swing.*;
import javax.swing.plaf.metal.*;
import java.awt.*;
import java.awt.event.*;

public class AnaPencere extends JFrame {
   
   final static String LOOKANDFEEL = "Metal";
   final static String THEME = "Ocean";

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
   
   private void initUI() {
      
      initLnF();

      this.setDefaultCloseOperation( EXIT_ON_CLOSE );
      this.setTitle( "Üniversite Personel Bilgi Sistemi" );
      this.setSize( 500, 400 );
      this.setResizable( false );
      this.setLayout( new FlowLayout() );
      
      JButton dnm = new JButton( "Hey adamım naber" );
      this.add( dnm );
   }

}
