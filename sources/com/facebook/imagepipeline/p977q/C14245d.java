package com.facebook.imagepipeline.p977q;

import com.facebook.common.p920d.C13682e;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.imagepipeline.p970j.C14044e;

/* renamed from: com.facebook.imagepipeline.q.d */
public final class C14245d {

    /* renamed from: a */
    public static final C13682e<Integer> f37148a = C13682e.m27635of(Integer.valueOf(2), Integer.valueOf(7), Integer.valueOf(4), Integer.valueOf(5));

    /* renamed from: a */
    private static int m29191a(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }

    /* renamed from: a */
    private static int m29194a(C14044e eVar) {
        int e = eVar.mo26268e();
        if (e == 90 || e == 180 || e == 270) {
            return eVar.mo26268e();
        }
        return 0;
    }

    /* renamed from: a */
    public static int m29193a(C13953e eVar, C14044e eVar2) {
        if (!eVar.mo26126e()) {
            return 0;
        }
        int a = m29194a(eVar2);
        if (eVar.mo26125d()) {
            return a;
        }
        return (a + eVar.mo26128f()) % 360;
    }

    /* renamed from: b */
    public static int m29195b(C13953e eVar, C14044e eVar2) {
        int indexOf = f37148a.indexOf(Integer.valueOf(eVar2.mo26269f()));
        if (indexOf >= 0) {
            int i = 0;
            if (!eVar.mo26125d()) {
                i = eVar.mo26128f();
            }
            return ((Integer) f37148a.get((indexOf + (i / 90)) % f37148a.size())).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    /* renamed from: a */
    private static float m29190a(C13952d dVar, int i, int i2) {
        if (dVar == null) {
            return 1.0f;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) dVar.f36398a) / f, ((float) dVar.f36399b) / f2);
        if (f * max > dVar.f36400c) {
            max = dVar.f36400c / f;
        }
        if (f2 * max > dVar.f36400c) {
            max = dVar.f36400c / f2;
        }
        return max;
    }

    /* renamed from: a */
    public static int m29192a(C13953e eVar, C13952d dVar, C14044e eVar2, boolean z) {
        int i;
        int i2;
        int i3;
        if (!z || dVar == null) {
            return 8;
        }
        int a = m29193a(eVar, eVar2);
        boolean z2 = false;
        if (f37148a.contains(Integer.valueOf(eVar2.mo26269f()))) {
            i = m29195b(eVar, eVar2);
        } else {
            i = 0;
        }
        if (a == 90 || a == 270 || i == 5 || i == 7) {
            z2 = true;
        }
        if (z2) {
            i2 = eVar2.mo26271h();
        } else {
            i2 = eVar2.mo26270g();
        }
        if (z2) {
            i3 = eVar2.mo26270g();
        } else {
            i3 = eVar2.mo26271h();
        }
        int a2 = m29191a(m29190a(dVar, i2, i3), dVar.f36401d);
        if (a2 > 8) {
            return 8;
        }
        if (a2 <= 0) {
            return 1;
        }
        return a2;
    }
}
