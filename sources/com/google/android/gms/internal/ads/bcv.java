package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public class bcv extends bcx implements aaf {

    /* renamed from: f */
    private abg f41901f;

    /* renamed from: g */
    private String f41902g;

    /* renamed from: h */
    private boolean f41903h;

    /* renamed from: i */
    private long f41904i;

    public bcv(String str) {
        this.f41902g = str;
    }

    /* renamed from: a */
    public final void mo28571a(abg abg) {
        this.f41901f = abg;
    }

    /* renamed from: a */
    public final String mo28570a() {
        return this.f41902g;
    }

    /* renamed from: a */
    public final void mo28572a(bcz bcz, ByteBuffer byteBuffer, long j, C16371xh xhVar) throws IOException {
        this.f41904i = bcz.mo29081b() - ((long) byteBuffer.remaining());
        this.f41903h = byteBuffer.remaining() == 16;
        mo30043a(bcz, j, xhVar);
    }

    /* renamed from: a */
    public final void mo30043a(bcz bcz, long j, C16371xh xhVar) throws IOException {
        this.f41910b = bcz;
        this.f41911c = bcz.mo29081b();
        this.f41912d = this.f41911c - ((long) ((this.f41903h || 8 + j >= 4294967296L) ? 16 : 8));
        bcz.mo29080a(bcz.mo29081b() + j);
        this.f41913e = bcz.mo29081b();
        this.f41909a = xhVar;
    }
}
