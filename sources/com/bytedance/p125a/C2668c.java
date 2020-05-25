package com.bytedance.p125a;

import org.json.JSONObject;

/* renamed from: com.bytedance.a.c */
public final class C2668c {

    /* renamed from: a */
    public String f8115a;

    /* renamed from: b */
    public String f8116b;

    /* renamed from: c */
    public int f8117c;

    /* renamed from: d */
    public int f8118d = -1;

    /* renamed from: e */
    public long f8119e;

    /* renamed from: f */
    public int f8120f = -1;

    /* renamed from: g */
    public long f8121g;

    /* renamed from: h */
    public int f8122h = -1;

    /* renamed from: i */
    int f8123i = -1;

    /* renamed from: j */
    JSONObject f8124j;

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("Record{scene='");
        sb.append(this.f8115a);
        sb.append('\'');
        sb.append(", subScene='");
        sb.append(this.f8116b);
        sb.append('\'');
        sb.append(", isFirst=");
        sb.append(this.f8117c);
        if (this.f8118d >= 0) {
            StringBuilder sb2 = new StringBuilder(", type=");
            sb2.append(this.f8118d);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f8120f >= 0) {
            StringBuilder sb3 = new StringBuilder(", status=");
            sb3.append(this.f8120f);
            str2 = sb3.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(", duration=");
        sb.append(this.f8121g);
        if (this.f8122h >= 0) {
            StringBuilder sb4 = new StringBuilder(", reason=");
            sb4.append(this.f8122h);
            str3 = sb4.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (this.f8123i >= 0) {
            StringBuilder sb5 = new StringBuilder(", code=");
            sb5.append(this.f8123i);
            str4 = sb5.toString();
        } else {
            str4 = "";
        }
        sb.append(str4);
        sb.append('}');
        return sb.toString();
    }
}
