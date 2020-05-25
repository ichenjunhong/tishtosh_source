package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14956aq;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14986bt;
import java.util.concurrent.Callable;

final /* synthetic */ class ami implements Callable {

    /* renamed from: a */
    private final Context f40931a;

    /* renamed from: b */
    private final anp f40932b;

    /* renamed from: c */
    private final String f40933c;

    /* renamed from: d */
    private final boolean f40934d;

    /* renamed from: e */
    private final boolean f40935e;

    /* renamed from: f */
    private final beh f40936f;

    /* renamed from: g */
    private final zzbgz f40937g;

    /* renamed from: h */
    private final C15806ck f40938h;

    /* renamed from: i */
    private final C14956aq f40939i;

    /* renamed from: j */
    private final C14986bt f40940j;

    /* renamed from: k */
    private final byc f40941k;

    ami(Context context, anp anp, String str, boolean z, boolean z2, beh beh, zzbgz zzbgz, C15806ck ckVar, C14956aq aqVar, C14986bt btVar, byc byc) {
        this.f40931a = context;
        this.f40932b = anp;
        this.f40933c = str;
        this.f40934d = z;
        this.f40935e = z2;
        this.f40936f = beh;
        this.f40937g = zzbgz;
        this.f40938h = ckVar;
        this.f40939i = aqVar;
        this.f40940j = btVar;
        this.f40941k = byc;
    }

    public final Object call() {
        Context context = this.f40931a;
        anp anp = this.f40932b;
        String str = this.f40933c;
        boolean z = this.f40934d;
        boolean z2 = this.f40935e;
        beh beh = this.f40936f;
        zzbgz zzbgz = this.f40937g;
        C15806ck ckVar = this.f40938h;
        C14956aq aqVar = this.f40939i;
        C14986bt btVar = this.f40940j;
        byc byc = this.f40941k;
        amn amn = new amn(new ano(context), anp, str, z, z2, beh, zzbgz, ckVar, aqVar, btVar, byc);
        aml aml = new aml(amn);
        aml.setWebViewClient(C14963ax.m30832b().mo28686a(aml, byc, z2));
        aml.setWebChromeClient(new C15585als(aml));
        return aml;
    }
}
