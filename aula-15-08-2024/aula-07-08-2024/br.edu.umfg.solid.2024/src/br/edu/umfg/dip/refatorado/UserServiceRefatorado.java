package br.edu.umfg.dip.refatorado;

import br.edu.umfg.dip.legado.MailService;

public class UserServiceRefatorado {
    private IMailService mailService;
    private final String DEFAULT_EMAIl = "minhaoutraempresa@gmail.com";

    public UserServiceRefatorado(IMailService mailService){
        this.mailService = mailService;
    }

    public void registrar(String email){
       String mensagem = "Bem vindo, você foi registrado.";
       this.mailService.enviarEmail(DEFAULT_EMAIl, email, mensagem);
    }
}
