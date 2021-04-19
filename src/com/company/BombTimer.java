package com.company;

public class BombTimer extends Thread{
    int timer = 10;


    @Override
    public void run(){

        while (!isInterrupted() && (timer > 0)){
            System.out.println("До детонации осталось: "+ timer);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Детонация остановлена!");
            }
            timer--;
        }
        if (!isInterrupted() && (timer == 0)){
            System.out.println("BOOM!");
        }
    }
}
