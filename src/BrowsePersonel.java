/* List Personel Window */
import javax.swing.*;
import java.awt.*;

public class BrowsePersonel extends JPanel {
   
   public JPanel jpnlMain;
   private AcademicStaff academicStaff;

   public BrowsePersonel() {
      initPanel();
      initStaff();
   }

   private void initPanel() {
      jpnlMain = new JPanel();
      jpnlMain.setOpaque( true );

      JLabel jlblTitle = new JLabel( "Browse Personnel" );
      jpnlMain.add( jlblTitle );
      
   }



   private void initStaff() {
      academicStaff = new AcademicStaff(); //今のconstructorは何でもやっていない。
      academicStaff.setName( "Magnus" );
      academicStaff.setSurname( "Blume" );
      jpnlMain.add( academicStaff.getCard() );
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



   // Sets icon for a jLabel with given address
   public void setImg( String address, JLabel jlbl ) {
      jlbl.setIcon( new ImageIcon(address) );
      jlbl.setHorizontalAlignment( JLabel.CENTER );
   }
}
