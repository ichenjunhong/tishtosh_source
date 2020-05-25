package com.bytedance.ies.uikit.p698b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.uikit.b.a */
public final class C11069a {

    /* renamed from: A */
    private boolean f29718A;

    /* renamed from: a */
    public Context f29719a;

    /* renamed from: b */
    ViewGroup f29720b;

    /* renamed from: c */
    public View f29721c;

    /* renamed from: d */
    AnimatorSet f29722d;

    /* renamed from: e */
    public long f29723e = 2500;

    /* renamed from: f */
    public boolean f29724f;

    /* renamed from: g */
    public String f29725g;

    /* renamed from: h */
    public boolean f29726h;

    /* renamed from: i */
    public boolean f29727i;

    /* renamed from: j */
    public float f29728j;

    /* renamed from: k */
    public float f29729k;

    /* renamed from: l */
    public AnimatorSet f29730l;

    /* renamed from: m */
    public AnimatorSet f29731m;

    /* renamed from: n */
    int f29732n;

    /* renamed from: o */
    private int f29733o = 49;

    /* renamed from: p */
    private int[] f29734p;

    /* renamed from: q */
    private TextView f29735q;

    /* renamed from: r */
    private AnimatorSet f29736r;

    /* renamed from: s */
    private ImageView f29737s;

    /* renamed from: t */
    private boolean f29738t;

    /* renamed from: u */
    private WindowManager f29739u;

    /* renamed from: v */
    private LayoutParams f29740v;

    /* renamed from: w */
    private View f29741w;

    /* renamed from: x */
    private boolean f29742x;

    /* renamed from: y */
    private int f29743y;

    /* renamed from: z */
    private int f29744z = R.layout.it;

    /* renamed from: d */
    public final void mo20062d() {
        this.f29724f = false;
    }

    /* renamed from: b */
    public final View mo20057b() {
        if (this.f29721c == null) {
            return this.f29720b;
        }
        return this.f29721c;
    }

