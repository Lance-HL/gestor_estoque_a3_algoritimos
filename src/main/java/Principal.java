import javax.swing.JOptionPane;
public class Principal {
    // vetores para armazenar os dados dos produtos cadastrados
    static final int MAX_PRODUTOS = 100; //capacidade máxima de produtos no cadastro
    static String[] nomeProdutos = new String[MAX_PRODUTOS]; //vetor de nomes dos produtos
    static double[] precoProdutos = new double[MAX_PRODUTOS]; //vetor de preços dos produtos
    static String[] unidadeProdutos = new String[MAX_PRODUTOS]; //vetor de unidades dos produtos
    static int[] qtdeProdutos = new int[MAX_PRODUTOS]; //vetor de quantidades dos produtos
    static int totalProdutos = 0; //contador de produtos cadastrados
    static double totalEntradasFinanceiras = 0;
    static double totalSaidasFinanceiras = 0;

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
                + "XYZ COMERCIO DE PRODUTOS LTDA<br>" //<br> se refere à break line, quebra de linha, que faz ir bra linha de baixo. É o mesmo que \n em java.
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
                    + "XYZ COMERCIO DE PRODUTOS LTDA<br>"
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
                    + "XYZ COMERCIO DE PRODUTOS LTDA<br>"
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
                + "NOME:"
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
                + "NOME: " + NOMEPRODUTO + "<br><br>"
                + "PREÇO:"
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
                + "NOME: " + NOMEPRODUTO + "<br>"
                + "PREÇO: " + String.format("%.2f", PRECOPRODUTO) + "<br><br>"
                + "UNIDADE:"
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
                + "NOME: " + NOMEPRODUTO + "<br>"
                + "PREÇO: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                + "UNIDADE: " + UNIDADE + "<br><br>"
                + "QUANTIDADE: "
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
                + "NOME: " + NOMEPRODUTO + "<br>"
                + "PREÇO: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                + "UNIDADE: " + UNIDADE + "<br>"
                + "QUANTIDADE: " + QTDEPRODUTO + "<br><br>"
                + "CONFIRMA INCLUSÃO ( S/N ) ?&nbsp;"
                + "</div></html>"
            );
            if (CONFIRMA == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            if (CONFIRMA.equalsIgnoreCase("S")) { //caso o input seja "S", confirma a inclusão e pergunta se deseja nova alteração.
                if (totalProdutos < MAX_PRODUTOS) { //verifica se ainda há espaço nos vetores antes de cadastrar.
                    nomeProdutos[totalProdutos] = NOMEPRODUTO; //armazena o nome do produto no vetor de nomes.
                    precoProdutos[totalProdutos] = PRECOPRODUTO; //armazena o preço do produto no vetor de preços.
                    unidadeProdutos[totalProdutos] = UNIDADE; //armazena a unidade do produto no vetor de unidades.
                    qtdeProdutos[totalProdutos] = QTDEPRODUTO; //armazena a quantidade do produto no vetor de quantidades.
                    totalProdutos++; //incrementa o contador de produtos cadastrados.
                }
                NOVAALTERACAO = JOptionPane.showInputDialog( //sexto input: pergunta se deseja fazer uma nova alteração/inclusão.
                    "<html><div style='text-align: center;'>"
                    + "XYZ COMERCIO DE PRODUTOS LTDA.<br>"
                    + "SISTEMA DE CONTROLE DE ESTOQUE<br><br>"
                    + "INCLUSÃO DE PRODUTO"
                    + "</div><br><br>"
                    + "<div style='text-align: justify;'>"
                    + "NOME: " + NOMEPRODUTO + "<br>"
                    + "PREÇO: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                    + "UNIDADE: " + UNIDADE + "<br>"
                    + "QUANTIDADE: " + QTDEPRODUTO + "<br><br>"
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
                    + "NOME: " + NOMEPRODUTO + "<br>"
                    + "PREÇO: " + String.format("%.2f", PRECOPRODUTO) + "<br>"
                    + "UNIDADE: " + UNIDADE + "<br>"
                    + "QUANTIDADE: " + QTDEPRODUTO + "<br><br>"
                    + "CONFIRMA INCLUSÃO ( S/N ) ? N<br><br>"
                    + "INCLUSÃO CANCELADA.<br><br>"
                    + "NOVA ALTERAÇÃO ( S/N ) ?&nbsp;"
                    + "</div></html>"
                );
                if (NOVAALTERACAO == null) return; //se o usuário clicar em Cancelar ou fechar a janela, retorna ao MenuCadastro.
            }
        } //caso o input seja "N" em nova alteração, o loop encerra e retorna para a tela 1.1 (MenuCadastro).
    }
   public static void AlteracaoProduto() {

    String NOVAALTERACAO = "S";

    while (NOVAALTERACAO.equalsIgnoreCase("S")) {

        String NOMEPRODUTO = JOptionPane.showInputDialog(
                "Digite o nome do produto que deseja alterar:"
        );

        if (NOMEPRODUTO == null) return;

        int indice = -1;

        // procura o produto
        for (int i = 0; i < totalProdutos; i++) {

            if (nomeProdutos[i].equalsIgnoreCase(NOMEPRODUTO)) {
                indice = i;
                break;
            }
        }

        // produto não encontrado
        if (indice == -1) {

            JOptionPane.showMessageDialog(
                    null,
                    "Produto não encontrado."
            );

        } else {

            // mostra os dados atuais
            JOptionPane.showMessageDialog(
                    null,
                    "PRODUTO ENCONTRADO\n\n"
                    + "Nome: " + nomeProdutos[indice]
                    + "\nPreço: " + precoProdutos[indice]
                    + "\nUnidade: " + unidadeProdutos[indice]
                    + "\nQuantidade: " + qtdeProdutos[indice]
            );

            // novos dados
            String novoPrecoStr = JOptionPane.showInputDialog(
                    "Novo preço:"
            );

            if (novoPrecoStr == null) return;

            double novoPreco =
                    Double.parseDouble(novoPrecoStr.replace(",", "."));

            String novaUnidade = JOptionPane.showInputDialog(
                    "Nova unidade:"
            );

            if (novaUnidade == null) return;

            String novaQtdeStr = JOptionPane.showInputDialog(
                    "Nova quantidade:"
            );

            if (novaQtdeStr == null) return;

            int novaQtde = Integer.parseInt(novaQtdeStr);

            // confirmação
            String confirma = JOptionPane.showInputDialog(
                    "CONFIRMA ALTERAÇÃO? (S/N)"
            );

            if (confirma == null) return;

            if (confirma.equalsIgnoreCase("S")) {

                // altera os vetores
                precoProdutos[indice] = novoPreco;
                unidadeProdutos[indice] = novaUnidade;
                qtdeProdutos[indice] = novaQtde;

                JOptionPane.showMessageDialog(
                        null,
                        "ALTERAÇÃO REALIZADA COM SUCESSO!"
                );

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "ALTERAÇÃO CANCELADA."
                );
            }
        }

        NOVAALTERACAO = JOptionPane.showInputDialog(
                "NOVA ALTERAÇÃO? (S/N)"
        );

        if (NOVAALTERACAO == null) return;
    }
}
    public static void EntradaProduto() {

    String NOVAENTRADA = "S";

    while (NOVAENTRADA.equalsIgnoreCase("S")) {

        String nomeBusca = JOptionPane.showInputDialog(
                "Digite o nome do produto:"
        );

        if(nomeBusca == null) return;

        int indice = -1;

        // procura produto
        for(int i=0;i<totalProdutos;i++){

            if(nomeProdutos[i].equalsIgnoreCase(nomeBusca)){

                indice = i;
                break;
            }
        }

        // não encontrou
        if(indice == -1){

            JOptionPane.showMessageDialog(
                    null,
                    "Produto não encontrado."
            );

        }else{

            int quantidadeAtual =
                    qtdeProdutos[indice];

            String entradaStr =
                    JOptionPane.showInputDialog(

                    "Produto: "
                    + nomeProdutos[indice]

                    + "\nQuantidade atual: "
                    + quantidadeAtual

                    + "\n\nQuantidade de entrada:"
            );

            if(entradaStr == null) return;

            int entrada =
                    Integer.parseInt(entradaStr);

            int quantidadeFinal =
                    quantidadeAtual + entrada;

            String confirma =
                    JOptionPane.showInputDialog(

                    "Produto: "
                    + nomeProdutos[indice]

                    + "\nAtual: "
                    + quantidadeAtual

                    + "\nEntrada: "
                    + entrada

                    + "\nFinal: "
                    + quantidadeFinal

                    + "\n\nCONFIRMA? (S/N)"
            );

            if(confirma == null) return;

            if(confirma.equalsIgnoreCase("S")){

    qtdeProdutos[indice] =
            quantidadeFinal;

    double valorEntrada =
            entrada *
            precoProdutos[indice];

    totalEntradasFinanceiras +=
            valorEntrada;

    JOptionPane.showMessageDialog(
            null,

            "Entrada realizada!"

            + "\nValor movimentado: "

            + String.format(
                    "%.2f",
                    valorEntrada
            )
    );
}

        }

        NOVAENTRADA =
                JOptionPane.showInputDialog(
                        "Nova entrada? (S/N)"
                );

        if(NOVAENTRADA == null) return;
    }
}
    public static void SaidaProduto() {

    String NOVASAIDA = "S";

    while (NOVASAIDA.equalsIgnoreCase("S")) {

        String nomeBusca = JOptionPane.showInputDialog(
                "Digite o nome do produto:"
        );

        if (nomeBusca == null) return;

        int indice = -1;

        // procura produto
        for (int i = 0; i < totalProdutos; i++) {

            if (nomeProdutos[i].equalsIgnoreCase(nomeBusca)) {

                indice = i;
                break;
            }
        }

        // produto não encontrado
        if (indice == -1) {

            JOptionPane.showMessageDialog(
                    null,
                    "Produto não encontrado."
            );

        } else {

            int quantidadeAtual =
                    qtdeProdutos[indice];

            String saidaStr =
                    JOptionPane.showInputDialog(

                    "Produto: "
                    + nomeProdutos[indice]

                    + "\nQuantidade atual: "
                    + quantidadeAtual

                    + "\n\nQuantidade de saída:"
            );

            if (saidaStr == null) return;

            int saida =
                    Integer.parseInt(saidaStr);

            // verifica estoque
            if (saida > quantidadeAtual) {

                JOptionPane.showMessageDialog(
                        null,
                        "Estoque insuficiente."
                );

                continue;
            }

            int quantidadeFinal =
                    quantidadeAtual - saida;

            String confirma =
                    JOptionPane.showInputDialog(

                    "Produto: "
                    + nomeProdutos[indice]

                    + "\nAtual: "
                    + quantidadeAtual

                    + "\nSaída: "
                    + saida

                    + "\nFinal: "
                    + quantidadeFinal

                    + "\n\nCONFIRMA SAÍDA? (S/N)"
            );

            if (confirma == null) return;

            if (confirma.equalsIgnoreCase("S")) {

                if (confirma.equalsIgnoreCase("S")) {

                    qtdeProdutos[indice]
                            = quantidadeFinal;

                    double valorSaida
                            = saida
                            * precoProdutos[indice];

                    totalSaidasFinanceiras
                            += valorSaida;

                    JOptionPane.showMessageDialog(
                            null,
                            "Saída realizada!"
                            + "\nValor movimentado: "
                            + String.format(
                                    "%.2f",
                                    valorSaida
                            )
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            null,
                            "Saída cancelada."
                    );
                }
            }
        }

        NOVASAIDA =
                JOptionPane.showInputDialog(
                        "Nova saída? (S/N)"
                );

        if (NOVASAIDA == null) return;
    }
}
    public static void ReajustePrecos() {

    String NOVOREAJUSTE = "S";

    while (NOVOREAJUSTE.equalsIgnoreCase("S")) {

        String tipo = JOptionPane.showInputDialog(

                "REAJUSTE DE PREÇOS\n\n"

                + "1 - REAJUSTE GERAL\n"

                + "2 - UM PRODUTO\n\n"

                + "Escolha:"
        );

        if (tipo == null) return;

        String percentualStr =
                JOptionPane.showInputDialog(

                        "Percentual de reajuste:"
                );

        if (percentualStr == null) return;

        double percentual =
                Double.parseDouble(
                        percentualStr.replace(",", ".")
                );



        // REAJUSTE GERAL
        if (tipo.equals("1")) {

            if (totalProdutos == 0) {

                JOptionPane.showMessageDialog(
                        null,
                        "Nenhum produto cadastrado."
                );

            } else {

                for (int i = 0; i < totalProdutos; i++) {

                    precoProdutos[i] =
                            precoProdutos[i]
                            +
                            (
                            precoProdutos[i]
                            * percentual
                            / 100
                            );
                }

                JOptionPane.showMessageDialog(
                        null,
                        "Reajuste geral aplicado!"
                );
            }
        }



        // REAJUSTE DE UM PRODUTO
        else if (tipo.equals("2")) {

            String nomeBusca =
                    JOptionPane.showInputDialog(
                            "Nome do produto:"
                    );

            if (nomeBusca == null) return;

            int indice = -1;

            for (int i = 0; i < totalProdutos; i++) {

                if (
                        nomeProdutos[i]
                        .equalsIgnoreCase(nomeBusca)
                ) {

                    indice = i;

                    break;
                }
            }

            if (indice == -1) {

                JOptionPane.showMessageDialog(
                        null,
                        "Produto não encontrado."
                );

            } else {

                double precoAntigo =
                        precoProdutos[indice];

                double precoNovo =
                        precoAntigo
                        +
                        (
                        precoAntigo
                        * percentual
                        /100
                        );

                String confirma =
                        JOptionPane.showInputDialog(

                                "Produto: "
                                + nomeProdutos[indice]

                                + "\nPreço atual: "
                                + String.format(
                                        "%.2f",
                                        precoAntigo
                                )

                                + "\nNovo preço: "
                                + String.format(
                                        "%.2f",
                                        precoNovo
                                )

                                + "\n\nCONFIRMA? (S/N)"
                        );

                if (
                        confirma != null
                        &&
                        confirma.equalsIgnoreCase("S")
                ) {

                    precoProdutos[indice] =
                            precoNovo;

                    JOptionPane.showMessageDialog(
                            null,
                            "Reajuste aplicado!"
                    );
                }
            }
        }



        NOVOREAJUSTE =
                JOptionPane.showInputDialog(

                        "Novo reajuste? (S/N)"
                );

        if (NOVOREAJUSTE == null) return;
    }
}
    public static void ExclusaoProduto() {

    String NOVAEXCLUSAO = "S";

    while (NOVAEXCLUSAO.equalsIgnoreCase("S")) {

        String nomeBusca = JOptionPane.showInputDialog(
                "Digite o nome do produto que deseja excluir:"
        );

        if (nomeBusca == null) return;

        int indice = -1;

        // procura o produto
        for (int i = 0; i < totalProdutos; i++) {

            if (nomeProdutos[i].equalsIgnoreCase(nomeBusca)) {

                indice = i;
                break;
            }
        }

        // se não encontrou
        if (indice == -1) {

            JOptionPane.showMessageDialog(
                    null,
                    "Produto não encontrado."
            );

        } else {

            // mostra os dados
            String confirma = JOptionPane.showInputDialog(

                    "PRODUTO ENCONTRADO\n\n"

                    + "Nome: " + nomeProdutos[indice]
                    + "\nPreço: " + String.format("%.2f", precoProdutos[indice])
                    + "\nUnidade: " + unidadeProdutos[indice]
                    + "\nQuantidade: " + qtdeProdutos[indice]

                    + "\n\nCONFIRMA EXCLUSÃO? (S/N)"
            );

            if (confirma == null) return;

            if (confirma.equalsIgnoreCase("S")) {

                // move os vetores
                for (int i = indice; i < totalProdutos - 1; i++) {

                    nomeProdutos[i] = nomeProdutos[i + 1];
                    precoProdutos[i] = precoProdutos[i + 1];
                    unidadeProdutos[i] = unidadeProdutos[i + 1];
                    qtdeProdutos[i] = qtdeProdutos[i + 1];
                }

                // limpa última posição
                nomeProdutos[totalProdutos - 1] = null;
                precoProdutos[totalProdutos - 1] = 0;
                unidadeProdutos[totalProdutos - 1] = null;
                qtdeProdutos[totalProdutos - 1] = 0;

                // reduz total
                totalProdutos--;

                JOptionPane.showMessageDialog(
                        null,
                        "PRODUTO EXCLUÍDO COM SUCESSO!"
                );

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "EXCLUSÃO CANCELADA."
                );
            }
        }

        NOVAEXCLUSAO = JOptionPane.showInputDialog(
                "NOVA EXCLUSÃO? (S/N)"
        );

        if (NOVAEXCLUSAO == null) return;
    }
}
    public static void RelatorioBalanco() {

    int TOTALITENS = 0;

    double VALORTOTAL = 0;

    String LISTA =
            "<html><div style='text-align:left;'>"

            + "XYZ COMERCIO DE PRODUTOS LTDA<br>"
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

            + "<td><b>TOTAL</b></td>"

            + "</tr>";



    // percorre produtos cadastrados
    for(int i=0; i<totalProdutos; i++){

        int quantidade =
                qtdeProdutos[i];

        double preco =
                precoProdutos[i];

        double valorProduto =
                quantidade * preco;


        TOTALITENS += quantidade;

        VALORTOTAL += valorProduto;


        LISTA +=

                "<tr>"

                + "<td>" + nomeProdutos[i] + "</td>"

                + "<td>&nbsp;&nbsp;</td>"

                + "<td>" + unidadeProdutos[i] + "</td>"

                + "<td>&nbsp;&nbsp;</td>"

                + "<td>"
                + String.format("%.2f",preco)
                + "</td>"

                + "<td>&nbsp;&nbsp;</td>"

                + "<td>"
                + quantidade
                + "</td>"

                + "<td>&nbsp;&nbsp;</td>"

                + "<td>"
                + String.format("%.2f",valorProduto)
                + "</td>"

                + "</tr>";
    }


    // caso não existam produtos
    if(totalProdutos == 0){

        LISTA +=

                "<tr>"

                + "<td colspan='9'>"

                + "NENHUM PRODUTO CADASTRADO."

                + "</td>"

                + "</tr>";
    }


    LISTA +=

            "</table><br>"

            + "TOTAL DE ITENS: "

            + TOTALITENS

            + "<br>"

            + "VALOR TOTAL ESTOQUE: "

            + String.format("%.2f",VALORTOTAL)

            + "<br><br>"

            + "Digite 0 para retornar."

            + "</div></html>";



    String retorno =
            JOptionPane.showInputDialog(LISTA);

    while(retorno != null && !retorno.equals("0")){

        retorno =
                JOptionPane.showInputDialog(LISTA);
    }

}
    public static void RelatorioListaPrecos() { //sub-rotina responsável pela tela de lista de preços.
        String LISTA = "<html><div style='text-align: left;'>" //inicia a montagem da lista em html.
                + "XYZ COMERCIO DE PRODUTOS LTDA<br>"
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
        if (totalProdutos == 0) { //verifica se não há produtos cadastrados para exibir mensagem adequada.
            LISTA += "<tr><td colspan='5'>NENHUM PRODUTO CADASTRADO.</td></tr>";
        } else {
            for (int i = 0; i < totalProdutos; i++) { //percorre os vetores de produtos cadastrados montando as linhas da lista.
                LISTA += "<tr>"
                    + "<td>" + nomeProdutos[i] + "</td>"
                    + "<td>&nbsp;&nbsp;</td>"
                    + "<td>" + unidadeProdutos[i] + "</td>"
                    + "<td>&nbsp;&nbsp;</td>"
                    + "<td>" + String.format("%.2f", precoProdutos[i]) + "</td>"
                    + "</tr>";
            }
        }
        LISTA += "</table><br>" //finaliza a tabela e adiciona instrução para retornar.
                + "Digite 0 para retornar."
                + "</div></html>";
        String RETORNO = JOptionPane.showInputDialog(LISTA); //exibe a lista e aguarda o input do usuário para retornar.
        while (RETORNO != null && !RETORNO.equals("0")) { //enquanto o input não for 0 e não for nulo (Cancelar), exibe a lista novamente.
            RETORNO = JOptionPane.showInputDialog(LISTA);
        } //caso o input seja "0" ou o usuário clique em Cancelar, o loop encerra e retorna para a tela 1.4.
    }
    public static void ConsultaProduto() {

        String nomeBusca = JOptionPane.showInputDialog(
                "Digite o nome do produto:"
        );

        if (nomeBusca == null) {
            return;
        }

        boolean encontrado = false;

        for (int i = 0; i < totalProdutos; i++) {
            if (nomeProdutos[i].equalsIgnoreCase(nomeBusca)) {
                JOptionPane.showMessageDialog(
                        null,
                        "PRODUTO ENCONTRADO\n\n"
                        
                        + "Nome: " + nomeProdutos[i]
                        + "\nPreço: " + String.format("%.2f", precoProdutos[i])
                        + "\nUnidade: " + unidadeProdutos[i]
                        + "\nQuantidade: " + qtdeProdutos[i]
                );

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(
                    null,
                    "Produto não encontrado."
            );
        }
    }
    public static int MenuRelatorios() { //sub-rotina responsável pelo menu de relatórios (tela 1.4).
        int MENUREL = -1; //atribui -1 para que o loop inicie e permita retorno correto ao menu principal.
        while (MENUREL != 0) { //enquanto o input não for 0, o loop mantém a tela de relatórios.
            String INPUT = JOptionPane.showInputDialog(
                "<html><div style='text-align: center;'>"
                + "XYZ COMERCIO DE PRODUTOS LTDA<br>"
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
