import javax.swing.*;

public class atividadeJava03 {

    public static void main(String entrada[]) {

        // variaveis

        int n1, n2, prod, produtoria=1;

        char escolha = '0';

        String resposta = "", instrucao = "Escolha 1 para calcular o produto e 2 para calcular a produtória";

        // entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro positivo ou negativo"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        escolha = (JOptionPane.showInputDialog(instrucao)).charAt(0);

        // processamento
        switch(escolha){
            case '1':{
                if(n1 >= 0 && n2 >= 0){
                    prod = n1*n2;

                    resposta = resposta + "O produto de " + n1 + " e " + n2 + " = " + prod + ". \n\n";
                }
                else{
                    resposta = resposta + "Numeros são negativos, calculos não foram executados.\n\n";
                }
                break;
            }
            case '2':{
                for(int i=1; i<=n2; i=i+1){

                    produtoria = produtoria * n1;
                } 
                resposta = resposta + " a produtória de " + n1 + " vezes " + n2 + " = " + produtoria + "\n";
                break;
            }
            default:
            JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");
        }

        if (escolha >= '1' && escolha <= '3'){

            JOptionPane.showMessageDialog(null, resposta);
   
         }

        System.exit(0);
    }
}
