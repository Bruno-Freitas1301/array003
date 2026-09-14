package array003;

import javax.swing.JOptionPane;

public class ronaldo3 {

    public static void main(String[] args) {

        String impressao;
        int numeros[] = new int[5];
        

        for (int p = 0; p < 5; p++) {
            numeros[p] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (p + 1) + "º número:"));
        }
        

        impressao = numeros[4] + " " + numeros[3] + " " + numeros[2] + " " + numeros[1] + " " + numeros[0];
        
        JOptionPane.showMessageDialog(null, "Ordem decrescente: " + impressao); 
    }
}