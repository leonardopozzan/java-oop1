package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ciao inserisci il tuo nome:");
        String name = scan.nextLine();
        BankAccount bankAccount = new BankAccount(name);
        boolean quit = false;

        do {
            System.out.println("Vuoi depositare, prelevare o uscire? (depositare/prelevare/uscire)");
            String action = scan.nextLine();
            if(action.equals("depositare")){

                System.out.println("Quanto vuoi depositare?");
                double amount = Double.parseDouble(scan.nextLine());
                bankAccount.deposit(amount);
                bankAccount.printFormattedBalance();

            }else if(action.equals("prelevare")) {

                System.out.println("Quanto vuoi prelevare?");
                double amount = Double.parseDouble(scan.nextLine());
                boolean withdrew  = bankAccount.withdraw(amount);
                if(withdrew){
                    bankAccount.printFormattedBalance();
                }else{
                    bankAccount.printFormattedBalance();
                    System.out.println("Non puoi prelevare la cifra inserita!");
                }

            }else if(action.equals("uscire")){
                quit = true;
            }else {
                System.out.println("Hai inserito un comando errato!");
            }
        } while (!quit);
        scan.close();
        System.out.println("Operazione conclusa!");
    }
}
