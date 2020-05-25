package com.bytedance.p763l.p765b;

import android.app.PendingIntent;

/* renamed from: com.bytedance.l.b.a */
public final class C12150a {

    /* renamed from: a */
    public String f32069a;

    /* renamed from: b */
    public int f32070b;

    /* renamed from: c */
    public int f32071c;

    /* renamed from: d */
    public long f32072d;

    /* renamed from: e */
    public long f32073e;

    /* renamed from: f */
    public long f32074f;

    /* renamed from: g */
    public int f32075g;

    /* renamed from: h */
    public PendingIntent f32076h;

    /* renamed from: i */
    public Exception f32077i;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MorpheusState{packageName='");
        sb.append(this.f32069a);
        sb.append('\'');
        sb.append(", versionCode=");
        sb.append(this.f32070b);
        sb.append(", status=");
        sb.append(this.f32071c);
        sb.append(", totalBytesToDownload=");
        sb.append(this.f32072d);
        sb.append(", bytesDownloaded=");
        sb.append(this.f32073e);
        sb.append(", downloadTime=");
        sb.append(this.f32074f);
        sb.append(", errorCode=");
        sb.append(this.f32075g);
        sb.append(", resolutionIntent=");
        sb.append(this.f32076h);
        sb.append(", exception=");
        sb.append(this.f32077i);
        sb.append('}');
        return sb.toString();
    }

    public C12150a(String str, int i, int i2) {
        this.f32069a = str;
        this.f32070b = i;
        this.f32071c = i2;
    }
}
