package android.support.p030v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1039e;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p030v4.view.p041a.C1008c.C1009a;
import android.support.p030v4.widget.C1119r.C1122a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.DrawerLayout */
public class DrawerLayout extends ViewGroup {
    static final boolean CAN_HIDE_DESCENDANTS;
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    private static final int[] THEME_ATTRS = {16843828};
    private final C1071b mChildAccessibilityDelegate;
    private Rect mChildHitRect;
    private Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final C1074e mLeftCallback;
    private final C1119r mLeftDragger;
    private C1072c mListener;
    private List<C1072c> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final ArrayList<View> mNonDrawerViews;
    private final C1074e mRightCallback;
    private final C1119r mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;

    /* renamed from: android.support.v4.widget.DrawerLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: a */
        public int f3367a;

        /* renamed from: b */
        float f3368b;

        /* renamed from: c */
        boolean f3369c;

        /* renamed from: d */
        int f3370d;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f3367a = layoutParams.f3367a;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LAYOUT_ATTRS);
            this.f3367a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$SavedState */
    protected static class SavedState extends AbsSavedState {
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
        int f3371a;

        /* renamed from: b */
        int f3372b;

        /* renamed from: c */
        int f3373c;

        /* renamed from: f */
        int f3374f;

        /* renamed from: g */
        int f3375g;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3371a);
            parcel.writeInt(this.f3372b);
            parcel.writeInt(this.f3373c);
            parcel.writeInt(this.f3374f);
            parcel.writeInt(this.f3375g);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3371a = parcel.readInt();
            this.f3372b = parcel.readInt();
            this.f3373c = parcel.readInt();
            this.f3374f = parcel.readInt();
            this.f3375g = parcel.readInt();
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$a */
    class C1070a extends C1002a {

        /* renamed from: d */
        private final Rect f3377d = new Rect();

        C1070a() {
        }

        /* renamed from: a */
        public final void mo1322a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1322a(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: c */
        public final boolean mo3116c(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo3116c(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View findVisibleDrawer = DrawerLayout.this.findVisibleDrawer();
            if (findVisibleDrawer != null) {
                CharSequence drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.getDrawerViewAbsoluteGravity(findVisibleDrawer));
                if (drawerTitle != null) {
                    text.add(drawerTitle);
                }
            }
            return true;
        }

        /* renamed from: a */
        public final void mo1119a(View view, C1008c cVar) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
                super.mo1119a(view, cVar);
            } else {
                C1008c a = C1008c.m2885a(cVar);
                super.mo1119a(view, a);
                cVar.mo3132a(view);
                ViewParent g = C1056u.m3057g(view);
                if (g instanceof View) {
                    cVar.mo3143c((View) g);
                }
                Rect rect = this.f3377d;
                a.mo3131a(rect);
                cVar.mo3137b(rect);
                a.mo3142c(rect);
                cVar.mo3147d(rect);
                cVar.mo3149d(a.mo3150d());
                cVar.mo3133a(a.mo3163j());
                cVar.mo3139b(a.mo3165k());
                cVar.mo3148d(a.mo3167l());
                cVar.mo3161i(a.mo3162i());
                cVar.mo3156g(a.mo3157g());
                cVar.mo3140b(a.mo3141b());
                cVar.mo3145c(a.mo3146c());
                cVar.mo3151e(a.mo3152e());
                cVar.mo3154f(a.mo3155f());
                cVar.mo3158h(a.mo3159h());
                cVar.mo3130a(a.mo3129a());
                a.mo3168m();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.includeChildForAccessibility(childAt)) {
                        cVar.mo3138b(childAt);
                    }
                }
            }
            cVar.mo3139b((CharSequence) DrawerLayout.class.getName());
            cVar.mo3140b(false);
            cVar.mo3145c(false);
            cVar.mo3136a(C1009a.f3239a);
            cVar.mo3136a(C1009a.f3240b);
        }

        /* renamed from: a */
        public final boolean mo3115a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
                return super.mo3115a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b */
    static final class C1071b extends C1002a {
        C1071b() {
        }

        /* renamed from: a */
        public final void mo1119a(View view, C1008c cVar) {
            super.mo1119a(view, cVar);
            if (!DrawerLayout.includeChildForAccessibility(view)) {
                cVar.mo3143c((View) null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$c */
    public interface C1072c {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f);

        void onDrawerStateChanged(int i);
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$d */
    public static abstract class C1073d implements C1072c {
        public void onDrawerClosed(View view) {
        }

        public void onDrawerOpened(View view) {
        }

        public void onDrawerSlide(View view, float f) {
        }

        public void onDrawerStateChanged(int i) {
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$e */
    class C1074e extends C1122a {

        /* renamed from: a */
        final int f3378a;

        /* renamed from: b */
        public C1119r f3379b;

        /* renamed from: d */
        private final Runnable f3381d = new Runnable() {
            public final void run() {
                boolean z;
                View view;
                int i;
                C1074e eVar = C1074e.this;
                int i2 = eVar.f3379b.f3570i;
                int i3 = 0;
                if (eVar.f3378a == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    view = DrawerLayout.this.findDrawerWithGravity(3);
                    if (view != null) {
                        i3 = -view.getWidth();
                    }
                    i = i3 + i2;
                } else {
                    view = DrawerLayout.this.findDrawerWithGravity(5);
                    i = DrawerLayout.this.getWidth() - i2;
                }
                if (view == null) {
                    return;
                }
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    eVar.f3379b.mo3575a(view, i, view.getTop());
                    layoutParams.f3369c = true;
                    DrawerLayout.this.invalidate();
                    eVar.mo3339b();
                    DrawerLayout.this.cancelChildViewTouch();
                }
            }
        };

        /* renamed from: a */
        public final void mo3337a() {
            DrawerLayout.this.removeCallbacks(this.f3381d);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3339b() {
            int i = 3;
            if (this.f3378a == 3) {
                i = 5;
            }
            View findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(i);
            if (findDrawerWithGravity != null) {
                DrawerLayout.this.closeDrawer(findDrawerWithGravity);
            }
        }

        /* renamed from: b */
        public final int mo1490b(View view) {
            if (DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo1307a(int i) {
            DrawerLayout.this.updateDrawerState(this.f3378a, i, this.f3379b.f3572k);
        }

        C1074e(int i) {
            this.f3378a = i;
        }

        /* renamed from: a */
        public final void mo3338a(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f3381d, 160);
        }

        /* renamed from: b */
        public final void mo3340b(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.findDrawerWithGravity(3);
            } else {
                view = DrawerLayout.this.findDrawerWithGravity(5);
            }
            if (view != null && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                this.f3379b.mo3571a(view, i2);
            }
        }

        /* renamed from: b */
        public final void mo1491b(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f3369c = false;
            mo3339b();
        }

        /* renamed from: a */
        public final boolean mo1310a(View view, int i) {
            if (!DrawerLayout.this.isDrawerView(view) || !DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, this.f3378a) || DrawerLayout.this.getDrawerLockMode(view) != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final int mo1306a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public final int mo1311b(View view, int i, int i2) {
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: a */
        public final void mo1308a(View view, float f, float f2) {
            int i;
            float drawerViewOffset = DrawerLayout.this.getDrawerViewOffset(view);
            int width = view.getWidth();
            if (!DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            } else if (f > 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                i = 0;
            } else {
                i = -width;
            }
            this.f3379b.mo3573a(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: a */
        public final void mo1309a(View view, int i, int i2, int i3, int i4) {
            float f;
            int i5;
            int width = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                f = ((float) (i + width)) / ((float) width);
            } else {
                f = ((float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            }
            DrawerLayout.this.setDrawerViewOffset(view, f);
            if (f == 0.0f) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
            DrawerLayout.this.invalidate();
        }
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    public void requestLayout() {
        if (!this.mInLayout) {
            super.requestLayout();
        }
    }

    private boolean hasVisibleDrawer() {
        if (findVisibleDrawer() != null) {
            return true;
        }
        return false;
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    private boolean hasPeekingDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f3369c) {
                return true;
            }
        }
        return false;
    }

    private void resolveShadowDrawables() {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            this.mShadowLeftResolved = resolveLeftShadow();
            this.mShadowRightResolved = resolveRightShadow();
        }
    }

    /* access modifiers changed from: 0000 */
    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f3370d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    static {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        CAN_HIDE_DESCENDANTS = z;
        if (VERSION.SDK_INT < 21) {
            z2 = false;
        }
        SET_DRAWER_SHADOW_FROM_ELEVATION = z2;
    }

    private Drawable resolveLeftShadow() {
        int f = C1056u.m3055f(this);
        if (f == 0) {
            if (this.mShadowStart != null) {
                mirror(this.mShadowStart, f);
                return this.mShadowStart;
            }
        } else if (this.mShadowEnd != null) {
            mirror(this.mShadowEnd, f);
            return this.mShadowEnd;
        }
        return this.mShadowLeft;
    }

    private Drawable resolveRightShadow() {
        int f = C1056u.m3055f(this);
        if (f == 0) {
            if (this.mShadowEnd != null) {
                mirror(this.mShadowEnd, f);
                return this.mShadowEnd;
            }
        } else if (this.mShadowStart != null) {
            mirror(this.mShadowStart, f);
            return this.mShadowStart;
        }
        return this.mShadowRight;
    }

    /* access modifiers changed from: 0000 */
    public void cancelChildViewTouch() {
        if (!this.mChildrenCanceledTouch) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.mChildrenCanceledTouch = true;
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f3368b);
        }
        this.mScrimOpacity = f;
        boolean a = this.mLeftDragger.mo3576a(true);
        boolean a2 = this.mRightDragger.mo3576a(true);
        if (a || a2) {
            C1056u.m3052d(this);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            boolean z2 = true;
            if (layoutParams.f3370d == 1) {
                z = true;
            } else {
                z = false;
            }
            if (layoutParams.f3370d != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f3371a = layoutParams.f3367a;
            } else {
                i++;
            }
        }
        savedState.f3372b = this.mLockModeLeft;
        savedState.f3373c = this.mLockModeRight;
        savedState.f3374f = this.mLockModeStart;
        savedState.f3375g = this.mLockModeEnd;
        return savedState;
    }

    public void onRtlPropertiesChanged(int i) {
        resolveShadowDrawables();
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void setScrimColor(int i) {
        this.mScrimColor = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void closeDrawer(View view) {
        closeDrawer(view, true);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: 0000 */
    public float getDrawerViewOffset(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3368b;
    }

    /* access modifiers changed from: 0000 */
    public boolean isContentView(View view) {
        if (((LayoutParams) view.getLayoutParams()).f3367a == 0) {
            return true;
        }
        return false;
    }

    public boolean isDrawerOpen(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerOpen(findDrawerWithGravity);
        }
        return false;
    }

    public boolean isDrawerVisible(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerVisible(findDrawerWithGravity);
        }
        return false;
    }

    public void openDrawer(View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(C1072c cVar) {
        if (cVar != null && this.mListeners != null) {
            this.mListeners.remove(cVar);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.mDisallowInterceptRequested = z;
        if (z) {
            closeDrawers(true);
        }
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setStatusBarBackgroundColor(int i) {
        this.mStatusBarBackground = new ColorDrawable(i);
        invalidate();
    }

    static String gravityToString(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        if ((i & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }

    private static boolean hasOpaqueBackground(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    static boolean includeChildForAccessibility(View view) {
        if (C1056u.m3053e(view) == 4 || C1056u.m3053e(view) == 2) {
            return false;
        }
        return true;
    }

    public void addDrawerListener(C1072c cVar) {
        if (cVar != null) {
            if (this.mListeners == null) {
                this.mListeners = new ArrayList();
            }
            this.mListeners.add(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public CharSequence getDrawerTitle(int i) {
        int a = C1039e.m2968a(i, C1056u.m3055f(this));
        if (a == 3) {
            return this.mTitleLeft;
        }
        if (a == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public int getDrawerViewAbsoluteGravity(View view) {
        return C1039e.m2968a(((LayoutParams) view.getLayoutParams()).f3367a, C1056u.m3055f(this));
    }

    /* access modifiers changed from: 0000 */
    public boolean isDrawerView(View view) {
        int a = C1039e.m2968a(((LayoutParams) view.getLayoutParams()).f3367a, C1056u.m3055f(view));
        if ((a & 3) == 0 && (a & 5) == 0) {
            return false;
        }
        return true;
    }

    public void setDrawerElevation(float f) {
        this.mDrawerElevation = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt)) {
                C1056u.m3048c(childAt, this.mDrawerElevation);
            }
        }
    }

    public void setDrawerListener(C1072c cVar) {
        if (this.mListener != null) {
            removeDrawerListener(this.mListener);
        }
        if (cVar != null) {
            addDrawerListener(cVar);
        }
        this.mListener = cVar;
    }

    public void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0726c.m2091a(getContext(), i);
        } else {
            drawable = null;
        }
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnDrawerClosed(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3370d & 1) == 1) {
            layoutParams.f3370d = 0;
            if (this.mListeners != null) {
                for (int size = this.mListeners.size() - 1; size >= 0; size--) {
                    ((C1072c) this.mListeners.get(size)).onDrawerClosed(view);
                }
            }
            updateChildrenImportantForAccessibility(view, false);
            if (hasWindowFocus()) {
                View rootView = getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnDrawerOpened(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3370d & 1) == 0) {
            layoutParams.f3370d = 1;
            if (this.mListeners != null) {
                for (int size = this.mListeners.size() - 1; size >= 0; size--) {
                    ((C1072c) this.mListeners.get(size)).onDrawerOpened(view);
                }
            }
            updateChildrenImportantForAccessibility(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public View findDrawerWithGravity(int i) {
        int a = C1039e.m2968a(i, C1056u.m3055f(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    public int getDrawerLockMode(View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((LayoutParams) view.getLayoutParams()).f3367a);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean isDrawerOpen(View view) {
        if (!isDrawerView(view)) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a drawer");
            throw new IllegalArgumentException(sb.toString());
        } else if ((((LayoutParams) view.getLayoutParams()).f3370d & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawerVisible(View view) {
        if (!isDrawerView(view)) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a drawer");
            throw new IllegalArgumentException(sb.toString());
        } else if (((LayoutParams) view.getLayoutParams()).f3368b > 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            if (VERSION.SDK_INT < 21 || this.mLastInsets == null) {
                i = 0;
            } else {
                i = ((WindowInsets) this.mLastInsets).getSystemWindowInsetTop();
            }
            if (i > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), i);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void closeDrawers(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z || layoutParams.f3369c)) {
                int width = childAt.getWidth();
                if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                    z2 |= this.mLeftDragger.mo3575a(childAt, -width, childAt.getTop());
                } else {
                    z2 |= this.mRightDragger.mo3575a(childAt, getWidth(), childAt.getTop());
                }
                layoutParams.f3369c = false;
            }
        }
        this.mLeftCallback.mo3337a();
        this.mRightCallback.mo3337a();
        if (z2) {
            invalidate();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (isInBoundsOfChild(x, y, childAt) && !isContentView(childAt) && dispatchTransformedGenericPointerEvent(motionEvent, childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getDrawerLockMode(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int f = C1056u.m3055f(this);
        if (i != 3) {
            if (i != 5) {
                if (i != 8388611) {
                    if (i == 8388613) {
                        if (this.mLockModeEnd != 3) {
                            return this.mLockModeEnd;
                        }
                        if (f == 0) {
                            i5 = this.mLockModeRight;
                        } else {
                            i5 = this.mLockModeLeft;
                        }
                        if (i5 != 3) {
                            return i5;
                        }
                    }
                } else if (this.mLockModeStart != 3) {
                    return this.mLockModeStart;
                } else {
                    if (f == 0) {
                        i4 = this.mLockModeLeft;
                    } else {
                        i4 = this.mLockModeRight;
                    }
                    if (i4 != 3) {
                        return i4;
                    }
                }
            } else if (this.mLockModeRight != 3) {
                return this.mLockModeRight;
            } else {
                if (f == 0) {
                    i3 = this.mLockModeEnd;
                } else {
                    i3 = this.mLockModeStart;
                }
                if (i3 != 3) {
                    return i3;
                }
            }
        } else if (this.mLockModeLeft != 3) {
            return this.mLockModeLeft;
        } else {
            if (f == 0) {
                i2 = this.mLockModeStart;
            } else {
                i2 = this.mLockModeEnd;
            }
            if (i2 != 3) {
                return i2;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3119e);
        if (savedState.f3371a != 0) {
            View findDrawerWithGravity = findDrawerWithGravity(savedState.f3371a);
            if (findDrawerWithGravity != null) {
                openDrawer(findDrawerWithGravity);
            }
        }
        if (savedState.f3372b != 3) {
            setDrawerLockMode(savedState.f3372b, 3);
        }
        if (savedState.f3373c != 3) {
            setDrawerLockMode(savedState.f3373c, 5);
        }
        if (savedState.f3374f != 3) {
            setDrawerLockMode(savedState.f3374f, 8388611);
        }
        if (savedState.f3375g != 3) {
            setDrawerLockMode(savedState.f3375g, 8388613);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.mLeftDragger.mo3580b(motionEvent);
        this.mRightDragger.mo3580b(motionEvent);
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action != 3) {
            switch (action) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.mInitialMotionX = x;
                    this.mInitialMotionY = y;
                    this.mDisallowInterceptRequested = false;
                    this.mChildrenCanceledTouch = false;
                    break;
                case 1:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View b = this.mLeftDragger.mo3577b((int) x2, (int) y2);
                    if (b != null && isContentView(b)) {
                        float f = x2 - this.mInitialMotionX;
                        float f2 = y2 - this.mInitialMotionY;
                        int i = this.mLeftDragger.f3563b;
                        if ((f * f) + (f2 * f2) < ((float) (i * i))) {
                            View findOpenDrawer = findOpenDrawer();
                            if (!(findOpenDrawer == null || getDrawerLockMode(findOpenDrawer) == 2)) {
                                z = false;
                                closeDrawers(z);
                                this.mDisallowInterceptRequested = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    closeDrawers(z);
                    this.mDisallowInterceptRequested = false;
            }
        } else {
            closeDrawers(true);
            this.mDisallowInterceptRequested = false;
            this.mChildrenCanceledTouch = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f A[LOOP:0: B:3:0x001e->B:12:0x004f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            android.support.v4.widget.r r1 = r8.mLeftDragger
            boolean r1 = r1.mo3574a(r9)
            android.support.v4.widget.r r2 = r8.mRightDragger
            boolean r2 = r2.mo3574a(r9)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0060;
                case 2: goto L_0x0018;
                case 3: goto L_0x0060;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0093
        L_0x0018:
            android.support.v4.widget.r r9 = r8.mLeftDragger
            float[] r0 = r9.f3565d
            int r0 = r0.length
            r4 = 0
        L_0x001e:
            if (r4 >= r0) goto L_0x0052
            boolean r5 = r9.mo3572a(r4)
            if (r5 == 0) goto L_0x004a
            float[] r5 = r9.f3567f
            r5 = r5[r4]
            float[] r6 = r9.f3565d
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f3568g
            r6 = r6[r4]
            float[] r7 = r9.f3566e
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r5 = r5 + r6
            int r6 = r9.f3563b
            int r7 = r9.f3563b
            int r6 = r6 * r7
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 == 0) goto L_0x004f
            r9 = 1
            goto L_0x0053
        L_0x004f:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x0052:
            r9 = 0
        L_0x0053:
            if (r9 == 0) goto L_0x0093
            android.support.v4.widget.DrawerLayout$e r9 = r8.mLeftCallback
            r9.mo3337a()
            android.support.v4.widget.DrawerLayout$e r9 = r8.mRightCallback
            r9.mo3337a()
            goto L_0x0093
        L_0x0060:
            r8.closeDrawers(r2)
            r8.mDisallowInterceptRequested = r3
            r8.mChildrenCanceledTouch = r3
            goto L_0x0093
        L_0x0068:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.mInitialMotionX = r0
            r8.mInitialMotionY = r9
            float r4 = r8.mScrimOpacity
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x008d
            android.support.v4.widget.r r4 = r8.mLeftDragger
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.mo3577b(r0, r9)
            if (r9 == 0) goto L_0x008d
            boolean r9 = r8.isContentView(r9)
            if (r9 == 0) goto L_0x008d
            r9 = 1
            goto L_0x008e
        L_0x008d:
            r9 = 0
        L_0x008e:
            r8.mDisallowInterceptRequested = r3
            r8.mChildrenCanceledTouch = r3
            goto L_0x0094
        L_0x0093:
            r9 = 0
        L_0x0094:
            if (r1 != 0) goto L_0x00a4
            if (r9 != 0) goto L_0x00a4
            boolean r9 = r8.hasPeekingDrawer()
            if (r9 != 0) goto L_0x00a4
            boolean r9 = r8.mChildrenCanceledTouch
            if (r9 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            return r3
        L_0x00a4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean mirror(Drawable drawable, int i) {
        if (drawable == null || !C0809a.m2332b(drawable)) {
            return false;
        }
        C0809a.m2333b(drawable, i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean checkDrawerViewAbsoluteGravity(View view, int i) {
        if ((getDrawerViewAbsoluteGravity(view) & i) == i) {
            return true;
        }
        return false;
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(C0726c.m2091a(getContext(), i), i2);
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnDrawerSlide(View view, float f) {
        if (this.mListeners != null) {
            for (int size = this.mListeners.size() - 1; size >= 0; size--) {
                ((C1072c) this.mListeners.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void moveDrawerToOffset(View view, float f) {
        float width = (float) view.getWidth();
        int i = (int) (width * f);
        int drawerViewOffset = i - ((int) (getDrawerViewOffset(view) * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            drawerViewOffset = -drawerViewOffset;
        }
        view.offsetLeftAndRight(drawerViewOffset);
        setDrawerViewOffset(view, f);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !hasVisibleDrawer()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View findVisibleDrawer = findVisibleDrawer();
        if (findVisibleDrawer != null && getDrawerLockMode(findVisibleDrawer) == 0) {
            closeDrawers();
        }
        if (findVisibleDrawer != null) {
            return true;
        }
        return false;
    }

    public void setChildInsets(Object obj, boolean z) {
        boolean z2;
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z;
        if (z || getBackground() != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int a = C1039e.m2968a(i, C1056u.m3055f(this));
        if (a == 3) {
            this.mTitleLeft = charSequence;
            return;
        }
        if (a == 5) {
            this.mTitleRight = charSequence;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setDrawerViewOffset(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f3368b) {
            layoutParams.f3368b = f;
            dispatchOnDrawerSlide(view, f);
        }
    }

    private boolean dispatchTransformedGenericPointerEvent(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent transformedMotionEvent = getTransformedMotionEvent(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(transformedMotionEvent);
            transformedMotionEvent.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent getTransformedMotionEvent(MotionEvent motionEvent, View view) {
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.mChildInvertedMatrix == null) {
                this.mChildInvertedMatrix = new Matrix();
            }
            matrix.invert(this.mChildInvertedMatrix);
            obtain.transform(this.mChildInvertedMatrix);
        }
        return obtain;
    }

    private void updateChildrenImportantForAccessibility(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || isDrawerView(childAt)) && (!z || childAt != view)) {
                C1056u.m3043b(childAt, 4);
            } else {
                C1056u.m3043b(childAt, 1);
            }
        }
    }

    public void closeDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            closeDrawer(findDrawerWithGravity, z);
            return;
        }
        StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
        sb.append(gravityToString(i));
        throw new IllegalArgumentException(sb.toString());
    }

    public void openDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            openDrawer(findDrawerWithGravity, z);
            return;
        }
        StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
        sb.append(gravityToString(i));
        throw new IllegalArgumentException(sb.toString());
    }

    public void setDrawerLockMode(int i, View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).f3367a);
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer with appropriate layout_gravity");
        throw new IllegalArgumentException(sb.toString());
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            if ((i & 8388611) == 8388611) {
                this.mShadowStart = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.mShadowEnd = drawable;
            } else if ((i & 3) == 3) {
                this.mShadowLeft = drawable;
            } else if ((i & 5) == 5) {
                this.mShadowRight = drawable;
            } else {
                return;
            }
            resolveShadowDrawables();
            invalidate();
        }
    }

    public void closeDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.mFirstLayout) {
                layoutParams.f3368b = 0.0f;
                layoutParams.f3370d = 0;
            } else if (z) {
                layoutParams.f3370d |= 4;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.mo3575a(view, -view.getWidth(), view.getTop());
                } else {
                    this.mRightDragger.mo3575a(view, getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 0.0f);
                updateDrawerState(layoutParams.f3367a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public void openDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.mFirstLayout) {
                layoutParams.f3368b = 1.0f;
                layoutParams.f3370d = 1;
                updateChildrenImportantForAccessibility(view, true);
            } else if (z) {
                layoutParams.f3370d |= 2;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.mo3575a(view, 0, view.getTop());
                } else {
                    this.mRightDragger.mo3575a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 1.0f);
                updateDrawerState(layoutParams.f3367a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public void setDrawerLockMode(int i, int i2) {
        C1119r rVar;
        int a = C1039e.m2968a(i2, C1056u.m3055f(this));
        if (i2 == 3) {
            this.mLockModeLeft = i;
        } else if (i2 == 5) {
            this.mLockModeRight = i;
        } else if (i2 == 8388611) {
            this.mLockModeStart = i;
        } else if (i2 == 8388613) {
            this.mLockModeEnd = i;
        }
        if (i != 0) {
            if (a == 3) {
                rVar = this.mLeftDragger;
            } else {
                rVar = this.mRightDragger;
            }
            rVar.mo3570a();
        }
        switch (i) {
            case 1:
                View findDrawerWithGravity = findDrawerWithGravity(a);
                if (findDrawerWithGravity != null) {
                    closeDrawer(findDrawerWithGravity);
                    break;
                }
                break;
            case 2:
                View findDrawerWithGravity2 = findDrawerWithGravity(a);
                if (findDrawerWithGravity2 != null) {
                    openDrawer(findDrawerWithGravity2);
                    return;
                }
                break;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        if (this.mLastInsets == null || !C1056u.m3073s(this)) {
            z = false;
        } else {
            z = true;
        }
        int f = C1056u.m3055f(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int a = C1039e.m2968a(layoutParams.f3367a, f);
                    if (C1056u.m3073s(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.mLastInsets;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.mLastInsets;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (isDrawerView(childAt)) {
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION && C1056u.m3069o(childAt) != this.mDrawerElevation) {
                        C1056u.m3048c(childAt, this.mDrawerElevation);
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    if (drawerViewAbsoluteGravity == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((!z2 || !z3) && (z2 || !z4)) {
                        if (z2) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(getChildMeasureSpec(i, this.mMinDrawerMargin + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                        sb.append(gravityToString(drawerViewAbsoluteGravity));
                        sb.append(" but this DrawerLayout");
                        sb.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i4);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    private boolean isInBoundsOfChild(float f, float f2, View view) {
        if (this.mChildHitRect == null) {
            this.mChildHitRect = new Rect();
        }
        view.getHitRect(this.mChildHitRect);
        return this.mChildHitRect.contains((int) f, (int) f2);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            C1056u.m3043b(view, 4);
        } else {
            C1056u.m3043b(view, 1);
        }
        if (!CAN_HIDE_DESCENDANTS) {
            C1056u.m3031a(view, (C1002a) this.mChildAccessibilityDelegate);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!isDrawerView(childAt)) {
                    this.mNonDrawerViews.add(childAt);
                } else if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.mNonDrawerViews.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = (View) this.mNonDrawerViews.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.mNonDrawerViews.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    public void updateDrawerState(int i, int i2, View view) {
        int i3 = this.mLeftDragger.f3562a;
        int i4 = this.mRightDragger.f3562a;
        int i5 = 2;
        if (i3 == 1 || i4 == 1) {
            i5 = 1;
        } else if (!(i3 == 2 || i4 == 2)) {
            i5 = 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.f3368b == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (layoutParams.f3368b == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i5 != this.mDrawerState) {
            this.mDrawerState = i5;
            if (this.mListeners != null) {
                for (int size = this.mListeners.size() - 1; size >= 0; size--) {
                    ((C1072c) this.mListeners.get(size)).onDrawerStateChanged(i5);
                }
            }
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildAccessibilityDelegate = new C1071b();
        this.mScrimColor = -1728053248;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.mLeftCallback = new C1074e(3);
        this.mRightCallback = new C1074e(5);
        this.mLeftDragger = C1119r.m3271a((ViewGroup) this, 1.0f, (C1122a) this.mLeftCallback);
        this.mLeftDragger.f3571j = 1;
        this.mLeftDragger.f3569h = f2;
        this.mLeftCallback.f3379b = this.mLeftDragger;
        this.mRightDragger = C1119r.m3271a((ViewGroup) this, 1.0f, (C1122a) this.mRightCallback);
        this.mRightDragger.f3571j = 2;
        this.mRightDragger.f3569h = f2;
        this.mRightCallback.f3379b = this.mRightDragger;
        setFocusableInTouchMode(true);
        C1056u.m3043b((View) this, 1);
        C1056u.m3031a((View) this, (C1002a) new C1070a());
        setMotionEventSplittingEnabled(false);
        if (C1056u.m3073s(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        boolean z;
                        DrawerLayout drawerLayout = (DrawerLayout) view;
                        if (windowInsets.getSystemWindowInsetTop() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        drawerLayout.setChildInsets(windowInsets, z);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
                try {
                    this.mStatusBarBackground = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.mStatusBarBackground = null;
            }
        }
        this.mDrawerElevation = f * 10.0f;
        this.mNonDrawerViews = new ArrayList<>();
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean isContentView = isContentView(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (isContentView) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view2 && childAt.getVisibility() == 0 && hasOpaqueBackground(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.mScrimOpacity > 0.0f && isContentView) {
            this.mScrimPaint.setColor((((int) (((float) ((this.mScrimColor & -16777216) >>> 24)) * this.mScrimOpacity)) << 24) | (this.mScrimColor & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.mScrimPaint);
        } else if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view2, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.mLeftDragger.f3570i), 1.0f));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (max * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
        } else if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view2, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.mRightDragger.f3570i), 1.0f));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (max2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        boolean z2;
        int i6;
        this.mInLayout = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f3368b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i9 = i7 - ((int) (layoutParams.f3368b * f3));
                        f = ((float) (i7 - i9)) / f3;
                        i5 = i9;
                    }
                    if (f != layoutParams.f3368b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i10 = layoutParams.f3367a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        if (i12 < layoutParams.topMargin) {
                            i12 = layoutParams.topMargin;
                        } else if (i12 + measuredHeight > i11 - layoutParams.bottomMargin) {
                            i12 = (i11 - layoutParams.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, layoutParams.topMargin + measuredHeight);
                    } else {
                        int i13 = i4 - i2;
                        childAt.layout(i5, (i13 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i13 - layoutParams.bottomMargin);
                    }
                    if (z2) {
                        setDrawerViewOffset(childAt, f);
                    }
                    if (layoutParams.f3368b > 0.0f) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        childAt.setVisibility(i6);
                    }
                }
            }
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }
}
