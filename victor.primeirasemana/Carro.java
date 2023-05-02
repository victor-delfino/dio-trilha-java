package victor.primeirasemana;

public class Carro {
    Boolean ferrari = true;
    int velocidade = 60;

    int ano = 2020;

    public void modelo(){
        ferrari=true;
    }
    public void mudarVelocidade(int alterarvel){
        velocidade = alterarvel;
    }
    public void acelerar(){
        velocidade++;
        System.out.println("A velocidade está aumentando para: " + velocidade);
    }
    public void desacelerar(){
        velocidade--;
        System.out.println("A velocidade está diminuindo para: " + velocidade);
    }
}
