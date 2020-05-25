package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

public final class adh extends bcw {

    /* renamed from: a */
    public long f40291a;

    /* renamed from: b */
    public long f40292b;

    /* renamed from: f */
    private Date f40293f;

    /* renamed from: g */
    private Date f40294g;

    /* renamed from: h */
    private double f40295h = 1.0d;

    /* renamed from: i */
    private float f40296i = 1.0f;

    /* renamed from: j */
    private bdg f40297j = bdg.f41924a;

    /* renamed from: k */
    private long f40298k;

    /* renamed from: l */
    private int f40299l;

    /* renamed from: m */
    private int f40300m;

    /* renamed from: n */
    private int f40301n;

    /* renamed from: o */
    private int f40302o;

    /* renamed from: p */
    private int f40303p;

    /* renamed from: q */
    private int f40304q;

    public adh() {
        super("mvhd");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MovieHeaderBox[");
        sb.append("creationTime=");
        sb.append(this.f40293f);
        sb.append(";");
        sb.append("modificationTime=");
        sb.append(this.f40294g);
        sb.append(";");
        sb.append("timescale=");
        sb.append(this.f40291a);
        sb.append(";");
        sb.append("duration=");
        sb.append(this.f40292b);
        sb.append(";");
        sb.append("rate=");
        sb.append(this.f40295h);
        sb.append(";");
        sb.append("volume=");
        sb.append(this.f40296i);
        sb.append(";");
        sb.append("matrix=");
        sb.append(this.f40297j);
        sb.append(";");
        sb.append("nextTrackId=");
        sb.append(this.f40298k);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo28715a(ByteBuffer byteBuffer) {
        this.f41905d = C16425zh.m39224a(byteBuffer.get());
        this.f41906e = (C16425zh.m39226b(byteBuffer) << 8) + 0 + C16425zh.m39224a(byteBuffer.get());
        if (!this.f41892c) {
            mo30042b();
        }
        if (this.f41905d == 1) {
            this.f40293f = bdb.m35437a(C16425zh.m39227c(byteBuffer));
            this.f40294g = bdb.m35437a(C16425zh.m39227c(byteBuffer));
            this.f40291a = C16425zh.m39225a(byteBuffer);
            this.f40292b = C16425zh.m39227c(byteBuffer);
        } else {
            this.f40293f = bdb.m35437a(C16425zh.m39225a(byteBuffer));
            this.f40294g = bdb.m35437a(C16425zh.m39225a(byteBuffer));
            this.f40291a = C16425zh.m39225a(byteBuffer);
            this.f40292b = C16425zh.m39225a(byteBuffer);
        }
        this.f40295h = C16425zh.m39228d(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f40296i = ((float) ((short) ((bArr[1] & 255) | ((short) (0 | ((bArr[0] << 8) & 65280)))))) / 256.0f;
        C16425zh.m39226b(byteBuffer);
        C16425zh.m39225a(byteBuffer);
        C16425zh.m39225a(byteBuffer);
        double d = C16425zh.m39228d(byteBuffer);
        double d2 = C16425zh.m39228d(byteBuffer);
        double e = C16425zh.m39229e(byteBuffer);
        bdg bdg = new bdg(d, d2, C16425zh.m39228d(byteBuffer), C16425zh.m39228d(byteBuffer), e, C16425zh.m39229e(byteBuffer), C16425zh.m39229e(byteBuffer), C16425zh.m39228d(byteBuffer), C16425zh.m39228d(byteBuffer));
        this.f40297j = bdg;
        this.f40299l = byteBuffer.getInt();
        this.f40300m = byteBuffer.getInt();
        this.f40301n = byteBuffer.getInt();
        this.f40302o = byteBuffer.getInt();
        this.f40303p = byteBuffer.getInt();
        this.f40304q = byteBuffer.getInt();
        this.f40298k = C16425zh.m39225a(byteBuffer);
    }
}
