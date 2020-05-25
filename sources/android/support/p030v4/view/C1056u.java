package android.support.p030v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.view.u */
public final class C1056u {

    /* renamed from: a */
    private static final AtomicInteger f3337a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f3338b;

    /* renamed from: c */
    private static boolean f3339c;

    /* renamed from: d */
    private static Field f3340d;

    /* renamed from: e */
    private static boolean f3341e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f3342f;

    /* renamed from: g */
    private static WeakHashMap<View, C1063y> f3343g = null;

    /* renamed from: h */
    private static Method f3344h;

    /* renamed from: i */
    private static Field f3345i;

    /* renamed from: j */
    private static boolean f3346j = false;

    /* renamed from: k */
    private static ThreadLocal<Rect> f3347k;

    /* renamed from: android.support.v4.view.u$a */
    public interface C1058a {
        /* renamed from: a */
        boolean mo3240a(View view, KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.view.u$b */
    static class C1059b {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f3349a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f3350b;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f3351c;

        /* renamed from: d */
        private WeakReference<KeyEvent> f3352d;

        C1059b() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m3083a() {
            if (this.f3351c == null) {
                this.f3351c = new SparseArray<>();
            }
            return this.f3351c;
        }

        /* renamed from: b */
        private void m3085b() {
            if (this.f3350b != null) {
                this.f3350b.clear();
            }
            if (!f3349a.isEmpty()) {
                synchronized (f3349a) {
                    if (this.f3350b == null) {
                        this.f3350b = new WeakHashMap<>();
                    }
                    for (int size = f3349a.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) f3349a.get(size)).get();
                        if (view == null) {
                            f3349a.remove(size);
                        } else {
                            this.f3350b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3350b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        static C1059b m3082a(View view) {
            C1059b bVar = (C1059b) view.getTag(R.id.cxl);
            if (bVar != null) {
                return bVar;
            }
            C1059b bVar2 = new C1059b();
            view.setTag(R.id.cxl, bVar2);
            return bVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo3241a(KeyEvent keyEvent) {
            if (this.f3352d != null && this.f3352d.get() == keyEvent) {
                return false;
            }
            this.f3352d = new WeakReference<>(keyEvent);
            WeakReference weakReference = null;
            SparseArray a = m3083a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference = (WeakReference) a.valueAt(indexOfKey);
                    a.removeAt(indexOfKey);
                }
            }
            if (weakReference == null) {
                weakReference = (WeakReference) a.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && C1056u.m3018B(view)) {
                m3086c(view, keyEvent);
            }
            return true;
        }

        /* renamed from: b */
        private View m3084b(View view, KeyEvent keyEvent) {
            if (this.f3350b == null || !this.f3350b.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View b = m3084b(viewGroup.getChildAt(childCount), keyEvent);
                    if (b != null) {
                        return b;
                    }
                }
            }
            if (m3086c(view, keyEvent)) {
                return view;
            }
            return null;
        }

        /* renamed from: c */
        private static boolean m3086c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.cxm);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((C1058a) arrayList.get(size)).mo3240a(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo3242a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m3085b();
            }
            View b = m3084b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m3083a().put(keyCode, new WeakReference(b));
                }
            }
            if (b != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m3039a(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* renamed from: a */
    public static void m3031a(View view, C1002a aVar) {
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f3227c);
    }

    /* renamed from: a */
    public static void m3037a(View view, boolean z) {
        if (VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: a */
    public static void m3034a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m3035a(View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static void m3036a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f3342f == null) {
            f3342f = new WeakHashMap<>();
        }
        f3342f.put(view, str);
    }

    /* renamed from: a */
    public static void m3038a(ViewGroup viewGroup, boolean z) {
        if (f3344h == null) {
            try {
                f3344h = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            f3344h.setAccessible(true);
        }
        try {
            f3344h.invoke(viewGroup, new Object[]{Boolean.valueOf(true)});
        } catch (IllegalAccessException | IllegalArgumentException unused2) {
        } catch (InvocationTargetException unused3) {
        }
    }

    /* renamed from: a */
    public static void m3032a(View view, final C1051p pVar) {
        if (VERSION.SDK_INT >= 21) {
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) C1018ac.m2936a(pVar.mo1130a(view, C1018ac.m2935a((Object) windowInsets)));
                }
            });
        }
    }

