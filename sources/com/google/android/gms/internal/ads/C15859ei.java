package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ei */
final class C15859ei implements C15837do {

    /* renamed from: a */
    private final /* synthetic */ View f44966a;

    /* renamed from: b */
    private final /* synthetic */ C15857eg f44967b;

    C15859ei(C15857eg egVar, View view) {
        this.f44967b = egVar;
        this.f44966a = view;
    }

    /* renamed from: a */
    public final void mo30979a() {
        C15857eg egVar = this.f44967b;
        String[] strArr = C15857eg.f44953e;
        int length = strArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                for (String str : strArr) {
                    if (egVar.f44956c.get(str) != null) {
                        break;
                    }
                }
            } else {
                if (egVar.f44955b.get(strArr[i]) != null) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        if (z) {
            this.f44967b.onClick(this.f44966a);
        }
    }

    /* renamed from: a */
    public final void mo30980a(MotionEvent motionEvent) {
        this.f44967b.onTouch(null, motionEvent);
    }
}
