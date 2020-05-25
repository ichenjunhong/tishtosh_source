package com.p683ss.android.ugc.aweme.utils;

import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: com.ss.android.ugc.aweme.utils.ch */
public final class C47764ch {

    /* renamed from: com.ss.android.ugc.aweme.utils.ch$a */
    static class C47766a implements TimeInterpolator {

        /* renamed from: a */
        private final PathMeasure f120286a;

        /* renamed from: b */
        private final float[] f120287b = new float[2];

        /* renamed from: c */
        private final float f120288c = this.f120286a.getLength();

        public final float getInterpolation(float f) {
            this.f120286a.getPosTan(f * this.f120288c, this.f120287b, null);
            return this.f120287b[1];
        }

        public C47766a(C47767b bVar) {
            Path path = new Path();
            path.reset();
            bVar.mo95032a(path);
            this.f120286a = new PathMeasure(path, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ch$b */
    interface C47767b {
        /* renamed from: a */
        void mo95032a(Path path);
    }

    /* renamed from: a */
    public static TimeInterpolator m103394a(int i, final float... fArr) {
        return new C47766a(new C47767b() {
            /* renamed from: a */
            public final void mo95032a(Path path) {
                if (fArr == null || fArr.length != 4) {
                    path.quadTo(0.6f, 0.8f, 1.0f, 1.0f);
                } else {
                    path.quadTo(fArr[0], fArr[1], fArr[2], fArr[3]);
                }
            }
        });
    }
}
