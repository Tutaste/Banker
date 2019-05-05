
package banker;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author badem
 */
public class Bank {
    ArrayList<Account> hesaplar= new ArrayList<Account>(); 
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
    
    /**
     * Belli edilen hesaba cash kadar para yatırır.
     * 
     * @param ID hesap numarası
     * @param cash hasaba yatırılacak para miktarı
     */
    public void deposit(int ID, int cash){
        hesaplar.get(ID-1).deposit(cash);
    }
    
    /**
     * Mümkün ise belli edilen hesaptan belirli 
     * miktarda para çeker. İşlemin yapılıp yapılamadığını 
     * ekranda gösterir.
     * @param ID hesap numarası
     * @param cash hesaptan çekilecek para miktarı
     */
    public int Withdraw(int ID, int cash){
        //   
    }
}
