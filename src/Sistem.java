import java.awt.*;

public class Sistem {
   

	public static ListPersonel listPersonel;
	public static BrowsePersonel browsePersonel;
	public static AddPersonel addPersonel;
	public static DeletePersonel deletePersonel;

   public static void main( String[] args ) {

      EventQueue.invokeLater( new Runnable()
      {
         @Override
         public void run() {
            AnaPencere p = new AnaPencere();
            p.setVisible( true );

				listPersonel = new ListPersonel();
				browsePersonel = new BrowsePersonel();
				deletePersonel = new DeletePersonel();
				addPersonel = new AddPersonel();
         }
      } );

   }
}
