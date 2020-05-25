package com.p683ss.android.ugc.aweme.account.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21109n;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.CheckButton;
import com.p683ss.android.ugc.aweme.p2396w.C48222b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.view.StateButton */
public class StateButton extends DmtButton {

    /* renamed from: b */
    public static int f60087b = 0;

    /* renamed from: c */
    public static int f60088c = 1;

    /* renamed from: d */
    public static int f60089d = 2;

    /* renamed from: e */
    public static int f60090e = 0;

    /* renamed from: f */
    public static int f60091f = 1;

    /* renamed from: g */
    private Drawable f60092g;

    /* renamed from: h */
    private Drawable f60093h;

    /* renamed from: i */
    private Drawable f60094i;

    /* renamed from: j */
    private Animation f60095j;

    /* renamed from: k */
    private int f60096k;

    /* renamed from: l */
    private int f60097l;

    /* renamed from: m */
    private int f60098m;

    /* renamed from: com.ss.android.ugc.aweme.account.view.StateButton$a */
    public static class C22308a {
        /* renamed from: a */
        public static void m55205a(View view) {
            if (view instanceof StateButton) {
                ((StateButton) view).mo46390b();
            } else if (view instanceof C21109n) {
                ((C21109n) view).mo45160a();
            } else {
                if (view instanceof CheckButton) {
                    ((CheckButton) view).mo45737c();
                }
            }
        }

        /* renamed from: b */
        public static void m55207b(View view) {
            if (view instanceof StateButton) {
                ((StateButton) view).mo46388a();
            } else if (view instanceof C21109n) {
                ((C21109n) view).mo45161c();
            } else {
                if (view instanceof CheckButton) {
                    ((CheckButton) view).mo45735a();
                }
            }
        }

        /* renamed from: a */
        public static void m55206a(View view, boolean z) {
            if (!(view instanceof StateButton)) {
                view.setEnabled(z);
            } else if (z) {
                ((StateButton) view).mo46389a(StateButton.f60088c);
            } else {
                ((StateButton) view).mo46389a(StateButton.f60087b);
            }
        }
    }

    /* renamed from: a */
    public final void mo46388a() {
        mo46389a(f60089d);
    }

    /* renamed from: b */
    public final void mo46390b() {
        if (this.f60096k == f60089d) {
            mo46389a(this.f60097l);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f60095j != null) {
            this.f60095j.cancel();
        }
    }

    public StateButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo46389a(int i) {
        if (this.f60096k != i) {
            this.f60097l = this.f60096k;
            this.f60096k = i;
            if (!(this.f60096k == f60089d || this.f60097l != f60089d || this.f60095j == null)) {
                clearAnimation();
                this.f60095j.cancel();
            }
            if (i == f60087b) {
                setBackground(this.f60092g);
            } else if (i == f60088c) {
                setBackground(this.f60093h);
            } else if (i == f60089d) {
                setBackground(this.f60094i);
                startAnimation(this.f60095j);
            } else {
                this.f60096k = this.f60097l;
            }
        }
    }

    public StateButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StateButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f60096k = -1;
        this.f60097l = this.f60096k;
        this.f60098m = f60090e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jk, R.attr.jr, R.attr.kb, R.attr.t6, R.attr.vw});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                mo46389a(obtainStyledAttributes.getInt(0, f60087b));
            } else if (index == 1) {
                this.f60092g = obtainStyledAttributes.getDrawable(1);
            } else if (index == 2) {
                this.f60093h = obtainStyledAttributes.getDrawable(2);
            } else if (index == 3) {
                this.f60094i = obtainStyledAttributes.getDrawable(3);
            } else if (index == 4) {
                this.f60098m = obtainStyledAttributes.getInt(4, f60090e);
            }
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f60095j = rotateAnimation;
        this.f60095j.setRepeatCount(-1);
        this.f60095j.setDuration(800);
        if (this.f60098m == f60091f) {
            setOnTouchListener(new C48222b(1.2f, 100, null));
        }
        if (this.f60096k == -1) {
            mo46389a(f60087b);
        }
        obtainStyledAttributes.recycle();
    }
}
