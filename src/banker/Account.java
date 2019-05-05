package banker;

import java.text.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aycan 180303002
 */

abstract public class Account {
    int AccountType=0; //0:Ana hesap  1:ShortTerm  2:LongTerm  3:Current
    int Balance; //Hesap bakiyesi
    int Id; //Kullanıcı numarası
    Date tarih; //hesp açılış tarihi
    int faiz;
    
    public Account(int ID){
        Id=ID;
        SimpleDateFormat temp=new SimpleDateFormat ("dd.MM.yyyy");
        try {
            tarih=temp.parse("01.01.2019");
        } catch (ParseException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * hesaba belirtilen miktarda para yatırır.
     * @param miktar hesaba yatırılan tutar
     */
    public void deposit(int miktar){
         Balance+=miktar;
         System.out.println("Hesabınızda" +Balance+ "  TL bulunmaktadır.");
    }
    
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
     * @param gün
     * @return 
     */
    public int Benefit(int gün){
        //kar miktarını hesaplar
        return 1;
    }
}
