import javax.swing.*;
import java.awt.*;

public class TarzYap implements Tarz {
   
   public TarzYap(){
   }
   
   private static JLabel pretiket(String yazi , Color ap , Color mr){
      JLabel label = new JLabel(yazi , JLabel.CENTER);
      label.setBackground(ap);
      label.setForeground(mr);
      label.setOpaque(true);
      label.setFont(new Font("Times" , Font.BOLD , 14));
      return label ;
   }
   
   private static JButton prdugme(String yazi , Color ap , Color mr){
      JButton btn = new JButton(yazi);
      btn.setHorizontalTextPosition(JButton.CENTER);
      btn.setFont(new Font("Times" , Font.BOLD , 14));
      btn.setForeground(mr);
      btn.setBackground(ap);
      btn.setOpaque(true);
      return btn;
   }
   
   private static void prmesaj(String ifade , String baslik , int tip){
      JOptionPane.showMessageDialog(null , ifade , baslik , tip == 1 ? JOptionPane.ERROR_MESSAGE : JOptionPane.INFORMATION_MESSAGE);
   }
   
   public JLabel etiket(String yazi , Color arkaplan  ,Color metinrengi){
      return TarzYap.pretiket(yazi , arkaplan , metinrengi);
   }
   
   public JButton dugme(String yazi , Color arkaplan , Color metinrengi){
      return TarzYap.prdugme(yazi , arkaplan , metinrengi);
   }
   
   public void mesaj(String ifade , String baslik , int tip){
      prmesaj(ifade , baslik , tip);
   }
   
} //class sonu


