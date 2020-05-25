package com.facebook.drawee.p940f;

import com.facebook.common.p920d.C13689i;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.f.e */
public final class C13837e {

    /* renamed from: a */
    public C13838a f36108a = C13838a.BITMAP_ONLY;

    /* renamed from: b */
    public boolean f36109b;

    /* renamed from: c */
    public float[] f36110c;

    /* renamed from: d */
    public int f36111d;

    /* renamed from: e */
    public float f36112e;

    /* renamed from: f */
    public int f36113f;

    /* renamed from: g */
    public float f36114g;

    /* renamed from: h */
    public boolean f36115h;

    /* renamed from: com.facebook.drawee.f.e$a */
    public enum C13838a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: a */
    private float[] m28112a() {
        if (this.f36110c == null) {
            this.f36110c = new float[8];
        }
        return this.f36110c;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.f36108a != null) {
            i = this.f36108a.hashCode();
        } else {
            i = 0;
        }
        int i5 = ((i * 31) + (this.f36109b ? 1 : 0)) * 31;
        if (this.f36110c != null) {
            i2 = Arrays.hashCode(this.f36110c);
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.f36111d) * 31;
        if (this.f36112e != 0.0f) {
            i3 = Float.floatToIntBits(this.f36112e);
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.f36113f) * 31;
        if (this.f36114g != 0.0f) {
            i4 = Float.floatToIntBits(this.f36114g);
        }
        return ((i7 + i4) * 31) + (this.f36115h ? 1 : 0);
    }

    /* renamed from: a */
    public final C13837e mo25936a(C13838a aVar) {
        this.f36108a = aVar;
        return this;
    }

    /* renamed from: b */
    public final C13837e mo25938b(int i) {
        this.f36113f = i;
        return this;
    }

    /* renamed from: a */
    public final C13837e mo25932a(float f) {
        Arrays.fill(m28112a(), f);
        return this;
    }

    /* renamed from: b */
    public static C13837e m28113b(float f) {
        return new C13837e().mo25932a(f);
    }

    /* renamed from: c */
    public final C13837e mo25939c(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27656a(z, (Object) "the border width cannot be < 0");
        this.f36112e = f;
        return this;
    }

    /* renamed from: d */
    public final C13837e mo25940d(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27656a(z, (Object) "the padding cannot be < 0");
        this.f36114g = f;
        return this;
    }

    /* renamed from: a */
    public final C13837e mo25934a(int i) {
        this.f36111d = i;
        this.f36108a = C13838a.OVERLAY_COLOR;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13837e eVar = (C13837e) obj;
        if (this.f36109b == eVar.f36109b && this.f36111d == eVar.f36111d && Float.compare(eVar.f36112e, this.f36112e) == 0 && this.f36113f == eVar.f36113f && Float.compare(eVar.f36114g, this.f36114g) == 0 && this.f36108a == eVar.f36108a && this.f36115h == eVar.f36115h) {
            return Arrays.equals(this.f36110c, eVar.f36110c);
        }
        return false;
    }

    /* renamed from: a */
    public final C13837e mo25937a(boolean z) {
        this.f36109b = z;
        return this;
    }

    /* renamed from: a */
    public final C13837e mo25935a(int i, float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27656a(z, (Object) "the border width cannot be < 0");
        this.f36112e = f;
        this.f36113f = i;
        return this;
    }

    /* renamed from: b */
    public static C13837e m28114b(float f, float f2, float f3, float f4) {
        return new C13837e().mo25933a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final C13837e mo25933a(float f, float f2, float f3, float f4) {
        float[] a = m28112a();
        a[1] = f;
        a[0] = f;
        a[3] = f2;
        a[2] = f2;
        a[5] = f3;
        a[4] = f3;
        a[7] = f4;
        a[6] = f4;
        return this;
    }
}
