package p2628d.p2647j;

import java.util.NoSuchElementException;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2645i.C52744c;
import p2628d.p2647j.C52748a.C52749a;
import p2628d.p2647j.C52751c.C52752a;

/* renamed from: d.j.g */
public class C52756g extends C52755f {
    /* renamed from: a */
    public static final float m112314a(float f, float f2) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: a */
    public static final long m112317a(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: b */
    public static final long m112319b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: c */
    public static final int m112321c(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: d */
    public static final int m112322d(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: a */
    public static final C52748a m112318a(int i, int i2) {
        return C52749a.m112308a(i, i2, -1);
    }

    /* renamed from: b */
    public static final C52751c m112320b(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C52752a.m112313a();
        }
        return new C52751c(i, i2 - 1);
    }

    /* renamed from: a */
    public static final int m112316a(C52751c cVar, C52744c cVar2) {
        C52711k.m112240b(cVar, "$this$random");
        C52711k.m112240b(cVar2, "random");
        try {
            C52711k.m112240b(cVar2, "$this$nextInt");
            C52711k.m112240b(cVar, "range");
            if (cVar.mo110342a()) {
                StringBuilder sb = new StringBuilder("Cannot get random in empty range: ");
                sb.append(cVar);
                throw new IllegalArgumentException(sb.toString());
            } else if (cVar.f130996b < Integer.MAX_VALUE) {
                return cVar2.mo110340a(cVar.f130995a, cVar.f130996b + 1);
            } else {
                if (cVar.f130995a > Integer.MIN_VALUE) {
                    return cVar2.mo110340a(cVar.f130995a - 1, cVar.f130996b) + 1;
                }
                return cVar2.mo110337b();
            }
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* renamed from: a */
    public static final int m112315a(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append(i3);
            sb.append(" is less than minimum ");
            sb.append(i2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }
}
