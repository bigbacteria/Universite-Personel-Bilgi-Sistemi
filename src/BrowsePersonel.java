/* Browse Personnel Window */
import javax.swing.*;
import java.awt.*;

public class BrowsePersonel extends JPanel {
   
   private AcademicStaff academicStaff;

   public BrowsePersonel() {
      initPanel();
      initStaff();
   }

   private void initPanel() {
      this.setLayout( new BorderLayout() );
      this.setOpaque( true );
      this.setBackground( new Color(0,120,130) );
      this.setBorder( BorderFactory.createLineBorder(Color.black) );

      
      JPanel jpnlTitle = new JPanel();


      JLabel jlblTitle = new JLabel( "Browse Personnel" );
      jpnlTitle.add( jlblTitle );
      this.add( jpnlTitle, BorderLayout.PAGE_START );
      
   }



   private void initStaff() {
      academicStaff = new AcademicStaff(); //今のconstructorは何でもやっていない。
      academicStaff.setName( "Magnus" );
      academicStaff.setSurname( "Blume" );
      academicStaff.setPhoneNumber( "xxx-xxx-xx-xx" );
      academicStaff.setEmail( "magnus@blume.co" );
      academicStaff.setImage( "data/c.png" );
      this.add( academicStaff.getCard(), BorderLayout.LINE_START );
   }
   
   public void addTo( JPanel jpnlContainer ) {

      //clear the container JPanel first.
      jpnlContainer.removeAll();

      //add object to the container
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
