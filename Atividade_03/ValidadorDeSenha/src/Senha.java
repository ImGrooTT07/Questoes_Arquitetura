public class Senha {
    
    public static boolean validarSenha(String senha) {
        return MinimoCaracteres(senha)
            && temNumero(senha)
            && temMaiuscula(senha);
    }

    private static boolean MinimoCaracteres(String s) {
        return s.length() >= 8;
    }

    private static boolean temNumero(String s) {
        return s.matches(".*\\d.*");
    }

    private static boolean temMaiuscula(String s) {
        return s.matches(".*[A-Z].*");
    }
}
