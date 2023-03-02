import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class MenuPrincipal {
    private double valor1;
    private double valor2 = 5.16;

    DecimalFormat formatador = new DecimalFormat("0.00");

    public static void main(String[] args) {
        String[] opcoes = {"Conversor de Moedas", "Conversor de Temperatura"};

        String escolhaOpcoes = (String) JOptionPane.showInputDialog(
                null, "Escolha uma opção:", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);

        System.out.println("Voce escolheu a opcao: " + escolhaOpcoes);
    }

    public void conversorMoeda() {
        double soma;

        try {
            this.valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor:"));
            soma = (this.valor1 / this.valor2);
            JOptionPane.showMessageDialog(null, "O valor da conversão em dólar é de: " +
                    formatador.format(soma), "Conversor de Moedas", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex){
            System.err.println("Invalid string in argumment");
            JOptionPane.showMessageDialog(
                    null, "Erro! Digite apenas números!", "ERRO!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
