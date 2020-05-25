package com.p683ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.n */
public final class C50719n {

    /* renamed from: a */
    public String f127281a;

    /* renamed from: b */
    public String f127282b;

    /* renamed from: c */
    public float f127283c;

    /* renamed from: d */
    public float f127284d;

    /* renamed from: e */
    public float f127285e;

    /* renamed from: f */
    public boolean f127286f;

    /* renamed from: g */
    public boolean f127287g;

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"mDuetVideoPath\":\"");
        sb.append(this.f127281a);
        sb.append('\"');
        sb.append(",\"mDuetAudioPath\":\"");
        sb.append(this.f127282b);
        sb.append('\"');
        sb.append(",\"mXInPercent\":");
        sb.append(this.f127283c);
        sb.append(",\"mYInPercent\":");
        sb.append(this.f127284d);
        sb.append(",\"mAlpha\":");
        sb.append(this.f127285e);
        sb.append(",\"mIsFitMode\":");
        sb.append(this.f127286f);
        sb.append(",\"enableV2\":");
        sb.append(this.f127287g);
        sb.append('}');
        return sb.toString();
    }

    public C50719n(String str, String str2, float f, float f2, float f3, boolean z) {
        this.f127281a = str;
        this.f127282b = str2;
        this.f127283c = f;
        this.f127284d = f2;
        this.f127285e = f3;
        this.f127286f = z;
    }
}
