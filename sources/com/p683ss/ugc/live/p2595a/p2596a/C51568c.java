package com.p683ss.ugc.live.p2595a.p2596a;

import java.util.Arrays;

/* renamed from: com.ss.ugc.live.a.a.c */
public final class C51568c {

    /* renamed from: a */
    public final long f128817a;

    /* renamed from: b */
    public final String[] f128818b;

    /* renamed from: c */
    public long f128819c;

    /* renamed from: d */
    public String f128820d;

    /* renamed from: e */
    public boolean f128821e;

    /* renamed from: f */
    public boolean f128822f;

    /* renamed from: g */
    public int f128823g = -1;

    /* renamed from: a */
    public final String mo105497a() {
        return this.f128818b[0];
    }

    /* renamed from: c */
    public final void mo105499c() {
        this.f128823g++;
    }

    /* renamed from: b */
    public final String mo105498b() {
        return this.f128818b[Math.min(this.f128823g, this.f128818b.length - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetResourceRequest{mId=");
        sb.append(this.f128817a);
        sb.append(", mUrls='");
        sb.append(Arrays.toString(this.f128818b));
        sb.append('\'');
        sb.append(", mMd5='");
        sb.append(this.f128820d);
        sb.append('\'');
        sb.append(", mSourceFrom='");
        sb.append(this.f128819c);
        sb.append('\'');
        sb.append(", mNeedToUnzip=");
        sb.append(this.f128821e);
        sb.append('}');
        return sb.toString();
    }

    public C51568c(long j, String[] strArr, String str, long j2, boolean z) {
        this.f128817a = j;
        this.f128818b = strArr;
        this.f128820d = str;
        this.f128819c = j2;
        this.f128821e = true;
    }
}
