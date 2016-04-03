/* List Personel Window */
import javax.swing.*;
import java.awt.*;

public class DeletePersonel extends JPanel {
   
   public JPanel jpnlMain;

   public DeletePersonel() {
      initPanel();
   }

   private void initPanel() {
      jpnlMain = new JPanel();
      //jpnlMain.setBackground();
      //jpnlMain.setPreferredSize( new Dimension(300,300) );
      jpnlMain.setLayout( new BorderLayout() );
      jpnlMain.setOpaque( true );

      JLabel jlblTitle = new JLabel( "Delete Pearsonel if he starts to play card games in his free" );
      jpnlMain.add( jlblTitle );

      JButton jbDugme = new JButton( "Merabalar" );
      jpnlMain.add( jbDugme, BorderLayout.SOUTH );
      
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
