package com.p683ss.android.ugc.asve.p1239c;

import com.p683ss.android.vesdk.C50720o;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.c.g */
public final class C20351g extends C20348d {

    /* renamed from: a */
    public String f55858a;

    /* renamed from: b */
    public String[] f55859b;

    /* renamed from: c */
    public String[] f55860c;

    /* renamed from: d */
    public String f55861d;

    /* renamed from: e */
    public int f55862e;

    /* renamed from: f */
    public int f55863f;

    public C20351g(String str, String[] strArr, String[] strArr2) {
        this(str, strArr, strArr2, null, 0, 0, 56, null);
    }

    /* renamed from: a */
    public final int mo43099a(C50720o oVar, boolean z) {
        C52711k.m112240b(oVar, "editor");
        if (z) {
            return oVar.mo99314a(this.f55858a, this.f55859b, this.f55860c);
        }
        return oVar.mo99315a(this.f55858a, this.f55859b, this.f55860c, this.f55861d, this.f55862e, this.f55863f);
    }

    public C20351g(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) {
        C52711k.m112240b(str, "mvPath");
        C52711k.m112240b(strArr, "resourcesFilePaths");
        C52711k.m112240b(strArr2, "resourcesTypes");
        this.f55858a = str;
        this.f55859b = strArr;
        this.f55860c = strArr2;
        this.f55861d = str2;
        this.f55862e = i;
        this.f55863f = i2;
    }

    public /* synthetic */ C20351g(String str, String[] strArr, String[] strArr2, String str2, int i, int i2, int i3, C52707g gVar) {
        this(str, strArr, strArr2, null, 0, 0);
    }
}
