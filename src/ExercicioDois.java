import java.util.LinkedHashSet;
import java.util.Set;

public class ExercicioDois {

    public static void main(String[] args) {
        String texto = "Hello, World!";
        int textoNumero = texto.length();

        Set<Character> textoConvertido = new LinkedHashSet<>();

        for (int i = 0; i < textoNumero; i++ ){

            char correspondente = texto.charAt(i);

            textoConvertido.add(correspondente);

            StringBuilder sb = new StringBuilder();
            for (char adicionandoLetras : textoConvertido) {
                sb.append(adicionandoLetras);
            }

            String textoUnico = sb.toString();
            System.out.println(textoUnico);

        }





    }
}
