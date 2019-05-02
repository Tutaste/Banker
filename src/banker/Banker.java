
package banker;


import java.util.Scanner;

/**
 * Banka hesabı projemizde farklı hesap türleri 
 * üzerinden işlemler yapılabilmektedir.
 * 
 * @author  Aycan ÖZYILMAZ, Zeynep KIRMIZIBİBER, İlknur NACAK, Göknur BÜLBÜL, Zümrüt SATILMAZ
 * @since   2019-05-08
 */
public class Banker {
    /**
     * @param args the command line arguments
     */
    static Bank banka=new Bank(); //Bank sınıfından yeni banka nesnesi oluşturduk.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //TODO   Ekrana yazma işlemini basitleştir.
        //ShortTerm hesap=new ShortTerm();
        int islem;
        do{
            System.out.println("Yapacağınız işlem numarasını giriniz veya çıkmak için 0 girin:");
            System.out.println("1.Kısa vadeli hesap aç");
            System.out.println("2.Uzun vadeli hesap aç");
            System.out.println("3.Cari hesap aç");
            System.out.println("4.Hesaba para yatır");
            System.out.println("5.Hesaptan para çek");
            System.out.println("6.Hesapları listele");
            islem=input.nextInt();
            
            switch(islem){
                case 1:
//                    System.out.print("Hesap numarasını girin: ");
//                    int Id=input.nextInt();
                    int Id=banka.hesaplar.size()+1;
                    System.out.print("Başlangıç bakiyesini girin: ");
                    int Balance=input.nextInt();
                    Create_S_ID_balance(Id,Balance);
                    System.out.println("1 numaralı işlemi seçtiniz.");
                    break;
                case 2:
                    System.out.print("Hesap numarasını girin: ");
                    int Id2=input.nextInt();
                    System.out.print("Başlangıç bakiyesini girin: ");
                    int Balance2=input.nextInt();
                    Create_L_ID_balance(Id2,Balance2);
                    System.out.println("2 numaralı işlemi seçtiniz.");
                    break;
                case 3:
                    System.out.print("Hesap numarasını girin: ");
                    int Id3=input.nextInt();
                    System.out.print("Başlangıç bakiyesini girin: ");
                    int Balance3=input.nextInt();
                    Create_C_ID_balance(Id3,Balance3);
                    System.out.println("3 numaralı işlemi seçtiniz.");        
                    break;
                case 4:
                    System.out.print("Hesap numarasını girin: ");
                    int Id4=input.nextInt();
                    System.out.println("Hesaba yatırmak istediğiniz miktarı giriniz:");
                    int cash4=input.nextInt();
                    Increase_ID_cash(Id4,cash4);
                    System.out.println("4 numaralı işlemi seçtiniz.");
                    break;
                case 5:
                    System.out.print("Hesap numarasını girin: ");
                    int Id5=input.nextInt();
                    System.out.println("Hesabınızdan çekmek istediğiniz miktarı giriniz:");
                    int cash5=input.nextInt();
                    Decrease_ID_cash(Id5,cash5);
                    System.out.println("5 numaralı işlemi seçtiniz.");
                    break;
                case 6:
                    ShowAccount();
                    System.out.println("6 numaralı işlemi seçtiniz.");
                    break;
                case 7:
                    //
                    break;

                case 8:
                    //
                    break;
            }
        }while(islem!=0);
    }//end of main
    
    /**
     * Başlangıç miktarı ile kısa vadeli bir hesap açar.
     * @param ID
     * @param Balance 
     */
    public static void Create_S_ID_balance(int ID,int Balance){
        if(Balance >= 1000){
            ShortTerm hesap=new ShortTerm(ID);
            hesap.deposit(Balance);
            banka.hesaplar.add(hesap);
            System.out.println(ID+" hesap numaralı kısa vadeli hesap oluşturuldu. Hesapta "+Balance+"TL var.");
        }
        else{
            System.out.println("Hesap açmak için en az 1000 TL gerekli.Hesap açılamadı.");
        }        
    }//end of Create_S_ID_balance
    
    public static void Create_L_ID_balance(int ID, int Balance){
        if(Balance>=1500){
            LongTerm hesap=new LongTerm(ID);
            hesap.deposit(Balance);
            banka.hesaplar.add(hesap);
            System.out.println(ID+" hesap numaralı uzun vadeli hesap oluşturuldu. Hesapta "+Balance+"TL var.");
        }
        else{
            System.out.println("Hesap açmak için en az 1500 TL gerekli.Hesap açılamadı.");
        }
    }//end of Create_L_ID_balance
    
    public static void Create_C_ID_balance(int ID, int Balance){
        Current hesap=new Current(ID);
        hesap.deposit(Balance);
        banka.hesaplar.add(hesap);
        System.out.println(ID+" hesap numaralı cari hesap oluşturuldu. Hesapta "+Balance+"TL var.");
    }//end of Create_L_ID_balance
    
    public static void Increase_ID_cash(int ID, int Cash){
        banka.hesaplar.get(ID).deposit(Cash);
    }//end of Increase_ID_cash
    
    public static void Decrease_ID_cash(int ID, int Cash){
        banka.hesaplar.get(ID).withdraw(Cash);
    }//end of Decrease_ID_cash
    
    public static void Set_dd_mm_yy(){
        
    }//end of Set_dd_mm_yy
    
    public static void ShowAccount(){
        for(Account i: banka.hesaplar){
            System.out.println(i.getId());
        }     
        //devamı var
    }//end of ShowAccount
    
    public static void ShowIDs(){
        for(Account i: banka.hesaplar){
            System.out.println(i.getId());
        }
    }//end of ShowIDs

    
    
}
