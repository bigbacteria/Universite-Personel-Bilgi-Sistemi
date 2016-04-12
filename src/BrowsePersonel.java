/* Browse Personnel Window */
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;

public class BrowsePersonel extends JPanel {
   

   public BrowsePersonel() {
      initPanel();
      initStaff();
   }

   private void initPanel() {
      this.setLayout( new BoxLayout(this,BoxLayout.Y_AXIS) );
      this.setOpaque( true );
      this.setBackground( new Color(0,120,130) );
      
      JPanel jpnlTitle = new JPanel();
      jpnlTitle.setBackground( new Color(0,120,130) );
      jpnlTitle.setBorder( BorderFactory.createMatteBorder(0,0,3,0, new Color(0,60,65)) );

      JLabel jlblTitle = new JLabel( "Browse Personnel" );
      jlblTitle.setForeground( new Color(0,60,65) );
      jpnlTitle.add( jlblTitle );
      this.add( jpnlTitle );
      
   }



   private void initStaff() {
      
      Connection c = null;
      Statement stmt = null;
      int count = 0;

      try {

         Class.forName( "org.sqlite.JDBC" );
         c = DriverManager.getConnection( "jdbc:sqlite:personnel.db" );
         c.setAutoCommit( false );
         

         stmt = c.createStatement();
         ResultSet rs4count = stmt.executeQuery( "SELECT *  FROM academic;" );
         // this loop is to count number of rows.
         while( rs4count.next() ) {
            count++;
         }

         AcademicStaff[] academicStaff = new AcademicStaff[count];

         // this loop is to fetch data
         ResultSet rs = stmt.executeQuery( "SELECT *  FROM academic;" );
         for( int i = 0; i < count; i++ ) {
            rs.next();
            academicStaff[i] = new AcademicStaff();
            academicStaff[i].setName( rs.getString("name") );
            academicStaff[i].setSurname( rs.getString("surname") );
            academicStaff[i].setPhoneNumber( rs.getString("phone") );
            academicStaff[i].setEmail( rs.getString("email") );
            academicStaff[i].setImage( rs.getString("image") );
            this.add( academicStaff[i].getCard() );
         }
         rs.close();
         stmt.close();
         c.close();
      }
      catch( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit( 0 );
      }

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
