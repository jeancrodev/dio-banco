package Modelos;
import java.util.Scanner;

public class Funcionario{

    Scanner teclado = new Scanner(System.in);

    private String nome = null;
    private String cpf = null;
    private String dataNascimento = null;
    private String telefone = null;
    private String endereco = null;
    private String dataAdmissao = null;
    private String funcao = null;
    private double salario = 0;

    public String getCpf() {
        return cpf;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getFuncao() {
        return funcao;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public String getTelefone() {
        return telefone;
    }

    public Funcionario(){
        System.out.println("Insira o nome:");
        this.nome = teclado.nextLine();
        System.out.println("Insira o cpf:");
        this.cpf = teclado.nextLine();
        System.out.println("Insira a data de nascimento dd/mm/aaaa:");
        this.dataNascimento = teclado.nextLine();
        System.out.println("Insira o telefone:");
        this.telefone = teclado.nextLine();
        System.out.println("Insira o endereco:");
        this.endereco = teclado.nextLine();
        System.out.println("Insira a data de admissão:");
        this.dataAdmissao = teclado.nextLine();
        System.out.println("Insira a funçao:");
        this.funcao = teclado.nextLine();
        System.out.println("Insira o salario R$:");
        this.salario = teclado.nextDouble();
    }


}
