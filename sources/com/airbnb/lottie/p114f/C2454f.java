package com.airbnb.lottie.p114f;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.airbnb.lottie.C2340c;
import com.airbnb.lottie.p104a.p105a.C2319r;
import java.io.Closeable;

/* renamed from: com.airbnb.lottie.f.f */
public final class C2454f {

    /* renamed from: a */
    private static final PathMeasure f7563a = new PathMeasure();

    /* renamed from: b */
    private static final Path f7564b = new Path();

    /* renamed from: c */
    private static final Path f7565c = new Path();

    /* renamed from: d */
    private static final float[] f7566d = new float[4];

    /* renamed from: e */
    private static final float f7567e = ((float) Math.sqrt(2.0d));

    /* renamed from: f */
    private static float f7568f = -1.0f;

    /* renamed from: a */
    public static float m7176a() {
        if (f7568f == -1.0f) {
            f7568f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f7568f;
    }

    /* renamed from: a */
    public static void m7180a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m7177a(Matrix matrix) {
        f7566d[0] = 0.0f;
        f7566d[1] = 0.0f;
        f7566d[2] = f7567e;
        f7566d[3] = f7567e;
        matrix.mapPoints(f7566d);
        return ((float) Math.hypot((double) (f7566d[2] - f7566d[0]), (double) (f7566d[3] - f7566d[1]))) / 2.0f;
    }

    /* renamed from: a */
    public static void m7179a(Path path, C2319r rVar) {
        if (rVar != null) {
            m7178a(path, ((Float) rVar.f7245b.mo6726d()).floatValue() / 100.0f, ((Float) rVar.f7246c.mo6726d()).floatValue() / 100.0f, ((Float) rVar.f7247d.mo6726d()).floatValue() / 360.0f);
        }
    }

    /* renamed from: a */
    public static void m7178a(Path path, float f, float f2, float f3) {
        C2340c.m6969b("applyTrimPathIfNeeded");
        f7563a.setPath(path, false);
        float length = f7563a.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C2340c.m6970c("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C2340c.m6970c("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C2453e.m7170a(min, length);
                max = (float) C2453e.m7170a(max, length);
            }
            if (min < 0.0f) {
                min = (float) C2453e.m7170a(min, length);
            }
            if (max < 0.0f) {
                max = (float) C2453e.m7170a(max, length);
            }
            if (min == max) {
                path.reset();
                C2340c.m6970c("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            f7564b.reset();
            f7563a.getSegment(min, max, f7564b, true);
            if (max > length) {
                f7565c.reset();
                f7563a.getSegment(0.0f, max % length, f7565c, true);
                f7564b.addPath(f7565c);
            } else if (min < 0.0f) {
                f7565c.reset();
                f7563a.getSegment(min + length, length, f7565c, true);
                f7564b.addPath(f7565c);
            }
            path.set(f7564b);
            C2340c.m6970c("applyTrimPathIfNeeded");
        }
    }
}
