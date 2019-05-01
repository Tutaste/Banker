package banker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author badem
 */
public class ShortTerm extends Account{
    int AccountType=1;
    double faiz=0.17;
    public ShortTerm() {
        
        if(Balance >= 1000){
            Balance += Balance*faiz;
        }
        else{
            System.out.println("Yapmak istediğiniz işlem yetersiz bakiyeden dolayı geçersizdir.");
        }
    }
    
}