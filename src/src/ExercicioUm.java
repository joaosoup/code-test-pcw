public class ExercicioUm {
    public static void main(String[] args) {
        String original = "Hello, World! OpenAi is amazing.";

        //Separar palavras da string pelo espaço.
        String[] palavras = original.split(" ");
        int tamanho = palavras.length;
        System.out.println(tamanho);

        // imprime as palavras da Array em ordem inversa junto com um espaço, para retornar o Output pedido.
        for (int i = tamanho - 1; i >= 0; i--) System.out.print(palavras[i] + " ");

        }
    }