package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14956aq;
import com.google.android.gms.ads.internal.C14986bt;
import java.util.concurrent.Callable;

final /* synthetic */ class anx implements Callable {

    /* renamed from: a */
    private final Context f41103a;

    /* renamed from: b */
    private final anp f41104b;

    /* renamed from: c */
    private final String f41105c;

    /* renamed from: d */
    private final boolean f41106d;

    /* renamed from: e */
    private final boolean f41107e;

    /* renamed from: f */
    private final beh f41108f;

    /* renamed from: g */
    private final zzbgz f41109g;

    /* renamed from: h */
    private final C15806ck f41110h;

    /* renamed from: i */
    private final C14956aq f41111i;

    /* renamed from: j */
    private final C14986bt f41112j;

    anx(Context context, anp anp, String str, boolean z, boolean z2, beh beh, zzbgz zzbgz, C15806ck ckVar, C14956aq aqVar, C14986bt btVar) {
        this.f41103a = context;
        this.f41104b = anp;
        this.f41105c = str;
        this.f41106d = z;
        this.f41107e = z2;
        this.f41108f = beh;
        this.f41109g = zzbgz;
        this.f41110h = ckVar;
        this.f41111i = aqVar;
        this.f41112j = btVar;
    }

    public final Object call() {
        Context context = this.f41103a;
        anp anp = this.f41104b;
        String str = this.f41105c;
        boolean z = this.f41106d;
        boolean z2 = this.f41107e;
        beh beh = this.f41108f;
        zzbgz zzbgz = this.f41109g;
        C15806ck ckVar = this.f41110h;
        C14956aq aqVar = this.f41111i;
        C14986bt btVar = this.f41112j;
        anq anq = new anq();
        any any = new any(new ano(context), anq, anp, str, z, z2, beh, zzbgz, ckVar, aqVar, btVar);
        ReferenceT aml = new aml(any);
        any.setWebChromeClient(new C15585als(aml));
        C16216ro roVar = new C16216ro(aml, aml.mo29186r(), new C15721bh(aml.getContext()));
        anq.f41068a = aml;
        anq.f41079l = z2;
        anq.f41081n = roVar;
        anq.f41082o = null;
        anq.f41069b.f45160b = aml;
        return aml;
    }
}
