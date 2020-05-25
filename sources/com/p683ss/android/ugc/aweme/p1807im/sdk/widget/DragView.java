package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.DragView */
public class DragView extends FrameLayout implements OnGlobalLayoutListener {

    /* renamed from: A */
    private boolean f90751A = true;

    /* renamed from: a */
    View f90752a;

    /* renamed from: b */
    public View f90753b;

    /* renamed from: c */
    IViewInfo f90754c;

    /* renamed from: d */
    float f90755d = 1.0f;

    /* renamed from: e */
    float f90756e = 1.0f;

    /* renamed from: f */
    public float f90757f = 6.0f;

    /* renamed from: g */
    float f90758g = 0.3f;

    /* renamed from: h */
    float f90759h = 0.3f;

    /* renamed from: i */
    int f90760i = NormalGiftView.ALPHA_255;

    /* renamed from: j */
    long f90761j = 250;

    /* renamed from: k */
    boolean f90762k;

    /* renamed from: l */
    public int f90763l = 10;

    /* renamed from: m */
    public C35353a f90764m;

    /* renamed from: n */
    int f90765n;

    /* renamed from: o */
    int f90766o;

    /* renamed from: p */
    int f90767p;

    /* renamed from: q */
    int f90768q;

    /* renamed from: r */
    int f90769r;

    /* renamed from: s */
    int f90770s;

    /* renamed from: t */
    private int f90771t = -1;

    /* renamed from: u */
    private float f90772u;

    /* renamed from: v */
    private float f90773v;

    /* renamed from: w */
    private float f90774w;

    /* renamed from: x */
    private float f90775x;

    /* renamed from: y */
    private int f90776y = 120;

    /* renamed from: z */
    private boolean f90777z = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.DragView$IViewInfo */
    public static class IViewInfo implements Parcelable {
        public static final Creator<IViewInfo> CREATOR = new Creator<IViewInfo>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new IViewInfo[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new IViewInfo(parcel);
            }
        };

        /* renamed from: a */
        public int f90783a;

        /* renamed from: b */
        public int f90784b;

        /* renamed from: c */
        public int f90785c;

        /* renamed from: d */
        public int f90786d;

        /* renamed from: e */
        public float f90787e;

        /* renamed from: f */
        public float f90788f;

        public int describeContents() {
            return 0;
        }

