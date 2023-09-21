package dennisc;
import javax.swing.JOptionPane;
public class arreglos {
public static void main(String[] args) {
double []num= new double [5];
double r=0;
int h;
String op;
JOptionPane.showMessageDialog(null, "Suma");
for(h=0;h<=4;h++){
op=JOptionPane.showInputDialog("Ingresa numero a sumar: ");
num[h]=Double.parseDouble(op);
r=r+num[h];}
JOptionPane.showMessageDialog(null, "Suma "+r);
}

        
    }
    
