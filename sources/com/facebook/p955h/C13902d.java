package com.facebook.p955h;

import com.facebook.common.p920d.C13678a;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13696m;
import com.facebook.p955h.C13900c.C13901a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.facebook.h.d */
public final class C13902d {

    /* renamed from: b */
    private static C13902d f36278b;

    /* renamed from: a */
    public List<C13901a> f36279a;

    /* renamed from: c */
    private int f36280c;

    /* renamed from: d */
    private final C13901a f36281d = new C13898a();

    private C13902d() {
        mo26071a();
    }

    /* renamed from: b */
    public static synchronized C13902d m28315b() {
        C13902d dVar;
        synchronized (C13902d.class) {
            if (f36278b == null) {
                f36278b = new C13902d();
            }
            dVar = f36278b;
        }
        return dVar;
    }

    /* renamed from: a */
    public void mo26071a() {
        this.f36280c = this.f36281d.mo26068a();
        if (this.f36279a != null) {
            for (C13901a a : this.f36279a) {
                this.f36280c = Math.max(this.f36280c, a.mo26068a());
            }
        }
    }

    /* renamed from: a */
    public static C13900c m28314a(InputStream inputStream) {
        try {
            C13902d b = m28315b();
            C13689i.m27652a(inputStream);
            byte[] bArr = new byte[b.f36280c];
            int a = m28313a(b.f36280c, inputStream, bArr);
            if (b.f36279a != null) {
                for (C13901a a2 : b.f36279a) {
                    C13900c a3 = a2.mo26069a(bArr, a);
                    if (a3 != null && a3 != C13900c.f36275a) {
                        return a3;
                    }
                }
            }
            C13900c a4 = b.f36281d.mo26069a(bArr, a);
            if (a4 == null || a4 == C13900c.f36275a) {
                return C13900c.f36275a;
            }
            return a4;
        } catch (IOException e) {
            throw C13696m.m27667b(e);
        }
    }

    /* renamed from: a */
    private static int m28313a(int i, InputStream inputStream, byte[] bArr) throws IOException {
        boolean z;
        C13689i.m27652a(inputStream);
        C13689i.m27652a(bArr);
        if (bArr.length >= i) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (!inputStream.markSupported()) {
            return C13678a.m27631a(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return C13678a.m27631a(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }
}
