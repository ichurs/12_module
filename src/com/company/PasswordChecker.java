package com.company;

import java.util.Scanner;

public class PasswordChecker extends Thread{
    String password = "";

    @Override
    public void run(){
        password = new Scanner(System.in).nextLine();
    }

    public String getPassword() {
        return password;
    }
}

