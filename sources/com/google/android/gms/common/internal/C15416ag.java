package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.C15497a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.ag */
final class C15416ag implements ServiceConnection {

    /* renamed from: a */
    final Set<ServiceConnection> f39767a = new HashSet();

    /* renamed from: b */
    public int f39768b = 2;

    /* renamed from: c */
    public boolean f39769c;

    /* renamed from: d */
    public IBinder f39770d;

    /* renamed from: e */
    final C15450a f39771e;

    /* renamed from: f */
    public ComponentName f39772f;

    /* renamed from: g */
    final /* synthetic */ C15415af f39773g;

    public C15416ag(C15415af afVar, C15450a aVar) {
        this.f39773g = afVar;
        this.f39771e = aVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f39773g.f39761a) {
            this.f39773g.f39763c.removeMessages(1, this.f39771e);
            this.f39770d = iBinder;
            this.f39772f = componentName;
            for (ServiceConnection onServiceConnected : this.f39767a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f39768b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f39773g.f39761a) {
            this.f39773g.f39763c.removeMessages(1, this.f39771e);
            this.f39770d = null;
            this.f39772f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f39767a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f39768b = 2;
        }
    }

    /* renamed from: a */
    public final void mo28382a(String str) {
        this.f39768b = 3;
        this.f39769c = C15497a.m32248a(this.f39773g.f39762b, str, this.f39771e.mo28440a(this.f39773g.f39762b), this, this.f39771e.f39862c);
        if (this.f39769c) {
            this.f39773g.f39763c.sendMessageDelayed(this.f39773g.f39763c.obtainMessage(1, this.f39771e), this.f39773g.f39766f);
            return;
        }
        this.f39768b = 2;
        try {
            C15497a.m32247a(this.f39773g.f39762b, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final void mo28381a(ServiceConnection serviceConnection, String str) {
        this.f39771e.mo28440a(this.f39773g.f39762b);
        this.f39767a.add(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo28384a(ServiceConnection serviceConnection) {
        return this.f39767a.contains(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo28383a() {
        return this.f39767a.isEmpty();
    }
}
