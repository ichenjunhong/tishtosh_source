package com.bytedance.android.p173d.p174a.p175a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.android.d.a.a.c */
final class C2889c extends C2891a {

    /* renamed from: a */
    private final InputStream f8553a;

    /* renamed from: b */
    private final int f8554b;

    /* renamed from: b */
    public final byte mo7508b() throws IOException {
        return (byte) this.f8553a.read();
    }

    /* renamed from: a */
    public final boolean mo7507a() throws IOException {
        if (this.f8553a.available() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo7506a(long j) throws IOException {
        this.f8553a.skip(j);
    }

    C2889c(InputStream inputStream) {
        int i;
        this.f8553a = inputStream;
        try {
            i = inputStream.available();
        } catch (IOException unused) {
            i = -1;
        }
        this.f8554b = i;
    }

    /* renamed from: b */
    public final byte[] mo7509b(long j) throws IOException {
        byte[] bArr = new byte[((int) j)];
        this.f8553a.read(bArr);
        return bArr;
    }

    /* renamed from: c */
    public final String mo7510c(long j) throws IOException {
        return new String(mo7509b(j));
    }
}
