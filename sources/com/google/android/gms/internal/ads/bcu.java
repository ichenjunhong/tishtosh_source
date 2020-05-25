package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class bcu implements aaf {

    /* renamed from: a */
    private static bdf f41890a = bdf.m35439a(bcu.class);

    /* renamed from: b */
    private String f41891b;

    /* renamed from: c */
    boolean f41892c;

    /* renamed from: d */
    private abg f41893d;

    /* renamed from: e */
    private boolean f41894e;

    /* renamed from: f */
    private ByteBuffer f41895f;

    /* renamed from: g */
    private long f41896g;

    /* renamed from: h */
    private long f41897h;

    /* renamed from: i */
    private long f41898i = -1;

    /* renamed from: j */
    private bcz f41899j;

    /* renamed from: k */
    private ByteBuffer f41900k;

    /* renamed from: c */
    private final synchronized void m35417c() {
        if (!this.f41894e) {
            try {
                bdf bdf = f41890a;
                String str = "mem mapping ";
                String valueOf = String.valueOf(this.f41891b);
                bdf.mo30051a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                this.f41895f = this.f41899j.mo29079a(this.f41896g, this.f41898i);
                this.f41894e = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28715a(ByteBuffer byteBuffer);

    protected bcu(String str) {
        this.f41891b = str;
        this.f41894e = true;
        this.f41892c = true;
    }

    /* renamed from: a */
    public final void mo28572a(bcz bcz, ByteBuffer byteBuffer, long j, C16371xh xhVar) throws IOException {
        this.f41896g = bcz.mo29081b();
        this.f41897h = this.f41896g - ((long) byteBuffer.remaining());
        this.f41898i = j;
        this.f41899j = bcz;
        bcz.mo29080a(bcz.mo29081b() + j);
        this.f41894e = false;
        this.f41892c = false;
        mo30042b();
    }

    /* renamed from: b */
    public final synchronized void mo30042b() {
        m35417c();
        bdf bdf = f41890a;
        String str = "parsing details of ";
        String valueOf = String.valueOf(this.f41891b);
        bdf.mo30051a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (this.f41895f != null) {
            ByteBuffer byteBuffer = this.f41895f;
            this.f41892c = true;
            byteBuffer.rewind();
            mo28715a(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f41900k = byteBuffer.slice();
            }
            this.f41895f = null;
        }
    }

    /* renamed from: a */
    public final String mo28570a() {
        return this.f41891b;
    }

    /* renamed from: a */
    public final void mo28571a(abg abg) {
        this.f41893d = abg;
    }
}
