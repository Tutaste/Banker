package banker;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/*
 * Uzun vadeli hesap için oluşturulan sınıf.
 */

public class LongTerm extends Account{
    double faiz=0.24;
    
    public LongTerm(int ID) {
        super(ID);
    }
    
    @Override
    public int Benefit(){
        LocalDate islemTarihi = LocalDate.now();
        long fark = DAYS.between(tarih,islemTarihi);
        return (int)(fark*(faiz/365)*Balance);
    }
}
