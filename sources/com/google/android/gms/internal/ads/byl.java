package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class byl {

    /* renamed from: a */
    private final byte[] f44577a;

    /* renamed from: b */
    private int f44578b;

    /* renamed from: c */
    private int f44579c;

    /* renamed from: d */
    private final /* synthetic */ byh f44580d;

    private byl(byh byh, byte[] bArr) {
        this.f44580d = byh;
        this.f44577a = bArr;
    }

    /* renamed from: a */
    public final synchronized void mo30864a() {
        try {
            if (this.f44580d.f44574b) {
                this.f44580d.f44573a.mo30141a(this.f44577a);
                this.f44580d.f44573a.mo30138a(this.f44578b);
                this.f44580d.f44573a.mo30143b(this.f44579c);
                this.f44580d.f44573a.mo30142a((int[]) null);
                this.f44580d.f44573a.mo30137a();
            }
        } catch (RemoteException e) {
            afc.m32790a("Clearcut log failed", e);
        }
    }

    /* renamed from: a */
    public final byl mo30863a(int i) {
        this.f44578b = i;
        return this;
    }

    /* renamed from: b */
    public final byl mo30865b(int i) {
        this.f44579c = i;
        return this;
    }
}
