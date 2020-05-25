package org.msgpack.p2696b;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: org.msgpack.b.g */
public final class C53795g extends C53791c {

    /* renamed from: e */
    private LinkedList<C53796a> f133405e = new LinkedList<>();

    /* renamed from: f */
    private int f133406f;

    /* renamed from: org.msgpack.b.g$a */
    static final class C53796a {

        /* renamed from: a */
        final byte[] f133407a;

        /* renamed from: b */
        final int f133408b;

        /* renamed from: c */
        final int f133409c;

        C53796a(byte[] bArr, int i, int i2) {
            this.f133407a = bArr;
            this.f133408b = i;
            this.f133409c = i2;
        }
    }

    public final void close() {
    }

    public final /* bridge */ /* synthetic */ void flush() throws IOException {
        super.flush();
    }

    /* renamed from: a */
    public final byte[] mo113092a() {
        byte[] bArr = new byte[(this.f133406f + this.f133396b)];
        Iterator it = this.f133405e.iterator();
        int i = 0;
        while (it.hasNext()) {
            C53796a aVar = (C53796a) it.next();
            System.arraycopy(aVar.f133407a, aVar.f133408b, bArr, i, aVar.f133409c);
            i += aVar.f133409c;
        }
        if (this.f133396b > 0) {
            System.arraycopy(this.f133395a, 0, bArr, i, this.f133396b);
        }
        return bArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo113070a(byte b) throws IOException {
        super.mo113070a(b);
    }

    public C53795g(int i) {
        super(i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo113077a(ByteBuffer byteBuffer) throws IOException {
        super.mo113077a(byteBuffer);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo113071a(byte b, byte b2) throws IOException {
        super.mo113071a(b, b2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo113072a(byte b, double d) throws IOException {
        super.mo113072a(b, d);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo113073a(byte b, float f) throws IOException {
        super.mo113073a(b, f);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo113074a(byte b, int i) throws IOException {
        super.mo113074a(b, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo113075a(byte b, long j) throws IOException {
        super.mo113075a(b, j);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo113076a(byte b, short s) throws IOException {
        super.mo113076a(b, s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo113079b(byte[] bArr, int i, int i2) {
        this.f133405e.add(new C53796a(bArr, i, i2));
        this.f133406f += i2;
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo113078a(byte[] bArr, int i, int i2) throws IOException {
        super.mo113078a(bArr, i, i2);
    }
}
