import javax.swing.*;
import java.awt.*;

public class AnaPencere extends JFrame {
   
   public AnaPencere() {
      initUI();
   }

   private void initUI() {
      
      this.setDefaultCloseOperation( EXIT_ON_CLOSE );
      this.setTitle( "Üniversite Personel Bilgi Sistemi" );
      this.setSize( 500, 400 );
      this.setLayout( new FlowLayout() );

   }

}
