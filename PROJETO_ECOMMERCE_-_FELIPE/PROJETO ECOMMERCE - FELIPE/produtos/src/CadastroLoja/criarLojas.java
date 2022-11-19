package CadastroLoja;

public class criarLojas {
    private cadastroLoja cadastroLoja;
    public static  void main(String[] args){


        cadastroLoja primeiraLoja = new cadastroLoja();/*criou objeto => cadastro de loja => recebe primeira loja
      primeira loja recebe valores */

        //1 -> Loja
        primeiraLoja.id = 1;
        primeiraLoja.loja = ("TESLA");
        primeiraLoja.cnpjEmpresa = ("25.296.226/0001-02");
        primeiraLoja.categoriaEmpresa = ("Veiculos/Carros");
        primeiraLoja.modeloVeiculos = ("Model-S");
        primeiraLoja.valoresVeiculos = 950000;
        primeiraLoja.qtd = 45;

        // -> Lendo 1 loja
        System.out.println("Loja: " + primeiraLoja.id);
        System.out.println("Marca do Veiculo: " + primeiraLoja.loja);
        System.out.println("Cpnj da Empresa: " + primeiraLoja.cnpjEmpresa);
        System.out.println("Categoria de Venda: " + primeiraLoja.categoriaEmpresa);
        System.out.println("Modelo do Veiculo: " + primeiraLoja.modeloVeiculos);
        System.out.println("Valor do Veiculo: " + primeiraLoja.valoresVeiculos);
        System.out.println("Quatidade Disponivel: " + primeiraLoja.qtd);
//--------------------------------------------------------------

        cadastroLoja segundaLoja = new cadastroLoja();/*criou objeto => cadastro de loja => recebe primeira loja
      segunda loja recebe valores */

        //2 -> Loja

        segundaLoja.id = 2;
        segundaLoja.loja = ("BMW");
        segundaLoja.cnpjEmpresa = ("54.369.230/0001-51");
        segundaLoja.categoriaEmpresa = ("Veiculos/Carros");
        segundaLoja.modeloVeiculos  = ("BmwX5");
        segundaLoja.valoresVeiculos = 700000;
        segundaLoja.qtd = 50;

        System.out.println("---------------------------------------");

        // -> Lendo 2 loja
        System.out.println("Loja: " + segundaLoja.id);
        System.out.println("Marca do Veiculo: " + segundaLoja.loja);
        System.out.println("Cpnj da Empresa: " + segundaLoja.cnpjEmpresa);
        System.out.println("Categoria de Venda: " + segundaLoja.categoriaEmpresa);
        System.out.println("Modelo do Veiculo: " + segundaLoja.modeloVeiculos);
        System.out.println("Valor do Veiculo: " + segundaLoja.valoresVeiculos);
        System.out.println("Quatidade Disponivel: " +segundaLoja.qtd);

        System.out.println("---------------------------------------");

        //3 -> Loja
        cadastroLoja terceiraLoja = new cadastroLoja();/*criou objeto => cadastro de loja => recebe primeira loja
        segunda loja recebe valores */
        terceiraLoja.id = 3;
        terceiraLoja.loja = ("PORSCHE");
        terceiraLoja.cnpjEmpresa = ("60.369.230/0001-59");
        terceiraLoja.categoriaEmpresa = ("Veiculos/Carros");
        terceiraLoja.modeloVeiculos = ("Porsche Taycan");
        terceiraLoja.valoresVeiculos = 500000;
        terceiraLoja.qtd = 35;

        // -> Lendo 3 loja
        System.out.println("Loja: " + terceiraLoja.id);
        System.out.println("Marca do Veiculo: " + terceiraLoja.loja);
        System.out.println("Cpnj da Empresa: " + terceiraLoja.cnpjEmpresa);
        System.out.println("Categoria de Venda: " + terceiraLoja.categoriaEmpresa);
        System.out.println("Modelo do Veiculo: " + terceiraLoja.modeloVeiculos);
        System.out.println("Valor do Veiculo: " + terceiraLoja.valoresVeiculos);
        System.out.println("Quatidade Disponivel: " +terceiraLoja.qtd);

        System.out.println("---------------------------------------");

        //4 -> Loja
        cadastroLoja quartaLoja = new cadastroLoja();/*criou objeto => cadastro de loja => recebe primeira loja
        segunda loja recebe valores */
        quartaLoja.id = 4;
        quartaLoja.loja = ("AUDI");
        quartaLoja.cnpjEmpresa = ("46.129.230/0001-28");
        quartaLoja.categoriaEmpresa = ("Veiculos/Carros");
        quartaLoja.modeloVeiculos = ("Audi Q3");
        quartaLoja.valoresVeiculos = 700000;
        quartaLoja.qtd = 30;


        // -> Lendo 4 loja
        System.out.println("Loja: " + quartaLoja.id);
        System.out.println("Marca do Veiculo: " + quartaLoja.loja);
        System.out.println("Cpnj da Empresa: " + quartaLoja.cnpjEmpresa);
        System.out.println("Categoria de Venda: " + quartaLoja.categoriaEmpresa);
        System.out.println("Modelo do Veiculo: " + quartaLoja.modeloVeiculos);
        System.out.println("Valor do Veiculo: " + quartaLoja.valoresVeiculos);
        System.out.println("Quatidade Disponivel: " +quartaLoja.qtd);

        System.out.println("---------------------------------------");


        /*validando se a conta primeira é = a segunda conta
        if(primeiraLoja == segundaLoja){
            System.out.println("mesmas conta");
        }else{
            System.out.println("As duas lojas sao marcas deferentes!!!!");
        }*/

    }

}
