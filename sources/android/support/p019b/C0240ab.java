package android.support.p019b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1056u;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.b.ab */
class C0240ab implements C0243ad {

    /* renamed from: a */
    public C0241a f590a;

    /* renamed from: android.support.b.ab$a */
    static class C0241a extends ViewGroup {

        /* renamed from: a */
        static Method f591a;

        /* renamed from: b */
        ViewGroup f592b;

        /* renamed from: c */
        View f593c;

        /* renamed from: d */
        ArrayList<Drawable> f594d;

        /* renamed from: e */
        C0240ab f595e;

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            try {
                f591a = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        public final void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* renamed from: b */
        public final void mo504b(View view) {
            boolean z;
            super.removeView(view);
            if (getChildCount() == 0 && (this.f594d == null || this.f594d.size() == 0)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f592b.removeView(this);
            }
        }

        /* access modifiers changed from: protected */
        public final boolean verifyDrawable(Drawable drawable) {
            if (super.verifyDrawable(drawable) || (this.f594d != null && this.f594d.contains(drawable))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo503a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f592b || viewGroup.getParent() == null || !C1056u.m3018B(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f592b.getLocationOnScreen(iArr2);
                    C1056u.m3060h(view, iArr[0] - iArr2[0]);
                    C1056u.m3058g(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: protected */
        public final void dispatchDraw(Canvas canvas) {
            int i;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f592b.getLocationOnScreen(iArr);
            this.f593c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f593c.getWidth(), this.f593c.getHeight()));
            super.dispatchDraw(canvas);
            if (this.f594d == null) {
                i = 0;
            } else {
                i = this.f594d.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                ((Drawable) this.f594d.get(i2)).draw(canvas);
            }
        }

        public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f592b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f592b instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    int[] iArr3 = new int[2];
                    this.f592b.getLocationOnScreen(iArr2);
                    this.f593c.getLocationOnScreen(iArr3);
                    int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
                    rect.offset(iArr4[0], iArr4[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        C0241a(Context context, ViewGroup viewGroup, View view, C0240ab abVar) {
            super(context);
            this.f592b = viewGroup;
            this.f593c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f595e = abVar;
        }
    }

    /* renamed from: b */
    public final void mo502b(Drawable drawable) {
        C0241a aVar = this.f590a;
        if (aVar.f594d != null) {
            aVar.f594d.remove(drawable);
            aVar.invalidate(drawable.getBounds());
            drawable.setCallback(null);
        }
    }

    /* renamed from: a */
    private static ViewGroup mo634a(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: c */
    static C0240ab m489c(View view) {
        ViewGroup a = mo634a(view);
        if (a == null) {
            return null;
        }
        int childCount = a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = a.getChildAt(i);
            if (childAt instanceof C0241a) {
                return ((C0241a) childAt).f595e;
            }
        }
        return new C0316v(a.getContext(), a, view);
    }

    /* renamed from: a */
    public final void mo501a(Drawable drawable) {
        C0241a aVar = this.f590a;
        if (aVar.f594d == null) {
            aVar.f594d = new ArrayList<>();
        }
        if (!aVar.f594d.contains(drawable)) {
            aVar.f594d.add(drawable);
            aVar.invalidate(drawable.getBounds());
            drawable.setCallback(aVar);
        }
    }

    C0240ab(Context context, ViewGroup viewGroup, View view) {
        this.f590a = new C0241a(context, viewGroup, view, this);
    }
}
