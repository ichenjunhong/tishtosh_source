package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15428c.C15429a;
import com.google.android.gms.common.internal.C15428c.C15430b;

public final class aop implements C15429a, C15430b {

    /* renamed from: a */
    private final apa f41175a;

    /* renamed from: b */
    private final aov f41176b;

    /* renamed from: c */
    private final Object f41177c = new Object();

    /* renamed from: d */
    private boolean f41178d = false;

    /* renamed from: e */
    private boolean f41179e = false;

    public aop(Context context, Looper looper, aov aov) {
        this.f41176b = aov;
        this.f41175a = new apa(context, looper, this, this);
    }

    /* renamed from: a */
    public final void mo28416a(int i) {
    }

    /* renamed from: a */
    public final void mo28418a(ConnectionResult connectionResult) {
    }

    /* renamed from: a */
    public final void mo29425a() {
        synchronized (this.f41177c) {
            if (!this.f41178d) {
                this.f41178d = true;
                this.f41175a.mo28409l();
            }
        }
    }

    /* renamed from: b */
    private final void m33832b() {
        synchronized (this.f41177c) {
            if (this.f41175a.mo28404g() || this.f41175a.mo28405h()) {
                this.f41175a.mo28403f();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final void mo28417a(Bundle bundle) {
        synchronized (this.f41177c) {
            if (!this.f41179e) {
                this.f41179e = true;
                try {
                    this.f41175a.mo29433s().mo29439a(new zzbql(this.f41176b.mo29580f()));
                    m33832b();
                } catch (Exception unused) {
                    m33832b();
                } catch (Throwable th) {
                    m33832b();
                    throw th;
                }
            }
        }
    }
}
