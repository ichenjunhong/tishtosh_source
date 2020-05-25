package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.common.a */
public final class C15203a implements ServiceConnection {

    /* renamed from: a */
    public boolean f39255a;

    /* renamed from: b */
    public final BlockingQueue<IBinder> f39256b = new LinkedBlockingQueue();

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f39256b.add(iBinder);
    }
}
