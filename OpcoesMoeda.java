import javax.swing.JOptionPane;

public class OpcoesMoeda {
    public static void main(String[] args) {
        String[] opcoes = {"REAIS para DÓLARES", "REAIS para EUROS", "REAIS para LIBRAS", "DÓLARES para REAIS",
                "EUROS para REAIS", "LIBRAS para REAIS"};

        String escolhaOpcoes = (String) JOptionPane.showInputDialog(
                null, "Escolha a moeda para a qual você deseja realizar o câmbio:", "Moedas",
                JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);

        System.out.println("Voce escolheu a opcao: " + escolhaOpcoes);
    }
}
