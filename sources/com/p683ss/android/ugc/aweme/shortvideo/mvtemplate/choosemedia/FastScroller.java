package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller */
public class FastScroller extends LinearLayout {

    /* renamed from: a */
    public int f111472a;

    /* renamed from: b */
    public FrameLayout f111473b;

    /* renamed from: c */
    RecyclerView f111474c;

    /* renamed from: d */
    public DmtTextView f111475d;

    /* renamed from: e */
    View f111476e;

    /* renamed from: f */
    ViewPropertyAnimator f111477f;

    /* renamed from: g */
    public ViewPropertyAnimator f111478g;

    /* renamed from: h */
    public C44028a f111479h;

    /* renamed from: i */
    public boolean f111480i;

    /* renamed from: j */
    boolean f111481j;

    /* renamed from: k */
    public final Runnable f111482k;

    /* renamed from: l */
    float f111483l;

    /* renamed from: m */
    private int f111484m;

    /* renamed from: n */
    private int f111485n;

    /* renamed from: o */
    private int f111486o;

    /* renamed from: p */
    private ValueAnimator f111487p;

    /* renamed from: q */
    private C44029b f111488q;

    /* renamed from: r */
    private float f111489r;

    /* renamed from: s */
    private final C1340m f111490s;

    /* renamed from: t */
    private float f111491t;

    /* renamed from: u */
    private float f111492u;

    /* renamed from: v */
    private boolean f111493v;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$a */
    public interface C44028a {
        /* renamed from: a */
        void mo89891a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$b */
    public interface C44029b {
        /* renamed from: a */
        CharSequence mo89892a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$c */
    class C44030c extends FloatEvaluator {
        private C44030c() {
        }

