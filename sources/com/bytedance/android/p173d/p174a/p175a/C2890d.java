package com.bytedance.android.p173d.p174a.p175a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.android.d.a.a.d */
public final class C2890d {

    /* renamed from: com.bytedance.android.d.a.a.d$a */
    static abstract class C2891a implements C2892b {
        C2891a() {
        }

        /* renamed from: d */
        public final long mo7513d() throws IOException {
            long j = 0;
            for (int i = 0; i < 8; i++) {
                j |= (255 & ((long) mo7508b())) << (i * 8);
            }
            return j;
        }

        /* renamed from: c */
        public final int mo7512c() throws IOException {
            return (mo7508b() & 255) | ((mo7508b() & 255) << 8) | ((mo7508b() & 255) << 16) | ((mo7508b() & 255) << 24);
        }
    }

    /* renamed from: com.bytedance.android.d.a.a.d$b */
    public interface C2892b {
        /* renamed from: a */
        void mo7506a(long j) throws IOException;

        /* renamed from: a */
        boolean mo7507a() throws IOException;

        /* renamed from: b */
        byte mo7508b() throws IOException;

        /* renamed from: b */
        byte[] mo7509b(long j) throws IOException;

        /* renamed from: c */
        int mo7512c() throws IOException;

        /* renamed from: c */
        String mo7510c(long j) throws IOException;

        /* renamed from: d */
        long mo7513d() throws IOException;
    }

    /* renamed from: a */
    public static C2892b m8203a(InputStream inputStream) {
        return new C2889c(inputStream);
    }

    /* renamed from: a */
    public static C2892b m8204a(byte[] bArr) {
        return new C2887a(bArr);
    }
}
