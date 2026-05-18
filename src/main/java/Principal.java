import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
        int MENUPP = -1; //atribui um valor á varivel -1 pra ela poder ser utilizada no loop (estou usando loop para a gente conseguir voltar para esse menu depois).
        
        while (MENUPP != 0) { //isso faz o loop continuar rodando enquanto o input não for 0, ou seja, 0 = finalizar loop.
        
        String MENUPRINCIPAL = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>" //isso é só pra centralizar o texto usando html básico.
                + "SEX ON THE BAR LTDA<br>" //<br> se refere à *break* line, quebra de linha, que faz ir bra linha de baixo. É o mesmo que \n em java.
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MENU PRINCIPAL"
                + "<div><br>"   //o </div> significa que é o fim dos textos
                        
                + "<div style='text-align: justify;'>" //isso muda a formatação do texto para Justificar ao invés de Centralizar.
                + "1 - CADASTRO DE PRODUTO<br>"
                + "2 - MOVIMENTAÇÃO<br>"
                + "3 - REAJUSTE DE PREÇOS<br>"
                + "4 - RELATÓRIOS<br>"
                + "0 - FINALIZAR<br><br>"
                + "</div></html>"  //novamente fim da divisão e quando iniciar e finalizar uma programação em html, precisa ter <html> no ínicio e fim.
             );
        
        MENUPP = Integer.parseInt(MENUPRINCIPAL); //isso é para transformar o input do usuário que é uma string para um numero inteiro, ou seja, "1" vira 1
        
        if (MENUPP == 1) { //condição para caso o input seja 1, levandopara o menu de cadastro
            
            int MENUCD = -1; //mesma coisa de antes, atribui um valor para a varivael poder ser usada no loop
            
            while (MENUCD != 0) { //continua na mesma lógica anterior, faz com que 0 = finalizar, nesse caso o finaliza ESSE loop (menu de cadastro) e volta para o loop anterior (menu principal).
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
            MENUCD = Integer.parseInt(MENUCADASTRO);
            }
        }
        if (MENUPP == 2) { //é a mesma lógica de antes daqui pra frente
            
            int MENUMV = -1;
            
            while (MENUMV != 0) {
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
            MENUMV = Integer.parseInt(MENUMOVIMENTAÇÃO);
            }
        
        }
        }
    }
}
