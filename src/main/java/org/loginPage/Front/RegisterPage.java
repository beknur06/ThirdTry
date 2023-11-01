package org.loginPage.Front;

import org.loginPage.Back.LogReg;
import org.loginPage.Back.User;


import java.util.Map;
import java.util.Scanner;

public class RegisterPage{
    LogReg use = new LogReg();
    LoginPage login = new LoginPage();
    public void start(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your phone humber: +7 ");
        String number = scan.nextLine();
        number = number.replaceAll("\\s","");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scan.nextLine();
        if(use.register(number, name, surname)) {
            System.out.println("You have successfully registered, please login");
        }
        else{
            System.out.println("User with this number already exists");
        }
    }
}
