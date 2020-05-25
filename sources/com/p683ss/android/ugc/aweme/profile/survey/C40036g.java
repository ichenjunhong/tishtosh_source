package com.p683ss.android.ugc.aweme.profile.survey;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.p683ss.android.ugc.aweme.p1465bs.C24047a;
import com.ss.android.ugc.trill.R;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.g */
public abstract class C40036g implements OnClickListener {

    /* renamed from: k */
    private static final boolean f101979k = false;

    /* renamed from: a */
    public View f101980a;

    /* renamed from: b */
    public View f101981b;

    /* renamed from: c */
    public View f101982c;

    /* renamed from: d */
    TextView f101983d;

    /* renamed from: e */
    TextView f101984e;

    /* renamed from: f */
    public C40031c f101985f;

    /* renamed from: g */
    public C24047a f101986g;

    /* renamed from: h */
    Animator f101987h;

    /* renamed from: i */
    public boolean f101988i;

    /* renamed from: j */
    boolean f101989j;

    /* renamed from: l */
    private ViewStub f101990l;

    /* renamed from: m */
    private TextView f101991m;

    /* renamed from: n */
    private TextView f101992n;

    /* renamed from: o */
    private TextView f101993o;

    /* renamed from: p */
    private TextView f101994p;

    /* renamed from: q */
    private ValueAnimator f101995q;

    /* renamed from: r */
    private boolean f101996r;

    /* renamed from: a */
    public abstract int mo82056a();

