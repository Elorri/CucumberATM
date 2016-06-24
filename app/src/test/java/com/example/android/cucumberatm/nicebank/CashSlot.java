package com.example.android.cucumberatm.nicebank;

/**
 * Created by Elorri on 24/06/2016.
 */

class CashSlot {
    private int contents;
    public int getContents() {
        return contents;
    }
    public void dispense(int dollars){
        contents = dollars;
    }
}
