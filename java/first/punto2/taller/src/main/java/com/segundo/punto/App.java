package com.segundo.punto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Account firtClient = new Account("andres", 3000000);
        firtClient.getAccountUser();
        Account.rate = (double)5/(double)100;
        System.out.println(firtClient.getMonthValue());

        Account secondClient = new Account("Paola", 8000000);
        secondClient.getAccountUser();
        Account.rate = (double)4/(double)100;
        System.out.println(secondClient.getMonthValue());
    }
}
