import java.awt.*;
import javax.swing.*;

public class AcademicStaff implements Personnel {
   
   private String name, surname, phoneNumber, email, department;
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

      JPanel jpnlCard = new JPanel();
      jpnlCard.setBackground( new Color(0,90,98) );
      jpnlCard.setBorder( BorderFactory.createMatteBorder(5,0,5,0,new Color(0,120,130)) );

      JPanel jpnlInfo = new JPanel();
      jpnlInfo.setBackground( new Color(0,90,98) );
      jpnlInfo.setLayout( new BoxLayout(jpnlInfo,BoxLayout.Y_AXIS) );
      jpnlCard.add( jpnlInfo );

      JPanel jpnlImg = new JPanel();
      jpnlImg.setBackground( new Color(0,90,98) );
      jpnlImg.setBorder( BorderFactory.createMatteBorder(3,3,3,5,new Color(0,75,25)) );
      jpnlCard.add( jpnlImg );

      JLabel jlblName = new JLabel( "Name: " + this.name );
      jlblName.setForeground( Color.white );
      JLabel jlblSurname = new JLabel( "Surname: " + this.surname );
      jlblSurname.setForeground( Color.white );
      JLabel jlblDepartment = new JLabel( "Department: " + this.department );
      jlblDepartment.setForeground( Color.white );
      JLabel jlblPhoneNumber = new JLabel( "Phone Number: " + this.phoneNumber );
      jlblPhoneNumber.setForeground( Color.white );
      JLabel jlblEmail = new JLabel( "e-mail address: " + this.email );
      jlblEmail.setForeground( Color.white );
      // [global] JLabel jlblImg = new JLabel( "Picture" );

      jpnlInfo.add( jlblName );
      jpnlInfo.add( jlblSurname );
      jpnlInfo.add( jlblDepartment );
      jpnlInfo.add( jlblPhoneNumber );
      jpnlInfo.add( jlblEmail );
      jpnlImg.add( jlblImg );

      jlblImg.setPreferredSize( new Dimension( 75, 125 ) );
      jlblImg.setMaximumSize( new Dimension( 75, 125 ) );
      jlblImg.setMinimumSize( new Dimension( 75, 125 ) );

      return jpnlCard;
   }


}