        public final Float evaluate(float f, Number number, Number number2) {
            float floatValue = super.evaluate(f, number, number2).floatValue();
            LayoutParams layoutParams = FastScroller.this.f111473b.getLayoutParams();
            layoutParams.width = (int) floatValue;
            FastScroller.this.f111473b.setLayoutParams(layoutParams);
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: b */
    public final void mo89869b() {
        this.f111493v = false;
        if (this.f111487p != null) {
            this.f111487p.removeAllListeners();
            this.f111487p = null;
        }
    }

    /* renamed from: c */
    public final void mo89870c() {
        if (this.f111487p != null) {
            this.f111487p.removeAllListeners();
            this.f111487p = null;
        }
    }

    /* renamed from: a */
    public final void mo89866a() {
        if (this.f111474c != null) {
            this.f111474c.mo4818b(this.f111490s);
            this.f111474c = null;
        }
    }

    /* renamed from: d */
    public final void mo89871d() {
        this.f111476e.setVisibility(8);
        this.f111475d.setVisibility(4);
        LayoutParams layoutParams = this.f111473b.getLayoutParams();
        layoutParams.width = (int) C9432q.m18687b((Context) C39618d.f101160a, 56.0f);
        this.f111473b.setLayoutParams(layoutParams);
        this.f111481j = false;
        this.f111477f = null;
    }

    /* renamed from: e */
    public final void mo89872e() {
        if (m96588a(this.f111476e) && this.f111476e != null) {
            getHandler().removeCallbacks(this.f111482k);
            m96587a(this.f111477f);
            this.f111476e.setVisibility(8);
        }
    }

    public void setFastScrollListener(C44028a aVar) {
        this.f111479h = aVar;
    }

    public void setSectionIndexer(C44029b bVar) {
        this.f111488q = bVar;
    }

    /* renamed from: a */
    private static void m96587a(ViewPropertyAnimator viewPropertyAnimator) {
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    private void setHandleSelected(boolean z) {
        this.f111473b.setSelected(z);
    }

    public void setLayoutParams(LayoutParams layoutParams) {
        layoutParams.width = -1;
        super.setLayoutParams(layoutParams);
    }

    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    /* renamed from: a */
    private static boolean m96588a(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void setViewPositions(float f) {
        this.f111484m = this.f111473b.getMeasuredHeight();
        float a = (float) m96586a(0, this.f111485n - this.f111484m, (int) (f - ((float) (this.f111484m / 2))));
        this.f111475d.setY(a);
        this.f111473b.setY(a);
    }

    /* renamed from: a */
    public final void mo89867a(RecyclerView recyclerView) {
        this.f111474c = recyclerView;
        if (getParent() instanceof ViewGroup) {
            setLayoutParams((ViewGroup) getParent());
        } else if (recyclerView.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) recyclerView.getParent();
            viewGroup.addView(this);
            setLayoutParams(viewGroup);
        }
        recyclerView.mo4801a(this.f111490s);
        post(new C44145i(this));
    }

    public void setLayoutParams(ViewGroup viewGroup) {
        int i;
        if (this.f111474c != null) {
            i = this.f111474c.getId();
        } else {
            i = -1;
        }
        if (i == -1) {
            throw new IllegalArgumentException("RecyclerView must have a view ID");
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.height = -1;
            layoutParams.gravity = 8388613;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams((LayoutParams) layoutParams);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            this.f111475d.measure(makeMeasureSpec, makeMeasureSpec);
            this.f111473b.measure(makeMeasureSpec, makeMeasureSpec);
            this.f111484m = this.f111473b.getMeasuredHeight();
        } else {
            throw new IllegalArgumentException("Parent ViewGroup must be a ConstraintLayout, CoordinatorLayout, FrameLayout, or RelativeLayout");
        }
    }

    private void setRecyclerViewPosition(float f) {
        boolean z;
        if (this.f111474c != null && this.f111474c.getAdapter() != null && this.f111474c.getLayoutManager() != null) {
            int itemCount = this.f111474c.getAdapter().getItemCount();
            float f2 = 0.0f;
            if (this.f111473b.getY() != 0.0f) {
                if (this.f111473b.getY() + ((float) this.f111484m) >= ((float) (this.f111485n - 5))) {
                    f2 = 1.0f;
                } else {
                    f2 = f / ((float) this.f111485n);
                }
            }
            int round = Math.round(f2 * ((float) itemCount));
            C1332i layoutManager = this.f111474c.getLayoutManager();
            int i = 0;
            if (layoutManager instanceof LinearLayoutManager) {
                z = ((LinearLayoutManager) layoutManager).f4554k;
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                z = ((StaggeredGridLayoutManager) layoutManager).f4901f;
            } else {
                z = false;
            }
            if (z) {
                round = itemCount - round;
            }
            this.f111474c.getLayoutManager().mo4741e(m96586a(0, itemCount - 1, round));
            if (this.f111488q != null) {
                DmtTextView dmtTextView = this.f111475d;
                C44029b bVar = this.f111488q;
                C1332i layoutManager2 = this.f111474c.getLayoutManager();
                if (layoutManager2 instanceof LinearLayoutManager) {
                    i = ((LinearLayoutManager) layoutManager2).mo4749j();
                } else if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                    i = ((StaggeredGridLayoutManager) layoutManager2).mo5240a((int[]) null)[0];
                }
                dmtTextView.setText(bVar.mo89892a(i));
            }
        }
    }

    /* renamed from: b */
    public final float mo89868b(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0.0f;
        }
        this.f111484m = this.f111473b.getMeasuredHeight();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        float computeVerticalScrollRange = (float) ((recyclerView.computeVerticalScrollRange() - this.f111485n) + this.f111484m);
        float f = (float) computeVerticalScrollOffset;
        if (computeVerticalScrollRange <= 0.0f) {
            computeVerticalScrollRange = 1.0f;
        }
        float f2 = f / computeVerticalScrollRange;
        if (this.f111481j && this.f111477f != null) {
            getHandler().removeCallbacks(this.f111482k);
            m96587a(this.f111477f);
        }
        if (Math.abs(computeVerticalScrollOffset - this.f111472a) > this.f111486o / 4 && this.f111480i) {
            this.f111480i = false;
            if (!m96588a(this.f111476e) && ((float) this.f111474c.computeVerticalScrollRange()) - (((float) this.f111485n) * 2.1f) > 0.0f) {
                this.f111476e.setTranslationX(C9432q.m18687b((Context) C39618d.f101160a, this.f111483l));
                this.f111476e.setVisibility(0);
                this.f111481j = false;
                this.f111477f = this.f111476e.animate().translationX(0.0f).alpha(1.0f).setDuration(300).setListener(new AnimatorListenerAdapter() {
                });
            }
        }
        return (((float) (this.f111485n - this.f111484m)) * f2) + (((float) this.f111484m) / 2.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r17.getAction()
            r2 = 300(0x12c, double:1.48E-321)
            r4 = 1113587712(0x42600000, float:56.0)
            r5 = 1126563840(0x43260000, float:166.0)
            r6 = 0
            r7 = 150(0x96, double:7.4E-322)
            r9 = 0
            r10 = 2
            r11 = 0
            r12 = 1
            switch(r1) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x001b;
                case 2: goto L_0x0109;
                case 3: goto L_0x001b;
                default: goto L_0x0016;
            }
        L_0x0016:
            boolean r1 = super.onTouchEvent(r17)
            return r1
        L_0x001b:
            r0.requestDisallowInterceptTouchEvent(r11)
            r0.setHandleSelected(r11)
            boolean r1 = r0.f111493v
            if (r1 == 0) goto L_0x0031
            android.view.ViewPropertyAnimator r1 = r0.f111478g
            m96587a(r1)
            android.animation.ValueAnimator r1 = r0.f111487p
            if (r1 == 0) goto L_0x0031
            r1.cancel()
        L_0x0031:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f111475d
            boolean r1 = m96588a(r1)
            if (r1 == 0) goto L_0x00a3
            android.animation.ValueAnimator r1 = r0.f111487p
            if (r1 != 0) goto L_0x00a3
            r0.f111493v = r11
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f111475d
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.app.Application r13 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101160a
            float r14 = r0.f111489r
            float r13 = com.bytedance.common.utility.C9432q.m18687b(r13, r14)
            android.view.ViewPropertyAnimator r1 = r1.translationX(r13)
            android.view.ViewPropertyAnimator r1 = r1.alpha(r9)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r7)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$4 r7 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$4
            r7.<init>()
            android.view.ViewPropertyAnimator r1 = r1.setListener(r7)
            r0.f111478g = r1
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$c r1 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$c
            r1.<init>()
            java.lang.Object[] r6 = new java.lang.Object[r10]
            android.app.Application r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101160a
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r7, r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6[r11] = r5
            android.app.Application r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101160a
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r5, r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r6[r12] = r4
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofObject(r1, r6)
            r0.f111487p = r1
            android.animation.ValueAnimator r1 = r0.f111487p
            r4 = 175(0xaf, double:8.65E-322)
            r1.setStartDelay(r4)
            android.animation.ValueAnimator r1 = r0.f111487p
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$5 r4 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$5
            r4.<init>()
            r1.addListener(r4)
            android.animation.ValueAnimator r1 = r0.f111487p
            android.animation.ValueAnimator r1 = r1.setDuration(r2)
            r1.start()
        L_0x00a3:
            android.os.Handler r1 = r16.getHandler()
            java.lang.Runnable r2 = r0.f111482k
            r3 = 3400(0xd48, double:1.68E-320)
            r1.postDelayed(r2, r3)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$a r1 = r0.f111479h
            if (r1 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$a r1 = r0.f111479h
            r1.mo89891a(r12)
        L_0x00b7:
            return r12
        L_0x00b8:
            float r1 = r17.getY()
            r0.f111491t = r1
            android.widget.FrameLayout r1 = r0.f111473b
            float r1 = r1.getY()
            r0.f111492u = r1
            android.widget.FrameLayout r1 = r0.f111473b
            float r13 = r17.getRawX()
            int r13 = (int) r13
            float r14 = r17.getRawY()
            int r14 = (int) r14
            if (r1 == 0) goto L_0x00f1
            int[] r15 = new int[r10]
            r1.getLocationOnScreen(r15)
            r2 = r15[r11]
            r3 = r15[r12]
            int r15 = r1.getMeasuredWidth()
            int r15 = r15 + r2
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r3
            if (r14 < r3) goto L_0x00f1
            if (r14 > r1) goto L_0x00f1
            if (r13 < r2) goto L_0x00f1
            if (r13 > r15) goto L_0x00f1
            r1 = 1
            goto L_0x00f2
        L_0x00f1:
            r1 = 0
        L_0x00f2:
            if (r1 != 0) goto L_0x00f5
            return r11
        L_0x00f5:
            r0.requestDisallowInterceptTouchEvent(r12)
            r0.setHandleSelected(r12)
            android.os.Handler r1 = r16.getHandler()
            java.lang.Runnable r2 = r0.f111482k
            r1.removeCallbacks(r2)
            android.view.ViewPropertyAnimator r1 = r0.f111477f
            m96587a(r1)
        L_0x0109:
            float r1 = r17.getY()
            float r2 = r0.f111492u
            float r3 = r0.f111491t
            float r3 = r1 - r3
            float r2 = r2 + r3
            int r3 = r0.f111484m
            float r3 = (float) r3
            r13 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r13
            float r2 = r2 + r3
            r0.setViewPositions(r2)
            float r3 = r0.f111491t
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            r3 = 1092616192(0x41200000, float:10.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x01b0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$b r1 = r0.f111488q
            if (r1 == 0) goto L_0x01ad
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f111475d
            boolean r1 = m96588a(r1)
            if (r1 != 0) goto L_0x01ad
            r0.f111493v = r12
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f111475d
            android.app.Application r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101160a
            float r13 = r0.f111489r
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r13)
            r1.setTranslationX(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f111475d
            r1.setAlpha(r9)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f111475d
            r1.setVisibility(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f111475d
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.translationX(r9)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = r1.alpha(r3)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r7)
            android.view.ViewPropertyAnimator r1 = r1.setStartDelay(r7)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$2 r3 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$2
            r3.<init>()
            android.view.ViewPropertyAnimator r1 = r1.setListener(r3)
            r0.f111478g = r1
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$c r1 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$c
            r1.<init>()
            java.lang.Object[] r3 = new java.lang.Object[r10]
            android.app.Application r6 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101160a
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r6, r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3[r11] = r4
            android.app.Application r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101160a
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3[r12] = r4
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofObject(r1, r3)
            r0.f111487p = r1
            android.animation.ValueAnimator r1 = r0.f111487p
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$3 r3 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$3
            r3.<init>()
            r1.addListener(r3)
            android.animation.ValueAnimator r1 = r0.f111487p
            r3 = 300(0x12c, double:1.48E-321)
            android.animation.ValueAnimator r1 = r1.setDuration(r3)
            r1.start()
        L_0x01ad:
            r0.setRecyclerViewPosition(r2)
        L_0x01b0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m96586a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3), i2);
    }

