package Exercicio8Ativ3;


public class ValidadorSenha {

    public void validarSenha(String senha) throws SenhaInvalidaException {

        if (senha == null || senha.length() < 8) {
            throw new SenhaInvalidaException(
                    "Senha inválida! A senha deve ter pelo menos 8 caracteres.");
        }

        System.out.println("Senha válida!");
    }
}
