package com.facebook.p982j;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: com.facebook.j.a */
public final class C14369a {

    /* renamed from: a */
    public final Path f37372a;

    /* renamed from: b */
    public final float[] f37373b;

    /* renamed from: a */
    public final void mo26566a() {
        this.f37372a.reset();
        m29470e(0.0f, 0.0f);
    }

    public C14369a() {
        this(new Path(), new float[]{0.0f, 0.0f});
    }

    /* renamed from: a */
    public final void mo26570a(Matrix matrix) {
        this.f37372a.transform(matrix);
        matrix.mapPoints(this.f37373b);
    }

    private C14369a(Path path, float[] fArr) {
        this.f37372a = path;
        this.f37373b = fArr;
    }

    /* renamed from: e */
    private void m29470e(float f, float f2) {
        this.f37373b[0] = f;
        this.f37373b[1] = f2;
    }

    /* renamed from: b */
    public final void mo26571b(float f, float f2) {
        this.f37372a.rMoveTo(f, f2);
        m29471f(f, f2);
    }

    /* renamed from: c */
    public final void mo26574c(float f, float f2) {
        this.f37372a.lineTo(f, f2);
        m29470e(f, f2);
    }

    /* renamed from: d */
    public final void mo26575d(float f, float f2) {
        this.f37372a.rLineTo(f, f2);
        m29471f(f, f2);
    }

    /* renamed from: f */
    private void m29471f(float f, float f2) {
        float[] fArr = this.f37373b;
        fArr[0] = fArr[0] + f;
        float[] fArr2 = this.f37373b;
        fArr2[1] = fArr2[1] + f2;
    }

    /* renamed from: a */
    public final void mo26567a(float f, float f2) {
        this.f37372a.moveTo(f, f2);
        m29470e(f, f2);
    }

    /* renamed from: b */
    public final void mo26572b(float f, float f2, float f3, float f4) {
        this.f37372a.rQuadTo(f, f2, f3, f4);
        m29471f(f3, f4);
    }

    /* renamed from: a */
    public final void mo26568a(float f, float f2, float f3, float f4) {
        this.f37372a.quadTo(f, f2, f3, f4);
        m29470e(f3, f4);
    }

    /* renamed from: b */
    public final void mo26573b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f37372a.rCubicTo(f, f2, f3, f4, f5, f6);
        m29471f(f5, f6);
    }

    /* renamed from: a */
    public final void mo26569a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f37372a.cubicTo(f, f2, f3, f4, f5, f6);
        m29470e(f5, f6);
    }
}
