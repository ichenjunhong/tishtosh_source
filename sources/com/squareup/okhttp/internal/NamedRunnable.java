package com.squareup.okhttp.internal;

import com.C2240a;

public abstract class NamedRunnable implements Runnable {
    protected final String name;

    /* access modifiers changed from: protected */
    public abstract void execute();

    public final void run() {
        String name2 = Thread.currentThread().getName();
        Thread.currentThread().setName(this.name);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name2);
        }
    }

    public NamedRunnable(String str, Object... objArr) {
        this.name = C2240a.m6772a(str, objArr);
    }
}
