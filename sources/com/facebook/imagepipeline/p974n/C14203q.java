package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.p955h.C13899b;

/* renamed from: com.facebook.imagepipeline.n.q */
public final class C14203q {
    /* renamed from: a */
    private static int m29127a(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = (double) i;
            double pow = Math.pow(d, 2.0d);
            Double.isNaN(d);
            double d2 = 1.0d / (pow - d);
            Double.isNaN(d);
            if ((1.0d / d) + (d2 * 0.3333333432674408d) <= ((double) f)) {
                return i - 1;
            }
            i++;
        }
    }

    /* renamed from: b */
    private static int m29130b(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = (double) i2;
            Double.isNaN(d);
            double d2 = 1.0d / d;
            if (d2 + (0.3333333432674408d * d2) <= ((double) f)) {
                return i;
            }
            i = i2;
        }
    }

    /* renamed from: a */
    private static int m29129a(C13953e eVar, C14044e eVar2) {
        boolean z = false;
        if (!eVar.mo26125d()) {
            return 0;
        }
        int e = eVar2.mo26268e();
        if (e == 0 || e == 90 || e == 180 || e == 270) {
            z = true;
        }
        C13689i.m27655a(z);
        return e;
    }

    /* renamed from: a */
    private static float m29126a(C13953e eVar, C13952d dVar, C14044e eVar2) {
        boolean z;
        int i;
        int i2;
        C13689i.m27655a(C14044e.m28704c(eVar2));
        if (dVar == null || dVar.f36399b <= 0 || dVar.f36398a <= 0 || eVar2.mo26270g() == 0 || eVar2.mo26271h() == 0) {
            return 1.0f;
        }
        int a = m29129a(eVar, eVar2);
        if (a == 90 || a == 270) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = eVar2.mo26271h();
        } else {
            i = eVar2.mo26270g();
        }
        if (z) {
            i2 = eVar2.mo26270g();
        } else {
            i2 = eVar2.mo26271h();
        }
        float f = ((float) dVar.f36398a) / ((float) i);
        float f2 = ((float) dVar.f36399b) / ((float) i2);
        float max = Math.max(f, f2);
        C13697a.m27682a("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(dVar.f36398a), Integer.valueOf(dVar.f36399b), Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max));
        return max;
    }

    /* renamed from: a */
    public static int m29128a(C13953e eVar, C13952d dVar, C14044e eVar2, int i) {
        int i2;
        float f;
        int i3;
        if (!C14044e.m28704c(eVar2)) {
            return 1;
        }
        float a = m29126a(eVar, dVar, eVar2);
        if (eVar2.mo26267d() == C13899b.f36263a) {
            i2 = m29130b(a);
        } else {
            i2 = m29127a(a);
        }
        int max = Math.max(eVar2.mo26271h(), eVar2.mo26270g());
        if (dVar != null) {
            f = dVar.f36400c;
        } else {
            f = (float) i;
        }
        while (((float) (max / i2)) > f) {
            if (eVar2.mo26267d() == C13899b.f36263a) {
                i3 = i2 * 2;
            } else {
                i3 = i2 + 1;
            }
        }
        return i2;
    }
}
