package SpeedFast;

import java.util.Scanner;

public abstract class Cliente {
    private String nomeCliente;
    private String cpf;
    private String rg;
    private String endereco;
    private double valorAluguel;

    public Cliente(String nomeCliente, String cpf, String rg,
                   String endereco, double valorAluguel) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    Scanner cliente = new Scanner(System.in);
    public void cadastroAluguel(){
        System.out.println("Nome do cliente:");
        nomeCliente = cliente.nextLine();
        System.out.println("Cpf:");
        cpf = cliente.nextLine();
        System.out.println("Rg:");
        rg = cliente.nextLine();
        System.out.println("Endereço:");
        endereco = cliente.nextLine();
        System.out.println("Valor do aluguel:");
        valorAluguel = cliente.nextDouble();
        cliente.nextLine();
    }
    public void exibirAluguel(){
        System.out.println("Nome do cliente:"+nomeCliente);
        System.out.println("Cpf:"+cpf);
        System.out.println("Rg:"+rg);
        System.out.println("Endereço:"+endereco);
        System.out.println("Valor do aluguel:"+valorAluguel);
    }
}
