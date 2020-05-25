package com.p683ss.android.ugc.asve.p1239c;

import com.p683ss.android.vesdk.C50657c;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.C50720o.C50749j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.c.e */
public final class C20349e extends C20348d {

    /* renamed from: a */
    public int[] f55846a;

    /* renamed from: b */
    public int[] f55847b;

    /* renamed from: c */
    public String[] f55848c;

    /* renamed from: d */
    public String[] f55849d;

    /* renamed from: e */
    public int[] f55850e;

    /* renamed from: f */
    public int[] f55851f;

    /* renamed from: g */
    public float[] f55852g;

    /* renamed from: h */
    public C50657c[] f55853h;

    /* renamed from: i */
    public C50749j f55854i = C50749j.VIDEO_OUT_RATIO_ORIGINAL;

    /* renamed from: j */
    public String[] f55855j;

    /* renamed from: a */
    public final void mo43100a(C50749j jVar) {
        C52711k.m112240b(jVar, "<set-?>");
        this.f55854i = jVar;
    }

    public C20349e(String[] strArr) {
        C52711k.m112240b(strArr, "videoFilePaths");
        this.f55855j = strArr;
    }

    /* renamed from: a */
    public final int mo43099a(C50720o oVar, boolean z) {
        C52711k.m112240b(oVar, "editor");
        if (this.f55846a == null || this.f55847b == null) {
            return oVar.mo99324a(this.f55855j, this.f55848c, this.f55849d, this.f55854i);
        }
        return oVar.mo99322a(this.f55855j, this.f55846a, this.f55847b, this.f55848c, this.f55849d, this.f55850e, this.f55851f, this.f55852g, this.f55852g, this.f55853h, this.f55854i);
    }
}
