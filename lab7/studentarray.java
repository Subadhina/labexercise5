/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class studentarray {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<student> l=new ArrayList<>(); //creation of arraylist
        for(int i=0;i<20;i++)
        {
          System.out.println("Enter name of student"+i+" :");
          String n=obj.next();
          System.out.println("Enter roll no :");
          double s=obj.nextDouble();
          System.out.println("Enter the cgpa :");
          double c=obj.nextDouble();
          student e=new student(n,s,c);
          l.add(new student(n,s,c));
        }
        System.out.println(l);
       Collections.sort(l,new namesort()); //sorting using inbuilt method
       System.out.println("The sorted array is:");
        System.out.println(l);
        
    }
}
class student    //creation od student class
{
    String name;
    double rollno;
    double cgpa;
    
    student(String n,double s,double c)  //student class constructor
    {
        name=n;
        rollno=s;
        cgpa=c;
    }
    public String toString()
    {
        return "\n\nSTUDENT NAME: "+name+"\tROLL NO:"+rollno+"\tCGPA: "+cgpa;
    }
}

class namesort implements Comparator<student>
{
@Override
public int compare(student s1,student s2)
{
    System.out.println(s1.name+"-----"+s2.name);
    return s1.name.compareTo(s2.name);
}

}
    

