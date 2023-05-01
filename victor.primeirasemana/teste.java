package victor.primeirasemana;

public class teste {

    public static void main(String[] args) {
        String primeiroNome = "Victor";
        String segundoNome = "Hugo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
