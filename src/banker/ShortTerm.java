package banker;

import java.text.ParseException;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/*
 * Kısa vadeli hesap için oluşturulan sınıf.
 */

public class ShortTerm extends Account{
    double faiz=0.17;
    
    public ShortTerm(int ID){
        super(ID);
    }
    
    @Override
    public int Benefit(){
        LocalDate islemTarihi = LocalDate.now();
        long fark = DAYS.between(tarih,islemTarihi);
        return (int)(fark*(faiz/365)*Balance);
    }
}