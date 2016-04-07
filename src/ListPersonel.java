/* List Staff Window */
import javax.swing.*;
import java.awt.*;

public class ListPersonel extends JPanel {
   
   public ListPersonel() {
      initPanel();
   }

   private void initPanel() {
      this.setOpaque( true );

      JLabel jlblTitle = new JLabel( "List Pearsonel in a delicious order" );
      this.add( jlblTitle );
      
   }
   
   public void addTo( JPanel jpnlContainer ) {

      //clear the container JPanel first.
      jpnlContainer.removeAll();

      //add object(s) to the container.
      jpnlContainer.add( this );

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
