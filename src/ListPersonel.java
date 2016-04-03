/* List Personel Window */
import javax.swing.*;
import java.awt.*;

public class ListPersonel extends JPanel {
   
   public JPanel jpnlMain;

   public ListPersonel() {
      initPanel();
   }

	private void initPanel() {
		jpnlMain = new JPanel();
      jpnlMain.setOpaque( true );

		JLabel jlblTitle = new JLabel( "List Pearsonel in a delicious order" );
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



}
