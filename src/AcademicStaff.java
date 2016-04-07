import java.awt.*;
import javax.swing.*;

public class AcademicStaff implements Personnel {
   
   private String name, surname, phoneNumber, email;
   private ImageIcon img;

   private JLabel jlblImg = new JLabel( "No Image" );

   @Override
   public String getName() {
      return name;
   }

   @Override
   public void setName( String name ) {
      this.name = name;
   }

   //
   
   @Override
   public String getSurname() {
      return surname;
   }

   @Override
   public void setSurname( String surname ) {
      this.surname = surname;
   }

   //
   
   @Override
   public String getPhoneNumber() {
      return phoneNumber;
   }

   @Override
   public void setPhoneNumber( String phoneNumber ) {
      this.phoneNumber = phoneNumber;
   }

   //
   
   @Override
   public String getEmail() {
      return email;
   }

   @Override
   public void setEmail( String email ) {
      this.email = email;
   }

   //
   
   @Override
   public ImageIcon getImage() {
      return img;
   }

   @Override
   public void setImage( String address ) {
      this.img = new ImageIcon( address );
      jlblImg.setIcon( Sistem.shrinkImage( img, 75, 125 ) );
   }

   //-----//

   public JPanel getCard() {

      JPanel jpnlCard = new JPanel( new FlowLayout() );
      jpnlCard.setBackground( new Color(0,120,130) );
      //jpnlCard.setBorder( BorderFactory.createLineBorder(Color.black) );

      JPanel jpnlInfo = new JPanel();
      jpnlInfo.setLayout( new BoxLayout(jpnlInfo,BoxLayout.Y_AXIS) );
      jpnlInfo.setBackground( Color.yellow );
      jpnlCard.add( jpnlInfo );

      JPanel jpnlImg = new JPanel();
      jpnlImg.setBackground( Color.yellow );
      jpnlImg.setBorder( BorderFactory.createLineBorder(Color.green) );
      jpnlCard.add( jpnlImg );

      JLabel jlblName = new JLabel( "Name: " + this.name );
      JLabel jlblSurname = new JLabel( "Surname: " + this.surname );
      JLabel jlblPhoneNumber = new JLabel( "Phone Number: " + this.phoneNumber );
      JLabel jlblEmail = new JLabel( "e-mail address: " + this.email );
      // [global] JLabel jlblImg = new JLabel( "Picture" );

      jpnlInfo.add( jlblName );
      jpnlInfo.add( jlblSurname );
      jpnlInfo.add( jlblPhoneNumber );
      jpnlInfo.add( jlblEmail );
      jpnlImg.add( jlblImg );

      jlblImg.setPreferredSize( new Dimension( 75, 125 ) );

      return jpnlCard;
   }


}
