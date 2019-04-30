package banker;


import java.text.*;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aycan 180303002
 */
public class Account {
    int AccountType=0; //0:Ana hesap  1:ShortTerm  2:LongTerm  3:Current
    int Balance; //Hesap bakiyesi
    int Id; //Kullanıcı numarası
    Date tarih; //hesp açılış tarihi tarihi
    public Account() throws ParseException{
        SimpleDateFormat temp=new SimpleDateFormat ("dd.MM.yyyy");
        tarih=temp.parse("01.01.2019");
    }
    
    public void deposit(int miktar){
        //hesaba belirtilen miktarda para yatırır.
    }
    
    public void withdraw(int miktar){
        //hesaptan para çeker
    }
    
    public int getBalance(){
        //Bakiyeyi verir
        return Balance;
    }
    
    public int getId(){
        //Hesap numarası verir
        return Id; 
    }
    
    public int Benefit(int gün){
        //kar miktarını hesaplar
        return 1;
    }
}
