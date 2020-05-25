package com.google.android.gms.internal.ads;

import android.text.TextUtils;

final class abj extends C15563abr {

    /* renamed from: a */
    private final /* synthetic */ abh f40177a;

    abj(abh abh) {
        this.f40177a = abh;
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
    }

    /* renamed from: a */
    public final void mo27696a() {
        C15794bz bzVar = new C15794bz(this.f40177a.f40166d, this.f40177a.f40167e.f46237a);
        synchronized (this.f40177a.f40163a) {
            try {
                C15796ca caVar = this.f40177a.f40168f;
                if (bzVar.f44637c == null) {
                    throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
                } else if (!TextUtils.isEmpty(bzVar.f44638d)) {
                    caVar.mo30889a(bzVar.f44637c, bzVar.f44638d, bzVar.f44635a, bzVar.f44636b);
                } else {
                    throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
                }
            } catch (IllegalArgumentException e) {
                abv.m32795c("Cannot config CSI reporter.", e);
            }
        }
    }
}
