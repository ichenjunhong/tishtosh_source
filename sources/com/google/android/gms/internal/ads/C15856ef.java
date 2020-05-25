package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ef */
final class C15856ef implements C15837do {

    /* renamed from: a */
    private final /* synthetic */ View f44951a;

    /* renamed from: b */
    private final /* synthetic */ C15855ee f44952b;

    C15856ef(C15855ee eeVar, View view) {
        this.f44952b = eeVar;
        this.f44951a = view;
    }

    /* renamed from: a */
    public final void mo30979a() {
        this.f44952b.onClick(this.f44951a);
    }

    /* renamed from: a */
    public final void mo30980a(MotionEvent motionEvent) {
        this.f44952b.onTouch(null, motionEvent);
    }
}
