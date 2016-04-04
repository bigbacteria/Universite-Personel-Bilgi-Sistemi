import java.awt.*;
import javax.swing.*;

public class AcademicStaff implements Personnel {
   
   private String name, surname, phoneNumber, email;
   private Image img;

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
   public Image getImage() {
      return img;
   }

   @Override
   public void setImage( Image img ) {
      this.img = img;   
   }

   //-----//

   public JPanel getCard() {
      JPanel jpnlCard = new JPanel();
      jpnlCard.setLayout( new BoxLayout(jpnlCard,BoxLayout.Y_AXIS) );
      jpnlCard.setBackground( Color.yellow );

      JLabel jlblName = new JLabel( "Name: " + this.name );
      JLabel jlblSurname = new JLabel( "Surname: " + this.surname );

      jpnlCard.add( jlblName );
      jpnlCard.add( jlblSurname );
      return jpnlCard;
   }


}