    /* renamed from: f */
    public final int mo82070f() {
        if (this.f101986g != null) {
            return this.f101986g.f63822a;
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo82071g() {
        if (this.f101986g != null) {
            return this.f101986g.f63830i;
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo82068d() {
        if (this.f101980a != null) {
            this.f101980a.setVisibility(8);
        }
        m89008h();
        this.f101988i = false;
    }

    /* renamed from: h */
    private void m89008h() {
        if (this.f101987h != null && this.f101995q != null) {
            if (this.f101987h.isStarted() || this.f101987h.isRunning()) {
                this.f101987h.cancel();
            }
            if (this.f101995q.isStarted() || this.f101995q.isRunning()) {
                this.f101995q.cancel();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo82067c() {
        this.f101980a.setTranslationY((float) this.f101980a.getHeight());
        LayoutParams layoutParams = this.f101982c.getLayoutParams();
        layoutParams.height = this.f101980a.getHeight();
        this.f101982c.setLayoutParams(layoutParams);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f101980a, View.TRANSLATION_Y, new float[]{(float) this.f101980a.getMeasuredHeight(), 0.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C40036g.this.f101988i = true;
                if (C40036g.this.f101985f != null) {
                    C40036g.this.f101985f.mo82061a(C40036g.this.f101986g);
                }
            }

            public final void onAnimationStart(Animator animator) {
                C40036g.this.f101980a.setVisibility(0);
                C40036g.this.f101981b.setVisibility(0);
                C40036g.this.f101981b.setAlpha(1.0f);
                C40036g.this.f101982c.setVisibility(8);
            }
        });
        ofFloat.start();
    }

    /* renamed from: e */
    public final void mo82069e() {
        if (this.f101995q == null) {
            this.f101995q = ValueAnimator.ofFloat(new float[]{-1.0f, 0.0f, 1.0f});
            this.f101995q.addUpdateListener(new C40040i(this));
            this.f101995q.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C40036g.this.f101982c.setAlpha(0.0f);
                    C40036g.this.f101982c.setVisibility(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    C40036g gVar = C40036g.this;
                    if (!gVar.f101989j) {
                        if (gVar.f101987h == null) {
                            gVar.f101987h = ObjectAnimator.ofFloat(gVar.f101980a, View.TRANSLATION_Y, new float[]{0.0f, (float) gVar.f101980a.getHeight()});
                            gVar.f101987h.setDuration(300);
                            gVar.f101987h.setInterpolator(new DecelerateInterpolator());
                            gVar.f101987h.setStartDelay(2000);
                        }
                        if (!gVar.f101987h.isStarted() && !gVar.f101987h.isRunning()) {
                            gVar.f101987h.start();
                        }
                    }
                }
            });
            this.f101995q.setDuration(600);
        }
        if (!this.f101995q.isStarted() && !this.f101995q.isRunning()) {
            this.f101995q.start();
        }
    }

    /* renamed from: b */
    public final void mo82066b() {
        String str;
        String str2;
        if (this.f101990l != null && m89007a(this.f101986g)) {
            if (this.f101980a == null) {
                this.f101980a = this.f101990l.inflate();
                mo82065a(this.f101980a);
            }
            boolean z = false;
            this.f101989j = false;
            C24047a aVar = this.f101986g;
            if (aVar != null) {
                this.f101991m.setText(aVar.f63823b);
                this.f101992n.setText(aVar.f63824c);
                if (new Random().nextInt(2) == 1) {
                    z = true;
                }
                this.f101996r = z;
                TextView textView = this.f101983d;
                if (this.f101996r) {
                    str = aVar.f63826e;
                } else {
                    str = aVar.f63825d;
                }
                textView.setText(str);
                TextView textView2 = this.f101984e;
                if (this.f101996r) {
                    str2 = aVar.f63825d;
                } else {
                    str2 = aVar.f63826e;
                }
                textView2.setText(str2);
                this.f101993o.setText(aVar.f63827f);
                this.f101994p.setText(aVar.f63828g);
            }
            if (this.f101980a.getHeight() > 0) {
                mo82067c();
                return;
            }
            View view = this.f101980a;
            C40039h hVar = new C40039h(this);
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener(viewTreeObserver, view, hVar) {

                    /* renamed from: a */
                    final /* synthetic */ ViewTreeObserver f63261a;

                    /* renamed from: b */
                    final /* synthetic */ View f63262b;

                    /* renamed from: c */
                    final /* synthetic */ OnGlobalLayoutListener f63263c;

                    public final void onGlobalLayout() {
                        if (!this.f63261a.isAlive()) {
                            this.f63262b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else {
                            this.f63261a.removeOnGlobalLayoutListener(this);
                        }
                        this.f63263c.onGlobalLayout();
                    }

                    {
                        this.f63261a = r1;
                        this.f63262b = r2;
                        this.f63263c = r3;
                    }
                });
            }
        }
    }

    C40036g(ViewStub viewStub) {
        this.f101990l = viewStub;
        if (this.f101990l.getLayoutResource() <= 0) {
            this.f101990l.setLayoutResource(mo82056a());
        }
    }

    /* renamed from: a */
    public static boolean m89007a(C24047a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f63824c) || TextUtils.isEmpty(aVar.f63825d) || TextUtils.isEmpty(aVar.f63826e) || TextUtils.isEmpty(aVar.f63827f) || TextUtils.isEmpty(aVar.f63828g)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo82065a(View view) {
        this.f101981b = view.findViewById(R.id.cvh);
        this.f101991m = (TextView) this.f101981b.findViewById(R.id.cvp);
        this.f101992n = (TextView) this.f101981b.findViewById(R.id.cvi);
        this.f101983d = (TextView) this.f101981b.findViewById(R.id.cvg);
        this.f101984e = (TextView) this.f101981b.findViewById(R.id.cvk);
        this.f101982c = view.findViewById(R.id.cvn);
        this.f101993o = (TextView) this.f101982c.findViewById(R.id.cvo);
        this.f101994p = (TextView) this.f101982c.findViewById(R.id.cvm);
        View findViewById = this.f101981b.findViewById(R.id.cve);
        View findViewById2 = this.f101982c.findViewById(R.id.cvj);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        this.f101983d.setOnClickListener(this);
        this.f101984e.setOnClickListener(this);
        C10705c.m21580a(findViewById, 0.75f);
        C10705c.m21580a(findViewById2, 0.75f);
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.cve) {
            if (this.f101985f != null) {
                this.f101985f.mo82062a(this.f101986g, 3, "");
            }
        } else if (id == R.id.cvg) {
            if (this.f101985f != null) {
                if (this.f101996r) {
                    C40031c cVar = this.f101985f;
                    C24047a aVar = this.f101986g;
                    if (!TextUtils.isEmpty(this.f101986g.f63832k)) {
                        str4 = this.f101986g.f63832k;
                    } else {
                        str4 = this.f101986g.f63826e;
                    }
                    cVar.mo82062a(aVar, 2, str4);
                    return;
                }
                C40031c cVar2 = this.f101985f;
                C24047a aVar2 = this.f101986g;
                if (!TextUtils.isEmpty(this.f101986g.f63831j)) {
                    str3 = this.f101986g.f63831j;
                } else {
                    str3 = this.f101986g.f63825d;
                }
                cVar2.mo82062a(aVar2, 1, str3);
            }
        } else if (id == R.id.cvk) {
            if (this.f101985f != null) {
                if (this.f101996r) {
                    C40031c cVar3 = this.f101985f;
                    C24047a aVar3 = this.f101986g;
                    if (!TextUtils.isEmpty(this.f101986g.f63831j)) {
                        str2 = this.f101986g.f63831j;
                    } else {
                        str2 = this.f101986g.f63825d;
                    }
                    cVar3.mo82062a(aVar3, 1, str2);
                    return;
                }
                C40031c cVar4 = this.f101985f;
                C24047a aVar4 = this.f101986g;
                if (!TextUtils.isEmpty(this.f101986g.f63832k)) {
                    str = this.f101986g.f63832k;
                } else {
                    str = this.f101986g.f63826e;
                }
                cVar4.mo82062a(aVar4, 2, str);
            }
        } else if (id == R.id.cvj) {
            this.f101989j = true;
            m89008h();
            if (this.f101985f != null) {
                this.f101985f.mo82060a();
            }
        }
    }
}
