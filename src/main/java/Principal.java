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
            if (MENUPP == 3) {
                ReajustePrecos();
            }
            if (MENUPP == 4) { //caso o input seja 4 no MenuPrincipal, irá para a sub-rotina MenuRelatorios.
                MenuRelatorios();
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
        if (MENUPRINCIPAL == null) return 0; //se o usuário clicar em Cancelar ou fechar a janela, encerra o programa retornando 0.
        return Integer.parseInt(MENUPRINCIPAL); //devolve o valor em Int da String MENUPRINCIPAL para que abra possibilidade pra um novo redirecionamento.
    }
    public static int MenuCadastro() {
        int MENUCADASTRO = -1; //atribui -1 para que o loop inicie e permita retorno correto ao menu principal.
        while (MENUCADASTRO != 0) { //enquanto o input não for 0, o loop mantém a tela de cadastro.
            String INPUT = JOptionPane.showInputDialog(
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
            if (INPUT == null) return 0; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
            MENUCADASTRO = Integer.parseInt(INPUT);
            if (MENUCADASTRO == 1) { //caso o input seja 1 no MenuCadastro, irá para a sub-rotina InclusaoProduto (tela 1.1.1).
                InclusaoProduto();
            }
            if (MENUCADASTRO == 2) { //caso o input seja 2 no MenuCadastro, irá para a sub-rotina AlteracaoProduto (tela 1.1.2).
                AlteracaoProduto();
            }
            if (MENUCADASTRO == 3) { //caso o input seja 3 no MenuCadastro, irá para a sub-rotina ConsultaProduto (tela 1.1.3).
                ConsultaProduto();
            }
            if (MENUCADASTRO == 4) { //caso o input seja 4 no MenuCadastro, irá para a sub-rotina ExclusaoProduto.
                ExclusaoProduto();
            }
        }
        return MENUCADASTRO; //retorna 0 para voltar ao menu principal.
    }
    public static int MenuMovimentacao() {
        int MENUMOV = -1; //atribui -1 para que o loop inicie e permita retorno correto ao menu principal.
        while (MENUMOV != 0) { //enquanto o input não for 0, o loop mantém a tela de movimentação.
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
            if (MENUMOVIMENTAÇÃO == null) return 0; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
            MENUMOV = Integer.parseInt(MENUMOVIMENTAÇÃO);
            if (MENUMOV == 1) { //caso o input seja 1, irá para a sub-rotina EntradaProduto.
                EntradaProduto();
            }
            if (MENUMOV == 2) { //caso o input seja 2, irá para a sub-rotina SaidaProduto.
                SaidaProduto();
            }
        }
        return MENUMOV; //retorna 0 para voltar ao menu principal.
    }
    public static void InclusaoProduto() { //sub-rotina responsável pela tela de inclusão de produto (tela 1.1.1).
        String NOVAALTERACAO = "S"; //atribui "S" para que o loop inicie automaticamente.
        while (NOVAALTERACAO.equalsIgnoreCase("S")) { //enquanto o input for "S", o loop continua permitindo novas inclusões ou alterações.
            String NOMEPRODUTO = JOptionPane.showInputDialog( //primeiro input: solicita o nome do produto.
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "INCLUSÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:"
                + "</div></html>"
            );
            if (NOMEPRODUTO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            String PRECOPRODUTOSTR = JOptionPane.showInputDialog( //segundo input: solicita o preço do produto.
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "INCLUSÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br><br>"
                + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:"
                + "</div></html>"
            );
            if (PRECOPRODUTOSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            double PRECOPRODUTO = Double.parseDouble(PRECOPRODUTOSTR.replace(",", ".")); //converte a String do preço para double, aceitando vírgula ou ponto.
            String UNIDADE = JOptionPane.showInputDialog( //terceiro input: solicita a unidade do produto.
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "INCLUSÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br>"
                + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + String.format("%.2f", PRECOPRODUTO) + "<br><br>"
                + "UNIDADE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:"
                + "</div></html>"
            );
            if (UNIDADE == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            String QTDEPRODUTOSTR = JOptionPane.showInputDialog( //quarto input: solicita a quantidade do produto.
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "INCLUSÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br>"
                + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                + "UNIDADE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + UNIDADE + "<br><br>"
                + "QUANTIDADE&nbsp;&nbsp;&nbsp;:"
                + "</div></html>"
            );
            if (QTDEPRODUTOSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            int QTDEPRODUTO = Integer.parseInt(QTDEPRODUTOSTR); //converte a String da quantidade para inteiro.
            String CONFIRMA = JOptionPane.showInputDialog( //quinto input: exibe o resumo e solicita confirmação da inclusão.
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "INCLUSÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br>"
                + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                + "UNIDADE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + UNIDADE + "<br>"
                + "QUANTIDADE&nbsp;&nbsp;&nbsp;: " + QTDEPRODUTO + "<br><br>"
                + "CONFIRMA INCLUSÃO ( S/N ) ?&nbsp;"
                + "</div></html>"
            );
            if (CONFIRMA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            if (CONFIRMA.equalsIgnoreCase("S")) { //caso o input seja "S", confirma a inclusão e pergunta se deseja nova alteração.
                NOVAALTERACAO = JOptionPane.showInputDialog( //sexto input: pergunta se deseja fazer uma nova alteração/inclusão.
                    "<html><div style='text-align: center;'>"
                    + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "INCLUSÃO DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br>"
                    + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                    + "UNIDADE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + UNIDADE + "<br>"
                    + "QUANTIDADE&nbsp;&nbsp;&nbsp;: " + QTDEPRODUTO + "<br><br>"
                    + "CONFIRMA INCLUSÃO ( S/N ) ? S<br><br>"
                    + "INCLUSÃO CONFIRMADA COM SUCESSO!<br><br>"
                    + "NOVA ALTERAÇÃO ( S/N ) ?&nbsp;"
                    + "</div></html>"
                );
                if (NOVAALTERACAO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            } else { //caso o input seja "N", cancela a inclusão e pergunta se deseja nova alteração.
                NOVAALTERACAO = JOptionPane.showInputDialog( //sexto input: pergunta se deseja fazer uma nova alteração/inclusão.
                    "<html><div style='text-align: center;'>"
                    + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "INCLUSÃO DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br>"
                    + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                    + "UNIDADE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + UNIDADE + "<br>"
                    + "QUANTIDADE&nbsp;&nbsp;&nbsp;: " + QTDEPRODUTO + "<br><br>"
                    + "CONFIRMA INCLUSÃO ( S/N ) ? N<br><br>"
                    + "INCLUSÃO CANCELADA.<br><br>"
                    + "NOVA ALTERAÇÃO ( S/N ) ?&nbsp;"
                    + "</div></html>"
                );
                if (NOVAALTERACAO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            }
        } //caso o input seja "N" em nova alteração, o loop encerra e retorna para a tela 1.1 (MenuCadastro).
    }
    public static void AlteracaoProduto() { //sub-rotina responsável pela tela de alteração de produto (tela 1.1.2).
        String NOVAALTERACAO = "S"; //atribui "S" para que o loop inicie automaticamente.
        while (NOVAALTERACAO.equalsIgnoreCase("S")) { //enquanto o input for "S", o loop continua permitindo novas alterações.
            String NOMEPRODUTO = JOptionPane.showInputDialog( //primeiro input: solicita o nome do produto a ser alterado.
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "ALTERAÇÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:"
                + "</div></html>"
            );
            if (NOMEPRODUTO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            String PRECOPRODUTOSTR = JOptionPane.showInputDialog( //segundo input: solicita o novo preço do produto.
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "ALTERAÇÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br><br>"
                + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:"
                + "</div></html>"
            );
            if (PRECOPRODUTOSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            double PRECOPRODUTO = Double.parseDouble(PRECOPRODUTOSTR.replace(",", ".")); //converte a String do preço para double, aceitando vírgula ou ponto.
            String UNIDADE = JOptionPane.showInputDialog( //terceiro input: solicita a nova unidade do produto.
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "ALTERAÇÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br>"
                + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + String.format("%.2f", PRECOPRODUTO) + "<br><br>"
                + "UNIDADE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:"
                + "</div></html>"
            );
            if (UNIDADE == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            String QTDEPRODUTOSTR = JOptionPane.showInputDialog( //quarto input: solicita a nova quantidade do produto.
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "ALTERAÇÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br>"
                + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                + "UNIDADE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + UNIDADE + "<br><br>"
                + "QUANTIDADE&nbsp;&nbsp;&nbsp;:"
                + "</div></html>"
            );
            if (QTDEPRODUTOSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            int QTDEPRODUTO = Integer.parseInt(QTDEPRODUTOSTR); //converte a String da quantidade para inteiro.
            String CONFIRMA = JOptionPane.showInputDialog( //quinto input: exibe o resumo e solicita confirmação da alteração.
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "ALTERAÇÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br>"
                + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                + "UNIDADE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + UNIDADE + "<br>"
                + "QUANTIDADE&nbsp;&nbsp;&nbsp;: " + QTDEPRODUTO + "<br><br>"
                + "CONFIRMA ALTERAÇÃO ( S/N ) ?&nbsp;"
                + "</div></html>"
            );
            if (CONFIRMA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            if (CONFIRMA.equalsIgnoreCase("S")) { //caso o input seja "S", confirma a alteração e pergunta se deseja nova alteração.
                NOVAALTERACAO = JOptionPane.showInputDialog( //sexto input: pergunta se deseja fazer uma nova alteração.
                    "<html><div style='text-align: center;'>"
                    + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "ALTERAÇÃO DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br>"
                    + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                    + "UNIDADE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + UNIDADE + "<br>"
                    + "QUANTIDADE&nbsp;&nbsp;&nbsp;: " + QTDEPRODUTO + "<br><br>"
                    + "CONFIRMA ALTERAÇÃO ( S/N ) ? S<br><br>"
                    + "ALTERAÇÃO CONFIRMADA COM SUCESSO!<br><br>"
                    + "NOVA ALTERAÇÃO ( S/N ) ?&nbsp;"
                    + "</div></html>"
                );
                if (NOVAALTERACAO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            } else { //caso o input seja "N", cancela a alteração e pergunta se deseja nova alteração.
                NOVAALTERACAO = JOptionPane.showInputDialog( //sexto input: pergunta se deseja fazer uma nova alteração.
                    "<html><div style='text-align: center;'>"
                    + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "ALTERAÇÃO DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "NOME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + NOMEPRODUTO + "<br>"
                    + "PREÇO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                    + "UNIDADE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: " + UNIDADE + "<br>"
                    + "QUANTIDADE&nbsp;&nbsp;&nbsp;: " + QTDEPRODUTO + "<br><br>"
                    + "CONFIRMA ALTERAÇÃO ( S/N ) ? N<br><br>"
                    + "ALTERAÇÃO CANCELADA.<br><br>"
                    + "NOVA ALTERAÇÃO ( S/N ) ?&nbsp;"
                    + "</div></html>"
                );
                if (NOVAALTERACAO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            }
        } //caso o input seja "N" em nova alteração, o loop encerra e retorna para a tela 1.1 (MenuCadastro).
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
            if (NOMEPRODUTO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
            if (QTDEATUALSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
            if (QTDEENTRADASTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
            if (CONFIRMA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
                if (CONFIRMAENTRADA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
                if (CONFIRMAENTRADA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
            if (NOMEPRODUTO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
            if (QTDEATUALSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
            if (QTDESAIDASTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
            if (CONFIRMA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
                if (CONFIRMASAIDA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
                if (CONFIRMASAIDA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuMovimentacao.
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
            if (TIPOREAJUSTE == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
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
            if (NOMEPRODUTO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
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
            if (UNIDADE == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
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
            if (PRECOATUALSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
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
            if (PERCENTUALSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
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
            if (CONFIRMAREAJUSTE == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
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
                if (NOVOREAJUSTE == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
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
                if (NOVOREAJUSTE == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
            }
        } //caso o input seja "N" em novo reajuste, o loop encerra e retorna para a tela 1.0.
    }
    public static void ExclusaoProduto() { //sub-rotina responsável pela tela de exclusão de produto.
        String NOVAEXCLUSAO = "S"; //atribui "S" para que o loop inicie automaticamente.
        while (NOVAEXCLUSAO.equalsIgnoreCase("S")) { //enquanto o input for "S", o loop continua permitindo novas exclusões.
            String NOMEPRODUTO = JOptionPane.showInputDialog( //primeiro input: solicita o nome do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "EXCLUSÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME:"
                + "</div></html>"
            );
            if (NOMEPRODUTO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            String PRECOPRODUTOSTR = JOptionPane.showInputDialog( //segundo input: solicita o preço do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "EXCLUSÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME     : " + NOMEPRODUTO + "<br><br>"
                + "PREÇO:"
                + "</div></html>"
            );
            if (PRECOPRODUTOSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            double PRECOPRODUTO = Double.parseDouble(PRECOPRODUTOSTR.replace(",", ".")); //converte a String do preço para double, aceitando vírgula ou ponto.
            String UNIDADE = JOptionPane.showInputDialog( //terceiro input: solicita a unidade do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "EXCLUSÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME     : " + NOMEPRODUTO + "<br>"
                + "PREÇO    : " + String.format("%.2f", PRECOPRODUTO) + "<br><br>"
                + "UNIDADE:"
                + "</div></html>"
            );
            if (UNIDADE == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            String QTDEPRODUTOSTR = JOptionPane.showInputDialog( //quarto input: solicita a quantidade do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "EXCLUSÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME     : " + NOMEPRODUTO + "<br>"
                + "PREÇO    : " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                + "UNIDADE  : " + UNIDADE + "<br><br>"
                + "QUANTIDADE:"
                + "</div></html>"
            );
            if (QTDEPRODUTOSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            int QTDEPRODUTO = Integer.parseInt(QTDEPRODUTOSTR); //converte a String da quantidade para inteiro.
            String CONFIRMA = JOptionPane.showInputDialog( //quinto input: exibe o resumo e solicita confirmação da exclusão.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "EXCLUSÃO DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME       : " + NOMEPRODUTO + "<br>"
                + "PREÇO      : " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                + "UNIDADE    : " + UNIDADE + "<br>"
                + "QUANTIDADE : " + QTDEPRODUTO + "<br><br>"
                + "CONFIRMA EXCLUSÃO (S/N)?:"
                + "</div></html>"
            );
            if (CONFIRMA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            if (CONFIRMA.equalsIgnoreCase("S")) { //caso o input seja "S", exibe mensagem de sucesso e pergunta se deseja nova exclusão.
                NOVAEXCLUSAO = JOptionPane.showInputDialog( //sexto input: pergunta se deseja fazer uma nova exclusão.
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "EXCLUSÃO DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "EXCLUSÃO CONFIRMADA COM SUCESSO!<br><br>"
                    + "NOVA EXCLUSÃO (S/N)?:"
                    + "</div></html>"
                );
                if (NOVAEXCLUSAO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            } else { //caso o input seja "N", exibe mensagem de cancelamento e pergunta se deseja nova exclusão.
                NOVAEXCLUSAO = JOptionPane.showInputDialog( //sexto input: pergunta se deseja fazer uma nova exclusão.
                    "<html><div style='text-align: center;'>"
                    + "SEX ON THE BAR LTDA<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "EXCLUSÃO DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "EXCLUSÃO CANCELADA.<br><br>"
                    + "NOVA EXCLUSÃO (S/N)?:"
                    + "</div></html>"
                );
                if (NOVAEXCLUSAO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            }
        } //caso o input seja "N" em nova exclusão, o loop encerra e retorna para a tela 1.1.
    }
    public static void RelatorioBalanco() { //sub-rotina responsável pela tela de balanço físico-financeiro.
        String[][] PRODUTOS = { //tabela de produtos com nome, unidade, preço unitário e quantidade.
            {"AXXXXXXXXXXXXXXXXXX", "XXX", "9.99", "9"},
            {"BXXXXXXXXXXXXXXXXXX", "XXX", "9.99", "9"},
            {"CXXXXXXXXXXXXXXXXXX", "XXX", "9.99", "9"},
            {"DXXXXXXXXXXXXXXXXXX", "XXX", "9.99", "9"},
            {"EXXXXXXXXXXXXXXXXXX", "XXX", "9.99", "9"}
        };
        int TOTALITENS = 0; //variável para acumular o total de itens no estoque.
        double VALORTOTAL = 0; //variável para acumular o valor total do estoque.
        String LISTA = "<html><div style='text-align: left;'>" //inicia a montagem da lista em html.
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "BALANÇO FÍSICO-FINANCEIRO<br><br>"
                + "<table border='0'>"
                + "<tr>"
                + "<td><b>PRODUTO</b></td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td><b>UND</b></td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td><b>PREÇO UNIT.</b></td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td><b>QTDE</b></td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td><b>PREÇO TOTAL</b></td>"
                + "</tr>";
        for (String[] PRODUTO : PRODUTOS) { //percorre a tabela de produtos calculando os totais e montando as linhas da lista.
            int QTDE = Integer.parseInt(PRODUTO[3]); //converte a quantidade para inteiro.
            double PRECOUNIT = Double.parseDouble(PRODUTO[2]); //converte o preço unitário para double.
            double PRECOTOTAL = QTDE * PRECOUNIT; //calcula o preço total do produto.
            TOTALITENS += QTDE; //acumula o total de itens.
            VALORTOTAL += PRECOTOTAL; //acumula o valor total.
            LISTA += "<tr>"
                + "<td>" + PRODUTO[0] + "</td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td>" + PRODUTO[1] + "</td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td>" + String.format("%.2f", PRECOUNIT) + "</td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td>" + QTDE + "</td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td>" + String.format("%.2f", PRECOTOTAL) + "</td>"
                + "</tr>";
        }
        LISTA += "</table><br>" //finaliza a tabela e adiciona o rodapé com os totais.
                + "TOTAL DE ITENS NO ESTOQUE : " + TOTALITENS + "<br>"
                + "VALOR TOTAL DO ESTOQUE    : " + String.format("%.2f", VALORTOTAL) + "<br><br>"
                + "Digite 0 para retornar."
                + "</div></html>";
        String RETORNO = JOptionPane.showInputDialog(LISTA); //exibe a lista e aguarda o input do usuário para retornar.
        while (RETORNO != null && !RETORNO.equals("0")) { //enquanto o input não for 0 e não for nulo (Cancelar), exibe a lista novamente.
            RETORNO = JOptionPane.showInputDialog(LISTA);
        } //caso o input seja "0" ou o usuário clique em Cancelar, o loop encerra e retorna para a tela 1.4.
    }
    public static void RelatorioListaPrecos() { //sub-rotina responsável pela tela de lista de preços.
        String[][] PRODUTOS = { //tabela de produtos com nome, unidade e preço.
            {"AXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "9.99"},
            {"BXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "9.99"},
            {"CXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "9.99"},
            {"DXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "9.99"},
            {"EXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "XXX", "9.99"}
        };
        String LISTA = "<html><div style='text-align: left;'>" //inicia a montagem da lista em html.
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "LISTA DE PREÇOS<br><br>"
                + "<table border='0'>"
                + "<tr>"
                + "<td><b>PRODUTO</b></td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td><b>UND</b></td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td><b>PREÇO</b></td>"
                + "</tr>";
        for (String[] PRODUTO : PRODUTOS) { //percorre a tabela de produtos montando as linhas da lista.
            double PRECO = Double.parseDouble(PRODUTO[2]); //converte o preço para double.
            LISTA += "<tr>"
                + "<td>" + PRODUTO[0] + "</td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td>" + PRODUTO[1] + "</td>"
                + "<td>&nbsp;&nbsp;</td>"
                + "<td>" + String.format("%.2f", PRECO) + "</td>"
                + "</tr>";
        }
        LISTA += "</table><br>" //finaliza a tabela e adiciona instrução para retornar.
                + "Digite 0 para retornar."
                + "</div></html>";
        String RETORNO = JOptionPane.showInputDialog(LISTA); //exibe a lista e aguarda o input do usuário para retornar.
        while (RETORNO != null && !RETORNO.equals("0")) { //enquanto o input não for 0 e não for nulo (Cancelar), exibe a lista novamente.
            RETORNO = JOptionPane.showInputDialog(LISTA);
        } //caso o input seja "0" ou o usuário clique em Cancelar, o loop encerra e retorna para a tela 1.4.
    }
    public static void ConsultaProduto() { //sub-rotina responsável pela tela de consulta de produto.
        String NOVACONSULTA = "S"; //atribui "S" para que o loop inicie automaticamente.
        while (NOVACONSULTA.equalsIgnoreCase("S")) { //enquanto o input for "S", o loop continua permitindo novas consultas.
            String NOMEPRODUTO = JOptionPane.showInputDialog( //primeiro input: solicita o nome do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "CONSULTA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME:"
                + "</div></html>"
            );
            if (NOMEPRODUTO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            String PRECOPRODUTOSTR = JOptionPane.showInputDialog( //segundo input: solicita o preço do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "CONSULTA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME     : " + NOMEPRODUTO + "<br><br>"
                + "PREÇO:"
                + "</div></html>"
            );
            if (PRECOPRODUTOSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            double PRECOPRODUTO = Double.parseDouble(PRECOPRODUTOSTR.replace(",", ".")); //converte a String do preço para double, aceitando vírgula ou ponto.
            String UNIDADE = JOptionPane.showInputDialog( //terceiro input: solicita a unidade do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "CONSULTA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME     : " + NOMEPRODUTO + "<br>"
                + "PREÇO    : " + String.format("%.2f", PRECOPRODUTO) + "<br><br>"
                + "UNIDADE:"
                + "</div></html>"
            );
            if (UNIDADE == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            String QTDEPRODUTOSTR = JOptionPane.showInputDialog( //quarto input: solicita a quantidade do produto.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "CONSULTA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME     : " + NOMEPRODUTO + "<br>"
                + "PREÇO    : " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                + "UNIDADE  : " + UNIDADE + "<br><br>"
                + "QUANTIDADE:"
                + "</div></html>"
            );
            if (QTDEPRODUTOSTR == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            int QTDEPRODUTO = Integer.parseInt(QTDEPRODUTOSTR); //converte a String da quantidade para inteiro.
            NOVACONSULTA = JOptionPane.showInputDialog( //quinto input: pergunta se deseja fazer uma nova consulta.
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "CONSULTA DE PRODUTO"
                + "</div><br><br>"
                + "<div style='text-align: justify;'>"
                + "NOME       : " + NOMEPRODUTO + "<br>"
                + "PREÇO      : " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                + "UNIDADE    : " + UNIDADE + "<br>"
                + "QUANTIDADE : " + QTDEPRODUTO + "<br><br>"
                + "NOVA CONSULTA (S/N)?:"
                + "</div></html>"
            );
            if (NOVACONSULTA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
        } //caso o input seja "N", o loop encerra e retorna para a tela 1.1.
    }
    public static int MenuRelatorios() { //sub-rotina responsável pelo menu de relatórios (tela 1.4).
        int MENUREL = -1; //atribui -1 para que o loop inicie e permita retorno correto ao menu principal.
        while (MENUREL != 0) { //enquanto o input não for 0, o loop mantém a tela de relatórios.
            String INPUT = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>"
                + "SEX ON THE BAR LTDA<br>"
                + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                + "RELATÓRIOS"
                + "</div><br>"
                + "<div style='text-align: justify;'>"
                + "1 - LISTA DE PREÇOS<br>"
                + "2 - BALANÇO FÍSICO-FINANCEIRO<br>"
                + "0 - RETORNAR<br><br>"
                + "</div></html>"
            );
            if (INPUT == null) return 0; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao menu principal.
            MENUREL = Integer.parseInt(INPUT);
            if (MENUREL == 1) { //caso o input seja 1, irá para a sub-rotina RelatorioListaPrecos (tela 1.4.1).
                RelatorioListaPrecos();
            }
            if (MENUREL == 2) { //caso o input seja 2, irá para a sub-rotina RelatorioBalanco (tela 1.4.2).
                RelatorioBalanco();
            }
        }
        return MENUREL; //retorna 0 para voltar ao menu principal.
    }
}
