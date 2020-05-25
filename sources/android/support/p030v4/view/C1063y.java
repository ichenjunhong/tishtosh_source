package android.support.p030v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.y */
public final class C1063y {

    /* renamed from: a */
    Runnable f3354a;

    /* renamed from: b */
    Runnable f3355b;

    /* renamed from: c */
    int f3356c = -1;

    /* renamed from: d */
    private WeakReference<View> f3357d;

    /* renamed from: android.support.v4.view.y$a */
    static class C1066a implements C1067z {

        /* renamed from: a */
        C1063y f3364a;

        /* renamed from: b */
        boolean f3365b;

        C1066a(C1063y yVar) {
            this.f3364a = yVar;
        }

        /* renamed from: c */
        public final void mo3182c(View view) {
            C1067z zVar;
            Object tag = view.getTag(2113929216);
            if (tag instanceof C1067z) {
                zVar = (C1067z) tag;
            } else {
                zVar = null;
            }
            if (zVar != null) {
                zVar.mo3182c(view);
            }
        }

        /* renamed from: a */
        public final void mo3180a(View view) {
            this.f3365b = false;
            C1067z zVar = null;
            if (this.f3364a.f3356c >= 0) {
                view.setLayerType(2, null);
            }
            if (this.f3364a.f3354a != null) {
                Runnable runnable = this.f3364a.f3354a;
                this.f3364a.f3354a = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C1067z) {
                zVar = (C1067z) tag;
            }
            if (zVar != null) {
                zVar.mo3180a(view);
            }
        }

        /* renamed from: b */
        public final void mo3181b(View view) {
            C1067z zVar = null;
            if (this.f3364a.f3356c >= 0) {
                view.setLayerType(this.f3364a.f3356c, null);
                this.f3364a.f3356c = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f3365b) {
                if (this.f3364a.f3355b != null) {
                    Runnable runnable = this.f3364a.f3355b;
                    this.f3364a.f3355b = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C1067z) {
                    zVar = (C1067z) tag;
                }
                if (zVar != null) {
                    zVar.mo3181b(view);
                }
                this.f3365b = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo3252c() {
        View view = (View) this.f3357d.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a */
    public final long mo3243a() {
        View view = (View) this.f3357d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo3251b() {
        View view = (View) this.f3357d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    C1063y(View view) {
        this.f3357d = new WeakReference<>(view);
    }

    /* renamed from: b */
    public final C1063y mo3249b(float f) {
        View view = (View) this.f3357d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public final C1063y mo3250b(long j) {
        View view = (View) this.f3357d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: a */
    public final C1063y mo3244a(float f) {
        View view = (View) this.f3357d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public final C1063y mo3245a(long j) {
        View view = (View) this.f3357d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public final C1063y mo3246a(final C1017ab abVar) {
        final View view = (View) this.f3357d.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C10652 r1 = null;
            if (abVar != null) {
                r1 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        abVar.mo3183a(view);
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }

    /* renamed from: a */
    public final C1063y mo3247a(C1067z zVar) {
        View view = (View) this.f3357d.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m3100a(view, zVar);
            } else {
                view.setTag(2113929216, zVar);
                m3100a(view, new C1066a(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C1063y mo3248a(Interpolator interpolator) {
        View view = (View) this.f3357d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    private void m3100a(final View view, final C1067z zVar) {
        if (zVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    zVar.mo3182c(view);
                }

                public final void onAnimationEnd(Animator animator) {
                    zVar.mo3181b(view);
                }

                public final void onAnimationStart(Animator animator) {
                    zVar.mo3180a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }
}
