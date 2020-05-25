package com.p683ss.android.ugc.aweme.common.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.common.widget.DragView */
public class DragView extends FrameLayout implements OnGlobalLayoutListener {

    /* renamed from: A */
    private int f70826A = 120;

    /* renamed from: a */
    public View f70827a;

    /* renamed from: b */
    public IViewInfo f70828b;

    /* renamed from: c */
    public float f70829c = 1.0f;

    /* renamed from: d */
    public float f70830d = 1.0f;

    /* renamed from: e */
    public float f70831e = 6.0f;

    /* renamed from: f */
    public float f70832f = 0.3f;

    /* renamed from: g */
    public float f70833g = 0.3f;

    /* renamed from: h */
    public int f70834h = NormalGiftView.ALPHA_255;

    /* renamed from: i */
    long f70835i = 250;

    /* renamed from: j */
    public boolean f70836j;

    /* renamed from: k */
    public int f70837k = 10;

    /* renamed from: l */
    public C26939a f70838l;

    /* renamed from: m */
    int f70839m;

    /* renamed from: n */
    int f70840n;

    /* renamed from: o */
    int f70841o;

    /* renamed from: p */
    int f70842p;

    /* renamed from: q */
    int f70843q;

    /* renamed from: r */
    int f70844r;

    /* renamed from: s */
    private int f70845s = -1;

    /* renamed from: t */
    private int f70846t = -1;

    /* renamed from: u */
    private float f70847u;

    /* renamed from: v */
    private float f70848v;

    /* renamed from: w */
    private float f70849w;

    /* renamed from: x */
    private float f70850x;

    /* renamed from: y */
    private int f70851y;

    /* renamed from: z */
    private int f70852z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.DragView$IViewInfo */
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
        public int f70890a;

        /* renamed from: b */
        public int f70891b;

        /* renamed from: c */
        public int f70892c;

        /* renamed from: d */
        public int f70893d;

        /* renamed from: e */
        public float f70894e;

        /* renamed from: f */
        public float f70895f;

        public int describeContents() {
            return 0;
        }

