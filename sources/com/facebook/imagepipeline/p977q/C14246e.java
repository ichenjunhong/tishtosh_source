package com.facebook.imagepipeline.p977q;

import com.facebook.imagepipeline.nativecode.C14224c;
import com.facebook.p955h.C13900c;

/* renamed from: com.facebook.imagepipeline.q.e */
public final class C14246e implements C14244c {

    /* renamed from: a */
    private final int f37149a;

    /* renamed from: b */
    private final boolean f37150b;

    /* renamed from: c */
    private final C14244c f37151c;

    /* renamed from: d */
    private final Integer f37152d;

    /* renamed from: b */
    private C14243b m29196b(C13900c cVar, boolean z) {
        return new C14224c(this.f37149a, this.f37150b).mo26440a(cVar, z);
    }

    /* renamed from: c */
    private C14243b m29197c(C13900c cVar, boolean z) {
        return new C14248g(this.f37149a).mo26440a(cVar, z);
    }

    /* renamed from: a */
    public final C14243b mo26440a(C13900c cVar, boolean z) {
        C14243b bVar;
        C14243b bVar2 = null;
        if (this.f37151c == null) {
            bVar = null;
        } else {
            bVar = this.f37151c.mo26440a(cVar, z);
        }
        if (bVar == null) {
            if (this.f37152d != null) {
                switch (this.f37152d.intValue()) {
                    case 0:
                        bVar2 = m29196b(cVar, z);
                        break;
                    case 1:
                        bVar2 = m29197c(cVar, z);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid ImageTranscoderType");
                }
            }
            bVar = bVar2;
        }
        if (bVar == null) {
            bVar = m29196b(cVar, z);
        }
        if (bVar == null) {
            return m29197c(cVar, z);
        }
        return bVar;
    }

    public C14246e(int i, boolean z, C14244c cVar, Integer num) {
        this.f37149a = i;
        this.f37150b = z;
        this.f37151c = cVar;
        this.f37152d = num;
    }
}
