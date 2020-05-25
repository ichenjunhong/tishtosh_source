package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16736hd.C16741e;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.jv */
public final class C16813jv {

    /* renamed from: e */
    private static final C16813jv f47214e = new C16813jv(0, new int[0], new Object[0], false);

    /* renamed from: a */
    int f47215a;

    /* renamed from: b */
    int[] f47216b;

    /* renamed from: c */
    Object[] f47217c;

    /* renamed from: d */
    int f47218d;

    /* renamed from: f */
    private boolean f47219f;

    /* renamed from: a */
    public static C16813jv m40633a() {
        return f47214e;
    }

    /* renamed from: b */
    static C16813jv m40635b() {
        return new C16813jv();
    }

    private C16813jv() {
        this(0, new int[8], new Object[8], true);
    }

    C16813jv(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f47218d = -1;
        this.f47215a = i;
        this.f47216b = iArr;
        this.f47217c = objArr;
        this.f47219f = z;
    }

    /* renamed from: c */
    public final void mo32377c() {
        this.f47219f = false;
    }

    /* renamed from: a */
    public final void mo32375a(C16838kp kpVar) throws IOException {
        if (this.f47215a != 0) {
            if (kpVar.mo32144a() == C16741e.f47099j) {
                for (int i = 0; i < this.f47215a; i++) {
                    m40634a(this.f47216b[i], this.f47217c[i], kpVar);
                }
                return;
            }
            for (int i2 = this.f47215a - 1; i2 >= 0; i2--) {
                m40634a(this.f47216b[i2], this.f47217c[i2], kpVar);
            }
        }
    }

    /* renamed from: a */
    private static void m40634a(int i, Object obj, C16838kp kpVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    kpVar.mo32149a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    kpVar.mo32170d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    kpVar.mo32150a(i2, (C16691fs) obj);
                    return;
                case 3:
                    if (kpVar.mo32144a() == C16741e.f47099j) {
                        kpVar.mo32145a(i2);
                        ((C16813jv) obj).mo32375a(kpVar);
                        kpVar.mo32159b(i2);
                        return;
                    }
                    kpVar.mo32159b(i2);
                    ((C16813jv) obj).mo32375a(kpVar);
                    kpVar.mo32145a(i2);
                    return;
                default:
                    throw new RuntimeException(C16748hk.m40326e());
            }
        } else {
            kpVar.mo32169d(i2, ((Integer) obj).intValue());
        }
    }

    /* renamed from: d */
    public final int mo32378d() {
        int i;
        int i2 = this.f47218d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f47215a; i4++) {
            int i5 = this.f47216b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = C16709gj.m40022e(i6, ((Long) this.f47217c[i4]).longValue());
                        break;
                    case 1:
                        i = C16709gj.m40030g(i6, ((Long) this.f47217c[i4]).longValue());
                        break;
                    case 2:
                        i = C16709gj.m40013c(i6, (C16691fs) this.f47217c[i4]);
                        break;
                    case 3:
                        i = (C16709gj.m40021e(i6) << 1) + ((C16813jv) this.f47217c[i4]).mo32378d();
                        break;
                    default:
                        throw new IllegalStateException(C16748hk.m40326e());
                }
            } else {
                i = C16709gj.m40036i(i6, ((Integer) this.f47217c[i4]).intValue());
            }
            i3 += i;
        }
        this.f47218d = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C16813jv)) {
            return false;
        }
        C16813jv jvVar = (C16813jv) obj;
        if (this.f47215a == jvVar.f47215a) {
            int[] iArr = this.f47216b;
            int[] iArr2 = jvVar.f47216b;
            int i = this.f47215a;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f47217c;
                Object[] objArr2 = jvVar.f47217c;
                int i3 = this.f47215a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = (this.f47215a + 527) * 31;
        int[] iArr = this.f47216b;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < this.f47215a; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i + i3) * 31;
        Object[] objArr = this.f47217c;
        for (int i6 = 0; i6 < this.f47215a; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return i5 + i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32376a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f47215a; i2++) {
            C16778in.m40413a(sb, i, String.valueOf(this.f47216b[i2] >>> 3), this.f47217c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32374a(int i, Object obj) {
        if (this.f47219f) {
            if (this.f47215a == this.f47216b.length) {
                int i2 = this.f47215a + (this.f47215a < 4 ? 8 : this.f47215a >> 1);
                this.f47216b = Arrays.copyOf(this.f47216b, i2);
                this.f47217c = Arrays.copyOf(this.f47217c, i2);
            }
            this.f47216b[this.f47215a] = i;
            this.f47217c[this.f47215a] = obj;
            this.f47215a++;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
