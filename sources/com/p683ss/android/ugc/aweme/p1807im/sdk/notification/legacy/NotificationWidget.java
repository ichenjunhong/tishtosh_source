package com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.p030v4.view.C1044i;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.p1807im.service.C35473n;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.NotificationWidget */
public final class NotificationWidget extends FrameLayout {

    /* renamed from: e */
    public static final C34751a f89483e = new C34751a(null);

    /* renamed from: A */
    private View f89484A;

    /* renamed from: B */
    private final int f89485B;

    /* renamed from: a */
    final View f89486a;

    /* renamed from: b */
    public final View f89487b;

    /* renamed from: c */
    public C52671b<? super Integer, C52860x> f89488c;

    /* renamed from: d */
    int f89489d;

    /* renamed from: f */
    private final CircleImageView f89490f;

    /* renamed from: g */
    private final DmtTextView f89491g;

    /* renamed from: h */
    private final DmtTextView f89492h;

    /* renamed from: i */
    private final View f89493i;

    /* renamed from: j */
    private final View f89494j;

    /* renamed from: k */
    private final View f89495k;

    /* renamed from: l */
    private final DmtTextView f89496l;

    /* renamed from: m */
    private final DmtTextView f89497m;

    /* renamed from: n */
    private FrameLayout f89498n;

    /* renamed from: o */
    private ImageView f89499o;

    /* renamed from: p */
    private FrameLayout f89500p;

    /* renamed from: q */
    private final float f89501q;

    /* renamed from: r */
    private final float f89502r;

    /* renamed from: s */
    private final float f89503s;

    /* renamed from: t */
    private boolean f89504t;

    /* renamed from: u */
    private int f89505u;

    /* renamed from: v */
    private float f89506v;

    /* renamed from: w */
    private final Scroller f89507w;

    /* renamed from: x */
    private final GestureDetector f89508x;

    /* renamed from: y */
    private int f89509y;

    /* renamed from: z */
    private C35473n f89510z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.NotificationWidget$a */
    public static final class C34751a {
        private C34751a() {
        }

        public /* synthetic */ C34751a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.NotificationWidget$b */
    static final class C34752b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ float f89512a;

        /* renamed from: b */
        final /* synthetic */ C52670a f89513b;

