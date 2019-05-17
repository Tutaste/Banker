package banker;

import java.text.ParseException;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/*
 * Kısa vadeli hesap için oluşturulan sınıftır.
 */


public class ShortTerm extends Account{
    int AccountType=1;
    double faiz=0.17;
    
    public ShortTerm(int ID){
        super(ID);
    }
    
    public int Benefit(){
        LocalDate islemTarihi = LocalDate.now();
        long fark = DAYS.between(tarih,islemTarihi);
        return (int)(fark*(faiz/365)*Balance);
    }
}