package org.loginPage;

import org.loginPage.Front.LoginPage;
import org.loginPage.Front.RegisterPage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginPage login = new LoginPage();
        RegisterPage reg = new RegisterPage();
        while(true){
            System.out.println("Banknig System of Beknur:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Chose option: ");
            int options = scanner.nextInt();
            if(options == 1){
                login.start();
            }
            else if(options == 2){
                reg.start();
            }
            else{
                System.exit(0);
            }
        }

    }
}