        C34752b(float f, C52670a aVar) {
            this.f89512a = f;
            this.f89513b = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                if (((Float) animatedValue).floatValue() == this.f89512a) {
                    C52670a aVar = this.f89513b;
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.NotificationWidget$c */
    public static final class C34753c extends SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ NotificationWidget f89514a;

        C34753c(NotificationWidget notificationWidget) {
            this.f89514a = notificationWidget;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            C52671b<? super Integer, C52860x> bVar = this.f89514a.f89488c;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(0));
            }
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent == null || motionEvent2 == null) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            float x = motionEvent.getX() - motionEvent2.getX();
            if (motionEvent.getY() > motionEvent2.getY()) {
                float y = motionEvent.getY() - motionEvent2.getY();
                if (x == 0.0f) {
                    x = 1.0f;
                }
                if (y / Math.abs(x) > 0.65f) {
                    C52671b<? super Integer, C52860x> bVar = this.f89514a.f89488c;
                    if (bVar != null) {
                        bVar.invoke(Integer.valueOf(3));
                    }
                    return true;
                }
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.NotificationWidget$d */
    static final class C34754d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ NotificationWidget f89515a;

        /* renamed from: b */
        final /* synthetic */ float f89516b;

        /* renamed from: c */
        final /* synthetic */ float f89517c;

        C34754d(NotificationWidget notificationWidget, float f, float f2) {
            this.f89515a = notificationWidget;
            this.f89516b = f;
            this.f89517c = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f89515a.f89487b;
            C52711k.m112236a((Object) view, "mContentView");
            LayoutParams layoutParams = view.getLayoutParams();
            float f = this.f89516b;
            float f2 = this.f89517c;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = (int) (f - (f2 * (1.0f - ((Float) animatedValue).floatValue())));
                View view2 = this.f89515a.f89487b;
                C52711k.m112236a((Object) view2, "mContentView");
                view2.setLayoutParams(layoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void computeScroll() {
        super.computeScroll();
        if (this.f89507w.computeScrollOffset()) {
            scrollTo(this.f89507w.getCurrX(), this.f89507w.getCurrY());
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo72810a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f89486a, "translationY", new float[]{(-C9432q.m18687b(getContext(), 80.0f)) - ((float) this.f89489d), 0.0f});
        C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(m…) - mStatusBarHeight, 0f)");
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    /* renamed from: b */
    private final void m78783b() {
        float b = C9432q.m18687b(getContext(), 150.0f);
        float b2 = C9432q.m18687b(getContext(), 60.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f89495k, "scaleY", new float[]{0.0f, 1.0f});
        C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(m…Layout, \"scaleY\", 0f, 1f)");
        ofFloat.setDuration(300);
        View view = this.f89495k;
        C52711k.m112236a((Object) view, "mNotificationCloseLayout");
        view.setPivotY(0.0f);
        ofFloat.addUpdateListener(new C34754d(this, b, b2));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f89495k, "alpha", new float[]{0.0f, 1.0f});
        C52711k.m112236a((Object) ofFloat2, "ObjectAnimator.ofFloat(m…eLayout, \"alpha\", 0f, 1f)");
        ofFloat2.setDuration(300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public final void setActionListener(C52671b<? super Integer, C52860x> bVar) {
        this.f89488c = bVar;
    }

    /* renamed from: a */
    private final void m78781a(int i) {
        View view = this.f89486a;
        C52711k.m112236a((Object) view, "mRootView");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-1, i);
        }
        layoutParams.height = i;
        View view2 = this.f89486a;
        C52711k.m112236a((Object) view2, "mRootView");
        view2.setLayoutParams(layoutParams);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && !this.f89508x.onTouchEvent(motionEvent) && this.f89509y == 0) {
            int action = motionEvent.getAction();
            int i = 0;
            if (action != 6) {
                switch (action) {
                    case 0:
                        this.f89504t = false;
                        this.f89505u = motionEvent.getPointerId(0);
                        if (motionEvent.findPointerIndex(this.f89505u) >= 0) {
                            this.f89506v = motionEvent.getRawY();
                            break;
                        } else {
                            return false;
                        }
                    case 1:
                    case 3:
                        if (motionEvent.findPointerIndex(this.f89505u) >= 0) {
                            if (this.f89504t) {
                                this.f89504t = false;
                                int i2 = -getScrollY();
                                this.f89507w.startScroll(0, i2, 0, -i2, 300);
                                invalidate();
                                this.f89505u = -1;
                                m78782a(2, true);
                                C52671b<? super Integer, C52860x> bVar = this.f89488c;
                                if (bVar != null) {
                                    bVar.invoke(Integer.valueOf(4));
                                }
                            }
                            this.f89505u = -1;
                            break;
                        } else {
                            return false;
                        }
                    case 2:
                        if (this.f89505u != -1 && motionEvent.findPointerIndex(this.f89505u) >= 0) {
                            if (Math.min(motionEvent.getRawY() - this.f89506v, this.f89501q) > this.f89501q / 4.0f && !this.f89504t) {
                                m78781a((int) this.f89503s);
                                scrollBy(0, -((int) this.f89501q));
                                this.f89504t = true;
                                break;
                            }
                        } else {
                            return false;
                        }
                        break;
                }
            } else {
                int b = C1044i.m2983b(motionEvent);
                if (motionEvent.getPointerId(b) == this.f89505u) {
                    if (b == 0) {
                        i = 1;
                    }
                    this.f89505u = motionEvent.getPointerId(i);
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72811a(com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34767b r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0158
            int r0 = r6.f89544a
            r1 = 0
            if (r0 == 0) goto L_0x010b
            int r0 = r6.f89544a
            r2 = 3
            if (r0 == r2) goto L_0x010b
            int r0 = r6.f89544a
            r2 = 2
            if (r0 != r2) goto L_0x0013
            goto L_0x010b
        L_0x0013:
            int r0 = r6.f89544a
            r2 = 1
            if (r0 == r2) goto L_0x0100
            int r0 = r6.f89544a
            r2 = 5
            if (r0 != r2) goto L_0x001f
            goto L_0x0100
        L_0x001f:
            int r0 = r6.f89544a
            r2 = 4
            if (r0 != r2) goto L_0x0114
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x0082
            android.widget.FrameLayout r0 = r5.f89500p
            java.lang.String r2 = "mAvatarFl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.content.Context r2 = r5.getContext()
            r3 = 1109917696(0x42280000, float:42.0)
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r3)
            int r2 = (int) r2
            r0.height = r2
            android.content.Context r2 = r5.getContext()
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r3)
            int r2 = (int) r2
            r0.width = r2
            android.widget.FrameLayout r2 = r5.f89500p
            java.lang.String r4 = "mAvatarFl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r2.setLayoutParams(r0)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r5.f89490f
            java.lang.String r2 = "mAvatarIv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.content.Context r2 = r5.getContext()
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r3)
            int r2 = (int) r2
            r0.height = r2
            android.content.Context r2 = r5.getContext()
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r3)
            int r2 = (int) r2
            r0.width = r2
            com.ss.android.ugc.aweme.base.ui.CircleImageView r2 = r5.f89490f
            java.lang.String r3 = "mAvatarIv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setLayoutParams(r0)
        L_0x0082:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r5.f89490f
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r6.f89548e
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r2)
            com.ss.android.ugc.aweme.im.sdk.d.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            com.ss.android.ugc.aweme.im.service.j r0 = r0.mo71949f()
            r2 = 0
            if (r0 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.im.service.i r0 = r0.getLiveProxy()
            if (r0 == 0) goto L_0x00a5
            android.content.Context r3 = r5.getContext()
            com.ss.android.ugc.aweme.im.service.e r0 = r0.mo73755a(r3)
            goto L_0x00a6
        L_0x00a5:
            r0 = r2
        L_0x00a6:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L_0x00df
            android.view.View r0 = (android.view.View) r0
            r5.f89484A = r0
            android.view.View r0 = r5.f89484A
            if (r0 == 0) goto L_0x00c5
            r3 = 2132020654(0x7f140dae, float:1.9679677E38)
            android.view.View r3 = r5.findViewById(r3)
            java.lang.String r4 = "findViewById<View>(R.id.live_circle)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r0.setLayoutParams(r3)
        L_0x00c5:
            android.content.Context r0 = r5.getContext()
            int r3 = r5.f89485B
            float r3 = (float) r3
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r3)
            int r0 = (int) r0
            android.view.View r3 = r5.f89484A
            if (r3 == 0) goto L_0x00d8
            r3.setPadding(r0, r0, r0, r0)
        L_0x00d8:
            android.widget.FrameLayout r0 = r5.f89498n
            android.view.View r3 = r5.f89484A
            r0.addView(r3, r1)
        L_0x00df:
            android.widget.ImageView r0 = r5.f89499o
            java.lang.String r3 = "mAvatarLive"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.im.sdk.d.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            com.ss.android.ugc.aweme.im.service.j r0 = r0.mo71949f()
            if (r0 == 0) goto L_0x00fd
            com.ss.android.ugc.aweme.im.service.i r0 = r0.getLiveProxy()
            if (r0 == 0) goto L_0x00fd
            com.ss.android.ugc.aweme.im.service.n r2 = r0.mo73758c()
        L_0x00fd:
            r5.f89510z = r2
            goto L_0x0114
        L_0x0100:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r5.f89490f
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            r2 = 2131953715(0x7f130833, float:1.9543909E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r0, r2)
            goto L_0x0114
        L_0x010b:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r5.f89490f
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r6.f89548e
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r2)
        L_0x0114:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.f89491g
            java.lang.String r2 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r2 = r6.f89549f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.f89492h
            java.lang.String r2 = "mDescriptionTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r2 = r6.f89550g
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            java.lang.Integer r0 = r6.f89547d
            if (r0 == 0) goto L_0x0148
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 7
            if (r0 == r2) goto L_0x0141
            r2 = 52
            if (r0 != r2) goto L_0x0148
        L_0x0141:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.f89492h
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b.m69342a(r0)
        L_0x0148:
            int r0 = r6.f89544a
            if (r0 != 0) goto L_0x0152
            int r6 = r5.f89509y
            r5.m78782a(r6, r1)
            goto L_0x0158
        L_0x0152:
            int r6 = r6.f89544a
            r5.m78782a(r6, r1)
            return
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.NotificationWidget.mo72811a(com.ss.android.ugc.aweme.im.sdk.notification.legacy.b):void");
    }

