package com.facebook.imagepipeline.p974n;

import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p970j.C14044e;

/* renamed from: com.facebook.imagepipeline.n.bc */
public final class C14172bc {
    /* renamed from: a */
    private static int m29043a(int i) {
        return (int) (((float) i) * 1.3333334f);
    }

    /* renamed from: a */
    public static boolean m29045a(C14044e eVar, C13952d dVar) {
        if (eVar == null) {
            return false;
        }
        int e = eVar.mo26268e();
        if (e == 90 || e == 270) {
            return m29044a(eVar.mo26271h(), eVar.mo26270g(), dVar);
        }
        return m29044a(eVar.mo26270g(), eVar.mo26271h(), dVar);
    }

    /* renamed from: a */
    public static boolean m29044a(int i, int i2, C13952d dVar) {
        if (dVar == null) {
            if (((float) m29043a(i)) < 2048.0f || m29043a(i2) < 2048) {
                return false;
            }
            return true;
        } else if (m29043a(i) < dVar.f36398a || m29043a(i2) < dVar.f36399b) {
            return false;
        } else {
            return true;
        }
    }
}
