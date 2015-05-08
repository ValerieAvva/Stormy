package com.example.valerie.stormy.bus;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by Valerie on 5/8/2015.
 */
public final class BusProvider {
    private static final Bus bus = new Bus(ThreadEnforcer.ANY);

    public static Bus getInstance() {
        return bus;
    }

    private BusProvider() {
    }

}
