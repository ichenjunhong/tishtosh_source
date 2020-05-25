package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C15428c.C15429a;

final class bxk implements C15429a {

    /* renamed from: a */
    private final /* synthetic */ bxh f44518a;

    bxk(bxh bxh) {
        this.f44518a = bxh;
    }

    /* renamed from: a */
    public final void mo28417a(Bundle bundle) {
        synchronized (this.f44518a.f44512b) {
            try {
                if (this.f44518a.f44513c != null) {
                    this.f44518a.f44515e = this.f44518a.f44513c.mo29433s();
                }
            } catch (DeadObjectException e) {
                abv.m32793b("Unable to obtain a cache service instance.", e);
                bxh.m36953a(this.f44518a);
            }
            this.f44518a.f44512b.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo28416a(int i) {
        synchronized (this.f44518a.f44512b) {
            this.f44518a.f44515e = null;
            this.f44518a.f44512b.notifyAll();
        }
    }
}
