package com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.d */
public abstract class C23606d {

    /* renamed from: b */
    private static final String f62847b = "d";

    /* renamed from: a */
    public boolean f62848a;

    /* renamed from: c */
    private boolean f62849c = true;

    /* renamed from: d */
    private Boolean f62850d;

    /* renamed from: b */
    public final void mo48876b() {
        mo48875a(false);
    }

    /* renamed from: a */
    public final void mo48872a() {
        mo48875a(true);
    }

    /* renamed from: c */
    private void m57866c() {
        if (this.f62850d != null) {
            m57865b(this.f62850d.booleanValue());
            this.f62850d = null;
        }
    }

    /* renamed from: a */
    public final AnimationListener mo48871a(final AnimationListener animationListener) {
        return new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
                if (animationListener != null) {
                    animationListener.onAnimationEnd(animation);
                }
                C23606d.this.mo48875a(true);
            }

            public final void onAnimationRepeat(Animation animation) {
                if (animationListener != null) {
                    animationListener.onAnimationRepeat(animation);
                }
            }

            public final void onAnimationStart(Animation animation) {
                if (animationListener != null) {
                    animationListener.onAnimationStart(animation);
                }
            }
        };
    }

    /* renamed from: b */
    private void m57865b(boolean z) {
        if (this.f62848a != z) {
            if (!this.f62849c) {
                this.f62850d = Boolean.valueOf(z);
            } else {
                this.f62848a = z;
            }
        }
    }

    /* renamed from: a */
    public final void mo48873a(float f) {
        mo48875a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48875a(boolean z) {
        if (this.f62849c != z) {
            this.f62849c = z;
            if (z) {
                m57866c();
            }
        }
    }

    /* renamed from: b */
    public final void mo48877b(int i, AnimationListener animationListener) {
        mo48875a(false);
    }

    /* renamed from: a */
    public final void mo48874a(int i, AnimationListener animationListener) {
        mo48875a(false);
    }
}
