import javax.swing.*;
public class InteiroAoQuadrado
{
   public static void main(String ... args)
   {
      int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
      double resultado;
      resultado = Math.pow(n,2);
      JOptionPane.showMessageDialog(null,"O n�mero "+n+" elevado ao qudrado fica "+ resultado);
   }
}