package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.cr */
final class C15319cr implements C15281bj {

    /* renamed from: a */
    private final /* synthetic */ C15317cp f39531a;

    private C15319cr(C15317cp cpVar) {
        this.f39531a = cpVar;
    }

    /* renamed from: a */
    public final void mo28169a(Bundle bundle) {
        this.f39531a.f39528m.lock();
        try {
            C15317cp cpVar = this.f39531a;
            if (cpVar.f39518c == null) {
                cpVar.f39518c = bundle;
            } else if (bundle != null) {
                cpVar.f39518c.putAll(bundle);
            }
            this.f39531a.f39525j = ConnectionResult.f39245a;
            C15317cp.m31767b(this.f39531a);
        } finally {
            this.f39531a.f39528m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo28170a(ConnectionResult connectionResult) {
        this.f39531a.f39528m.lock();
        try {
            this.f39531a.f39525j = connectionResult;
            C15317cp.m31767b(this.f39531a);
        } finally {
            this.f39531a.f39528m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo28168a(int i, boolean z) {
        this.f39531a.f39528m.lock();
        try {
            if (!this.f39531a.f39527l && this.f39531a.f39526k != null) {
                if (this.f39531a.f39526k.mo28024b()) {
                    this.f39531a.f39527l = true;
                    this.f39531a.f39517b.onConnectionSuspended(i);
                    this.f39531a.f39528m.unlock();
                    return;
                }
            }
            this.f39531a.f39527l = false;
            C15317cp.m31764a(this.f39531a, i, z);
        } finally {
            this.f39531a.f39528m.unlock();
        }
    }

    /* synthetic */ C15319cr(C15317cp cpVar, C15318cq cqVar) {
        this(cpVar);
    }
}
