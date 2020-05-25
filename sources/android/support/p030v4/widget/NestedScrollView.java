package android.support.p030v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1046k;
import android.support.p030v4.view.C1047l;
import android.support.p030v4.view.C1049n;
import android.support.p030v4.view.C1050o;
import android.support.p030v4.view.C1053r;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p041a.C1008c;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements C1046k, C1049n, C1053r {

    /* renamed from: w */
    private static final C1077a f3383w = new C1077a();

    /* renamed from: x */
    private static final int[] f3384x = {16843130};

    /* renamed from: A */
    private float f3385A;

    /* renamed from: B */
    private C1078b f3386B;

    /* renamed from: a */
    public boolean f3387a;

    /* renamed from: b */
    public boolean f3388b;

    /* renamed from: c */
    private long f3389c;

    /* renamed from: d */
    private final Rect f3390d;

    /* renamed from: e */
    private OverScroller f3391e;

    /* renamed from: f */
    private EdgeEffect f3392f;

    /* renamed from: g */
    private EdgeEffect f3393g;

    /* renamed from: h */
    private int f3394h;

    /* renamed from: i */
    private boolean f3395i;

    /* renamed from: j */
    private boolean f3396j;

    /* renamed from: k */
    private View f3397k;

    /* renamed from: l */
    private boolean f3398l;

    /* renamed from: m */
    private VelocityTracker f3399m;

    /* renamed from: n */
    private int f3400n;

    /* renamed from: o */
    private int f3401o;

    /* renamed from: p */
    private int f3402p;

    /* renamed from: q */
    private int f3403q;

    /* renamed from: r */
    private final int[] f3404r;

    /* renamed from: s */
    private final int[] f3405s;

    /* renamed from: t */
    private int f3406t;

    /* renamed from: u */
    private int f3407u;

    /* renamed from: v */
    private SavedState f3408v;

    /* renamed from: y */
    private final C1050o f3409y;

    /* renamed from: z */
    private final C1047l f3410z;

    /* renamed from: android.support.v4.widget.NestedScrollView$SavedState */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        public int f3411a;

        public String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f3411a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3411a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3411a);
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C1077a extends C1002a {
        C1077a() {
        }

        /* renamed from: a */
        public final void mo1119a(View view, C1008c cVar) {
            super.mo1119a(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo3139b((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    cVar.mo3164j(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        cVar.mo3130a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        cVar.mo3130a(4096);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo1322a(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.mo1322a(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            int scrollX = nestedScrollView.getScrollX();
            if (VERSION.SDK_INT >= 15) {
                accessibilityEvent.setMaxScrollX(scrollX);
            }
            int scrollRange = nestedScrollView.getScrollRange();
            if (VERSION.SDK_INT >= 15) {
                accessibilityEvent.setMaxScrollY(scrollRange);
            }
        }

        /* renamed from: a */
        public final boolean mo1246a(View view, int i, Bundle bundle) {
            if (super.mo1246a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo3342a(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo3342a(0, max);
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C1078b {
        /* renamed from: a */
        void mo3394a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: b */
    private static int m3145b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    public final boolean mo1330a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* renamed from: a */
    public final void mo1327a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        m3140a(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    /* renamed from: a */
    public final void mo1328a(View view, int i, int i2, int[] iArr, int i3) {
        m3141a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: a */
    public final boolean mo3343a(KeyEvent keyEvent) {
        this.f3390d.setEmpty();
        boolean z = false;
        int i = 130;
        if (m3137a()) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 62) {
                    switch (keyCode) {
                        case 19:
                            if (keyEvent.isAltPressed()) {
                                z = m3154d(33);
                                break;
                            } else {
                                z = m3156e(33);
                                break;
                            }
                        case 20:
                            if (keyEvent.isAltPressed()) {
                                z = m3154d(130);
                                break;
                            } else {
                                z = m3156e(130);
                                break;
                            }
                    }
                } else {
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    m3152c(i);
                }
            }
            return z;
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m3142a(View view) {
        return !m3143a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m3143a(View view, int i, int i2) {
        view.getDrawingRect(this.f3390d);
        offsetDescendantRectToMyCoords(view, this.f3390d);
        return this.f3390d.bottom + i >= getScrollY() && this.f3390d.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    public final void mo3342a(int i, int i2) {
        m3151c(0 - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: a */
    private static boolean m3144a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m3144a((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int getNestedScrollAxes() {
        return this.f3409y.f3334a;
    }

    public boolean hasNestedScrollingParent() {
        return m3148b(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3410z.f3329a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3396j = false;
    }

    public void requestLayout() {
        this.f3395i = true;
        super.requestLayout();
    }

    public void stopNestedScroll() {
        mo3220a(0);
    }

    /* renamed from: c */
    private void m3150c() {
        if (this.f3399m != null) {
            this.f3399m.recycle();
            this.f3399m = null;
        }
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3411a = getScrollY();
        return savedState;
    }

    /* renamed from: b */
    private void m3146b() {
        if (this.f3399m == null) {
            this.f3399m = VelocityTracker.obtain();
        }
    }

    /* renamed from: d */
    private void m3153d() {
        this.f3398l = false;
        m3150c();
        mo3220a(0);
        if (this.f3392f != null) {
            this.f3392f.onRelease();
            this.f3393g.onRelease();
        }
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: e */
    private void m3155e() {
        if (getOverScrollMode() == 2) {
            this.f3392f = null;
            this.f3393g = null;
        } else if (this.f3392f == null) {
            Context context = getContext();
            this.f3392f = new EdgeEffect(context);
            this.f3393g = new EdgeEffect(context);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3385A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f3385A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3385A;
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public void computeScroll() {
        boolean z;
        if (this.f3391e.computeScrollOffset()) {
            this.f3391e.getCurrX();
            int currY = this.f3391e.getCurrY();
            int i = currY - this.f3407u;
            if (m3141a(0, i, this.f3405s, (int[]) null, 1)) {
                i -= this.f3405s[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY;
                m3139a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i3;
                if (!m3140a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m3155e();
                        if (currY <= 0 && i3 > 0) {
                            this.f3392f.onAbsorb((int) this.f3391e.getCurrVelocity());
                        } else if (currY >= scrollRange && i3 < scrollRange) {
                            this.f3393g.onAbsorb((int) this.f3391e.getCurrVelocity());
                        }
                    }
                }
            }
            this.f3407u = currY;
            C1056u.m3052d(this);
            return;
        }
        if (m3148b(1)) {
            mo3220a(1);
        }
        this.f3407u = 0;
    }

    /* renamed from: a */
    private boolean m3137a() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public void setOnScrollChangeListener(C1078b bVar) {
        this.f3386B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3388b = z;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private boolean m3148b(int i) {
        return this.f3410z.mo3225a(i);
    }

    /* renamed from: a */
    public final void mo3220a(int i) {
        this.f3410z.mo3233c(i);
    }

    public void onStopNestedScroll(View view) {
        mo1332b(view, 0);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f3410z.mo3221a(z);
    }

    public boolean startNestedScroll(int i) {
        return m3149b(i, 0);
    }

    /* renamed from: f */
    private void m3157f(int i) {
        if (i != 0) {
            if (this.f3388b) {
                m3151c(0, i);
                return;
            }
            scrollBy(0, i);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m3150c();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3387a) {
            this.f3387a = z;
            requestLayout();
        }
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || mo3343a(keyEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3408v = savedState;
        requestLayout();
    }

    /* renamed from: a */
    private void m3136a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3403q) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f3394h = (int) motionEvent.getY(i);
            this.f3403q = motionEvent.getPointerId(i);
            if (this.f3399m != null) {
                this.f3399m.clear();
            }
        }
    }

    /* renamed from: b */
    private void m3147b(View view) {
        view.getDrawingRect(this.f3390d);
        offsetDescendantRectToMyCoords(view, this.f3390d);
        int a = m3134a(this.f3390d);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: g */
    private void m3158g(int i) {
        if (getChildCount() > 0) {
            m3149b(2, 1);
            this.f3391e.fling(getScrollX(), getScrollY(), 0, i, 0, 0, DynamicTabYellowPointVersion.DEFAULT, Integer.MAX_VALUE, 0, 0);
            this.f3407u = getScrollY();
            C1056u.m3052d(this);
        }
    }

    /* renamed from: h */
    private void m3159h(int i) {
        boolean z;
        int scrollY = getScrollY();
        if ((scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0)) {
            z = true;
        } else {
            z = false;
        }
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            m3158g(i);
        }
    }

    /* renamed from: a */
    private int m3134a(Rect rect) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i5 - verticalFadingEdgeLength;
        } else {
            i = i5;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = (rect.top - scrollY) + 0;
            } else {
                i3 = (rect.bottom - i) + 0;
            }
            i4 = Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        } else if (rect.top < scrollY && rect.bottom < i) {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            i4 = Math.max(i2, -getScrollY());
        }
        return i4;
    }

    /* renamed from: d */
    private boolean m3154d(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        this.f3390d.top = 0;
        this.f3390d.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                this.f3390d.bottom = childAt.getBottom() + layoutParams.bottomMargin + getPaddingBottom();
                this.f3390d.top = this.f3390d.bottom - height;
            }
        }
        return m3138a(i, this.f3390d.top, this.f3390d.bottom);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f3398l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m3152c(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            this.f3390d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.f3390d.top + height > bottom) {
                    this.f3390d.top = bottom - height;
                }
            }
        } else {
            this.f3390d.top = getScrollY() - height;
            if (this.f3390d.top < 0) {
                this.f3390d.top = 0;
            }
        }
        this.f3390d.bottom = this.f3390d.top + height;
        return m3138a(i, this.f3390d.top, this.f3390d.bottom);
    }

    /* renamed from: e */
    private boolean m3156e(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m3143a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3157f(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3390d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3390d);
            m3157f(m3134a(this.f3390d));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m3142a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f3392f != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f3392f.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f3392f.setSize(width, height);
                if (this.f3392f.draw(canvas)) {
                    C1056u.m3052d(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f3393g.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f3393g.setSize(width2, height2);
                if (this.f3393g.draw(canvas)) {
                    C1056u.m3052d(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000d
            boolean r3 = r12.f3398l
            if (r3 == 0) goto L_0x000d
            return r2
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 6
            if (r0 == r3) goto L_0x00e6
            r3 = -1
            r4 = 0
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x0054;
                case 2: goto L_0x0019;
                case 3: goto L_0x0054;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x00e9
        L_0x0019:
            int r0 = r12.f3403q
            if (r0 == r3) goto L_0x00e9
            int r0 = r13.findPointerIndex(r0)
            if (r0 == r3) goto L_0x00e9
            float r0 = r13.getY(r0)
            int r0 = (int) r0
            int r3 = r12.f3394h
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.f3400n
            if (r3 <= r5) goto L_0x00e9
            int r3 = r12.getNestedScrollAxes()
            r1 = r1 & r3
            if (r1 != 0) goto L_0x00e9
            r12.f3398l = r2
            r12.f3394h = r0
            r12.m3146b()
            android.view.VelocityTracker r0 = r12.f3399m
            r0.addMovement(r13)
            r12.f3406t = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x00e9
            r13.requestDisallowInterceptTouchEvent(r2)
            goto L_0x00e9
        L_0x0054:
            r12.f3398l = r4
            r12.f3403q = r3
            r12.m3150c()
            android.widget.OverScroller r5 = r12.f3391e
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x0075
            android.support.p030v4.view.C1056u.m3052d(r12)
        L_0x0075:
            r12.mo3220a(r4)
            goto L_0x00e9
        L_0x007a:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r3 = r13.getX()
            int r3 = (int) r3
            int r5 = r12.getChildCount()
            if (r5 <= 0) goto L_0x00ae
            int r5 = r12.getScrollY()
            android.view.View r6 = r12.getChildAt(r4)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00ae
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00ae
            int r5 = r6.getLeft()
            if (r3 < r5) goto L_0x00ae
            int r5 = r6.getRight()
            if (r3 >= r5) goto L_0x00ae
            r3 = 1
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            if (r3 != 0) goto L_0x00b7
            r12.f3398l = r4
            r12.m3150c()
            goto L_0x00e9
        L_0x00b7:
            r12.f3394h = r0
            int r0 = r13.getPointerId(r4)
            r12.f3403q = r0
            android.view.VelocityTracker r0 = r12.f3399m
            if (r0 != 0) goto L_0x00ca
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f3399m = r0
            goto L_0x00cf
        L_0x00ca:
            android.view.VelocityTracker r0 = r12.f3399m
            r0.clear()
        L_0x00cf:
            android.view.VelocityTracker r0 = r12.f3399m
            r0.addMovement(r13)
            android.widget.OverScroller r13 = r12.f3391e
            r13.computeScrollOffset()
            android.widget.OverScroller r13 = r12.f3391e
            boolean r13 = r13.isFinished()
            r13 = r13 ^ r2
            r12.f3398l = r13
            r12.m3149b(r1, r4)
            goto L_0x00e9
        L_0x00e6:
            r12.m3136a(r13)
        L_0x00e9:
            boolean r13 = r12.f3398l
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        m3146b();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3406t = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f3406t);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z2 = !this.f3391e.isFinished();
                    this.f3398l = z2;
                    if (z2) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.f3391e.isFinished()) {
                        this.f3391e.abortAnimation();
                    }
                    this.f3394h = (int) motionEvent.getY();
                    this.f3403q = motionEvent2.getPointerId(0);
                    m3149b(2, 0);
                    break;
                } else {
                    return false;
                }
            case 1:
                VelocityTracker velocityTracker = this.f3399m;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f3402p);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3403q);
                if (Math.abs(yVelocity) > this.f3401o) {
                    m3159h(-yVelocity);
                } else if (this.f3391e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C1056u.m3052d(this);
                }
                this.f3403q = -1;
                m3153d();
                break;
            case 2:
                int findPointerIndex = motionEvent2.findPointerIndex(this.f3403q);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i = this.f3394h - y;
                    if (m3141a(0, i, this.f3405s, this.f3404r, 0)) {
                        i -= this.f3405s[1];
                        obtain.offsetLocation(0.0f, (float) this.f3404r[1]);
                        this.f3406t += this.f3404r[1];
                    }
                    if (!this.f3398l && Math.abs(i) > this.f3400n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3398l = true;
                        if (i > 0) {
                            i -= this.f3400n;
                        } else {
                            i += this.f3400n;
                        }
                    }
                    int i2 = i;
                    if (this.f3398l) {
                        this.f3394h = y - this.f3404r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i3 = scrollRange;
                        int i4 = i2;
                        int i5 = findPointerIndex;
                        if (m3139a(0, i2, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !m3148b(0)) {
                            this.f3399m.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!m3140a(0, scrollY2, 0, i4 - scrollY2, this.f3404r, 0)) {
                            if (z) {
                                m3155e();
                                int i6 = scrollY + i4;
                                if (i6 < 0) {
                                    C1109i.m3233a(this.f3392f, ((float) i4) / ((float) getHeight()), motionEvent2.getX(i5) / ((float) getWidth()));
                                    if (!this.f3393g.isFinished()) {
                                        this.f3393g.onRelease();
                                    }
                                } else {
                                    int i7 = i5;
                                    if (i6 > i3) {
                                        C1109i.m3233a(this.f3393g, ((float) i4) / ((float) getHeight()), 1.0f - (motionEvent2.getX(i7) / ((float) getWidth())));
                                        if (!this.f3392f.isFinished()) {
                                            this.f3392f.onRelease();
                                        }
                                    }
                                }
                                if (this.f3392f != null && (!this.f3392f.isFinished() || !this.f3393g.isFinished())) {
                                    C1056u.m3052d(this);
                                    break;
                                }
                            }
                        } else {
                            this.f3394h -= this.f3404r[1];
                            obtain.offsetLocation(0.0f, (float) this.f3404r[1]);
                            this.f3406t += this.f3404r[1];
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (this.f3398l && getChildCount() > 0 && this.f3391e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C1056u.m3052d(this);
                }
                this.f3403q = -1;
                m3153d();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f3394h = (int) motionEvent2.getY(actionIndex);
                this.f3403q = motionEvent2.getPointerId(actionIndex);
                break;
            case 6:
                m3136a(motionEvent);
                this.f3394h = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f3403q));
                break;
        }
        if (this.f3399m != null) {
            this.f3399m.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3410z.mo3223a(f, f2);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3395i) {
            m3147b(view2);
        } else {
            this.f3397k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m3142a(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* renamed from: b */
    private boolean m3149b(int i, int i2) {
        return this.f3410z.mo3226a(i, i2);
    }

    /* renamed from: c */
    private void m3151c(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3389c > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
                this.f3407u = getScrollY();
                this.f3391e.startScroll(getScrollX(), scrollY, 0, max);
                C1056u.m3052d(this);
            } else {
                if (!this.f3391e.isFinished()) {
                    this.f3391e.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f3389c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3387a && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int b = m3145b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int b2 = m3145b(i2, height, height2);
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public final void mo1332b(View view, int i) {
        this.f3409y.mo3235a(view, i);
        mo3220a(i);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3410z.mo3224a(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1333b(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1330a(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = m3134a(rect);
        if (a != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m3151c(0, a);
            }
        }
        return z2;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3390d = new Rect();
        this.f3395i = true;
        this.f3396j = false;
        this.f3397k = null;
        this.f3398l = false;
        this.f3388b = true;
        this.f3403q = -1;
        this.f3404r = new int[2];
        this.f3405s = new int[2];
        this.f3391e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3400n = viewConfiguration.getScaledTouchSlop();
        this.f3401o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3402p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3384x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3409y = new C1050o(this);
        this.f3410z = new C1047l(this);
        setNestedScrollingEnabled(true);
        C1056u.m3031a((View) this, (C1002a) f3383w);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: a */
    private View m3135a(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                if (i >= top || bottom >= i2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (view == null) {
                    view = view2;
                    z4 = z2;
                } else {
                    if ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z4) {
                        if (z2) {
                            if (!z3) {
                            }
                        }
                    } else if (z2) {
                        view = view2;
                        z4 = true;
                    } else if (!z3) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private boolean m3138a(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View a = m3135a(z, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            m3157f(i4);
            z2 = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m3141a(i, i2, iArr, iArr2, 0);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m3159h((int) f2);
        return true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1328a(view, i, i2, iArr, 0);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f3386B != null) {
            this.f3386B.mo3394a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (!(findFocus == null || this == findFocus || !m3143a(findFocus, 0, i4))) {
            findFocus.getDrawingRect(this.f3390d);
            offsetDescendantRectToMyCoords(findFocus, this.f3390d);
            m3157f(m3134a(this.f3390d));
        }
    }

    /* renamed from: b */
    public final void mo1333b(View view, View view2, int i, int i2) {
        this.f3409y.mo3237a(view, view2, i, i2);
        m3149b(2, i2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m3140a(i, i2, i3, i4, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1327a(view, i, i2, i3, i4, 0);
    }

    /* renamed from: a */
    private boolean m3141a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3410z.mo3230a(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3395i = false;
        if (this.f3397k != null && m3144a(this.f3397k, (View) this)) {
            m3147b(this.f3397k);
        }
        this.f3397k = null;
        if (!this.f3396j) {
            if (this.f3408v != null) {
                scrollTo(getScrollX(), this.f3408v.f3411a);
                this.f3408v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b = m3145b(scrollY, paddingTop, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3396j = true;
    }

    /* renamed from: a */
    private boolean m3140a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f3410z.mo3228a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    private boolean m3139a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i9 = i3 + 0;
        int i10 = i4 + i2;
        int i11 = i6 + 0;
        if (i9 <= 0 && i9 >= 0) {
            z2 = false;
        } else {
            i9 = 0;
            z2 = true;
        }
        if (i10 > i11) {
            z3 = true;
        } else if (i10 < 0) {
            z3 = true;
            i11 = 0;
        } else {
            i11 = i10;
            z3 = false;
        }
        if (z3 && !m3148b(1)) {
            this.f3391e.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        if (z2 || z3) {
            return true;
        }
        return false;
    }
}
