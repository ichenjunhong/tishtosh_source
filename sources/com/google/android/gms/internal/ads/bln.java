package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Process;

public final class bln extends HandlerThread {

    /* renamed from: a */
    private final int f42853a = -16;

    public bln(String str, int i) {
        super(str);
    }

    public final void run() {
        Process.setThreadPriority(this.f42853a);
        super.run();
    }
}
