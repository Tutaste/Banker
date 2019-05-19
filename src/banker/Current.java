package banker;

/*
 * Vadesiz hesap türü için oluşturulan sınıf 
 */

public class Current extends Account{
    int faiz=1;
    
    public Current(int ID){
        super(ID);
    }

    @Override
    public int Benefit() {
        return (int)(faiz*Balance);
    }
}
