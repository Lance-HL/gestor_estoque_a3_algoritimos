
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        int MENUPP = -1; //atribui um valor á varivel -1 pra ela poder ser utilizada no loop (estou usando loop para a gente conseguir voltar para esse menu depois).

        while (MENUPP != 0) { //enquanto o inout não for 0, o loop vai continuar mantendo a tela do menu principal.

            MENUPP = MenuPrincipal(); //estabelece a sub-rotina MenuPrincipal como padrão para a variável MENUPP

            if (MENUPP == 1) { //caso o inout seja 1 no MenuPrincipal, irá para a sub-rotina MenuCadastro.
                MenuCadastro();
            }
            if (MENUPP == 2) { //caso o inout seja 2 no MenuPrincipal, irá para a sub-rotina MenuMovimentacao.
                MenuMovimentacao();
            }

        }
    }

    public static int MenuPrincipal() {
        String MENUPRINCIPAL = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>" //isso é só pra centralizar o texto usando html básico.
                + "SEX ON THE BAR LTDA<br>" //<br> se refere à *break* line, quebra de linha, que faz ir bra linha de baixo. É o mesmo que \n em java.
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MENU PRINCIPAL"
                + "<div><br>" //o </div> significa que é o fim dos textos

                + "<div style='text-align: justify;'>" //isso muda a formatação do texto para Justificar ao invés de Centralizar.
                + "1 - CADASTRO DE PRODUTO<br>"
                + "2 - MOVIMENTAÇÃO<br>"
                + "3 - REAJUSTE DE PREÇOS<br>"
                + "4 - RELATÓRIOS<br>"
                + "0 - FINALIZAR<br><br>"
                + "</div></html>" //novamente fim da divisão e quando iniciar e finalizar uma programação em html, precisa ter <html> no ínicio e fim.
        );
        return Integer.parseInt(MENUPRINCIPAL); //devolve o valor em Int da String MENUPRINCIPAL para que abra possibilidade pra um novo redirecionamento.
    }

    public static int MenuCadastro() {
        String MENUCADASTRO = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "CADASTRO DE PRODUTOS"
                + "</div><br>"
                + "<div style='text-align: justify;'>"
                + "1 - INCLUSÃO<br>"
                + "2 - ALTERAÇÃO<br>"
                + "3 - CONSULTA<br>"
                + "4 - EXCLUSÃO<br>"
                + "0 - RETORNAR<br><br>"
                + "</div></html>"
        );
        return Integer.parseInt(MENUCADASTRO);
    }

    public static int MenuMovimentacao() {
        String MENUMOVIMENTAÇÃO = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO"
                + "</div><br>"
                + "<div style='text-align: justify;'>"
                + "1 - ENTRADA<br>"
                + "2 - SAIDA<br>"
                + "0 - RETORNAR<br><br>"
                + "</div></html>"
        );
        return Integer.parseInt(MENUMOVIMENTAÇÃO);
    }

}
