package com.bytedance.android.p173d.p176b;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.android.d.b.c */
public final class C2911c {

    /* renamed from: a */
    public ByteBuffer f8588a;

    /* renamed from: b */
    private int f8589b;

    C2911c() {
    }

    /* renamed from: b */
    public final byte mo7549b() {
        return this.f8588a.get();
    }

    /* renamed from: a */
    public final boolean mo7547a() {
        if (this.f8589b - this.f8588a.position() <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo7551c() {
        return ((this.f8588a.get() & 255) << 24) | ((this.f8588a.get() & 255) << 16) | ((this.f8588a.get() & 255) << 8) | (this.f8588a.get() & 255);
    }

    /* renamed from: d */
    public final long mo7552d() {
        return (((long) (this.f8588a.get() & 255)) << 56) | (((long) (this.f8588a.get() & 255)) << 48) | (((long) (this.f8588a.get() & 255)) << 40) | (((long) (this.f8588a.get() & 255)) << 32) | ((long) ((this.f8588a.get() & 255) << 24)) | ((long) ((this.f8588a.get() & 255) << 16)) | ((long) ((this.f8588a.get() & 255) << 8)) | ((long) (this.f8588a.get() & 255));
    }

    /* renamed from: b */
    public final String mo7550b(long j) {
        return new String(mo7548a(j), Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public final byte[] mo7548a(long j) {
        byte[] bArr = new byte[((int) j)];
        this.f8588a.get(bArr);
        return bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C2911c mo7546a(ByteBuffer byteBuffer, int i, int i2) {
        this.f8588a = byteBuffer;
        this.f8589b = i2 + i;
        byteBuffer.position(i);
        return this;
    }
}
