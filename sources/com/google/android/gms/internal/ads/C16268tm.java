package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.tm */
final /* synthetic */ class C16268tm implements Runnable {

    /* renamed from: a */
    private final C16266tk f45626a;

    /* renamed from: b */
    private final boolean f45627b = true;

    /* renamed from: c */
    private final agl f45628c;

    /* renamed from: d */
    private final String f45629d;

    /* renamed from: e */
    private final String f45630e;

    C16268tm(C16266tk tkVar, boolean z, agl agl, String str, String str2) {
        this.f45626a = tkVar;
        this.f45628c = agl;
        this.f45629d = str;
        this.f45630e = str2;
    }

    public final void run() {
        C16266tk tkVar = this.f45626a;
        boolean z = this.f45627b;
        agl agl = this.f45628c;
        String str = this.f45629d;
        String str2 = this.f45630e;
        try {
            ama a = tkVar.mo31406a();
            if (z) {
                a.mo29153a(anp.m33675c());
            } else {
                a.mo29153a(anp.m33674b());
            }
            tkVar.f45610a.f38515k = a;
            WeakReference weakReference = new WeakReference(a);
            a.mo29197w().mo29205a(tkVar.mo31405a(weakReference), tkVar.mo31408b(weakReference));
            tkVar.mo31407a(a, z);
            a.mo29197w().mo29207a((ank) new C16269tn(tkVar, agl, a));
            a.mo29158a(str, str2, null);
        } catch (Exception e) {
            abv.m32795c("Exception occurred while getting video view", e);
            agl.mo28823b(null);
        }
    }
}
