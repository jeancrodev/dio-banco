package Modelos;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String telefone;
    private String endereco;
   
    Scanner teclado = new Scanner(System.in);
    
    public Pessoa(){
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
    }

    public String getCpf() {
        return cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }

}
