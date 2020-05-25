package com.bytedance.android.p161c.p169h.p170a;

import android.os.Handler;
import com.bytedance.android.p161c.p169h.C2873h;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.android.c.h.a.a */
public final class C2858a extends C2861c {

    /* renamed from: a */
    public C2858a f8509a;

    /* renamed from: b */
    private long f8510b;

    /* renamed from: c */
    private long f8511c;

    /* renamed from: d */
    private Handler f8512d;

    /* renamed from: a */
    public final void mo7487a(C2873h hVar) throws IOException {
        super.mo7487a(hVar);
    }

    /* renamed from: a */
    public final void mo7488a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i;
        C2858a aVar = this;
        while (true) {
            long j = (long) i2;
            if ((aVar.f8510b - aVar.f8511c) - j >= 0) {
                aVar.f8511c += j;
                super.mo7488a(bArr, i3, i2);
                return;
            }
            int i4 = (int) (aVar.f8510b - aVar.f8511c);
            aVar.f8511c += (long) i4;
            super.mo7488a(bArr, i3, i4);
            if (aVar.f8509a != null) {
                aVar = aVar.f8509a;
                i3 += i4;
                i2 -= i4;
            } else {
                return;
            }
        }
    }

    public C2858a(File file, long j, long j2, long j3, Handler handler) {
        super(file, j, j3, j2, handler);
        this.f8510b = j2;
        this.f8512d = handler;
    }
}
