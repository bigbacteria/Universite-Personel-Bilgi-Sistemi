import java.awt.*;
import javax.swing.*;

interface Personnel {

	String getName();
	void setName( String name );

	String getSurname();
	void setSurname( String surname );

	String getDept();
	void setDept( String dept );

	String getPhoneNumber();
	void setPhoneNumber( String phoneNumber );

	String getEmail();
	void setEmail( String email );

	ImageIcon getImage();
	void setImage( String address );
}
