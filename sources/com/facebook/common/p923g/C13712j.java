package com.facebook.common.p923g;

import com.facebook.common.p920d.C13689i;
import java.io.InputStream;

/* renamed from: com.facebook.common.g.j */
public final class C13712j extends InputStream {

    /* renamed from: a */
    final C13709h f35686a;

    /* renamed from: b */
    int f35687b = 0;

    /* renamed from: c */
    int f35688c = 0;

    public final boolean markSupported() {
        return true;
    }

    public final void reset() {
        this.f35687b = this.f35688c;
    }

    public final int available() {
        return this.f35686a.mo25608a() - this.f35687b;
    }

    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        C13709h hVar = this.f35686a;
        int i = this.f35687b;
        this.f35687b = i + 1;
        return hVar.mo25607a(i) & 255;
    }

    public final void mark(int i) {
        this.f35688c = this.f35687b;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public C13712j(C13709h hVar) {
        C13689i.m27655a(!hVar.mo25612d());
        this.f35686a = (C13709h) C13689i.m27652a(hVar);
    }

    public final long skip(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        int min = Math.min((int) j, available());
        this.f35687b += min;
        return (long) min;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("length=");
            sb.append(bArr.length);
            sb.append("; regionStart=");
            sb.append(i);
            sb.append("; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f35686a.mo25609a(this.f35687b, bArr, i, min);
        this.f35687b += min;
        return min;
    }
}
