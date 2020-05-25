package android.support.design.p028f;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: android.support.design.f.d */
public final class C0428d {

    /* renamed from: a */
    public float f1409a;

    /* renamed from: b */
    public float f1410b;

    /* renamed from: c */
    public float f1411c;

    /* renamed from: d */
    public float f1412d;

    /* renamed from: e */
    final List<C0431c> f1413e;

    /* renamed from: android.support.design.f.d$a */
    public static class C0429a extends C0431c {

        /* renamed from: h */
        private static final RectF f1414h = new RectF();

        /* renamed from: a */
        public float f1415a;

        /* renamed from: b */
        public float f1416b;

        /* renamed from: c */
        public float f1417c;

        /* renamed from: d */
        public float f1418d;

        /* renamed from: e */
        public float f1419e;

        /* renamed from: f */
        public float f1420f;

        /* renamed from: a */
        public final void mo1030a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1423g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f1414h.set(this.f1415a, this.f1416b, this.f1417c, this.f1418d);
            path.arcTo(f1414h, this.f1419e, this.f1420f, false);
            path.transform(matrix);
        }

        public C0429a(float f, float f2, float f3, float f4) {
            this.f1415a = f;
            this.f1416b = f2;
            this.f1417c = f3;
            this.f1418d = f4;
        }
    }

    /* renamed from: android.support.design.f.d$b */
    public static class C0430b extends C0431c {

        /* renamed from: a */
        public float f1421a;

        /* renamed from: b */
        public float f1422b;

        /* renamed from: a */
        public final void mo1030a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1423g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f1421a, this.f1422b);
            path.transform(matrix);
        }
    }

    /* renamed from: android.support.design.f.d$c */
    public static abstract class C0431c {

        /* renamed from: g */
        protected final Matrix f1423g = new Matrix();

        /* renamed from: a */
        public abstract void mo1030a(Matrix matrix, Path path);
    }

    /* renamed from: a */
    public final void mo1027a(float f, float f2) {
        C0430b bVar = new C0430b();
        bVar.f1421a = f;
        bVar.f1422b = 0.0f;
        this.f1413e.add(bVar);
        this.f1411c = f;
        this.f1412d = 0.0f;
    }

    /* renamed from: a */
    public final void mo1029a(Matrix matrix, Path path) {
        int size = this.f1413e.size();
        for (int i = 0; i < size; i++) {
            ((C0431c) this.f1413e.get(i)).mo1030a(matrix, path);
        }
    }

    /* renamed from: a */
    public final void mo1028a(float f, float f2, float f3, float f4, float f5, float f6) {
        C0429a aVar = new C0429a(f, f2, f3, f4);
        aVar.f1419e = f5;
        aVar.f1420f = f6;
        this.f1413e.add(aVar);
        double d = (double) (f5 + f6);
        this.f1411c = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.f1412d = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }
}