    /* renamed from: a */
    private final void m78782a(int i, boolean z) {
        this.f89509y = i;
        switch (this.f89509y) {
            case 0:
                m78781a((int) this.f89502r);
                View view = this.f89493i;
                C52711k.m112236a((Object) view, "mDropDownIV");
                view.setVisibility(0);
                View view2 = this.f89494j;
                C52711k.m112236a((Object) view2, "mDropDownMoreIV");
                view2.setVisibility(8);
                View view3 = this.f89495k;
                C52711k.m112236a((Object) view3, "mNotificationCloseLayout");
                view3.setVisibility(8);
                return;
            case 1:
            case 5:
                m78781a((int) this.f89502r);
                View view4 = this.f89493i;
                C52711k.m112236a((Object) view4, "mDropDownIV");
                view4.setVisibility(8);
                View view5 = this.f89494j;
                C52711k.m112236a((Object) view5, "mDropDownMoreIV");
                view5.setVisibility(8);
                View view6 = this.f89495k;
                C52711k.m112236a((Object) view6, "mNotificationCloseLayout");
                view6.setVisibility(8);
                return;
            case 2:
                m78781a((int) this.f89503s);
                View view7 = this.f89493i;
                C52711k.m112236a((Object) view7, "mDropDownIV");
                view7.setVisibility(8);
                View view8 = this.f89495k;
                C52711k.m112236a((Object) view8, "mNotificationCloseLayout");
                view8.setVisibility(0);
                DmtTextView dmtTextView = this.f89496l;
                C52711k.m112236a((Object) dmtTextView, "mCloseNotificationBtn");
                dmtTextView.setVisibility(0);
                DmtTextView dmtTextView2 = this.f89497m;
                C52711k.m112236a((Object) dmtTextView2, "mCloseNotificationTv");
                dmtTextView2.setVisibility(8);
                View view9 = this.f89494j;
                C52711k.m112236a((Object) view9, "mDropDownMoreIV");
                view9.setVisibility(0);
                if (z) {
                    m78783b();
                    return;
                }
                break;
            case 3:
                m78781a((int) this.f89503s);
                View view10 = this.f89493i;
                C52711k.m112236a((Object) view10, "mDropDownIV");
                view10.setVisibility(8);
                View view11 = this.f89495k;
                C52711k.m112236a((Object) view11, "mNotificationCloseLayout");
                view11.setVisibility(0);
                DmtTextView dmtTextView3 = this.f89496l;
                C52711k.m112236a((Object) dmtTextView3, "mCloseNotificationBtn");
                dmtTextView3.setVisibility(8);
                DmtTextView dmtTextView4 = this.f89497m;
                C52711k.m112236a((Object) dmtTextView4, "mCloseNotificationTv");
                dmtTextView4.setVisibility(0);
                View view12 = this.f89494j;
                C52711k.m112236a((Object) view12, "mDropDownMoreIV");
                view12.setVisibility(0);
                return;
            case 4:
                m78781a((int) this.f89503s);
                View view13 = this.f89493i;
                C52711k.m112236a((Object) view13, "mDropDownIV");
                view13.setVisibility(8);
                View view14 = this.f89495k;
                C52711k.m112236a((Object) view14, "mNotificationCloseLayout");
                view14.setVisibility(8);
                DmtTextView dmtTextView5 = this.f89496l;
                C52711k.m112236a((Object) dmtTextView5, "mCloseNotificationBtn");
                dmtTextView5.setVisibility(8);
                DmtTextView dmtTextView6 = this.f89497m;
                C52711k.m112236a((Object) dmtTextView6, "mCloseNotificationTv");
                dmtTextView6.setVisibility(8);
                View view15 = this.f89494j;
                C52711k.m112236a((Object) view15, "mDropDownMoreIV");
                view15.setVisibility(0);
                if (z) {
                    m78783b();
                    break;
                }
                break;
        }
    }

