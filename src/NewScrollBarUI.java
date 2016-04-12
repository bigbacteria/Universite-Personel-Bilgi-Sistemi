import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class NewScrollBarUI extends BasicScrollBarUI {
   
   @Override
   protected JButton createDecreaseButton( int orientation ) {
      JButton jbZero = new JButton();
      Dimension zeroDim = new Dimension(0,0);
      jbZero.setPreferredSize( zeroDim );
      jbZero.setMinimumSize( zeroDim );
      jbZero.setMaximumSize( zeroDim );
      return jbZero;
   }

   @Override
   protected JButton createIncreaseButton( int orientation ) {
      JButton jbZero = new JButton();
      Dimension zeroDim = new Dimension(0,0);
      jbZero.setPreferredSize( zeroDim );
      jbZero.setMinimumSize( zeroDim );
      jbZero.setMaximumSize( zeroDim );
      return jbZero;
   }

   @Override // background of the scroll bar.
   protected void paintTrack( Graphics g, JComponent c, Rectangle trackBounds ) {
      g.setColor( new Color(0,90,98) );
      g.fillRect( (int)trackBounds.getX(), (int)trackBounds.getY(), (int)trackBounds.getWidth(), (int)trackBounds.getHeight() );
   }

   @Override // thumb of the scroll bar.
   protected void paintThumb( Graphics g, JComponent c, Rectangle thumbBounds ) {
      g.setColor( new Color(0,60,65) );
      g.fillRect( (int)thumbBounds.getX(), (int)thumbBounds.getY(), (int)thumbBounds.getWidth(), (int)thumbBounds.getHeight() );
   }

}
