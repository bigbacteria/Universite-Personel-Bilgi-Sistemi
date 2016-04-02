/* List Personel Window */
import javax.swing.*;
import java.awt.*;

public class ListPersonel extends JPanel {
   
   public JPanel jpnlMain;

   public ListPersonel( Color color ) {
      jpnlMain = new JPanel();
      jpnlMain.setBackground( color );
      jpnlMain.setPreferredSize( new Dimension(300,300) );
      jpnlMain.setOpaque( true );
      
   }

   public void addTo( JPanel jpnlContainer ) {
      jpnlContainer.add( this.jpnlMain );
   }



}
