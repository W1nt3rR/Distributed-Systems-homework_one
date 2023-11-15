package com.homework.one;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private Lock lock = new ReentrantLock();

    private int balance;
    public String accountName;
    public static int accountNumber = 0;

    public Account(int balance) {
        this.balance = balance;
        this.accountName = "account" + accountNumber++;
    }

    public String toString() {
        return accountName;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void lock() {
        lock.lock();
    }

    public void unlock() {
        lock.unlock();
    }

}
