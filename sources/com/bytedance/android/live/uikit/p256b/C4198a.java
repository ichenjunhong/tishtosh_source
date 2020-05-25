package com.bytedance.android.live.uikit.p256b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.uikit.b.a */
public final class C4198a {

    /* renamed from: A */
    private boolean f11383A;

    /* renamed from: a */
    public Context f11384a;

    /* renamed from: b */
    ViewGroup f11385b;

    /* renamed from: c */
    public int f11386c = 49;

    /* renamed from: d */
    public View f11387d;

    /* renamed from: e */
    public TextView f11388e;

    /* renamed from: f */
    AnimatorSet f11389f;

    /* renamed from: g */
    public long f11390g = 2500;

    /* renamed from: h */
    public ImageView f11391h;

    /* renamed from: i */
    public boolean f11392i;

    /* renamed from: j */
    public String f11393j;

    /* renamed from: k */
    public boolean f11394k;

    /* renamed from: l */
    public boolean f11395l;

    /* renamed from: m */
    public boolean f11396m;

    /* renamed from: n */
    public float f11397n;

    /* renamed from: o */
    public float f11398o;

    /* renamed from: p */
    public AnimatorSet f11399p;

    /* renamed from: q */
    public AnimatorSet f11400q;

    /* renamed from: r */
    int f11401r;

    /* renamed from: s */
    private int[] f11402s;

    /* renamed from: t */
    private AnimatorSet f11403t;

    /* renamed from: u */
    private boolean f11404u;

    /* renamed from: v */
    private WindowManager f11405v;

    /* renamed from: w */
    private LayoutParams f11406w;

    /* renamed from: x */
    private View f11407x;

    /* renamed from: y */
    private int f11408y;

    /* renamed from: z */
    private int f11409z;

    /* renamed from: b */
    public final boolean mo9650b() {
        if (this.f11387d == null || !this.f11387d.isShown()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo9652d() {
        if (this.f11384a == null || this.f11392i) {
            return true;
        }
        return false;
    }

    public final void dismiss() {
        if (this.f11404u) {
            if (!(this.f11385b == null || this.f11385b.getParent() == null)) {
                this.f11405v.removeView(this.f11385b);
                this.f11385b.removeView(this.f11387d);
            }
            this.f11404u = false;
        }
    }

    /* renamed from: a */
    public final AnimatorSet mo9647a() {
        if (this.f11403t == null) {
            this.f11403t = new AnimatorSet();
            this.f11403t.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f11385b, "translationY", new float[]{0.0f, (float) (-this.f11401r)}), ObjectAnimator.ofFloat(this.f11385b, "alpha", new float[]{1.0f, 0.0f})});
            this.f11403t.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f11403t.setDuration(320);
        }
        return this.f11403t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo9651c() {
        if (!mo9652d()) {
            if (this.f11388e != null && !C9431p.m18664a(this.f11393j)) {
                this.f11388e.setText(this.f11393j);
            }
            this.f11404u = true;
            this.f11385b.removeAllViews();
            if (this.f11387d.getParent() == null) {
                this.f11385b.addView(this.f11387d);
            } else {
                ((ViewGroup) this.f11387d.getParent()).removeView(this.f11387d);
                this.f11385b.addView(this.f11387d);
            }
            if (this.f11406w == null) {
                LayoutParams layoutParams = new LayoutParams(-1, -2, 2, 262280, -2);
                layoutParams.flags = 262280;
                layoutParams.gravity = this.f11386c;
                if (layoutParams.gravity == 48) {
                    layoutParams.y = this.f11402s[0];
                }
                this.f11406w = layoutParams;
            }
            this.f11405v = (WindowManager) this.f11384a.getSystemService("window");
            if (this.f11385b.getParent() != null) {
                this.f11405v.removeView(this.f11385b);
            }
            try {
                this.f11405v.addView(this.f11385b, this.f11406w);
            } catch (Exception unused) {
            }
        }
    }

    public C4198a(Context context) {
        this.f11384a = context;
        this.f11402s = new int[4];
        if (!mo9652d()) {
            this.f11385b = new FrameLayout(this.f11384a);
            this.f11401r = (int) context.getResources().getDimension(R.dimen.n_);
            this.f11385b.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            C4198a.this.f11397n = motionEvent.getY();
                            C4198a.this.mo9649a(C4198a.this.f11399p, 1.0f, 0.98f);
                            break;
                        case 1:
                            C4198a.this.mo9649a(C4198a.this.f11400q, 0.98f, 1.0f);
                            if (C4198a.this.f11395l && C4198a.this.f11398o - C4198a.this.f11397n < 0.0f && Math.abs(C4198a.this.f11398o - C4198a.this.f11397n) > 20.0f) {
                                C4200b.m10416a().mo9655a(C4198a.this);
                                break;
                            }
                        case 2:
                            C4198a.this.f11398o = motionEvent.getY();
                            break;
                        case 3:
                            C4198a.this.mo9649a(C4198a.this.f11400q, 0.98f, 1.0f);
                            break;
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    public View mo9648a(int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(this.f11384a);
        if (i == this.f11408y) {
            return this.f11407x;
        }
        if (i == -1) {
            if (this.f11409z > 0) {
                i = this.f11409z;
            } else if (this.f11396m) {
                i = R.layout.a_0;
            } else {
                i = R.layout.a9z;
            }
        }
        try {
            view = from.inflate(i, this.f11385b, false);
            this.f11407x = view;
            this.f11408y = i;
        } catch (InflateException unused) {
            if (this.f11407x == null) {
                this.f11407x = from.inflate(R.layout.a9z, this.f11385b, false);
            }
            this.f11408y = R.layout.a9z;
            view = this.f11407x;
        }
        return view;
    }

    /* renamed from: a */
    public final void mo9649a(AnimatorSet animatorSet, float f, float f2) {
        if (this.f11383A) {
            if (animatorSet == null && this.f11387d != null) {
                animatorSet = new AnimatorSet();
                animatorSet.play(ObjectAnimator.ofFloat(this.f11385b, "scaleX", new float[]{f, f2})).with(ObjectAnimator.ofFloat(this.f11385b, "scaleY", new float[]{f, f2}));
                animatorSet.setDuration(80);
            }
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }
}
