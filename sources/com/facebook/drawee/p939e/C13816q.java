package com.facebook.drawee.p939e;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.e.q */
public final class C13816q {

    /* renamed from: com.facebook.drawee.e.q$a */
    public static abstract class C13817a implements C13818b {
        /* renamed from: a */
        public abstract void mo25874a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);

        /* renamed from: a */
        public final Matrix mo25873a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            int i3 = i;
            int i4 = i2;
            mo25874a(matrix, rect, i3, i4, f, f2, ((float) rect.width()) / ((float) i3), ((float) rect.height()) / ((float) i4));
            return matrix;
        }
    }

    /* renamed from: com.facebook.drawee.e.q$b */
    public interface C13818b {

        /* renamed from: a */
        public static final C13818b f36061a = C13826j.f36077j;

        /* renamed from: b */
        public static final C13818b f36062b = C13825i.f36076j;

        /* renamed from: c */
        public static final C13818b f36063c = C13823g.f36074j;

        /* renamed from: d */
        public static final C13818b f36064d = C13824h.f36075j;

        /* renamed from: e */
        public static final C13818b f36065e = C13819c.f36070j;

        /* renamed from: f */
        public static final C13818b f36066f = C13821e.f36072j;

        /* renamed from: g */
        public static final C13818b f36067g = C13820d.f36071j;

        /* renamed from: h */
        public static final C13818b f36068h = C13827k.f36078j;

        /* renamed from: i */
        public static final C13818b f36069i = C13822f.f36073j;

        /* renamed from: a */
        Matrix mo25873a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    /* renamed from: com.facebook.drawee.e.q$c */
    static class C13819c extends C13817a {

        /* renamed from: j */
        public static final C13818b f36070j = new C13819c();

        private C13819c() {
        }

        public final String toString() {
            return "center";
        }

        /* renamed from: a */
        public final void mo25874a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f) + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$d */
    static class C13820d extends C13817a {

        /* renamed from: j */
        public static final C13818b f36071j = new C13820d();

        private C13820d() {
        }

        public final String toString() {
            return "center_crop";
        }

        /* renamed from: a */
        public final void mo25874a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
                f6 = (float) rect.top;
                f5 = width;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                f6 = ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$e */
    static class C13821e extends C13817a {

        /* renamed from: j */
        public static final C13818b f36072j = new C13821e();

        private C13821e() {
        }

        public final String toString() {
            return "center_inside";
        }

        /* renamed from: a */
        public final void mo25874a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$f */
    static class C13822f extends C13817a {

        /* renamed from: j */
        public static final C13818b f36073j = new C13822f();

        private C13822f() {
        }

        public final String toString() {
            return "fit_bottom_start";
        }

        /* renamed from: a */
        public final void mo25874a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$g */
    static class C13823g extends C13817a {

        /* renamed from: j */
        public static final C13818b f36074j = new C13823g();

        private C13823g() {
        }

        public final String toString() {
            return "fit_center";
        }

        /* renamed from: a */
        public final void mo25874a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$h */
    static class C13824h extends C13817a {

        /* renamed from: j */
        public static final C13818b f36075j = new C13824h();

        private C13824h() {
        }

        public final String toString() {
            return "fit_end";
        }

        /* renamed from: a */
        public final void mo25874a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + (((float) rect.width()) - (((float) i) * min));
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$i */
    static class C13825i extends C13817a {

        /* renamed from: j */
        public static final C13818b f36076j = new C13825i();

        private C13825i() {
        }

        public final String toString() {
            return "fit_start";
        }

        /* renamed from: a */
        public final void mo25874a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$j */
    static class C13826j extends C13817a {

        /* renamed from: j */
        public static final C13818b f36077j = new C13826j();

        private C13826j() {
        }

        public final String toString() {
            return "fit_xy";
        }

        /* renamed from: a */
        public final void mo25874a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$k */
    static class C13827k extends C13817a {

        /* renamed from: j */
        public static final C13818b f36078j = new C13827k();

        private C13827k() {
        }

        public final String toString() {
            return "focus_crop";
        }

        /* renamed from: a */
        public final void mo25874a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float f7 = ((float) i) * f4;
                f5 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f7), 0.0f), ((float) rect.width()) - f7);
                f6 = (float) rect.top;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                float f8 = ((float) i2) * f3;
                float height = (((float) rect.height()) * 0.5f) - (f2 * f8);
                f6 = Math.max(Math.min(height, 0.0f), ((float) rect.height()) - f8) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.e.q$l */
    public interface C13828l {
        /* renamed from: a */
        Object mo25884a();
    }

    /* renamed from: a */
    public static C13815p m28034a(Drawable drawable) {
        while (drawable != null) {
            if (drawable instanceof C13815p) {
                return (C13815p) drawable;
            }
            if (drawable instanceof C13800c) {
                drawable = ((C13800c) drawable).getDrawable();
            } else {
                if (drawable instanceof C13797a) {
                    C13797a aVar = (C13797a) drawable;
                    int a = aVar.mo25778a();
                    for (int i = 0; i < a; i++) {
                        C13815p a2 = m28034a(aVar.mo25779a(i));
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }
}
