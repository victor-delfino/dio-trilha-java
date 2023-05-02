package victor.primeirasemana;

public class Usuario {
    public static void main(String[] args) {

        SistemaSmartTV smartTV = new SistemaSmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        smartTV.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTV.canal);

        System.out.println("Volume Atual : " + smartTV.volume);

        System.out.println("TV Ligada ? " + smartTV.ligada);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);
    }
}
