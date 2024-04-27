package APPS;

import java.util.Scanner;
import Modelos.Contas;
import Modelos.ContaCorrente;
import Modelos.ContaPoupanca;
import Modelos.Funcionario;
import java.util.ArrayList;


public class App {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList clientes = new ArrayList();
        ArrayList contaPoupanca = new ArrayList();
        ArrayList contaCorrente = new ArrayList();
        ArrayList funcionarios = new ArrayList();
        String localizar;

        while(true){
        System.out.println("Insira 1 cadastrar funcionario");
        System.out.println("Insira 2 cadastrar conta corrente");
        System.out.println("Insira 3 cadastrar conta poupanca");
        System.out.println("Insira 4 acessar conta");
        System.out.println("Insira 5 listar clientes");
        System.out.println("Insira 6 fechar programa");
        int opcao = teclado.nextInt();
        if(opcao == 1){
            Funcionario funcionario = new Funcionario();
            funcionarios.add(funcionario);
        }else if(opcao == 2){
            Contas cliente = new ContaCorrente();
            contaCorrente.add(cliente);
            clientes.add(cliente);
        }else if(opcao == 3){
            ContaPoupanca cliente = new ContaPoupanca();
            contaPoupanca.add(cliente);
            clientes.add(cliente);
        }else if(opcao == 4){
            System.out.println("Insira o cpf da conta:");
            localizar = teclado.next();
            for	(int i = 0;	i < clientes.size(); i++) {
                ContaCorrente cc = (ContaCorrente) clientes.get(i);
                if (cc.getCpf().equals(localizar)){
                    System.out.println(cc.getNome() + "selecionado");
                    System.out.println("1 Depositar");
                    System.out.println("2 Sacar");
                    System.out.println("3 Transferir");
                    System.out.println("4 Menu Anterior");
                    opcao = teclado.nextInt();
                    if(opcao==1){
                        cc.depositar();
                    }else if(opcao==2){
                        cc.sacar();
                    }else if(opcao ==3){
                        System.out.println("Insira o cpf da conta destino:");
                        localizar = teclado.next();
                        for	(int x = 0;	x < clientes.size(); x++) {
                            ContaCorrente cd = (ContaCorrente) clientes.get(x);
                            if (cd.getCpf().equals(localizar)){
                                cd.transferirDestino(cc.transferirOrigem(0));
                            }}
                    }else if (opcao==4){
                        break;
                    }
                }else if(!cc.getCpf().equals(localizar)){
                    System.out.println("Cliente não localizado");}
            }
        }else if(opcao == 5){
            for	(int var = 0;	var < clientes.size(); var++) {
                ContaCorrente contas = (ContaCorrente) clientes.get(var);
                System.out.print(contas.getNome() + " R$");
                System.out.println(contas.getSaldo());
            }
        }if(opcao == 6){
            break;
            }
        }
    }
}