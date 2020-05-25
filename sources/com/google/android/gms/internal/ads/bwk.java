package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

@C16299uq
public final class bwk {

    /* renamed from: a */
    public final Object f44135a = new Object();

    /* renamed from: b */
    public bwl f44136b = null;

    /* renamed from: c */
    public boolean f44137c = false;

    /* renamed from: a */
    public final void mo30816a(bwn bwn) {
        synchronized (this.f44135a) {
            if (this.f44136b == null) {
                this.f44136b = new bwl();
            }
            this.f44136b.mo30819a(bwn);
        }
    }

    /* renamed from: a */
    public final Activity mo30815a() {
        synchronized (this.f44135a) {
            if (this.f44136b == null) {
                return null;
            }
            Activity activity = this.f44136b.f44138a;
            return activity;
        }
    }

    /* renamed from: b */
    public final Context mo30817b() {
        synchronized (this.f44135a) {
            if (this.f44136b == null) {
                return null;
            }
            Context context = this.f44136b.f44139b;
            return context;
        }
    }
}
