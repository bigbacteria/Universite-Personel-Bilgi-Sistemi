/* List Personel Window */
import javax.swing.*;
import java.awt.*;

public class BrowsePersonel extends JPanel {
   
   public JPanel jpnlMain;

   public BrowsePersonel() {
      initPanel();
   }

   private void initPanel() {
      jpnlMain = new JPanel();
      jpnlMain.setOpaque( true );

      JLabel jlblTitle = new JLabel( "Browse Pearsonel in a suspicious manner" );
      jpnlMain.add( jlblTitle );
      
   }
   
   public void addTo( JPanel jpnlContainer ) {

      //clear the container JPanel first.
      jpnlContainer.removeAll();

      //add object to the container
      jpnlContainer.add( this.jpnlMain );
      
      //update the container JPanel
      jpnlContainer.revalidate();
      jpnlContainer.repaint();
   }



}
