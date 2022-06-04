import javax.swing.*;

public class atividadeJava04 {

    public static int somatoria(int x[]) {
        int somat = 1;
        for(int i=0; i< x.length; i++){
            somat = somat + x[i];
        }
        
        return somat;
    }
    public static void produtoria(int x[]) {
        int prod = 1;
        for(int i=0; i< x.length; i++){
            prod = prod *x[i];
        }
        JOptionPane.showMessageDialog(null, "A produtória é " + prod);
        
    }
    public static void main(String entrada[]) {
        int vetor[] = new int[5];
        int st;
        String resultado = "vetor = ";

        for(int i=0; i<vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro para a posição " + i ));
            resultado = resultado + vetor[i] + " ";
              
        }
        resultado = resultado + "\n";
        st = somatoria(vetor);
        JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null, "O resultado da somatoria é :" + st);
        produtoria(vetor);
        System.exit(0);
    }
}
