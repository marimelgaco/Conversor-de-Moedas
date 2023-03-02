import javax.swing.JOptionPane;
public class MenuPrincipal {
    private double valor1;
    private double valor2 = 5.16;

    public static void main(String[] args) {
        String[] opcoes = {"Conversor de Moedas", "Conversor de Temperatura"};

        String escolhaOpcoes = (String) JOptionPane.showInputDialog(
                null, "Escolha uma opção:", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);

        System.out.println("Voce escolheu a opcao: " + escolhaOpcoes);
    }
}
