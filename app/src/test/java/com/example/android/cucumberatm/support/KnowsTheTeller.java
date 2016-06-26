package com.example.android.cucumberatm.support;

import com.example.android.cucumberatm.nicebank.AtmUserInterface;
import com.example.android.cucumberatm.nicebank.Teller;

/**
 * Created by Elorri on 24/06/2016.
 */

public class KnowsTheTeller {

    private Teller teller;



    public Teller getTeller() {
        if (teller == null){
            teller = new AtmUserInterface();
        }
        return teller;
    }



}