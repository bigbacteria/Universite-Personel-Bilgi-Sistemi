/* List Personel Window */
import javax.swing.*;
import java.awt.*;

public class AddPersonel extends JPanel {
   
   public JPanel jpnlMain;

   public AddPersonel() {
      initPanel();
   }

   private void initPanel() {
      jpnlMain = new JPanel();
      jpnlMain.setOpaque( true );

      JLabel jlblTitle = new JLabel( "Add Pearsonel when you get bored the old ones" );
      jpnlMain.add( jlblTitle );
      
   }
   
   public void addTo( JPanel jpnlContainer ) {

      //clear the container JPanel first.
      jpnlContainer.removeAll();

      //add object(s) to the container.
      jpnlContainer.add( this.jpnlMain );

      //update the container JPanel
      jpnlContainer.revalidate();
      jpnlContainer.repaint();
   }


   
   // Sets icon for a jLabel with given address
   public void setImg( String address, JLabel jlbl ) {
      jlbl.setIcon( new ImageIcon(address) );
      jlbl.setHorizontalAlignment( JLabel.CENTER );
   }

}
