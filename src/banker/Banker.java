package banker;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Banka hesabı projemizde farklı hesap türleri 
 * üzerinden işlemler yapılabilmektedir.
 */
public class Banker {
    
    static Bank banka=new Bank(); //Bank sınıfından yeni banka nesnesi oluşturduk.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int islem;
        do{
            Set_dd_mm_yy();
            System.out.println();
            System.out.println("Yapacağınız işlem numarasını giriniz veya çıkmak için 0 girin:");
            System.out.println("1.Kısa vadeli hesap aç.");
            System.out.println("2.Uzun vadeli hesap aç.");
            System.out.println("3.Cari hesap aç.");
            System.out.println("4.Hesaba para yatır.");
            System.out.println("5.Hesaptan para çek.");
            System.out.println("6.Hesap numaralarını listele.");
            System.out.println("7.Hesaplar için faiz miktarı ve yapılan son beş işlem.");
            System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
            islem=input.nextInt();
            
            switch(islem){
                case 1:
                    int Id=banka.hesaplar.size()+1;
                    System.out.print("Başlangıç bakiyesini girin: ");
                    int Balance=input.nextInt();
                    Create_S_ID_balance(Id,Balance);
                    System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
                    break;
                case 2:
                    int Id2=banka.hesaplar.size()+1;
                    System.out.print("Başlangıç bakiyesini girin: ");
                    int Balance2=input.nextInt();
                    Create_L_ID_balance(Id2,Balance2);
                    System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
                    break;
                case 3:
                    int Id3=banka.hesaplar.size()+1;
                    System.out.print("Başlangıç bakiyesini girin: ");
                    int Balance3=input.nextInt();
                    Create_C_ID_balance(Id3,Balance3);
                    System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");        
                    break;
                case 4:
                    System.out.print("Hesap numarasını girin: ");
                    int Id4=input.nextInt();
                    System.out.print("Hesaba yatırmak istediğiniz miktarı giriniz:");
                    int cash4=input.nextInt();
                    Increase_ID_cash(Id4,cash4);
                    System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
                    break;
                case 5:
                    System.out.print("Hesap numarasını girin: ");
                    int Id5=input.nextInt();
                    System.out.print("Hesabınızdan çekmek istediğiniz miktarı giriniz:");
                    int cash5=input.nextInt();
                    Decrease_ID_cash(Id5,cash5);
                    System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
                    break;
                case 6:
                    ShowIDs();
                    System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
                    break;
                case 7:
                    ShowAccount();
                    System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
                    break;
            }
        }while(islem!=0);
    }//end of main
    
    /**
     * Kısa vadeli bir hesap açar.
     * @param ID
     * @param Balance 
     */
    public static void Create_S_ID_balance(int ID,int Balance){
        if(Balance >= 1000){
            ShortTerm hesap=new ShortTerm(ID);
            hesap.deposit(Balance);
            banka.getAccount().add(hesap);
            System.out.println("Hesap numarası "+ ID +" olan kısa vadeli bir hesap oluşturuldu.Hesapta "+Balance+" TL var.");
        }
        else{
            System.out.println("Hesap açmak için en az 1000 TL gerekli.Hesap açılamadı.");
        }        
    }//end of Create_S_ID_balance
    
    /**
     * Uzun vadeli bir hesap açar.
     * @param ID
     * @param Balance 
     */
    public static void Create_L_ID_balance(int ID, int Balance){
        if(Balance>=1500){
            LongTerm hesap=new LongTerm(ID);
            hesap.deposit(Balance);
            banka.getAccount().add(hesap);
            System.out.println("Hesap numarası "+ID+" olan uzun vadeli bir hesap oluşturuldu.Hesapta "+Balance+" TL var.");
        }
        else{
            System.out.println("Hesap açmak için en az 1500 TL gerekli.Hesap açılamadı.");
        }
    }//end of Create_L_ID_balance
    
    /**
     * Cari bir hesap açar.
     * @param ID
     * @param Balance 
     */
    public static void Create_C_ID_balance(int ID, int Balance){
        Current hesap=new Current(ID);
        hesap.deposit(Balance);
        banka.getAccount().add(hesap);
        System.out.println("Hesap numarası "+ ID +" olan bir cari hesap oluşturuldu.Hesapta "+Balance+" TL var.");
    }//end of Create_L_ID_balance
    
    /**
     * ID numarası verilen hesaba cash kadar para ekler.
     * @param ID
     * @param cash
     */
    public static void Increase_ID_cash(int ID, int cash){
        banka.deposit(ID,cash);
        
    }//end of Increase_ID_cash
    
    /**
     * ID numarası verilen hesaptan cash kadar para çeker.
     * @param ID
     * @param cash
     */
    public static void Decrease_ID_cash(int ID, int Cash){
        banka.Withdraw(ID, Cash);
    }//end of Decrease_ID_cash
    
    
    public static void Set_dd_mm_yy(){
        LocalDate anlıkGun= LocalDate.now();
        System.out.print(anlıkGun);
    }//end of Set_dd_mm_yy
    
    /**
     * Tüm hesaplar için ID ve son 5 işlemi gösterir.
     */
    public static void ShowAccount(){
        for(Account i: banka.getAccount()){
            System.out.print("Hesap numarası:" +i.getId());
            System.out.println(", faiz miktarı: " + i.Benefit());
        }   
        //System.out.println(banka.islemGecmisi.get(0));
        for(String i: banka.SonIslemler()){
            System.out.println(i);
        }
    }//end of ShowAccount
    
    /**
     * Tüm hesap numaralarını listeler.
     */
    public static void ShowIDs(){
        for(Account i: banka.getAccount()){
            System.out.println(i.getId()+ " numaralı hesap.");
        }
    }//end of ShowIDs

    
    
}
