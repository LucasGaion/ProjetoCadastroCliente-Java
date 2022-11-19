package FornecedorLojas;

public class fornecedores {
    public int idForcedores;
    public String nome;
    public String nomeEmpresa;
    public String cnpj;
    public String endereco;
    public String material;

    //método contrutor
    public void fornecedores(int idForcedores, String nome, String nomeEmpresa, String cnpj, String endereco, String material){
        this.idForcedores = idForcedores;
        this.nome = nome;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.material = material;
    }

}
