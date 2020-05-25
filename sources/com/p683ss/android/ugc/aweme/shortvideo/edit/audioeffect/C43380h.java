package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.support.p030v4.p038f.C0786h;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h */
public final class C43380h {

    /* renamed from: a */
    public C0786h<String, byte[]> f109666a;

    public C43380h() {
        this(0, 1, null);
    }

    private C43380h(int i) {
        int min = Math.min((int) (Runtime.getRuntime().maxMemory() / 8), i);
        this.f109666a = new C0786h<String, byte[]>(min, min) {

            /* renamed from: a */
            final /* synthetic */ int f109667a;

            {
                this.f109667a = r1;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ int mo2506b(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                C52711k.m112240b((String) obj, "key");
                C52711k.m112240b(bArr, "value");
                return bArr.length;
            }
        };
    }

    public /* synthetic */ C43380h(int i, int i2, C52707g gVar) {
        this(1048576);
    }
}
