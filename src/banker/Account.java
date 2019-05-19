package banker;

import java.text.*;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Account sınıfı abstract sınıfıdır.Bu sınıftan üretilen her
 * nesne bir banka hesabıdır.
 */

public abstract class Account {
    protected int Balance; //Hesap bakiyesi
    protected int Id; //Kullanıcı numarası
    protected LocalDate tarih = LocalDate.of(2019, 01, 01); //hesap açılış tarihi
    protected int faiz;
    
    /**
    * Account sınıfının kurucu metodu.
    */
    protected Account(int ID){
        Id=ID;
    }
    
    /**
     * hesaba belirtilen miktarda para yatırır.
     * @param miktar hesaba yatırılan tutar
     */
    public void deposit(int miktar){
         Balance+=miktar;
         System.out.println("Hesabınızda " +Balance+ " TL bulunmaktadır.");
    }
    
    /**
     * İlgili hesaptan para çeker.
     * @param miktar hesaptan çekilen miktar
     */
    public void withdraw(int miktar){
        //hesaptan para çeker
        if(miktar<=Balance){
            Balance=Balance-miktar;
            System.out.println("Hesabınızdan "+miktar+" TL çekildi. Hesabınızda " +Balance+" TL bulunmaktadır.");
        }
        else{
            System.out.println("Hesabınızda yeterli miktarda para bulunmamaktadır!");
        }
    }
   
    /**
     * Hesapta bulunan para miktarını verir.
     * @return
     */
    public int getBalance(){
        //Bakiyeyi verir
        return Balance;
    }
    
    /**
     * Hesap numarasını verir.
     * @return 
     */
    public int getId(){
        //Hesap numarası verir
        return Id; 
    }
    
    /**
     * Kar miktarını hesaplar.
     * @return 
     */
    abstract public int Benefit();
    

}
