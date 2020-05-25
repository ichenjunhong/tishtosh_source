package com.p683ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23600b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.widget.BaseVerticalViewPager;
import com.p683ss.android.ugc.aweme.feed.adapter.C30019aj;
import com.p683ss.android.ugc.aweme.feed.experiment.C30220a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout */
public class LoadMoreFrameLayout extends FrameLayout {

    /* renamed from: a */
    public C30019aj f81716a;

    /* renamed from: b */
    public int f81717b;

    /* renamed from: c */
    public int f81718c;

    /* renamed from: d */
    final C52670a<String> f81719d;

    /* renamed from: e */
    final C52670a<String> f81720e;

    /* renamed from: f */
    public int f81721f;

    /* renamed from: g */
    private DmtStatusView f81722g;

    /* renamed from: h */
    private BaseVerticalViewPager f81723h;

    /* renamed from: i */
    private C23600b f81724i;

    /* renamed from: j */
    private int f81725j;

    /* renamed from: k */
    private boolean f81726k;

    /* renamed from: l */
    private float f81727l;

    /* renamed from: m */
    private float f81728m;

    /* renamed from: n */
    private int f81729n;

    /* renamed from: o */
    private ValueAnimator f81730o;

    /* renamed from: p */
    private long f81731p;

    /* renamed from: q */
    private String f81732q;

    /* renamed from: r */
    private boolean f81733r;

    /* renamed from: s */
    private Drawable f81734s;

    /* renamed from: t */
    private View f81735t;

    /* renamed from: u */
    private C31237a f81736u;

    /* renamed from: v */
    private C31238b f81737v;

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout$a */
    public interface C31237a {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout$b */
    public interface C31238b {
        /* renamed from: a */
        void mo62939a(int i);
    }