        protected IViewInfo(Parcel parcel) {
            this.f90787e = 0.5f;
            this.f90788f = 1.0f;
            this.f90783a = parcel.readInt();
            this.f90784b = parcel.readInt();
            this.f90785c = parcel.readInt();
            this.f90786d = parcel.readInt();
            this.f90787e = parcel.readFloat();
            this.f90788f = parcel.readFloat();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f90783a);
            parcel.writeInt(this.f90784b);
            parcel.writeInt(this.f90785c);
            parcel.writeInt(this.f90786d);
            parcel.writeFloat(this.f90787e);
            parcel.writeFloat(this.f90788f);
        }

        public IViewInfo(int i, int i2, int i3, int i4, float f) {
            this(i, i2, i3, i4, f, ((float) i3) / ((float) i4));
        }

        public IViewInfo(int i, int i2, int i3, int i4, float f, float f2) {
            this.f90787e = 0.5f;
            this.f90788f = 1.0f;
            this.f90783a = i;
            this.f90784b = i2;
            this.f90785c = i4;
            this.f90786d = i3;
            this.f90787e = f;
            this.f90788f = f2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.DragView$a */
    public interface C35353a {
        /* renamed from: a */
        void mo71091a();

        /* renamed from: a */
        void mo71092a(ValueAnimator valueAnimator);

        /* renamed from: b */
        void mo71093b();

        /* renamed from: c */
        void mo71094c();

        /* renamed from: d */
        void mo71095d();

        /* renamed from: e */
        void mo71096e();

        /* renamed from: f */
        void mo71097f();

        /* renamed from: g */
        boolean mo71098g();

        /* renamed from: h */
        boolean mo71099h();
    }

    public int getFullHeight() {
        return this.f90765n;
    }

    public int getFullWidth() {
        return this.f90766o;
    }

    public void onGlobalLayout() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        postDelayed(new C35400f(this), 200);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo73538b() {
        if (this.f90754c != null) {
            m79965a(this.f90754c.f90783a, this.f90754c.f90784b, this.f90754c.f90785c, this.f90754c.f90786d, this.f90754c.f90788f);
            this.f90763l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        }
    }

    /* renamed from: a */
    public final void mo73534a() {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.f90761j);
        C35384b bVar = new C35384b(this, this.f90755d - this.f90758g, this.f90756e - this.f90759h, (float) this.f90760i, this.f90753b.getTranslationX() - ((float) this.f90770s), this.f90753b.getTranslationY() - ((float) this.f90769r));
        duration.addUpdateListener(bVar);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                DragView.this.f90753b.setVisibility(8);
                if (DragView.this.f90764m != null) {
                    DragView.this.f90764m.mo71097f();
                }
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (DragView.this.f90764m != null) {
                    DragView.this.f90764m.mo71093b();
                }
            }
        });
        duration.start();
    }

    public void setAnimatorDuration(int i) {
        this.f90761j = (long) i;
    }

    public void setCanDrag(boolean z) {
        this.f90777z = z;
    }

    public void setDragStateListener(C35353a aVar) {
        this.f90764m = aVar;
    }

    public void setDragThreshold(int i) {
        this.f90776y = i;
    }

    public void setFullScreenWindow(boolean z) {
        this.f90762k = z;
    }

    /* renamed from: a */
    public final void mo73537a(IViewInfo iViewInfo) {
        this.f90754c = iViewInfo;
        mo73538b();
    }

    public DragView(Context context) {
        super(context);
        setBackgroundColor(-16777216);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        if (r0 != false) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r11 = r16
            int r0 = r17.getActionMasked()
            r1 = 2
            r2 = 5
            if (r0 != r2) goto L_0x000c
            r11.f90771t = r1
        L_0x000c:
            boolean r0 = r11.f90777z
            r2 = 3
            r3 = 1
            if (r0 != 0) goto L_0x0023
            int r0 = r17.getActionMasked()
            if (r0 == r3) goto L_0x0023
            int r0 = r17.getActionMasked()
            if (r0 == r2) goto L_0x0023
            boolean r0 = super.dispatchTouchEvent(r17)
            return r0
        L_0x0023:
            int r0 = r17.getActionIndex()
            r12 = r17
            int r0 = r12.getPointerId(r0)
            r4 = 255(0xff, float:3.57E-43)
            r13 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x01cf
            int r0 = r11.f90771t
            if (r0 == r1) goto L_0x01cf
            int r0 = r17.getAction()
            if (r0 == 0) goto L_0x01c3
            if (r0 == r1) goto L_0x0042
            goto L_0x01cf
        L_0x0042:
            int r0 = r11.f90771t
            r6 = 0
            if (r0 == r3) goto L_0x0096
            float r0 = r17.getX()
            float r7 = r11.f90772u
            float r0 = r0 - r7
            float r7 = r17.getY()
            float r8 = r11.f90773v
            float r7 = r7 - r8
            float r8 = java.lang.Math.abs(r7)
            int r9 = r11.f90763l
            float r9 = (float) r9
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x006e
            float r8 = java.lang.Math.abs(r0)
            int r9 = r11.f90763l
            float r9 = (float) r9
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r0 = 0
            goto L_0x0094
        L_0x006e:
            float r0 = java.lang.Math.abs(r0)
            float r7 = java.lang.Math.abs(r7)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x007c
            r0 = 1
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r0 == 0) goto L_0x0092
            int r7 = r11.f90771t
            if (r7 == r3) goto L_0x008f
            float r7 = r17.getX()
            r11.f90772u = r7
            float r7 = r17.getY()
            r11.f90773v = r7
        L_0x008f:
            r11.f90771t = r3
            goto L_0x0094
        L_0x0092:
            r11.f90771t = r6
        L_0x0094:
            if (r0 == 0) goto L_0x01cf
        L_0x0096:
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r0 = r11.f90764m
            if (r0 == 0) goto L_0x00bb
            float r0 = r17.getY()
            float r7 = r11.f90773v
            float r0 = r0 - r7
            int r7 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ad
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r7 = r11.f90764m
            boolean r7 = r7.mo71099h()
            if (r7 != 0) goto L_0x00b9
        L_0x00ad:
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x00bb
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r0 = r11.f90764m
            boolean r0 = r0.mo71098g()
            if (r0 == 0) goto L_0x00bb
        L_0x00b9:
            r0 = 1
            goto L_0x00bc
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            if (r0 != 0) goto L_0x01cf
            boolean r0 = r11.f90751A
            if (r0 == 0) goto L_0x00cd
            r11.f90751A = r6
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r0 = r11.f90764m
            if (r0 == 0) goto L_0x00cd
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r0 = r11.f90764m
            r0.mo71095d()
        L_0x00cd:
            float r0 = r17.getY()
            float r1 = r17.getX()
            float r2 = r11.f90772u
            float r1 = r1 - r2
            r11.f90775x = r1
            float r1 = r11.f90773v
            float r0 = r0 - r1
            r11.f90774w = r0
            float r0 = r11.f90774w
            int r1 = r11.f90776y
            float r1 = (float) r1
            float r0 = r0 / r1
            float r1 = r11.f90755d
            float r2 = r11.f90758g
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x00fd
            float r1 = r11.f90755d
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x00fd
            float r1 = r11.f90758g
            float r1 = r5 - r1
            float r1 = r1 * r0
            float r1 = r5 - r1
            r11.f90755d = r1
        L_0x00fd:
            float r1 = r11.f90756e
            float r2 = r11.f90759h
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0115
            float r1 = r11.f90756e
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0115
            float r1 = r11.f90759h
            float r1 = r5 - r1
            float r1 = r1 * r0
            float r1 = r5 - r1
            r11.f90756e = r1
        L_0x0115:
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r5 - r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r11.f90760i = r0
            int r0 = r11.f90760i
            if (r0 <= r4) goto L_0x0125
            r11.f90760i = r4
            goto L_0x012d
        L_0x0125:
            int r0 = r11.f90760i
            r1 = 26
            if (r0 > r1) goto L_0x012d
            r11.f90760i = r1
        L_0x012d:
            float r0 = r11.f90758g
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0149
            float r0 = r11.f90755d
            float r1 = r11.f90758g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0140
            float r0 = r11.f90758g
            r11.f90755d = r0
            goto L_0x015e
        L_0x0140:
            float r0 = r11.f90755d
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x015e
            r11.f90755d = r5
            goto L_0x015e
        L_0x0149:
            float r0 = r11.f90755d
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0152
            r11.f90755d = r5
            goto L_0x015e
        L_0x0152:
            float r0 = r11.f90755d
            float r1 = r11.f90758g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x015e
            float r0 = r11.f90758g
            r11.f90755d = r0
        L_0x015e:
            float r0 = r11.f90759h
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x017a
            float r0 = r11.f90756e
            float r1 = r11.f90759h
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0171
            float r0 = r11.f90759h
            r11.f90756e = r0
            goto L_0x018f
        L_0x0171:
            float r0 = r11.f90756e
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x018f
            r11.f90756e = r5
            goto L_0x018f
        L_0x017a:
            float r0 = r11.f90756e
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0183
            r11.f90756e = r5
            goto L_0x018f
        L_0x0183:
            float r0 = r11.f90756e
            float r1 = r11.f90759h
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x018f
            float r0 = r11.f90759h
            r11.f90756e = r0
        L_0x018f:
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r0 = r11.f90764m
            if (r0 == 0) goto L_0x0198
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$a r0 = r11.f90764m
            r0.mo71096e()
        L_0x0198:
            float r0 = r11.f90775x
            float r1 = r11.f90772u
            float r2 = r11.f90755d
            float r2 = r5 - r2
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r1 = r11.f90767p
            float r1 = (float) r1
            float r2 = r11.f90755d
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r0 = (int) r0
            float r1 = r11.f90774w
            float r2 = r11.f90773v
            float r4 = r11.f90756e
            float r5 = r5 - r4
            float r2 = r2 * r5
            float r1 = r1 + r2
            int r2 = r11.f90768q
            float r2 = (float) r2
            float r4 = r11.f90756e
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r11.mo73535a(r0, r1)
            return r3
        L_0x01c3:
            float r0 = r17.getX()
            r11.f90772u = r0
            float r0 = r17.getY()
            r11.f90773v = r0
        L_0x01cf:
            int r0 = r17.getActionMasked()
            if (r0 == r3) goto L_0x01db
            int r0 = r17.getActionMasked()
            if (r0 != r2) goto L_0x02cb
        L_0x01db:
            r0 = -1
            r11.f90771t = r0
            boolean r0 = r11.f90751A
            if (r0 != 0) goto L_0x02cb
            r11.f90751A = r3
            float r0 = r11.f90774w
            int r2 = r11.f90776y
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0251
            float r0 = r11.f90756e
            float r2 = r11.f90759h
            r3 = 1008981770(0x3c23d70a, float:0.01)
            float r2 = r2 + r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0251
            float r0 = r11.f90755d
            float r2 = r11.f90758g
            float r2 = r2 + r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0203
            goto L_0x0251
        L_0x0203:
            float[] r0 = new float[r1]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            long r1 = r11.f90761j
            android.animation.ValueAnimator r10 = r0.setDuration(r1)
            float r0 = r11.f90755d
            float r2 = r5 - r0
            float r3 = r11.f90755d
            float r0 = r11.f90756e
            float r5 = r5 - r0
            float r6 = r11.f90756e
            android.view.View r0 = r11.f90753b
            float r8 = r0.getTranslationX()
            android.view.View r0 = r11.f90753b
            float r9 = r0.getTranslationY()
            int r7 = r11.f90760i
            int r0 = r11.f90760i
            int r14 = 255 - r0
            com.ss.android.ugc.aweme.im.sdk.widget.c r15 = new com.ss.android.ugc.aweme.im.sdk.widget.c
            r0 = r15
            r1 = r16
            r4 = r5
            r5 = r6
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.addUpdateListener(r15)
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$3 r0 = new com.ss.android.ugc.aweme.im.sdk.widget.DragView$3
            r0.<init>()
            r10.addListener(r0)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r10.setInterpolator(r0)
            r10.start()
            goto L_0x02c1
        L_0x0251:
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$IViewInfo r0 = r11.f90754c
            if (r0 != 0) goto L_0x02c3
            float r0 = r11.f90755d
            r2 = 1063675494(0x3f666666, float:0.9)
            float r3 = r0 * r2
            float r0 = r11.f90756e
            float r5 = r0 * r2
            float[] r0 = new float[r1]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            long r1 = r11.f90761j
            android.animation.ValueAnimator r14 = r0.setDuration(r1)
            float r0 = r11.f90755d
            float r2 = r0 - r3
            float r0 = r11.f90755d
            float r4 = r0 - r5
            int r0 = r11.f90760i
            float r6 = (float) r0
            android.view.View r0 = r11.f90753b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r0.topMargin
            int r0 = r0.leftMargin
            int r7 = r16.getWidth()
            float r7 = (float) r7
            int r8 = r11.f90766o
            float r8 = (float) r8
            float r8 = r8 * r3
            float r7 = r7 - r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r9 = r7 / r8
            int r7 = r16.getHeight()
            float r7 = (float) r7
            int r10 = r11.f90765n
            float r10 = (float) r10
            float r10 = r10 * r5
            float r7 = r7 - r10
            float r10 = r7 / r8
            float r0 = (float) r0
            float r7 = r0 - r9
            float r0 = (float) r1
            float r15 = r0 - r10
            com.ss.android.ugc.aweme.im.sdk.widget.e r8 = new com.ss.android.ugc.aweme.im.sdk.widget.e
            r0 = r8
            r1 = r16
            r13 = r8
            r8 = r9
            r9 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.addUpdateListener(r13)
            r14.start()
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$5 r0 = new com.ss.android.ugc.aweme.im.sdk.widget.DragView$5
            r0.<init>()
            r14.addListener(r0)
        L_0x02c1:
            r0 = 0
            goto L_0x02c7
        L_0x02c3:
            r16.mo73534a()
            goto L_0x02c1
        L_0x02c7:
            r11.f90775x = r0
            r11.f90774w = r0
        L_0x02cb:
            boolean r0 = super.dispatchTouchEvent(r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo73535a(int i, int i2) {
        this.f90753b.setScaleX(this.f90755d);
        this.f90753b.setScaleY(this.f90756e);
        this.f90753b.setPivotX(0.0f);
        this.f90753b.setPivotY(0.0f);
        this.f90753b.setTranslationX((float) i);
        this.f90753b.setTranslationY((float) i2);
        setBackgroundColor(this.f90760i << 24);
        if (VERSION.SDK_INT >= 21) {
            this.f90753b.invalidateOutline();
        }
    }

    public DragView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundColor(-16777216);
    }

    /* renamed from: a */
    public final void mo73536a(View view, View view2, IViewInfo iViewInfo) {
        if (view != null && view2 != null && iViewInfo != null) {
            this.f90753b = view2;
            this.f90752a = view;
            this.f90754c = iViewInfo;
            this.f90757f = iViewInfo.f90787e;
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            if (VERSION.SDK_INT >= 21) {
                this.f90753b.setOutlineProvider(new ViewOutlineProvider() {
                    public final void getOutline(View view, Outline outline) {
                        Outline outline2 = outline;
                        outline2.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.max(DragView.this.f90757f, 0.5f));
                    }
                });
                this.f90753b.setClipToOutline(true);
                this.f90753b.setVisibility(4);
            }
            addView(this.f90752a);
            this.f90760i = 0;
            setBackgroundColor(this.f90760i << 24);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo73538b();
    }

    /* renamed from: a */
    private void m79965a(int i, int i2, int i3, int i4, float f) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        this.f90766o = getWidth();
        this.f90765n = getHeight();
        this.f90767p = 0;
        this.f90768q = 0;
        this.f90770s = i - iArr[0];
        this.f90769r = i2 - iArr[1];
        if ((((float) this.f90765n) * 1.0f) / ((float) this.f90766o) > f) {
            this.f90769r = (int) (((float) (i2 - iArr[1])) - ((((float) i4) - (((float) i3) * f)) / 2.0f));
        }
        this.f90758g = ((float) i3) / ((float) this.f90766o);
        this.f90759h = ((float) i4) / ((float) this.f90765n);
    }
}
