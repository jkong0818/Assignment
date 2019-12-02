/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;

/**
 *
 * @author jkong
 */
public class ConsecutivesString {
   
    public static int ConsecutivesString (String s){
        int x = 0;
        char a = 'a';
        if(s.contains("aaa")){     
          x = -1;
          return x;
        }
        else{
            for(int i = 0; i < s.length() - 1; i++){  
                    for(int j = i + 1; j <s.length(); j++){
                        if(s.charAt(i)==a){
                            if(s.charAt(i)==s.charAt(j)){
                                x = x;
                            }
                            else
                             x = x + 1; 
                        }
                        if(s.charAt(i)!=a){
                            if(s.charAt(i)!=s.charAt(j)){
                                x = x + 2;
                            }
                        }  
                    }
                  
            }   
        return x;          
        }   
    }
}

