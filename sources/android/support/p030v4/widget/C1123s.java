package android.support.p030v4.widget;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.widget.s */
public final class C1123s {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f3585a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f3586b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m3312a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m3312a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
