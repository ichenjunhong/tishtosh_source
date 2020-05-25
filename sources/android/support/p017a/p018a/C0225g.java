package android.support.p017a.p018a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.p030v4.content.p035a.C0724g;
import android.support.p030v4.graphics.C0804b;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.a.a.g */
public final class C0225g implements Interpolator {

    /* renamed from: a */
    private float[] f516a;

    /* renamed from: b */
    private float[] f517b;

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f516a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f516a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f516a[length] - this.f516a[i];
        if (f2 == 0.0f) {
            return this.f517b[i];
        }
        float f3 = (f - this.f516a[i]) / f2;
        float f4 = this.f517b[i];
        return f4 + (f3 * (this.f517b[length] - f4));
    }

    /* renamed from: a */
    private void m459a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f516a = new float[min];
            this.f517b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.f516a[i2] = fArr[0];
                this.f517b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f516a[0])) <= 1.0E-5d && ((double) Math.abs(this.f517b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f516a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f517b[i3] - 1.0f)) <= 1.0E-5d) {
                    int i4 = 0;
                    float f = 0.0f;
                    while (i < min) {
                        int i5 = i4 + 1;
                        float f2 = this.f516a[i4];
                        if (f2 >= f) {
                            this.f516a[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            StringBuilder sb = new StringBuilder("The Path cannot loop back on itself, x :");
                            sb.append(f2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.f516a[0]);
            sb2.append(",");
            sb2.append(this.f517b[0]);
            sb2.append(" end:");
            int i6 = min - 1;
            sb2.append(this.f516a[i6]);
            sb2.append(",");
            sb2.append(this.f517b[i6]);
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("The Path has a invalid length ");
        sb3.append(length);
        throw new IllegalArgumentException(sb3.toString());
    }

    public C0225g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private C0225g(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0724g.m2082a(resources, theme, attributeSet, C0215a.f502l);
        if (C0724g.m2085a(xmlPullParser, "pathData")) {
            String a2 = C0724g.m2084a(a, xmlPullParser, "pathData", 4);
            Path a3 = C0804b.m2301a(a2);
            if (a3 != null) {
                m459a(a3);
            } else {
                StringBuilder sb = new StringBuilder("The path is null, which is created from ");
                sb.append(a2);
                throw new InflateException(sb.toString());
            }
        } else if (!C0724g.m2085a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0724g.m2085a(xmlPullParser, "controlY1")) {
            float a4 = C0724g.m2080a(a, xmlPullParser, "controlX1", 0, 0.0f);
            float a5 = C0724g.m2080a(a, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a6 = C0724g.m2085a(xmlPullParser, "controlX2");
            if (a6 != C0724g.m2085a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a6) {
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(a4, a5, 1.0f, 1.0f);
                m459a(path);
            } else {
                float a7 = C0724g.m2080a(a, xmlPullParser, "controlX2", 2, 0.0f);
                float a8 = C0724g.m2080a(a, xmlPullParser, "controlY2", 3, 0.0f);
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.cubicTo(a4, a5, a7, a8, 1.0f, 1.0f);
                m459a(path2);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        a.recycle();
    }
}