    public FastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f111482k = new C44144h(this);
        this.f111489r = 20.0f;
        this.f111483l = 56.0f;
        this.f111490s = new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (FastScroller.this.isEnabled()) {
                    switch (i) {
                        case 0:
                            FastScroller.this.f111472a = recyclerView.computeVerticalScrollOffset();
                            if (!FastScroller.this.f111473b.isSelected()) {
                                FastScroller.this.getHandler().postDelayed(FastScroller.this.f111482k, 3000);
                                if (FastScroller.this.f111479h != null) {
                                    FastScroller.this.f111479h.mo89891a(false);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            FastScroller.this.getHandler().removeCallbacks(FastScroller.this.f111482k);
                            FastScroller.this.f111480i = true;
                            return;
                    }
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (!FastScroller.this.f111473b.isSelected() && FastScroller.this.isEnabled()) {
                    FastScroller.this.setViewPositions(FastScroller.this.mo89868b(recyclerView));
                }
            }
        };
        this.f111491t = 0.0f;
        this.f111492u = 0.0f;
        this.f111493v = false;
        inflate(context, R.layout.b_2, this);
        setClipChildren(false);
        setOrientation(0);
        this.f111475d = (DmtTextView) findViewById(R.id.e86);
        this.f111473b = (FrameLayout) findViewById(R.id.e87);
        this.f111476e = findViewById(R.id.e88);
        this.f111486o = C9432q.m18670a(context);
        if (C47842ed.m103485a(context)) {
            this.f111489r = -20.0f;
            this.f111483l = -56.0f;
            return;
        }
        this.f111489r = 20.0f;
        this.f111483l = 56.0f;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f111485n = i2;
    }
}
