package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.cs */
final class C15320cs implements C15281bj {

    /* renamed from: a */
    private final /* synthetic */ C15317cp f39532a;

    private C15320cs(C15317cp cpVar) {
        this.f39532a = cpVar;
    }

    /* renamed from: a */
    public final void mo28169a(Bundle bundle) {
        this.f39532a.f39528m.lock();
        try {
            this.f39532a.f39526k = ConnectionResult.f39245a;
            C15317cp.m31767b(this.f39532a);
        } finally {
            this.f39532a.f39528m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo28170a(ConnectionResult connectionResult) {
        this.f39532a.f39528m.lock();
        try {
            this.f39532a.f39526k = connectionResult;
            C15317cp.m31767b(this.f39532a);
        } finally {
            this.f39532a.f39528m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo28168a(int i, boolean z) {
        this.f39532a.f39528m.lock();
        try {
            if (this.f39532a.f39527l) {
                this.f39532a.f39527l = false;
                C15317cp.m31764a(this.f39532a, i, z);
                return;
            }
            this.f39532a.f39527l = true;
            this.f39532a.f39516a.onConnectionSuspended(i);
            this.f39532a.f39528m.unlock();
        } finally {
            this.f39532a.f39528m.unlock();
        }
    }

    /* synthetic */ C15320cs(C15317cp cpVar, C15318cq cqVar) {
        this(cpVar);
    }
}
