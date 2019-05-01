/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banker;


import java.util.Scanner;

/**
 *
 * @author badem
 */
public class Banker {

    /**
     * @param args the command line arguments
     */
    static Bank banka=new Bank();

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
                    System.out.print("Hesap numarasını girin: ");
                    int Id=input.nextInt();
                    System.out.print("Başlangıç bakiyesini girin: ");
                    int Balance=input.nextInt();
                    Create_S_ID_balance(Id,Balance);
                    break;
                case 2:
                    System.out.println("2 numaralı işlemi seçtiniz.");
                    break;
                case 6:
                    ShowAccount();
                    break;
                // devamı eklenecek
            }
        }while(islem!=0);
        
        
    }//end of main
    
    /**
     * 
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
    
    public static void Create_L_ID_balance(){
        //
    }//end of Create_L_ID_balance
    
    public static void Create_C_ID_balance(){
        //
    }//end of Create_L_ID_balance
    
    public static void Increase_ID_cash(){
        //
    }//end of Increase_ID_cash
    
    public static void Decrease_ID_cash(){
        //
    }//end of Decrease_ID_cash
    
    public static void Set_dd_mm_yy(){
        
    }//end of Set_dd_mm_yy
    
    public static void ShowAccount(){
        for(Account i: banka.hesaplar){
            System.out.println(i.getId());
        }     
    }//end of ShowAccount
    
    public static void ShowIDs(){
        
    }//end of ShowIDs

    
    
}