    /* renamed from: f */
    public final void mo64054f() {
        DmtStatusView a = mo64047a(false);
        if (a != null) {
            a.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo64048a() {
        this.f81717b = 0;
        if (this.f81731p == -1) {
            this.f81731p = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo64050b() {
        DmtStatusView a = mo64047a(true);
        if (a != null) {
            a.mo19214h();
        }
        this.f81717b = 2;
        mo64052d();
    }

    /* renamed from: e */
    public final void mo64053e() {
        DmtStatusView a = mo64047a(true);
        if (a != null) {
            a.setVisibility(0);
        }
        setBackgroundColor(getContext().getResources().getColor(R.color.ip));
    }

    public int getViewPagerMarginTop() {
        if (this.f81723h == null) {
            return 0;
        }
        return ((MarginLayoutParams) this.f81723h.getLayoutParams()).topMargin;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.f81733r = true;
        } catch (Exception e) {
            C30220a.f78947a.mo60570c(new C31250i(e));
            C32458a.m75145a("BlackScreenIssueLogger", e);
            C9220a.m18312a((Throwable) e, "BlackScreenIssueLogger");
        }
    }

    /* renamed from: c */
    public final void mo64051c() {
        DmtStatusView a = mo64047a(true);
        if (a != null) {
            a.mo19213g();
        }
        this.f81717b = 1;
        if (this.f81723h != null) {
            m72926i();
        }
        if (this.f81731p != -1 && !TextUtils.isEmpty(this.f81732q)) {
            C23131p.m57782b("aweme_feed_load_more_duration", this.f81732q, (float) (System.currentTimeMillis() - this.f81731p));
            this.f81731p = -1;
        }
    }

    /* renamed from: d */
    public final void mo64052d() {
        DmtStatusView a = mo64047a(false);
        if (a != null) {
            a.mo19209d();
        }
        this.f81717b = -1;
        if (this.f81723h != null) {
            m72926i();
        }
        if (this.f81731p != -1 && !TextUtils.isEmpty(this.f81732q)) {
            C23131p.m57782b("aweme_feed_load_more_duration", this.f81732q, (float) (System.currentTimeMillis() - this.f81731p));
            this.f81731p = -1;
        }
    }

    /* renamed from: g */
    public final void mo64055g() {
        final int i = ((int) (((float) this.f81718c) * 1.5f)) / 100;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 100});
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i = i * (intValue - LoadMoreFrameLayout.this.f81721f);
                LoadMoreFrameLayout.this.f81721f = intValue;
                DmtStatusView a = LoadMoreFrameLayout.this.mo64047a(true);
                if (a.mo19211e()) {
                    a.mo19212f();
                } else {
                    LoadMoreFrameLayout.this.mo64053e();
                }
                LoadMoreFrameLayout.this.setViewPagerMarginTopByDelta(-i);
            }
        });
        ofInt.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                LoadMoreFrameLayout.this.mo64057h();
            }

            public final void onAnimationStart(Animator animator) {
                LoadMoreFrameLayout.this.f81721f = 0;
            }
        });
        ofInt.start();
    }

    /* renamed from: i */
    private void m72926i() {
        this.f81730o = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        final int viewPagerMarginTop = getViewPagerMarginTop();
        int i = (viewPagerMarginTop * -200) / this.f81729n;
        if (i < 0) {
            i = 200;
        }
        this.f81730o.setDuration((long) i);
        this.f81730o.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                if (animatedFraction == 1.0f) {
                    i = -viewPagerMarginTop;
                } else {
                    double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                    double d = (double) viewPagerMarginTop;
                    Double.isNaN(d);
                    double d2 = pow * d;
                    double viewPagerMarginTop2 = (double) LoadMoreFrameLayout.this.getViewPagerMarginTop();
                    Double.isNaN(viewPagerMarginTop2);
                    i = (int) (d2 - viewPagerMarginTop2);
                }
                loadMoreFrameLayout.setViewPagerMarginTopByDelta(i);
            }
        });
        this.f81730o.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                LoadMoreFrameLayout.this.setBackground(null);
            }
        });
        this.f81730o.start();
        mo64054f();
    }

    /* renamed from: h */
    public final void mo64057h() {
        this.f81730o = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        final int viewPagerMarginTop = getViewPagerMarginTop();
        int i = ((this.f81718c + viewPagerMarginTop) * -200) / this.f81729n;
        if (i < 0) {
            i = 200;
        }
        this.f81730o.setDuration((long) i);
        this.f81730o.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                if (animatedFraction == 1.0f) {
                    i = -(viewPagerMarginTop + LoadMoreFrameLayout.this.f81718c);
                } else {
                    double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                    double d = (double) (viewPagerMarginTop + LoadMoreFrameLayout.this.f81718c);
                    Double.isNaN(d);
                    double d2 = pow * d;
                    double viewPagerMarginTop2 = (double) (LoadMoreFrameLayout.this.getViewPagerMarginTop() + LoadMoreFrameLayout.this.f81718c);
                    Double.isNaN(viewPagerMarginTop2);
                    i = (int) (d2 - viewPagerMarginTop2);
                }
                loadMoreFrameLayout.setViewPagerMarginTopByDelta(i);
            }
        });
        this.f81730o.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (LoadMoreFrameLayout.this.f81716a != null && LoadMoreFrameLayout.this.f81717b == -1) {
                    LoadMoreFrameLayout.this.f81716a.aG_();
                }
            }
        });
        this.f81730o.start();
    }

    public void setLabel(String str) {
        this.f81732q = str;
    }

    public void setLoadMoreListener(C30019aj ajVar) {
        this.f81716a = ajVar;
    }

    public void setOnLoadMoreUiListener(C31237a aVar) {
        this.f81736u = aVar;
    }

    public void setOnScrolledListener(C31238b bVar) {
        this.f81737v = bVar;
    }

    public LoadMoreFrameLayout(Context context) {
        this(context, null);
    }

    public void setLoadMoreEmptyView(View view) {
        this.f81735t = view;
        this.f81722g = null;
    }

    public void setBottomViewBackground(Drawable drawable) {
        DmtStatusView a = mo64047a(false);
        if (a != null) {
            a.setBackgroundDrawable(drawable);
        } else {
            this.f81734s = drawable;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C30220a.f78947a.mo60568a(this.f81719d);
        super.onDraw(canvas);
        C30220a.f78947a.mo60568a(this.f81720e);
    }

    public void setViewPagerMarginTopByDelta(int i) {
        if (this.f81723h != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f81723h.getLayoutParams();
            marginLayoutParams.topMargin += i;
            marginLayoutParams.bottomMargin = -marginLayoutParams.topMargin;
            if (this.f81737v != null) {
                this.f81737v.mo62939a(marginLayoutParams.topMargin);
            }
            this.f81723h.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final DmtStatusView mo64047a(boolean z) {
        if (this.f81722g == null && z && this.f81733r) {
            try {
                this.f81722g = new DmtStatusView(getContext());
                LayoutParams layoutParams = new LayoutParams(-1, C23728o.m58241a(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, C23728o.m58241a(49.0d));
                addView(this.f81722g, 0, layoutParams);
                if (this.f81735t == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.auk, null);
                    textView.setGravity(17);
                    this.f81735t = textView;
                }
                DmtStatusView dmtStatusView = this.f81722g;
                C10719a a = C10719a.m21676a(getContext());
                C312301 r3 = new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (LoadMoreFrameLayout.this.f81716a != null) {
                            LoadMoreFrameLayout.this.f81716a.aG_();
                        }
                    }
                };
                a.mo19230b((int) R.string.c0c);
                a.f28651d.setOnClickListener(r3);
                dmtStatusView.setBuilder(a.mo19231b(this.f81735t));
                if (this.f81734s != null) {
                    this.f81722g.setBackgroundDrawable(this.f81734s);
                }
            } catch (Exception e) {
                this.f81722g = null;
                this.f81734s = null;
                C32458a.m75145a("BlackScreenIssueLogger", e);
                C9220a.m18312a((Throwable) e, "BlackScreenIssueLogger");
            }
        }
        if (this.f81722g != null && this.f81722g.mo19211e()) {
            this.f81717b = -1;
        }
        return this.f81722g;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f81723h == null || this.f81723h.getAdapter() == null || this.f81723h.getAdapter().getCount() == 0 || this.f81723h.getAdapter().getCount() - 1 != this.f81723h.getCurrentItem() || this.f81723h.mo54893a() || (this.f81724i != null && this.f81724i.mo48780a())) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f81726k = false;
                this.f81727l = motionEvent.getY();
                this.f81728m = this.f81727l;
                break;
            case 1:
            case 3:
                this.f81726k = false;
                break;
            case 2:
                float y = motionEvent.getY();
                if (this.f81727l - y <= ((float) this.f81725j) || this.f81726k) {
                    if (y - this.f81727l > ((float) this.f81725j) && !this.f81726k && this.f81723h.getTop() < 0) {
                        this.f81726k = true;
                        if (this.f81730o != null) {
                            this.f81730o.cancel();
                            break;
                        }
                    }
                } else {
                    this.f81726k = true;
                    if (this.f81730o != null) {
                        this.f81730o.cancel();
                        break;
                    }
                }
                break;
        }
        return this.f81726k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a8, code lost:
        r5.f81726k = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r5.mo64047a(r0)
            r2 = 0
            if (r1 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r3 = r5.f81723h
            if (r3 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r3 = r5.f81723h
            android.support.v4.view.PagerAdapter r3 = r3.getAdapter()
            if (r3 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r3 = r5.f81723h
            android.support.v4.view.PagerAdapter r3 = r3.getAdapter()
            int r3 = r3.getCount()
            if (r3 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r3 = r5.f81723h
            android.support.v4.view.PagerAdapter r3 = r3.getAdapter()
            int r3 = r3.getCount()
            int r3 = r3 - r0
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r4 = r5.f81723h
            int r4 = r4.getCurrentItem()
            if (r3 != r4) goto L_0x00b2
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r3 = r5.f81723h
            boolean r3 = r3.mo54893a()
            if (r3 != 0) goto L_0x00b2
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b r3 = r5.f81724i
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b r3 = r5.f81724i
            boolean r3 = r3.mo48780a()
            if (r3 == 0) goto L_0x0049
            goto L_0x00b2
        L_0x0049:
            int r3 = r6.getAction()
            switch(r3) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x008a;
                case 2: goto L_0x0059;
                case 3: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x00ad
        L_0x0051:
            boolean r0 = r5.f81726k
            if (r0 == 0) goto L_0x00ad
            r5.m72926i()
            goto L_0x00a8
        L_0x0059:
            boolean r0 = r5.f81726k
            if (r0 == 0) goto L_0x00ad
            float r0 = r6.getY()
            float r2 = r5.f81728m
            float r2 = r0 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r3
            int r2 = (int) r2
            r5.f81728m = r0
            int r0 = r5.getViewPagerMarginTop()
            int r3 = r0 + r2
            if (r3 <= 0) goto L_0x0074
            int r2 = -r0
        L_0x0074:
            int r0 = r5.f81729n
            int r0 = -r0
            if (r3 < r0) goto L_0x00ad
            r5.setViewPagerMarginTopByDelta(r2)
            boolean r0 = r1.mo19211e()
            if (r0 == 0) goto L_0x0086
            r1.mo19212f()
            goto L_0x00ad
        L_0x0086:
            r5.mo64053e()
            goto L_0x00ad
        L_0x008a:
            boolean r1 = r5.f81726k
            if (r1 == 0) goto L_0x00ad
            int r1 = r5.getViewPagerMarginTop()
            int r3 = r5.f81718c
            int r3 = -r3
            if (r1 > r3) goto L_0x00a5
            int r1 = r5.f81717b
            if (r1 == r0) goto L_0x00a5
            int r0 = r5.f81717b
            r1 = 2
            if (r0 != r1) goto L_0x00a1
            goto L_0x00a5
        L_0x00a1:
            r5.mo64057h()
            goto L_0x00a8
        L_0x00a5:
            r5.m72926i()
        L_0x00a8:
            r5.f81726k = r2
            goto L_0x00ad
        L_0x00ab:
            r5.f81726k = r2
        L_0x00ad:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L_0x00b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo64049a(BaseVerticalViewPager baseVerticalViewPager, C23600b bVar) {
        this.f81723h = baseVerticalViewPager;
        this.f81724i = bVar;
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81717b = -1;
        this.f81731p = -1;
        this.f81719d = C31248g.f81849a;
        this.f81720e = C31249h.f81850a;
        this.f81725j = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f81718c = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.f81729n = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
    }
}
