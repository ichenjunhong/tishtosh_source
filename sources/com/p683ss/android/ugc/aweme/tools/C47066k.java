package com.p683ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.k */
public final class C47066k extends C46933c {

    /* renamed from: a */
    public final long f118849a;

    /* renamed from: b */
    public final String f118850b;

    /* renamed from: c */
    public final String f118851c;

    /* renamed from: d */
    public final String f118852d;

    /* renamed from: e */
    public final int f118853e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConcatFinishedEvent{concatStartTime=");
        sb.append(this.f118849a);
        sb.append(", videoPath='");
        sb.append(this.f118850b);
        sb.append('\'');
        sb.append(", audioPath='");
        sb.append(this.f118851c);
        sb.append('\'');
        sb.append(", statusCode=");
        sb.append(this.f118853e);
        sb.append(", metadata= ");
        sb.append(this.f118852d);
        sb.append('}');
        return sb.toString();
    }

    public C47066k(long j, String str, String str2, String str3, int i) {
        this.f118849a = j;
        this.f118850b = str;
        this.f118851c = str2;
        this.f118853e = i;
        this.f118852d = str3;
    }
}
