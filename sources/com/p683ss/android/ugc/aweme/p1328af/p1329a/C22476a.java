package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.af.a.a */
public abstract class C22476a implements C22529s {

    /* renamed from: a */
    public String f60537a;

    /* renamed from: b */
    public boolean f60538b;

    /* renamed from: c */
    public boolean f60539c;

    /* renamed from: b */
    public void mo46784b() {
        this.f60539c = false;
    }

    /* renamed from: a */
    public final String mo46782a() {
        String str = this.f60537a;
        if (str == null) {
            C52711k.m112237a("sessionId");
        }
        return str;
    }

    /* renamed from: a */
    public void mo46783a(String str, boolean z) {
        C52711k.m112240b(str, "id");
        this.f60537a = str;
        this.f60538b = z;
        this.f60539c = true;
    }
}
