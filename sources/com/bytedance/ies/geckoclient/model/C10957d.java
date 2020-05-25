package com.bytedance.ies.geckoclient.model;

/* renamed from: com.bytedance.ies.geckoclient.model.d */
public final class C10957d {

    /* renamed from: a */
    public int f29401a;

    /* renamed from: b */
    public int f29402b;

    /* renamed from: c */
    public String f29403c;

    /* renamed from: d */
    public String f29404d;

    /* renamed from: e */
    public String f29405e;

    /* renamed from: f */
    public String f29406f;

    /* renamed from: g */
    public int f29407g;

    /* renamed from: h */
    public String f29408h;

    /* renamed from: i */
    public boolean f29409i;

    /* renamed from: j */
    public C10963j f29410j;

    /* renamed from: k */
    public Exception f29411k;

    /* renamed from: l */
    public int f29412l;

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeckoPackage{version=");
        sb.append(this.f29401a);
        sb.append(", updateWhenLaunch=");
        sb.append(this.f29402b);
        sb.append(", channel='");
        sb.append(this.f29403c);
        sb.append('\'');
        sb.append(", dir='");
        sb.append(this.f29404d);
        sb.append('\'');
        sb.append(", zipName='");
        sb.append(this.f29405e);
        sb.append('\'');
        sb.append(", patchName='");
        sb.append(this.f29406f);
        sb.append('\'');
        sb.append(", packageType=");
        sb.append(this.f29407g);
        sb.append(", extra='");
        sb.append(this.f29408h);
        sb.append('\'');
        sb.append(", isLocalInfoStored=");
        sb.append(this.f29409i);
        sb.append(", updatePackage=");
        sb.append(this.f29410j);
        sb.append(", e=");
        sb.append(this.f29411k);
        sb.append(", errorCode=");
        sb.append(this.f29412l);
        sb.append('}');
        return sb.toString();
    }

    public C10957d(String str) {
        this.f29403c = str;
    }
}
