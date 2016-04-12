/* Add Personnel Window */
import javax.swing.*;
import java.awt.*;

public class AddPersonel extends JPanel {
   
   public AddPersonel() {
      initPanel();
   }

   private void initPanel() {
      this.setLayout( new BorderLayout() );
      this.setOpaque( true );
      this.setBackground( new Color(0,120,130) );

      
      /* jpnlTitle */
      JPanel jpnlTitle = new JPanel();
      jpnlTitle.setBackground( new Color(0,120,130) );
      jpnlTitle.setBorder( BorderFactory.createMatteBorder(0,0,3,0, new Color(0,60,65)) );

      JLabel jlblTitle = new JLabel( "Add Personnel" );
      jlblTitle.setForeground( new Color(0,60,65) );
      jpnlTitle.add( jlblTitle );
      this.add( jpnlTitle, BorderLayout.PAGE_START );
      /* jpnlTitle */

      /* jpnlInput */
      JPanel jpnlInput = new JPanel( new GridLayout(0,2) );
      jpnlInput.setBackground( new Color(0,120,130) );

      JLabel jlblName = new JLabel( "Name: " );
      jlblName.setForeground( Color.white );
      jpnlInput.add( jlblName );

      JTextField jtfName = new JTextField();
      jpnlInput.add( jtfName );


      JLabel jlblSurname = new JLabel( "Surname: " );
      jlblSurname.setForeground( Color.white );
      jpnlInput.add( jlblSurname );

      JTextField jtfSurname = new JTextField();
      jpnlInput.add( jtfSurname );


      JLabel jlblDepartment = new JLabel( "Department: " );
      jlblDepartment.setForeground( Color.white );
      jpnlInput.add( jlblDepartment );

      JTextField jtfDepartment = new JTextField();
      jpnlInput.add( jtfDepartment );


      JLabel jlblPhoneNumber = new JLabel( "Phone Number: " );
      jlblPhoneNumber.setForeground( Color.white );
      jpnlInput.add( jlblPhoneNumber );

      JTextField jtfPhoneNumber = new JTextField();
      jpnlInput.add( jtfPhoneNumber );


      JLabel jlblEmail = new JLabel( "e-mail address: " );
      jlblEmail.setForeground( Color.white );
      jpnlInput.add( jlblEmail );

      JTextField jtfEmail = new JTextField();
      jpnlInput.add( jtfEmail );

      jpnlInput.setBorder( BorderFactory.createMatteBorder(5,0,0,5, new Color(0,120,130)) );
      this.add( jpnlInput, BorderLayout.LINE_START );
      /* jpnlInput */

      /* jpnlImg */
      JPanel jpnlImg = new JPanel();
      jpnlImg.setLayout( new BoxLayout(jpnlImg,BoxLayout.Y_AXIS) );
      jpnlImg.setBorder( BorderFactory.createMatteBorder(5,0,0,0, new Color(0,120,130)) );

      JLabel jlblImg = new JLabel( "<html>Click<br>here to<br>browse<br>image", JLabel.CENTER );
      jlblImg.setPreferredSize( new Dimension(75,125) );
      jpnlImg.add( jlblImg );

      this.add( jpnlImg, BorderLayout.CENTER );
      /* jpnlImg */

      JButton jbAdd = new JButton( "Add" );
      this.add( jbAdd, BorderLayout.PAGE_END );


     
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
