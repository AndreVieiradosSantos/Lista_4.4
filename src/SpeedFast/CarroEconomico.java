package SpeedFast;

import java.util.Scanner;

public class CarroEconomico extends Cliente{
    private int portas;
    private String cor;
    private String modelo;
    private String marca;
    private double caucao;

    public CarroEconomico(String nomeCliente, String cpf, String rg, String endereco, double valorAluguel,
                          int portas, String cor, String modelo, String marca, double caucao) {
        super(nomeCliente, cpf, rg, endereco, valorAluguel);
        this.portas = portas;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.caucao = caucao;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCalcao() {
        return caucao;
    }

    public void setCalcao(double calcao) {
        this.caucao = calcao;
    }
    Scanner cliente = new Scanner(System.in);

    @Override
    public void cadastroAluguel() {
        super.cadastroAluguel();
        System.out.println("Portas:");
        portas = cliente.nextInt();
        cliente.nextLine();
        System.out.println("Cor:");
        cor = cliente.nextLine();
        System.out.println("Modelo:");
        modelo = cliente.nextLine();
        System.out.println("Marca:");
        marca = cliente.nextLine();
        System.out.println("Caução:");
        caucao = cliente.nextDouble();
        cliente.nextLine();
    }

    @Override
    public void exibirAluguel() {
        super.exibirAluguel();
        System.out.println("Portas:"+portas);
        System.out.println("Cor:"+cor);
        System.out.println("Modelo:"+modelo);
        System.out.println("Marca:"+marca);
        System.out.println("Caução:"+caucao);

    }
}
