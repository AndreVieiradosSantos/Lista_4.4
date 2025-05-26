import SpeedFast.CarroEconomico;
import SpeedFast.CarroPremium;
import SpeedFast.CarroSuv;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner opcao = new Scanner(System.in);
        do {
            System.out.println("===============Aluguel===============");
            System.out.println(" 1 - Carro econômico");
            System.out.println(" 2 - Carro SUV");
            System.out.println(" 3 - Carro prêmium");
            System.out.println(" 4 - Sair do programa");

            escolha = opcao.nextInt();

            switch (escolha) {
                case 1:
                    CarroEconomico carroEconomico = new CarroEconomico("","",
                            "","",0,0,"","","",
                            0);
                    carroEconomico.cadastroAluguel();
                    carroEconomico.exibirAluguel();
                    break;
                case 2:
                    CarroSuv carroSuv = new CarroSuv("","","","",
                            0,0,"","","","",
                            "");
                    carroSuv.cadastroAluguel();
                    carroSuv.exibirAluguel();

                    break;
                case 3:
                    CarroPremium carroPremium = new CarroPremium("","","",
                            "",0,0,"","","",
                            "","","","");
                    carroPremium.cadastroAluguel();
                    carroPremium.exibirAluguel();

                    break;
                default:
                    System.out.println("Saindo do programa...");
                    opcao.close();
                    break;
            }

        }while (escolha>0 && escolha<4);
    }
}