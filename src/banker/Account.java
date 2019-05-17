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
    int AccountType=0; //0:Ana hesap  1:ShortTerm  2:LongTerm  3:Current
    int Balance; //Hesap bakiyesi
    int Id; //Kullanıcı numarası
    LocalDate tarih = LocalDate.of(2019, 01, 01); //hesp açılış tarihi
    int faiz;
    
    /**
    * Account sınıfının kurucu metodu.
    */
    public Account(int ID){
        Id=ID;
//        SimpleDateFormat temp=new SimpleDateFormat ("dd.MM.yyyy");
//        try {
//            tarih=temp.parse("01.01.2019");
//        } catch (ParseException ex) {
//            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    /**
     * hesaba belirtilen miktarda para yatırır.
     * @param miktar hesaba yatırılan tutar
     */
    public void deposit(int miktar){
         Balance+=miktar;
         System.out.println("Hesabınızda" +Balance+ "  TL bulunmaktadır.");
    }
    
    /**
     * İlgili hesaptan para çeker.
     * @param miktar hesaptan çekilen miktar
     */
    public void withdraw(int miktar){
        //hesaptan para çeker
        if(miktar<=Balance){
            Balance=Balance-miktar;
            System.out.println("Hesabınıza "+miktar+"TL yatırıldı. Hesabınızda " +Balance+"TL bulunmaktadır.");
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
    
//    public String toString(){
//        str=Id+ "numaralı hesabınız"+ tarih  +"tarihinde açıldı  "+"hesabınızdan "+withdraw(int miktar)+"tl çekilmiştir  "+ "kalan bakiyeniz"+  Balance+    "tl dir.";
//        return str;
//        
//    }

}
