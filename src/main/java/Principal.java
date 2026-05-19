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
    public static void EntradaProduto() { //sub-rotina responsável pela tela de entrada de produto.
        String CONFIRMAENTRADA = "S"; //atribui "S" para que o loop inicie automaticamente.
        while (CONFIRMAENTRADA.equalsIgnoreCase("S")) { //enquanto o input for "S", o loop continua permitindo novas entradas.
            String NOMEPRODUTO = JOptionPane.showInputDialog( //primeiro input: solicita o nome do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "PRODUTO:"
                + "</div></html>"
            );
            String QTDEATUALSTR = JOptionPane.showInputDialog( //segundo input: solicita a quantidade atual do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "PRODUTO    : " + NOMEPRODUTO + "<br><br>"
                + "QTDE ATUAL:"
                + "</div></html>"
            );
            int QTDEATUAL = Integer.parseInt(QTDEATUALSTR); //converte a String da quantidade atual para inteiro.
            String QTDEENTRADASTR = JOptionPane.showInputDialog( //terceiro input: solicita a quantidade de entrada.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "PRODUTO    : " + NOMEPRODUTO + "<br>"
                + "QTDE ATUAL : " + QTDEATUAL + "<br><br>"
                + "QTDE ENTRADA:"
                + "</div></html>"
            );
            int QTDEENTRADA = Integer.parseInt(QTDEENTRADASTR); //converte a String da quantidade de entrada para inteiro.
            int QTDEFINAL = QTDEATUAL + QTDEENTRADA; //calcula a quantidade final somando atual com entrada.
            String CONFIRMA = JOptionPane.showInputDialog( //quarto input: exibe o resumo e solicita confirmação da entrada.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "PRODUTO      : " + NOMEPRODUTO + "<br>"
                + "QTDE ATUAL   : " + QTDEATUAL + "<br>"
                + "QTDE ENTRADA : " + QTDEENTRADA + "<br>"
                + "QTDE FINAL   : " + QTDEFINAL + "<br><br>"
                + "CONFIRMA ENTRADA (S/N)?:"
                + "</div></html>"
            );
            if (CONFIRMA.equalsIgnoreCase("S")) { //caso o input seja "S", exibe mensagem de sucesso e pergunta se deseja nova entrada.
                CONFIRMAENTRADA = JOptionPane.showInputDialog( //quinto input: pergunta se deseja fazer uma nova entrada.
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "ENTRADA CONFIRMADA COM SUCESSO!<br><br>"
                    + "NOVA ENTRADA (S/N)?:"
                    + "</div></html>"
                );
            } else { //caso o input seja "N", exibe mensagem de cancelamento e pergunta se deseja nova entrada.
                CONFIRMAENTRADA = JOptionPane.showInputDialog( //quinto input: pergunta se deseja fazer uma nova entrada.
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "MOVIMENTAÇÃO - ENTRADA DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "ENTRADA CANCELADA.<br><br>"
                    + "NOVA ENTRADA (S/N)?:"
                    + "</div></html>"
                );
            }
        } //caso o input seja "N" em nova entrada, o loop encerra e retorna para a tela 1.2.
    }
    public static void SaidaProduto() { //sub-rotina responsável pela tela de saída de produto.
        String CONFIRMASAIDA = "S"; //atribui "S" para que o loop inicie automaticamente.
        while (CONFIRMASAIDA.equalsIgnoreCase("S")) { //enquanto o input for "S", o loop continua permitindo novas saídas.
            String NOMEPRODUTO = JOptionPane.showInputDialog( //primeiro input: solicita o nome do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "PRODUTO:"
                + "</div></html>"
            );
            String QTDEATUALSTR = JOptionPane.showInputDialog( //segundo input: solicita a quantidade atual do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "PRODUTO    : " + NOMEPRODUTO + "<br><br>"
                + "QTDE ATUAL:"
                + "</div></html>"
            );
            int QTDEATUAL = Integer.parseInt(QTDEATUALSTR); //converte a String da quantidade atual para inteiro.
            String QTDESAIDASTR = JOptionPane.showInputDialog( //terceiro input: solicita a quantidade de saída.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "PRODUTO    : " + NOMEPRODUTO + "<br>"
                + "QTDE ATUAL : " + QTDEATUAL + "<br><br>"
                + "QTDE SAÍDA:"
                + "</div></html>"
            );
            int QTDESAIDA = Integer.parseInt(QTDESAIDASTR); //converte a String da quantidade de saída para inteiro.
            int QTDEFINAL = QTDEATUAL - QTDESAIDA; //calcula a quantidade final subtraindo a saída da atual.
            String CONFIRMA = JOptionPane.showInputDialog( //quarto input: exibe o resumo e solicita confirmação da saída.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "PRODUTO    : " + NOMEPRODUTO + "<br>"
                + "QTDE ATUAL : " + QTDEATUAL + "<br>"
                + "QTDE SAÍDA : " + QTDESAIDA + "<br>"
                + "QTDE FINAL : " + QTDEFINAL + "<br><br>"
                + "CONFIRMA SAÍDA (S/N)?:"
                + "</div></html>"
            );
            if (CONFIRMA.equalsIgnoreCase("S")) { //caso o input seja "S", exibe mensagem de sucesso e pergunta se deseja nova saída.
                CONFIRMASAIDA = JOptionPane.showInputDialog( //quinto input: pergunta se deseja fazer uma nova saída.
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "SAÍDA CONFIRMADA COM SUCESSO!<br><br>"
                    + "NOVA SAÍDA (S/N)?:"
                    + "</div></html>"
                );
            } else { //caso o input seja "N", exibe mensagem de cancelamento e pergunta se deseja nova saída.
                CONFIRMASAIDA = JOptionPane.showInputDialog( //quinto input: pergunta se deseja fazer uma nova saída.
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "MOVIMENTAÇÃO - SAÍDA DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "SAÍDA CANCELADA.<br><br>"
                    + "NOVA SAÍDA (S/N)?:"
                    + "</div></html>"
                );
            }
        } //caso o input seja "N" em nova saída, o loop encerra e retorna para a tela 1.2.
    }
    public static void ReajustePrecos() { //sub-rotina responsável pela tela de reajuste de preços.
        String NOVOREAJUSTE = "S"; //atribui "S" para que o loop inicie automaticamente.
        while (NOVOREAJUSTE.equalsIgnoreCase("S")) { //enquanto o input for "S", o loop continua permitindo novos reajustes.
            String TIPOREAJUSTE = JOptionPane.showInputDialog( //primeiro input: solicita se o reajuste será geral ou de um produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "REAJUSTE DE PREÇOS"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "REAJUSTE GERAL OU DE UM PRODUTO?<br><br>"
                + "1 - GERAL<br>"
                + "2 - UM PRODUTO<br>"
                + "</div></html>"
            );
            String NOMEPRODUTO = JOptionPane.showInputDialog( //segundo input: solicita o nome do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "REAJUSTE DE PREÇOS"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "REAJUSTE : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br><br>"
                + "PRODUTO:"
                + "</div></html>"
            );
            String UNIDADE = JOptionPane.showInputDialog( //terceiro input: solicita a unidade do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "REAJUSTE DE PREÇOS"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "REAJUSTE : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                + "PRODUTO  : " + NOMEPRODUTO + "<br><br>"
                + "UNIDADE:"
                + "</div></html>"
            );
            String PRECOATUALSTR = JOptionPane.showInputDialog( //quarto input: solicita o preço atual do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "REAJUSTE DE PREÇOS"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "REAJUSTE : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                + "PRODUTO  : " + NOMEPRODUTO + "<br>"
                + "UNIDADE  : " + UNIDADE + "<br><br>"
                + "PREÇO ATUAL:"
                + "</div></html>"
            );
            double PRECOATUAL = Double.parseDouble(PRECOATUALSTR.replace(",", ".")); //converte a String do preço atual para double, aceitando vírgula ou ponto.
            String PERCENTUALSTR = JOptionPane.showInputDialog( //quinto input: solicita o percentual de reajuste.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "REAJUSTE DE PREÇOS"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "REAJUSTE   : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                + "PRODUTO    : " + NOMEPRODUTO + "<br>"
                + "UNIDADE    : " + UNIDADE + "<br>"
                + "PREÇO ATUAL: " + PRECOATUALSTR + "<br><br>"
                + "PERCENTUAL DE REAJUSTE:"
                + "</div></html>"
            );
            double PERCENTUAL = Double.parseDouble(PERCENTUALSTR.replace(",", ".")); //converte a String do percentual para double, aceitando vírgula ou ponto.
            double PRECOFINAL = PRECOATUAL + (PRECOATUAL * PERCENTUAL / 100); //calcula o preço final aplicando o percentual de reajuste.
            String CONFIRMAREAJUSTE = JOptionPane.showInputDialog( //sexto input: exibe o resumo e solicita confirmação do reajuste.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "REAJUSTE DE PREÇOS"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "REAJUSTE   : " + (TIPOREAJUSTE.equals("1") ? "GERAL" : "UM PRODUTO") + "<br>"
                + "PRODUTO    : " + NOMEPRODUTO + "<br>"
                + "UNIDADE    : " + UNIDADE + "<br>"
                + "PREÇO ATUAL: " + String.format("%.2f", PRECOATUAL) + "<br>"
                + "PERCENTUAL : " + String.format("%.2f", PERCENTUAL) + "%<br>"
                + "PREÇO FINAL: " + String.format("%.2f", PRECOFINAL) + "<br><br>"
                + "CONFIRMA REAJUSTE (S/N)?:"
                + "</div></html>"
            );
            if (CONFIRMAREAJUSTE.equalsIgnoreCase("S")) { //caso o input seja "S", exibe mensagem de sucesso e pergunta se deseja novo reajuste.
                NOVOREAJUSTE = JOptionPane.showInputDialog( //sétimo input: pergunta se deseja fazer um novo reajuste.
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE CONFIRMADO COM SUCESSO!<br><br>"
                    + "NOVO REAJUSTE (S/N)?:"
                    + "</div></html>"
                );
            } else { //caso o input seja "N", exibe mensagem de cancelamento e pergunta se deseja novo reajuste.
                NOVOREAJUSTE = JOptionPane.showInputDialog( //sétimo input: pergunta se deseja fazer um novo reajuste.
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "REAJUSTE DE PREÇOS"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "REAJUSTE CANCELADO.<br><br>"
                    + "NOVO REAJUSTE (S/N)?:"
                    + "</div></html>"
                );
            }
        } //caso o input seja "N" em novo reajuste, o loop encerra e retorna para a tela 1.0.
    }
}