    /* renamed from: c */
    public final boolean mo20061c() {
        if (this.f29721c == null || !this.f29721c.isShown()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo20065f() {
        if (this.f29719a == null || this.f29724f) {
            return true;
        }
        return false;
    }

    public final void dismiss() {
        if (this.f29738t) {
            if (!(this.f29720b == null || this.f29720b.getParent() == null)) {
                this.f29739u.removeView(this.f29720b);
                this.f29720b.removeView(this.f29721c);
            }
            this.f29738t = false;
        }
    }

    /* renamed from: a */
    public final AnimatorSet mo20051a() {
        if (this.f29736r == null) {
            this.f29736r = new AnimatorSet();
            this.f29736r.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f29720b, "translationY", new float[]{0.0f, (float) (-this.f29732n)}), ObjectAnimator.ofFloat(this.f29720b, "alpha", new float[]{1.0f, 0.0f})});
            this.f29736r.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f29736r.setDuration(320);
        }
        return this.f29736r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo20064e() {
        if (!mo20065f()) {
            if (this.f29735q != null && !C9431p.m18664a(this.f29725g)) {
                this.f29735q.setText(this.f29725g);
            }
            this.f29738t = true;
            this.f29720b.removeAllViews();
            if (this.f29721c.getParent() == null) {
                this.f29720b.addView(this.f29721c);
            } else {
                ((ViewGroup) this.f29721c.getParent()).removeView(this.f29721c);
                this.f29720b.addView(this.f29721c);
            }
            if (this.f29740v == null) {
                LayoutParams layoutParams = new LayoutParams(-1, -2, 2, 262280, -2);
                layoutParams.flags = 262280;
                layoutParams.gravity = this.f29733o;
                if (layoutParams.gravity == 48) {
                    layoutParams.y = this.f29734p[0];
                }
                this.f29740v = layoutParams;
            }
            this.f29739u = (WindowManager) this.f29719a.getSystemService("window");
            if (this.f29720b.getParent() != null) {
                this.f29739u.removeView(this.f29720b);
            }
            try {
                this.f29739u.addView(this.f29720b, this.f29740v);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final C11069a mo20053a(boolean z) {
        this.f29718A = false;
        return this;
    }

    /* renamed from: b */
    public final C11069a mo20058b(int i) {
        this.f29733o = i;
        return this;
    }

    /* renamed from: b */
    public final C11069a mo20059b(boolean z) {
        this.f29727i = z;
        return this;
    }

    /* renamed from: a */
    public View mo20052a(int i) {
        int i2;
        View view;
        LayoutInflater from = LayoutInflater.from(this.f29719a);
        if (-1 == this.f29743y) {
            return this.f29741w;
        }
        if (this.f29744z > 0) {
            i2 = this.f29744z;
        } else if (this.f29742x) {
            i2 = R.layout.ir;
        } else {
            i2 = R.layout.iq;
        }
        try {
            view = from.inflate(i2, this.f29720b, false);
            this.f29741w = view;
            this.f29743y = i2;
        } catch (InflateException unused) {
            if (this.f29741w == null) {
                this.f29741w = from.inflate(R.layout.iq, this.f29720b, false);
            }
            this.f29743y = R.layout.iq;
            view = this.f29741w;
        }
        return view;
    }

    /* renamed from: a */
    public final void mo20055a(AnimatorSet animatorSet, AnimatorSet animatorSet2) {
        this.f29722d = animatorSet;
        this.f29736r = animatorSet2;
    }

    public C11069a(Context context, int i) {
        m22399a(context, (View) null);
    }

    /* renamed from: b */
    public final void mo20060b(String str, int i) {
        this.f29721c = mo20052a(-1);
        mo20056a(str, i);
        C11071b.m22414a().mo20068a(this);
    }

    /* renamed from: a */
    private void m22399a(Context context, View view) {
        this.f29719a = context;
        this.f29734p = new int[4];
        if (!mo20065f()) {
            this.f29720b = new FrameLayout(this.f29719a);
            this.f29732n = (int) context.getResources().getDimension(R.dimen.n_);
            this.f29720b.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            C11069a.this.f29728j = motionEvent.getY();
                            C11069a.this.mo20054a(C11069a.this.f29730l, 1.0f, 0.98f);
                            break;
                        case 1:
                            C11069a.this.mo20054a(C11069a.this.f29731m, 0.98f, 1.0f);
                            if (C11069a.this.f29727i && C11069a.this.f29729k - C11069a.this.f29728j < 0.0f && Math.abs(C11069a.this.f29729k - C11069a.this.f29728j) > 20.0f) {
                                C11071b.m22414a().mo20069b(C11069a.this);
                                break;
                            }
                        case 2:
                            C11069a.this.f29729k = motionEvent.getY();
                            break;
                        case 3:
                            C11069a.this.mo20054a(C11069a.this.f29731m, 0.98f, 1.0f);
                            break;
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo20056a(String str, int i) {
        if (!mo20065f()) {
            this.f29725g = str;
            if (this.f29721c != null) {
                this.f29735q = (TextView) this.f29721c.findViewById(R.id.text);
                this.f29737s = (ImageView) this.f29721c.findViewById(R.id.aqa);
            }
            if (this.f29737s != null && i == -1) {
                this.f29737s.setVisibility(8);
            }
            this.f29721c.measure(MeasureSpec.makeMeasureSpec(1073741823, DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(1073741823, DynamicTabYellowPointVersion.DEFAULT));
        }
    }

    /* renamed from: a */
    public final void mo20054a(AnimatorSet animatorSet, float f, float f2) {
        if (this.f29718A) {
            if (animatorSet == null && this.f29721c != null) {
                animatorSet = new AnimatorSet();
                animatorSet.play(ObjectAnimator.ofFloat(this.f29720b, "scaleX", new float[]{f, f2})).with(ObjectAnimator.ofFloat(this.f29720b, "scaleY", new float[]{f, f2}));
                animatorSet.setDuration(80);
            }
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }
}
