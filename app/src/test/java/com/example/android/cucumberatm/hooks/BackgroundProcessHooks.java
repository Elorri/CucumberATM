package com.example.android.cucumberatm.hooks;

import com.example.android.cucumberatm.nicebank.TransactionProcessor;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Elorri on 26/06/2016.
 */

public class BackgroundProcessHooks {
    private Thread transactionProcessorThread;
    @Before
    public void startBackgroundThread() {
        transactionProcessorThread = new Thread() {
            public void run() {
                TransactionProcessor processor = new TransactionProcessor();
                processor.process();
            }
        };
        transactionProcessorThread.start();
    }
    @After
    public void stopBackgroundThread() {
        transactionProcessorThread.interrupt();
    }
}