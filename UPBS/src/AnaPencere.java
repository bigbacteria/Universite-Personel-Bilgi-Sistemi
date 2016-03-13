package UPBS;

import javax.swing.*;
import java.awt.*;

public class AnaPencere extends JFrame {
   
   public AnaPencere() {
      initUI();
   }

   private void initUI() {
      
      this.setDefaultCloseOperation( EXIT_ON_CLOSE );
      this.setTitle( "Üniversite Personel Bilgi Sistemi" );
      this.setLayout( new FlowLayout() );

   }
}
