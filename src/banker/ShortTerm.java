package banker;

import java.text.ParseException;

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
    
    public ShortTerm(int ID){
        super(ID);
    }
}