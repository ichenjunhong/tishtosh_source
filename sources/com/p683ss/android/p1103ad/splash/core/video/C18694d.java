package com.p683ss.android.p1103ad.splash.core.video;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.p1123g.C18752p;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ad.splash.core.video.d */
public final class C18694d implements C18675a {

    /* renamed from: a */
    FrameLayout f51667a;

    /* renamed from: b */
    TextView f51668b;

    /* renamed from: c */
    TextView f51669c;

    /* renamed from: d */
    ImageView f51670d;

    /* renamed from: e */
    public ImageView f51671e;

    /* renamed from: f */
    SSRenderSurfaceView f51672f;

    /* renamed from: g */
    View f51673g;

    /* renamed from: h */
    int f51674h;

    /* renamed from: i */
    int f51675i;

    /* renamed from: j */
    View f51676j;

    /* renamed from: k */
    Context f51677k;

    /* renamed from: l */
    public boolean f51678l;

    /* renamed from: m */
    public C18698a f51679m;

    /* renamed from: n */
    FrameLayout f51680n;

    /* renamed from: o */
    TextView f51681o;

    /* renamed from: p */
    Space f51682p;

    /* renamed from: q */
    TextView f51683q;

    /* renamed from: r */
    TextView f51684r;

    /* renamed from: s */
    public boolean f51685s;

    /* renamed from: t */
    private OnTouchListener f51686t = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                C18694d dVar = C18694d.this;
                if (dVar.mo38244d()) {
                    dVar.f51679m.mo38252a(dVar, view, motionEvent);
                }
            }
            return true;
        }
    };

    /* renamed from: com.ss.android.ad.splash.core.video.d$a */
    interface C18698a {
        /* renamed from: a */
        void mo38249a();

        /* renamed from: a */
        void mo38250a(C18694d dVar, SurfaceHolder surfaceHolder);

        /* renamed from: a */
        void mo38251a(C18694d dVar, SurfaceHolder surfaceHolder, int i, int i2, int i3);

        /* renamed from: a */
        void mo38252a(C18694d dVar, View view, MotionEvent motionEvent);

        /* renamed from: b */
        void mo38253b(C18694d dVar, SurfaceHolder surfaceHolder);
    }

    /* renamed from: c */
    public final void mo38243c() {
        this.f51673g.setVisibility(8);
    }

    /* renamed from: d */
    public final boolean mo38244d() {
        if (this.f51679m != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final LayoutParams mo38239a() {
        if (this.f51676j.getLayoutParams() instanceof LayoutParams) {
            return (LayoutParams) this.f51676j.getLayoutParams();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38241b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.setMargins(0, (int) C18752p.m45750a(this.f51677k, 14.0f), (int) C18752p.m45750a(this.f51677k, 9.0f), 0);
        this.f51668b.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    public final void mo38245e() {
        mo38242b(8);
        this.f51669c.setVisibility(4);
        this.f51667a.setVisibility(8);
        this.f51668b.setVisibility(8);
        this.f51670d.setVisibility(8);
        this.f51671e.setVisibility(4);
        if (this.f51685s) {
            this.f51680n.setVisibility(8);
            this.f51683q.setVisibility(8);
            this.f51684r.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo38242b(int i) {
        C18752p.m45753a(this.f51676j, i);
    }

    /* renamed from: a */
    public final void mo38240a(int i) {
        this.f51676j.setVisibility(0);
        if (this.f51672f != null) {
            this.f51672f.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo38195b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f51672f.getHolder()) {
            this.f51678l = false;
            if (mo38244d()) {
                this.f51679m.mo38253b(this, surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    public final void mo38193a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == this.f51672f.getHolder()) {
            this.f51678l = true;
            if (mo38244d()) {
                this.f51679m.mo38250a(this, surfaceHolder);
            }
        }
    }

    C18694d(Context context, View view) {
        mo38242b(8);
        this.f51677k = context;
        if (view != null) {
            this.f51669c = (TextView) view.findViewById(R.id.cs);
            this.f51667a = (FrameLayout) view.findViewById(R.id.cr);
            this.f51668b = (TextView) view.findViewById(R.id.cq);
            if (C18642g.m45239l() != 0) {
                this.f51668b.setText(C18642g.m45239l());
            } else {
                this.f51668b.setText(R.string.dm8);
            }
            this.f51671e = (ImageView) view.findViewById(R.id.cu);
            this.f51670d = (ImageView) view.findViewById(R.id.ct);
            if (C18642g.m45243p() != 0) {
                this.f51670d.setImageResource(C18642g.m45243p());
            }
            this.f51681o = (TextView) view.findViewById(R.id.b3);
            this.f51680n = (FrameLayout) view.findViewById(R.id.b2);
            this.f51682p = (Space) view.findViewById(R.id.b1);
            this.f51683q = (TextView) view.findViewById(R.id.b5);
            this.f51684r = (TextView) view.findViewById(R.id.b4);
            if (C18642g.m45241n() != 0) {
                this.f51669c.setText(C18642g.m45241n());
            } else {
                this.f51669c.setText(R.string.dlt);
            }
            if (C18642g.m45242o() != 0) {
                this.f51671e.setImageResource(C18642g.m45242o());
            } else {
                this.f51671e.setImageResource(R.drawable.bbx);
            }
            if (C18642g.m45240m() != 0) {
                this.f51669c.setBackgroundResource(C18642g.m45240m());
                this.f51681o.setBackgroundResource(C18642g.m45240m());
            }
            this.f51672f = (SSRenderSurfaceView) view.findViewById(R.id.dq7);
            this.f51672f.mo38187a(this);
            this.f51673g = view.findViewById(R.id.dph);
            this.f51667a.setWillNotDraw(false);
            this.f51680n.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C18694d.this.mo38244d()) {
                        C18694d.this.f51679m.mo38249a();
                    }
                }
            });
            this.f51669c.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    view.setVisibility(4);
                    C18694d.this.f51671e.setVisibility(0);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setDuration(800);
                    rotateAnimation.setRepeatCount(10);
                    rotateAnimation.setRepeatMode(1);
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                    C18694d.this.f51671e.startAnimation(rotateAnimation);
                    if (C18694d.this.mo38244d()) {
                        C18694d.this.f51679m.mo38249a();
                    }
                }
            });
        }
        this.f51676j = view;
        if (this.f51676j != null) {
            this.f51676j.setOnTouchListener(this.f51686t);
        }
    }

    /* renamed from: a */
    public final void mo38194a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == this.f51672f.getHolder() && mo38244d()) {
            this.f51679m.mo38251a(this, surfaceHolder, i, i2, i3);
        }
    }
}
