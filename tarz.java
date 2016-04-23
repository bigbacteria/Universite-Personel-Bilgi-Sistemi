import javax.swing.*;
import java.awt.*;

public interface Tarz {
   JLabel etiket(String yazi , Color arkaplan , Color metinrengi);
   JButton dugme(String yazi , Color arkaplan , Color metinrengi);
   void mesaj(String ifade , String baslik , int tip);
}
