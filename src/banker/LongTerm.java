package banker;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/*
 * Uzun vadeli hesap açın oluşturulan sınıf.
 */


public class LongTerm extends Account{
    int AccountType=2;
    double faiz=0.24;
    
    public LongTerm(int ID) {
        super(ID);
    }
    
    public int Benefit(){
        LocalDate islemTarihi = LocalDate.now();
        long fark = DAYS.between(tarih,islemTarihi);
        return (int)(fark*(faiz/365)*Balance);
    }
}
