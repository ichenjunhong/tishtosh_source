package android.support.p019b;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: android.support.b.l */
public final class C0286l extends C0251aj {

    /* renamed from: q */
    private static final TimeInterpolator f698q = new DecelerateInterpolator();

    /* renamed from: r */
    private static final TimeInterpolator f699r = new AccelerateInterpolator();

    /* renamed from: t */
    private static final C0293a f700t = new C0294b() {
        /* renamed from: a */
        public final float mo585a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: u */
    private static final C0293a f701u = new C0294b() {
        /* renamed from: a */
        public final float mo585a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C1056u.m3055f(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: v */
    private static final C0293a f702v = new C0295c() {
        /* renamed from: b */
        public final float mo586b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    };

    /* renamed from: w */
    private static final C0293a f703w = new C0294b() {
        /* renamed from: a */
        public final float mo585a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: x */
    private static final C0293a f704x = new C0294b() {
        /* renamed from: a */
        public final float mo585a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C1056u.m3055f(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };

    /* renamed from: y */
    private static final C0293a f705y = new C0295c() {
        /* renamed from: b */
        public final float mo586b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    };

    /* renamed from: a */
    public int f706a = 80;

    /* renamed from: s */
    private C0293a f707s = f705y;

    /* renamed from: android.support.b.l$a */
    interface C0293a {
        /* renamed from: a */
        float mo585a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo586b(ViewGroup viewGroup, View view);
    }

    /* renamed from: android.support.b.l$b */
    static abstract class C0294b implements C0293a {
        private C0294b() {
        }

        /* renamed from: b */
        public final float mo586b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: android.support.b.l$c */
    static abstract class C0295c implements C0293a {
        private C0295c() {
        }

        /* renamed from: a */
        public final float mo585a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public C0286l() {
        mo584a(80);
    }

    /* renamed from: a */
    public final void mo524a(C0312s sVar) {
        super.mo524a(sVar);
        m583d(sVar);
    }

    /* renamed from: b */
    public final void mo528b(C0312s sVar) {
        super.mo528b(sVar);
        m583d(sVar);
    }

    /* renamed from: d */
    private static void m583d(C0312s sVar) {
        int[] iArr = new int[2];
        sVar.f771b.getLocationOnScreen(iArr);
        sVar.f770a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: a */
    public final void mo584a(int i) {
        if (i == 3) {
            this.f707s = f700t;
        } else if (i == 5) {
            this.f707s = f703w;
        } else if (i == 48) {
            this.f707s = f702v;
        } else if (i == 80) {
            this.f707s = f705y;
        } else if (i == 8388611) {
            this.f707s = f701u;
        } else if (i == 8388613) {
            this.f707s = f704x;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f706a = i;
        C0285k kVar = new C0285k();
        kVar.f696a = i;
        mo594a((C0307p) kVar);
    }

    /* renamed from: a */
    public final Animator mo523a(ViewGroup viewGroup, View view, C0312s sVar, C0312s sVar2) {
        if (sVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) sVar2.f770a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C0314u.m684a(view, sVar2, iArr[0], iArr[1], this.f707s.mo585a(viewGroup, view), this.f707s.mo586b(viewGroup, view), translationX, translationY, f698q);
    }

    /* renamed from: b */
    public final Animator mo527b(ViewGroup viewGroup, View view, C0312s sVar, C0312s sVar2) {
        if (sVar == null) {
            return null;
        }
        int[] iArr = (int[]) sVar.f770a.get("android:slide:screenPosition");
        return C0314u.m684a(view, sVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f707s.mo585a(viewGroup, view), this.f707s.mo586b(viewGroup, view), f699r);
    }
}
