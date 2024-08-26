package br.edu.umfg.dip.refatorado;

public interface IMailService {
    void enviarEmail(String remetente, String destinatario, String message);
}
