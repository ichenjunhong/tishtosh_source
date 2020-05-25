package org.msgpack.p2696b;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: org.msgpack.b.c */
abstract class C53791c implements C53797h {

    /* renamed from: a */
    protected byte[] f133395a;

    /* renamed from: b */
    protected int f133396b;

    /* renamed from: c */
    protected final int f133397c;

    /* renamed from: d */
    protected ByteBuffer f133398d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo113079b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: a */
    public void mo113078a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f133395a == null) {
            if (this.f133397c < i2) {
                mo113079b(bArr, i, i2);
                return;
            }
            mo113092a();
        }
        if (i2 <= this.f133397c - this.f133396b) {
            System.arraycopy(bArr, i, this.f133395a, this.f133396b, i2);
            this.f133396b += i2;
        } else if (i2 <= this.f133397c) {
            mo113079b(this.f133395a, 0, this.f133396b);
            mo113092a();
            this.f133396b = 0;
            System.arraycopy(bArr, i, this.f133395a, 0, i2);
            this.f133396b = i2;
        } else {
            flush();
            mo113079b(bArr, i, i2);
        }
    }

    /* renamed from: a */
    public void mo113077a(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        if (this.f133395a == null) {
            if (this.f133397c < remaining) {
                m114387b(byteBuffer);
                return;
            }
            mo113092a();
        }
        if (remaining <= this.f133397c - this.f133396b) {
            byteBuffer.get(this.f133395a, this.f133396b, remaining);
            this.f133396b += remaining;
        } else if (remaining <= this.f133397c) {
            mo113079b(this.f133395a, 0, this.f133396b);
            mo113092a();
            this.f133396b = 0;
            byteBuffer.get(this.f133395a, 0, remaining);
            this.f133396b = remaining;
        } else {
            flush();
            m114387b(byteBuffer);
        }
    }

    /* renamed from: a */
    public void mo113076a(byte b, short s) throws IOException {
        m114386a(3);
        byte[] bArr = this.f133395a;
        int i = this.f133396b;
        this.f133396b = i + 1;
        bArr[i] = b;
        this.f133398d.putShort(this.f133396b, s);
        this.f133396b += 2;
    }

    /* renamed from: a */
    private void mo113092a() {
        this.f133395a = new byte[this.f133397c];
        this.f133398d = ByteBuffer.wrap(this.f133395a);
    }

    public void flush() throws IOException {
        if (this.f133396b > 0) {
            mo113079b(this.f133395a, 0, this.f133396b);
            this.f133395a = null;
            this.f133396b = 0;
        }
    }

    public C53791c(int i) {
        if (i < 9) {
            i = 9;
        }
        this.f133397c = i;
    }

    /* renamed from: a */
    public void mo113070a(byte b) throws IOException {
        m114386a(1);
        byte[] bArr = this.f133395a;
        int i = this.f133396b;
        this.f133396b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    private void m114386a(int i) throws IOException {
        if (this.f133395a == null) {
            mo113092a();
            return;
        }
        if (this.f133397c - this.f133396b < i) {
            mo113079b(this.f133395a, 0, this.f133396b);
            this.f133395a = new byte[this.f133397c];
            this.f133398d = ByteBuffer.wrap(this.f133395a);
            this.f133396b = 0;
        }
    }

    /* renamed from: b */
    private void m114387b(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            mo113079b(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        mo113079b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void mo113071a(byte b, byte b2) throws IOException {
        m114386a(2);
        byte[] bArr = this.f133395a;
        int i = this.f133396b;
        this.f133396b = i + 1;
        bArr[i] = b;
        byte[] bArr2 = this.f133395a;
        int i2 = this.f133396b;
        this.f133396b = i2 + 1;
        bArr2[i2] = b2;
    }

    /* renamed from: a */
    public void mo113072a(byte b, double d) throws IOException {
        m114386a(9);
        byte[] bArr = this.f133395a;
        int i = this.f133396b;
        this.f133396b = i + 1;
        bArr[i] = b;
        this.f133398d.putDouble(this.f133396b, d);
        this.f133396b += 8;
    }

    /* renamed from: a */
    public void mo113073a(byte b, float f) throws IOException {
        m114386a(5);
        byte[] bArr = this.f133395a;
        int i = this.f133396b;
        this.f133396b = i + 1;
        bArr[i] = b;
        this.f133398d.putFloat(this.f133396b, f);
        this.f133396b += 4;
    }

    /* renamed from: a */
    public void mo113074a(byte b, int i) throws IOException {
        m114386a(5);
        byte[] bArr = this.f133395a;
        int i2 = this.f133396b;
        this.f133396b = i2 + 1;
        bArr[i2] = b;
        this.f133398d.putInt(this.f133396b, i);
        this.f133396b += 4;
    }

    /* renamed from: a */
    public void mo113075a(byte b, long j) throws IOException {
        m114386a(9);
        byte[] bArr = this.f133395a;
        int i = this.f133396b;
        this.f133396b = i + 1;
        bArr[i] = b;
        this.f133398d.putLong(this.f133396b, j);
        this.f133396b += 8;
    }
}
