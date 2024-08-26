package br.edu.umfg.dip;

import br.edu.umfg.dip.legado.UserService;
import br.edu.umfg.dip.refatorado.IMailService;
import br.edu.umfg.dip.refatorado.MailServiceRefatorado;
import br.edu.umfg.dip.refatorado.UserServiceRefatorado;

public class PrincipioDeInversaoDeDependencia {
    public static void executarLegado(){
        UserService userService = new UserService();
        userService.registrarUsuario("teste@gmail.com");
    }

    public static void executarRefatorado(){
        IMailService mailService = new MailServiceRefatorado();
        UserServiceRefatorado userService = new UserServiceRefatorado(mailService);

        userService.registrar("teste1@gmail.com");
    }
}
