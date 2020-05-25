package com.bytedance.android.live.core.p230g.p231a;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: com.bytedance.android.live.core.g.a.b */
public final class C3851b {

    /* renamed from: com.bytedance.android.live.core.g.a.b$a */
    static class C3852a implements OnAttachStateChangeListener, OnPreDrawListener {

        /* renamed from: a */
        private View f10870a;

        /* renamed from: b */
        private OnAttachStateChangeListener f10871b;

        /* renamed from: c */
        private boolean f10872c;

        /* renamed from: d */
        private boolean f10873d;

        public final boolean onPreDraw() {
            m9778a();
            return true;
        }

        /* renamed from: a */
        private void m9778a() {
            boolean b = m9780b();
            if (this.f10873d != b) {
                this.f10873d = b;
                if (this.f10873d) {
                    this.f10871b.onViewAttachedToWindow(this.f10870a);
                    return;
                }
                this.f10871b.onViewDetachedFromWindow(this.f10870a);
            }
        }

        /* renamed from: b */
        private boolean m9780b() {
            if (this.f10872c) {
                View view = this.f10870a;
                while (true) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                }
                if (view == this.f10870a.getRootView()) {
                    return true;
                }
            }
            return false;
        }

        public final void onViewAttachedToWindow(View view) {
            if (!this.f10872c) {
                this.f10872c = true;
                this.f10870a.getViewTreeObserver().addOnPreDrawListener(this);
                m9778a();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (this.f10872c) {
                this.f10872c = false;
                this.f10870a.getViewTreeObserver().removeOnPreDrawListener(this);
                m9778a();
            }
        }

        /* renamed from: a */
        public static void m9779a(View view, OnAttachStateChangeListener onAttachStateChangeListener) {
            new C3852a(view, onAttachStateChangeListener);
        }

        private C3852a(View view, OnAttachStateChangeListener onAttachStateChangeListener) {
            boolean z;
            this.f10870a = view;
            this.f10871b = onAttachStateChangeListener;
            View view2 = this.f10870a;
            if (VERSION.SDK_INT >= 19) {
                z = view2.isAttachedToWindow();
            } else if (view2.getWindowToken() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f10872c = z;
            this.f10873d = false;
            if (this.f10872c) {
                this.f10870a.getViewTreeObserver().addOnPreDrawListener(this);
            }
            this.f10870a.addOnAttachStateChangeListener(this);
            m9778a();
        }
    }

    /* renamed from: a */
    public static void m9777a(View view, OnAttachStateChangeListener onAttachStateChangeListener) {
        C3852a.m9779a(view, onAttachStateChangeListener);
    }
}
