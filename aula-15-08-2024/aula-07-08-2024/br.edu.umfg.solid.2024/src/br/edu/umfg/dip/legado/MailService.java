package br.edu.umfg.dip.legado;

public class MailService {
    public void sendMail(String remet, String dest, String message){
        System.out.println("De: " + remet +
                "\nPara: " + dest +
                "\n\n" + message);
    }
}
