package com.google.android.gms.internal.ads;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ti */
public final class C16264ti extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C15973io f45609a;

    public C16264ti(C15973io ioVar, int i) {
        this.f45609a = ioVar;
        this.buf = this.f45609a.mo31100a(Math.max(i, UnReadVideoExperiment.BROWSE_RECORD_LIST));
    }

    public final void close() throws IOException {
        this.f45609a.mo31099a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f45609a.mo31099a(this.buf);
    }

    /* renamed from: a */
    private final void m38830a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] a = this.f45609a.mo31100a((this.count + i) << 1);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f45609a.mo31099a(this.buf);
            this.buf = a;
        }
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m38830a(i2);
        super.write(bArr, i, i2);
    }

    public final synchronized void write(int i) {
        m38830a(1);
        super.write(i);
    }
}
