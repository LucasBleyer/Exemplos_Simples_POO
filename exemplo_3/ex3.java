package exemplo_3;

import javax.swing.JOptionPane;

public class exemplo_3 {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10,20);//o 10 = base e o 20 = altura
        t1.calculaArea();
        JOptionPane.showMessageDialog(null, t1.toString());//mostra uma caixinha de saida
        
        
        Triangulo t2 = new Triangulo(30,40);//o 30 = base e o 40 = altura
        t2.calculaArea();
        JOptionPane.showMessageDialog(null, t2.toString());//mostra uma caixinha de saida
  
    }
    
}