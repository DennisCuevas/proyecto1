package denniscuevas;
import javax.swing.JOptionPane;
public class operaciones {
public static void main(String[] args) {
    double h1, h2, r;
    //Sumar
String n1, n2;
JOptionPane.showMessageDialog(null, "SUMA");
n1=JOptionPane.showInputDialog("Ingresa un primer numero: ");
h1=Double.parseDouble(n1);
n2=JOptionPane.showInputDialog("Ingresa un segundo numero: ");
h2=Double.parseDouble(n2);
r=h1+h2;
JOptionPane.showMessageDialog(null,"Suma= "+r);
//Restar
JOptionPane.showMessageDialog(null, "RESTA");
n1=JOptionPane.showInputDialog("Ingresa un primer numero: ");
h1=Double.parseDouble(n1);
n2=JOptionPane.showInputDialog("Ingresa un segundo numero: ");
h2=Double.parseDouble(n2);
r=h1-h2;
JOptionPane.showMessageDialog(null,"Resta= "+r);
//Multiplicar
JOptionPane.showMessageDialog(null, "MULTIPLICACION");
n1=JOptionPane.showInputDialog("Ingresa un primer numero: ");
h1=Double.parseDouble(n1);
n2=JOptionPane.showInputDialog("Ingresa un segundo numero: ");
h2=Double.parseDouble(n2);
r=h1*h2;
JOptionPane.showMessageDialog(null,"Multiplicacion= "+r);
//Dividir
JOptionPane.showMessageDialog(null, "DIVISION");
n1=JOptionPane.showInputDialog("Ingresa un primer numero: ");
h1=Double.parseDouble(n1);
n2=JOptionPane.showInputDialog("Ingresa un segundo numero: ");
h2=Double.parseDouble(n2);
r=h1/h2;
JOptionPane.showMessageDialog(null,"Division= "+r);
}
    
}
