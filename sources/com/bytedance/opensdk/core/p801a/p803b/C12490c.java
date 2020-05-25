package com.bytedance.opensdk.core.p801a.p803b;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.core.a.b.c */
public final class C12490c extends C12488a {

    /* renamed from: a */
    public final String f32809a;

    /* renamed from: b */
    public final String f32810b;

    /* renamed from: c */
    public final String f32811c;

    /* renamed from: d */
    public final String f32812d;

    /* renamed from: e */
    public final int f32813e;

    /* renamed from: f */
    public final String f32814f;

    private C12490c(String str, String str2, String str3, String str4, int i, String str5) {
        C52711k.m112240b(str, "ticketDomain");
        C52711k.m112240b(str2, "codeDomain");
        C52711k.m112240b(str3, "responseType");
        C52711k.m112240b(str4, "scope");
        C52711k.m112240b(str5, "clientKey");
        this.f32809a = str;
        this.f32810b = str2;
        this.f32811c = str3;
        this.f32812d = str4;
        this.f32813e = i;
        this.f32814f = str5;
    }

    public /* synthetic */ C12490c(String str, String str2, String str3, String str4, int i, String str5, int i2, C52707g gVar) {
        this(str, str2, "code", "user_info", i, str5);
    }
}
