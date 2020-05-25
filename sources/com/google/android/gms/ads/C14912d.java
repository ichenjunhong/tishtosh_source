package com.google.android.gms.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.ads.aes;
import com.google.android.gms.internal.ads.zzyz;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment;

/* renamed from: com.google.android.gms.ads.d */
public final class C14912d {

    /* renamed from: a */
    public static final C14912d f38454a = new C14912d(320, 50, "320x50_mb");

    /* renamed from: b */
    public static final C14912d f38455b = new C14912d(468, 60, "468x60_as");

    /* renamed from: c */
    public static final C14912d f38456c = new C14912d(320, 100, "320x100_as");

    /* renamed from: d */
    public static final C14912d f38457d = new C14912d(728, 90, "728x90_as");

    /* renamed from: e */
    public static final C14912d f38458e = new C14912d(300, NormalSplashDelayExperiment.GROUP1, "300x250_as");

    /* renamed from: f */
    public static final C14912d f38459f = new C14912d(160, 600, "160x600_as");

    /* renamed from: g */
    public static final C14912d f38460g = new C14912d(-1, -2, "smart_banner");

    /* renamed from: h */
    public static final C14912d f38461h = new C14912d(-3, -4, "fluid");

    /* renamed from: i */
    public static final C14912d f38462i = new C14912d(50, 50, "50x50_mb");

    /* renamed from: j */
    public static final C14912d f38463j = new C14912d(-3, 0, "search_v2");

    /* renamed from: k */
    public final int f38464k;

    /* renamed from: l */
    public final int f38465l;

    /* renamed from: m */
    private final String f38466m;

    public C14912d(int i, int i2) {
        String str;
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        if (i2 == -2) {
            str = "AUTO";
        } else {
            str = String.valueOf(i2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append("x");
        sb.append(str);
        sb.append("_as");
        this(i, i2, sb.toString());
    }

    C14912d(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f38464k = i;
            this.f38465l = i2;
            this.f38466m = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14912d)) {
            return false;
        }
        C14912d dVar = (C14912d) obj;
        return this.f38464k == dVar.f38464k && this.f38465l == dVar.f38465l && this.f38466m.equals(dVar.f38466m);
    }

    /* renamed from: a */
    public final int mo27325a(Context context) {
        switch (this.f38465l) {
            case -4:
            case ImageFrame.NV21 /*-3*/:
                return -1;
            case -2:
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                return (int) (((float) zzyz.m39301a(displayMetrics)) * displayMetrics.density);
            default:
                return aes.m32748a(context, this.f38465l);
        }
    }

    /* renamed from: b */
    public final int mo27326b(Context context) {
        int i = this.f38464k;
        if (i == -1) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        switch (i) {
            case -4:
            case ImageFrame.NV21 /*-3*/:
                return -1;
            default:
                return aes.m32748a(context, this.f38464k);
        }
    }

    public final int hashCode() {
        return this.f38466m.hashCode();
    }

    public final String toString() {
        return this.f38466m;
    }
}
