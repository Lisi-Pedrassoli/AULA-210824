package br.edu.umfg.dip.legado;

public class UserService {
    private final String DEFAULT_EMAIl = "minha.empresa@gmail.com";
    private MailService mailService;

    public UserService() {
        this.mailService = new MailService();
    }

    public void registrarUsuario(String email){
        String mensagem = "Bem vindo, você foi registrado.";
        this.mailService.sendMail(DEFAULT_EMAIl, email, mensagem);
    }
}
