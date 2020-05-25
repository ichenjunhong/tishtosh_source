package com.p683ss.android.vesdk.runtime;

import java.io.File;

/* renamed from: com.ss.android.vesdk.runtime.b */
public final class C50765b {

    /* renamed from: a */
    public String f127510a;

    /* renamed from: b */
    public String[] f127511b;

    /* renamed from: c */
    public String[] f127512c;

    /* renamed from: d */
    public String[] f127513d;

    /* renamed from: e */
    public String[] f127514e;

    /* renamed from: f */
    public String[] f127515f;

    /* renamed from: g */
    public boolean f127516g;

    /* renamed from: h */
    public int f127517h;

    /* renamed from: i */
    public int f127518i;

    /* renamed from: j */
    public int f127519j;

    public C50765b(String str) {
        this.f127510a = str;
    }

    /* renamed from: a */
    public final String mo99453a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(C50772e.m109884a(this.f127510a, "concat"));
        sb.append(File.separator);
        sb.append(i);
        sb.append("_reverse");
        sb.append(".mp4");
        return sb.toString();
    }
}
