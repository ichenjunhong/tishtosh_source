package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.x */
public final class C45321x {

    /* renamed from: a */
    public final String f114578a;

    /* renamed from: b */
    public final C45320w f114579b;

    /* renamed from: c */
    public float f114580c;

    /* renamed from: d */
    public float f114581d;

    /* renamed from: e */
    public float f114582e;

    /* renamed from: f */
    public float f114583f;

    /* renamed from: g */
    public String f114584g;

    /* renamed from: h */
    public String f114585h;

    /* renamed from: i */
    public boolean f114586i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.x$a */
    public static final class C45322a {

        /* renamed from: a */
        public final float f114587a;

        /* renamed from: b */
        public final float f114588b;

        /* renamed from: c */
        public final String f114589c;

        public C45322a(float f, float f2, String str) {
            C52711k.m112240b(str, C22858c.f61208d);
            this.f114587a = f;
            this.f114588b = f2;
            this.f114589c = str;
        }
    }

    /* renamed from: a */
    public final C45322a mo91598a() {
        if (!this.f114586i) {
            return null;
        }
        return new C45322a(this.f114580c, this.f114580c - this.f114582e, toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Record(creationId='");
        sb.append(this.f114578a);
        sb.append("', type=");
        sb.append(this.f114579b);
        sb.append(", initMB=");
        sb.append(this.f114580c);
        sb.append(", beforeCompileMB=");
        sb.append(this.f114581d);
        sb.append(", afterCompileMB=");
        sb.append(this.f114582e);
        sb.append(", compileFileMB=");
        sb.append(this.f114583f);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo91599a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f114584g = str;
    }

    /* renamed from: b */
    public final void mo91600b(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f114585h = str;
    }

    private C45321x(String str, C45320w wVar, float f, float f2, float f3, float f4, String str2, String str3, boolean z) {
        C52711k.m112240b(str, "creationId");
        C52711k.m112240b(wVar, "type");
        C52711k.m112240b(str2, "contentType");
        C52711k.m112240b(str3, "errorInfo");
        this.f114578a = str;
        this.f114579b = wVar;
        this.f114580c = f;
        this.f114581d = f2;
        this.f114582e = f3;
        this.f114583f = f4;
        this.f114584g = str2;
        this.f114585h = str3;
        this.f114586i = z;
    }

    public /* synthetic */ C45321x(String str, C45320w wVar, float f, float f2, float f3, float f4, String str2, String str3, boolean z, int i, C52707g gVar) {
        this(str, wVar, 0.0f, 0.0f, 0.0f, 0.0f, "", "", true);
    }
}
