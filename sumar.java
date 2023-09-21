package dennis;
import javax.swing.JOptionPane;
public class sumar {
public static void main(String[] args) {
double h1, h2, r;
String n1, n2;
JOptionPane.showMessageDialog(null, "Sumar");
n1=JOptionPane.showInputDialog("Ingresa un primer numero: ");
h1=Double.parseDouble(n1);
n2=JOptionPane.showInputDialog("Ingresa un segundo numero: ");
h2=Double.parseDouble(n2);
r=h1+h2;
JOptionPane.showMessageDialog(null,"Suma= "+r);
    }
    
}
