package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.C15428c.C15429a;

final class bxv implements C15429a {

    /* renamed from: a */
    final /* synthetic */ bxt f44525a;

    /* renamed from: b */
    private final /* synthetic */ zzwr f44526b;

    /* renamed from: c */
    private final /* synthetic */ agl f44527c;

    bxv(bxt bxt, zzwr zzwr, agl agl) {
        this.f44525a = bxt;
        this.f44526b = zzwr;
        this.f44527c = agl;
    }

    /* renamed from: a */
    public final void mo28416a(int i) {
    }

    /* renamed from: a */
    public final void mo28417a(Bundle bundle) {
        synchronized (this.f44525a.f44523d) {
            if (!this.f44525a.f44521b) {
                this.f44525a.f44521b = true;
                bxn bxn = this.f44525a.f44520a;
                if (bxn != null) {
                    this.f44527c.mo28797a(new bxy(this.f44527c, acb.m32566a((Runnable) new bxx(this, bxn, this.f44526b, this.f44527c))), agf.f40431b);
                }
            }
        }
    }
}
