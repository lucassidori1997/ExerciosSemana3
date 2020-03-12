import javax.swing.*;
public class AreaDeUmRetangulo
{
   public static void main(String ... args)
   {
      int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do retangulo"));
      int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retangulo"));
      JOptionPane.showMessageDialog(null, "A área de seu retangulo é "+base*altura);
   }
}