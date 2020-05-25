package com.facebook.common.p923g;

import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p924h.C13718c;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.g.g */
public final class C13708g extends InputStream {

    /* renamed from: a */
    private final InputStream f35680a;

    /* renamed from: b */
    private final byte[] f35681b;

    /* renamed from: c */
    private final C13718c<byte[]> f35682c;

    /* renamed from: d */
    private int f35683d = 0;

    /* renamed from: e */
    private int f35684e = 0;

    /* renamed from: f */
    private boolean f35685f = false;

    /* renamed from: b */
    private void m27731b() throws IOException {
        if (this.f35685f) {
            throw new IOException("stream already closed");
        }
    }

    /* renamed from: a */
    private boolean m27730a() throws IOException {
        if (this.f35684e < this.f35683d) {
            return true;
        }
        int read = this.f35680a.read(this.f35681b);
        if (read <= 0) {
            return false;
        }
        this.f35683d = read;
        this.f35684e = 0;
        return true;
    }

    public final int available() throws IOException {
        boolean z;
        if (this.f35684e <= this.f35683d) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27657b(z);
        m27731b();
        return (this.f35683d - this.f35684e) + this.f35680a.available();
    }

    public final void close() throws IOException {
        if (!this.f35685f) {
            this.f35685f = true;
            this.f35682c.mo25600a(this.f35681b);
            super.close();
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (!this.f35685f) {
            C13697a.m27695c("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    public final int read() throws IOException {
        boolean z;
        if (this.f35684e <= this.f35683d) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27657b(z);
        m27731b();
        if (!m27730a()) {
            return -1;
        }
        byte[] bArr = this.f35681b;
        int i = this.f35684e;
        this.f35684e = i + 1;
        return bArr[i] & 255;
    }

    public final long skip(long j) throws IOException {
        boolean z;
        if (this.f35684e <= this.f35683d) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27657b(z);
        m27731b();
        long j2 = (long) (this.f35683d - this.f35684e);
        if (j2 >= j) {
            this.f35684e = (int) (((long) this.f35684e) + j);
            return j;
        }
        this.f35684e = this.f35683d;
        return j2 + this.f35680a.skip(j - j2);
    }

    public C13708g(InputStream inputStream, byte[] bArr, C13718c<byte[]> cVar) {
        this.f35680a = (InputStream) C13689i.m27652a(inputStream);
        this.f35681b = (byte[]) C13689i.m27652a(bArr);
        this.f35682c = (C13718c) C13689i.m27652a(cVar);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        if (this.f35684e <= this.f35683d) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27657b(z);
        m27731b();
        if (!m27730a()) {
            return -1;
        }
        int min = Math.min(this.f35683d - this.f35684e, i2);
        System.arraycopy(this.f35681b, this.f35684e, bArr, i, min);
        this.f35684e += min;
        return min;
    }
}
