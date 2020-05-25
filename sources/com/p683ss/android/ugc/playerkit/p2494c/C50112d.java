package com.p683ss.android.ugc.playerkit.p2494c;

/* renamed from: com.ss.android.ugc.playerkit.c.d */
public final class C50112d {

    /* renamed from: a */
    public String f125523a;

    /* renamed from: b */
    public boolean f125524b;

    /* renamed from: c */
    public boolean f125525c;

    /* renamed from: d */
    public int f125526d;

    /* renamed from: e */
    public int f125527e;

    /* renamed from: f */
    public Object f125528f;

    /* renamed from: g */
    public String f125529g;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaError{sourceId='");
        sb.append(this.f125523a);
        sb.append('\'');
        sb.append(", h265=");
        sb.append(this.f125524b);
        sb.append(", isDash=");
        sb.append(this.f125525c);
        sb.append(", errorCode=");
        sb.append(this.f125526d);
        sb.append(", errorExtra=");
        sb.append(this.f125527e);
        sb.append(", extraInfo=");
        sb.append(this.f125528f);
        sb.append(", playUrl='");
        sb.append(this.f125529g);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C50112d(String str, boolean z, int i, int i2, Object obj) {
        this.f125523a = str;
        this.f125524b = z;
        this.f125526d = i;
        this.f125527e = i2;
        this.f125528f = obj;
    }
}
