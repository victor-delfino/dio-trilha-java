package victor.primeirasemana;

public class Piloto {
    public static void main(String[] args) {
        Carro motorista = new Carro();

        motorista.acelerar();
        motorista.acelerar();
        motorista.desacelerar();
        motorista.acelerar();

        motorista.mudarVelocidade(100);

        System.out.println("A velocidade atual é de: " + motorista.velocidade);
        System.out.println("O modelo do carro é ferrari? " + motorista.ferrari);
        System.out.println("O ano de fabricação é: " + motorista.ano);
    }
}
