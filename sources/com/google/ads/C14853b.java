package com.google.ads;

import com.google.android.gms.ads.C14912d;
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment;

/* renamed from: com.google.ads.b */
public final class C14853b {

    /* renamed from: a */
    public static final C14853b f38378a = new C14853b(-1, -2, "mb");

    /* renamed from: b */
    public static final C14853b f38379b = new C14853b(320, 50, "mb");

    /* renamed from: c */
    public static final C14853b f38380c = new C14853b(300, NormalSplashDelayExperiment.GROUP1, "as");

    /* renamed from: d */
    public static final C14853b f38381d = new C14853b(468, 60, "as");

    /* renamed from: e */
    public static final C14853b f38382e = new C14853b(728, 90, "as");

    /* renamed from: f */
    public static final C14853b f38383f = new C14853b(160, 600, "as");

    /* renamed from: g */
    private final C14912d f38384g;

    public C14853b(C14912d dVar) {
        this.f38384g = dVar;
    }

    private C14853b(int i, int i2, String str) {
        this(new C14912d(i, i2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14853b)) {
            return false;
        }
        return this.f38384g.equals(((C14853b) obj).f38384g);
    }

    public final int hashCode() {
        return this.f38384g.hashCode();
    }

    /* renamed from: a */
    public final int mo27171a() {
        return this.f38384g.f38464k;
    }

    /* renamed from: b */
    public final int mo27172b() {
        return this.f38384g.f38465l;
    }

    public final String toString() {
        return this.f38384g.toString();
    }
}