        protected IViewInfo(Parcel parcel) {
            this.f70894e = 0.5f;
            this.f70895f = 1.0f;
            this.f70890a = parcel.readInt();
            this.f70891b = parcel.readInt();
            this.f70892c = parcel.readInt();
            this.f70893d = parcel.readInt();
            this.f70894e = parcel.readFloat();
            this.f70895f = parcel.readFloat();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f70890a);
            parcel.writeInt(this.f70891b);
            parcel.writeInt(this.f70892c);
            parcel.writeInt(this.f70893d);
            parcel.writeFloat(this.f70894e);
            parcel.writeFloat(this.f70895f);
        }

        public IViewInfo(int i, int i2, int i3, int i4, float f) {
            this(i, i2, i3, i4, f, ((float) i3) / ((float) i4));
        }

        public IViewInfo(int i, int i2, int i3, int i4, float f, float f2) {
            this.f70894e = 0.5f;
            this.f70895f = 1.0f;
            this.f70890a = i;
            this.f70891b = i2;
            this.f70892c = i4;
            this.f70893d = i3;
            this.f70894e = f;
            this.f70895f = f2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.DragView$a */
    public interface C26939a {
        /* renamed from: a */
        void mo54925a();

        /* renamed from: b */
        void mo54926b();

        /* renamed from: c */
        void mo54927c();

        /* renamed from: d */
        void mo54928d();

        /* renamed from: e */
        void mo54929e();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.DragView$b */
    public interface C26940b {
        /* renamed from: a */
        void mo54930a(float f, float f2, float f3, float f4);
    }

    /* renamed from: c */
    private static boolean m65050c() {
        if (C11016e.m22312g() == null || (C11016e.m22312g().getWindow().getAttributes().flags & PreloadTask.BYTE_UNIT_NUMBER) != 1024) {
            return false;
        }
        return true;
    }

    public void onGlobalLayout() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        postDelayed(new Runnable() {
            public final void run() {
                if (DragView.this.f70827a != null) {
                    DragView dragView = DragView.this;
                    dragView.mo54902b();
                    ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(dragView.f70835i);
                    C269357 r1 = new AnimatorUpdateListener(1.0f - dragView.f70832f, 1.0f - dragView.f70833g, (float) (dragView.f70841o - dragView.f70844r), (float) (dragView.f70842p - dragView.f70843q)) {

                        /* renamed from: a */
                        final /* synthetic */ float f70874a;

                        /* renamed from: b */
                        final /* synthetic */ float f70875b;

                        /* renamed from: c */
                        final /* synthetic */ float f70876c;

                        /* renamed from: d */
                        final /* synthetic */ float f70877d;

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            DragView.this.f70829c = (this.f70874a * floatValue) + DragView.this.f70832f;
                            DragView.this.f70830d = (this.f70875b * floatValue) + DragView.this.f70833g;
                            DragView.this.f70834h = (int) (255.0f * floatValue);
                            DragView.this.f70831e = DragView.this.f70828b.f70894e * (1.0f - floatValue);
                            DragView.this.mo54901a(DragView.this.f70844r + ((int) (this.f70876c * floatValue)), DragView.this.f70843q + ((int) (floatValue * this.f70877d)));
                        }

                        {
                            this.f70874a = r2;
                            this.f70875b = r3;
                            this.f70876c = r4;
                            this.f70877d = r5;
                        }
                    };
                    duration.addUpdateListener(r1);
                    duration.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            if (DragView.this.f70838l != null) {
                                DragView.this.f70838l.mo54927c();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            DragView.this.f70827a.setVisibility(0);
                            if (DragView.this.f70838l != null) {
                                DragView.this.f70838l.mo54925a();
                            }
                        }
                    });
                    duration.start();
                }
            }
        }, 50);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo54902b() {
        if (this.f70828b != null) {
            m65049a(this.f70828b.f70890a, this.f70828b.f70891b, this.f70828b.f70892c, this.f70828b.f70893d, this.f70828b.f70895f);
            this.f70837k = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        }
    }

    /* renamed from: a */
    public final void mo54900a() {
        this.f70836j = m65050c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.f70835i);
        final float f = this.f70829c - this.f70832f;
        final float f2 = this.f70830d - this.f70833g;
        final float f3 = (float) this.f70834h;
        LayoutParams layoutParams = (LayoutParams) this.f70827a.getLayoutParams();
        int i = layoutParams.leftMargin;
        final int i2 = i - this.f70828b.f70890a;
        final int i3 = layoutParams.topMargin - this.f70828b.f70891b;
        final int c = C23724k.m58225c();
        C269313 r3 = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DragView.this.f70829c = (f * floatValue) + DragView.this.f70832f;
                DragView.this.f70830d = (f2 * floatValue) + DragView.this.f70833g;
                DragView.this.f70834h = (int) (f3 * floatValue);
                int i = (int) ((((float) i2) * floatValue) + ((float) DragView.this.f70828b.f70890a));
                int i2 = (int) ((((float) i3) * floatValue) + ((float) DragView.this.f70828b.f70891b));
                if (!DragView.this.f70836j) {
                    i2 = (int) (((float) i2) - ((1.0f - floatValue) * ((float) c)));
                }
                DragView.this.f70831e = DragView.this.f70828b.f70894e * (1.0f - floatValue);
                DragView.this.mo54901a(i, i2);
            }
        };
        duration.addUpdateListener(r3);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                DragView.this.f70827a.setVisibility(8);
                DragView.this.f70838l.mo54929e();
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (DragView.this.f70838l != null) {
                    DragView.this.f70838l.mo54926b();
                }
            }
        });
        duration.start();
    }

    public void setAnimatorDuration(int i) {
        this.f70835i = (long) i;
    }

    public void setDragStateListener(C26939a aVar) {
        this.f70838l = aVar;
    }

    public void setDragThreshold(int i) {
        this.f70826A = i;
    }

    public DragView(Context context) {
        super(context);
        setBackgroundColor(-16777216);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r0 != false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r11 = r16
            int r0 = r17.getActionIndex()
            r1 = r17
            int r0 = r1.getPointerId(r0)
            int r2 = r17.getActionMasked()
            r3 = 2
            r4 = 5
            if (r2 != r4) goto L_0x001a
            int r2 = r11.f70846t
            if (r2 != 0) goto L_0x001a
            r11.f70845s = r3
        L_0x001a:
            int r2 = r17.getActionMasked()
            r11.f70846t = r2
            android.view.View r2 = r11.f70827a
            float r2 = r2.getScaleX()
            r4 = 255(0xff, float:3.57E-43)
            r12 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x015d
            if (r0 != 0) goto L_0x015d
            int r0 = r11.f70845s
            if (r0 == r3) goto L_0x015d
            int r0 = r17.getAction()
            if (r0 == 0) goto L_0x0151
            if (r0 == r3) goto L_0x003f
            goto L_0x015d
        L_0x003f:
            int r0 = r11.f70845s
            if (r0 == r12) goto L_0x0093
            float r0 = r17.getX()
            float r2 = r11.f70847u
            float r0 = r0 - r2
            float r2 = r17.getY()
            float r6 = r11.f70848v
            float r2 = r2 - r6
            float r6 = java.lang.Math.abs(r2)
            int r7 = r11.f70837k
            float r7 = (float) r7
            r8 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x006b
            float r6 = java.lang.Math.abs(r0)
            int r7 = r11.f70837k
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r0 = 0
            goto L_0x0091
        L_0x006b:
            float r0 = java.lang.Math.abs(r0)
            float r2 = java.lang.Math.abs(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0079
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            if (r0 == 0) goto L_0x008f
            int r2 = r11.f70845s
            if (r2 == r12) goto L_0x008c
            float r2 = r17.getX()
            r11.f70847u = r2
            float r2 = r17.getY()
            r11.f70848v = r2
        L_0x008c:
            r11.f70845s = r12
            goto L_0x0091
        L_0x008f:
            r11.f70845s = r8
        L_0x0091:
            if (r0 == 0) goto L_0x015d
        L_0x0093:
            float r0 = r17.getY()
            float r1 = r17.getX()
            float r2 = r11.f70847u
            float r1 = r1 - r2
            r11.f70850x = r1
            float r1 = r11.f70848v
            float r0 = r0 - r1
            r11.f70849w = r0
            float r0 = r11.f70849w
            int r1 = r11.f70826A
            float r1 = (float) r1
            float r0 = r0 / r1
            float r1 = r11.f70829c
            float r2 = r11.f70832f
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x00c3
            float r1 = r11.f70829c
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x00c3
            float r1 = r11.f70832f
            float r1 = r5 - r1
            float r1 = r1 * r0
            float r1 = r5 - r1
            r11.f70829c = r1
        L_0x00c3:
            float r1 = r11.f70830d
            float r2 = r11.f70833g
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x00db
            float r1 = r11.f70830d
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x00db
            float r1 = r11.f70833g
            float r1 = r5 - r1
            float r1 = r1 * r0
            float r1 = r5 - r1
            r11.f70830d = r1
        L_0x00db:
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r5 - r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r11.f70834h = r0
            int r0 = r11.f70834h
            if (r0 <= r4) goto L_0x00eb
            r11.f70834h = r4
            goto L_0x00f3
        L_0x00eb:
            int r0 = r11.f70834h
            r1 = 153(0x99, float:2.14E-43)
            if (r0 > r1) goto L_0x00f3
            r11.f70834h = r1
        L_0x00f3:
            float r0 = r11.f70829c
            float r1 = r11.f70832f
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0100
            float r0 = r11.f70832f
            r11.f70829c = r0
            goto L_0x0108
        L_0x0100:
            float r0 = r11.f70829c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0108
            r11.f70829c = r5
        L_0x0108:
            float r0 = r11.f70830d
            float r1 = r11.f70833g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0115
            float r0 = r11.f70833g
            r11.f70830d = r0
            goto L_0x011d
        L_0x0115:
            float r0 = r11.f70830d
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x011d
            r11.f70830d = r5
        L_0x011d:
            float r0 = r11.f70850x
            float r1 = r11.f70847u
            float r2 = r11.f70829c
            float r2 = r5 - r2
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r1 = r11.f70841o
            float r1 = (float) r1
            float r2 = r11.f70829c
            float r1 = r1 * r2
            float r0 = r0 + r1
            int r0 = (int) r0
            float r1 = r11.f70849w
            float r2 = r11.f70848v
            float r3 = r11.f70830d
            float r5 = r5 - r3
            float r2 = r2 * r5
            float r1 = r1 + r2
            int r2 = r11.f70842p
            float r2 = (float) r2
            float r3 = r11.f70830d
            float r2 = r2 * r3
            float r1 = r1 + r2
            int r1 = (int) r1
            com.ss.android.ugc.aweme.common.widget.DragView$a r2 = r11.f70838l
            if (r2 == 0) goto L_0x014d
            com.ss.android.ugc.aweme.common.widget.DragView$a r2 = r11.f70838l
            r2.mo54928d()
        L_0x014d:
            r11.mo54901a(r0, r1)
            return r12
        L_0x0151:
            float r0 = r17.getX()
            r11.f70847u = r0
            float r0 = r17.getY()
            r11.f70848v = r0
        L_0x015d:
            int r0 = r17.getActionMasked()
            if (r0 == r12) goto L_0x016a
            int r0 = r17.getActionMasked()
            r2 = 3
            if (r0 != r2) goto L_0x0188
        L_0x016a:
            r0 = -1
            r11.f70845s = r0
            float r0 = r11.f70849w
            float r0 = java.lang.Math.abs(r0)
            int r2 = r11.f70837k
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x018d
            float r0 = r11.f70850x
            float r0 = java.lang.Math.abs(r0)
            int r2 = r11.f70837k
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0188
            goto L_0x018d
        L_0x0188:
            boolean r0 = super.dispatchTouchEvent(r17)
            return r0
        L_0x018d:
            float r0 = r11.f70849w
            int r1 = r11.f70826A
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0203
            float r0 = r11.f70830d
            float r1 = r11.f70833g
            r2 = 1008981770(0x3c23d70a, float:0.01)
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0203
            float r0 = r11.f70829c
            float r1 = r11.f70832f
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01ac
            goto L_0x0203
        L_0x01ac:
            float[] r0 = new float[r3]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            long r1 = r11.f70835i
            android.animation.ValueAnimator r10 = r0.setDuration(r1)
            float r0 = r11.f70829c
            float r2 = r5 - r0
            float r3 = r11.f70829c
            float r0 = r11.f70830d
            float r5 = r5 - r0
            float r6 = r11.f70830d
            android.view.View r0 = r11.f70827a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r0.topMargin
            int r0 = r0.leftMargin
            int r7 = r11.f70842p
            int r1 = r1 - r7
            float r9 = (float) r1
            int r1 = r11.f70841o
            int r0 = r0 - r1
            float r8 = (float) r0
            int r7 = r11.f70834h
            int r0 = r11.f70834h
            int r13 = 255 - r0
            com.ss.android.ugc.aweme.common.widget.DragView$5 r14 = new com.ss.android.ugc.aweme.common.widget.DragView$5
            r0 = r14
            r1 = r16
            r4 = r5
            r5 = r6
            r6 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.addUpdateListener(r14)
            com.ss.android.ugc.aweme.common.widget.DragView$6 r0 = new com.ss.android.ugc.aweme.common.widget.DragView$6
            r0.<init>()
            r10.addListener(r0)
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r10.setInterpolator(r0)
            r10.start()
            goto L_0x027a
        L_0x0203:
            com.ss.android.ugc.aweme.common.widget.DragView$IViewInfo r0 = r11.f70828b
            if (r0 != 0) goto L_0x0277
            float r0 = r11.f70829c
            r1 = 1063675494(0x3f666666, float:0.9)
            float r4 = r0 * r1
            float r0 = r11.f70830d
            float r5 = r0 * r1
            float[] r0 = new float[r3]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            long r1 = r11.f70835i
            android.animation.ValueAnimator r13 = r0.setDuration(r1)
            float r0 = r11.f70829c
            float r2 = r0 - r4
            float r0 = r11.f70829c
            float r6 = r0 - r5
            int r0 = r11.f70834h
            float r7 = (float) r0
            android.view.View r0 = r11.f70827a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r0.topMargin
            int r0 = r0.leftMargin
            int r3 = r16.getWidth()
            float r3 = (float) r3
            int r8 = r11.f70840n
            float r8 = (float) r8
            float r8 = r8 * r4
            float r3 = r3 - r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r9 = r3 / r8
            int r3 = r16.getHeight()
            float r3 = (float) r3
            int r10 = r11.f70839m
            float r10 = (float) r10
            float r10 = r10 * r5
            float r3 = r3 - r10
            float r10 = r3 / r8
            float r0 = (float) r0
            float r8 = r0 - r9
            float r0 = (float) r1
            float r14 = r0 - r10
            com.ss.android.ugc.aweme.common.widget.DragView$9 r15 = new com.ss.android.ugc.aweme.common.widget.DragView$9
            r0 = r15
            r1 = r16
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.addUpdateListener(r15)
            r13.start()
            com.ss.android.ugc.aweme.common.widget.DragView$10 r0 = new com.ss.android.ugc.aweme.common.widget.DragView$10
            r0.<init>()
            r13.addListener(r0)
            goto L_0x027a
        L_0x0277:
            r16.mo54900a()
        L_0x027a:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.widget.DragView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public DragView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundColor(-16777216);
    }

    /* renamed from: a */
    public final void mo54901a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f70827a.getLayoutParams();
        layoutParams.width = (int) (((float) this.f70840n) * this.f70829c);
        layoutParams.height = (int) (((float) this.f70839m) * this.f70830d);
        layoutParams.topMargin = i2;
        layoutParams.leftMargin = i;
        if (this.f70827a instanceof C26940b) {
            ((C26940b) this.f70827a).mo54930a((float) layoutParams.width, (float) layoutParams.height, (float) layoutParams.leftMargin, (float) layoutParams.topMargin);
        }
        this.f70827a.setLayoutParams(layoutParams);
        setBackgroundColor(this.f70834h << 24);
        if (VERSION.SDK_INT >= 21) {
            this.f70827a.invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f70851y = i;
        this.f70852z = i2;
        mo54902b();
    }

    /* renamed from: a */
    private void m65049a(int i, int i2, int i3, int i4, float f) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        if (((float) getHeight()) / ((float) getWidth()) > f) {
            this.f70839m = (int) (((float) getWidth()) * f);
            this.f70840n = getWidth();
            this.f70841o = 0;
            this.f70842p = (getHeight() - this.f70839m) / 2;
        } else {
            this.f70839m = getHeight();
            this.f70840n = (int) (((float) getHeight()) / f);
            this.f70841o = (getWidth() - this.f70840n) / 2;
            this.f70842p = 0;
        }
        this.f70843q = i2 - iArr[1];
        this.f70844r = i - iArr[0];
        this.f70832f = ((float) i3) / ((float) this.f70840n);
        this.f70833g = ((float) i4) / ((float) this.f70839m);
    }
}
