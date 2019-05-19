package banker;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * Bank sınıfı tüm hesaplarının nesnelerini tutar.
 */
public class Bank {

    ArrayList<Account> hesaplar = new ArrayList<Account>();
    ArrayList<String> islemGecmisi = new ArrayList<String>();

    private int ID, cash;

    /**
     * Mevcut hesapların listesini verir.
     *
     * @return
     */
    public ArrayList<Account> getAccount() {
        return hesaplar;
    }

    /**
     * Sistemin şu anki tarihini verir.
     *
     * @return
     */
    public LocalDate getDate() {
        LocalDate tarih = LocalDate.now();
        return tarih;
    }

    /**
     * Belli edilen hesaba cash kadar para yatırır.
     *
     * @param ID hesap numarası
     * @param cash hasaba yatırılacak para miktarı
     */
    public void deposit(int ID, int cash) {
        hesaplar.get(ID - 1).deposit(cash);
        IslemKaydet(ID, "+", cash);
    }

    /**
     * Mümkün ise belli edilen hesaptan belirli miktarda para çeker. İşlemin
     * yapılıp yapılamadığını ekranda gösterir.
     *
     * @param ID hesap numarası
     * @param cash hesaptan çekilecek para miktarı
     */
    public void Withdraw(int ID, int cash) {
        hesaplar.get(ID - 1).withdraw(cash);
        IslemKaydet(ID, "-", cash);
    }

    /**
     * Yapılan işlemleri islemGecmisi listesine ekler
     * 
     * @param ID hesap numarası
     * @param cash çekilen ya da yatırılan para miktarı
     * @param tip yapılan işlem tipi
     */
    public void IslemKaydet(int ID, String tip, int cash) {
        islemGecmisi.add("" + ID + " hesabı " + tip + cash);
        if (islemGecmisi.size() > 5) {
            islemGecmisi.remove(0);
        }
    }
    
    public ArrayList<String> SonIslemler() {
        return islemGecmisi;
    }

}
