package Cliente;

import java.util.Objects;

public class Cliente { //classe -> Cliente
    public String nome;
    public String cpf;
    public String endereco;
    public String profissao;
    public int idCliente;
    public int saldoCliente;

    //método contrutor
    public void Cliente(String nome, String cpf, String endereco, String profissao, int idCliente, int saldoCliente){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.profissao = profissao;
        this.idCliente = idCliente;
        this.saldoCliente = saldoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getSaldoCliente() {
        return saldoCliente;
    }
    public void setSaldoCliente(int saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int hashCode() {
        return Objects.hash(idCliente, saldoCliente, nome, cpf, endereco, profissao);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        return Objects.equals(nome, other.nome) && idCliente == other.idCliente && Objects.equals(cpf, other.cpf) && Objects.equals(endereco, other.endereco) && Objects.equals(profissao, other.profissao) && saldoCliente == other.saldoCliente ;
    }

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", saldoCliente=" + saldoCliente + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", profissao=" + profissao + "]";
    }


}
