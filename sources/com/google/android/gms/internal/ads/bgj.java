package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import com.google.android.gms.internal.ads.amq.C15587a.C15594f;
import com.google.android.gms.internal.ads.amq.C15587a.C15594f.C15595a;
import java.lang.reflect.InvocationTargetException;

public final class bgj extends bgm {

    /* renamed from: d */
    private final View f42304d;

    public bgj(bey bey, String str, String str2, C15588a aVar, int i, int i2, View view) {
        super(bey, str, str2, aVar, i, 57);
        this.f42304d = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        if (this.f42304d != null) {
            Boolean bool = (Boolean) caf.m37099d().mo30717a(C15740bx.f44273bG);
            DisplayMetrics displayMetrics = this.f42314a.f42216a.getResources().getDisplayMetrics();
            bfh bfh = new bfh((String) this.f42316c.invoke(null, new Object[]{this.f42304d, displayMetrics, bool}));
            C15595a a = C15594f.m33590a();
            a.mo29334a(bfh.f42258a.longValue()).mo29335b(bfh.f42259b.longValue()).mo29336c(bfh.f42260c.longValue());
            if (bool.booleanValue()) {
                a.mo29337d(bfh.f42261d.longValue());
            }
            this.f42315b.mo29273a((C15594f) ((axz) a.mo29832e()));
        }
    }
}
