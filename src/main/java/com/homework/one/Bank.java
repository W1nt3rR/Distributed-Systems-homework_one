package com.homework.one;

public class Bank {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(1000);
        }

        while (true) {
            try {
                Thread.sleep((long) (Math.random() * 9000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Account fromAccount = accounts[(int) (Math.random() * 10)];
            Account toAccount = accounts[(int) (Math.random() * 10)];
            int amount = (int) (Math.random() * 1000);

            Transaction transaction = new Transaction(fromAccount, toAccount, amount);
            new Thread(transaction).start();
        }

    }
}
