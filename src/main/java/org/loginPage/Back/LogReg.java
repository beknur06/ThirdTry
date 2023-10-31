package org.loginPage.Back;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class SendSMS{
    Random rand = new Random();
    private int SMS = rand.nextInt(1000,9999);
    /*
    * HERE I WILL SEND CODE TO PHONE NUMBER BUT I DO NOT KNOW HOW TO DO IT
    */
}
@Data
@AllArgsConstructor
@Builder
public class LogReg {
    Random rand = new Random();

    private Map<String, User> users;
    public LogReg() {
        this.users = new HashMap<>();
        users.put("admin", new User("admin","admin","admin"));
    }
    public boolean logged(String number){
        return users.containsKey(number);
    }
    public boolean check(int userSMS){
        SendSMS sendSMS = new SendSMS();
        return userSMS == sendSMS.getSMS();
    }
    public int showSMS(){
        SendSMS sendSMS = new SendSMS();
        return sendSMS.getSMS();
    }
}