    public NotificationWidget(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f89486a = View.inflate(context, R.layout.bh5, this);
        this.f89487b = this.f89486a.findViewById(R.id.ze);
        this.f89490f = (CircleImageView) this.f89486a.findViewById(R.id.i0);
        this.f89491g = (DmtTextView) this.f89486a.findViewById(R.id.bpu);
        this.f89492h = (DmtTextView) this.f89486a.findViewById(R.id.a4m);
        this.f89493i = this.f89486a.findViewById(R.id.a8t);
        this.f89494j = this.f89486a.findViewById(R.id.a8u);
        this.f89495k = this.f89486a.findViewById(R.id.bs4);
        this.f89496l = (DmtTextView) this.f89486a.findViewById(R.id.uo);
        this.f89497m = (DmtTextView) this.f89486a.findViewById(R.id.up);
        this.f89498n = (FrameLayout) this.f89486a.findViewById(R.id.hr);
        this.f89499o = (ImageView) this.f89486a.findViewById(R.id.dm9);
        this.f89500p = (FrameLayout) this.f89486a.findViewById(R.id.dyd);
        this.f89501q = C9432q.m18687b(context, 25.0f);
        this.f89502r = C9432q.m18687b(context, 80.0f);
        this.f89503s = C9432q.m18687b(context, 160.0f);
        this.f89505u = -1;
        this.f89489d = C9432q.m18695e(context);
        this.f89507w = new Scroller(context);
        this.f89508x = new GestureDetector(context, new C34753c(this));
        this.f89485B = 3;
        this.f89496l.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ NotificationWidget f89511a;

            {
                this.f89511a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C52671b<? super Integer, C52860x> bVar = this.f89511a.f89488c;
                if (bVar != null) {
                    bVar.invoke(Integer.valueOf(1));
                }
            }
        });
    }

    public /* synthetic */ NotificationWidget(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
