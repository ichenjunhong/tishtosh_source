package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.n */
public final class C4917n implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C52682m f13218a;

    public C4917n(C52682m mVar) {
        this.f13218a = mVar;
    }

    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        C52711k.m112236a(this.f13218a.invoke(dialogInterface, Integer.valueOf(i)), "invoke(...)");
    }
}
