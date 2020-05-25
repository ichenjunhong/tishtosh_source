package com.p683ss.android.ugc.aweme.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.support.p030v4.content.C0726c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.dy */
public final class C36607dy extends C36483a {

    /* renamed from: a */
    public ViewGroup f93709a;

    /* renamed from: b */
    public final Activity f93710b;

    /* renamed from: c */
    private final int f93711c = 5;

    /* renamed from: e */
    private int[] f93712e = {0, 0, 0, 0, 0};

    /* renamed from: f */
    private int[] f93713f = {3, 2, 6, 7, 99};

    /* renamed from: g */
    private Integer[] f93714g = {Integer.valueOf(R.id.em8), Integer.valueOf(R.id.em6), Integer.valueOf(R.id.em5), Integer.valueOf(R.id.em7), Integer.valueOf(R.id.em9)};

    /* renamed from: h */
    private TextView[] f93715h = new TextView[this.f93711c];

    /* renamed from: i */
    private ImageView f93716i;

    /* renamed from: j */
    private AnimatorSet f93717j;

    /* renamed from: com.ss.android.ugc.aweme.main.dy$a */
    static final class C36608a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C36607dy f93718a;

        C36608a(C36607dy dyVar) {
            this.f93718a = dyVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C36607dy.m82499a(this.f93718a);
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setScaleX(((Float) animatedValue).floatValue());
                ViewGroup a2 = C36607dy.m82499a(this.f93718a);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    a2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.dy$b */
    public static final class C36609b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C36607dy f93719a;

        C36609b(C36607dy dyVar) {
            this.f93719a = dyVar;
        }

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animation");
            C36607dy.m82499a(this.f93719a).setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.dy$c */
    static final class C36610c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C36607dy f93720a;

        C36610c(C36607dy dyVar) {
            this.f93720a = dyVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C36607dy.m82499a(this.f93720a);
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.dy$d */
    static final class C36611d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C36607dy f93721a;

        C36611d(C36607dy dyVar) {
            this.f93721a = dyVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C36607dy.m82499a(this.f93721a);
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.dy$e */
    static final class C36612e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C36607dy f93722a;

        C36612e(C36607dy dyVar) {
            this.f93722a = dyVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C36607dy.m82499a(this.f93722a);
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.dy$f */
    static final class C36613f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C36607dy f93723a;

        C36613f(C36607dy dyVar) {
            this.f93723a = dyVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C36607dy.m82499a(this.f93723a);
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.dy$g */
    static final class C36614g implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C36607dy f93724a;

        C36614g(C36607dy dyVar) {
            this.f93724a = dyVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C36607dy.m82499a(this.f93724a);
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setScaleX(((Float) animatedValue).floatValue());
                ViewGroup a2 = C36607dy.m82499a(this.f93724a);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    a2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.dy$h */
    public static final class C36615h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C36607dy f93725a;

        C36615h(C36607dy dyVar) {
            this.f93725a = dyVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f93725a.mo69995a();
        }
    }

    /* renamed from: a */
    public final void mo69995a() {
        if (this.f93717j != null && this.f93710b != null && !this.f93710b.isFinishing() && isShowing()) {
            ViewGroup viewGroup = this.f93709a;
            if (viewGroup == null) {
                C52711k.m112237a("mRootView");
            }
            viewGroup.clearAnimation();
            AnimatorSet animatorSet = this.f93717j;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            try {
                dismiss();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewGroup m82499a(C36607dy dyVar) {
        ViewGroup viewGroup = dyVar.f93709a;
        if (viewGroup == null) {
            C52711k.m112237a("mRootView");
        }
        return viewGroup;
    }

    /* renamed from: b */
    private final void m82500b(View view) {
        Integer[] numArr = this.f93714g;
        int length = numArr.length;
        for (int i = 0; i < length; i++) {
            this.f93715h[i] = (TextView) view.findViewById(numArr[i].intValue());
        }
        View findViewById = view.findViewById(R.id.em4);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById…opview_notification_root)");
        this.f93709a = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.em3);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById…ew_notification_iv_arrow)");
        this.f93716i = (ImageView) findViewById2;
    }

    public C36607dy(Activity activity) {
        C52711k.m112240b(activity, "context");
        super(activity);
        this.f93710b = activity;
        View inflate = LayoutInflater.from(this.f93710b).inflate(R.layout.b3_, null, false);
        C52711k.m112236a((Object) inflate, "contentView");
        setContentView(inflate);
        setBackgroundDrawable(new ColorDrawable(C0726c.m2098c(this.f93710b, R.color.arz)));
        setOutsideTouchable(false);
        setWidth(-2);
        setHeight(-2);
        update();
        m82500b(inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ea  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo69996a(android.view.View r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "anchorView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            int[] r2 = r0.f93713f
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L_0x000e:
            r6 = 7
            r7 = 6
            r8 = 2
            r9 = 1
            if (r5 >= r3) goto L_0x0083
            r10 = r2[r5]
            int[] r11 = r0.f93712e
            switch(r10) {
                case 6: goto L_0x003d;
                case 7: goto L_0x0024;
                default: goto L_0x001b;
            }
        L_0x001b:
            int[] r6 = new int[r9]
            r6[r4] = r10
            int r6 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r6)
            goto L_0x0055
        L_0x0024:
            boolean r7 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85064d()
            if (r7 == 0) goto L_0x0034
            int[] r6 = new int[r8]
            r6 = {7, 12} // fill-array
            int r6 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r6)
            goto L_0x0055
        L_0x0034:
            int[] r7 = new int[r9]
            r7[r4] = r6
            int r6 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r7)
            goto L_0x0055
        L_0x003d:
            boolean r6 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85064d()
            if (r6 == 0) goto L_0x004d
            int[] r6 = new int[r8]
            r6 = {6, 14} // fill-array
            int r6 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r6)
            goto L_0x0055
        L_0x004d:
            int[] r6 = new int[r9]
            r6[r4] = r7
            int r6 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r6)
        L_0x0055:
            r11[r5] = r6
            int[] r6 = r0.f93712e
            r6 = r6[r5]
            if (r6 <= 0) goto L_0x0080
            android.widget.TextView[] r6 = r0.f93715h
            r6 = r6[r5]
            int[] r7 = r0.f93712e
            r7 = r7[r5]
            if (r7 > 0) goto L_0x006f
            if (r6 == 0) goto L_0x0080
            r7 = 8
            r6.setVisibility(r7)
            goto L_0x0080
        L_0x006f:
            if (r6 == 0) goto L_0x0074
            r6.setVisibility(r4)
        L_0x0074:
            if (r6 == 0) goto L_0x0080
            long r7 = (long) r7
            java.lang.String r7 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.setText(r7)
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x000e
        L_0x0083:
            int[] r2 = r0.f93712e
            int r3 = r2.length
            r5 = 0
        L_0x0087:
            if (r5 >= r3) goto L_0x0092
            r10 = r2[r5]
            if (r10 <= 0) goto L_0x008f
            r2 = 1
            goto L_0x0093
        L_0x008f:
            int r5 = r5 + 1
            goto L_0x0087
        L_0x0092:
            r2 = 0
        L_0x0093:
            if (r2 != 0) goto L_0x00a0
            r18.dismiss()
            java.lang.Runnable r1 = r0.f93555d
            if (r1 == 0) goto L_0x009f
            r1.run()
        L_0x009f:
            return r4
        L_0x00a0:
            android.app.Activity r2 = r0.f93710b
            r3 = 3
            if (r2 == 0) goto L_0x01f2
            boolean r2 = r18.isShowing()
            if (r2 != 0) goto L_0x01f2
            android.app.Activity r2 = r0.f93710b
            boolean r2 = r2.isFinishing()
            if (r2 != 0) goto L_0x01f2
            int[] r2 = new int[r8]
            r1.getLocationInWindow(r2)
            r5 = 51
            r10 = r2[r4]
            r2 = r2[r9]
            int r11 = r19.getHeight()
            int r2 = r2 - r11
            r0.showAtLocation(r1, r5, r10, r2)
            android.view.ViewGroup r2 = r0.f93709a
            if (r2 != 0) goto L_0x00cf
            java.lang.String r5 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x00cf:
            r2.measure(r4, r4)
            android.app.Activity r2 = r0.f93710b
            android.content.Context r2 = (android.content.Context) r2
            boolean r2 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r2)
            android.view.ViewGroup r5 = r0.f93709a
            if (r5 != 0) goto L_0x00e3
            java.lang.String r10 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x00e3:
            int r5 = r5.getMeasuredWidth()
            android.view.ViewGroup r10 = r0.f93709a
            if (r10 != 0) goto L_0x00f0
            java.lang.String r11 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x00f0:
            int r10 = r10.getMeasuredHeight()
            android.app.Activity r11 = r0.f93710b
            android.content.Context r11 = (android.content.Context) r11
            int r11 = com.bytedance.common.utility.C9432q.m18670a(r11)
            android.widget.ImageView r12 = r0.f93716i
            if (r12 != 0) goto L_0x0105
            java.lang.String r13 = "mIvArrow"
            p2628d.p2639f.p2641b.C52711k.m112237a(r13)
        L_0x0105:
            int r12 = r12.getMeasuredWidth()
            int r13 = r19.getMeasuredWidth()
            int[] r14 = new int[r8]
            r1.getLocationInWindow(r14)
            float r15 = (float) r5
            r16 = 1073741824(0x40000000, float:2.0)
            float r17 = r15 / r16
            r6 = r14[r4]
            float r6 = (float) r6
            float r13 = (float) r13
            float r13 = r13 / r16
            float r6 = r6 + r13
            if (r2 == 0) goto L_0x012c
            int r2 = r5 / 2
            float r2 = (float) r2
            float r2 = r6 - r2
            r11 = 0
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x0138
            r2 = r6
            goto L_0x013a
        L_0x012c:
            int r2 = r5 / 2
            float r2 = (float) r2
            float r2 = r2 + r6
            float r11 = (float) r11
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x0138
            float r11 = r11 - r6
            float r17 = r15 - r11
        L_0x0138:
            r2 = r17
        L_0x013a:
            float r11 = (float) r12
            float r11 = r11 / r16
            float r11 = r2 - r11
            int r11 = (int) r11
            android.widget.ImageView r12 = r0.f93716i
            if (r12 != 0) goto L_0x0149
            java.lang.String r13 = "mIvArrow"
            p2628d.p2639f.p2641b.C52711k.m112237a(r13)
        L_0x0149:
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            if (r12 == 0) goto L_0x01ea
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            r12.leftMargin = r11
            android.widget.ImageView r11 = r0.f93716i
            if (r11 != 0) goto L_0x015c
            java.lang.String r13 = "mIvArrow"
            p2628d.p2639f.p2641b.C52711k.m112237a(r13)
        L_0x015c:
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12
            r11.setLayoutParams(r12)
            float r6 = r6 - r2
            int r6 = (int) r6
            r11 = r14[r9]
            float r11 = (float) r11
            int r1 = r19.getHeight()
            float r1 = (float) r1
            float r11 = r11 - r1
            android.app.Activity r1 = r0.f93710b
            android.content.Context r1 = (android.content.Context) r1
            r12 = 1090519040(0x41000000, float:8.0)
            float r1 = com.bytedance.common.utility.C9432q.m18687b(r1, r12)
            float r11 = r11 - r1
            int r1 = (int) r11
            r0.update(r6, r1, r5, r10)
            android.view.ViewGroup r1 = r0.f93709a
            if (r1 != 0) goto L_0x0184
            java.lang.String r5 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0184:
            r1.setPivotX(r2)
            android.view.ViewGroup r1 = r0.f93709a
            if (r1 != 0) goto L_0x0190
            java.lang.String r2 = "mRootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0190:
            float r2 = (float) r10
            r1.setPivotY(r2)
            java.lang.String r1 = "message_pop_notice_show"
            com.ss.android.ugc.aweme.app.f.d r2 = new com.ss.android.ugc.aweme.app.f.d
            r2.<init>()
            java.lang.String r5 = "like_cnt"
            int[] r6 = new int[r9]
            r6[r4] = r3
            int r6 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r6)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47826a(r5, r6)
            java.lang.String r5 = "comment_cnt"
            int[] r6 = new int[r9]
            r6[r4] = r8
            int r6 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r6)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47826a(r5, r6)
            java.lang.String r5 = "mention_cnt"
            int[] r6 = new int[r9]
            r6[r4] = r7
            int r6 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r6)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47826a(r5, r6)
            java.lang.String r5 = "follower_cnt"
            int[] r6 = new int[r9]
            r10 = 7
            r6[r4] = r10
            int r6 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r6)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47826a(r5, r6)
            java.lang.String r5 = "message_cnt"
            int[] r6 = new int[r9]
            r10 = 99
            r6[r4] = r10
            int r6 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85098a(r6)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47826a(r5, r6)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r2)
            goto L_0x01f2
        L_0x01ea:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r1.<init>(r2)
            throw r1
        L_0x01f2:
            float[] r1 = new float[r8]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.String r2 = "fadeIn"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r5 = 200(0xc8, double:9.9E-322)
            r1.setDuration(r5)
            com.bytedance.ies.dmt.ui.c.c r2 = new com.bytedance.ies.dmt.ui.c.c
            r2.<init>()
            android.animation.TimeInterpolator r2 = (android.animation.TimeInterpolator) r2
            r1.setInterpolator(r2)
            com.ss.android.ugc.aweme.main.dy$a r2 = new com.ss.android.ugc.aweme.main.dy$a
            r2.<init>(r0)
            android.animation.ValueAnimator$AnimatorUpdateListener r2 = (android.animation.ValueAnimator.AnimatorUpdateListener) r2
            r1.addUpdateListener(r2)
            com.ss.android.ugc.aweme.main.dy$b r2 = new com.ss.android.ugc.aweme.main.dy$b
            r2.<init>(r0)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r1.addListener(r2)
            float[] r2 = new float[r8]
            r2 = {0, -1054867456} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            java.lang.String r10 = "upL"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r10)
            r2.setDuration(r5)
            com.ss.android.ugc.aweme.main.dy$c r10 = new com.ss.android.ugc.aweme.main.dy$c
            r10.<init>(r0)
            android.animation.ValueAnimator$AnimatorUpdateListener r10 = (android.animation.ValueAnimator.AnimatorUpdateListener) r10
            r2.addUpdateListener(r10)
            float[] r10 = new float[r8]
            r10 = {-1054867456, 0} // fill-array
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofFloat(r10)
            java.lang.String r11 = "downL"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            r11 = 500(0x1f4, double:2.47E-321)
            r10.setDuration(r11)
            com.ss.android.ugc.aweme.main.dy$d r11 = new com.ss.android.ugc.aweme.main.dy$d
            r11.<init>(r0)
            android.animation.ValueAnimator$AnimatorUpdateListener r11 = (android.animation.ValueAnimator.AnimatorUpdateListener) r11
            r10.addUpdateListener(r11)
            r10.setStartDelay(r5)
            float[] r5 = new float[r8]
            r5 = {0, -1054867456} // fill-array
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            java.lang.String r6 = "upS"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            r11 = 150(0x96, double:7.4E-322)
            r5.setDuration(r11)
            r11 = 5700(0x1644, double:2.816E-320)
            r5.setStartDelay(r11)
            com.ss.android.ugc.aweme.main.dy$e r6 = new com.ss.android.ugc.aweme.main.dy$e
            r6.<init>(r0)
            android.animation.ValueAnimator$AnimatorUpdateListener r6 = (android.animation.ValueAnimator.AnimatorUpdateListener) r6
            r5.addUpdateListener(r6)
            float[] r6 = new float[r8]
            r6 = {-1054867456, 0} // fill-array
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r6)
            java.lang.String r11 = "downS"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r11)
            r11 = 300(0x12c, double:1.48E-321)
            r6.setDuration(r11)
            r13 = 5850(0x16da, double:2.8903E-320)
            r6.setStartDelay(r13)
            com.ss.android.ugc.aweme.main.dy$f r15 = new com.ss.android.ugc.aweme.main.dy$f
            r15.<init>(r0)
            android.animation.ValueAnimator$AnimatorUpdateListener r15 = (android.animation.ValueAnimator.AnimatorUpdateListener) r15
            r6.addUpdateListener(r15)
            float[] r15 = new float[r8]
            r15 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r15 = android.animation.ValueAnimator.ofFloat(r15)
            java.lang.String r3 = "fadeOut"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r3)
            r15.setDuration(r11)
            r15.setStartDelay(r13)
            com.bytedance.ies.dmt.ui.c.b r3 = new com.bytedance.ies.dmt.ui.c.b
            r3.<init>()
            android.animation.TimeInterpolator r3 = (android.animation.TimeInterpolator) r3
            r15.setInterpolator(r3)
            com.ss.android.ugc.aweme.main.dy$g r3 = new com.ss.android.ugc.aweme.main.dy$g
            r3.<init>(r0)
            android.animation.ValueAnimator$AnimatorUpdateListener r3 = (android.animation.ValueAnimator.AnimatorUpdateListener) r3
            r15.addUpdateListener(r3)
            com.ss.android.ugc.aweme.main.dy$h r3 = new com.ss.android.ugc.aweme.main.dy$h
            r3.<init>(r0)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r15.addListener(r3)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r0.f93717j = r3
            android.animation.AnimatorSet r3 = r0.f93717j
            if (r3 == 0) goto L_0x02ff
            android.animation.Animator[] r7 = new android.animation.Animator[r7]
            android.animation.Animator r1 = (android.animation.Animator) r1
            r7[r4] = r1
            android.animation.Animator r2 = (android.animation.Animator) r2
            r7[r9] = r2
            android.animation.Animator r10 = (android.animation.Animator) r10
            r7[r8] = r10
            android.animation.Animator r5 = (android.animation.Animator) r5
            r1 = 3
            r7[r1] = r5
            r1 = 4
            android.animation.Animator r6 = (android.animation.Animator) r6
            r7[r1] = r6
            r1 = 5
            android.animation.Animator r15 = (android.animation.Animator) r15
            r7[r1] = r15
            r3.playTogether(r7)
        L_0x02ff:
            android.animation.AnimatorSet r1 = r0.f93717j
            if (r1 == 0) goto L_0x0306
            r1.start()
        L_0x0306:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.C36607dy.mo69996a(android.view.View):boolean");
    }
}
