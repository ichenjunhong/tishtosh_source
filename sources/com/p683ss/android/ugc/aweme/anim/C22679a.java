package com.p683ss.android.ugc.aweme.anim;

import android.view.animation.Interpolator;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.anim.a */
public final class C22679a implements Interpolator {

    /* renamed from: a */
    public static final C22680a f60869a = new C22680a(null);

    /* renamed from: b */
    private final float f60870b;

    /* renamed from: com.ss.android.ugc.aweme.anim.a$a */
    public static final class C22680a {
        private C22680a() {
        }

        public /* synthetic */ C22680a(C52707g gVar) {
            this();
        }
    }

    public C22679a() {
        this(2.3f);
    }

    private C22679a(float f) {
        this.f60870b = 2.3f;
    }

    public final float getInterpolation(float f) {
        if (f == 1.0f) {
            return 1.0f;
        }
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        double d = (double) (f - (this.f60870b / 4.0f));
        Double.isNaN(d);
        double d2 = d * 6.283185307179586d;
        double d3 = (double) this.f60870b;
        Double.isNaN(d3);
        return (float) ((pow * Math.sin(d2 / d3)) + 1.0d);
    }
}
