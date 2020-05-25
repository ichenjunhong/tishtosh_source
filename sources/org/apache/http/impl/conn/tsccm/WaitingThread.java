package org.apache.http.impl.conn.tsccm;

import java.util.concurrent.locks.Condition;

public class WaitingThread {
    private final Condition cond;
    private Thread waiter;

    public void wakeup() {
        if (this.waiter != null) {
            this.cond.signalAll();
            return;
        }
        throw new IllegalStateException("Nobody waiting on this object.");
    }
}
