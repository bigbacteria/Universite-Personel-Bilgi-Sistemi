import java.awt.*;

public class Sistem {
   
   public static void main( String[] args ) {

      EventQueue.invokeLater( new Runnable()
      {
         @Override
         public void run() {
            AnaPencere p = new AnaPencere();
            p.setVisible( true );
         }
      } );

   }
}
