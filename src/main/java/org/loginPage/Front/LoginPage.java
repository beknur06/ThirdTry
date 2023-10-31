package org.loginPage.Front;

import org.loginPage.Back.LogReg;


import java.util.Random;
import java.util.Scanner;

public class LoginPage{

    public void start(){
        Random rand = new Random();
        LogReg use = new LogReg();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your phone humber: +7 ");
        String number = scan.nextLine();
        number = number.replaceAll("\\s","");
        if(use.logged(number)){
            while (true){
                int choice = 1;
                System.out.print("Please enter SMS-code: ");
                int userSMS = scan.nextInt();
                System.out.println(use.showSMS());
                if(use.check(userSMS)){
                    System.out.println("You are logged in");
                    System.exit(0);
                }
                else{
                    System.out.println("The code that you have entered is incorrect please try again or exit the login page");
                    System.out.println("1.Try again");
                    System.out.println("2.Exit");
                    choice = scan.nextInt();
                }
                if(choice==1)continue;
                else break;
            }
        }
        else{
            System.out.println("The user with this number does not exist. Please check your number or press registration button");
        }
    }
}
