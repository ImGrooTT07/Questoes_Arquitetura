public class ValidadorSenha extends Senha {
    
    public static void main(String[] args) {
        String senha = "V1n1c1nDoPneu";

        if (validarSenha(senha)) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida.");
        }
    }
}