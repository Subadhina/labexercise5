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
public class integersum {
    public static void main(String[] args) {
        String i="123456789";
        int sum=0;
        System.out.println("The integers present inthestring are: ");
        for(int j=0;j<i.length();j++)
        {
          char  c=i.charAt(j);
        sum= sum+Integer.parseInt(String.valueOf(c));
        System.out.println(c);
       }
       System.out.println("The sum of the given line of integer is: "+sum);
}
}