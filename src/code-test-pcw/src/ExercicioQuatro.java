import org.apache.commons.lang3.StringUtils;

public class ExercicioQuatro {
    public static void main(String[] args) {
        String frase = "hello. how are you? i'm fine, thank you.";

        String[] fraseSeparada = frase.split("[.?]");

        int tamanhoArray = fraseSeparada.length;

        for (int i = 0; i < tamanhoArray; i++) {

            String palavra = StringUtils.capitalize(fraseSeparada[i].trim());

            if (!fraseSeparada[i].equals(palavra)) {

                frase = frase.replace(fraseSeparada[i], palavra);
            }
        }

        System.out.println(frase);
    }
}
