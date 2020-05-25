package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.facebook.internal.w */
public abstract class C14362w implements ServiceConnection {

    /* renamed from: a */
    public final Context f37354a;

    /* renamed from: b */
    public C14364a f37355b;

    /* renamed from: c */
    public boolean f37356c;

    /* renamed from: d */
    int f37357d;

    /* renamed from: e */
    public final int f37358e;

    /* renamed from: f */
    private final Handler f37359f;

    /* renamed from: g */
    private Messenger f37360g;

    /* renamed from: h */
    private int f37361h;

    /* renamed from: i */
    private final String f37362i;

    /* renamed from: com.facebook.internal.w$a */
    public interface C14364a {
        /* renamed from: a */
        void mo26561a(Bundle bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26557a(Bundle bundle) {
        if (this.f37356c) {
            this.f37356c = false;
            C14364a aVar = this.f37355b;
            if (aVar != null) {
                aVar.mo26561a(bundle);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f37360g = null;
        try {
            this.f37354a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        mo26557a(null);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f37360g = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f37362i);
        Message obtain = Message.obtain(null, this.f37361h);
        obtain.arg1 = this.f37358e;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f37359f);
        try {
            this.f37360g.send(obtain);
        } catch (RemoteException unused) {
            mo26557a(null);
        }
    }

    public C14362w(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f37354a = context;
        this.f37361h = 65536;
        this.f37357d = 65537;
        this.f37362i = str;
        this.f37358e = 20121101;
        this.f37359f = new Handler() {
            public final void handleMessage(Message message) {
                C14362w wVar = C14362w.this;
                if (message.what == wVar.f37357d) {
                    Bundle data = message.getData();
                    if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                        wVar.mo26557a(null);
                    } else {
                        wVar.mo26557a(data);
                    }
                    try {
                        wVar.f37354a.unbindService(wVar);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        };
    }
}
