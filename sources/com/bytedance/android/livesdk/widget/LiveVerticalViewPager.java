package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.p040os.C0965e;
import android.support.p030v4.p040os.C0967f;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1044i;
import android.support.p030v4.view.C1051p;
import android.support.p030v4.view.C1055t;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.C1060v;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p030v4.view.ViewPager.C0998f;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p030v4.view.p041a.C1015e;
import android.support.p030v4.widget.C1109i;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.bytedance.android.live.core.rxutils.C4060h;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;

public class LiveVerticalViewPager extends ViewGroup {

    /* renamed from: a */
    public static final int[] f23066a = {16842931};

    /* renamed from: al */
    private static final C8479g f23067al = new C8479g();

    /* renamed from: g */
    static Field f23068g;

    /* renamed from: i */
    private static final Comparator<C8474b> f23069i = new Comparator<C8474b>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C8474b) obj).f23147b - ((C8474b) obj2).f23147b;
        }
    };

    /* renamed from: j */
    private static final Interpolator f23070j = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: A */
    private boolean f23071A;

    /* renamed from: B */
    private boolean f23072B;

    /* renamed from: C */
    private boolean f23073C;

    /* renamed from: D */
    private int f23074D = 1;

    /* renamed from: E */
    private boolean f23075E;

    /* renamed from: F */
    private boolean f23076F;

    /* renamed from: G */
    private int f23077G;

    /* renamed from: H */
    private int f23078H;

    /* renamed from: I */
    private int f23079I;

    /* renamed from: J */
    private float f23080J;

    /* renamed from: K */
    private float f23081K;

    /* renamed from: L */
    private float f23082L;

    /* renamed from: M */
    private float f23083M;

    /* renamed from: N */
    private int f23084N = -1;

    /* renamed from: O */
    private VelocityTracker f23085O;

    /* renamed from: P */
    private int f23086P;

    /* renamed from: Q */
    private int f23087Q;

    /* renamed from: R */
    private int f23088R;

    /* renamed from: S */
    private int f23089S;

    /* renamed from: T */
    private C1109i f23090T;

    /* renamed from: U */
    private C1109i f23091U;

    /* renamed from: V */
    private boolean f23092V = false;

    /* renamed from: W */
    private boolean f23093W = false;

    /* renamed from: aa */
    private boolean f23094aa = true;

    /* renamed from: ab */
    private boolean f23095ab = false;

    /* renamed from: ac */
    private boolean f23096ac;

    /* renamed from: ad */
    private int f23097ad;

    /* renamed from: ae */
    private C0997e f23098ae;

    /* renamed from: af */
    private C0997e f23099af;

    /* renamed from: ag */
    private C8476d f23100ag;

    /* renamed from: ah */
    private C0998f f23101ah;

    /* renamed from: ai */
    private Method f23102ai;

    /* renamed from: aj */
    private int f23103aj;

    /* renamed from: ak */
    private ArrayList<View> f23104ak;

    /* renamed from: am */
    private final Runnable f23105am = new Runnable() {
        public final void run() {
            LiveVerticalViewPager.this.setScrollState(0);
            LiveVerticalViewPager.this.mo14785b();
        }
    };

    /* renamed from: an */
    private int f23106an = 0;

    /* renamed from: b */
    public PagerAdapter f23107b;

    /* renamed from: c */
    public int f23108c;

    /* renamed from: d */
    public Scroller f23109d;

    /* renamed from: e */
    public boolean f23110e;

    /* renamed from: f */
    public C8477e f23111f = null;

    /* renamed from: h */
    private int f23112h;

    /* renamed from: k */
    private final ArrayList<C8474b> f23113k = new ArrayList<>();

    /* renamed from: l */
    private final C8474b f23114l = new C8474b();

    /* renamed from: m */
    private final Rect f23115m = new Rect();

    /* renamed from: n */
    private int f23116n = -1;

    /* renamed from: o */
    private Parcelable f23117o = null;

    /* renamed from: p */
    private ClassLoader f23118p = null;

    /* renamed from: q */
    private boolean f23119q;

    /* renamed from: r */
    private C8478f f23120r;

    /* renamed from: s */
    private int f23121s;

    /* renamed from: t */
    private Drawable f23122t;

    /* renamed from: u */
    private int f23123u;

    /* renamed from: v */
    private int f23124v;

    /* renamed from: w */
    private float f23125w = -3.4028235E38f;

    /* renamed from: x */
    private float f23126x = Float.MAX_VALUE;

    /* renamed from: y */
    private int f23127y;

    /* renamed from: z */
    private int f23128z;

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f23137a;

        /* renamed from: b */
        public int f23138b;

        /* renamed from: c */
        float f23139c;

        /* renamed from: d */
        boolean f23140d;

        /* renamed from: e */
        int f23141e;

        /* renamed from: f */
        int f23142f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LiveVerticalViewPager.f23066a);
            this.f23138b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = C0965e.m2810a(new C0967f<SavedState>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object[] mo2951a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo2950a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        });

        /* renamed from: a */
        int f23143a;

        /* renamed from: b */
        Parcelable f23144b;

        /* renamed from: c */
        ClassLoader f23145c;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f23143a);
            sb.append("}");
            return sb.toString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23143a);
            parcel.writeParcelable(this.f23144b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f23143a = parcel.readInt();
            this.f23144b = parcel.readParcelable(classLoader);
            this.f23145c = classLoader;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$a */
    interface C8473a {
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b */
    static class C8474b {

        /* renamed from: a */
        Object f23146a;

        /* renamed from: b */
        int f23147b;

        /* renamed from: c */
        boolean f23148c;

        /* renamed from: d */
        float f23149d;

        /* renamed from: e */
        float f23150e;

        C8474b() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$c */
    class C8475c extends C1002a {
        /* renamed from: a */
        private boolean m16720a() {
            if (LiveVerticalViewPager.this.f23107b == null || LiveVerticalViewPager.this.f23107b.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C8475c() {
        }

        /* renamed from: a */
        public final void mo1119a(View view, C1008c cVar) {
            super.mo1119a(view, cVar);
            cVar.mo3139b((CharSequence) ViewPager.class.getName());
            cVar.mo3164j(m16720a());
            if (LiveVerticalViewPager.this.canScrollVertically(1)) {
                cVar.mo3130a(4096);
            }
            if (LiveVerticalViewPager.this.canScrollVertically(-1)) {
                cVar.mo3130a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
            }
        }

        /* renamed from: a */
        public final void mo1322a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1322a(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C1015e a = C1015e.m2926a();
            a.mo3175a(m16720a());
            if (accessibilityEvent.getEventType() == 4096 && LiveVerticalViewPager.this.f23107b != null) {
                a.mo3174a(LiveVerticalViewPager.this.f23107b.getCount());
                a.mo3176b(LiveVerticalViewPager.this.f23108c);
                a.mo3177c(LiveVerticalViewPager.this.f23108c);
            }
        }

        /* renamed from: a */
        public final boolean mo1246a(View view, int i, Bundle bundle) {
            if (super.mo1246a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !LiveVerticalViewPager.this.canScrollVertically(-1)) {
                    return false;
                }
                LiveVerticalViewPager.this.setCurrentItem(LiveVerticalViewPager.this.f23108c - 1);
                return true;
            } else if (!LiveVerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                LiveVerticalViewPager.this.setCurrentItem(LiveVerticalViewPager.this.f23108c + 1);
                return true;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$d */
    interface C8476d {
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$e */
    public interface C8477e {
        /* renamed from: a */
        void mo12895a();

        /* renamed from: b */
        void mo12896b();
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$f */
    class C8478f extends DataSetObserver {
        public final void onChanged() {
            LiveVerticalViewPager.this.mo14780a();
        }

        public final void onInvalidated() {
            LiveVerticalViewPager.this.mo14780a();
        }

        private C8478f() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$g */
    static class C8479g implements Comparator<View> {
        C8479g() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
            if (layoutParams.f23137a == layoutParams2.f23137a) {
                i = layoutParams.f23141e - layoutParams2.f23141e;
            } else if (!layoutParams.f23137a) {
                return -1;
            } else {
                i = 1;
            }
            return i;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f23107b;
    }

    public int getCurrentItem() {
        return this.f23108c;
    }

    public int getOffscreenPageLimit() {
        return this.f23074D;
    }

    public int getPageMargin() {
        return this.f23121s;
    }

    /* renamed from: a */
    public final void mo14781a(int i, boolean z) {
        this.f23073C = false;
        m16694a(i, z, false);
    }

    /* renamed from: a */
    private void m16695a(int i, boolean z, boolean z2, int i2) {
        if (this.f23107b == null || this.f23107b.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f23108c != i || this.f23113k.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f23107b.getCount()) {
                i = this.f23107b.getCount() - 1;
            }
            int i3 = this.f23074D;
            if (i > this.f23108c + i3 || i < this.f23108c - i3) {
                for (int i4 = 0; i4 < this.f23113k.size(); i4++) {
                    ((C8474b) this.f23113k.get(i4)).f23148c = true;
                }
            }
            if (this.f23108c == i) {
                z3 = false;
            }
            if (this.f23094aa) {
                this.f23108c = i;
                if (z3 && this.f23098ae != null) {
                    this.f23098ae.onPageSelected(i);
                }
                if (z3 && this.f23099af != null) {
                    this.f23099af.onPageSelected(i);
                }
                requestLayout();
                return;
            }
            m16689a(i);
            m16693a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m16693a(int i, boolean z, int i2, boolean z2) {
        C8474b b = m16701b(i);
        int clientHeight = b != null ? (int) (((float) getClientHeight()) * Math.max(this.f23125w, Math.min(b.f23150e, this.f23126x))) : 0;
        if (z) {
            m16691a(0, clientHeight, i2);
            if (z2 && this.f23098ae != null) {
                this.f23098ae.onPageSelected(i);
            }
            if (z2 && this.f23099af != null) {
                this.f23099af.onPageSelected(i);
            }
        } else {
            if (z2 && this.f23098ae != null) {
                this.f23098ae.onPageSelected(i);
            }
            if (z2 && this.f23099af != null) {
                this.f23099af.onPageSelected(i);
            }
            m16699a(false);
            scrollTo(0, clientHeight);
            m16706c(clientHeight);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14780a() {
        int count = this.f23107b.getCount();
        this.f23112h = count;
        boolean z = this.f23113k.size() < (this.f23074D * 2) + 1 && this.f23113k.size() < count;
        int i = this.f23108c;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f23113k.size()) {
            C8474b bVar = (C8474b) this.f23113k.get(i2);
            int itemPosition = this.f23107b.getItemPosition(bVar.f23146a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f23113k.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f23107b.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f23107b.destroyItem((ViewGroup) this, bVar.f23147b, bVar.f23146a);
                    if (this.f23108c == bVar.f23147b) {
                        i = Math.max(0, Math.min(this.f23108c, count - 1));
                    }
                } else if (bVar.f23147b != itemPosition) {
                    if (bVar.f23147b == this.f23108c) {
                        i = itemPosition;
                    }
                    bVar.f23147b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f23107b.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f23113k, f23069i);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f23137a) {
                    layoutParams.f23139c = 0.0f;
                }
            }
            m16694a(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m16698a(C8474b bVar, int i, C8474b bVar2) {
        C8474b bVar3;
        C8474b bVar4;
        int count = this.f23107b.getCount();
        int clientHeight = getClientHeight();
        float f = clientHeight > 0 ? ((float) this.f23121s) / ((float) clientHeight) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f23147b;
            if (i2 < bVar.f23147b) {
                float f2 = bVar2.f23150e + bVar2.f23149d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f23147b && i4 < this.f23113k.size()) {
                    Object obj = this.f23113k.get(i4);
                    while (true) {
                        bVar4 = (C8474b) obj;
                        if (i3 > bVar4.f23147b && i4 < this.f23113k.size() - 1) {
                            i4++;
                            obj = this.f23113k.get(i4);
                        }
                    }
                    while (i3 < bVar4.f23147b) {
                        f2 += this.f23107b.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f23150e = f2;
                    f2 += bVar4.f23149d + f;
                    i3++;
                }
            } else if (i2 > bVar.f23147b) {
                int size = this.f23113k.size() - 1;
                float f3 = bVar2.f23150e;
                while (true) {
                    i2--;
                    if (i2 < bVar.f23147b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f23113k.get(size);
                    while (true) {
                        bVar3 = (C8474b) obj2;
                        if (i2 < bVar3.f23147b && size > 0) {
                            size--;
                            obj2 = this.f23113k.get(size);
                        }
                    }
                    while (i2 > bVar3.f23147b) {
                        f3 -= this.f23107b.getPageWidth(i2) + f;
                        i2--;
                    }
                    f3 -= bVar3.f23149d + f;
                    bVar3.f23150e = f3;
                }
            }
        }
        int size2 = this.f23113k.size();
        float f4 = bVar.f23150e;
        int i5 = bVar.f23147b - 1;
        this.f23125w = bVar.f23147b == 0 ? bVar.f23150e : -3.4028235E38f;
        int i6 = count - 1;
        this.f23126x = bVar.f23147b == i6 ? (bVar.f23150e + bVar.f23149d) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            C8474b bVar5 = (C8474b) this.f23113k.get(i7);
            while (i5 > bVar5.f23147b) {
                f4 -= this.f23107b.getPageWidth(i5) + f;
                i5--;
            }
            f4 -= bVar5.f23149d + f;
            bVar5.f23150e = f4;
            if (bVar5.f23147b == 0) {
                this.f23125w = f4;
            }
            i7--;
            i5--;
        }
        float f5 = bVar.f23150e + bVar.f23149d + f;
        int i8 = bVar.f23147b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C8474b bVar6 = (C8474b) this.f23113k.get(i9);
            while (i8 < bVar6.f23147b) {
                f5 += this.f23107b.getPageWidth(i8) + f;
                i8++;
            }
            if (bVar6.f23147b == i6) {
                this.f23126x = (bVar6.f23149d + f5) - 1.0f;
            }
            bVar6.f23150e = f5;
            f5 += bVar6.f23149d + f;
            i9++;
            i8++;
        }
        this.f23095ab = false;
    }

    /* renamed from: a */
    private void m16692a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f23113k.isEmpty()) {
            C8474b b = m16701b(this.f23108c);
            int min = (int) ((b != null ? Math.min(b.f23150e, this.f23126x) : 0.0f) * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                m16699a(false);
                scrollTo(getScrollX(), min);
            }
        } else if (!this.f23109d.isFinished()) {
            this.f23109d.setFinalY(getCurrentItem() * getClientHeight());
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))) * ((float) (((i - getPaddingTop()) - getPaddingBottom()) + i3))));
        }
    }

    /* renamed from: a */
    private void m16699a(boolean z) {
        boolean z2 = this.f23106an == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f23109d.isFinished()) {
                this.f23109d.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f23109d.getCurrX();
                int currY = this.f23109d.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        m16706c(currY);
                    }
                }
            } else if (this.f23109d.getCurrY() != getScrollY() && ((Boolean) LiveSettingKeys.LIVE_VIEWPAGER_SLIDE_BLOCK_SWITCH.mo9431a()).booleanValue()) {
                scrollTo(this.f23109d.getCurrX(), this.f23109d.getCurrY());
                C4060h.f11209a.mo9418a(300, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<Long>() {

                    /* renamed from: a */
                    C1690c f23132a;

                    /* renamed from: b */
                    int f23133b = 2;

                    public final void onComplete() {
                    }

                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(C1690c cVar) {
                        this.f23132a = cVar;
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        Long l = (Long) obj;
                        if (LiveVerticalViewPager.this.f23109d.getCurrY() == LiveVerticalViewPager.this.getScrollY()) {
                            this.f23133b--;
                            if (this.f23132a != null && !this.f23132a.isDisposed() && this.f23133b <= 0) {
                                this.f23132a.dispose();
                            }
                        } else {
                            LiveVerticalViewPager.this.scrollTo(LiveVerticalViewPager.this.f23109d.getCurrX(), LiveVerticalViewPager.this.f23109d.getCurrY());
                        }
                    }
                });
            }
        }
        this.f23073C = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f23113k.size(); i++) {
            C8474b bVar = (C8474b) this.f23113k.get(i);
            if (bVar.f23148c) {
                bVar.f23148c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C1056u.m3034a((View) this, this.f23105am);
                return;
            }
            this.f23105am.run();
        }
    }

    /* renamed from: a */
    private void m16697a(MotionEvent motionEvent) {
        int b = C1044i.m2983b(motionEvent);
        if (C1044i.m2984b(motionEvent, b) == this.f23084N) {
            int i = b == 0 ? 1 : 0;
            this.f23081K = C1044i.m2986d(motionEvent, i);
            this.f23084N = C1044i.m2984b(motionEvent, i);
            if (this.f23085O != null) {
                this.f23085O.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m16700a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i3 + scrollY;
                if (i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                    int i5 = i2 + scrollX;
                    if (i5 >= childAt.getLeft() && i5 < childAt.getRight()) {
                        if (m16700a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !C1056u.m3039a(view, -i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14785b() {
        m16689a(this.f23108c);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23094aa = true;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: h */
    private boolean m16712h() {
        if (this.f23108c <= 0) {
            return false;
        }
        mo14781a(this.f23108c - 1, true);
        return true;
    }

    /* renamed from: e */
    private boolean m16709e() {
        this.f23084N = -1;
        m16711g();
        return this.f23090T.mo3562c() | this.f23091U.mo3562c();
    }

    /* renamed from: g */
    private void m16711g() {
        this.f23075E = false;
        this.f23076F = false;
        if (this.f23085O != null) {
            this.f23085O.recycle();
            this.f23085O = null;
        }
    }

    /* renamed from: i */
    private boolean m16713i() {
        if (this.f23107b == null || this.f23108c >= this.f23107b.getCount() - 1) {
            return false;
        }
        mo14781a(this.f23108c + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f23122t;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f23105am);
        if (this.f23109d != null && !this.f23109d.isFinished()) {
            this.f23109d.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23143a = this.f23108c;
        if (this.f23107b != null) {
            savedState.f23144b = this.f23107b.saveState();
        }
        return savedState;
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f23068g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    private void m16707d() {
        if (this.f23103aj != 0) {
            if (this.f23104ak == null) {
                this.f23104ak = new ArrayList<>();
            } else {
                this.f23104ak.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f23104ak.add(getChildAt(i));
            }
            Collections.sort(this.f23104ak, f23067al);
        }
    }

    /* renamed from: c */
    private void m16705c() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f23109d = new Scroller(context, f23070j);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f23079I = C1060v.m3090a(viewConfiguration);
        this.f23086P = (int) (400.0f * f);
        this.f23087Q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23090T = new C1109i(context);
        this.f23091U = new C1109i(context);
        this.f23088R = (int) (25.0f * f);
        this.f23089S = (int) (2.0f * f);
        this.f23077G = (int) (f * 16.0f);
        C1056u.m3031a((View) this, (C1002a) new C8475c());
        if (C1056u.m3053e(this) == 0) {
            C1056u.m3043b((View) this, 1);
        }
        C1056u.m3032a((View) this, (C1051p) new C1051p() {

            /* renamed from: b */
            private final Rect f23131b = new Rect();

            /* renamed from: a */
            public final C1018ac mo1130a(View view, C1018ac acVar) {
                C1018ac a = C1056u.m3022a(view, acVar);
                if (a.mo3189e()) {
                    return a;
                }
                Rect rect = this.f23131b;
                rect.left = a.mo3184a();
                rect.top = a.mo3186b();
                rect.right = a.mo3187c();
                rect.bottom = a.mo3188d();
                int childCount = LiveVerticalViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C1018ac b = C1056u.m3041b(LiveVerticalViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo3184a(), rect.left);
                    rect.top = Math.min(b.mo3186b(), rect.top);
                    rect.right = Math.min(b.mo3187c(), rect.right);
                    rect.bottom = Math.min(b.mo3188d(), rect.bottom);
                }
                return a.mo3185a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* renamed from: f */
    private C8474b m16710f() {
        float f;
        float f2;
        int clientHeight = getClientHeight();
        if (clientHeight > 0) {
            f = ((float) getScrollY()) / ((float) clientHeight);
        } else {
            f = 0.0f;
        }
        if (clientHeight > 0) {
            f2 = ((float) this.f23121s) / ((float) clientHeight);
        } else {
            f2 = 0.0f;
        }
        C8474b bVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i < this.f23113k.size()) {
            C8474b bVar2 = (C8474b) this.f23113k.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (bVar2.f23147b != i3) {
                    bVar2 = this.f23114l;
                    bVar2.f23150e = f3 + f4 + f2;
                    bVar2.f23147b = i3;
                    bVar2.f23149d = this.f23107b.getPageWidth(bVar2.f23147b);
                    i--;
                }
            }
            f3 = bVar2.f23150e;
            float f5 = bVar2.f23149d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i == this.f23113k.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f23147b;
            f4 = bVar2.f23149d;
            i++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.f23119q = true;
        if (this.f23109d.isFinished() || !this.f23109d.computeScrollOffset()) {
            m16699a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f23109d.getCurrX();
        int currY = this.f23109d.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m16706c(currY)) {
                this.f23109d.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        C1056u.m3052d(this);
    }

    /* access modifiers changed from: 0000 */
    public void setOnAdapterChangeListener(C8476d dVar) {
        this.f23100ag = dVar;
    }

    public void setOnPageChangeListener(C0997e eVar) {
        this.f23098ae = eVar;
    }

    public void setOverScrollListener(C8477e eVar) {
        this.f23111f = eVar;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f23072B != z) {
            this.f23072B = z;
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.f23073C = false;
        m16695a(i, true, true, 1);
    }

    /* renamed from: b */
    private void m16703b(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.f23071A) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.f23073C = false;
        m16694a(i, !this.f23094aa, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.f23074D) {
            this.f23074D = i;
            mo14785b();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f23121s;
        this.f23121s = i;
        int height = getHeight();
        m16692a(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f23122t) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static float m16685a(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    /* renamed from: b */
    private C8474b m16701b(int i) {
        for (int i2 = 0; i2 < this.f23113k.size(); i2++) {
            C8474b bVar = (C8474b) this.f23113k.get(i2);
            if (bVar.f23147b == i) {
                return bVar;
            }
        }
        return null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f23122t = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    /* renamed from: b */
    private C8474b m16702b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m16688a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C8474b a = m16688a(childAt);
                if (a != null && a.f23147b == this.f23108c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f23107b == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.f23125w))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollY >= ((int) (((float) clientHeight) * this.f23126x))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C8474b a = m16688a(childAt);
                if (a != null && a.f23147b == this.f23108c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f23107b != null) {
            this.f23107b.restoreState(savedState.f23144b, savedState.f23145c);
            m16694a(savedState.f23143a, false, true);
            return;
        }
        this.f23116n = savedState.f23143a;
        this.f23117o = savedState.f23144b;
        this.f23118p = savedState.f23145c;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChildrenDrawingOrderEnabledCompat(boolean r7) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 7
            if (r0 < r1) goto L_0x0029
            java.lang.reflect.Method r0 = r6.f23102ai
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001b
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.String r3 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001b }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x001b }
            r4[r1] = r5     // Catch:{ NoSuchMethodException -> 0x001b }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x001b }
            r6.f23102ai = r0     // Catch:{ NoSuchMethodException -> 0x001b }
        L_0x001b:
            java.lang.reflect.Method r0 = r6.f23102ai     // Catch:{ Exception -> 0x0029 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0029 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0029 }
            r2[r1] = r7     // Catch:{ Exception -> 0x0029 }
            r0.invoke(r6, r2)     // Catch:{ Exception -> 0x0029 }
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    public void setScrollState(int i) {
        boolean z;
        int i2;
        if (this.f23106an != i) {
            this.f23106an = i;
            if (this.f23101ah != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (z) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    C1056u.m3025a(getChildAt(i3), i2, (Paint) null);
                }
            }
            if (this.f23098ae != null) {
                this.f23098ae.onPageScrollStateChanged(i);
            }
        }
    }

    public LiveVerticalViewPager(Context context) {
        super(context);
        m16705c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            boolean r0 = super.dispatchKeyEvent(r5)
            r1 = 1
            if (r0 != 0) goto L_0x004a
            int r0 = r5.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0045
            int r0 = r5.getKeyCode()
            r3 = 61
            if (r0 == r3) goto L_0x0028
            switch(r0) {
                case 21: goto L_0x0021;
                case 22: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0045
        L_0x001a:
            r5 = 66
            boolean r5 = r4.m16708d(r5)
            goto L_0x0046
        L_0x0021:
            r5 = 17
            boolean r5 = r4.m16708d(r5)
            goto L_0x0046
        L_0x0028:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r0 < r3) goto L_0x0045
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L_0x003a
            r5 = 2
            boolean r5 = r4.m16708d(r5)
            goto L_0x0046
        L_0x003a:
            boolean r5 = r5.hasModifiers(r1)
            if (r5 == 0) goto L_0x0045
            boolean r5 = r4.m16708d(r1)
            goto L_0x0046
        L_0x0045:
            r5 = 0
        L_0x0046:
            if (r5 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            return r2
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    private C8474b m16688a(View view) {
        for (int i = 0; i < this.f23113k.size(); i++) {
            C8474b bVar = (C8474b) this.f23113k.get(i);
            if (this.f23107b.isViewFromObject(view, bVar.f23146a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private boolean m16704b(float f) {
        boolean z;
        float f2 = this.f23081K - f;
        this.f23081K = f;
        float scrollY = ((float) getScrollY()) + f2;
        float clientHeight = (float) getClientHeight();
        float f3 = this.f23125w * clientHeight;
        float f4 = this.f23126x * clientHeight;
        boolean z2 = false;
        C8474b bVar = (C8474b) this.f23113k.get(0);
        boolean z3 = true;
        C8474b bVar2 = (C8474b) this.f23113k.get(this.f23113k.size() - 1);
        if (bVar.f23147b != 0) {
            f3 = bVar.f23150e * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f23147b != this.f23107b.getCount() - 1) {
            f4 = bVar2.f23150e * clientHeight;
            z3 = false;
        }
        if (scrollY < f3) {
            if (z) {
                z2 = this.f23090T.mo3559a(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z3) {
                z2 = this.f23091U.mo3559a(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.f23080J += scrollY - ((float) i);
        scrollTo(getScrollX(), i);
        m16706c(i);
        return z2;
    }

    /* renamed from: c */
    private boolean m16706c(int i) {
        if (this.f23113k.size() != 0) {
            C8474b f = m16710f();
            int clientHeight = getClientHeight();
            int i2 = this.f23121s + clientHeight;
            float f2 = (float) clientHeight;
            float f3 = ((float) this.f23121s) / f2;
            int i3 = f.f23147b;
            float f4 = ((((float) i) / f2) - f.f23150e) / (f.f23149d + f3);
            int i4 = (int) (((float) i2) * f4);
            this.f23096ac = false;
            m16690a(i3, f4, i4);
            if (this.f23096ac) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f23094aa) {
            return false;
        } else {
            this.f23096ac = false;
            m16690a(0, 0.0f, 0);
            if (this.f23096ac) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16708d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            if (r0 == r6) goto L_0x004b
            if (r0 == 0) goto L_0x004c
            android.view.ViewParent r3 = r0.getParent()
        L_0x000e:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x001b
            if (r3 != r6) goto L_0x0016
            r3 = 1
            goto L_0x001c
        L_0x0016:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x000e
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r3 != 0) goto L_0x004c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0032:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x004b
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0032
        L_0x004b:
            r0 = 0
        L_0x004c:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 130(0x82, float:1.82E-43)
            r5 = 33
            if (r3 == 0) goto L_0x009c
            if (r3 == r0) goto L_0x009c
            if (r7 != r5) goto L_0x007c
            android.graphics.Rect r1 = r6.f23115m
            android.graphics.Rect r1 = r6.m16686a(r1, r3)
            int r1 = r1.top
            android.graphics.Rect r2 = r6.f23115m
            android.graphics.Rect r2 = r6.m16686a(r2, r0)
            int r2 = r2.top
            if (r0 == 0) goto L_0x0077
            if (r1 < r2) goto L_0x0077
            boolean r2 = r6.m16712h()
            goto L_0x00af
        L_0x0077:
            boolean r2 = r3.requestFocus()
            goto L_0x00af
        L_0x007c:
            if (r7 != r4) goto L_0x00af
            android.graphics.Rect r1 = r6.f23115m
            android.graphics.Rect r1 = r6.m16686a(r1, r3)
            int r1 = r1.bottom
            android.graphics.Rect r2 = r6.f23115m
            android.graphics.Rect r2 = r6.m16686a(r2, r0)
            int r2 = r2.bottom
            if (r0 == 0) goto L_0x0097
            if (r1 > r2) goto L_0x0097
            boolean r2 = r6.m16713i()
            goto L_0x00af
        L_0x0097:
            boolean r2 = r3.requestFocus()
            goto L_0x00af
        L_0x009c:
            if (r7 == r5) goto L_0x00ab
            if (r7 != r1) goto L_0x00a1
            goto L_0x00ab
        L_0x00a1:
            if (r7 == r4) goto L_0x00a6
            r0 = 2
            if (r7 != r0) goto L_0x00af
        L_0x00a6:
            boolean r2 = r6.m16713i()
            goto L_0x00af
        L_0x00ab:
            boolean r2 = r6.m16712h()
        L_0x00af:
            if (r2 == 0) goto L_0x00b8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00b8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.m16708d(int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce A[Catch:{ Throwable -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d2 A[Catch:{ Throwable -> 0x00df }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            super.draw(r10)     // Catch:{ Throwable -> 0x00df }
            int r0 = android.support.p030v4.view.C1056u.m3020a(r9)     // Catch:{ Throwable -> 0x00df }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0027
            if (r0 != r1) goto L_0x001a
            android.support.v4.view.PagerAdapter r0 = r9.f23107b     // Catch:{ Throwable -> 0x00df }
            if (r0 == 0) goto L_0x001a
            android.support.v4.view.PagerAdapter r0 = r9.f23107b     // Catch:{ Throwable -> 0x00df }
            int r0 = r0.getCount()     // Catch:{ Throwable -> 0x00df }
            if (r0 <= r1) goto L_0x001a
            goto L_0x0027
        L_0x001a:
            android.support.v4.widget.i r10 = r9.f23090T     // Catch:{ Throwable -> 0x00df }
            r10.mo3561b()     // Catch:{ Throwable -> 0x00df }
            android.support.v4.widget.i r10 = r9.f23091U     // Catch:{ Throwable -> 0x00df }
            r10.mo3561b()     // Catch:{ Throwable -> 0x00df }
            r3 = 0
            goto L_0x00cc
        L_0x0027:
            android.support.v4.widget.i r0 = r9.f23090T     // Catch:{ Throwable -> 0x00df }
            boolean r0 = r0.mo3558a()     // Catch:{ Throwable -> 0x00df }
            if (r0 != 0) goto L_0x0074
            int r0 = r10.save()     // Catch:{ Throwable -> 0x00df }
            int r3 = r9.getHeight()     // Catch:{ Throwable -> 0x00df }
            int r4 = r9.getWidth()     // Catch:{ Throwable -> 0x00df }
            int r5 = r9.getPaddingLeft()     // Catch:{ Throwable -> 0x00df }
            int r4 = r4 - r5
            int r5 = r9.getPaddingRight()     // Catch:{ Throwable -> 0x00df }
            int r4 = r4 - r5
            int r5 = r9.getPaddingLeft()     // Catch:{ Throwable -> 0x00df }
            float r5 = (float) r5     // Catch:{ Throwable -> 0x00df }
            float r6 = r9.f23125w     // Catch:{ Throwable -> 0x00df }
            float r7 = (float) r3     // Catch:{ Throwable -> 0x00df }
            float r6 = r6 * r7
            r10.translate(r5, r6)     // Catch:{ Throwable -> 0x00df }
            android.support.v4.widget.i r5 = r9.f23090T     // Catch:{ Throwable -> 0x00df }
            r5.mo3557a(r4, r3)     // Catch:{ Throwable -> 0x00df }
            android.support.v4.widget.i r3 = r9.f23090T     // Catch:{ Throwable -> 0x00df }
            boolean r3 = r3.mo3560a(r10)     // Catch:{ Throwable -> 0x00df }
            r3 = r3 | r2
            r10.restoreToCount(r0)     // Catch:{ Throwable -> 0x00df }
            boolean r0 = r9.f23092V     // Catch:{ Throwable -> 0x00df }
            if (r0 != 0) goto L_0x0075
            r9.f23092V = r1     // Catch:{ Throwable -> 0x00df }
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$e r0 = r9.f23111f     // Catch:{ Throwable -> 0x00df }
            if (r0 == 0) goto L_0x0075
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$6 r0 = new com.bytedance.android.livesdk.widget.LiveVerticalViewPager$6     // Catch:{ Throwable -> 0x00df }
            r0.<init>()     // Catch:{ Throwable -> 0x00df }
            r9.post(r0)     // Catch:{ Throwable -> 0x00df }
            goto L_0x0075
        L_0x0074:
            r3 = 0
        L_0x0075:
            android.support.v4.widget.i r0 = r9.f23091U     // Catch:{ Throwable -> 0x00df }
            boolean r0 = r0.mo3558a()     // Catch:{ Throwable -> 0x00df }
            if (r0 != 0) goto L_0x00cc
            int r0 = r10.save()     // Catch:{ Throwable -> 0x00df }
            int r4 = r9.getHeight()     // Catch:{ Throwable -> 0x00df }
            int r5 = r9.getWidth()     // Catch:{ Throwable -> 0x00df }
            int r6 = r9.getPaddingLeft()     // Catch:{ Throwable -> 0x00df }
            int r5 = r5 - r6
            int r6 = r9.getPaddingRight()     // Catch:{ Throwable -> 0x00df }
            int r5 = r5 - r6
            r6 = 1127481344(0x43340000, float:180.0)
            r10.rotate(r6)     // Catch:{ Throwable -> 0x00df }
            int r6 = -r5
            int r7 = r9.getPaddingLeft()     // Catch:{ Throwable -> 0x00df }
            int r6 = r6 - r7
            float r6 = (float) r6     // Catch:{ Throwable -> 0x00df }
            float r7 = r9.f23126x     // Catch:{ Throwable -> 0x00df }
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 + r8
            float r7 = -r7
            float r8 = (float) r4     // Catch:{ Throwable -> 0x00df }
            float r7 = r7 * r8
            r10.translate(r6, r7)     // Catch:{ Throwable -> 0x00df }
            android.support.v4.widget.i r6 = r9.f23091U     // Catch:{ Throwable -> 0x00df }
            r6.mo3557a(r5, r4)     // Catch:{ Throwable -> 0x00df }
            android.support.v4.widget.i r4 = r9.f23091U     // Catch:{ Throwable -> 0x00df }
            boolean r4 = r4.mo3560a(r10)     // Catch:{ Throwable -> 0x00df }
            r3 = r3 | r4
            r10.restoreToCount(r0)     // Catch:{ Throwable -> 0x00df }
            boolean r10 = r9.f23093W     // Catch:{ Throwable -> 0x00df }
            if (r10 != 0) goto L_0x00cc
            r9.f23093W = r1     // Catch:{ Throwable -> 0x00df }
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$e r10 = r9.f23111f     // Catch:{ Throwable -> 0x00df }
            if (r10 == 0) goto L_0x00cc
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$7 r10 = new com.bytedance.android.livesdk.widget.LiveVerticalViewPager$7     // Catch:{ Throwable -> 0x00df }
            r10.<init>()     // Catch:{ Throwable -> 0x00df }
            r9.post(r10)     // Catch:{ Throwable -> 0x00df }
        L_0x00cc:
            if (r3 == 0) goto L_0x00d2
            android.support.p030v4.view.C1056u.m3052d(r9)     // Catch:{ Throwable -> 0x00df }
            goto L_0x00e5
        L_0x00d2:
            boolean r10 = r9.f23092V     // Catch:{ Throwable -> 0x00df }
            if (r10 == 0) goto L_0x00d8
            r9.f23092V = r2     // Catch:{ Throwable -> 0x00df }
        L_0x00d8:
            boolean r10 = r9.f23093W     // Catch:{ Throwable -> 0x00df }
            if (r10 == 0) goto L_0x00de
            r9.f23093W = r2     // Catch:{ Throwable -> 0x00df }
        L_0x00de:
            return
        L_0x00df:
            r10 = move-exception
            java.lang.String r0 = "LiveVerticalViewPager"
            com.bytedance.android.live.core.p224c.C3831a.m9714b(r0, r10)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f23121s > 0 && this.f23122t != null && this.f23113k.size() > 0 && this.f23107b != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f4 = (float) height;
            float f5 = ((float) this.f23121s) / f4;
            int i = 0;
            C8474b bVar = (C8474b) this.f23113k.get(0);
            float f6 = bVar.f23150e;
            int size = this.f23113k.size();
            int i2 = bVar.f23147b;
            int i3 = ((C8474b) this.f23113k.get(size - 1)).f23147b;
            while (i2 < i3) {
                while (i2 > bVar.f23147b && i < size) {
                    i++;
                    bVar = (C8474b) this.f23113k.get(i);
                }
                if (i2 == bVar.f23147b) {
                    f2 = (bVar.f23150e + bVar.f23149d) * f4;
                    f = bVar.f23150e + bVar.f23149d + f5;
                } else {
                    float pageWidth = this.f23107b.getPageWidth(i2);
                    f = f6 + pageWidth + f5;
                    f2 = (f6 + pageWidth) * f4;
                }
                if (((float) this.f23121s) + f2 > ((float) scrollY)) {
                    f3 = f5;
                    this.f23122t.setBounds(this.f23123u, (int) f2, this.f23124v, (int) (((float) this.f23121s) + f2 + 0.5f));
                    this.f23122t.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollY + height))) {
                    i2++;
                    f6 = f;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (this.f23107b != null) {
            m16696a(this.f23107b, (C8478f) null);
            this.f23107b.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f23113k.size(); i++) {
                C8474b bVar = (C8474b) this.f23113k.get(i);
                this.f23107b.destroyItem((ViewGroup) this, bVar.f23147b, bVar.f23146a);
            }
            this.f23107b.finishUpdate((ViewGroup) this);
            this.f23113k.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f23137a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f23108c = 0;
            scrollTo(0, 0);
        }
        this.f23107b = pagerAdapter;
        this.f23112h = 0;
        if (this.f23107b != null) {
            if (this.f23120r == null) {
                this.f23120r = new C8478f();
            }
            m16696a(this.f23107b, this.f23120r);
            this.f23073C = false;
            boolean z = this.f23094aa;
            this.f23094aa = true;
            this.f23112h = this.f23107b.getCount();
            if (this.f23116n >= 0) {
                this.f23107b.restoreState(this.f23117o, this.f23118p);
                m16694a(this.f23116n, false, true);
                this.f23116n = -1;
                this.f23117o = null;
                this.f23118p = null;
            } else if (!z) {
                mo14785b();
            } else {
                requestLayout();
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        if (!isEnabled()) {
            return false;
        }
        try {
            if (this.f23110e) {
                return false;
            }
            int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
            if (action != 3) {
                if (action != 1) {
                    if (action != 0) {
                        if (this.f23075E) {
                            return true;
                        }
                        if (this.f23076F) {
                            return false;
                        }
                    }
                    if (action == 0) {
                        this.f23080J = motionEvent.getX();
                        this.f23082L = motionEvent.getX();
                        this.f23081K = motionEvent.getY();
                        this.f23083M = motionEvent.getY();
                        this.f23084N = C1044i.m2984b(motionEvent2, 0);
                        this.f23076F = false;
                        this.f23119q = true;
                        this.f23109d.computeScrollOffset();
                        if (this.f23106an != 2 || Math.abs(this.f23109d.getFinalY() - this.f23109d.getCurrY()) <= this.f23089S) {
                            m16699a(false);
                            this.f23075E = false;
                        } else {
                            this.f23109d.abortAnimation();
                            this.f23073C = false;
                            mo14785b();
                            this.f23075E = true;
                            m16703b(true);
                            setScrollState(1);
                        }
                    } else if (action == 2) {
                        int i = this.f23084N;
                        if (i != -1) {
                            int a = C1044i.m2982a(motionEvent2, i);
                            float d = C1044i.m2986d(motionEvent2, a);
                            float f2 = d - this.f23081K;
                            float abs = Math.abs(f2);
                            float c = C1044i.m2985c(motionEvent2, a);
                            float abs2 = Math.abs(c - this.f23082L);
                            if (f2 != 0.0f) {
                                float f3 = this.f23081K;
                                if ((f3 >= ((float) this.f23078H) || f2 <= 0.0f) && (f3 <= ((float) (getHeight() - this.f23078H)) || f2 >= 0.0f)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                    if (m16700a(this, false, (int) f2, (int) c, (int) d)) {
                                        this.f23080J = c;
                                        this.f23081K = d;
                                        this.f23076F = true;
                                        return false;
                                    }
                                }
                            }
                            if (abs > ((float) this.f23079I) && abs * 0.5f > abs2) {
                                this.f23075E = true;
                                m16703b(true);
                                setScrollState(1);
                                if (f2 > 0.0f) {
                                    f = this.f23083M + ((float) this.f23079I);
                                } else {
                                    f = this.f23083M - ((float) this.f23079I);
                                }
                                this.f23081K = f;
                                this.f23080J = c;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > ((float) this.f23079I)) {
                                this.f23076F = true;
                            }
                            if (this.f23075E && m16704b(d)) {
                                C1056u.m3052d(this);
                            }
                        }
                    } else if (action == 6) {
                        m16697a(motionEvent);
                    }
                    if (this.f23085O == null) {
                        this.f23085O = VelocityTracker.obtain();
                    }
                    this.f23085O.addMovement(motionEvent2);
                    return this.f23075E;
                }
            }
            m16709e();
            return false;
        } catch (IllegalArgumentException unused) {
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        boolean z = false;
        if (!isEnabled()) {
            return false;
        }
        try {
            if (this.f23110e) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && this.f23107b != null) {
                if (this.f23107b.getCount() != 0) {
                    if (this.f23085O == null) {
                        this.f23085O = VelocityTracker.obtain();
                    }
                    this.f23085O.addMovement(motionEvent);
                    switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
                        case 0:
                            this.f23109d.abortAnimation();
                            this.f23073C = false;
                            mo14785b();
                            this.f23082L = motionEvent.getX();
                            this.f23080J = motionEvent.getX();
                            this.f23081K = motionEvent.getY();
                            this.f23083M = motionEvent.getY();
                            this.f23084N = C1044i.m2984b(motionEvent, 0);
                            break;
                        case 1:
                            if (this.f23075E) {
                                VelocityTracker velocityTracker = this.f23085O;
                                velocityTracker.computeCurrentVelocity(1000, (float) this.f23087Q);
                                int b = (int) C1055t.m3016b(velocityTracker, this.f23084N);
                                this.f23073C = true;
                                int clientHeight = getClientHeight();
                                int scrollY = getScrollY();
                                C8474b f3 = m16710f();
                                float f4 = (float) clientHeight;
                                float f5 = ((float) this.f23121s) / f4;
                                int i = f3.f23147b;
                                float f6 = ((((float) scrollY) / f4) - f3.f23150e) / (f3.f23149d + f5);
                                if (Math.abs((int) (C1044i.m2986d(motionEvent, C1044i.m2982a(motionEvent, this.f23084N)) - this.f23083M)) <= this.f23088R || Math.abs(b) <= this.f23086P) {
                                    if (i >= this.f23108c) {
                                        f = 0.6f;
                                    } else {
                                        f = 0.4f;
                                    }
                                    i = (int) (((float) i) + f6 + f);
                                } else if (b <= 0) {
                                    i++;
                                }
                                if (this.f23113k.size() > 0) {
                                    i = Math.max(((C8474b) this.f23113k.get(0)).f23147b, Math.min(i, ((C8474b) this.f23113k.get(this.f23113k.size() - 1)).f23147b));
                                }
                                m16695a(i, true, true, b);
                                z = m16709e();
                                break;
                            }
                            break;
                        case 2:
                            if (!this.f23075E) {
                                int a = C1044i.m2982a(motionEvent, this.f23084N);
                                if (a == -1) {
                                    z = m16709e();
                                    break;
                                } else {
                                    float d = C1044i.m2986d(motionEvent, a);
                                    float abs = Math.abs(d - this.f23081K);
                                    float c = C1044i.m2985c(motionEvent, a);
                                    float abs2 = Math.abs(c - this.f23080J);
                                    if (abs > ((float) this.f23079I) && abs > abs2) {
                                        this.f23075E = true;
                                        m16703b(true);
                                        if (d - this.f23083M > 0.0f) {
                                            f2 = this.f23083M + ((float) this.f23079I);
                                        } else {
                                            f2 = this.f23083M - ((float) this.f23079I);
                                        }
                                        this.f23081K = f2;
                                        this.f23080J = c;
                                        setScrollState(1);
                                        setScrollingCacheEnabled(true);
                                        ViewParent parent = getParent();
                                        if (parent != null) {
                                            parent.requestDisallowInterceptTouchEvent(true);
                                        }
                                    }
                                }
                            }
                            if (this.f23075E) {
                                z = false | m16704b(C1044i.m2986d(motionEvent, C1044i.m2982a(motionEvent, this.f23084N)));
                                break;
                            }
                            break;
                        case 3:
                            if (this.f23075E) {
                                m16693a(this.f23108c, true, 0, false);
                                z = m16709e();
                                break;
                            }
                            break;
                        case 5:
                            int b2 = C1044i.m2983b(motionEvent);
                            this.f23081K = C1044i.m2986d(motionEvent, b2);
                            this.f23084N = C1044i.m2984b(motionEvent, b2);
                            break;
                        case 6:
                            m16697a(motionEvent);
                            this.f23081K = C1044i.m2986d(motionEvent, C1044i.m2982a(motionEvent, this.f23084N));
                            break;
                    }
                    if (z) {
                        C1056u.m3052d(this);
                    }
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r9.f23147b == r0.f23108c) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16689a(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f23108c
            if (r2 == r1) goto L_0x001a
            int r2 = r0.f23108c
            if (r2 >= r1) goto L_0x000f
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x0011
        L_0x000f:
            r2 = 33
        L_0x0011:
            int r4 = r0.f23108c
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r4 = r0.m16701b(r4)
            r0.f23108c = r1
            goto L_0x001c
        L_0x001a:
            r2 = 2
            r4 = 0
        L_0x001c:
            android.support.v4.view.PagerAdapter r1 = r0.f23107b
            if (r1 != 0) goto L_0x0024
            r17.m16707d()
            return
        L_0x0024:
            boolean r1 = r0.f23073C
            if (r1 == 0) goto L_0x002c
            r17.m16707d()
            return
        L_0x002c:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0033
            return
        L_0x0033:
            android.support.v4.view.PagerAdapter r1 = r0.f23107b
            r1.startUpdate(r0)
            int r1 = r0.f23074D
            int r5 = r0.f23108c
            int r5 = r5 - r1
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            android.support.v4.view.PagerAdapter r7 = r0.f23107b
            int r7 = r7.getCount()
            int r8 = r7 + -1
            int r9 = r0.f23108c
            int r9 = r9 + r1
            int r1 = java.lang.Math.min(r8, r9)
            int r8 = r0.f23112h
            if (r7 != r8) goto L_0x0222
            r8 = 0
        L_0x0056:
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r9 = r0.f23113k
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x0076
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r9 = r0.f23113k
            java.lang.Object r9 = r9.get(r8)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r9 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C8474b) r9
            int r10 = r9.f23147b
            int r11 = r0.f23108c
            if (r10 < r11) goto L_0x0073
            int r10 = r9.f23147b
            int r11 = r0.f23108c
            if (r10 != r11) goto L_0x0076
            goto L_0x0077
        L_0x0073:
            int r8 = r8 + 1
            goto L_0x0056
        L_0x0076:
            r9 = 0
        L_0x0077:
            if (r9 != 0) goto L_0x0081
            if (r7 <= 0) goto L_0x0081
            int r9 = r0.f23108c
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r9 = r0.m16687a(r9, r8)
        L_0x0081:
            if (r9 == 0) goto L_0x01a1
            int r11 = r8 + -1
            if (r11 < 0) goto L_0x0090
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r12 = r0.f23113k
            java.lang.Object r12 = r12.get(r11)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r12 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C8474b) r12
            goto L_0x0091
        L_0x0090:
            r12 = 0
        L_0x0091:
            int r13 = r17.getClientHeight()
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 > 0) goto L_0x009b
            r3 = 0
            goto L_0x00a7
        L_0x009b:
            float r15 = r9.f23149d
            float r15 = r14 - r15
            int r3 = r17.getPaddingLeft()
            float r3 = (float) r3
            float r6 = (float) r13
            float r3 = r3 / r6
            float r3 = r3 + r15
        L_0x00a7:
            int r6 = r0.f23108c
            int r6 = r6 + -1
            r15 = r11
            r11 = r8
            r8 = 0
        L_0x00ae:
            if (r6 < 0) goto L_0x010c
            int r16 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00db
            if (r6 >= r5) goto L_0x00db
            if (r12 == 0) goto L_0x010c
            int r10 = r12.f23147b
            if (r6 != r10) goto L_0x0109
            boolean r10 = r12.f23148c
            if (r10 != 0) goto L_0x0109
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r10 = r0.f23113k
            r10.remove(r15)
            android.support.v4.view.PagerAdapter r10 = r0.f23107b
            java.lang.Object r12 = r12.f23146a
            r10.destroyItem(r0, r6, r12)
            int r15 = r15 + -1
            int r11 = r11 + -1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r10 = r0.f23113k
            java.lang.Object r10 = r10.get(r15)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r10 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C8474b) r10
            goto L_0x0108
        L_0x00db:
            if (r12 == 0) goto L_0x00f1
            int r10 = r12.f23147b
            if (r6 != r10) goto L_0x00f1
            float r10 = r12.f23149d
            float r8 = r8 + r10
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r10 = r0.f23113k
            java.lang.Object r10 = r10.get(r15)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r10 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C8474b) r10
            goto L_0x0108
        L_0x00f1:
            int r10 = r15 + 1
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r10 = r0.m16687a(r6, r10)
            float r10 = r10.f23149d
            float r8 = r8 + r10
            int r11 = r11 + 1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r10 = r0.f23113k
            java.lang.Object r10 = r10.get(r15)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r10 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C8474b) r10
            goto L_0x0108
        L_0x0107:
            r10 = 0
        L_0x0108:
            r12 = r10
        L_0x0109:
            int r6 = r6 + -1
            goto L_0x00ae
        L_0x010c:
            float r3 = r9.f23149d
            int r5 = r11 + 1
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x019e
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f23113k
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0125
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f23113k
            java.lang.Object r6 = r6.get(r5)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C8474b) r6
            goto L_0x0126
        L_0x0125:
            r6 = 0
        L_0x0126:
            if (r13 > 0) goto L_0x012a
            r10 = 0
            goto L_0x0133
        L_0x012a:
            int r8 = r17.getPaddingRight()
            float r8 = (float) r8
            float r10 = (float) r13
            float r8 = r8 / r10
            float r10 = r8 + r14
        L_0x0133:
            int r8 = r0.f23108c
        L_0x0135:
            int r8 = r8 + 1
            if (r8 >= r7) goto L_0x019e
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0168
            if (r8 <= r1) goto L_0x0168
            if (r6 == 0) goto L_0x019e
            int r12 = r6.f23147b
            if (r8 != r12) goto L_0x019d
            boolean r12 = r6.f23148c
            if (r12 != 0) goto L_0x019d
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r12 = r0.f23113k
            r12.remove(r5)
            android.support.v4.view.PagerAdapter r12 = r0.f23107b
            java.lang.Object r6 = r6.f23146a
            r12.destroyItem(r0, r8, r6)
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f23113k
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f23113k
            java.lang.Object r6 = r6.get(r5)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C8474b) r6
            goto L_0x019d
        L_0x0166:
            r6 = 0
            goto L_0x019d
        L_0x0168:
            if (r6 == 0) goto L_0x0184
            int r12 = r6.f23147b
            if (r8 != r12) goto L_0x0184
            float r6 = r6.f23149d
            float r3 = r3 + r6
            int r5 = r5 + 1
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f23113k
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f23113k
            java.lang.Object r6 = r6.get(r5)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C8474b) r6
            goto L_0x019d
        L_0x0184:
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = r0.m16687a(r8, r5)
            int r5 = r5 + 1
            float r6 = r6.f23149d
            float r3 = r3 + r6
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f23113k
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b> r6 = r0.f23113k
            java.lang.Object r6 = r6.get(r5)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C8474b) r6
        L_0x019d:
            goto L_0x0135
        L_0x019e:
            r0.m16698a(r9, r11, r4)
        L_0x01a1:
            android.support.v4.view.PagerAdapter r1 = r0.f23107b
            int r3 = r0.f23108c
            if (r9 == 0) goto L_0x01aa
            java.lang.Object r4 = r9.f23146a
            goto L_0x01ab
        L_0x01aa:
            r4 = 0
        L_0x01ab:
            r1.setPrimaryItem(r0, r3, r4)
            android.support.v4.view.PagerAdapter r1 = r0.f23107b
            r1.finishUpdate(r0)
            int r1 = r17.getChildCount()
            r3 = 0
        L_0x01b8:
            if (r3 >= r1) goto L_0x01e4
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$LayoutParams r5 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.LayoutParams) r5
            r5.f23142f = r3
            boolean r6 = r5.f23137a
            if (r6 != 0) goto L_0x01e0
            float r6 = r5.f23139c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x01e1
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r4 = r0.m16688a(r4)
            if (r4 == 0) goto L_0x01e1
            float r6 = r4.f23149d
            r5.f23139c = r6
            int r4 = r4.f23147b
            r5.f23141e = r4
            goto L_0x01e1
        L_0x01e0:
            r7 = 0
        L_0x01e1:
            int r3 = r3 + 1
            goto L_0x01b8
        L_0x01e4:
            r17.m16707d()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0221
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01f8
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r3 = r0.m16702b(r1)
            goto L_0x01f9
        L_0x01f8:
            r3 = 0
        L_0x01f9:
            if (r3 == 0) goto L_0x0201
            int r1 = r3.f23147b
            int r3 = r0.f23108c
            if (r1 == r3) goto L_0x0221
        L_0x0201:
            r1 = 0
        L_0x0202:
            int r3 = r17.getChildCount()
            if (r1 >= r3) goto L_0x0221
            android.view.View r3 = r0.getChildAt(r1)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b r4 = r0.m16688a(r3)
            if (r4 == 0) goto L_0x021e
            int r4 = r4.f23147b
            int r5 = r0.f23108c
            if (r4 != r5) goto L_0x021e
            boolean r3 = r3.requestFocus(r2)
            if (r3 != 0) goto L_0x0221
        L_0x021e:
            int r1 = r1 + 1
            goto L_0x0202
        L_0x0221:
            return
        L_0x0222:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x022f }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x022f }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x022f }
            goto L_0x0237
        L_0x022f:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0237:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.f23112h
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            android.support.v4.view.PagerAdapter r1 = r0.f23107b
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.m16689a(int):void");
    }

    /* renamed from: a */
    private static void m16696a(PagerAdapter pagerAdapter, C8478f fVar) {
        try {
            f23068g.set(pagerAdapter, fVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f23103aj == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.f23104ak.get(i2)).getLayoutParams()).f23142f;
    }

    /* renamed from: a */
    private C8474b m16687a(int i, int i2) {
        C8474b bVar = new C8474b();
        bVar.f23147b = i;
        bVar.f23146a = this.f23107b.instantiateItem((ViewGroup) this, i);
        bVar.f23149d = this.f23107b.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f23113k.size()) {
            this.f23113k.add(bVar);
        } else {
            this.f23113k.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                C8474b a = m16688a(childAt);
                if (a != null && a.f23147b == this.f23108c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    /* renamed from: a */
    private Rect m16686a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public LiveVerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16705c();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r17
            int r2 = getDefaultSize(r1, r2)
            r3 = r18
            int r3 = getDefaultSize(r1, r3)
            r0.setMeasuredDimension(r2, r3)
            int r2 = r16.getMeasuredHeight()
            int r3 = r2 / 10
            int r4 = r0.f23077G
            int r3 = java.lang.Math.min(r3, r4)
            r0.f23078H = r3
            int r3 = r16.getMeasuredWidth()
            int r4 = r16.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r16.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r16.getPaddingTop()
            int r2 = r2 - r4
            int r4 = r16.getPaddingBottom()
            int r2 = r2 - r4
            int r4 = r16.getChildCount()
            r5 = r2
            r2 = 0
        L_0x003e:
            r6 = 8
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r4) goto L_0x00c5
            android.view.View r9 = r0.getChildAt(r2)
            int r10 = r9.getVisibility()
            if (r10 == r6) goto L_0x00c0
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$LayoutParams r6 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.LayoutParams) r6
            if (r6 == 0) goto L_0x00c0
            boolean r10 = r6.f23137a
            if (r10 == 0) goto L_0x00c0
            int r10 = r6.f23138b
            r10 = r10 & 7
            int r11 = r6.f23138b
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r11 == r12) goto L_0x006e
            r12 = 80
            if (r11 != r12) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r11 = 0
            goto L_0x006f
        L_0x006e:
            r11 = 1
        L_0x006f:
            r12 = 3
            if (r10 == r12) goto L_0x0077
            r12 = 5
            if (r10 != r12) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x0080
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x007d:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0084
        L_0x0080:
            if (r7 == 0) goto L_0x007d
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0084:
            int r13 = r6.width
            r14 = -1
            r15 = -2
            if (r13 == r15) goto L_0x0096
            int r10 = r6.width
            if (r10 == r14) goto L_0x0092
            int r10 = r6.width
            r13 = r10
            goto L_0x0093
        L_0x0092:
            r13 = r3
        L_0x0093:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0097
        L_0x0096:
            r13 = r3
        L_0x0097:
            int r1 = r6.height
            if (r1 == r15) goto L_0x00a4
            int r1 = r6.height
            if (r1 == r14) goto L_0x00a2
            int r1 = r6.height
            goto L_0x00a6
        L_0x00a2:
            r1 = r5
            goto L_0x00a6
        L_0x00a4:
            r1 = r5
            r8 = r12
        L_0x00a6:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r9.measure(r6, r1)
            if (r11 == 0) goto L_0x00b9
            int r1 = r9.getMeasuredHeight()
            int r5 = r5 - r1
            goto L_0x00c0
        L_0x00b9:
            if (r7 == 0) goto L_0x00c0
            int r1 = r9.getMeasuredWidth()
            int r3 = r3 - r1
        L_0x00c0:
            int r2 = r2 + 1
            r1 = 0
            goto L_0x003e
        L_0x00c5:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r0.f23127y = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r0.f23128z = r1
            r0.f23071A = r7
            r16.mo14785b()
            r1 = 0
            r0.f23071A = r1
            int r2 = r16.getChildCount()
        L_0x00dd:
            if (r1 >= r2) goto L_0x0107
            android.view.View r3 = r0.getChildAt(r1)
            int r4 = r3.getVisibility()
            if (r4 == r6) goto L_0x0104
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$LayoutParams r4 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.LayoutParams) r4
            if (r4 == 0) goto L_0x00f5
            boolean r7 = r4.f23137a
            if (r7 != 0) goto L_0x0104
        L_0x00f5:
            float r7 = (float) r5
            float r4 = r4.f23139c
            float r7 = r7 * r4
            int r4 = (int) r7
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r8)
            int r7 = r0.f23127y
            r3.measure(r7, r4)
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x00dd
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m16694a(int i, boolean z, boolean z2) {
        m16695a(i, z, z2, 0);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f23137a |= view instanceof C8473a;
        if (!this.f23071A) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f23137a) {
            layoutParams2.f23140d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C8474b a = m16688a(childAt);
                    if (a != null && a.f23147b == this.f23108c) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16690a(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f23097ad
            r1 = 0
            if (r0 <= 0) goto L_0x006f
            int r0 = r11.getScrollY()
            int r2 = r11.getPaddingTop()
            int r3 = r11.getPaddingBottom()
            int r4 = r11.getHeight()
            int r5 = r11.getChildCount()
            r6 = r3
            r3 = r2
            r2 = 0
        L_0x001c:
            if (r2 >= r5) goto L_0x006f
            android.view.View r7 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$LayoutParams r8 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.LayoutParams) r8
            boolean r9 = r8.f23137a
            if (r9 == 0) goto L_0x006c
            int r8 = r8.f23138b
            r8 = r8 & 112(0x70, float:1.57E-43)
            r9 = 16
            if (r8 == r9) goto L_0x0051
            r9 = 48
            if (r8 == r9) goto L_0x004b
            r9 = 80
            if (r8 == r9) goto L_0x003e
            r8 = r3
            goto L_0x0060
        L_0x003e:
            int r8 = r4 - r6
            int r9 = r7.getMeasuredHeight()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredHeight()
            int r6 = r6 + r9
            goto L_0x005d
        L_0x004b:
            int r8 = r7.getHeight()
            int r8 = r8 + r3
            goto L_0x0060
        L_0x0051:
            int r8 = r7.getMeasuredHeight()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r3)
        L_0x005d:
            r10 = r8
            r8 = r3
            r3 = r10
        L_0x0060:
            int r3 = r3 + r0
            int r9 = r7.getTop()
            int r3 = r3 - r9
            if (r3 == 0) goto L_0x006b
            r7.offsetTopAndBottom(r3)
        L_0x006b:
            r3 = r8
        L_0x006c:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x006f:
            android.support.v4.view.ViewPager$e r0 = r11.f23098ae
            if (r0 == 0) goto L_0x0078
            android.support.v4.view.ViewPager$e r0 = r11.f23098ae
            r0.onPageScrolled(r12, r13, r14)
        L_0x0078:
            android.support.v4.view.ViewPager$e r0 = r11.f23099af
            if (r0 == 0) goto L_0x0081
            android.support.v4.view.ViewPager$e r0 = r11.f23099af
            r0.onPageScrolled(r12, r13, r14)
        L_0x0081:
            android.support.v4.view.ViewPager$f r12 = r11.f23101ah
            if (r12 == 0) goto L_0x00b1
            int r12 = r11.getScrollY()
            int r13 = r11.getChildCount()
        L_0x008d:
            if (r1 >= r13) goto L_0x00b1
            android.view.View r14 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager$LayoutParams r0 = (com.bytedance.android.livesdk.widget.LiveVerticalViewPager.LayoutParams) r0
            boolean r0 = r0.f23137a
            if (r0 != 0) goto L_0x00ae
            int r0 = r14.getTop()
            int r0 = r0 - r12
            float r0 = (float) r0
            int r2 = r11.getClientHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            android.support.v4.view.ViewPager$f r2 = r11.f23101ah
            r2.mo3111a(r14, r0)
        L_0x00ae:
            int r1 = r1 + 1
            goto L_0x008d
        L_0x00b1:
            r12 = 1
            r11.f23096ac = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.m16690a(int, float, int):void");
    }

    /* renamed from: a */
    private void m16691a(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.f23109d == null || this.f23109d.isFinished()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f23119q) {
                i4 = this.f23109d.getCurrY();
            } else {
                i4 = this.f23109d.getStartY();
            }
            this.f23109d.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollY();
        }
        int i6 = i4;
        int scrollX = getScrollX();
        int i7 = 0 - scrollX;
        int i8 = i2 - i6;
        if (i7 == 0 && i8 == 0) {
            m16699a(false);
            mo14785b();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i9 = clientHeight / 2;
        float f = (float) clientHeight;
        float f2 = (float) i9;
        float a = f2 + (m16685a(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f23107b.getPageWidth(this.f23108c)) + ((float) this.f23121s))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f23119q = false;
        this.f23109d.startScroll(scrollX, i6, i7, i8, min);
        C1056u.m3052d(this);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            m16692a(i2, i4, this.f23121s, this.f23121s);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollY = getScrollY();
        int i9 = paddingRight;
        int i10 = 0;
        int i11 = paddingLeft;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f23137a) {
                    int i13 = layoutParams.f23138b & 7;
                    int i14 = layoutParams.f23138b & 112;
                    if (i13 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i11);
                    } else if (i13 == 3) {
                        i5 = i11;
                        i11 = childAt.getMeasuredWidth() + i11;
                    } else if (i13 != 5) {
                        i5 = i11;
                    } else {
                        i5 = (i7 - i9) - childAt.getMeasuredWidth();
                        i9 += childAt.getMeasuredWidth();
                    }
                    if (i14 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    } else if (i14 == 48) {
                        i6 = paddingTop;
                        paddingTop = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i14 != 80) {
                        i6 = paddingTop;
                    } else {
                        i6 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                    }
                    int i15 = i6 + scrollY;
                    childAt.layout(i5, i15, childAt.getMeasuredWidth() + i5, i15 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i16 = (i8 - paddingTop) - paddingBottom;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                C8474b a = m16688a(childAt2);
                if (!layoutParams2.f23137a && a != null) {
                    float f = (float) i16;
                    int i18 = ((int) (a.f23150e * f)) + paddingTop;
                    if (layoutParams2.f23140d) {
                        layoutParams2.f23140d = false;
                        childAt2.measure(MeasureSpec.makeMeasureSpec((i7 - i11) - i9, 1073741824), MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f23139c), 1073741824));
                    }
                    childAt2.layout(i11, i18, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + i18);
                }
            }
        }
        this.f23123u = i11;
        this.f23124v = i7 - i9;
        this.f23097ad = i10;
        if (this.f23094aa) {
            z2 = false;
            m16693a(this.f23108c, false, 0, false);
        } else {
            z2 = false;
        }
        this.f23094aa = z2;
    }
}
