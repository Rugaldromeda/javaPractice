import javax.swing.*;

public class atividadeJava02 {
    public static void main(String entrada[]) {
        //declaração de variáveis
        int n1,n2, divisao;
        double potencia;
        String msg = "";
        // entrada de dados]
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        // processamento
        divisao = (int)n1 / (int)n2;
        potencia = Math.pow(n1,n2);

        //saida de resultados
        msg = msg + "resultado da divisão de " + n1 + " por " + n2 + " = " + divisao + "\n";
        msg = msg + "resultado da potência de " + n1 + " por " + n2 + " = " + potencia + "\n";
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
        
    }
}

