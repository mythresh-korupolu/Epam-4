package com.klu.Epam_3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        float p=sc.nextFloat();
        float r=sc.nextFloat();
        SimpleInterest si=new SimpleInterest(p,n,r);
        CompoundInterest ci=new CompoundInterest(p,r,n);
        
    }
}
