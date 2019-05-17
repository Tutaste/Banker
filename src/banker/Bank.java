
package banker;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Bank sınıfı tüm hesaplarının nesnelerini tutar.
 */
public class Bank {
    ArrayList<Account> hesaplar= new ArrayList<Account>();
    ArrayList<String> islemGecmisi= new ArrayList<String>();
    
    private Date date;
    private int ID, cash;
    
    /**
     * Mevcut hesapların listesini verir.
     * @return 
     */
    public ArrayList<Account> getAccount(){
        return hesaplar; 
    }
    
    /**
     * Sistemin şu anki tarihini gösterir.
     * @return 
     */
    public String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(date.getTime()) ; 
    }
    
    public void setDate(Date zaman){
        date=zaman;
    }
    
    
    /**
     * Belli edilen hesaba cash kadar para yatırır.
     * 
     * @param ID hesap numarası
     * @param cash hasaba yatırılacak para miktarı
     */
    public void deposit(int ID, int cash){
        hesaplar.get(ID-1).deposit(cash);
        IslemKaydet(ID, "+", cash);
    }
    
    /**
     * Mümkün ise belli edilen hesaptan belirli 
     * miktarda para çeker. İşlemin yapılıp yapılamadığını 
     * ekranda gösterir.
     * @param ID hesap numarası
     * @param cash hesaptan çekilecek para miktarı
     */
    public void Withdraw(int ID, int cash){
        hesaplar.get(ID-1).withdraw(cash);
        IslemKaydet(ID, "-", cash);
    }
    
    public void IslemKaydet(int ID,String tip, int cash){
        islemGecmisi.add(""+ID+" hesabı "+ tip + cash);
        if (islemGecmisi.size()>5) {
            islemGecmisi.remove(0);    
        }
    }
    
    public ArrayList<String> SonIslemler(){
        return islemGecmisi;
    }
    
    
//    public String toString(){
//        str= getDate()  +"tarihinde" +ID+"hesap numarasına " + deposit(int ID, int cash)+"tl yatırılmıştır. "+ Withdraw(int ID, int cash)+"tl çekilmiştir.";
//        return str;
//    }

}
