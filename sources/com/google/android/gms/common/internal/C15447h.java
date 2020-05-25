package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.internal.p1042c.C16478e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.h */
public final class C15447h implements Callback {

    /* renamed from: a */
    public final C15448a f39849a;

    /* renamed from: b */
    public final ArrayList<C15235b> f39850b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C15235b> f39851c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<C15236c> f39852d = new ArrayList<>();

    /* renamed from: e */
    public volatile boolean f39853e = false;

    /* renamed from: f */
    public final AtomicInteger f39854f = new AtomicInteger(0);

    /* renamed from: g */
    public boolean f39855g = false;

    /* renamed from: h */
    public final Handler f39856h;

    /* renamed from: i */
    public final Object f39857i = new Object();

    /* renamed from: com.google.android.gms.common.internal.h$a */
    public interface C15448a {
        /* renamed from: g */
        boolean mo28175g();
    }

    public C15447h(Looper looper, C15448a aVar) {
        this.f39849a = aVar;
        this.f39856h = new C16478e(looper, this);
    }

    /* renamed from: a */
    public final void mo28435a() {
        this.f39853e = false;
        this.f39854f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo28437b() {
        this.f39853e = true;
    }

    /* renamed from: a */
    public final void mo28436a(C15236c cVar) {
        C15464q.m32123a(cVar);
        synchronized (this.f39857i) {
            if (!this.f39852d.contains(cVar)) {
                this.f39852d.add(cVar);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C15235b bVar = (C15235b) message.obj;
            synchronized (this.f39857i) {
                if (this.f39853e && this.f39849a.mo28175g() && this.f39850b.contains(bVar)) {
                    bVar.onConnected(null);
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
