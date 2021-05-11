package day4_homework3.concrete;

import day4_homework3.abstracts.GamerService;
import day4_homework3.entities.Gamer;

public class GamerManager implements GamerService {
    @Override
    public void add(Gamer gamer) {
        System.out.println("Oyuncu " + gamer.getUserName() + " kullanıcı adı ile sisteme kayıt oldu.");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Şifreniz güncellenmiştir " + gamer.getPassword());
        System.out.println("Güncellenen bilgiler mailinize gönderilmiştir. " + gamer.geteMail());
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getUserName() + " isimli hesap silinmiştir.");
    }
}
