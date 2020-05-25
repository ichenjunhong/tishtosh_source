package com.p683ss.android.ugc.aweme.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ss.android.ugc.aweme.utils.gn */
public final class C47924gn {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f120520a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f120521b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m103692a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m103694b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m103693a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m103693a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    private static void m103694b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f120520a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f120520a.set(matrix);
        } else {
            matrix.reset();
        }
        m103693a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f120521b.get();
        if (rectF == null) {
            rectF = new RectF();
            f120521b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
