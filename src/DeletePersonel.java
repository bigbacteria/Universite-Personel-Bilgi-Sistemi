/* Delete Personnel Window */
import javax.swing.*;
import java.awt.*;

public class DeletePersonel extends JPanel {
   
   public DeletePersonel() {
      initPanel();
   }

   private void initPanel() {
      this.setLayout( new BorderLayout() );
      this.setOpaque( true );

      JLabel jlblTitle = new JLabel( "Delete Pearsonel if he starts to play card games in his free" );
      this.add( jlblTitle );

      JButton jbDugme = new JButton( "Merabalar" );
      this.add( jbDugme, BorderLayout.SOUTH );
      
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
