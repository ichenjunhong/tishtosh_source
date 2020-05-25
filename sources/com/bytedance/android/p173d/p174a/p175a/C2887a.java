package com.bytedance.android.p173d.p174a.p175a;

import java.nio.charset.Charset;

/* renamed from: com.bytedance.android.d.a.a.a */
final class C2887a extends C2891a {

    /* renamed from: a */
    private final byte[] f8551a;

    /* renamed from: b */
    private int f8552b;

    /* renamed from: a */
    public final boolean mo7507a() {
        if (this.f8551a.length - this.f8552b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final byte mo7508b() {
        byte[] bArr = this.f8551a;
        int i = this.f8552b;
        this.f8552b = i + 1;
        return bArr[i];
    }

    C2887a(byte[] bArr) {
        this.f8551a = bArr;
    }

    /* renamed from: a */
    public final void mo7506a(long j) {
        this.f8552b = (int) (((long) this.f8552b) + j);
    }

    /* renamed from: b */
    public final byte[] mo7509b(long j) {
        int i = (int) j;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f8551a, this.f8552b, bArr, 0, i);
        this.f8552b += i;
        return bArr;
    }

    /* renamed from: c */
    public final String mo7510c(long j) {
        String str = new String(this.f8551a, this.f8552b, (int) j, Charset.forName("UTF-8"));
        this.f8552b = (int) (((long) this.f8552b) + j);
        return str;
    }
}
