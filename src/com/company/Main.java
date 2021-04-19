package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

	BombTimer bombtimer = new BombTimer();
	PasswordChecker passcheck = new PasswordChecker();
	System.out.println("Напишите ОТМЕНА для остановки детонации!");
	passcheck.start();
	// не удаётся реализовать остановку одного потока с помощью другого потока
	if (!passcheck.getPassword().equals("ОТМЕНА")){
		passcheck.join();
		System.out.println("Детонация остановлена!");
	}
	else {
		bombtimer.start();
		}
	}
}
