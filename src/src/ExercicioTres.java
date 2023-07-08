class ExercicioTres {
    public static String maiorPalindromo(String s) {
        int comeco = 0;
        int fim = 0;
        for (int i = 0; i < s.length(); i++) {
            int imparChar = expand(s, i, i);
            int parChar = expand(s, i, i + 1);

            int tamanhoMaiorPalindromo = Math.max(imparChar, parChar);

            if (tamanhoMaiorPalindromo > fim - comeco) {
                comeco = i - (tamanhoMaiorPalindromo - 1) / 2;
                fim = i + tamanhoMaiorPalindromo / 2;

            }
        }
        return s.substring(comeco, fim + 1);
    }

    static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "ababad";
        System.out.println("O maior palindromo da frase passada é: " + maiorPalindromo(s));

    }
}