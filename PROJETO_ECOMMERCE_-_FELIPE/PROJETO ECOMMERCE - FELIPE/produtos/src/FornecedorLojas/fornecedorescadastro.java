package FornecedorLojas;

import Cliente.Cliente;
import FornecedorLojas.fornecedores;

public class fornecedorescadastro {
    private fornecedores fornecedores;
    public static void main(String[] args) {

        //Fornecedor -> 1 - Turbo & Cia
        fornecedores turbocia = new fornecedores();
        turbocia.idForcedores = 1;
        turbocia.nome = ("José Guarcia");
        turbocia.nomeEmpresa = ("Turbo & Cia");
        turbocia.cnpj = ("75.143.693/0001-70");
        turbocia.endereco = ("Rua Industrial");
        turbocia.material = ("Turbos");

        System.out.println("Id Fornecedor: " + turbocia.idForcedores);
        System.out.println("Nome do Forcedor: " + turbocia.nome );
        System.out.println("Nome da Empresa: " + turbocia.nomeEmpresa);
        System.out.println("Cnpj da Empresa: " + turbocia.cnpj);
        System.out.println("Endereco: " + turbocia.endereco);
        System.out.println("Material: " + turbocia.material);



        //Fornecedor -> 2 - Pneu & Cia
        fornecedores pneucia = new fornecedores();
        pneucia.idForcedores = 2;
        pneucia.nome = ("Joao Pedro");
        pneucia.nomeEmpresa = ("Pneu & Cia");
        pneucia.cnpj = ("40.330.693/0001-70");
        pneucia.endereco = ("Rua das Americas");
        pneucia.material = ("Pneus");

        System.out.println("---------------------------------------");

        System.out.println("Id Fornecedor: " + pneucia.idForcedores);
        System.out.println("Nome do Forcedor: " + pneucia.nome );
        System.out.println("Nome da Empresa: " + pneucia.nomeEmpresa);
        System.out.println("Cnpj da Empresa: " + pneucia.cnpj);
        System.out.println("Endereco: " + pneucia.endereco);
        System.out.println("Material: " + pneucia.material);


        //Fornecedor -> 3 - Oleo & Cia
        fornecedores oleocia = new fornecedores();
        oleocia.idForcedores = 3;
        oleocia.nome = ("Anderson Gomes");
        oleocia.nomeEmpresa = ("Oleo & Cia");
        oleocia.cnpj = ("25.130.093/0001-70");
        oleocia.endereco = ("Rua das Nacoes");
        oleocia.material = ("Oleos");

        System.out.println("---------------------------------------");

        System.out.println("Id Fornecedor: " + oleocia.idForcedores);
        System.out.println("Nome do Forcedor: " + oleocia.nome );
        System.out.println("Nome da Empresa: " + oleocia.nomeEmpresa);
        System.out.println("Cnpj da Empresa: " + oleocia.cnpj);
        System.out.println("Endereco: " + oleocia.endereco);
        System.out.println("Material: " + oleocia.material);

        System.out.println("---------------------------------------");

        //Fornecedor -> 4 - Suspencoes
        fornecedores suspencoes = new fornecedores();
        suspencoes.idForcedores = 4;
        suspencoes.nome = ("Marcos Souza");
        suspencoes.nomeEmpresa = ("Suspensoes LowCar");
        suspencoes.cnpj = ("13.450.093/0001-70");
        suspencoes.endereco = ("Rua das Unidas");
        suspencoes.material = ("Suspencoes a Ar");

        System.out.println("Id Fornecedor: " + suspencoes.idForcedores);
        System.out.println("Nome do Forcedor: " + suspencoes.nome );
        System.out.println("Nome da Empresa: " + suspencoes.nomeEmpresa);
        System.out.println("Cnpj da Empresa: " + suspencoes.cnpj);
        System.out.println("Endereco: " + suspencoes.endereco);
        System.out.println("Material: " + suspencoes.material);

    }
}