    /* renamed from: a */
    public static void m3030a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m3033a(View view, C1052q qVar) {
        if (VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (qVar != null ? qVar.f3336a : null));
        }
    }

    /* renamed from: a */
    static boolean m3040a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1059b.m3082a(view).mo3241a(keyEvent);
    }

    /* renamed from: a */
    private static Rect m3021a() {
        if (f3347k == null) {
            f3347k = new ThreadLocal<>();
        }
        Rect rect = (Rect) f3347k.get();
        if (rect == null) {
            rect = new Rect();
            f3347k.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a */
    public static int m3020a(View view) {
        return view.getOverScrollMode();
    }

    /* renamed from: n */
    public static float m3068n(View view) {
        return view.getScaleX();
    }

    /* renamed from: A */
    public static Rect m3017A(View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: C */
    private static void m3019C(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: d */
    public static void m3052d(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: e */
    public static int m3053e(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: f */
    public static int m3055f(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: g */
    public static ViewParent m3057g(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    /* renamed from: h */
    public static int m3059h(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: i */
    public static int m3061i(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: j */
    public static int m3063j(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: o */
    public static float m3069o(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: q */
    public static int m3071q(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: s */
    public static boolean m3073s(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m3074t(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: u */
    public static boolean m3075u(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: z */
    public static float m3080z(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: B */
    public static boolean m3018B(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        if (view.getWindowToken() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static C1063y m3067m(View view) {
        if (f3343g == null) {
            f3343g = new WeakHashMap<>();
        }
        C1063y yVar = (C1063y) f3343g.get(view);
        if (yVar != null) {
            return yVar;
        }
        C1063y yVar2 = new C1063y(view);
        f3343g.put(view, yVar2);
        return yVar2;
    }

    /* renamed from: p */
    public static String m3070p(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        if (f3342f == null) {
            return null;
        }
        return (String) f3342f.get(view);
    }

    /* renamed from: r */
    public static void m3072r(View view) {
        if (VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: v */
    public static ColorStateList m3076v(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C1054s) {
            return ((C1054s) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: w */
    public static Mode m3077w(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C1054s) {
            return ((C1054s) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: x */
    public static boolean m3078x(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C1045j) {
            return ((C1045j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m3079y(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m3050c(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: k */
    public static int m3065k(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f3339c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f3338b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3339c = true;
        }
        if (f3338b != null) {
            try {
                return ((Integer) f3338b.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: l */
    public static int m3066l(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f3341e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f3340d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3341e = true;
        }
        if (f3340d != null) {
            try {
                return ((Integer) f3340d.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m3046b(View view) {
        if (f3346j) {
            return false;
        }
        if (f3345i == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3345i = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3346j = true;
                return false;
            }
        }
        try {
            if (f3345i.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused2) {
            f3346j = true;
            return false;
        }
    }

    /* renamed from: a */
    public static void m3023a(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: b */
    public static void m3042b(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: b */
    public static void m3045b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: c */
    public static void m3048c(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: a */
    public static C1018ac m3022a(View view, C1018ac acVar) {
        if (VERSION.SDK_INT < 21) {
            return acVar;
        }
        WindowInsets windowInsets = (WindowInsets) C1018ac.m2936a(acVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C1018ac.m2935a((Object) windowInsets);
    }

    /* renamed from: b */
    public static C1018ac m3041b(View view, C1018ac acVar) {
        if (VERSION.SDK_INT < 21) {
            return acVar;
        }
        WindowInsets windowInsets = (WindowInsets) C1018ac.m2936a(acVar);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C1018ac.m2935a((Object) windowInsets);
    }

    /* renamed from: c */
    public static void m3049c(View view, int i) {
        if (VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: d */
    public static <T extends View> T m3051d(View view, int i) {
        if (VERSION.SDK_INT >= 28) {
            return view.requireViewById(i);
        }
        T findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    /* renamed from: e */
    public static void m3054e(View view, int i) {
        if (VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: f */
    public static void m3056f(View view, int i) {
        if (view instanceof C1046k) {
            ((C1046k) view).mo3220a(1);
        }
    }

    /* renamed from: i */
    private static void m3062i(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m3019C(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m3019C((View) parent);
            }
        }
    }

    /* renamed from: j */
    private static void m3064j(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m3019C(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m3019C((View) parent);
            }
        }
    }

    /* renamed from: b */
    public static void m3043b(View view, int i) {
        if (VERSION.SDK_INT < 19) {
            if (VERSION.SDK_INT < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: g */
    public static void m3058g(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else if (VERSION.SDK_INT >= 21) {
            Rect a = m3021a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m3062i(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m3062i(view, i);
        }
    }

    /* renamed from: h */
    public static void m3060h(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else if (VERSION.SDK_INT >= 21) {
            Rect a = m3021a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m3064j(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m3064j(view, i);
        }
    }

    /* renamed from: a */
    public static void m3026a(View view, ColorStateList colorStateList) {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C1054s) {
            ((C1054s) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: b */
    static boolean m3047b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1059b.m3082a(view).mo3242a(view, keyEvent);
    }

    /* renamed from: a */
    public static void m3027a(View view, Paint paint) {
        if (VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    /* renamed from: a */
    public static void m3028a(View view, Mode mode) {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C1054s) {
            ((C1054s) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m3029a(View view, Rect rect) {
        if (VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m3025a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    /* renamed from: a */
    public static void m3024a(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    /* renamed from: b */
    public static void m3044b(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }
}
