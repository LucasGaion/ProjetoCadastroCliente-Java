package CadastroLoja;
//package -> cadastrar classe

public class cadastroLoja {// classe tipo -> cadastro da loja
    public String loja;
    public int id;
    public String cnpjEmpresa;
    public String categoriaEmpresa;
    public String modeloVeiculos;
    public int valoresVeiculos;
    public int qtd;
    public int saldoTesla;

    public int saldoBmw;
    public int saldoPorshe;
    public int saldoAudi;
    //Cliente.Cliente titular;

    //método contrutor
    public void cadastroLoja(String loja, int id, String cnpjEmpresa, String categoriaEmpresa, String modeloVeiculos, int valoresVeiculos,
        int qtd, int saldoTesla, int saldoBmw, int saldoPorshe, int saldoAudi){

        this.loja = loja;
        this.id = id;
        this.cnpjEmpresa = cnpjEmpresa;
        this.categoriaEmpresa = categoriaEmpresa;
        this.modeloVeiculos = modeloVeiculos;
        this.valoresVeiculos = valoresVeiculos;
        this.qtd = qtd;
        this.saldoTesla = saldoTesla;
        this.saldoBmw = saldoBmw;
        this.saldoPorshe = saldoPorshe;
        this.saldoAudi = saldoAudi;
    }

}

