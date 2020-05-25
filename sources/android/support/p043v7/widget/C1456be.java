package android.support.p043v7.widget;

import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v7.widget.be */
final class C1456be implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {

    /* renamed from: j */
    private static C1456be f5256j;

    /* renamed from: k */
    private static C1456be f5257k;

    /* renamed from: a */
    private final View f5258a;

    /* renamed from: b */
    private final CharSequence f5259b;

    /* renamed from: c */
    private final int f5260c;

    /* renamed from: d */
    private final Runnable f5261d = new Runnable() {
        public final void run() {
            C1456be.this.mo5696a(false);
        }
    };

    /* renamed from: e */
    private final Runnable f5262e = new Runnable() {
        public final void run() {
            C1456be.this.mo5695a();
        }
    };

    /* renamed from: f */
    private int f5263f;

    /* renamed from: g */
    private int f5264g;

    /* renamed from: h */
    private C1459bf f5265h;

    /* renamed from: i */
    private boolean f5266i;

    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: c */
    private void m5091c() {
        this.f5258a.removeCallbacks(this.f5261d);
    }

    /* renamed from: d */
    private void m5092d() {
        this.f5263f = Integer.MAX_VALUE;
        this.f5264g = Integer.MAX_VALUE;
    }

    /* renamed from: b */
    private void m5090b() {
        this.f5258a.postDelayed(this.f5261d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5695a() {
        if (f5257k == this) {
            f5257k = null;
            if (this.f5265h != null) {
                this.f5265h.mo5703a();
                this.f5265h = null;
                m5092d();
                this.f5258a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f5256j == this) {
            m5088a((C1456be) null);
        }
        this.f5258a.removeCallbacks(this.f5262e);
    }

    public final void onViewDetachedFromWindow(View view) {
        mo5695a();
    }

    /* renamed from: a */
    private static void m5088a(C1456be beVar) {
        if (f5256j != null) {
            f5256j.m5091c();
        }
        f5256j = beVar;
        if (beVar != null) {
            f5256j.m5090b();
        }
    }

    public final boolean onLongClick(View view) {
        this.f5263f = view.getWidth() / 2;
        this.f5264g = view.getHeight() / 2;
        mo5696a(true);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5696a(boolean z) {
        long j;
        if (C1056u.m3018B(this.f5258a)) {
            m5088a((C1456be) null);
            if (f5257k != null) {
                f5257k.mo5695a();
            }
            f5257k = this;
            this.f5266i = z;
            this.f5265h = new C1459bf(this.f5258a.getContext());
            this.f5265h.mo5704a(this.f5258a, this.f5263f, this.f5264g, this.f5266i, this.f5259b);
            this.f5258a.addOnAttachStateChangeListener(this);
            if (this.f5266i) {
                j = 2500;
            } else if ((C1056u.m3071q(this.f5258a) & 1) == 1) {
                j = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                j = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f5258a.removeCallbacks(this.f5262e);
            this.f5258a.postDelayed(this.f5262e, j);
        }
    }

    private C1456be(View view, CharSequence charSequence) {
        int i;
        this.f5258a = view;
        this.f5259b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f5258a.getContext());
        if (VERSION.SDK_INT >= 28) {
            i = viewConfiguration.getScaledHoverSlop();
        } else {
            i = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f5260c = i;
        m5092d();
        this.f5258a.setOnLongClickListener(this);
        this.f5258a.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m5089a(View view, CharSequence charSequence) {
        if (f5256j != null && f5256j.f5258a == view) {
            m5088a((C1456be) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f5257k != null && f5257k.f5258a == view) {
                f5257k.mo5695a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C1456be(view, charSequence);
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f5265h != null && this.f5266i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f5258a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m5092d();
                mo5695a();
            }
        } else if (this.f5258a.isEnabled() && this.f5265h == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f5263f) > this.f5260c || Math.abs(y - this.f5264g) > this.f5260c) {
                this.f5263f = x;
                this.f5264g = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m5088a(this);
            }
        }
        return false;
    }
}
