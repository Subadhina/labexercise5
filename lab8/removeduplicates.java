/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author ELCOT
 */
public class removeduplicates {
    public static void main(String[] args) {
        String s="actually";
        System.out.println("The given string is: "+s);
        String b="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                b=b+ch;
                s=s.replace(ch, ' ');
            }
        }
        System.out.println("After removing duplicates from the string: "+b);
    }
}

