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
public class LongTerm extends Account{
    int AccountType=2;
    double faiz=0.24;
    public LongTerm() {
        if(Balance >= 1500){
            Balance += Balance*faiz;
        }
        else{
            System.out.println("Yapmak istediğiniz işlem yetersiz bakiyeden dolayı geçersizdir.");
        }
    }
}
