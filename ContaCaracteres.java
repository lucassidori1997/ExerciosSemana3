import javax.swing.*;
public class ContaCaracteres{
   public static void main(String ... args){
      String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra");
      String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra");
      String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra");
      int caracteres = palavra1.length()+palavra2.length()+palavra3.length();
      JOptionPane.showMessageDialog(null, "A soma dos caracteres das três palavra foi de "+caracteres);
   }
}