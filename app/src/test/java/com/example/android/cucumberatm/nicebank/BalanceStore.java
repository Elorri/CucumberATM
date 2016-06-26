package com.example.android.cucumberatm.nicebank;

/**
 * Created by Elorri on 26/06/2016.
 * The BalanceStore is a database where the latest account balance is stored. Again,
 we want to keep the technology simple for this example, so we’ll use a very
 simple kind of database: a text file on disk.
 When asked for the balance, the BalanceStore opens the balance
 file (line 19), reads the contents (line 22), and converts them to a number
 (line 27). When it’s asked to set the balance, the BalanceStore opens the balance
 file (line 37) and writes the new balance into it (line 43). Simple!
 */
public class BalanceStore {
}
