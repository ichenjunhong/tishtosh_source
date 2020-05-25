package android.support.p030v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p030v4.view.p041a.C1008c;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: android.support.v4.view.DmtViewPager */
public class DmtViewPager extends ViewGroup {

    /* renamed from: a */
    static final int[] f3129a = {16842931};

    /* renamed from: ai */
    private static final C0987g f3130ai = new C0987g();

    /* renamed from: h */
    private static final Comparator<C0982b> f3131h = new Comparator<C0982b>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C0982b) obj).f3202b - ((C0982b) obj2).f3202b;
        }
    };

    /* renamed from: i */
    private static final Interpolator f3132i = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: A */
    private boolean f3133A;

    /* renamed from: B */
    private boolean f3134B;

    /* renamed from: C */
    private int f3135C = 1;

    /* renamed from: D */
    private boolean f3136D;

    /* renamed from: E */
    private boolean f3137E;

    /* renamed from: F */
    private int f3138F;

    /* renamed from: G */
    private int f3139G;

    /* renamed from: H */
    private int f3140H;

    /* renamed from: I */
    private float f3141I;

    /* renamed from: J */
    private float f3142J;

    /* renamed from: K */
    private float f3143K;

    /* renamed from: L */
    private float f3144L;

    /* renamed from: M */
    private int f3145M = -1;

    /* renamed from: N */
    private VelocityTracker f3146N;

    /* renamed from: O */
    private int f3147O;

    /* renamed from: P */
    private int f3148P;

    /* renamed from: Q */
    private int f3149Q;

    /* renamed from: R */
    private int f3150R;

    /* renamed from: S */
    private EdgeEffect f3151S;

    /* renamed from: T */
    private EdgeEffect f3152T;

    /* renamed from: U */
    private boolean f3153U = true;

    /* renamed from: V */
    private boolean f3154V = false;

    /* renamed from: W */
    private boolean f3155W;

    /* renamed from: aa */
    private int f3156aa;

    /* renamed from: ab */
    private List<C0997e> f3157ab;

    /* renamed from: ac */
    private C0997e f3158ac;

    /* renamed from: ad */
    private C0997e f3159ad;

    /* renamed from: ae */
    private C0985e f3160ae;

    /* renamed from: af */
    private int f3161af;

    /* renamed from: ag */
    private int f3162ag;

    /* renamed from: ah */
    private ArrayList<View> f3163ah;

    /* renamed from: aj */
    private final Runnable f3164aj = new Runnable() {
        public final void run() {
            DmtViewPager.this.setScrollState(0);
            DmtViewPager.this.mo2989c();
        }
    };

    /* renamed from: ak */
    private int f3165ak = 0;

    /* renamed from: b */
    PagerAdapter f3166b;

    /* renamed from: c */
    int f3167c;

    /* renamed from: d */
    public boolean f3168d;

    /* renamed from: e */
    public boolean f3169e;

    /* renamed from: f */
    public List<C0984d> f3170f;

    /* renamed from: g */
    private int f3171g;

    /* renamed from: j */
    private final ArrayList<C0982b> f3172j = new ArrayList<>();

    /* renamed from: k */
    private final C0982b f3173k = new C0982b();

    /* renamed from: l */
    private final Rect f3174l = new Rect();

    /* renamed from: m */
    private int f3175m = -1;

    /* renamed from: n */
    private Parcelable f3176n = null;

    /* renamed from: o */
    private ClassLoader f3177o = null;

    /* renamed from: p */
    private Scroller f3178p;

    /* renamed from: q */
    private boolean f3179q;

    /* renamed from: r */
    private C0986f f3180r;

    /* renamed from: s */
    private int f3181s;

    /* renamed from: t */
    private Drawable f3182t;

    /* renamed from: u */
    private int f3183u;

    /* renamed from: v */
    private int f3184v;

    /* renamed from: w */
    private float f3185w = -3.4028235E38f;

    /* renamed from: x */
    private float f3186x = Float.MAX_VALUE;

    /* renamed from: y */
    private int f3187y;

    /* renamed from: z */
    private int f3188z;

    /* renamed from: android.support.v4.view.DmtViewPager$LayoutParams */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f3192a;

        /* renamed from: b */
        public int f3193b;

        /* renamed from: c */
        float f3194c;

        /* renamed from: d */
        boolean f3195d;

        /* renamed from: e */
        int f3196e;

        /* renamed from: f */
        int f3197f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DmtViewPager.f3129a);
            this.f3193b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.view.DmtViewPager$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f3198a;

        /* renamed from: b */
        Parcelable f3199b;

        /* renamed from: c */
        ClassLoader f3200c;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f3198a);
            sb.append("}");
            return sb.toString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3198a);
            parcel.writeParcelable(this.f3199b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f3198a = parcel.readInt();
            this.f3199b = parcel.readParcelable(classLoader);
            this.f3200c = classLoader;
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.v4.view.DmtViewPager$a */
    public @interface C0981a {
    }

    /* renamed from: android.support.v4.view.DmtViewPager$b */
    static class C0982b {

        /* renamed from: a */
        Object f3201a;

        /* renamed from: b */
        int f3202b;

        /* renamed from: c */
        boolean f3203c;

        /* renamed from: d */
        float f3204d;

        /* renamed from: e */
        float f3205e;

        C0982b() {
        }
    }

    /* renamed from: android.support.v4.view.DmtViewPager$c */
    class C0983c extends C1002a {
        /* renamed from: a */
        private boolean m2863a() {
            if (DmtViewPager.this.f3166b == null || DmtViewPager.this.f3166b.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C0983c() {
        }

        /* renamed from: a */
        public final void mo1119a(View view, C1008c cVar) {
            super.mo1119a(view, cVar);
            cVar.mo3139b((CharSequence) getClass().getName());
            cVar.mo3164j(m2863a());
            if (DmtViewPager.this.canScrollHorizontally(1)) {
                cVar.mo3130a(4096);
            }
            if (DmtViewPager.this.canScrollHorizontally(-1)) {
                cVar.mo3130a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
            }
        }

        /* renamed from: a */
        public final void mo1322a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1322a(view, accessibilityEvent);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setScrollable(m2863a());
            if (accessibilityEvent.getEventType() == 4096 && DmtViewPager.this.f3166b != null) {
                accessibilityEvent.setItemCount(DmtViewPager.this.f3166b.getCount());
                accessibilityEvent.setFromIndex(DmtViewPager.this.f3167c);
                accessibilityEvent.setToIndex(DmtViewPager.this.f3167c);
            }
        }

        /* renamed from: a */
        public final boolean mo1246a(View view, int i, Bundle bundle) {
            if (super.mo1246a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !DmtViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                DmtViewPager.this.setCurrentItem(DmtViewPager.this.f3167c - 1);
                return true;
            } else if (!DmtViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                DmtViewPager.this.setCurrentItem(DmtViewPager.this.f3167c + 1);
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.view.DmtViewPager$d */
    public interface C0984d {
        /* renamed from: a */
        void mo3024a(DmtViewPager dmtViewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    /* renamed from: android.support.v4.view.DmtViewPager$e */
    public interface C0985e {
    }

    /* renamed from: android.support.v4.view.DmtViewPager$f */
    class C0986f extends DataSetObserver {
        public final void onChanged() {
            DmtViewPager.this.mo2988b();
        }

        public final void onInvalidated() {
            DmtViewPager.this.mo2988b();
        }

        C0986f() {
        }
    }

    /* renamed from: android.support.v4.view.DmtViewPager$g */
    static class C0987g implements Comparator<View> {
        C0987g() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
            if (layoutParams.f3192a == layoutParams2.f3192a) {
                i = layoutParams.f3196e - layoutParams2.f3196e;
            } else if (!layoutParams.f3192a) {
                return -1;
            } else {
                i = 1;
            }
            return i;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f3166b;
    }

    public int getCurrentItem() {
        return this.f3167c;
    }

    public int getOffscreenPageLimit() {
        return this.f3135C;
    }

    public int getPageMargin() {
        return this.f3181s;
    }

    /* renamed from: a */
    private void m2838a(int i, boolean z, boolean z2, int i2) {
        if (this.f3166b == null || this.f3166b.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f3167c != i || this.f3172j.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f3166b.getCount()) {
                i = this.f3166b.getCount() - 1;
            }
            int i3 = this.f3135C;
            if (i > this.f3167c + i3 || i < this.f3167c - i3) {
                for (int i4 = 0; i4 < this.f3172j.size(); i4++) {
                    ((C0982b) this.f3172j.get(i4)).f3203c = true;
                }
            }
            if (this.f3167c == i) {
                z3 = false;
            }
            if (this.f3153U) {
                this.f3167c = i;
                if (z3) {
                    m2849d(i);
                }
                requestLayout();
                return;
            }
            mo49049a(i);
            m2836a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m2836a(int i, boolean z, int i2, boolean z2) {
        C0982b b = m2842b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f3185w, Math.min(b.f3205e, this.f3186x))) : 0;
        if (z) {
            m2834a(clientWidth, 0, i2);
            if (z2) {
                m2849d(i);
            }
        } else {
            if (z2) {
                m2849d(i);
            }
            m2841a(false);
            scrollTo(clientWidth, 0);
            m2847c(clientWidth);
        }
    }

    /* renamed from: a */
    public void mo2957a(C0997e eVar) {
        if (this.f3157ab == null) {
            this.f3157ab = new ArrayList();
        }
        this.f3157ab.add(eVar);
    }

    /* renamed from: a */
    private void m2834a(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.f3178p != null && !this.f3178p.isFinished()) {
            i4 = this.f3179q ? this.f3178p.getCurrX() : this.f3178p.getStartX();
            this.f3178p.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = 0 - scrollY;
        if (i7 == 0 && i8 == 0) {
            m2841a(false);
            mo2989c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float a = f2 + (m2827a(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f3166b.getPageWidth(this.f3167c)) + ((float) this.f3181s))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f3179q = false;
        this.f3178p.startScroll(i6, scrollY, i7, i8, min);
        C1056u.m3052d(this);
    }

    /* renamed from: a */
    private void m2839a(C0982b bVar, int i, C0982b bVar2) {
        C0982b bVar3;
        C0982b bVar4;
        int count = this.f3166b.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f3181s) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f3202b;
            if (i2 < bVar.f3202b) {
                float f2 = bVar2.f3205e + bVar2.f3204d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f3202b && i4 < this.f3172j.size()) {
                    Object obj = this.f3172j.get(i4);
                    while (true) {
                        bVar4 = (C0982b) obj;
                        if (i3 > bVar4.f3202b && i4 < this.f3172j.size() - 1) {
                            i4++;
                            obj = this.f3172j.get(i4);
                        }
                    }
                    while (i3 < bVar4.f3202b) {
                        f2 += this.f3166b.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f3205e = f2;
                    f2 += bVar4.f3204d + f;
                    i3++;
                }
            } else if (i2 > bVar.f3202b) {
                int size = this.f3172j.size() - 1;
                float f3 = bVar2.f3205e;
                while (true) {
                    i2--;
                    if (i2 < bVar.f3202b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f3172j.get(size);
                    while (true) {
                        bVar3 = (C0982b) obj2;
                        if (i2 < bVar3.f3202b && size > 0) {
                            size--;
                            obj2 = this.f3172j.get(size);
                        }
                    }
                    while (i2 > bVar3.f3202b) {
                        f3 -= this.f3166b.getPageWidth(i2) + f;
                        i2--;
                    }
                    f3 -= bVar3.f3204d + f;
                    bVar3.f3205e = f3;
                }
            }
        }
        int size2 = this.f3172j.size();
        float f4 = bVar.f3205e;
        int i5 = bVar.f3202b - 1;
        this.f3185w = bVar.f3202b == 0 ? bVar.f3205e : -3.4028235E38f;
        int i6 = count - 1;
        this.f3186x = bVar.f3202b == i6 ? (bVar.f3205e + bVar.f3204d) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            C0982b bVar5 = (C0982b) this.f3172j.get(i7);
            while (i5 > bVar5.f3202b) {
                f4 -= this.f3166b.getPageWidth(i5) + f;
                i5--;
            }
            f4 -= bVar5.f3204d + f;
            bVar5.f3205e = f4;
            if (bVar5.f3202b == 0) {
                this.f3185w = f4;
            }
            i7--;
            i5--;
        }
        float f5 = bVar.f3205e + bVar.f3204d + f;
        int i8 = bVar.f3202b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C0982b bVar6 = (C0982b) this.f3172j.get(i9);
            while (i8 < bVar6.f3202b) {
                f5 += this.f3166b.getPageWidth(i8) + f;
                i8++;
            }
            if (bVar6.f3202b == i6) {
                this.f3186x = (bVar6.f3204d + f5) - 1.0f;
            }
            bVar6.f3205e = f5;
            f5 += bVar6.f3204d + f;
            i9++;
            i8++;
        }
        this.f3154V = false;
    }

    /* renamed from: a */
    private void m2835a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f3172j.isEmpty()) {
            C0982b b = m2842b(this.f3167c);
            int min = (int) ((b != null ? Math.min(b.f3205e, this.f3186x) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m2841a(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f3178p.isFinished()) {
            this.f3178p.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* renamed from: a */
    private void m2841a(boolean z) {
        boolean z2 = this.f3165ak == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f3178p.isFinished()) {
                this.f3178p.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3178p.getCurrX();
                int currY = this.f3178p.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m2847c(currX);
                    }
                }
            } else if (this.f3178p.getCurrX() != getScrollX()) {
                scrollTo(this.f3178p.getCurrX(), this.f3178p.getCurrY());
            }
        }
        this.f3168d = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f3172j.size(); i++) {
            C0982b bVar = (C0982b) this.f3172j.get(i);
            if (bVar.f3203c) {
                bVar.f3203c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C1056u.m3034a((View) this, this.f3164aj);
                return;
            }
            this.f3164aj.run();
        }
    }

    /* renamed from: a */
    private void m2840a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3145M) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3141I = motionEvent.getX(i);
            this.f3145M = motionEvent.getPointerId(i);
            if (this.f3146N != null) {
                this.f3146N.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2984a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (mo2984a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo2989c() {
        mo49049a(this.f3167c);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3153U = true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private boolean m2854h() {
        if (this.f3167c <= 0) {
            return false;
        }
        mo2956a(this.f3167c - 1, true);
        return true;
    }

    /* renamed from: g */
    private void m2853g() {
        this.f3136D = false;
        this.f3137E = false;
        if (this.f3146N != null) {
            this.f3146N.recycle();
            this.f3146N = null;
        }
    }

    /* renamed from: i */
    private boolean m2855i() {
        if (this.f3166b == null || this.f3167c >= this.f3166b.getCount() - 1) {
            return false;
        }
        mo2956a(this.f3167c + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3182t;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3164aj);
        if (this.f3178p != null && !this.f3178p.isFinished()) {
            this.f3178p.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3198a = this.f3167c;
        if (this.f3166b != null) {
            savedState.f3199b = this.f3166b.saveState();
        }
        return savedState;
    }

    /* renamed from: d */
    private void m2848d() {
        if (this.f3162ag != 0) {
            if (this.f3163ah == null) {
                this.f3163ah = new ArrayList<>();
            } else {
                this.f3163ah.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f3163ah.add(getChildAt(i));
            }
            Collections.sort(this.f3163ah, f3130ai);
        }
    }

    /* renamed from: e */
    private boolean m2850e() {
        this.f3145M = -1;
        m2853g();
        this.f3151S.onRelease();
        this.f3152T.onRelease();
        if (this.f3151S.isFinished() || this.f3152T.isFinished()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private C0982b m2852f() {
        float f;
        float f2;
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = ((float) getScrollX()) / ((float) clientWidth);
        } else {
            f = 0.0f;
        }
        if (clientWidth > 0) {
            f2 = ((float) this.f3181s) / ((float) clientWidth);
        } else {
            f2 = 0.0f;
        }
        C0982b bVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i < this.f3172j.size()) {
            C0982b bVar2 = (C0982b) this.f3172j.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (bVar2.f3202b != i3) {
                    bVar2 = this.f3173k;
                    bVar2.f3205e = f3 + f4 + f2;
                    bVar2.f3202b = i3;
                    bVar2.f3204d = this.f3166b.getPageWidth(bVar2.f3202b);
                    i--;
                }
            }
            f3 = bVar2.f3205e;
            float f5 = bVar2.f3204d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i == this.f3172j.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f3202b;
            f4 = bVar2.f3204d;
            i++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.f3179q = true;
        if (this.f3178p.isFinished() || !this.f3178p.computeScrollOffset()) {
            m2841a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3178p.getCurrX();
        int currY = this.f3178p.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m2847c(currX)) {
                this.f3178p.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C1056u.m3052d(this);
    }

    /* renamed from: a */
    private void mo2958a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3178p = new Scroller(context, f3132i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3140H = viewConfiguration.getScaledPagingTouchSlop();
        this.f3147O = (int) (400.0f * f);
        this.f3148P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3151S = new EdgeEffect(context);
        this.f3152T = new EdgeEffect(context);
        this.f3149Q = (int) (25.0f * f);
        this.f3150R = (int) (2.0f * f);
        this.f3138F = (int) (f * 16.0f);
        C1056u.m3031a((View) this, (C1002a) new C0983c());
        if (C1056u.m3053e(this) == 0) {
            C1056u.m3043b((View) this, 1);
        }
        C1056u.m3032a((View) this, (C1051p) new C1051p() {

            /* renamed from: b */
            private final Rect f3191b = new Rect();

            /* renamed from: a */
            public final C1018ac mo1130a(View view, C1018ac acVar) {
                C1018ac a = C1056u.m3022a(view, acVar);
                if (a.mo3189e()) {
                    return a;
                }
                Rect rect = this.f3191b;
                rect.left = a.mo3184a();
                rect.top = a.mo3186b();
                rect.right = a.mo3187c();
                rect.bottom = a.mo3188d();
                int childCount = DmtViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C1018ac b = C1056u.m3041b(DmtViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo3184a(), rect.left);
                    rect.top = Math.min(b.mo3186b(), rect.top);
                    rect.right = Math.min(b.mo3187c(), rect.right);
                    rect.bottom = Math.min(b.mo3188d(), rect.bottom);
                }
                return a.mo3185a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo2988b() {
        boolean z;
        int count = this.f3166b.getCount();
        this.f3171g = count;
        if (this.f3172j.size() >= (this.f3135C * 2) + 1 || this.f3172j.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        int i = this.f3167c;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.f3172j.size()) {
            C0982b bVar = (C0982b) this.f3172j.get(i2);
            int itemPosition = this.f3166b.getItemPosition(bVar.f3201a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f3172j.remove(i2);
                    i2--;
                    if (!z3) {
                        this.f3166b.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.f3166b.destroyItem((ViewGroup) this, bVar.f3202b, bVar.f3201a);
                    if (this.f3167c == bVar.f3202b) {
                        i = Math.max(0, Math.min(this.f3167c, count - 1));
                    }
                } else if (bVar.f3202b != itemPosition) {
                    if (bVar.f3202b == this.f3167c) {
                        i = itemPosition;
                    }
                    bVar.f3202b = itemPosition;
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.f3166b.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f3172j, f3131h);
        if (z2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f3192a) {
                    layoutParams.f3194c = 0.0f;
                }
            }
            m2837a(i, false, true);
            requestLayout();
        }
    }

    public void setDefaultGutterSize(int i) {
        this.f3138F = i;
    }

    public void setOnPageChangeListener(C0997e eVar) {
        this.f3158ac = eVar;
    }

    public void setScroller(Scroller scroller) {
        this.f3178p = scroller;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f3134B != z) {
            this.f3134B = z;
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* renamed from: a */
    private static float m2827a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: b */
    private void m2845b(boolean z) {
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
        if (this.f3133A) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.f3168d = false;
        m2837a(i, !this.f3153U, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.f3135C) {
            this.f3135C = i;
            mo2989c();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f3181s;
        this.f3181s = i;
        int width = getWidth();
        m2835a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0726c.m2091a(getContext(), i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f3182t) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private C0982b m2842b(int i) {
        for (int i2 = 0; i2 < this.f3172j.size(); i2++) {
            C0982b bVar = (C0982b) this.f3172j.get(i2);
            if (bVar.f3202b == i) {
                return bVar;
            }
        }
        return null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f3182t = drawable;
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
    private C0982b m2843b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m2830a(view);
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
                C0982b a = m2830a(childAt);
                if (a != null && a.f3202b == this.f3167c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f3166b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f3185w))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f3186x))) {
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
                C0982b a = m2830a(childAt);
                if (a != null && a.f3202b == this.f3167c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        super.onRestoreInstanceState(savedState.f3119e);
        if (this.f3166b != null) {
            this.f3166b.restoreState(savedState.f3199b, savedState.f3200c);
            m2837a(savedState.f3198a, false, true);
            return;
        }
        this.f3175m = savedState.f3198a;
        this.f3176n = savedState.f3199b;
        this.f3177o = savedState.f3200c;
    }

    public DmtViewPager(Context context) {
        super(context);
        mo2958a();
    }

    /* renamed from: c */
    private boolean m2847c(int i) {
        if (this.f3172j.size() != 0) {
            C0982b f = m2852f();
            int clientWidth = getClientWidth();
            int i2 = this.f3181s + clientWidth;
            float f2 = (float) clientWidth;
            float f3 = ((float) this.f3181s) / f2;
            int i3 = f.f3202b;
            float f4 = ((((float) i) / f2) - f.f3205e) / (f.f3204d + f3);
            int i4 = (int) (((float) i2) * f4);
            this.f3155W = false;
            m2833a(i3, f4, i4);
            if (this.f3155W) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f3153U) {
            return false;
        } else {
            this.f3155W = false;
            m2833a(0, 0.0f, 0);
            if (this.f3155W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: d */
    private void m2849d(int i) {
        if (this.f3158ac != null) {
            this.f3158ac.onPageSelected(i);
        }
        if (this.f3157ab != null) {
            int size = this.f3157ab.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0997e eVar = (C0997e) this.f3157ab.get(i2);
                if (eVar != null) {
                    eVar.onPageSelected(i);
                }
            }
        }
        if (this.f3159ad != null) {
            this.f3159ad.onPageSelected(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L_0x005a
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0055
            int r0 = r6.getKeyCode()
            r3 = 61
            r4 = 2
            if (r0 == r3) goto L_0x003f
            switch(r0) {
                case 21: goto L_0x002d;
                case 22: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0055
        L_0x001b:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0026
            boolean r6 = r5.m2855i()
            goto L_0x0056
        L_0x0026:
            r6 = 66
            boolean r6 = r5.m2851e(r6)
            goto L_0x0056
        L_0x002d:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0038
            boolean r6 = r5.m2854h()
            goto L_0x0056
        L_0x0038:
            r6 = 17
            boolean r6 = r5.m2851e(r6)
            goto L_0x0056
        L_0x003f:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x004a
            boolean r6 = r5.m2851e(r4)
            goto L_0x0056
        L_0x004a:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L_0x0055
            boolean r6 = r5.m2851e(r1)
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            if (r6 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.view.DmtViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        boolean z;
        int i2;
        if (this.f3165ak != i) {
            this.f3165ak = i;
            if (this.f3160ae != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (z) {
                        i2 = this.f3161af;
                    } else {
                        i2 = 0;
                    }
                    getChildAt(i3).setLayerType(i2, null);
                }
            }
            if (this.f3158ac != null) {
                this.f3158ac.onPageScrollStateChanged(i);
            }
            if (this.f3157ab != null) {
                int size = this.f3157ab.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C0997e eVar = (C0997e) this.f3157ab.get(i4);
                    if (eVar != null) {
                        eVar.onPageScrollStateChanged(i);
                    }
                }
            }
            if (this.f3159ad != null) {
                this.f3159ad.onPageScrollStateChanged(i);
            }
        }
    }

    /* renamed from: a */
    private C0982b m2830a(View view) {
        for (int i = 0; i < this.f3172j.size(); i++) {
            C0982b bVar = (C0982b) this.f3172j.get(i);
            if (this.f3166b.isViewFromObject(view, bVar.f3201a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private boolean m2846b(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f3141I - f;
        this.f3141I = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f3185w * clientWidth;
        float f4 = this.f3186x * clientWidth;
        boolean z3 = false;
        C0982b bVar = (C0982b) this.f3172j.get(0);
        C0982b bVar2 = (C0982b) this.f3172j.get(this.f3172j.size() - 1);
        if (bVar.f3202b != 0) {
            f3 = bVar.f3205e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f3202b != this.f3166b.getCount() - 1) {
            f4 = bVar2.f3205e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f3151S.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f3152T.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f3141I += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m2847c(i);
        return z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2851e(int r7) {
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
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x009c
            if (r3 == r0) goto L_0x009c
            if (r7 != r5) goto L_0x007c
            android.graphics.Rect r1 = r6.f3174l
            android.graphics.Rect r1 = r6.m2828a(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3174l
            android.graphics.Rect r2 = r6.m2828a(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0077
            if (r1 < r2) goto L_0x0077
            boolean r2 = r6.m2854h()
            goto L_0x00af
        L_0x0077:
            boolean r2 = r3.requestFocus()
            goto L_0x00af
        L_0x007c:
            if (r7 != r4) goto L_0x00af
            android.graphics.Rect r1 = r6.f3174l
            android.graphics.Rect r1 = r6.m2828a(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3174l
            android.graphics.Rect r2 = r6.m2828a(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0097
            if (r1 > r2) goto L_0x0097
            boolean r2 = r6.m2855i()
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
            boolean r2 = r6.m2855i()
            goto L_0x00af
        L_0x00ab:
            boolean r2 = r6.m2854h()
        L_0x00af:
            if (r2 == 0) goto L_0x00b8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00b8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.view.DmtViewPager.m2851e(int):boolean");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && this.f3166b != null && this.f3166b.getCount() > 1)) {
            if (!this.f3151S.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f3185w * ((float) width));
                this.f3151S.setSize(height, width);
                z = false | this.f3151S.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f3152T.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f3186x + 1.0f)) * ((float) width2));
                this.f3152T.setSize(height2, width2);
                z |= this.f3152T.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f3151S.finish();
            this.f3152T.finish();
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
        if (this.f3181s > 0 && this.f3182t != null && this.f3172j.size() > 0 && this.f3166b != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.f3181s) / f4;
            int i = 0;
            C0982b bVar = (C0982b) this.f3172j.get(0);
            float f6 = bVar.f3205e;
            int size = this.f3172j.size();
            int i2 = bVar.f3202b;
            int i3 = ((C0982b) this.f3172j.get(size - 1)).f3202b;
            while (i2 < i3) {
                while (i2 > bVar.f3202b && i < size) {
                    i++;
                    bVar = (C0982b) this.f3172j.get(i);
                }
                if (i2 == bVar.f3202b) {
                    f2 = (bVar.f3205e + bVar.f3204d) * f4;
                    f = bVar.f3205e + bVar.f3204d + f5;
                } else {
                    float pageWidth = this.f3166b.getPageWidth(i2);
                    f = f6 + pageWidth + f5;
                    f2 = (f6 + pageWidth) * f4;
                }
                if (((float) this.f3181s) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.f3182t.setBounds(Math.round(f2), this.f3183u, Math.round(((float) this.f3181s) + f2), this.f3184v);
                    this.f3182t.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
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
        if (this.f3166b != null) {
            this.f3166b.setViewPagerObserver(null);
            this.f3166b.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f3172j.size(); i++) {
                C0982b bVar = (C0982b) this.f3172j.get(i);
                this.f3166b.destroyItem((ViewGroup) this, bVar.f3202b, bVar.f3201a);
            }
            this.f3166b.finishUpdate((ViewGroup) this);
            this.f3172j.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f3192a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f3167c = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.f3166b;
        this.f3166b = pagerAdapter;
        this.f3171g = 0;
        if (this.f3166b != null) {
            if (this.f3180r == null) {
                this.f3180r = new C0986f();
            }
            this.f3166b.setViewPagerObserver(this.f3180r);
            this.f3168d = false;
            boolean z = this.f3153U;
            this.f3153U = true;
            this.f3171g = this.f3166b.getCount();
            if (this.f3175m >= 0) {
                this.f3166b.restoreState(this.f3176n, this.f3177o);
                m2837a(this.f3175m, false, true);
                this.f3175m = -1;
                this.f3176n = null;
                this.f3177o = null;
            } else if (!z) {
                mo2989c();
            } else {
                requestLayout();
            }
        }
        if (this.f3170f != null && !this.f3170f.isEmpty()) {
            int size = this.f3170f.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((C0984d) this.f3170f.get(i3)).mo3024a(this, pagerAdapter2, pagerAdapter);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 3 || action == 1) {
            m2850e();
            return false;
        }
        if (action != 0) {
            if (this.f3136D) {
                return true;
            }
            if (this.f3137E) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f3143K = x;
            this.f3141I = x;
            float y = motionEvent.getY();
            this.f3144L = y;
            this.f3142J = y;
            this.f3145M = motionEvent2.getPointerId(0);
            this.f3137E = false;
            this.f3179q = true;
            this.f3178p.computeScrollOffset();
            if (this.f3165ak != 2 || Math.abs(this.f3178p.getFinalX() - this.f3178p.getCurrX()) <= this.f3150R) {
                m2841a(false);
                this.f3136D = false;
            } else {
                this.f3178p.abortAnimation();
                this.f3168d = false;
                mo2989c();
                this.f3136D = true;
                m2845b(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f3145M;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f2 = x2 - this.f3141I;
                float abs = Math.abs(f2);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f3144L);
                if (f2 != 0.0f) {
                    float f3 = this.f3141I;
                    if ((f3 >= ((float) this.f3139G) || f2 <= 0.0f) && (f3 <= ((float) (getWidth() - this.f3139G)) || f2 >= 0.0f)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        if (mo2984a(this, false, (int) f2, (int) x2, (int) y2)) {
                            this.f3141I = x2;
                            this.f3142J = y2;
                            this.f3137E = true;
                            return false;
                        }
                    }
                }
                if (abs > ((float) this.f3140H) && abs * 0.5f > abs2) {
                    this.f3136D = true;
                    m2845b(true);
                    setScrollState(1);
                    if (f2 > 0.0f) {
                        f = this.f3143K + ((float) this.f3140H);
                    } else {
                        f = this.f3143K - ((float) this.f3140H);
                    }
                    this.f3141I = f;
                    this.f3142J = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f3140H)) {
                    this.f3137E = true;
                }
                if (this.f3136D && m2846b(x2)) {
                    C1056u.m3052d(this);
                }
            }
        } else if (action == 6) {
            m2840a(motionEvent);
        }
        if (this.f3146N == null) {
            this.f3146N = VelocityTracker.obtain();
        }
        this.f3146N.addMovement(motionEvent2);
        return this.f3136D;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f3169e) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || this.f3166b == null || this.f3166b.getCount() == 0) {
            return false;
        }
        if (this.f3146N == null) {
            this.f3146N = VelocityTracker.obtain();
        }
        this.f3146N.addMovement(motionEvent);
        switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
            case 0:
                this.f3178p.abortAnimation();
                this.f3168d = false;
                mo2989c();
                float x = motionEvent.getX();
                this.f3143K = x;
                this.f3141I = x;
                float y = motionEvent.getY();
                this.f3144L = y;
                this.f3142J = y;
                this.f3145M = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.f3136D) {
                    VelocityTracker velocityTracker = this.f3146N;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f3148P);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.f3145M);
                    this.f3168d = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C0982b f3 = m2852f();
                    float f4 = (float) clientWidth;
                    float f5 = ((float) this.f3181s) / f4;
                    int i = f3.f3202b;
                    float f6 = ((((float) scrollX) / f4) - f3.f3205e) / (f3.f3204d + f5);
                    if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f3145M)) - this.f3143K)) <= this.f3149Q || Math.abs(xVelocity) <= this.f3147O) {
                        if (i >= this.f3167c) {
                            f = 0.4f;
                        } else {
                            f = 0.6f;
                        }
                        i += (int) (f6 + f);
                    } else if (xVelocity <= 0) {
                        i++;
                    }
                    if (this.f3172j.size() > 0) {
                        i = Math.max(((C0982b) this.f3172j.get(0)).f3202b, Math.min(i, ((C0982b) this.f3172j.get(this.f3172j.size() - 1)).f3202b));
                    }
                    m2838a(i, true, true, xVelocity);
                    z = m2850e();
                    break;
                }
                break;
            case 2:
                if (!this.f3136D) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3145M);
                    if (findPointerIndex == -1) {
                        z = m2850e();
                        break;
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f3141I);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f3142J);
                        if (abs > ((float) this.f3140H) && abs > abs2) {
                            this.f3136D = true;
                            m2845b(true);
                            if (x2 - this.f3143K > 0.0f) {
                                f2 = this.f3143K + ((float) this.f3140H);
                            } else {
                                f2 = this.f3143K - ((float) this.f3140H);
                            }
                            this.f3141I = f2;
                            this.f3142J = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f3136D) {
                    z = false | m2846b(motionEvent.getX(motionEvent.findPointerIndex(this.f3145M)));
                    break;
                }
                break;
            case 3:
                if (this.f3136D) {
                    m2836a(this.f3167c, true, 0, false);
                    z = m2850e();
                    break;
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f3141I = motionEvent.getX(actionIndex);
                this.f3145M = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                m2840a(motionEvent);
                this.f3141I = motionEvent.getX(motionEvent.findPointerIndex(this.f3145M));
                break;
        }
        if (z) {
            C1056u.m3052d(this);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r8.f3202b == r0.f3167c) goto L_0x006d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void mo49049a(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f3167c
            if (r2 == r1) goto L_0x0011
            int r2 = r0.f3167c
            android.support.v4.view.DmtViewPager$b r2 = r0.m2842b(r2)
            r0.f3167c = r1
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            android.support.v4.view.PagerAdapter r1 = r0.f3166b
            if (r1 != 0) goto L_0x001a
            r17.m2848d()
            return
        L_0x001a:
            boolean r1 = r0.f3168d
            if (r1 == 0) goto L_0x0022
            r17.m2848d()
            return
        L_0x0022:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            android.support.v4.view.PagerAdapter r1 = r0.f3166b
            r1.startUpdate(r0)
            int r1 = r0.f3135C
            int r4 = r0.f3167c
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            android.support.v4.view.PagerAdapter r6 = r0.f3166b
            int r6 = r6.getCount()
            int r7 = r6 + -1
            int r8 = r0.f3167c
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f3171g
            if (r6 != r7) goto L_0x0231
            r7 = 0
        L_0x004c:
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r8 = r0.f3172j
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x006c
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r8 = r0.f3172j
            java.lang.Object r8 = r8.get(r7)
            android.support.v4.view.DmtViewPager$b r8 = (android.support.p030v4.view.DmtViewPager.C0982b) r8
            int r9 = r8.f3202b
            int r10 = r0.f3167c
            if (r9 < r10) goto L_0x0069
            int r9 = r8.f3202b
            int r10 = r0.f3167c
            if (r9 != r10) goto L_0x006c
            goto L_0x006d
        L_0x0069:
            int r7 = r7 + 1
            goto L_0x004c
        L_0x006c:
            r8 = 0
        L_0x006d:
            if (r8 != 0) goto L_0x0077
            if (r6 <= 0) goto L_0x0077
            int r8 = r0.f3167c
            android.support.v4.view.DmtViewPager$b r8 = r0.m2829a(r8, r7)
        L_0x0077:
            r9 = 0
            if (r8 == 0) goto L_0x01b2
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0087
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r11 = r0.f3172j
            java.lang.Object r11 = r11.get(r10)
            android.support.v4.view.DmtViewPager$b r11 = (android.support.p030v4.view.DmtViewPager.C0982b) r11
            goto L_0x0088
        L_0x0087:
            r11 = 0
        L_0x0088:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x0092
            r3 = 0
            goto L_0x009f
        L_0x0092:
            float r14 = r8.f3204d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x009f:
            int r14 = r0.f3167c
            int r14 = r14 + -1
            r15 = r10
            r10 = r7
            r7 = 0
        L_0x00a6:
            if (r14 < 0) goto L_0x0105
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00d3
            if (r14 >= r4) goto L_0x00d3
            if (r11 == 0) goto L_0x0105
            int r5 = r11.f3202b
            if (r14 != r5) goto L_0x0101
            boolean r5 = r11.f3203c
            if (r5 != 0) goto L_0x0101
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            r5.remove(r15)
            android.support.v4.view.PagerAdapter r5 = r0.f3166b
            java.lang.Object r11 = r11.f3201a
            r5.destroyItem(r0, r14, r11)
            int r15 = r15 + -1
            int r10 = r10 + -1
            if (r15 < 0) goto L_0x00ff
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            java.lang.Object r5 = r5.get(r15)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p030v4.view.DmtViewPager.C0982b) r5
            goto L_0x0100
        L_0x00d3:
            if (r11 == 0) goto L_0x00e9
            int r5 = r11.f3202b
            if (r14 != r5) goto L_0x00e9
            float r5 = r11.f3204d
            float r7 = r7 + r5
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x00ff
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            java.lang.Object r5 = r5.get(r15)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p030v4.view.DmtViewPager.C0982b) r5
            goto L_0x0100
        L_0x00e9:
            int r5 = r15 + 1
            android.support.v4.view.DmtViewPager$b r5 = r0.m2829a(r14, r5)
            float r5 = r5.f3204d
            float r7 = r7 + r5
            int r10 = r10 + 1
            if (r15 < 0) goto L_0x00ff
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            java.lang.Object r5 = r5.get(r15)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p030v4.view.DmtViewPager.C0982b) r5
            goto L_0x0100
        L_0x00ff:
            r5 = 0
        L_0x0100:
            r11 = r5
        L_0x0101:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x00a6
        L_0x0105:
            float r3 = r8.f3204d
            int r4 = r10 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0196
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x011e
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p030v4.view.DmtViewPager.C0982b) r5
            goto L_0x011f
        L_0x011e:
            r5 = 0
        L_0x011f:
            if (r12 > 0) goto L_0x0123
            r7 = 0
            goto L_0x012b
        L_0x0123:
            int r7 = r17.getPaddingRight()
            float r7 = (float) r7
            float r11 = (float) r12
            float r7 = r7 / r11
            float r7 = r7 + r13
        L_0x012b:
            int r11 = r0.f3167c
        L_0x012d:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0196
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x0160
            if (r11 <= r1) goto L_0x0160
            if (r5 == 0) goto L_0x0196
            int r12 = r5.f3202b
            if (r11 != r12) goto L_0x0195
            boolean r12 = r5.f3203c
            if (r12 != 0) goto L_0x0195
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r12 = r0.f3172j
            r12.remove(r4)
            android.support.v4.view.PagerAdapter r12 = r0.f3166b
            java.lang.Object r5 = r5.f3201a
            r12.destroyItem(r0, r11, r5)
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p030v4.view.DmtViewPager.C0982b) r5
            goto L_0x0195
        L_0x015e:
            r5 = 0
            goto L_0x0195
        L_0x0160:
            if (r5 == 0) goto L_0x017c
            int r12 = r5.f3202b
            if (r11 != r12) goto L_0x017c
            float r5 = r5.f3204d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p030v4.view.DmtViewPager.C0982b) r5
            goto L_0x0195
        L_0x017c:
            android.support.v4.view.DmtViewPager$b r5 = r0.m2829a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f3204d
            float r3 = r3 + r5
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015e
            java.util.ArrayList<android.support.v4.view.DmtViewPager$b> r5 = r0.f3172j
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.DmtViewPager$b r5 = (android.support.p030v4.view.DmtViewPager.C0982b) r5
        L_0x0195:
            goto L_0x012d
        L_0x0196:
            r0.m2839a(r8, r10, r2)
            java.lang.Object r1 = r8.f3201a
            boolean r1 = r1 instanceof android.support.p030v4.app.Fragment
            if (r1 == 0) goto L_0x01b2
            java.lang.Object r1 = r8.f3201a
            android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x01b2
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L_0x01b2
            r17.requestLayout()
        L_0x01b2:
            android.support.v4.view.PagerAdapter r1 = r0.f3166b
            int r2 = r0.f3167c
            if (r8 == 0) goto L_0x01bb
            java.lang.Object r3 = r8.f3201a
            goto L_0x01bc
        L_0x01bb:
            r3 = 0
        L_0x01bc:
            r1.setPrimaryItem(r0, r2, r3)
            android.support.v4.view.PagerAdapter r1 = r0.f3166b
            r1.finishUpdate(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01c9:
            if (r2 >= r1) goto L_0x01f2
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.support.v4.view.DmtViewPager$LayoutParams r4 = (android.support.p030v4.view.DmtViewPager.LayoutParams) r4
            r4.f3197f = r2
            boolean r5 = r4.f3192a
            if (r5 != 0) goto L_0x01ef
            float r5 = r4.f3194c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01ef
            android.support.v4.view.DmtViewPager$b r3 = r0.m2830a(r3)
            if (r3 == 0) goto L_0x01ef
            float r5 = r3.f3204d
            r4.f3194c = r5
            int r3 = r3.f3202b
            r4.f3196e = r3
        L_0x01ef:
            int r2 = r2 + 1
            goto L_0x01c9
        L_0x01f2:
            r17.m2848d()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0230
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x0206
            android.support.v4.view.DmtViewPager$b r3 = r0.m2843b(r1)
            goto L_0x0207
        L_0x0206:
            r3 = 0
        L_0x0207:
            if (r3 == 0) goto L_0x020f
            int r1 = r3.f3202b
            int r2 = r0.f3167c
            if (r1 == r2) goto L_0x0230
        L_0x020f:
            r1 = 0
        L_0x0210:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x0230
            android.view.View r2 = r0.getChildAt(r1)
            android.support.v4.view.DmtViewPager$b r3 = r0.m2830a(r2)
            if (r3 == 0) goto L_0x022d
            int r3 = r3.f3202b
            int r4 = r0.f3167c
            if (r3 != r4) goto L_0x022d
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 != 0) goto L_0x0230
        L_0x022d:
            int r1 = r1 + 1
            goto L_0x0210
        L_0x0230:
            return
        L_0x0231:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x023e }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x023e }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x023e }
            goto L_0x0246
        L_0x023e:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0246:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.f3171g
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            android.support.v4.view.PagerAdapter r1 = r0.f3166b
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.view.DmtViewPager.mo49049a(int):void");
    }

    /* renamed from: b */
    public void mo2959b(C0997e eVar) {
        if (this.f3157ab != null) {
            this.f3157ab.remove(eVar);
        }
    }

    /* renamed from: a */
    public void mo2956a(int i, boolean z) {
        this.f3168d = false;
        m2837a(i, z, false);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f3162ag == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.f3163ah.get(i2)).getLayoutParams()).f3197f;
    }

    /* renamed from: a */
    private C0982b m2829a(int i, int i2) {
        C0982b bVar = new C0982b();
        bVar.f3202b = i;
        bVar.f3201a = this.f3166b.instantiateItem((ViewGroup) this, i);
        bVar.f3204d = this.f3166b.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f3172j.size()) {
            this.f3172j.add(bVar);
        } else {
            this.f3172j.add(i2, bVar);
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
                C0982b a = m2830a(childAt);
                if (a != null && a.f3202b == this.f3167c && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    /* renamed from: a */
    private Rect m2828a(Rect rect, View view) {
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

    public DmtViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2958a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
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
            int r2 = r16.getMeasuredWidth()
            int r3 = r2 / 10
            int r4 = r0.f3138F
            int r3 = java.lang.Math.min(r3, r4)
            r0.f3139G = r3
            int r3 = r16.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r16.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r16.getMeasuredHeight()
            int r4 = r16.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r16.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r16.getChildCount()
            r5 = r3
            r3 = r2
            r2 = 0
        L_0x003f:
            r6 = 8
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r4) goto L_0x00c6
            android.view.View r9 = r0.getChildAt(r2)
            int r10 = r9.getVisibility()
            if (r10 == r6) goto L_0x00c1
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            android.support.v4.view.DmtViewPager$LayoutParams r6 = (android.support.p030v4.view.DmtViewPager.LayoutParams) r6
            if (r6 == 0) goto L_0x00c1
            boolean r10 = r6.f3192a
            if (r10 == 0) goto L_0x00c1
            int r10 = r6.f3193b
            r10 = r10 & 7
            int r11 = r6.f3193b
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r11 == r12) goto L_0x006f
            r12 = 80
            if (r11 != r12) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r11 = 0
            goto L_0x0070
        L_0x006f:
            r11 = 1
        L_0x0070:
            r12 = 3
            if (r10 == r12) goto L_0x0078
            r12 = 5
            if (r10 != r12) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x0081
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x007e:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0085
        L_0x0081:
            if (r7 == 0) goto L_0x007e
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0085:
            int r13 = r6.width
            r14 = -1
            r15 = -2
            if (r13 == r15) goto L_0x0097
            int r10 = r6.width
            if (r10 == r14) goto L_0x0093
            int r10 = r6.width
            r13 = r10
            goto L_0x0094
        L_0x0093:
            r13 = r3
        L_0x0094:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0098
        L_0x0097:
            r13 = r3
        L_0x0098:
            int r1 = r6.height
            if (r1 == r15) goto L_0x00a5
            int r1 = r6.height
            if (r1 == r14) goto L_0x00a3
            int r1 = r6.height
            goto L_0x00a7
        L_0x00a3:
            r1 = r5
            goto L_0x00a7
        L_0x00a5:
            r1 = r5
            r8 = r12
        L_0x00a7:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r10)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r9.measure(r6, r1)
            if (r11 == 0) goto L_0x00ba
            int r1 = r9.getMeasuredHeight()
            int r5 = r5 - r1
            goto L_0x00c1
        L_0x00ba:
            if (r7 == 0) goto L_0x00c1
            int r1 = r9.getMeasuredWidth()
            int r3 = r3 - r1
        L_0x00c1:
            int r2 = r2 + 1
            r1 = 0
            goto L_0x003f
        L_0x00c6:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r0.f3187y = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            r0.f3188z = r1
            r0.f3133A = r7
            r16.mo2989c()
            r1 = 0
            r0.f3133A = r1
            int r2 = r16.getChildCount()
        L_0x00de:
            if (r1 >= r2) goto L_0x0108
            android.view.View r4 = r0.getChildAt(r1)
            int r5 = r4.getVisibility()
            if (r5 == r6) goto L_0x0105
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v4.view.DmtViewPager$LayoutParams r5 = (android.support.p030v4.view.DmtViewPager.LayoutParams) r5
            if (r5 == 0) goto L_0x00f6
            boolean r7 = r5.f3192a
            if (r7 != 0) goto L_0x0105
        L_0x00f6:
            float r7 = (float) r3
            float r5 = r5.f3194c
            float r7 = r7 * r5
            int r5 = (int) r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r7 = r0.f3188z
            r4.measure(r5, r7)
        L_0x0105:
            int r1 = r1 + 1
            goto L_0x00de
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.view.DmtViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m2837a(int i, boolean z, boolean z2) {
        m2838a(i, z, z2, 0);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z2 = layoutParams2.f3192a;
        if (view.getClass().getAnnotation(C0981a.class) != null) {
            z = true;
        } else {
            z = false;
        }
        layoutParams2.f3192a = z2 | z;
        if (!this.f3133A) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f3192a) {
            layoutParams2.f3195d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    private void m2844b(int i, float f, int i2) {
        if (this.f3158ac != null) {
            this.f3158ac.onPageScrolled(i, f, i2);
        }
        if (this.f3157ab != null) {
            int size = this.f3157ab.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0997e eVar = (C0997e) this.f3157ab.get(i3);
                if (eVar != null) {
                    eVar.onPageScrolled(i, f, i2);
                }
            }
        }
        if (this.f3159ad != null) {
            this.f3159ad.onPageScrolled(i, f, i2);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0982b a = m2830a(childAt);
                    if (a != null && a.f3202b == this.f3167c) {
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

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2833a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f3156aa
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = 0
        L_0x001d:
            if (r3 >= r6) goto L_0x006c
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            android.support.v4.view.DmtViewPager$LayoutParams r9 = (android.support.p030v4.view.DmtViewPager.LayoutParams) r9
            boolean r10 = r9.f3192a
            if (r10 == 0) goto L_0x0069
            int r9 = r9.f3193b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004e
            r10 = 3
            if (r9 == r10) goto L_0x0048
            r10 = 5
            if (r9 == r10) goto L_0x003b
            r9 = r4
            goto L_0x005d
        L_0x003b:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L_0x005a
        L_0x0048:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L_0x005d
        L_0x004e:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L_0x005a:
            r11 = r9
            r9 = r4
            r4 = r11
        L_0x005d:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0068
            r8.offsetLeftAndRight(r4)
        L_0x0068:
            r4 = r9
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x006c:
            r12.m2844b(r13, r14, r15)
            android.support.v4.view.DmtViewPager$e r13 = r12.f3160ae
            if (r13 == 0) goto L_0x0093
            r12.getScrollX()
            int r13 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r13) goto L_0x0093
            android.view.View r14 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            android.support.v4.view.DmtViewPager$LayoutParams r15 = (android.support.p030v4.view.DmtViewPager.LayoutParams) r15
            boolean r15 = r15.f3192a
            if (r15 != 0) goto L_0x0090
            r14.getLeft()
            r12.getClientWidth()
        L_0x0090:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x0093:
            r12.f3155W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.view.DmtViewPager.m2833a(int, float, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m2835a(i, i3, this.f3181s, this.f3181s);
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
        int scrollX = getScrollX();
        int i9 = paddingBottom;
        int i10 = 0;
        int i11 = paddingTop;
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f3192a) {
                    int i14 = layoutParams.f3193b & 7;
                    int i15 = layoutParams.f3193b & 112;
                    if (i14 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i12);
                    } else if (i14 == 3) {
                        i5 = i12;
                        i12 = childAt.getMeasuredWidth() + i12;
                    } else if (i14 != 5) {
                        i5 = i12;
                    } else {
                        i5 = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i15 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, i11);
                    } else if (i15 == 48) {
                        i6 = i11;
                        i11 = childAt.getMeasuredHeight() + i11;
                    } else if (i15 != 80) {
                        i6 = i11;
                    } else {
                        i6 = (i8 - i9) - childAt.getMeasuredHeight();
                        i9 += childAt.getMeasuredHeight();
                    }
                    int i16 = i5 + scrollX;
                    childAt.layout(i16, i6, childAt.getMeasuredWidth() + i16, i6 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i17 = (i7 - i12) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f3192a) {
                    C0982b a = m2830a(childAt2);
                    if (a != null) {
                        float f = (float) i17;
                        int i19 = ((int) (a.f3205e * f)) + i12;
                        if (layoutParams2.f3195d) {
                            layoutParams2.f3195d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f3194c), 1073741824), MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                        }
                        childAt2.layout(i19, i11, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + i11);
                    }
                }
            }
        }
        this.f3183u = i11;
        this.f3184v = i8 - i9;
        this.f3156aa = i10;
        if (this.f3153U) {
            z2 = false;
            m2836a(this.f3167c, false, 0, false);
        } else {
            z2 = false;
        }
        this.f3153U = z2;
    }
}
