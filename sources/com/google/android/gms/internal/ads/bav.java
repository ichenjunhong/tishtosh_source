package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15675e;
import java.io.IOException;
import java.util.Arrays;

public final class bav {

    /* renamed from: e */
    private static final bav f41731e = new bav(0, new int[0], new Object[0], false);

    /* renamed from: a */
    int f41732a;

    /* renamed from: b */
    int[] f41733b;

    /* renamed from: c */
    Object[] f41734c;

    /* renamed from: d */
    int f41735d;

    /* renamed from: f */
    private boolean f41736f;

    /* renamed from: a */
    public static bav m35112a() {
        return f41731e;
    }

    /* renamed from: b */
    static bav m35114b() {
        return new bav();
    }

    private bav() {
        this(0, new int[8], new Object[8], true);
    }

    bav(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f41735d = -1;
        this.f41732a = i;
        this.f41733b = iArr;
        this.f41734c = objArr;
        this.f41736f = z;
    }

    /* renamed from: c */
    public final void mo29975c() {
        this.f41736f = false;
    }

    /* renamed from: a */
    public final void mo29973a(bbq bbq) throws IOException {
        if (this.f41732a != 0) {
            if (bbq.mo29739a() == C15675e.f41618j) {
                for (int i = 0; i < this.f41732a; i++) {
                    m35113a(this.f41733b[i], this.f41734c[i], bbq);
                }
                return;
            }
            for (int i2 = this.f41732a - 1; i2 >= 0; i2--) {
                m35113a(this.f41733b[i2], this.f41734c[i2], bbq);
            }
        }
    }

    /* renamed from: a */
    private static void m35113a(int i, Object obj, bbq bbq) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 5) {
            switch (i3) {
                case 0:
                    bbq.mo29744a(i2, ((Long) obj).longValue());
                    return;
                case 1:
                    bbq.mo29765d(i2, ((Long) obj).longValue());
                    return;
                case 2:
                    bbq.mo29745a(i2, (awo) obj);
                    return;
                case 3:
                    if (bbq.mo29739a() == C15675e.f41618j) {
                        bbq.mo29740a(i2);
                        ((bav) obj).mo29973a(bbq);
                        bbq.mo29754b(i2);
                        return;
                    }
                    bbq.mo29754b(i2);
                    ((bav) obj).mo29973a(bbq);
                    bbq.mo29740a(i2);
                    return;
                default:
                    throw new RuntimeException(ayi.m34783f());
            }
        } else {
            bbq.mo29764d(i2, ((Integer) obj).intValue());
        }
    }

    /* renamed from: d */
    public final int mo29976d() {
        int i;
        int i2 = this.f41735d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f41732a; i4++) {
            int i5 = this.f41733b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 5) {
                switch (i7) {
                    case 0:
                        i = axf.m34451e(i6, ((Long) this.f41734c[i4]).longValue());
                        break;
                    case 1:
                        i = axf.m34459g(i6, ((Long) this.f41734c[i4]).longValue());
                        break;
                    case 2:
                        i = axf.m34442c(i6, (awo) this.f41734c[i4]);
                        break;
                    case 3:
                        i = (axf.m34450e(i6) << 1) + ((bav) this.f41734c[i4]).mo29976d();
                        break;
                    default:
                        throw new IllegalStateException(ayi.m34783f());
                }
            } else {
                i = axf.m34465i(i6, ((Integer) this.f41734c[i4]).intValue());
            }
            i3 += i;
        }
        this.f41735d = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bav)) {
            return false;
        }
        bav bav = (bav) obj;
        if (this.f41732a == bav.f41732a) {
            int[] iArr = this.f41733b;
            int[] iArr2 = bav.f41733b;
            int i = this.f41732a;
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
                Object[] objArr = this.f41734c;
                Object[] objArr2 = bav.f41734c;
                int i3 = this.f41732a;
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
        int i = (this.f41732a + 527) * 31;
        int[] iArr = this.f41733b;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < this.f41732a; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i + i3) * 31;
        Object[] objArr = this.f41734c;
        for (int i6 = 0; i6 < this.f41732a; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return i5 + i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29974a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f41732a; i2++) {
            azn.m34874a(sb, i, String.valueOf(this.f41733b[i2] >>> 3), this.f41734c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29972a(int i, Object obj) {
        if (this.f41736f) {
            if (this.f41732a == this.f41733b.length) {
                int i2 = this.f41732a + (this.f41732a < 4 ? 8 : this.f41732a >> 1);
                this.f41733b = Arrays.copyOf(this.f41733b, i2);
                this.f41734c = Arrays.copyOf(this.f41734c, i2);
            }
            this.f41733b[this.f41732a] = i;
            this.f41734c[this.f41732a] = obj;
            this.f41732a++;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
