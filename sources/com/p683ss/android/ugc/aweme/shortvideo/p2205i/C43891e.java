package com.p683ss.android.ugc.aweme.shortvideo.p2205i;

import com.p683ss.android.ugc.aweme.shortvideo.C42421al;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i.e */
public class C43891e {

    /* renamed from: a */
    public int f111147a;

    /* renamed from: b */
    public int f111148b;

    /* renamed from: c */
    public int f111149c;

    /* renamed from: d */
    public Object f111150d;

    /* renamed from: e */
    public String f111151e;

    /* renamed from: f */
    public boolean f111152f;

    /* renamed from: g */
    public boolean f111153g;

    /* renamed from: h */
    public C42421al f111154h;

    /* renamed from: i */
    public boolean f111155i;

    /* renamed from: j */
    public String f111156j;

    /* renamed from: k */
    public boolean f111157k;

    /* renamed from: l */
    public boolean f111158l;

    public String toString() {
        StringBuilder sb = new StringBuilder("PublishStatus{status=");
        sb.append(this.f111148b);
        sb.append(", progress=");
        sb.append(this.f111149c);
        sb.append(", params=");
        sb.append(this.f111150d);
        sb.append('}');
        return sb.toString();
    }

    public C43891e(int i) {
        this.f111148b = 2;
    }

    public C43891e(int i, int i2, Object obj) {
        this(10, 100, obj, null);
    }

    public C43891e(int i, int i2, Object obj, String str) {
        this.f111150d = obj;
        this.f111149c = i2;
        this.f111148b = i;
        this.f111151e = str;
    }
}
