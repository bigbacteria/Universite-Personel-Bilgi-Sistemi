import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;

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

   // Halis muhlis el yapımı boyutlandırma fonksiyonu.
   public static ImageIcon shrinkImage( ImageIcon img, int desiredWidth, int desiredHeight ) {
      
      int originalWidth = img.getIconWidth();
      int originalHeight = img.getIconHeight();
      int w = originalWidth, h = originalHeight;

      int longerEdge = originalWidth > originalHeight ? originalWidth : originalHeight;
      float ratio = (float)originalWidth / originalHeight;

      if( longerEdge < desiredHeight && longerEdge < desiredWidth ) {
         return img;
      }
      else if( originalHeight > desiredHeight && originalWidth < desiredWidth ) {
         h = desiredHeight;
         w = (int)(desiredHeight * ratio);
      }
      else if( originalWidth > desiredWidth && originalHeight < desiredHeight ) {
         w = desiredHeight;
         h = (int)(desiredWidth * (1/ratio));
      }
      else if( originalWidth > desiredWidth && originalHeight > desiredHeight ) {
         if( longerEdge == originalWidth ) {
            w = desiredWidth;
            h = (int)(desiredWidth * (1/ratio));
         }
         else {
            if( desiredHeight > desiredWidth ) {
               w = desiredWidth;
               h = (int)(desiredWidth * (1/ratio));
            }
            else if( desiredHeight < desiredWidth ) {
               h = desiredHeight;
               w = (int)(desiredHeight * ratio);
            }
            else {
               if( longerEdge == originalHeight ) {
                  h = desiredHeight;
                  w = (int)(desiredHeight * ratio);
               }
               else if( longerEdge == originalWidth ) {
                  w = desiredWidth;
                  h = (int)(desiredWidth * (1/ratio));
               }
            }
         }
      }

      return new ImageIcon( img.getImage().getScaledInstance(w,h,BufferedImage.SCALE_SMOOTH) );
      
   }



}
