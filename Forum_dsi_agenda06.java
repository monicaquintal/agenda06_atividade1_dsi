package forum_dsi_agenda06;

import javax.swing.JOptionPane;

public class Forum_dsi_agenda06 {

    public static void main(String[] args) {
        // declaração de variáveis
        int idade, resultado;
        
        // entrada de dados
        idade = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe a categoria em que se enquadra a idade do conveniado: " +
                "\n 1 - Criança com menos de 10 anos;" +
                "\n 2 - De 10 a 30 anos." +
                "\n 3 - De 31 a 39 anos." +
                "\n 4 - De 40 a 60 anos." +
                "\n 5 - Maiores de 60 anos."));
        
        // processamento de dados e saída
        
        switch (idade) {
            case 1:
                resultado = 200 + 80;
                JOptionPane.showMessageDialog(null, "O valor a ser pago será: R$ " + resultado);
                break;
            
            case 2:
                resultado = 200 + 50;
                JOptionPane.showMessageDialog(null, "O valor a ser pago será: R$ " + resultado);
                break;

            // como não identifiquei a categoria "maior que 30 até 40 anos", criei a opção a seguir:    
            case 3:
                resultado = 200 + 65;
                JOptionPane.showMessageDialog(null, "O valor a ser pago será: R$ " + resultado);
                break;
                
            case 4:
                resultado = 200 + 95;
                JOptionPane.showMessageDialog(null, "O valor a ser pago será: R$ " + resultado);
                break;
                
            case 5:
                resultado = 200 + 130;
                JOptionPane.showMessageDialog(null, "O valor a ser pago será: R$ " + resultado);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Insira o número da categoria.");
                break;
        }//fim do switch case
        
    }//fim do método main
    
}//fim da classe
