package SpeedFast;

public class CarroPremium extends Cliente{
    private int portas;
    private String cor;
    private String modelo;
    private String marca;
    private String automatico;
    private String eletrico;
    private String airbag;
    private String seguro;

    public CarroPremium(String nomeCliente, String cpf, String rg, String endereco,
                        double valorAluguel, int portas, String cor, String modelo,
                        String marca, String automatico, String eletrico,
                        String airbag, String seguro) {
        super(nomeCliente, cpf, rg, endereco, valorAluguel);
        this.portas = portas;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.automatico = automatico;
        this.eletrico = eletrico;
        this.airbag = airbag;
        this.seguro = seguro;
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

    public String getAutomatico() {
        return automatico;
    }

    public void setAutomatico(String automatico) {
        this.automatico = automatico;
    }

    public String getEletrico() {
        return eletrico;
    }

    public void setEletrico(String eletrico) {
        this.eletrico = eletrico;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

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
        System.out.println("Automático:");
        automatico = cliente.nextLine();
        System.out.println("Elétrico:");
        eletrico = cliente.nextLine();
        System.out.println("Airbag:");
        airbag = cliente.nextLine();
        System.out.println("Seguro:");
        seguro = cliente.nextLine();
    }

    @Override
    public void exibirAluguel() {
        super.exibirAluguel();
        System.out.println("Portas:"+portas);
        System.out.println("Cor:"+cor);
        System.out.println("Modelo:"+modelo);
        System.out.println("Marca:"+marca);
        System.out.println("Automático:"+automatico);
        System.out.println("Elétrico:"+eletrico);
        System.out.println("Airbag:"+airbag);
        System.out.println("Seguro:"+seguro);
    }
}
