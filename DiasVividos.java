import javax.swing.*;
public class DiasVividos
{
   public static void main(String ... args)
   {
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
      JOptionPane.showMessageDialog(null, "Você ja viveu aproximadamente "+idade*365+" dias");
   }
}