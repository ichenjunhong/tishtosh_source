package com.facebook.imagepipeline.memory;

import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13705d;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p924h.C13718c;

/* renamed from: com.facebook.imagepipeline.memory.n */
public final class C14085n {

    /* renamed from: a */
    final C14087a f36806a;

    /* renamed from: b */
    private final C13718c<byte[]> f36807b;

    /* renamed from: com.facebook.imagepipeline.memory.n$a */
    static class C14087a extends C14088o {
        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final C14075f<byte[]> mo26311e(int i) {
            return new C14100z(mo26309d(i), this.f36732b.f36778g, 0);
        }

        public C14087a(C13705d dVar, C14068ad adVar, C14069ae aeVar) {
            super(dVar, adVar, aeVar);
        }
    }

    /* renamed from: a */
    public final C13715a<byte[]> mo26341a(int i) {
        return C13715a.m27747a(this.f36806a.mo25599a(i), this.f36807b);
    }

    public C14085n(C13705d dVar, C14068ad adVar) {
        boolean z;
        if (adVar.f36778g > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        this.f36806a = new C14087a(dVar, adVar, C14099y.m28869a());
        this.f36807b = new C13718c<byte[]>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo25600a(Object obj) {
                C14085n.this.f36806a.mo25600a((byte[]) obj);
            }
        };
    }
}
