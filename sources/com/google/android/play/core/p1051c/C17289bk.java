package com.google.android.play.core.p1051c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.play.core.c.bk */
final class C17289bk implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C17283be f48766a;

    private C17289bk(C17283be beVar) {
        this.f48766a = beVar;
    }

    /* synthetic */ C17289bk(C17283be beVar, byte b) {
        this(beVar);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f48766a.f48751b.mo33685a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f48766a.m42337b((C17281bc) new C17288bj(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f48766a.f48751b.mo33685a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f48766a.m42337b((C17281bc) new C17290c(this));
    }
}
