package com.p683ss.android.ugc.aweme.common.widget;

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
import android.os.SystemClock;
import android.support.p030v4.p040os.C0965e;
import android.support.p030v4.p040os.C0967f;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1018ac;
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
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.feed.experiment.C30220a;
import com.p683ss.android.ugc.aweme.feed.helper.C30368h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager */
public class VerticalViewPager extends BaseVerticalViewPager {

    /* renamed from: a */
    public static final int[] f70957a = {16842931};

    /* renamed from: aw */
    private static final C26962g f70958aw = new C26962g();

    /* renamed from: b */
    public static final Interpolator f70959b = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: t */
    static Field f70960t;

    /* renamed from: w */
    private static final Comparator<C26957b> f70961w = new Comparator<C26957b>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C26957b) obj).f71045b - ((C26957b) obj2).f71045b;
        }
    };

    /* renamed from: A */
    private int f70962A;

    /* renamed from: B */
    private Parcelable f70963B;

    /* renamed from: C */
    private ClassLoader f70964C;

    /* renamed from: D */
    private Scroller f70965D;

    /* renamed from: E */
    private boolean f70966E;

    /* renamed from: F */
    private C26961f f70967F;

    /* renamed from: G */
    private int f70968G;

    /* renamed from: H */
    private Drawable f70969H;

    /* renamed from: I */
    private int f70970I;

    /* renamed from: J */
    private int f70971J;

    /* renamed from: K */
    private float f70972K;

    /* renamed from: L */
    private float f70973L;

    /* renamed from: M */
    private int f70974M;

    /* renamed from: N */
    private int f70975N;

    /* renamed from: O */
    private boolean f70976O;

    /* renamed from: P */
    private boolean f70977P;

    /* renamed from: Q */
    private boolean f70978Q;

    /* renamed from: R */
    private int f70979R;

    /* renamed from: S */
    private boolean f70980S;

    /* renamed from: T */
    private boolean f70981T;

    /* renamed from: U */
    private int f70982U;

    /* renamed from: V */
    private int f70983V;

    /* renamed from: W */
    private int f70984W;

    /* renamed from: aa */
    private float f70985aa;

    /* renamed from: ab */
    private float f70986ab;

    /* renamed from: ac */
    private float f70987ac;

    /* renamed from: ad */
    private float f70988ad;

    /* renamed from: ae */
    private int f70989ae;

    /* renamed from: af */
    private VelocityTracker f70990af;

    /* renamed from: ag */
    private int f70991ag;

    /* renamed from: ah */
    private int f70992ah;

    /* renamed from: ai */
    private int f70993ai;

    /* renamed from: aj */
    private int f70994aj;

    /* renamed from: ak */
    private boolean f70995ak;

    /* renamed from: al */
    private long f70996al;

    /* renamed from: am */
    private C1109i f70997am;

    /* renamed from: an */
    private C1109i f70998an;

    /* renamed from: ao */
    private boolean f70999ao;

    /* renamed from: ap */
    private boolean f71000ap;

    /* renamed from: aq */
    private boolean f71001aq;

    /* renamed from: ar */
    private int f71002ar;

    /* renamed from: as */
    private C0997e f71003as;

    /* renamed from: at */
    private C26959d f71004at;

    /* renamed from: au */
    private Method f71005au;

    /* renamed from: av */
    private ArrayList<View> f71006av;

    /* renamed from: ax */
    private final Runnable f71007ax;

    /* renamed from: ay */
    private int f71008ay;

    /* renamed from: az */
    private boolean f71009az;

    /* renamed from: c */
    public PagerAdapter f71010c;

    /* renamed from: d */
    public int f71011d;

    /* renamed from: e */
    public List<C0997e> f71012e;

    /* renamed from: f */
    public C0998f f71013f;

    /* renamed from: g */
    public int f71014g;

    /* renamed from: h */
    public C26960e f71015h;

    /* renamed from: i */
    int f71016i;

    /* renamed from: j */
    int f71017j;

    /* renamed from: k */
    final C52670a<String> f71018k;

    /* renamed from: l */
    int f71019l;

    /* renamed from: m */
    boolean f71020m;

    /* renamed from: n */
    final C52670a<String> f71021n;

    /* renamed from: o */
    final C52670a<String> f71022o;

    /* renamed from: p */
    final C52670a<String> f71023p;

    /* renamed from: q */
    final C52670a<String> f71024q;

    /* renamed from: r */
    final C52670a<String> f71025r;

    /* renamed from: s */
    final C52670a<String> f71026s;

    /* renamed from: u */
    private boolean f71027u;

    /* renamed from: v */
    private int f71028v;

    /* renamed from: x */
    private final ArrayList<C26957b> f71029x;

    /* renamed from: y */
    private final C26957b f71030y;

    /* renamed from: z */
    private final Rect f71031z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f71035a;

        /* renamed from: b */
        public int f71036b;

        /* renamed from: c */
        float f71037c;

        /* renamed from: d */
        boolean f71038d;

        /* renamed from: e */
        int f71039e;

        /* renamed from: f */
        int f71040f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f70957a);
            this.f71036b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$SavedState */
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
        int f71041a;

        /* renamed from: b */
        Parcelable f71042b;

        /* renamed from: c */
        ClassLoader f71043c;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f71041a);
            sb.append("}");
            return sb.toString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f71041a);
            parcel.writeParcelable(this.f71042b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f71041a = parcel.readInt();
            this.f71042b = parcel.readParcelable(classLoader);
            this.f71043c = classLoader;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$a */
    interface C26956a {
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b */
    static class C26957b {

        /* renamed from: a */
        Object f71044a;

        /* renamed from: b */
        int f71045b;

        /* renamed from: c */
        boolean f71046c;

        /* renamed from: d */
        float f71047d;

        /* renamed from: e */
        float f71048e;

        C26957b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c */
    class C26958c extends C1002a {
        /* renamed from: a */
        private boolean m65123a() {
            if (VerticalViewPager.this.f71010c == null || VerticalViewPager.this.f71010c.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C26958c() {
        }

        /* renamed from: a */
        public final void mo1119a(View view, C1008c cVar) {
            super.mo1119a(view, cVar);
            cVar.mo3139b((CharSequence) ViewPager.class.getName());
            cVar.mo3164j(m65123a());
            if (VerticalViewPager.this.canScrollVertically(1)) {
                cVar.mo3130a(4096);
            }
            if (VerticalViewPager.this.canScrollVertically(-1)) {
                cVar.mo3130a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
            }
        }

        /* renamed from: a */
        public final void mo1322a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1322a(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C1015e a = C1015e.m2926a();
            a.mo3175a(m65123a());
            if (accessibilityEvent.getEventType() == 4096 && VerticalViewPager.this.f71010c != null) {
                a.mo3174a(VerticalViewPager.this.f71010c.getCount());
                a.mo3176b(VerticalViewPager.this.f71011d);
                a.mo3177c(VerticalViewPager.this.f71011d);
            }
        }

        /* renamed from: a */
        public final boolean mo1246a(View view, int i, Bundle bundle) {
            if (super.mo1246a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !VerticalViewPager.this.canScrollVertically(-1)) {
                    return false;
                }
                VerticalViewPager.this.setCurrentItem(VerticalViewPager.this.f71011d - 1);
                return true;
            } else if (!VerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                VerticalViewPager.this.setCurrentItem(VerticalViewPager.this.f71011d + 1);
                return true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$d */
    public interface C26959d {
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$e */
    public interface C26960e {
        /* renamed from: a */
        int mo55067a(int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo55068a();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$f */
    class C26961f extends DataSetObserver {
        public final void onChanged() {
            VerticalViewPager.this.mo55020e();
        }

        public final void onInvalidated() {
            VerticalViewPager.this.mo55020e();
        }

        private C26961f() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$g */
    static class C26962g implements Comparator<View> {
        C26962g() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
            if (layoutParams.f71035a == layoutParams2.f71035a) {
                i = layoutParams.f71039e - layoutParams2.f71039e;
            } else if (!layoutParams.f71035a) {
                return -1;
            } else {
                i = 1;
            }
            return i;
        }
    }

    /* renamed from: j */
    static final /* synthetic */ String m65096j() {
        return "VerticalViewPager after draw";
    }

    /* renamed from: k */
    static final /* synthetic */ String m65097k() {
        return "VerticalViewPager before draw";
    }

    /* renamed from: l */
    static final /* synthetic */ String m65098l() {
        return "VerticalViewPager draw start for overScrollMode end!";
    }

    /* renamed from: a */
    public final boolean mo54893a() {
        return this.f71009az;
    }

    /* renamed from: b */
    public final boolean mo55009b() {
        return this.f70995ak;
    }

    public PagerAdapter getAdapter() {
        return this.f71010c;
    }

    public int getCurrentItem() {
        return this.f71011d;
    }

    public int getExpectedAdapterCount() {
        return this.f71028v;
    }

    public int getOffscreenPageLimit() {
        return this.f70979R;
    }

    public int getPageMargin() {
        return this.f70968G;
    }

    public int getScrollState() {
        return this.f71008ay;
    }

    /* renamed from: a */
    public final void mo55005a(int i, boolean z, boolean z2, int i2) {
        if (this.f71010c == null || this.f71010c.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f71011d != i || this.f71029x.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f71010c.getCount()) {
                i = this.f71010c.getCount() - 1;
            }
            int i3 = this.f70979R;
            if (i > this.f71011d + i3 || i < this.f71011d - i3) {
                for (int i4 = 0; i4 < this.f71029x.size(); i4++) {
                    ((C26957b) this.f71029x.get(i4)).f71046c = true;
                }
            }
            if (this.f71011d == i) {
                z3 = false;
            }
            if (this.f70999ao) {
                this.f71011d = i;
                if (z3 && this.f71012e != null && !this.f71012e.isEmpty()) {
                    for (C0997e onPageSelected : this.f71012e) {
                        onPageSelected.onPageSelected(i);
                    }
                }
                if (z3 && this.f71003as != null) {
                    this.f71003as.onPageSelected(i);
                }
                requestLayout();
                return;
            }
            m65078a(i);
            m65082a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m65082a(int i, boolean z, int i2, boolean z2) {
        C26957b b = m65090b(i);
        int clientHeight = b != null ? (int) (((float) getClientHeight()) * Math.max(this.f70972K, Math.min(b.f71048e, this.f70973L))) : 0;
        if (z) {
            m65080a(0, clientHeight, i2);
            if (z2 && this.f71012e != null && !this.f71012e.isEmpty()) {
                for (C0997e onPageSelected : this.f71012e) {
                    onPageSelected.onPageSelected(i);
                }
            }
            if (z2 && this.f71003as != null) {
                this.f71003as.onPageSelected(i);
            }
        } else {
            if (z2 && this.f71012e != null && !this.f71012e.isEmpty()) {
                for (C0997e onPageSelected2 : this.f71012e) {
                    onPageSelected2.onPageSelected(i);
                }
            }
            if (z2 && this.f71003as != null) {
                this.f71003as.onPageSelected(i);
            }
            m65087a(false);
            scrollTo(0, clientHeight);
            m65094c(clientHeight);
        }
    }

    /* renamed from: a */
    public final void mo54890a(C0997e eVar) {
        if (eVar != null) {
            this.f71012e.add(eVar);
        }
    }

    /* renamed from: a */
    private void m65080a(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.f70965D != null && !this.f70965D.isFinished()) {
            i4 = this.f70966E ? this.f70965D.getCurrY() : this.f70965D.getStartY();
            this.f70965D.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollY();
        }
        int i6 = i4;
        int scrollX = getScrollX();
        int i7 = 0 - scrollX;
        int i8 = i2 - i6;
        if (i7 == 0 && i8 == 0) {
            m65087a(false);
            mo55021f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i9 = clientHeight / 2;
        float f = (float) clientHeight;
        float f2 = (float) i9;
        float b = f2 + (m65089b(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f71010c.getPageWidth(this.f71011d)) + ((float) this.f70968G))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f70966E = false;
        this.f70965D.startScroll(scrollX, i6, i7, i8, min);
        C1056u.m3052d(this);
    }

    /* renamed from: a */
    private void m65086a(C26957b bVar, int i, C26957b bVar2) {
        C26957b bVar3;
        C26957b bVar4;
        int count = this.f71010c.getCount();
        int clientHeight = getClientHeight();
        float f = clientHeight > 0 ? ((float) this.f70968G) / ((float) clientHeight) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f71045b;
            if (i2 < bVar.f71045b) {
                float f2 = bVar2.f71048e + bVar2.f71047d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f71045b && i4 < this.f71029x.size()) {
                    Object obj = this.f71029x.get(i4);
                    while (true) {
                        bVar4 = (C26957b) obj;
                        if (i3 > bVar4.f71045b && i4 < this.f71029x.size() - 1) {
                            i4++;
                            obj = this.f71029x.get(i4);
                        }
                    }
                    while (i3 < bVar4.f71045b) {
                        f2 += this.f71010c.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f71048e = f2;
                    f2 += bVar4.f71047d + f;
                    i3++;
                }
            } else if (i2 > bVar.f71045b) {
                int size = this.f71029x.size() - 1;
                float f3 = bVar2.f71048e;
                while (true) {
                    i2--;
                    if (i2 < bVar.f71045b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f71029x.get(size);
                    while (true) {
                        bVar3 = (C26957b) obj2;
                        if (i2 < bVar3.f71045b && size > 0) {
                            size--;
                            obj2 = this.f71029x.get(size);
                        }
                    }
                    while (i2 > bVar3.f71045b) {
                        f3 -= this.f71010c.getPageWidth(i2) + f;
                        i2--;
                    }
                    f3 -= bVar3.f71047d + f;
                    bVar3.f71048e = f3;
                }
            }
        }
        int size2 = this.f71029x.size();
        float f4 = bVar.f71048e;
        int i5 = bVar.f71045b - 1;
        this.f70972K = bVar.f71045b == 0 ? bVar.f71048e : -3.4028235E38f;
        int i6 = count - 1;
        this.f70973L = bVar.f71045b == i6 ? (bVar.f71048e + bVar.f71047d) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            C26957b bVar5 = (C26957b) this.f71029x.get(i7);
            while (i5 > bVar5.f71045b) {
                f4 -= this.f71010c.getPageWidth(i5) + f;
                i5--;
            }
            f4 -= bVar5.f71047d + f;
            bVar5.f71048e = f4;
            if (bVar5.f71045b == 0) {
                this.f70972K = f4;
            }
            i7--;
            i5--;
        }
        float f5 = bVar.f71048e + bVar.f71047d + f;
        int i8 = bVar.f71045b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C26957b bVar6 = (C26957b) this.f71029x.get(i9);
            while (i8 < bVar6.f71045b) {
                f5 += this.f71010c.getPageWidth(i8) + f;
                i8++;
            }
            if (bVar6.f71045b == i6) {
                this.f70973L = (bVar6.f71047d + f5) - 1.0f;
            }
            bVar6.f71048e = f5;
            f5 += bVar6.f71047d + f;
            i9++;
            i8++;
        }
        this.f71000ap = false;
    }

    /* renamed from: a */
    private void m65081a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f71029x.isEmpty()) {
            C26957b b = m65090b(this.f71011d);
            int min = (int) ((b != null ? Math.min(b.f71048e, this.f70973L) : 0.0f) * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                m65087a(false);
                scrollTo(getScrollX(), min);
            }
        } else if (!this.f70965D.isFinished()) {
            int clientHeight = getClientHeight();
            if (C27011w.m65223a()) {
                int finalY = this.f70965D.getFinalY() / i2;
                int i5 = clientHeight * finalY;
                StringBuilder sb = new StringBuilder("getCurItem = ");
                sb.append(getCurrentItem());
                sb.append("finalY = ");
                sb.append(getClientHeight() * getCurrentItem());
                sb.append("trueCount = ");
                sb.append(finalY);
                sb.append("newY = ");
                sb.append(i5);
                C32458a.m75141a(4, "VerticalViewPager", sb.toString());
                this.f70965D.setFinalY(i5);
            } else {
                C32458a.m75141a(4, "VerticalViewPager", "use origin logic");
                this.f70965D.setFinalY(getCurrentItem() * clientHeight);
            }
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))) * ((float) (((i - getPaddingTop()) - getPaddingBottom()) + i3))));
        }
    }

    /* renamed from: a */
    private void m65087a(boolean z) {
        boolean z2 = this.f71008ay == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f70965D.isFinished()) {
                this.f70965D.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f70965D.getCurrX();
                int currY = this.f70965D.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        m65094c(currY);
                    }
                }
            } else if (this.f70965D.getCurrY() != getScrollY()) {
                try {
                    StringBuilder sb = new StringBuilder("realY:");
                    sb.append(getScrollY());
                    sb.append(",expectY:");
                    sb.append(this.f70965D.getCurrY());
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder("try fix->");
                    sb3.append(sb2);
                    C32458a.m75141a(5, "VerticalViewPager", sb3.toString());
                } catch (Exception e) {
                    C30220a.f78947a.mo60570c(new C26977k(e));
                    C9220a.m18311a((Throwable) e);
                    C32458a.m75143a(e);
                }
                scrollTo(this.f70965D.getCurrX(), this.f70965D.getCurrY());
            }
        }
        this.f70978Q = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f71029x.size(); i++) {
            C26957b bVar = (C26957b) this.f71029x.get(i);
            if (bVar.f71046c) {
                bVar.f71046c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C1056u.m3034a((View) this, this.f71007ax);
                return;
            }
            this.f71007ax.run();
        }
    }

    /* renamed from: a */
    public final void mo55003a(float f) {
        if (!this.f70995ak) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f71010c != null) {
            try {
                this.f70986ab += f;
                float scrollY = ((float) getScrollY()) - f;
                float clientHeight = (float) getClientHeight();
                float f2 = this.f70972K * clientHeight;
                float f3 = this.f70973L * clientHeight;
                C26957b bVar = (C26957b) this.f71029x.get(0);
                C26957b bVar2 = (C26957b) this.f71029x.get(this.f71029x.size() - 1);
                if (bVar.f71045b != 0) {
                    f2 = bVar.f71048e * clientHeight;
                }
                if (bVar2.f71045b != this.f71010c.getCount() - 1) {
                    f3 = bVar2.f71048e * clientHeight;
                }
                if (scrollY < f2) {
                    scrollY = f2;
                } else if (scrollY > f3) {
                    scrollY = f3;
                }
                int i = (int) scrollY;
                this.f70986ab += scrollY - ((float) i);
                scrollTo(getScrollX(), i);
                m65094c(i);
                MotionEvent obtain = MotionEvent.obtain(this.f70996al, SystemClock.uptimeMillis(), 2, 0.0f, this.f70986ab, 0);
                if (this.f70990af == null) {
                    this.f70990af = VelocityTracker.obtain();
                }
                if (this.f70990af != null) {
                    this.f70990af.addMovement(obtain);
                    obtain.recycle();
                }
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                C9220a.m18312a((Throwable) e, "VerticalViewPager");
            }
        }
    }

    /* renamed from: a */
    private void m65085a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f70989ae) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f70986ab = motionEvent.getY(i);
            this.f70989ae = motionEvent.getPointerId(i);
            if (this.f70990af != null) {
                this.f70990af.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m65088a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        if (view2 instanceof C26964b) {
            return false;
        }
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
                        if (m65088a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
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

    /* renamed from: f */
    public final void mo55021f() {
        m65078a(this.f71011d);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f70999ao = true;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: s */
    private boolean m65104s() {
        if (this.f71011d <= 0) {
            return false;
        }
        mo55004a(this.f71011d - 1, true);
        return true;
    }

    /* renamed from: p */
    private boolean m65101p() {
        this.f70989ae = -1;
        m65103r();
        return this.f70997am.mo3562c() | this.f70998an.mo3562c();
    }

    /* renamed from: r */
    private void m65103r() {
        this.f70980S = false;
        this.f70981T = false;
        if (this.f70990af != null) {
            this.f70990af.recycle();
            this.f70990af = null;
        }
    }

    /* renamed from: t */
    private boolean m65105t() {
        if (this.f71010c == null || this.f71011d >= this.f71010c.getCount() - 1) {
            return false;
        }
        mo55004a(this.f71011d + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f70969H;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ String mo55022g() {
        StringBuilder sb = new StringBuilder("VerticalViewPager draw start for overScrollMode mBottomEdge:");
        sb.append(this.f71020m);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ String mo55031h() {
        StringBuilder sb = new StringBuilder("VerticalViewPager draw start for overScrollMode mTopEdge:");
        sb.append(this.f71020m);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ String mo55032i() {
        StringBuilder sb = new StringBuilder("VerticalViewPager draw start for overScrollMode:");
        sb.append(this.f71019l);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ String mo55033m() {
        StringBuilder sb = new StringBuilder("VerticalViewPager scrollTo:");
        sb.append(this.f71017j);
        sb.append("/");
        sb.append(this.f71016i);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f71007ax);
        if (this.f70965D != null && !this.f70965D.isFinished()) {
            this.f70965D.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f71041a = this.f71011d;
        if (this.f71010c != null) {
            savedState.f71042b = this.f71010c.saveState();
        }
        return savedState;
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f70960t = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    /* renamed from: o */
    private void m65100o() {
        if (this.f71014g != 0) {
            if (this.f71006av == null) {
                this.f71006av = new ArrayList<>();
            } else {
                this.f71006av.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f71006av.add(getChildAt(i));
            }
            Collections.sort(this.f71006av, f70958aw);
        }
    }

    /* renamed from: c */
    public final boolean mo55010c() {
        if (this.f70980S) {
            return false;
        }
        this.f70995ak = true;
        setScrollState(1);
        this.f70988ad = 0.0f;
        this.f70986ab = 0.0f;
        if (this.f70990af == null) {
            this.f70990af = VelocityTracker.obtain();
        } else {
            this.f70990af.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f70990af.addMovement(obtain);
        obtain.recycle();
        this.f70996al = uptimeMillis;
        return true;
    }

    /* renamed from: n */
    private void m65099n() {
        this.f71027u = true;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f70965D = new Scroller(context, f70959b);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f70984W = C1060v.m3090a(viewConfiguration);
        this.f70991ag = (int) (400.0f * f);
        this.f70992ah = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f70997am = new C1109i(context);
        this.f70998an = new C1109i(context);
        this.f70993ai = (int) (25.0f * f);
        this.f70994aj = (int) (2.0f * f);
        this.f70982U = (int) (f * 16.0f);
        C1056u.m3031a((View) this, (C1002a) new C26958c());
        if (C1056u.m3053e(this) == 0) {
            C1056u.m3043b((View) this, 1);
        }
        C1056u.m3032a((View) this, (C1051p) new C1051p() {

            /* renamed from: b */
            private final Rect f71034b = new Rect();

            /* renamed from: a */
            public final C1018ac mo1130a(View view, C1018ac acVar) {
                C1018ac a = C1056u.m3022a(view, acVar);
                if (a.mo3189e()) {
                    return a;
                }
                Rect rect = this.f71034b;
                rect.left = a.mo3184a();
                rect.top = a.mo3186b();
                rect.right = a.mo3187c();
                rect.bottom = a.mo3188d();
                int childCount = VerticalViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C1018ac b = C1056u.m3041b(VerticalViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo3184a(), rect.left);
                    rect.top = Math.min(b.mo3186b(), rect.top);
                    rect.right = Math.min(b.mo3187c(), rect.right);
                    rect.bottom = Math.min(b.mo3188d(), rect.bottom);
                }
                return a.mo3185a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* renamed from: q */
    private C26957b m65102q() {
        float f;
        float f2;
        int clientHeight = getClientHeight();
        if (clientHeight > 0) {
            f = ((float) getScrollY()) / ((float) clientHeight);
        } else {
            f = 0.0f;
        }
        if (clientHeight > 0) {
            f2 = ((float) this.f70968G) / ((float) clientHeight);
        } else {
            f2 = 0.0f;
        }
        C26957b bVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i < this.f71029x.size()) {
            C26957b bVar2 = (C26957b) this.f71029x.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (bVar2.f71045b != i3) {
                    bVar2 = this.f71030y;
                    bVar2.f71048e = f3 + f4 + f2;
                    bVar2.f71045b = i3;
                    bVar2.f71047d = this.f71010c.getPageWidth(bVar2.f71045b);
                    i--;
                }
            }
            f3 = bVar2.f71048e;
            float f5 = bVar2.f71047d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i == this.f71029x.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f71045b;
            f4 = bVar2.f71047d;
            i++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.f70966E = true;
        if (this.f70965D.isFinished() || !this.f70965D.computeScrollOffset()) {
            m65087a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f70965D.getCurrX();
        int currY = this.f70965D.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m65094c(currY)) {
                this.f70965D.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        C1056u.m3052d(this);
    }

    /* renamed from: d */
    public final void mo55014d() {
        if (this.f70995ak) {
            this.f70995ak = false;
            if (this.f71010c != null) {
                VelocityTracker velocityTracker = this.f70990af;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f70992ah);
                int b = (int) C1055t.m3016b(velocityTracker, this.f70989ae);
                this.f70978Q = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                C26957b q = m65102q();
                if (q != null) {
                    mo55005a(m65074a(q.f71045b, ((((float) scrollY) / ((float) clientHeight)) - q.f71048e) / q.f71047d, b, (int) (this.f70986ab - this.f70988ad)), true, true, b);
                }
            }
            m65103r();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo55020e() {
        boolean z;
        int count = this.f71010c.getCount();
        this.f71028v = count;
        if (this.f71029x.size() >= (this.f70979R * 2) + 1 || this.f71029x.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        int i = this.f71011d;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.f71029x.size()) {
            C26957b bVar = (C26957b) this.f71029x.get(i2);
            int itemPosition = this.f71010c.getItemPosition(bVar.f71044a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f71029x.remove(i2);
                    i2--;
                    if (!z3) {
                        this.f71010c.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f71010c.destroyItem((ViewGroup) this, bVar.f71045b, bVar.f71044a);
                    if (this.f71011d == bVar.f71045b) {
                        i = Math.max(0, Math.min(this.f71011d, count - 1));
                    }
                } else if (bVar.f71045b != itemPosition) {
                    if (bVar.f71045b == this.f71011d) {
                        i = itemPosition;
                    }
                    bVar.f71045b = itemPosition;
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.f71010c.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f71029x, f70961w);
        if (z2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f71035a) {
                    layoutParams.f71037c = 0.0f;
                }
            }
            m65083a(i, false, true);
            requestLayout();
        }
    }

    public void setCanTouch(boolean z) {
        this.f71027u = z;
    }

    public void setDisableScroll(boolean z) {
        this.f71009az = z;
    }

    public void setOnAdapterChangeListener(C26959d dVar) {
        this.f71004at = dVar;
    }

    public void setOnUserSwipeUpListener(C26960e eVar) {
        this.f71015h = eVar;
    }

    public void setScroller(Scroller scroller) {
        this.f70965D = scroller;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f70977P != z) {
            this.f70977P = z;
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.f70978Q = false;
        mo55005a(i, true, true, 1);
    }

    /* renamed from: b */
    private void m65092b(boolean z) {
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

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f71027u || !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.f70976O) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.f70978Q = false;
        m65083a(i, !this.f70999ao, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.f70979R) {
            this.f70979R = i;
            mo55021f();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f70968G;
        this.f70968G = i;
        int height = getHeight();
        m65081a(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f70969H) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static float m65089b(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        C30220a.f78947a.mo60569b(new C26975i(drawable));
        this.f70969H = drawable;
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
    private C26957b m65090b(int i) {
        for (int i2 = 0; i2 < this.f71029x.size(); i2++) {
            C26957b bVar = (C26957b) this.f71029x.get(i2);
            if (bVar.f71045b == i) {
                return bVar;
            }
        }
        return null;
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C26957b a = m65077a(childAt);
                if (a != null && a.f71045b == this.f71011d) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f71010c == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.f70972K))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollY >= ((int) (((float) clientHeight) * this.f70973L))) {
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
                C26957b a = m65077a(childAt);
                if (a != null && a.f71045b == this.f71011d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        if (this.f71010c != null) {
            this.f71010c.restoreState(savedState.f71042b, savedState.f71043c);
            m65083a(savedState.f71041a, false, true);
            return;
        }
        this.f70962A = savedState.f71041a;
        this.f70963B = savedState.f71042b;
        this.f70964C = savedState.f71043c;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChildrenDrawingOrderEnabledCompat(boolean r7) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 7
            if (r0 < r1) goto L_0x0029
            java.lang.reflect.Method r0 = r6.f71005au
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001b
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.String r3 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001b }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x001b }
            r4[r1] = r5     // Catch:{ NoSuchMethodException -> 0x001b }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x001b }
            r6.f71005au = r0     // Catch:{ NoSuchMethodException -> 0x001b }
        L_0x001b:
            java.lang.reflect.Method r0 = r6.f71005au     // Catch:{ Exception -> 0x0029 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0029 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0029 }
            r2[r1] = r7     // Catch:{ Exception -> 0x0029 }
            r0.invoke(r6, r2)     // Catch:{ Exception -> 0x0029 }
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    public VerticalViewPager(Context context) {
        super(context);
        this.f71029x = new ArrayList<>();
        this.f71030y = new C26957b();
        this.f71031z = new Rect();
        this.f70962A = -1;
        this.f70963B = null;
        this.f70964C = null;
        this.f70972K = -3.4028235E38f;
        this.f70973L = Float.MAX_VALUE;
        this.f70979R = 1;
        this.f70989ae = -1;
        this.f70999ao = true;
        this.f71000ap = false;
        this.f71012e = new ArrayList();
        this.f71007ax = new Runnable() {
            public final void run() {
                VerticalViewPager.this.setScrollState(0);
                VerticalViewPager.this.mo55021f();
            }
        };
        this.f71008ay = 0;
        this.f71016i = -1;
        this.f71017j = -1;
        this.f71018k = new C26965c(this);
        this.f71021n = C26966d.f71053a;
        this.f71022o = C26980n.f71128a;
        this.f71023p = C26982p.f71130a;
        this.f71024q = new C26983q(this);
        this.f71025r = new C26984r(this);
        this.f71026s = new C26985s(this);
        this.f71009az = false;
        m65099n();
    }

    /* renamed from: b */
    private C26957b m65091b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m65077a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    /* renamed from: c */
    private boolean m65094c(int i) {
        if (this.f71029x.size() != 0) {
            C26957b q = m65102q();
            int clientHeight = getClientHeight();
            int i2 = this.f70968G + clientHeight;
            float f = (float) clientHeight;
            float f2 = ((float) this.f70968G) / f;
            int i3 = q.f71045b;
            float f3 = ((((float) i) / f) - q.f71048e) / (q.f71047d + f2);
            int i4 = (int) (((float) i2) * f3);
            this.f71001aq = false;
            m65079a(i3, f3, i4);
            if (this.f71001aq) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f70999ao) {
            return false;
        } else {
            this.f71001aq = false;
            m65079a(0, 0.0f, 0);
            if (this.f71001aq) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            boolean r0 = super.dispatchKeyEvent(r5)
            r1 = 1
            if (r0 != 0) goto L_0x0044
            int r0 = r5.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            r3 = 61
            if (r0 == r3) goto L_0x0028
            switch(r0) {
                case 21: goto L_0x0021;
                case 22: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x003f
        L_0x001a:
            r5 = 66
            boolean r5 = r4.m65095d(r5)
            goto L_0x0040
        L_0x0021:
            r5 = 17
            boolean r5 = r4.m65095d(r5)
            goto L_0x0040
        L_0x0028:
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L_0x0034
            r5 = 2
            boolean r5 = r4.m65095d(r5)
            goto L_0x0040
        L_0x0034:
            boolean r5 = r5.hasModifiers(r1)
            if (r5 == 0) goto L_0x003f
            boolean r5 = r4.m65095d(r1)
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            if (r5 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            return r2
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public void setScrollState(int i) {
        boolean z;
        int i2;
        if (this.f71008ay != i) {
            this.f71008ay = i;
            if (this.f71013f != null) {
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
            if (this.f71012e != null && !this.f71012e.isEmpty()) {
                for (C0997e onPageScrollStateChanged : this.f71012e) {
                    onPageScrollStateChanged.onPageScrollStateChanged(i);
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m65093c(float f) {
        boolean z;
        float f2 = this.f70986ab - f;
        this.f70986ab = f;
        float scrollY = ((float) getScrollY()) + f2;
        float clientHeight = (float) getClientHeight();
        float f3 = this.f70972K * clientHeight;
        float f4 = this.f70973L * clientHeight;
        boolean z2 = false;
        if (this.f71029x.size() <= 0) {
            return false;
        }
        C26957b bVar = (C26957b) this.f71029x.get(0);
        boolean z3 = true;
        C26957b bVar2 = (C26957b) this.f71029x.get(this.f71029x.size() - 1);
        if (bVar.f71045b != 0) {
            f3 = bVar.f71048e * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f71045b != this.f71010c.getCount() - 1) {
            f4 = bVar2.f71048e * clientHeight;
            z3 = false;
        }
        if (scrollY < f3) {
            if (z) {
                z2 = this.f70997am.mo3559a(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z3) {
                z2 = this.f70998an.mo3559a(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.f70985aa += scrollY - ((float) i);
        scrollTo(getScrollX(), i);
        m65094c(i);
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m65095d(int r7) {
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
            android.graphics.Rect r1 = r6.f71031z
            android.graphics.Rect r1 = r6.m65075a(r1, r3)
            int r1 = r1.top
            android.graphics.Rect r2 = r6.f71031z
            android.graphics.Rect r2 = r6.m65075a(r2, r0)
            int r2 = r2.top
            if (r0 == 0) goto L_0x0077
            if (r1 < r2) goto L_0x0077
            boolean r2 = r6.m65104s()
            goto L_0x00af
        L_0x0077:
            boolean r2 = r3.requestFocus()
            goto L_0x00af
        L_0x007c:
            if (r7 != r4) goto L_0x00af
            android.graphics.Rect r1 = r6.f71031z
            android.graphics.Rect r1 = r6.m65075a(r1, r3)
            int r1 = r1.bottom
            android.graphics.Rect r2 = r6.f71031z
            android.graphics.Rect r2 = r6.m65075a(r2, r0)
            int r2 = r2.bottom
            if (r0 == 0) goto L_0x0097
            if (r1 > r2) goto L_0x0097
            boolean r2 = r6.m65105t()
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
            boolean r2 = r6.m65105t()
            goto L_0x00af
        L_0x00ab:
            boolean r2 = r6.m65104s()
        L_0x00af:
            if (r2 == 0) goto L_0x00b8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00b8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.m65095d(int):boolean");
    }

    public void draw(Canvas canvas) {
        try {
            C30220a.f78947a.mo60568a(this.f71022o);
            super.draw(canvas);
            C30220a.f78947a.mo60568a(this.f71023p);
        } catch (Exception e) {
            C30220a.f78947a.mo60570c(new C26981o(e));
            C32458a.m75148a((Throwable) e);
            C9220a.m18312a((Throwable) e, "VerticalViewPager");
        }
        int a = C1056u.m3020a(this);
        this.f71019l = a;
        boolean z = false;
        if (a == 0 || (a == 1 && this.f71010c != null && this.f71010c.getCount() > 1)) {
            C30220a.f78947a.mo60568a(this.f71024q);
            if (!this.f70997am.mo3558a()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.f70972K * ((float) height));
                this.f70997am.mo3557a(width, height);
                z = false | this.f70997am.mo3560a(canvas);
                canvas.restoreToCount(save);
                this.f71020m = z;
                C30220a.f78947a.mo60568a(this.f71025r);
            }
            if (!this.f70998an.mo3558a()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.f70973L + 1.0f)) * ((float) height2));
                this.f70998an.mo3557a(width2, height2);
                z |= this.f70998an.mo3560a(canvas);
                canvas.restoreToCount(save2);
                this.f71020m = z;
                C30220a.f78947a.mo60568a(this.f71026s);
            }
            C30220a.f78947a.mo60568a(this.f71021n);
        } else {
            this.f70997am.mo3561b();
            this.f70998an.mo3561b();
        }
        if (z) {
            C1056u.m3052d(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f70968G > 0 && this.f70969H != null && this.f71029x.size() > 0 && this.f71010c != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f4 = (float) height;
            float f5 = ((float) this.f70968G) / f4;
            int i = 0;
            C26957b bVar = (C26957b) this.f71029x.get(0);
            float f6 = bVar.f71048e;
            int size = this.f71029x.size();
            int i2 = bVar.f71045b;
            int i3 = ((C26957b) this.f71029x.get(size - 1)).f71045b;
            while (i2 < i3) {
                while (i2 > bVar.f71045b && i < size) {
                    i++;
                    bVar = (C26957b) this.f71029x.get(i);
                }
                if (i2 == bVar.f71045b) {
                    f2 = (bVar.f71048e + bVar.f71047d) * f4;
                    f = bVar.f71048e + bVar.f71047d + f5;
                } else {
                    float pageWidth = this.f71010c.getPageWidth(i2);
                    f = f6 + pageWidth + f5;
                    f2 = (f6 + pageWidth) * f4;
                }
                if (((float) this.f70968G) + f2 > ((float) scrollY)) {
                    f3 = f5;
                    this.f70969H.setBounds(this.f70970I, (int) f2, this.f70971J, (int) (((float) this.f70968G) + f2 + 0.5f));
                    this.f70969H.draw(canvas);
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
        if (this.f71010c != null) {
            m65084a(this.f71010c, (C26961f) null);
            this.f71010c.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f71029x.size(); i++) {
                C26957b bVar = (C26957b) this.f71029x.get(i);
                this.f71010c.destroyItem((ViewGroup) this, bVar.f71045b, bVar.f71044a);
            }
            this.f71010c.finishUpdate((ViewGroup) this);
            this.f71029x.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f71035a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f71011d = 0;
            scrollTo(0, 0);
        }
        this.f71010c = pagerAdapter;
        this.f71028v = 0;
        if (this.f71010c != null) {
            if (this.f70967F == null) {
                this.f70967F = new C26961f();
            }
            m65084a(this.f71010c, this.f70967F);
            this.f70978Q = false;
            boolean z = this.f70999ao;
            this.f70999ao = true;
            this.f71028v = this.f71010c.getCount();
            if (this.f70962A >= 0) {
                this.f71010c.restoreState(this.f70963B, this.f70964C);
                m65083a(this.f70962A, false, true);
                this.f70962A = -1;
                this.f70963B = null;
                this.f70964C = null;
            } else if (!z) {
                mo55021f();
            } else {
                requestLayout();
            }
        }
    }

    /* renamed from: a */
    private C26957b m65077a(View view) {
        for (int i = 0; i < this.f71029x.size(); i++) {
            C26957b bVar = (C26957b) this.f71029x.get(i);
            if (this.f71010c.isViewFromObject(view, bVar.f71044a)) {
                return bVar;
            }
        }
        return null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f71009az) {
            return false;
        }
        try {
            if (this.f70995ak) {
                return false;
            }
            int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
            if (action != 3) {
                if (action != 1) {
                    if (action != 0) {
                        if (this.f70980S) {
                            return true;
                        }
                        if (this.f70981T) {
                            return false;
                        }
                    }
                    if (action == 0) {
                        this.f70985aa = motionEvent.getX();
                        this.f70987ac = motionEvent.getX();
                        this.f70986ab = motionEvent.getY();
                        this.f70988ad = motionEvent.getY();
                        this.f70989ae = motionEvent2.getPointerId(0);
                        this.f70981T = false;
                        this.f70966E = true;
                        this.f70965D.computeScrollOffset();
                        if (this.f71008ay != 2 || Math.abs(this.f70965D.getFinalY() - this.f70965D.getCurrY()) <= this.f70994aj) {
                            m65087a(false);
                            this.f70980S = false;
                        } else {
                            this.f70965D.abortAnimation();
                            this.f70978Q = false;
                            mo55021f();
                            this.f70980S = true;
                            m65092b(true);
                            setScrollState(1);
                        }
                    } else if (action == 2) {
                        int i = this.f70989ae;
                        if (i != -1) {
                            int findPointerIndex = motionEvent2.findPointerIndex(i);
                            float y = motionEvent2.getY(findPointerIndex);
                            float f2 = y - this.f70986ab;
                            float abs = Math.abs(f2);
                            float x = motionEvent2.getX(findPointerIndex);
                            float abs2 = Math.abs(x - this.f70987ac);
                            if (f2 != 0.0f) {
                                float f3 = this.f70986ab;
                                if ((f3 >= ((float) this.f70983V) || f2 <= 0.0f) && (f3 <= ((float) (getHeight() - this.f70983V)) || f2 >= 0.0f)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                    if (m65088a(this, false, (int) f2, (int) x, (int) y)) {
                                        this.f70985aa = x;
                                        this.f70986ab = y;
                                        this.f70981T = true;
                                        return false;
                                    }
                                }
                            }
                            if (abs > ((float) this.f70984W) && abs > abs2) {
                                this.f70980S = true;
                                m65092b(true);
                                setScrollState(1);
                                if (f2 > 0.0f) {
                                    f = this.f70988ad + ((float) this.f70984W);
                                } else {
                                    f = this.f70988ad - ((float) this.f70984W);
                                }
                                this.f70986ab = f;
                                this.f70985aa = x;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > ((float) this.f70984W)) {
                                this.f70981T = true;
                            }
                            if (this.f70980S && m65093c(y)) {
                                C1056u.m3052d(this);
                            }
                        }
                    } else if (action == 6) {
                        m65085a(motionEvent);
                    }
                    if (this.f70990af == null) {
                        this.f70990af = VelocityTracker.obtain();
                    }
                    this.f70990af.addMovement(motionEvent2);
                    return this.f70980S;
                }
            }
            m65101p();
            return false;
        } catch (IllegalArgumentException unused) {
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z = false;
        if (this.f71009az) {
            return false;
        }
        try {
            if (this.f70995ak) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && this.f71010c != null) {
                if (this.f71010c.getCount() != 0) {
                    if (this.f70990af == null) {
                        this.f70990af = VelocityTracker.obtain();
                    }
                    this.f70990af.addMovement(motionEvent);
                    switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
                        case 0:
                            this.f70965D.abortAnimation();
                            this.f70978Q = false;
                            mo55021f();
                            this.f70985aa = motionEvent.getX();
                            this.f70987ac = motionEvent.getX();
                            this.f70986ab = motionEvent.getY();
                            this.f70988ad = motionEvent.getY();
                            this.f70989ae = motionEvent.getPointerId(0);
                            break;
                        case 1:
                            if (this.f70980S) {
                                VelocityTracker velocityTracker = this.f70990af;
                                velocityTracker.computeCurrentVelocity(1000, (float) this.f70992ah);
                                int b = (int) C1055t.m3016b(velocityTracker, this.f70989ae);
                                this.f70978Q = true;
                                int clientHeight = getClientHeight();
                                int scrollY = getScrollY();
                                C26957b q = m65102q();
                                if (q != null) {
                                    float f2 = (float) clientHeight;
                                    float f3 = ((float) this.f70968G) / f2;
                                    int i = q.f71045b;
                                    int a = m65074a(i, ((((float) scrollY) / f2) - q.f71048e) / (q.f71047d + f3), b, (int) (motionEvent.getY(motionEvent.findPointerIndex(this.f70989ae)) - this.f70988ad));
                                    if (C30368h.m71294c() && a != this.f71011d) {
                                        a = this.f71015h.mo55067a(a, this.f71011d, i, b);
                                    }
                                    if (a > i && this.f71015h != null) {
                                        this.f71015h.mo55068a();
                                    }
                                    mo55005a(a, true, true, b);
                                }
                                z = m65101p();
                                break;
                            }
                            break;
                        case 2:
                            if (!this.f70980S) {
                                int findPointerIndex = motionEvent.findPointerIndex(this.f70989ae);
                                if (findPointerIndex == -1) {
                                    z = m65101p();
                                    break;
                                } else {
                                    float y = motionEvent.getY(findPointerIndex);
                                    float abs = Math.abs(y - this.f70986ab);
                                    float x = motionEvent.getX(findPointerIndex);
                                    float abs2 = Math.abs(x - this.f70985aa);
                                    if (abs > ((float) this.f70984W) && abs > abs2) {
                                        this.f70980S = true;
                                        m65092b(true);
                                        if (y - this.f70988ad > 0.0f) {
                                            f = this.f70988ad + ((float) this.f70984W);
                                        } else {
                                            f = this.f70988ad - ((float) this.f70984W);
                                        }
                                        this.f70986ab = f;
                                        this.f70985aa = x;
                                        setScrollState(1);
                                        setScrollingCacheEnabled(true);
                                        ViewParent parent = getParent();
                                        if (parent != null) {
                                            parent.requestDisallowInterceptTouchEvent(true);
                                        }
                                    }
                                }
                            }
                            if (this.f70980S) {
                                z = false | m65093c(motionEvent.getY(motionEvent.findPointerIndex(this.f70989ae)));
                                break;
                            }
                            break;
                        case 3:
                            if (this.f70980S) {
                                m65082a(this.f71011d, true, 0, false);
                                z = m65101p();
                                break;
                            }
                            break;
                        case 5:
                            int actionIndex = motionEvent.getActionIndex();
                            this.f70986ab = motionEvent.getY(actionIndex);
                            this.f70989ae = motionEvent.getPointerId(actionIndex);
                            break;
                        case 6:
                            m65085a(motionEvent);
                            this.f70986ab = motionEvent.getY(motionEvent.findPointerIndex(this.f70989ae));
                            break;
                    }
                    if (z) {
                        C1056u.m3052d(this);
                    }
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            C30220a.f78947a.mo60570c(new C26978l(e));
            C9220a.m18311a((Throwable) e);
            C32458a.m75143a((Exception) e);
        } catch (IllegalStateException e2) {
            if (this.f71010c.getCount() != this.f71028v) {
                this.f71010c.notifyDataSetChanged();
            }
            C30220a.f78947a.mo60570c(new C26979m(e2));
            C9220a.m18311a((Throwable) e2);
            C32458a.m75143a((Exception) e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r9.f71045b == r0.f71011d) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m65078a(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f71011d
            if (r2 == r1) goto L_0x001a
            int r2 = r0.f71011d
            if (r2 >= r1) goto L_0x000f
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x0011
        L_0x000f:
            r2 = 33
        L_0x0011:
            int r4 = r0.f71011d
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r4 = r0.m65090b(r4)
            r0.f71011d = r1
            goto L_0x001c
        L_0x001a:
            r2 = 2
            r4 = 0
        L_0x001c:
            android.support.v4.view.PagerAdapter r1 = r0.f71010c
            if (r1 != 0) goto L_0x0024
            r17.m65100o()
            return
        L_0x0024:
            boolean r1 = r0.f70978Q
            if (r1 == 0) goto L_0x002c
            r17.m65100o()
            return
        L_0x002c:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0033
            return
        L_0x0033:
            android.support.v4.view.PagerAdapter r1 = r0.f71010c
            r1.startUpdate(r0)
            int r1 = r0.f70979R
            int r5 = r0.f71011d
            int r5 = r5 - r1
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            android.support.v4.view.PagerAdapter r7 = r0.f71010c
            int r7 = r7.getCount()
            int r8 = r7 + -1
            int r9 = r0.f71011d
            int r9 = r9 + r1
            int r1 = java.lang.Math.min(r8, r9)
            int r8 = r0.f71028v
            if (r7 != r8) goto L_0x0235
            r8 = 0
        L_0x0056:
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r9 = r0.f71029x
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x0076
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r9 = r0.f71029x
            java.lang.Object r9 = r9.get(r8)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r9 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.C26957b) r9
            int r10 = r9.f71045b
            int r11 = r0.f71011d
            if (r10 < r11) goto L_0x0073
            int r10 = r9.f71045b
            int r11 = r0.f71011d
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
            int r9 = r0.f71011d
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r9 = r0.m65076a(r9, r8)
        L_0x0081:
            if (r9 == 0) goto L_0x01b4
            int r11 = r8 + -1
            if (r11 < 0) goto L_0x0090
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r12 = r0.f71029x
            java.lang.Object r12 = r12.get(r11)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r12 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.C26957b) r12
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
            float r15 = r9.f71047d
            float r15 = r14 - r15
            int r3 = r17.getPaddingLeft()
            float r3 = (float) r3
            float r6 = (float) r13
            float r3 = r3 / r6
            float r3 = r3 + r15
        L_0x00a7:
            int r6 = r0.f71011d
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
            int r10 = r12.f71045b
            if (r6 != r10) goto L_0x0109
            boolean r10 = r12.f71046c
            if (r10 != 0) goto L_0x0109
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r10 = r0.f71029x
            r10.remove(r15)
            android.support.v4.view.PagerAdapter r10 = r0.f71010c
            java.lang.Object r12 = r12.f71044a
            r10.destroyItem(r0, r6, r12)
            int r15 = r15 + -1
            int r11 = r11 + -1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r10 = r0.f71029x
            java.lang.Object r10 = r10.get(r15)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r10 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.C26957b) r10
            goto L_0x0108
        L_0x00db:
            if (r12 == 0) goto L_0x00f1
            int r10 = r12.f71045b
            if (r6 != r10) goto L_0x00f1
            float r10 = r12.f71047d
            float r8 = r8 + r10
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r10 = r0.f71029x
            java.lang.Object r10 = r10.get(r15)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r10 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.C26957b) r10
            goto L_0x0108
        L_0x00f1:
            int r10 = r15 + 1
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r10 = r0.m65076a(r6, r10)
            float r10 = r10.f71047d
            float r8 = r8 + r10
            int r11 = r11 + 1
            if (r15 < 0) goto L_0x0107
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r10 = r0.f71029x
            java.lang.Object r10 = r10.get(r15)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r10 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.C26957b) r10
            goto L_0x0108
        L_0x0107:
            r10 = 0
        L_0x0108:
            r12 = r10
        L_0x0109:
            int r6 = r6 + -1
            goto L_0x00ae
        L_0x010c:
            float r3 = r9.f71047d
            int r5 = r11 + 1
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x019e
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f71029x
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0125
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f71029x
            java.lang.Object r6 = r6.get(r5)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r6 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.C26957b) r6
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
            int r8 = r0.f71011d
        L_0x0135:
            int r8 = r8 + 1
            if (r8 >= r7) goto L_0x019e
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0168
            if (r8 <= r1) goto L_0x0168
            if (r6 == 0) goto L_0x019e
            int r12 = r6.f71045b
            if (r8 != r12) goto L_0x019d
            boolean r12 = r6.f71046c
            if (r12 != 0) goto L_0x019d
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r12 = r0.f71029x
            r12.remove(r5)
            android.support.v4.view.PagerAdapter r12 = r0.f71010c
            java.lang.Object r6 = r6.f71044a
            r12.destroyItem(r0, r8, r6)
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f71029x
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f71029x
            java.lang.Object r6 = r6.get(r5)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r6 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.C26957b) r6
            goto L_0x019d
        L_0x0166:
            r6 = 0
            goto L_0x019d
        L_0x0168:
            if (r6 == 0) goto L_0x0184
            int r12 = r6.f71045b
            if (r8 != r12) goto L_0x0184
            float r6 = r6.f71047d
            float r3 = r3 + r6
            int r5 = r5 + 1
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f71029x
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f71029x
            java.lang.Object r6 = r6.get(r5)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r6 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.C26957b) r6
            goto L_0x019d
        L_0x0184:
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r6 = r0.m65076a(r8, r5)
            int r5 = r5 + 1
            float r6 = r6.f71047d
            float r3 = r3 + r6
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f71029x
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0166
            java.util.ArrayList<com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b> r6 = r0.f71029x
            java.lang.Object r6 = r6.get(r5)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r6 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.C26957b) r6
        L_0x019d:
            goto L_0x0135
        L_0x019e:
            r0.m65086a(r9, r11, r4)
            java.lang.Object r1 = r9.f71044a
            boolean r1 = r1 instanceof android.widget.FrameLayout
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r1 = r9.f71044a
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L_0x01b4
            r17.requestLayout()
        L_0x01b4:
            android.support.v4.view.PagerAdapter r1 = r0.f71010c
            int r3 = r0.f71011d
            if (r9 == 0) goto L_0x01bd
            java.lang.Object r4 = r9.f71044a
            goto L_0x01be
        L_0x01bd:
            r4 = 0
        L_0x01be:
            r1.setPrimaryItem(r0, r3, r4)
            android.support.v4.view.PagerAdapter r1 = r0.f71010c
            r1.finishUpdate(r0)
            int r1 = r17.getChildCount()
            r3 = 0
        L_0x01cb:
            if (r3 >= r1) goto L_0x01f7
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams r5 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.LayoutParams) r5
            r5.f71040f = r3
            boolean r6 = r5.f71035a
            if (r6 != 0) goto L_0x01f3
            float r6 = r5.f71037c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x01f4
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r4 = r0.m65077a(r4)
            if (r4 == 0) goto L_0x01f4
            float r6 = r4.f71047d
            r5.f71037c = r6
            int r4 = r4.f71045b
            r5.f71039e = r4
            goto L_0x01f4
        L_0x01f3:
            r7 = 0
        L_0x01f4:
            int r3 = r3 + 1
            goto L_0x01cb
        L_0x01f7:
            r17.m65100o()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0234
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x020b
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r3 = r0.m65091b(r1)
            goto L_0x020c
        L_0x020b:
            r3 = 0
        L_0x020c:
            if (r3 == 0) goto L_0x0214
            int r1 = r3.f71045b
            int r3 = r0.f71011d
            if (r1 == r3) goto L_0x0234
        L_0x0214:
            r1 = 0
        L_0x0215:
            int r3 = r17.getChildCount()
            if (r1 >= r3) goto L_0x0234
            android.view.View r3 = r0.getChildAt(r1)
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b r4 = r0.m65077a(r3)
            if (r4 == 0) goto L_0x0231
            int r4 = r4.f71045b
            int r5 = r0.f71011d
            if (r4 != r5) goto L_0x0231
            boolean r3 = r3.requestFocus(r2)
            if (r3 != 0) goto L_0x0234
        L_0x0231:
            int r1 = r1 + 1
            goto L_0x0215
        L_0x0234:
            return
        L_0x0235:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x0242 }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x0242 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0242 }
            goto L_0x024a
        L_0x0242:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x024a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.f71028v
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
            android.support.v4.view.PagerAdapter r1 = r0.f71010c
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.m65078a(int):void");
    }

    /* renamed from: a */
    private static void m65084a(PagerAdapter pagerAdapter, C26961f fVar) {
        try {
            if (f70960t != null) {
                f70960t.set(pagerAdapter, fVar);
            }
        } catch (IllegalAccessException unused) {
        }
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        this.f71016i = i2;
        this.f71017j = i;
        C30220a.f78947a.mo60568a(this.f71018k);
    }

    /* renamed from: a */
    public final void mo55004a(int i, boolean z) {
        this.f70978Q = false;
        m65083a(i, z, false);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f71014g == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.f71006av.get(i2)).getLayoutParams()).f71040f;
    }

    /* renamed from: a */
    private C26957b m65076a(int i, int i2) {
        C26957b bVar = new C26957b();
        bVar.f71045b = i;
        Object instantiateItem = this.f71010c.instantiateItem((ViewGroup) this, i);
        bVar.f71044a = instantiateItem;
        C30220a.f78947a.mo60568a((C52670a<String>) new C26976j<String>(instantiateItem, i));
        bVar.f71047d = this.f71010c.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f71029x.size()) {
            this.f71029x.add(bVar);
        } else {
            this.f71029x.add(i2, bVar);
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
                C26957b a = m65077a(childAt);
                if (a != null && a.f71045b == this.f71011d && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71029x = new ArrayList<>();
        this.f71030y = new C26957b();
        this.f71031z = new Rect();
        this.f70962A = -1;
        this.f70963B = null;
        this.f70964C = null;
        this.f70972K = -3.4028235E38f;
        this.f70973L = Float.MAX_VALUE;
        this.f70979R = 1;
        this.f70989ae = -1;
        this.f70999ao = true;
        this.f71000ap = false;
        this.f71012e = new ArrayList();
        this.f71007ax = new Runnable() {
            public final void run() {
                VerticalViewPager.this.setScrollState(0);
                VerticalViewPager.this.mo55021f();
            }
        };
        this.f71008ay = 0;
        this.f71016i = -1;
        this.f71017j = -1;
        this.f71018k = new C26993t(this);
        this.f71021n = C27009u.f71319a;
        this.f71022o = C27010v.f71320a;
        this.f71023p = C26971e.f71118a;
        this.f71024q = new C26972f(this);
        this.f71025r = new C26973g(this);
        this.f71026s = new C26974h(this);
        this.f71009az = false;
        m65099n();
    }

    /* renamed from: a */
    private Rect m65075a(Rect rect, View view) {
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
            int r4 = r0.f70982U
            int r3 = java.lang.Math.min(r3, r4)
            r0.f70983V = r3
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
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams r6 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.LayoutParams) r6
            if (r6 == 0) goto L_0x00c0
            boolean r10 = r6.f71035a
            if (r10 == 0) goto L_0x00c0
            int r10 = r6.f71036b
            r10 = r10 & 7
            int r11 = r6.f71036b
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
            r0.f70974M = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r0.f70975N = r1
            r0.f70976O = r7
            r16.mo55021f()
            r1 = 0
            r0.f70976O = r1
            int r2 = r16.getChildCount()
        L_0x00dd:
            if (r1 >= r2) goto L_0x0107
            android.view.View r3 = r0.getChildAt(r1)
            int r4 = r3.getVisibility()
            if (r4 == r6) goto L_0x0104
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams r4 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.LayoutParams) r4
            if (r4 == 0) goto L_0x00f5
            boolean r7 = r4.f71035a
            if (r7 != 0) goto L_0x0104
        L_0x00f5:
            float r7 = (float) r5
            float r4 = r4.f71037c
            float r7 = r7 * r4
            int r4 = (int) r7
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r8)
            int r7 = r0.f70974M
            r3.measure(r7, r4)
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x00dd
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m65083a(int i, boolean z, boolean z2) {
        mo55005a(i, z, z2, 0);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f71035a |= view instanceof C26956a;
        if (!this.f70976O) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f71035a) {
            layoutParams2.f71038d = true;
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
                    C26957b a = m65077a(childAt);
                    if (a != null && a.f71045b == this.f71011d) {
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
    private void m65079a(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f71002ar
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
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams r8 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.LayoutParams) r8
            boolean r9 = r8.f71035a
            if (r9 == 0) goto L_0x006c
            int r8 = r8.f71036b
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
            java.util.List<android.support.v4.view.ViewPager$e> r0 = r11.f71012e
            if (r0 == 0) goto L_0x0091
            java.util.List<android.support.v4.view.ViewPager$e> r0 = r11.f71012e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0091
            java.util.List<android.support.v4.view.ViewPager$e> r0 = r11.f71012e
            java.util.Iterator r0 = r0.iterator()
        L_0x0081:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r0.next()
            android.support.v4.view.ViewPager$e r2 = (android.support.p030v4.view.ViewPager.C0997e) r2
            r2.onPageScrolled(r12, r13, r14)
            goto L_0x0081
        L_0x0091:
            android.support.v4.view.ViewPager$e r0 = r11.f71003as
            if (r0 == 0) goto L_0x009a
            android.support.v4.view.ViewPager$e r0 = r11.f71003as
            r0.onPageScrolled(r12, r13, r14)
        L_0x009a:
            android.support.v4.view.ViewPager$f r12 = r11.f71013f
            if (r12 == 0) goto L_0x00ca
            int r12 = r11.getScrollY()
            int r13 = r11.getChildCount()
        L_0x00a6:
            if (r1 >= r13) goto L_0x00ca
            android.view.View r14 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager$LayoutParams r0 = (com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.LayoutParams) r0
            boolean r0 = r0.f71035a
            if (r0 != 0) goto L_0x00c7
            int r0 = r14.getTop()
            int r0 = r0 - r12
            float r0 = (float) r0
            int r2 = r11.getClientHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            android.support.v4.view.ViewPager$f r2 = r11.f71013f
            r2.mo3111a(r14, r0)
        L_0x00c7:
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00ca:
            r12 = 1
            r11.f71001aq = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.m65079a(int, float, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            m65081a(i2, i4, this.f70968G, this.f70968G);
        }
    }

    /* renamed from: a */
    private int m65074a(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.f70993ai || Math.abs(i2) <= this.f70991ag) {
            if (i >= this.f71011d) {
                f2 = 0.6f;
            } else {
                f2 = 0.4f;
            }
            i = (int) (((float) i) + f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f71029x.size() <= 0) {
            return i;
        }
        return Math.max(((C26957b) this.f71029x.get(0)).f71045b, Math.min(i, ((C26957b) this.f71029x.get(this.f71029x.size() - 1)).f71045b));
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
                if (layoutParams.f71035a) {
                    int i13 = layoutParams.f71036b & 7;
                    int i14 = layoutParams.f71036b & 112;
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
                C26957b a = m65077a(childAt2);
                if (!layoutParams2.f71035a && a != null) {
                    float f = (float) i16;
                    int i18 = ((int) (a.f71048e * f)) + paddingTop;
                    if (layoutParams2.f71038d) {
                        layoutParams2.f71038d = false;
                        childAt2.measure(MeasureSpec.makeMeasureSpec((i7 - i11) - i9, 1073741824), MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f71037c), 1073741824));
                    }
                    childAt2.layout(i11, i18, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + i18);
                }
            }
        }
        this.f70970I = i11;
        this.f70971J = i7 - i9;
        this.f71002ar = i10;
        if (this.f70999ao) {
            z2 = false;
            m65082a(this.f71011d, false, 0, false);
        } else {
            z2 = false;
        }
        this.f70999ao = z2;
    }
}
