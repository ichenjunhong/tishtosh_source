package android.support.p030v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0159aa;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.C0654k.C0656b;
import android.support.p030v4.app.Fragment.SavedState;
import android.support.p030v4.p038f.C0779b;
import android.support.p030v4.p038f.C0783e;
import android.support.p030v4.p038f.C0784f;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.app.m */
final class C0658m extends C0654k implements Factory2 {

    /* renamed from: F */
    static final Interpolator f2347F = new DecelerateInterpolator(2.5f);

    /* renamed from: G */
    static final Interpolator f2348G = new DecelerateInterpolator(1.5f);

    /* renamed from: H */
    static final Interpolator f2349H = new AccelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f2350I = new AccelerateInterpolator(1.5f);

    /* renamed from: a */
    static boolean f2351a;

    /* renamed from: q */
    static Field f2352q;

    /* renamed from: A */
    Bundle f2353A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f2354B = null;

    /* renamed from: C */
    ArrayList<C0674j> f2355C;

    /* renamed from: D */
    C0676o f2356D;

    /* renamed from: E */
    Runnable f2357E = new Runnable() {
        public final void run() {
            C0658m.this.mo2280j();
        }
    };

    /* renamed from: J */
    private final CopyOnWriteArrayList<C0670f> f2358J = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    ArrayList<C0672h> f2359b;

    /* renamed from: c */
    boolean f2360c;

    /* renamed from: d */
    int f2361d;

    /* renamed from: e */
    final ArrayList<Fragment> f2362e = new ArrayList<>();

    /* renamed from: f */
    SparseArray<Fragment> f2363f;

    /* renamed from: g */
    ArrayList<C0645d> f2364g;

    /* renamed from: h */
    ArrayList<Fragment> f2365h;

    /* renamed from: i */
    ArrayList<C0645d> f2366i;

    /* renamed from: j */
    ArrayList<Integer> f2367j;

    /* renamed from: k */
    ArrayList<C0656b> f2368k;

    /* renamed from: l */
    int f2369l = 0;

    /* renamed from: m */
    C0653j f2370m;

    /* renamed from: n */
    C0651h f2371n;

    /* renamed from: o */
    Fragment f2372o;

    /* renamed from: p */
    Fragment f2373p;

    /* renamed from: r */
    boolean f2374r;

    /* renamed from: s */
    boolean f2375s;

    /* renamed from: t */
    boolean f2376t;

    /* renamed from: u */
    boolean f2377u;

    /* renamed from: v */
    String f2378v;

    /* renamed from: w */
    boolean f2379w;

    /* renamed from: x */
    ArrayList<C0645d> f2380x;

    /* renamed from: y */
    ArrayList<Boolean> f2381y;

    /* renamed from: z */
    ArrayList<Fragment> f2382z;

    /* renamed from: android.support.v4.app.m$a */
    static class C0664a extends C0666b {

        /* renamed from: a */
        View f2396a;

        public final void onAnimationEnd(Animation animation) {
            if (C1056u.m3018B(this.f2396a) || VERSION.SDK_INT >= 24) {
                this.f2396a.post(new Runnable() {
                    public final void run() {
                        C0664a.this.f2396a.setLayerType(0, null);
                    }
                });
            } else {
                this.f2396a.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }

        C0664a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.f2396a = view;
        }
    }

    /* renamed from: android.support.v4.app.m$b */
    static class C0666b implements AnimationListener {

        /* renamed from: a */
        private final AnimationListener f2398a;

        C0666b(AnimationListener animationListener) {
            this.f2398a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f2398a != null) {
                this.f2398a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f2398a != null) {
                this.f2398a.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.f2398a != null) {
                this.f2398a.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.m$c */
    static class C0667c {

        /* renamed from: a */
        public final Animation f2399a;

        /* renamed from: b */
        public final Animator f2400b;

        C0667c(Animator animator) {
            this.f2400b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0667c(Animation animation) {
            this.f2399a = animation;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.m$d */
    static class C0668d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f2401a;

        C0668d(View view) {
            this.f2401a = view;
        }

        public final void onAnimationStart(Animator animator) {
            this.f2401a.setLayerType(2, null);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f2401a.setLayerType(0, null);
            animator.removeListener(this);
        }
    }

    /* renamed from: android.support.v4.app.m$e */
    static class C0669e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f2402a;

        /* renamed from: b */
        private final View f2403b;

        /* renamed from: c */
        private boolean f2404c;

        /* renamed from: d */
        private boolean f2405d;

        /* renamed from: e */
        private boolean f2406e = true;

        public final void run() {
            if (this.f2404c || !this.f2406e) {
                this.f2402a.endViewTransition(this.f2403b);
                this.f2405d = true;
                return;
            }
            this.f2406e = false;
            this.f2402a.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation) {
            this.f2406e = true;
            if (!this.f2404c) {
                if (!super.getTransformation(j, transformation)) {
                    this.f2404c = true;
                    C0627ae.m1706a(this.f2402a, this);
                }
                return true;
            } else if (!this.f2405d) {
                return true;
            } else {
                return false;
            }
        }

        C0669e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2402a = viewGroup;
            this.f2403b = view;
            addAnimation(animation);
            this.f2402a.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f2406e = true;
            if (!this.f2404c) {
                if (!super.getTransformation(j, transformation, f)) {
                    this.f2404c = true;
                    C0627ae.m1706a(this.f2402a, this);
                }
                return true;
            } else if (!this.f2405d) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: android.support.v4.app.m$f */
    static final class C0670f {

        /* renamed from: a */
        final C0655a f2407a;

        /* renamed from: b */
        final boolean f2408b;

        C0670f(C0655a aVar, boolean z) {
            this.f2407a = aVar;
            this.f2408b = z;
        }
    }

    /* renamed from: android.support.v4.app.m$g */
    static class C0671g {

        /* renamed from: a */
        public static final int[] f2409a = {16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.m$h */
    interface C0672h {
        /* renamed from: a */
        boolean mo2188a(ArrayList<C0645d> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.m$i */
    class C0673i implements C0672h {

        /* renamed from: a */
        final String f2410a;

        /* renamed from: b */
        final int f2411b;

        /* renamed from: c */
        final int f2412c;

        /* renamed from: a */
        public final boolean mo2188a(ArrayList<C0645d> arrayList, ArrayList<Boolean> arrayList2) {
            if (C0658m.this.f2373p != null && this.f2411b < 0 && this.f2410a == null) {
                C0654k peekChildFragmentManager = C0658m.this.f2373p.peekChildFragmentManager();
                if (peekChildFragmentManager != null && peekChildFragmentManager.mo2236d()) {
                    return false;
                }
            }
            return C0658m.this.mo2265a(arrayList, arrayList2, this.f2410a, this.f2411b, this.f2412c);
        }

        C0673i(String str, int i, int i2) {
            this.f2410a = str;
            this.f2411b = i;
            this.f2412c = i2;
        }
    }

    /* renamed from: android.support.v4.app.m$j */
    static class C0674j implements C0586c {

        /* renamed from: a */
        final boolean f2414a;

        /* renamed from: b */
        final C0645d f2415b;

        /* renamed from: c */
        int f2416c;

        /* renamed from: b */
        public final void mo1976b() {
            this.f2416c++;
        }

        /* renamed from: d */
        public final void mo2308d() {
            this.f2415b.f2310a.mo2258a(this.f2415b, this.f2414a, false, false);
        }

        /* renamed from: a */
        public final void mo1975a() {
            this.f2416c--;
            if (this.f2416c == 0) {
                this.f2415b.f2310a.mo2277i();
            }
        }

        /* renamed from: c */
        public final void mo2307c() {
            boolean z;
            if (this.f2416c > 0) {
                z = true;
            } else {
                z = false;
            }
            C0658m mVar = this.f2415b.f2310a;
            int size = mVar.f2362e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) mVar.f2362e.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.f2415b.f2310a.mo2258a(this.f2415b, this.f2414a, !z, true);
        }

        C0674j(C0645d dVar, boolean z) {
            this.f2414a = z;
            this.f2415b = dVar;
        }
    }

    /* renamed from: g */
    public final boolean mo2239g() {
        return this.f2377u;
    }

    /* renamed from: a */
    private static boolean m1833a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m1833a((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m1830a(RuntimeException runtimeException) {
        PrintWriter printWriter = new PrintWriter(new C0784f("FragmentManager"));
        if (this.f2370m != null) {
            try {
                this.f2370m.mo2029a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            mo2232a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: a */
    public final void mo2231a(String str, int i) {
        mo2260a((C0672h) new C0673i(str, -1, 0), false);
    }

    /* renamed from: a */
    public final void mo2226a(int i, int i2) {
        if (i >= 0) {
            mo2260a((C0672h) new C0673i(null, i, 1), false);
            return;
        }
        StringBuilder sb = new StringBuilder("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private boolean m1834a(String str, int i, int i2) {
        mo2280j();
        m1843c(true);
        if (this.f2373p != null) {
            C0654k peekChildFragmentManager = this.f2373p.peekChildFragmentManager();
            if (peekChildFragmentManager != null && peekChildFragmentManager.mo2236d()) {
                return true;
            }
        }
        boolean a = mo2265a(this.f2380x, this.f2381y, (String) null, -1, 0);
        if (a) {
            this.f2360c = true;
            try {
                m1839b(this.f2380x, this.f2381y);
            } finally {
                m1860w();
            }
        }
        m1863z();
        m1817C();
        return a;
    }

    /* renamed from: a */
    public final void mo2230a(C0656b bVar) {
        if (this.f2368k == null) {
            this.f2368k = new ArrayList<>();
        }
        this.f2368k.add(bVar);
    }

    /* renamed from: a */
    public final void mo2227a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m1830a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    /* renamed from: a */
    public final Fragment mo2223a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = (Fragment) this.f2363f.get(i);
        if (fragment == null) {
            StringBuilder sb = new StringBuilder("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": index ");
            sb.append(i);
            m1830a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        return fragment;
    }

    /* renamed from: a */
    public final SavedState mo2221a(Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m1830a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        if (fragment.mState <= 0) {
            return null;
        }
        Bundle o = m1857o(fragment);
        if (o != null) {
            return new SavedState(o);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo2232a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (this.f2363f != null) {
            int size = this.f2363f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; i++) {
                    Fragment fragment = (Fragment) this.f2363f.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.dump(sb2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        int size2 = this.f2362e.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment2 = (Fragment) this.f2362e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        if (this.f2365h != null) {
            int size3 = this.f2365h.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size3; i3++) {
                    Fragment fragment3 = (Fragment) this.f2365h.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(fragment3.toString());
                }
            }
        }
        if (this.f2364g != null) {
            int size4 = this.f2364g.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size4; i4++) {
                    C0645d dVar = (C0645d) this.f2364g.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(dVar.toString());
                    dVar.mo2184a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f2366i != null) {
                int size5 = this.f2366i.size();
                if (size5 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i5 = 0; i5 < size5; i5++) {
                        C0645d dVar2 = (C0645d) this.f2366i.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(dVar2);
                    }
                }
            }
            if (this.f2367j != null && this.f2367j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f2367j.toArray()));
            }
        }
        if (this.f2359b != null) {
            int size6 = this.f2359b.size();
            if (size6 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size6; i6++) {
                    C0672h hVar = (C0672h) this.f2359b.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(hVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2370m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2371n);
        if (this.f2372o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2372o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2369l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2375s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2376t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2377u);
        if (this.f2374r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2374r);
        }
        if (this.f2378v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f2378v);
        }
    }

    /* renamed from: b */
    public final void mo2268b(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.f2360c) {
                this.f2379w = true;
                return;
            }
            fragment.mDeferStart = false;
            C0675n.m1929a(this, fragment, this.f2369l, 0, 0, false);
        }
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r8v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f2, code lost:
        if (r0 != null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f6, code lost:
        if (r7.mRestored != false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r2 = r15.getResources().getResourceName(r7.mContainerId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0203, code lost:
        r2 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0232, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02bd, code lost:
        if (r11 >= 3) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02bf, code lost:
        r15.performStop();
        m1847e(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c5, code lost:
        if (r11 >= 2) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02c9, code lost:
        if (r7.mView == null) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02d1, code lost:
        if (r6.f2370m.mo2030a(r15) == false) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02d5, code lost:
        if (r7.mSavedViewState != null) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02d7, code lost:
        m1856n(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02da, code lost:
        r15.performDestroyView();
        m1849f(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02e2, code lost:
        if (r7.mView == null) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02e6, code lost:
        if (r7.mContainer == null) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02e8, code lost:
        r7.mContainer.endViewTransition(r7.mView);
        r7.mView.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02f7, code lost:
        if (r6.f2369l <= 0) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02fb, code lost:
        if (r6.f2377u != false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0303, code lost:
        if (r7.mView.getVisibility() != 0) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0309, code lost:
        if (r7.mPostponedAlpha < 0.0f) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x030b, code lost:
        r0 = m1821a(r15, r17, false, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0314, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0315, code lost:
        r7.mPostponedAlpha = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0317, code lost:
        if (r0 == null) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0319, code lost:
        r1 = r7.mView;
        r2 = r7.mContainer;
        r2.startViewTransition(r1);
        r15.setStateAfterAnimating(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0325, code lost:
        if (r0.f2399a == null) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0327, code lost:
        r3 = new android.support.p030v4.app.C0658m.C0669e(r0.f2399a, r2, r1);
        r15.setAnimatingAway(r7.mView);
        r3.setAnimationListener(new android.support.p030v4.app.C0658m.C06602(r14, m1822a((android.view.animation.Animation) r3)));
        m1829a(r1, r0);
        r7.mView.startAnimation(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0348, code lost:
        r3 = r0.f2400b;
        r15.setAnimator(r0.f2400b);
        r3.addListener(new android.support.p030v4.app.C0658m.C06623(r14));
        r3.setTarget(r7.mView);
        m1829a(r7.mView, r0);
        r3.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0364, code lost:
        r7.mContainer.removeView(r7.mView);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x036b, code lost:
        r7.mContainer = null;
        r7.mView = null;
        r7.mViewLifecycleOwner = null;
        r7.mViewLifecycleOwnerLiveData.setValue(null);
        r7.mInnerView = null;
        r7.mInLayout = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x037a, code lost:
        if (r11 > 0) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x037e, code lost:
        if (r6.f2377u == false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0384, code lost:
        if (r15.getAnimatingAway() == null) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0386, code lost:
        r0 = r15.getAnimatingAway();
        r15.setAnimatingAway(null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0395, code lost:
        if (r15.getAnimator() == null) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0397, code lost:
        r0 = r15.getAnimator();
        r15.setAnimator(null);
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03a5, code lost:
        if (r15.getAnimatingAway() != null) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03ab, code lost:
        if (r15.getAnimator() == null) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03b0, code lost:
        if (r7.mRetaining != false) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03b2, code lost:
        r15.performDestroy();
        m1851g(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03b9, code lost:
        r7.mState = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03bb, code lost:
        r15.performDetach();
        m1852h(r15, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03c1, code lost:
        if (r19 != false) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03c5, code lost:
        if (r7.mRetaining != false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03c9, code lost:
        if (r7.mIndex < 0) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03cb, code lost:
        r6.f2363f.put(r7.mIndex, null);
        r15.initState();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03d6, code lost:
        r7.mHost = null;
        r7.mParentFragment = null;
        r7.mFragmentManager = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03dd, code lost:
        r15.setStateAfterAnimating(r11);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0186, code lost:
        if (r7.mFromLayout == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018a, code lost:
        if (r7.mPerformedCreateView != false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018c, code lost:
        r15.performCreateView(r15.performGetLayoutInflater(r7.mSavedFragmentState), null, r7.mSavedFragmentState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0199, code lost:
        if (r7.mView == null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019b, code lost:
        r7.mInnerView = r7.mView;
        r7.mView.setSaveFromParentEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a6, code lost:
        if (r7.mHidden == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a8, code lost:
        r7.mView.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ad, code lost:
        r15.onViewCreated(r7.mView, r7.mSavedFragmentState);
        m1826a(r15, r7.mView, r7.mSavedFragmentState, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01bc, code lost:
        r7.mInnerView = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01be, code lost:
        if (r11 <= 1) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c2, code lost:
        if (r7.mFromLayout != false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c6, code lost:
        if (r7.mContainerId == 0) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01cb, code lost:
        if (r7.mContainerId != -1) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01cd, code lost:
        r2 = new java.lang.StringBuilder("Cannot create fragment ");
        r2.append(r15);
        r2.append(" for a container view with no id");
        m1830a((java.lang.RuntimeException) new java.lang.IllegalArgumentException(r2.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e8, code lost:
        r0 = (android.view.ViewGroup) r6.f2371n.mo1968a(r7.mContainerId);
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v5
      assigns: []
      uses: []
      mth insns count: 403
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03e6  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2256a(final android.support.p030v4.app.Fragment r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r6 = r14
            r7 = r15
            boolean r0 = r7.mAdded
            r8 = 1
            if (r0 == 0) goto L_0x000f
            boolean r0 = r7.mDetached
            if (r0 == 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r0 = r16
            goto L_0x0014
        L_0x000f:
            r0 = r16
            if (r0 <= r8) goto L_0x0014
            r0 = 1
        L_0x0014:
            boolean r1 = r7.mRemoving
            if (r1 == 0) goto L_0x002a
            int r1 = r7.mState
            if (r0 <= r1) goto L_0x002a
            int r0 = r7.mState
            if (r0 != 0) goto L_0x0028
            boolean r0 = r15.isInBackStack()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.mState
        L_0x002a:
            boolean r1 = r7.mDeferStart
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0038
            int r1 = r7.mState
            if (r1 >= r9) goto L_0x0038
            if (r0 <= r10) goto L_0x0038
            r11 = 2
            goto L_0x0039
        L_0x0038:
            r11 = r0
        L_0x0039:
            int r0 = r7.mState
            r12 = 0
            r13 = 0
            if (r0 > r11) goto L_0x02a9
            boolean r0 = r7.mFromLayout
            if (r0 == 0) goto L_0x0048
            boolean r0 = r7.mInLayout
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            android.view.View r0 = r15.getAnimatingAway()
            if (r0 != 0) goto L_0x0054
            android.animation.Animator r0 = r15.getAnimator()
            if (r0 == 0) goto L_0x0066
        L_0x0054:
            r15.setAnimatingAway(r12)
            r15.setAnimator(r12)
            int r2 = r15.getStateAfterAnimating()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r14
            r1 = r15
            android.support.p030v4.app.C0675n.m1929a(r0, r1, r2, r3, r4, r5)
        L_0x0066:
            int r0 = r7.mState
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0182;
                case 2: goto L_0x0293;
                case 3: goto L_0x029b;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x03e1
        L_0x006d:
            if (r11 <= 0) goto L_0x0182
            android.os.Bundle r0 = r7.mSavedFragmentState
            if (r0 == 0) goto L_0x00c4
            android.os.Bundle r0 = r7.mSavedFragmentState
            android.support.v4.app.j r1 = r6.f2370m
            android.content.Context r1 = r1.f2344c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.mSavedViewState = r0
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.Fragment r0 = r14.mo2223a(r0, r1)
            r7.mTarget = r0
            android.support.v4.app.Fragment r0 = r7.mTarget
            if (r0 == 0) goto L_0x00a2
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.mTargetRequestCode = r0
        L_0x00a2:
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            if (r0 == 0) goto L_0x00b1
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            boolean r0 = r0.booleanValue()
            r7.mUserVisibleHint = r0
            r7.mSavedUserVisibleHint = r12
            goto L_0x00bb
        L_0x00b1:
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.mUserVisibleHint = r0
        L_0x00bb:
            boolean r0 = r7.mUserVisibleHint
            if (r0 != 0) goto L_0x00c4
            r7.mDeferStart = r8
            if (r11 <= r10) goto L_0x00c4
            r11 = 2
        L_0x00c4:
            android.support.v4.app.j r0 = r6.f2370m
            r7.mHost = r0
            android.support.v4.app.Fragment r0 = r6.f2372o
            r7.mParentFragment = r0
            android.support.v4.app.Fragment r0 = r6.f2372o
            if (r0 == 0) goto L_0x00d5
            android.support.v4.app.Fragment r0 = r6.f2372o
            android.support.v4.app.m r0 = r0.mChildFragmentManager
            goto L_0x00d9
        L_0x00d5:
            android.support.v4.app.j r0 = r6.f2370m
            android.support.v4.app.m r0 = r0.f2346e
        L_0x00d9:
            r7.mFragmentManager = r0
            android.support.v4.app.Fragment r0 = r7.mTarget
            if (r0 == 0) goto L_0x0121
            android.util.SparseArray<android.support.v4.app.Fragment> r0 = r6.f2363f
            android.support.v4.app.Fragment r1 = r7.mTarget
            int r1 = r1.mIndex
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.app.Fragment r1 = r7.mTarget
            if (r0 != r1) goto L_0x00fe
            android.support.v4.app.Fragment r0 = r7.mTarget
            int r0 = r0.mState
            if (r0 > 0) goto L_0x0121
            android.support.v4.app.Fragment r1 = r7.mTarget
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r14
            android.support.p030v4.app.C0675n.m1929a(r0, r1, r2, r3, r4, r5)
            goto L_0x0121
        L_0x00fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.app.Fragment r2 = r7.mTarget
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0121:
            android.support.v4.app.j r0 = r6.f2370m
            android.content.Context r0 = r0.f2344c
            r14.m1824a(r15, r0, r13)
            r7.mCalled = r13
            android.support.v4.app.j r0 = r6.f2370m
            android.content.Context r0 = r0.f2344c
            r15.onAttach(r0)
            boolean r0 = r7.mCalled
            if (r0 == 0) goto L_0x0169
            android.support.v4.app.Fragment r0 = r7.mParentFragment
            if (r0 != 0) goto L_0x013f
            android.support.v4.app.j r0 = r6.f2370m
            r0.mo2033b(r15)
            goto L_0x0144
        L_0x013f:
            android.support.v4.app.Fragment r0 = r7.mParentFragment
            r0.onAttachFragment(r15)
        L_0x0144:
            android.support.v4.app.j r0 = r6.f2370m
            android.content.Context r0 = r0.f2344c
            r14.m1835b(r15, r0, r13)
            boolean r0 = r7.mIsCreated
            if (r0 != 0) goto L_0x015f
            android.os.Bundle r0 = r7.mSavedFragmentState
            r14.m1825a(r15, r0, r13)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.performCreate(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r14.m1836b(r15, r0, r13)
            goto L_0x0166
        L_0x015f:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.restoreChildFragmentState(r0)
            r7.mState = r8
        L_0x0166:
            r7.mRetaining = r13
            goto L_0x0182
        L_0x0169:
            android.support.v4.app.ai r0 = new android.support.v4.app.ai
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0182:
            boolean r0 = r7.mFromLayout
            r1 = 8
            if (r0 == 0) goto L_0x01be
            boolean r0 = r7.mPerformedCreateView
            if (r0 != 0) goto L_0x01be
            android.os.Bundle r0 = r7.mSavedFragmentState
            android.view.LayoutInflater r0 = r15.performGetLayoutInflater(r0)
            android.os.Bundle r2 = r7.mSavedFragmentState
            r15.performCreateView(r0, r12, r2)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x01bc
            android.view.View r0 = r7.mView
            r7.mInnerView = r0
            android.view.View r0 = r7.mView
            r0.setSaveFromParentEnabled(r13)
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L_0x01ad
            android.view.View r0 = r7.mView
            r0.setVisibility(r1)
        L_0x01ad:
            android.view.View r0 = r7.mView
            android.os.Bundle r2 = r7.mSavedFragmentState
            r15.onViewCreated(r0, r2)
            android.view.View r0 = r7.mView
            android.os.Bundle r2 = r7.mSavedFragmentState
            r14.m1826a(r15, r0, r2, r13)
            goto L_0x01be
        L_0x01bc:
            r7.mInnerView = r12
        L_0x01be:
            if (r11 <= r8) goto L_0x0293
            boolean r0 = r7.mFromLayout
            if (r0 != 0) goto L_0x027e
            int r0 = r7.mContainerId
            if (r0 == 0) goto L_0x0232
            int r0 = r7.mContainerId
            r2 = -1
            if (r0 != r2) goto L_0x01e8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot create fragment "
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r3 = " for a container view with no id"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r14.m1830a(r0)
        L_0x01e8:
            android.support.v4.app.h r0 = r6.f2371n
            int r2 = r7.mContainerId
            android.view.View r0 = r0.mo1968a(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0233
            boolean r2 = r7.mRestored
            if (r2 != 0) goto L_0x0233
            android.content.res.Resources r2 = r15.getResources()     // Catch:{ NotFoundException -> 0x0203 }
            int r3 = r7.mContainerId     // Catch:{ NotFoundException -> 0x0203 }
            java.lang.String r2 = r2.getResourceName(r3)     // Catch:{ NotFoundException -> 0x0203 }
            goto L_0x0205
        L_0x0203:
            java.lang.String r2 = "unknown"
        L_0x0205:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "No view found for id 0x"
            r4.<init>(r5)
            int r5 = r7.mContainerId
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            r4.append(r5)
            java.lang.String r5 = " ("
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ") for fragment "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            r14.m1830a(r3)
            goto L_0x0233
        L_0x0232:
            r0 = r12
        L_0x0233:
            r7.mContainer = r0
            android.os.Bundle r2 = r7.mSavedFragmentState
            android.view.LayoutInflater r2 = r15.performGetLayoutInflater(r2)
            android.os.Bundle r3 = r7.mSavedFragmentState
            r15.performCreateView(r2, r0, r3)
            android.view.View r2 = r7.mView
            if (r2 == 0) goto L_0x027c
            android.view.View r2 = r7.mView
            r7.mInnerView = r2
            android.view.View r2 = r7.mView
            r2.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x0254
            android.view.View r2 = r7.mView
            r0.addView(r2)
        L_0x0254:
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L_0x025d
            android.view.View r0 = r7.mView
            r0.setVisibility(r1)
        L_0x025d:
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r15.onViewCreated(r0, r1)
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r14.m1826a(r15, r0, r1, r13)
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0278
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x0278
            goto L_0x0279
        L_0x0278:
            r8 = 0
        L_0x0279:
            r7.mIsNewlyAdded = r8
            goto L_0x027e
        L_0x027c:
            r7.mInnerView = r12
        L_0x027e:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.performActivityCreated(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r14.m1841c(r15, r0, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x0291
            android.os.Bundle r0 = r7.mSavedFragmentState
            r15.restoreViewState(r0)
        L_0x0291:
            r7.mSavedFragmentState = r12
        L_0x0293:
            if (r11 <= r10) goto L_0x029b
            r15.performStart()
            r14.m1837b(r15, r13)
        L_0x029b:
            if (r11 <= r9) goto L_0x03e1
            r15.performResume()
            r14.m1842c(r15, r13)
            r7.mSavedFragmentState = r12
            r7.mSavedViewState = r12
            goto L_0x03e1
        L_0x02a9:
            int r0 = r7.mState
            if (r0 <= r11) goto L_0x03e1
            int r0 = r7.mState
            switch(r0) {
                case 1: goto L_0x037a;
                case 2: goto L_0x02c5;
                case 3: goto L_0x02bd;
                case 4: goto L_0x02b4;
                default: goto L_0x02b2;
            }
        L_0x02b2:
            goto L_0x03e1
        L_0x02b4:
            r0 = 4
            if (r11 >= r0) goto L_0x02bd
            r15.performPause()
            r14.m1846d(r15, r13)
        L_0x02bd:
            if (r11 >= r9) goto L_0x02c5
            r15.performStop()
            r14.m1847e(r15, r13)
        L_0x02c5:
            if (r11 >= r10) goto L_0x037a
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x02da
            android.support.v4.app.j r0 = r6.f2370m
            boolean r0 = r0.mo2030a(r15)
            if (r0 == 0) goto L_0x02da
            android.util.SparseArray<android.os.Parcelable> r0 = r7.mSavedViewState
            if (r0 != 0) goto L_0x02da
            r14.m1856n(r15)
        L_0x02da:
            r15.performDestroyView()
            r14.m1849f(r15, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x036b
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x036b
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.endViewTransition(r1)
            android.view.View r0 = r7.mView
            r0.clearAnimation()
            int r0 = r6.f2369l
            r1 = 0
            if (r0 <= 0) goto L_0x0314
            boolean r0 = r6.f2377u
            if (r0 != 0) goto L_0x0314
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0314
            float r0 = r7.mPostponedAlpha
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0314
            r0 = r17
            r2 = r18
            android.support.v4.app.m$c r0 = r14.m1821a(r15, r0, r13, r2)
            goto L_0x0315
        L_0x0314:
            r0 = r12
        L_0x0315:
            r7.mPostponedAlpha = r1
            if (r0 == 0) goto L_0x0364
            android.view.View r1 = r7.mView
            android.view.ViewGroup r2 = r7.mContainer
            r2.startViewTransition(r1)
            r15.setStateAfterAnimating(r11)
            android.view.animation.Animation r3 = r0.f2399a
            if (r3 == 0) goto L_0x0348
            android.support.v4.app.m$e r3 = new android.support.v4.app.m$e
            android.view.animation.Animation r4 = r0.f2399a
            r3.<init>(r4, r2, r1)
            android.view.View r4 = r7.mView
            r15.setAnimatingAway(r4)
            android.view.animation.Animation$AnimationListener r4 = m1822a(r3)
            android.support.v4.app.m$2 r5 = new android.support.v4.app.m$2
            r5.<init>(r4, r2, r15)
            r3.setAnimationListener(r5)
            m1829a(r1, r0)
            android.view.View r0 = r7.mView
            r0.startAnimation(r3)
            goto L_0x0364
        L_0x0348:
            android.animation.Animator r3 = r0.f2400b
            android.animation.Animator r4 = r0.f2400b
            r15.setAnimator(r4)
            android.support.v4.app.m$3 r4 = new android.support.v4.app.m$3
            r4.<init>(r2, r1, r15)
            r3.addListener(r4)
            android.view.View r1 = r7.mView
            r3.setTarget(r1)
            android.view.View r1 = r7.mView
            m1829a(r1, r0)
            r3.start()
        L_0x0364:
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.removeView(r1)
        L_0x036b:
            r7.mContainer = r12
            r7.mView = r12
            r7.mViewLifecycleOwner = r12
            android.arch.lifecycle.r<android.arch.lifecycle.k> r0 = r7.mViewLifecycleOwnerLiveData
            r0.setValue(r12)
            r7.mInnerView = r12
            r7.mInLayout = r13
        L_0x037a:
            if (r11 > 0) goto L_0x03e1
            boolean r0 = r6.f2377u
            if (r0 == 0) goto L_0x03a1
            android.view.View r0 = r15.getAnimatingAway()
            if (r0 == 0) goto L_0x0391
            android.view.View r0 = r15.getAnimatingAway()
            r15.setAnimatingAway(r12)
            r0.clearAnimation()
            goto L_0x03a1
        L_0x0391:
            android.animation.Animator r0 = r15.getAnimator()
            if (r0 == 0) goto L_0x03a1
            android.animation.Animator r0 = r15.getAnimator()
            r15.setAnimator(r12)
            r0.cancel()
        L_0x03a1:
            android.view.View r0 = r15.getAnimatingAway()
            if (r0 != 0) goto L_0x03dd
            android.animation.Animator r0 = r15.getAnimator()
            if (r0 == 0) goto L_0x03ae
            goto L_0x03dd
        L_0x03ae:
            boolean r0 = r7.mRetaining
            if (r0 != 0) goto L_0x03b9
            r15.performDestroy()
            r14.m1851g(r15, r13)
            goto L_0x03bb
        L_0x03b9:
            r7.mState = r13
        L_0x03bb:
            r15.performDetach()
            r14.m1852h(r15, r13)
            if (r19 != 0) goto L_0x03e1
            boolean r0 = r7.mRetaining
            if (r0 != 0) goto L_0x03d6
            int r0 = r7.mIndex
            if (r0 < 0) goto L_0x03e1
            android.util.SparseArray<android.support.v4.app.Fragment> r0 = r6.f2363f
            int r1 = r7.mIndex
            r0.put(r1, r12)
            r15.initState()
            goto L_0x03e1
        L_0x03d6:
            r7.mHost = r12
            r7.mParentFragment = r12
            r7.mFragmentManager = r12
            goto L_0x03e1
        L_0x03dd:
            r15.setStateAfterAnimating(r11)
            goto L_0x03e2
        L_0x03e1:
            r8 = r11
        L_0x03e2:
            int r0 = r7.mState
            if (r0 == r8) goto L_0x03e8
            r7.mState = r8
        L_0x03e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.app.C0658m.mo2256a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2253a(int i, boolean z) {
        if (this.f2370m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2369l) {
            this.f2369l = i;
            if (this.f2363f != null) {
                int size = this.f2362e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo2273c((Fragment) this.f2362e.get(i2));
                }
                int size2 = this.f2363f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Fragment fragment = (Fragment) this.f2363f.valueAt(i3);
                    if (fragment != null && ((fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)) {
                        mo2273c(fragment);
                    }
                }
                m1858u();
                if (this.f2374r && this.f2370m != null && this.f2369l == 4) {
                    this.f2370m.mo2034c();
                    this.f2374r = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2257a(Fragment fragment, boolean z) {
        mo2274d(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f2362e.contains(fragment)) {
            synchronized (this.f2362e) {
                this.f2362e.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f2374r = true;
            }
            if (z) {
                m1853k(fragment);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final Fragment mo2222a(int i) {
        for (int size = this.f2362e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2362e.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        if (this.f2363f != null) {
            for (int size2 = this.f2363f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f2363f.valueAt(size2);
                if (fragment2 != null && fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Fragment mo2224a(String str) {
        if (str != null) {
            for (int size = this.f2362e.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2362e.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (!(this.f2363f == null || str == null)) {
            for (int size2 = this.f2363f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f2363f.valueAt(size2);
                if (fragment2 != null && str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final Fragment mo2266b(String str) {
        if (!(this.f2363f == null || str == null)) {
            for (int size = this.f2363f.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2363f.valueAt(size);
                if (fragment != null) {
                    Fragment findFragmentByWho = fragment.findFragmentByWho(str);
                    if (findFragmentByWho != null) {
                        return findFragmentByWho;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo2260a(C0672h hVar, boolean z) {
        if (!z) {
            m1859v();
        }
        synchronized (this) {
            if (!this.f2377u) {
                if (this.f2370m != null) {
                    if (this.f2359b == null) {
                        this.f2359b = new ArrayList<>();
                    }
                    this.f2359b.add(hVar);
                    mo2277i();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public final int mo2252a(C0645d dVar) {
        synchronized (this) {
            if (this.f2367j != null) {
                if (this.f2367j.size() > 0) {
                    int intValue = ((Integer) this.f2367j.remove(this.f2367j.size() - 1)).intValue();
                    this.f2366i.set(intValue, dVar);
                    return intValue;
                }
            }
            if (this.f2366i == null) {
                this.f2366i = new ArrayList<>();
            }
            int size = this.f2366i.size();
            this.f2366i.add(dVar);
            return size;
        }
    }

    /* renamed from: b */
    public final void mo2269b(C0672h hVar, boolean z) {
        if (!z || (this.f2370m != null && !this.f2377u)) {
            m1843c(z);
            if (hVar.mo2188a(this.f2380x, this.f2381y)) {
                this.f2360c = true;
                try {
                    m1839b(this.f2380x, this.f2381y);
                } finally {
                    m1860w();
                }
            }
            m1863z();
            m1817C();
        }
    }

    /* renamed from: a */
    private void m1831a(ArrayList<C0645d> arrayList, ArrayList<Boolean> arrayList2) {
        int size = this.f2355C == null ? 0 : this.f2355C.size();
        int i = 0;
        while (i < size) {
            C0674j jVar = (C0674j) this.f2355C.get(i);
            if (arrayList != null && !jVar.f2414a) {
                int indexOf = arrayList.indexOf(jVar.f2415b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    jVar.mo2308d();
                    i++;
                }
            }
            if ((jVar.f2416c == 0) || (arrayList != null && jVar.f2415b.mo2187a(arrayList, 0, arrayList.size()))) {
                this.f2355C.remove(i);
                i--;
                size--;
                if (arrayList != null && !jVar.f2414a) {
                    int indexOf2 = arrayList.indexOf(jVar.f2415b);
                    if (indexOf2 != -1 && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                        jVar.mo2308d();
                    }
                }
                jVar.mo2307c();
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m1832a(ArrayList<C0645d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0645d> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = ((C0645d) arrayList3.get(i4)).f2329t;
        if (this.f2382z == null) {
            this.f2382z = new ArrayList<>();
        } else {
            this.f2382z.clear();
        }
        this.f2382z.addAll(this.f2362e);
        Fragment fragment = this.f2373p;
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0645d dVar = (C0645d) arrayList3.get(i6);
            if (!((Boolean) arrayList4.get(i6)).booleanValue()) {
                fragment = dVar.mo2172a(this.f2382z, fragment);
            } else {
                fragment = dVar.mo2190b(this.f2382z, fragment);
            }
            z2 = z2 || dVar.f2318i;
        }
        this.f2382z.clear();
        if (!z) {
            C0680s.m1964a(this, arrayList, arrayList2, i, i2, false);
        }
        m1840b(arrayList, arrayList2, i, i2);
        if (z) {
            C0779b bVar = new C0779b();
            m1838b(bVar);
            int a = m1818a(arrayList, arrayList2, i, i2, bVar);
            m1828a(bVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0680s.m1964a(this, arrayList, arrayList2, i, i3, true);
            mo2253a(this.f2369l, true);
        }
        while (i4 < i5) {
            C0645d dVar2 = (C0645d) arrayList3.get(i4);
            if (((Boolean) arrayList4.get(i4)).booleanValue() && dVar2.f2322m >= 0) {
                int i7 = dVar2.f2322m;
                synchronized (this) {
                    this.f2366i.set(i7, null);
                    if (this.f2367j == null) {
                        this.f2367j = new ArrayList<>();
                    }
                    this.f2367j.add(Integer.valueOf(i7));
                }
                dVar2.f2322m = -1;
            }
            dVar2.mo2180a();
            i4++;
        }
        if (z2) {
            m1815A();
        }
    }

    /* renamed from: a */
    private static void m1828a(C0779b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) bVar.mo2464a(i);
            if (!fragment.mAdded) {
                View view = fragment.getView();
                fragment.mPostponedAlpha = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2258a(C0645d dVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            dVar.mo2186a(z3);
        } else {
            dVar.mo2201f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(dVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0680s.m1964a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo2253a(this.f2369l, true);
        }
        if (this.f2363f != null) {
            int size = this.f2363f.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f2363f.valueAt(i);
                if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && dVar.mo2194b(fragment.mContainerId)) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    if (z3) {
                        fragment.mPostponedAlpha = 0.0f;
                    } else {
                        fragment.mPostponedAlpha = -1.0f;
                        fragment.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2265a(ArrayList<C0645d> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        if (this.f2364g == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.f2364g.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2364g.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            if (str != null || i >= 0) {
                int size2 = this.f2364g.size() - 1;
                while (i3 >= 0) {
                    C0645d dVar = (C0645d) this.f2364g.get(i3);
                    if ((str != null && str.equals(dVar.mo2202g())) || (i >= 0 && i == dVar.f2322m)) {
                        break;
                    }
                    size2 = i3 - 1;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    i3--;
                    while (i3 >= 0) {
                        C0645d dVar2 = (C0645d) this.f2364g.get(i3);
                        if ((str == null || !str.equals(dVar2.mo2202g())) && (i < 0 || i != dVar2.f2322m)) {
                            break;
                        }
                        i3--;
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f2364g.size() - 1) {
                return false;
            }
            for (int size3 = this.f2364g.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f2364g.remove(size3));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* renamed from: a */
    static void m1827a(C0676o oVar) {
        if (oVar != null) {
            List<Fragment> list = oVar.f2417a;
            if (list != null) {
                for (Fragment fragment : list) {
                    fragment.mRetaining = true;
                }
            }
            List<C0676o> list2 = oVar.f2418b;
            if (list2 != null) {
                for (C0676o a : list2) {
                    m1827a(a);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2255a(Parcelable parcelable, C0676o oVar) {
        List list;
        List list2;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f2111a != null) {
                if (oVar != null) {
                    List<Fragment> list3 = oVar.f2417a;
                    list2 = oVar.f2418b;
                    list = oVar.f2419c;
                    int size = list3 != null ? list3.size() : 0;
                    for (int i = 0; i < size; i++) {
                        Fragment fragment = (Fragment) list3.get(i);
                        int i2 = 0;
                        while (i2 < fragmentManagerState.f2111a.length && fragmentManagerState.f2111a[i2].f2117b != fragment.mIndex) {
                            i2++;
                        }
                        if (i2 == fragmentManagerState.f2111a.length) {
                            StringBuilder sb = new StringBuilder("Could not find active fragment with index ");
                            sb.append(fragment.mIndex);
                            m1830a((RuntimeException) new IllegalStateException(sb.toString()));
                        }
                        FragmentState fragmentState = fragmentManagerState.f2111a[i2];
                        fragmentState.f2127l = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        fragment.mTarget = null;
                        if (fragmentState.f2126k != null) {
                            fragmentState.f2126k.setClassLoader(this.f2370m.f2344c.getClassLoader());
                            fragment.mSavedViewState = fragmentState.f2126k.getSparseParcelableArray("android:view_state");
                            fragment.mSavedFragmentState = fragmentState.f2126k;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.f2363f = new SparseArray<>(fragmentManagerState.f2111a.length);
                int i3 = 0;
                while (i3 < fragmentManagerState.f2111a.length) {
                    FragmentState fragmentState2 = fragmentManagerState.f2111a[i3];
                    if (fragmentState2 != null) {
                        Fragment a = fragmentState2.mo2042a(this.f2370m, this.f2371n, this.f2372o, (list2 == null || i3 >= list2.size()) ? null : (C0676o) list2.get(i3), (list == null || i3 >= list.size()) ? null : (C0159aa) list.get(i3));
                        this.f2363f.put(a.mIndex, a);
                        fragmentState2.f2127l = null;
                    }
                    i3++;
                }
                if (oVar != null) {
                    List<Fragment> list4 = oVar.f2417a;
                    int size2 = list4 != null ? list4.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        Fragment fragment2 = (Fragment) list4.get(i4);
                        if (fragment2.mTargetIndex >= 0) {
                            fragment2.mTarget = (Fragment) this.f2363f.get(fragment2.mTargetIndex);
                        }
                    }
                }
                this.f2362e.clear();
                if (fragmentManagerState.f2112b != null) {
                    int i5 = 0;
                    while (i5 < fragmentManagerState.f2112b.length) {
                        Fragment fragment3 = (Fragment) this.f2363f.get(fragmentManagerState.f2112b[i5]);
                        if (fragment3 == null) {
                            StringBuilder sb2 = new StringBuilder("No instantiated fragment for index #");
                            sb2.append(fragmentManagerState.f2112b[i5]);
                            m1830a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        fragment3.mAdded = true;
                        if (!this.f2362e.contains(fragment3)) {
                            synchronized (this.f2362e) {
                                this.f2362e.add(fragment3);
                            }
                            i5++;
                        } else {
                            throw new IllegalStateException("Already added!");
                        }
                    }
                }
                if (fragmentManagerState.f2113c != null) {
                    this.f2364g = new ArrayList<>(fragmentManagerState.f2113c.length);
                    for (BackStackState a2 : fragmentManagerState.f2113c) {
                        C0645d a3 = a2.mo1799a(this);
                        if (f2351a) {
                            PrintWriter printWriter = new PrintWriter(new C0784f("FragmentManager"));
                            a3.mo2185a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2364g.add(a3);
                        if (a3.f2322m >= 0) {
                            m1823a(a3.f2322m, a3);
                        }
                    }
                } else {
                    this.f2364g = null;
                }
                if (fragmentManagerState.f2114d >= 0) {
                    this.f2373p = (Fragment) this.f2363f.get(fragmentManagerState.f2114d);
                }
                this.f2361d = fragmentManagerState.f2115e;
            }
        }
    }

    /* renamed from: a */
    public final void mo2259a(C0653j jVar, C0651h hVar, Fragment fragment) {
        if (this.f2370m == null) {
            this.f2370m = jVar;
            this.f2371n = hVar;
            this.f2372o = fragment;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: a */
    public final void mo2261a(boolean z) {
        for (int size = this.f2362e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2362e.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: b */
    public final void mo2271b(boolean z) {
        for (int size = this.f2362e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2362e.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo2254a(Configuration configuration) {
        for (int i = 0; i < this.f2362e.size(); i++) {
            Fragment fragment = (Fragment) this.f2362e.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2263a(Menu menu, MenuInflater menuInflater) {
        if (this.f2369l <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f2362e.size(); i++) {
            Fragment fragment = (Fragment) this.f2362e.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f2365h != null) {
            for (int i2 = 0; i2 < this.f2365h.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f2365h.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2365h = arrayList;
        return z;
    }

    /* renamed from: a */
    public final boolean mo2262a(Menu menu) {
        if (this.f2369l <= 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f2362e.size(); i++) {
            Fragment fragment = (Fragment) this.f2362e.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo2264a(MenuItem menuItem) {
        if (this.f2369l <= 0) {
            return false;
        }
        for (int i = 0; i < this.f2362e.size(); i++) {
            Fragment fragment = (Fragment) this.f2362e.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo2272b(MenuItem menuItem) {
        if (this.f2369l <= 0) {
            return false;
        }
        for (int i = 0; i < this.f2362e.size(); i++) {
            Fragment fragment = (Fragment) this.f2362e.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo2270b(Menu menu) {
        if (this.f2369l > 0) {
            for (int i = 0; i < this.f2362e.size(); i++) {
                Fragment fragment = (Fragment) this.f2362e.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2228a(C0655a aVar) {
        synchronized (this.f2358J) {
            int i = 0;
            int size = this.f2358J.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C0670f) this.f2358J.get(i)).f2407a == aVar) {
                    this.f2358J.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private void m1825a(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1825a(fragment, bundle, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentPreCreated(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    private void m1826a(Fragment fragment, View view, Bundle bundle, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1826a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentViewCreated(this, fragment, view, bundle);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1829a(android.view.View r5, android.support.p030v4.app.C0658m.C0667c r6) {
        /*
            if (r5 == 0) goto L_0x007a
            if (r6 != 0) goto L_0x0006
            goto L_0x007a
        L_0x0006:
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0053
            if (r6 != 0) goto L_0x000d
            goto L_0x0053
        L_0x000d:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r2 < r3) goto L_0x0053
            int r2 = r5.getLayerType()
            if (r2 != 0) goto L_0x0053
            boolean r2 = android.support.p030v4.view.C1056u.m3074t(r5)
            if (r2 == 0) goto L_0x0053
            android.view.animation.Animation r2 = r6.f2399a
            boolean r2 = r2 instanceof android.view.animation.AlphaAnimation
            if (r2 == 0) goto L_0x0027
        L_0x0025:
            r2 = 1
            goto L_0x0050
        L_0x0027:
            android.view.animation.Animation r2 = r6.f2399a
            boolean r2 = r2 instanceof android.view.animation.AnimationSet
            if (r2 == 0) goto L_0x004a
            android.view.animation.Animation r2 = r6.f2399a
            android.view.animation.AnimationSet r2 = (android.view.animation.AnimationSet) r2
            java.util.List r2 = r2.getAnimations()
            r3 = 0
        L_0x0036:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0048
            java.lang.Object r4 = r2.get(r3)
            boolean r4 = r4 instanceof android.view.animation.AlphaAnimation
            if (r4 == 0) goto L_0x0045
            goto L_0x0025
        L_0x0045:
            int r3 = r3 + 1
            goto L_0x0036
        L_0x0048:
            r2 = 0
            goto L_0x0050
        L_0x004a:
            android.animation.Animator r2 = r6.f2400b
            boolean r2 = m1833a(r2)
        L_0x0050:
            if (r2 == 0) goto L_0x0053
            r1 = 1
        L_0x0053:
            if (r1 == 0) goto L_0x0079
            android.animation.Animator r0 = r6.f2400b
            if (r0 == 0) goto L_0x0064
            android.animation.Animator r6 = r6.f2400b
            android.support.v4.app.m$d r0 = new android.support.v4.app.m$d
            r0.<init>(r5)
            r6.addListener(r0)
            return
        L_0x0064:
            android.view.animation.Animation r0 = r6.f2399a
            android.view.animation.Animation$AnimationListener r0 = m1822a(r0)
            r1 = 2
            r2 = 0
            r5.setLayerType(r1, r2)
            android.view.animation.Animation r6 = r6.f2399a
            android.support.v4.app.m$a r1 = new android.support.v4.app.m$a
            r1.<init>(r5, r0)
            r6.setAnimationListener(r1)
        L_0x0079:
            return
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.app.C0658m.m1829a(android.view.View, android.support.v4.app.m$c):void");
    }

    /* renamed from: a */
    public final C0679r mo2225a() {
        return new C0645d(this);
    }

    /* renamed from: b */
    public final boolean mo2234b() {
        boolean j = mo2280j();
        m1861x();
        return j;
    }

    /* renamed from: q */
    public final void mo2289q() {
        mo2267b(3);
    }

    /* renamed from: r */
    public final void mo2290r() {
        this.f2376t = true;
        mo2267b(2);
    }

    /* renamed from: w */
    private void m1860w() {
        this.f2360c = false;
        this.f2381y.clear();
        this.f2380x.clear();
    }

    /* renamed from: z */
    private void m1863z() {
        if (this.f2379w) {
            this.f2379w = false;
            m1858u();
        }
    }

    /* renamed from: c */
    public final void mo2235c() {
        mo2260a((C0672h) new C0673i(null, -1, 0), false);
    }

    /* renamed from: d */
    public final boolean mo2236d() {
        m1859v();
        return m1834a((String) null, -1, 0);
    }

    /* renamed from: e */
    public final int mo2237e() {
        if (this.f2364g != null) {
            return this.f2364g.size();
        }
        return 0;
    }

    /* renamed from: h */
    public final boolean mo2240h() {
        if (this.f2375s || this.f2376t) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo2283m() {
        this.f2375s = false;
        this.f2376t = false;
        mo2267b(1);
    }

    /* renamed from: n */
    public final void mo2284n() {
        this.f2375s = false;
        this.f2376t = false;
        mo2267b(2);
    }

    /* renamed from: o */
    public final void mo2285o() {
        this.f2375s = false;
        this.f2376t = false;
        mo2267b(3);
    }

    /* renamed from: p */
    public final void mo2288p() {
        this.f2375s = false;
        this.f2376t = false;
        mo2267b(4);
    }

    /* renamed from: A */
    private void m1815A() {
        if (this.f2368k != null) {
            for (int i = 0; i < this.f2368k.size(); i++) {
                ((C0656b) this.f2368k.get(i)).mo2251a();
            }
        }
    }

    /* renamed from: u */
    private void m1858u() {
        if (this.f2363f != null) {
            for (int i = 0; i < this.f2363f.size(); i++) {
                Fragment fragment = (Fragment) this.f2363f.valueAt(i);
                if (fragment != null) {
                    mo2268b(fragment);
                }
            }
        }
    }

    /* renamed from: x */
    private void m1861x() {
        if (this.f2355C != null) {
            while (!this.f2355C.isEmpty()) {
                ((C0674j) this.f2355C.remove(0)).mo2307c();
            }
        }
    }

    /* renamed from: f */
    public final List<Fragment> mo2238f() {
        List<Fragment> list;
        if (this.f2362e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2362e) {
            list = (List) this.f2362e.clone();
        }
        return list;
    }

    /* renamed from: s */
    public final void mo2291s() {
        this.f2377u = true;
        mo2280j();
        mo2267b(0);
        this.f2370m = null;
        this.f2371n = null;
        this.f2372o = null;
    }

    /* renamed from: t */
    public final void mo2292t() {
        for (int i = 0; i < this.f2362e.size(); i++) {
            Fragment fragment = (Fragment) this.f2362e.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    C0658m() {
    }

    /* renamed from: C */
    private void m1817C() {
        if (this.f2363f != null) {
            for (int size = this.f2363f.size() - 1; size >= 0; size--) {
                if (this.f2363f.valueAt(size) == null) {
                    this.f2363f.delete(this.f2363f.keyAt(size));
                }
            }
        }
    }

    /* renamed from: v */
    private void m1859v() {
        if (mo2240h()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f2378v != null) {
            StringBuilder sb = new StringBuilder("Can not perform this action inside of ");
            sb.append(this.f2378v);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo2277i() {
        boolean z;
        synchronized (this) {
            boolean z2 = false;
            if (this.f2355C == null || this.f2355C.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f2359b != null && this.f2359b.size() == 1) {
                z2 = true;
            }
            if (z || z2) {
                this.f2370m.f2345d.removeCallbacks(this.f2357E);
                this.f2370m.f2345d.post(this.f2357E);
            }
        }
    }

    /* renamed from: l */
    public final void mo2282l() {
        this.f2356D = null;
        this.f2375s = false;
        this.f2376t = false;
        int size = this.f2362e.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f2362e.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f2372o != null) {
            C0783e.m2224a(this.f2372o, sb);
        } else {
            C0783e.m2224a(this.f2370m, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: y */
    private void m1862y() {
        int i;
        if (this.f2363f == null) {
            i = 0;
        } else {
            i = this.f2363f.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            Fragment fragment = (Fragment) this.f2363f.valueAt(i2);
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    C0675n.m1929a(this, fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public final boolean mo2280j() {
        m1843c(true);
        boolean z = false;
        while (m1844c(this.f2380x, this.f2381y)) {
            this.f2360c = true;
            try {
                m1839b(this.f2380x, this.f2381y);
                m1860w();
                z = true;
            } catch (Throwable th) {
                m1860w();
                throw th;
            }
        }
        m1863z();
        m1817C();
        return z;
    }

    /* renamed from: B */
    private void m1816B() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0676o oVar;
        int i;
        if (this.f2363f != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i2 = 0; i2 < this.f2363f.size(); i2++) {
                Fragment fragment = (Fragment) this.f2363f.valueAt(i2);
                if (fragment != null) {
                    if (fragment.mRetainInstance) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(fragment);
                        if (fragment.mTarget != null) {
                            i = fragment.mTarget.mIndex;
                        } else {
                            i = -1;
                        }
                        fragment.mTargetIndex = i;
                    }
                    if (fragment.mChildFragmentManager != null) {
                        fragment.mChildFragmentManager.m1816B();
                        oVar = fragment.mChildFragmentManager.f2356D;
                    } else {
                        oVar = fragment.mChildNonConfig;
                    }
                    if (arrayList2 == null && oVar != null) {
                        arrayList2 = new ArrayList(this.f2363f.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(oVar);
                    }
                    if (arrayList == null && fragment.mViewModelStore != null) {
                        arrayList = new ArrayList(this.f2363f.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(fragment.mViewModelStore);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.f2356D = null;
        } else {
            this.f2356D = new C0676o(arrayList3, arrayList2, arrayList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final Parcelable mo2281k() {
        int[] iArr;
        m1861x();
        m1862y();
        mo2280j();
        this.f2375s = true;
        BackStackState[] backStackStateArr = null;
        this.f2356D = null;
        if (this.f2363f == null || this.f2363f.size() <= 0) {
            return null;
        }
        int size = this.f2363f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size];
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f2363f.valueAt(i);
            if (fragment != null) {
                if (fragment.mIndex < 0) {
                    StringBuilder sb = new StringBuilder("Failure saving state: active ");
                    sb.append(fragment);
                    sb.append(" has cleared index: ");
                    sb.append(fragment.mIndex);
                    m1830a((RuntimeException) new IllegalStateException(sb.toString()));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.mState <= 0 || fragmentState.f2126k != null) {
                    fragmentState.f2126k = fragment.mSavedFragmentState;
                } else {
                    fragmentState.f2126k = m1857o(fragment);
                    if (fragment.mTarget != null) {
                        if (fragment.mTarget.mIndex < 0) {
                            StringBuilder sb2 = new StringBuilder("Failure saving state: ");
                            sb2.append(fragment);
                            sb2.append(" has target not in fragment manager: ");
                            sb2.append(fragment.mTarget);
                            m1830a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        if (fragmentState.f2126k == null) {
                            fragmentState.f2126k = new Bundle();
                        }
                        mo2227a(fragmentState.f2126k, "android:target_state", fragment.mTarget);
                        if (fragment.mTargetRequestCode != 0) {
                            fragmentState.f2126k.putInt("android:target_req_state", fragment.mTargetRequestCode);
                        }
                    }
                }
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        int size2 = this.f2362e.size();
        if (size2 > 0) {
            iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Fragment) this.f2362e.get(i2)).mIndex;
                if (iArr[i2] < 0) {
                    StringBuilder sb3 = new StringBuilder("Failure saving state: active ");
                    sb3.append(this.f2362e.get(i2));
                    sb3.append(" has cleared index: ");
                    sb3.append(iArr[i2]);
                    m1830a((RuntimeException) new IllegalStateException(sb3.toString()));
                }
            }
        } else {
            iArr = null;
        }
        if (this.f2364g != null) {
            int size3 = this.f2364g.size();
            if (size3 > 0) {
                backStackStateArr = new BackStackState[size3];
                for (int i3 = 0; i3 < size3; i3++) {
                    backStackStateArr[i3] = new BackStackState((C0645d) this.f2364g.get(i3));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f2111a = fragmentStateArr;
        fragmentManagerState.f2112b = iArr;
        fragmentManagerState.f2113c = backStackStateArr;
        if (this.f2373p != null) {
            fragmentManagerState.f2114d = this.f2373p.mIndex;
        }
        fragmentManagerState.f2115e = this.f2361d;
        m1816B();
        return fragmentManagerState;
    }

    /* renamed from: f */
    public static void m1848f(Fragment fragment) {
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    /* renamed from: g */
    public static void m1850g(Fragment fragment) {
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: k */
    private void m1853k(Fragment fragment) {
        C0675n.m1929a(this, fragment, this.f2369l, 0, 0, false);
    }

    /* renamed from: b */
    public final void mo2233b(C0656b bVar) {
        if (this.f2368k != null) {
            this.f2368k.remove(bVar);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2267b(int i) {
        try {
            this.f2360c = true;
            mo2253a(i, false);
            this.f2360c = false;
            mo2280j();
        } catch (Throwable th) {
            this.f2360c = false;
            throw th;
        }
    }

    /* renamed from: m */
    private Fragment m1855m(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.f2362e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
            Fragment fragment2 = (Fragment) this.f2362e.get(indexOf);
            if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: n */
    private void m1856n(Fragment fragment) {
        if (fragment.mInnerView != null) {
            if (this.f2354B == null) {
                this.f2354B = new SparseArray<>();
            } else {
                this.f2354B.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.f2354B);
            if (this.f2354B.size() > 0) {
                fragment.mSavedViewState = this.f2354B;
                this.f2354B = null;
            }
        }
    }

    /* renamed from: j */
    public final void mo2279j(Fragment fragment) {
        if (fragment == null || (this.f2363f.get(fragment.mIndex) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            this.f2373p = fragment;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: o */
    private Bundle m1857o(Fragment fragment) {
        Bundle bundle;
        if (this.f2353A == null) {
            this.f2353A = new Bundle();
        }
        fragment.performSaveInstanceState(this.f2353A);
        m1845d(fragment, this.f2353A, false);
        if (!this.f2353A.isEmpty()) {
            bundle = this.f2353A;
            this.f2353A = null;
        } else {
            bundle = null;
        }
        if (fragment.mView != null) {
            m1856n(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: e */
    public final void mo2275e(Fragment fragment) {
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.f2362e) {
                this.f2362e.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f2374r = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    /* renamed from: h */
    public final void mo2276h(Fragment fragment) {
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                synchronized (this.f2362e) {
                    this.f2362e.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f2374r = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    /* renamed from: i */
    public final void mo2278i(Fragment fragment) {
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f2362e.contains(fragment)) {
                synchronized (this.f2362e) {
                    this.f2362e.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f2374r = true;
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Fragment already added: ");
            sb.append(fragment);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private static AnimationListener m1822a(Animation animation) {
        try {
            if (f2352q == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                f2352q = declaredField;
                declaredField.setAccessible(true);
            }
            return (AnimationListener) f2352q.get(animation);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private void m1843c(boolean z) {
        if (this.f2360c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2370m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f2370m.f2345d.getLooper()) {
            if (!z) {
                m1859v();
            }
            if (this.f2380x == null) {
                this.f2380x = new ArrayList<>();
                this.f2381y = new ArrayList<>();
            }
            this.f2360c = true;
            try {
                m1831a(null, null);
            } finally {
                this.f2360c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: l */
    private void m1854l(final Fragment fragment) {
        int i;
        if (fragment.mView != null) {
            C0667c a = m1821a(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (a == null || a.f2400b == null) {
                if (a != null) {
                    m1829a(fragment.mView, a);
                    fragment.mView.startAnimation(a.f2399a);
                    a.f2399a.start();
                }
                if (!fragment.mHidden || fragment.isHideReplaced()) {
                    i = 0;
                } else {
                    i = 8;
                }
                fragment.mView.setVisibility(i);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                a.f2400b.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fragment.mContainer;
                    final View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    a.f2400b.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.mView != null) {
                                fragment.mView.setVisibility(8);
                            }
                        }
                    });
                }
                m1829a(fragment.mView, a);
                a.f2400b.start();
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.f2374r = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo2274d(Fragment fragment) {
        if (fragment.mIndex < 0) {
            int i = this.f2361d;
            this.f2361d = i + 1;
            fragment.setIndex(i, this.f2372o);
            if (this.f2363f == null) {
                this.f2363f = new SparseArray<>();
            }
            this.f2363f.put(fragment.mIndex, fragment);
        }
    }

    /* renamed from: b */
    private void m1838b(C0779b<Fragment> bVar) {
        if (this.f2369l > 0) {
            int min = Math.min(this.f2369l, 3);
            int size = this.f2362e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f2362e.get(i);
                if (fragment.mState < min) {
                    C0675n.m1929a(this, fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo2273c(Fragment fragment) {
        if (fragment != null) {
            int i = this.f2369l;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            C0675n.m1929a(this, fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment m = m1855m(fragment);
                if (m != null) {
                    View view = m.mView;
                    ViewGroup viewGroup = fragment.mContainer;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(fragment.mView);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.mView, indexOfChild);
                    }
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    C0667c a = m1821a(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (a != null) {
                        m1829a(fragment.mView, a);
                        if (a.f2399a != null) {
                            fragment.mView.startAnimation(a.f2399a);
                        } else {
                            a.f2400b.setTarget(fragment.mView);
                            a.f2400b.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                m1854l(fragment);
            }
        }
    }

    /* renamed from: a */
    public final void mo2229a(C0655a aVar, boolean z) {
        this.f2358J.add(new C0670f(aVar, z));
    }

    /* renamed from: e */
    private void m1847e(Fragment fragment, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1847e(fragment, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentStopped(this, fragment);
            }
        }
    }

    /* renamed from: f */
    private void m1849f(Fragment fragment, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1849f(fragment, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentViewDestroyed(this, fragment);
            }
        }
    }

    /* renamed from: g */
    private void m1851g(Fragment fragment, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1851g(fragment, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentDestroyed(this, fragment);
            }
        }
    }

    /* renamed from: h */
    private void m1852h(Fragment fragment, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1852h(fragment, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentDetached(this, fragment);
            }
        }
    }

    /* renamed from: c */
    private void m1842c(Fragment fragment, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1842c(fragment, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentResumed(this, fragment);
            }
        }
    }

    /* renamed from: d */
    private void m1846d(Fragment fragment, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1846d(fragment, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentPaused(this, fragment);
            }
        }
    }

    /* renamed from: b */
    private void m1837b(Fragment fragment, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1837b(fragment, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentStarted(this, fragment);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1844c(java.util.ArrayList<android.support.p030v4.app.C0645d> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.m$h> r0 = r4.f2359b     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.util.ArrayList<android.support.v4.app.m$h> r0 = r4.f2359b     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            java.util.ArrayList<android.support.v4.app.m$h> r0 = r4.f2359b     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<android.support.v4.app.m$h> r3 = r4.f2359b     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003a }
            android.support.v4.app.m$h r3 = (android.support.p030v4.app.C0658m.C0672h) r3     // Catch:{ all -> 0x003a }
            boolean r3 = r3.mo2188a(r5, r6)     // Catch:{ all -> 0x003a }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<android.support.v4.app.m$h> r5 = r4.f2359b     // Catch:{ all -> 0x003a }
            r5.clear()     // Catch:{ all -> 0x003a }
            android.support.v4.app.j r5 = r4.f2370m     // Catch:{ all -> 0x003a }
            android.os.Handler r5 = r5.f2345d     // Catch:{ all -> 0x003a }
            java.lang.Runnable r6 = r4.f2357E     // Catch:{ all -> 0x003a }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r2
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.app.C0658m.m1844c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: a */
    private void m1823a(int i, C0645d dVar) {
        synchronized (this) {
            if (this.f2366i == null) {
                this.f2366i = new ArrayList<>();
            }
            int size = this.f2366i.size();
            if (i < size) {
                this.f2366i.set(i, dVar);
            } else {
                while (size < i) {
                    this.f2366i.add(null);
                    if (this.f2367j == null) {
                        this.f2367j = new ArrayList<>();
                    }
                    this.f2367j.add(Integer.valueOf(size));
                    size++;
                }
                this.f2366i.add(dVar);
            }
        }
    }

    /* renamed from: b */
    private void m1839b(ArrayList<C0645d> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m1831a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C0645d) arrayList.get(i)).f2329t) {
                    if (i2 != i) {
                        m1832a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0645d) arrayList.get(i2)).f2329t) {
                            i2++;
                        }
                    }
                    m1832a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m1832a(arrayList, arrayList2, i2, size);
            }
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: a */
    private static C0667c m1819a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f2348G);
        alphaAnimation.setDuration(220);
        return new C0667c((Animation) alphaAnimation);
    }

    /* renamed from: b */
    private void m1835b(Fragment fragment, Context context, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1835b(fragment, context, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentAttached(this, fragment, context);
            }
        }
    }

    /* renamed from: c */
    private void m1841c(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1841c(fragment, bundle, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentActivityCreated(this, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    private void m1845d(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1845d(fragment, bundle, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentSaveInstanceState(this, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    private void m1836b(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1836b(fragment, bundle, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentCreated(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    private void m1824a(Fragment fragment, Context context, boolean z) {
        if (this.f2372o != null) {
            C0654k fragmentManager = this.f2372o.getFragmentManager();
            if (fragmentManager instanceof C0658m) {
                ((C0658m) fragmentManager).m1824a(fragment, context, true);
            }
        }
        Iterator it = this.f2358J.iterator();
        while (it.hasNext()) {
            C0670f fVar = (C0670f) it.next();
            if (!z || fVar.f2408b) {
                fVar.f2407a.onFragmentPreAttached(this, fragment, context);
            }
        }
    }

    /* renamed from: a */
    private C0667c m1821a(Fragment fragment, int i, boolean z, int i2) {
        int nextAnim = fragment.getNextAnim();
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, nextAnim);
        if (onCreateAnimation != null) {
            return new C0667c(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i, z, nextAnim);
        if (onCreateAnimator != null) {
            return new C0667c(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.f2370m.f2344c.getResources().getResourceTypeName(nextAnim));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f2370m.f2344c, nextAnim);
                    if (loadAnimation != null) {
                        return new C0667c(loadAnimation);
                    }
                    z2 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f2370m.f2344c, nextAnim);
                    if (loadAnimator != null) {
                        return new C0667c(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f2370m.f2344c, nextAnim);
                        if (loadAnimation2 != null) {
                            return new C0667c(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        char c = 65535;
        if (i != 4097) {
            if (i != 4099) {
                if (i == 8194) {
                    if (z) {
                        c = 3;
                    } else {
                        c = 4;
                    }
                }
            } else if (z) {
                c = 5;
            } else {
                c = 6;
            }
        } else if (z) {
            c = 1;
        } else {
            c = 2;
        }
        if (c < 0) {
            return null;
        }
        switch (c) {
            case 1:
                return m1820a(this.f2370m.f2344c, 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m1820a(this.f2370m.f2344c, 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m1820a(this.f2370m.f2344c, 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m1820a(this.f2370m.f2344c, 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m1819a(this.f2370m.f2344c, 0.0f, 1.0f);
            case 6:
                return m1819a(this.f2370m.f2344c, 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f2370m.mo2035d()) {
                    i2 = this.f2370m.mo2036e();
                }
                return i2 == 0 ? null : null;
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        Fragment fragment2;
        int i;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0671g.f2409a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.isSupportFragmentClass(this.f2370m.f2344c, str2)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment = mo2222a(resourceId);
        } else {
            fragment = null;
        }
        if (fragment == null && string != null) {
            fragment = mo2224a(string);
        }
        if (fragment == null && i2 != -1) {
            fragment = mo2222a(i2);
        }
        if (fragment == null) {
            Fragment a = this.f2371n.mo1967a(context, str2, null);
            a.mFromLayout = true;
            if (resourceId != 0) {
                i = resourceId;
            } else {
                i = i2;
            }
            a.mFragmentId = i;
            a.mContainerId = i2;
            a.mTag = string;
            a.mInLayout = true;
            a.mFragmentManager = this;
            a.mHost = this.f2370m;
            a.onInflate(this.f2370m.f2344c, attributeSet, a.mSavedFragmentState);
            mo2257a(a, true);
            fragment2 = a;
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            fragment.mHost = this.f2370m;
            if (!fragment.mRetaining) {
                fragment.onInflate(this.f2370m.f2344c, attributeSet, fragment.mSavedFragmentState);
            }
            fragment2 = fragment;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Duplicate id 0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(", tag ");
            sb2.append(string);
            sb2.append(", or parent id 0x");
            sb2.append(Integer.toHexString(i2));
            sb2.append(" with another fragment for ");
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.f2369l > 0 || !fragment2.mFromLayout) {
            m1853k(fragment2);
        } else {
            C0675n.m1929a(this, fragment2, 1, 0, 0, false);
        }
        if (fragment2.mView != null) {
            if (resourceId != 0) {
                fragment2.mView.setId(resourceId);
            }
            if (fragment2.mView.getTag() == null) {
                fragment2.mView.setTag(string);
            }
            return fragment2.mView;
        }
        StringBuilder sb3 = new StringBuilder("Fragment ");
        sb3.append(str2);
        sb3.append(" did not create a view.");
        throw new IllegalStateException(sb3.toString());
    }

    /* renamed from: b */
    private static void m1840b(ArrayList<C0645d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0645d dVar = (C0645d) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                dVar.mo2181a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                dVar.mo2186a(z);
            } else {
                dVar.mo2181a(1);
                dVar.mo2201f();
            }
            i++;
        }
    }

    /* renamed from: a */
    private static C0667c m1820a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f2347F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f2348G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0667c((Animation) animationSet);
    }

    /* renamed from: a */
    private int m1818a(ArrayList<C0645d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0779b<Fragment> bVar) {
        boolean z;
        boolean z2;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0645d dVar = (C0645d) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            int i5 = 0;
            while (true) {
                z = true;
                if (i5 >= dVar.f2311b.size()) {
                    z2 = false;
                    break;
                } else if (C0645d.m1734b((C0646a) dVar.f2311b.get(i5))) {
                    z2 = true;
                    break;
                } else {
                    i5++;
                }
            }
            if (!z2 || dVar.mo2187a(arrayList, i4 + 1, i2)) {
                z = false;
            }
            if (z) {
                if (this.f2355C == null) {
                    this.f2355C = new ArrayList<>();
                }
                C0674j jVar = new C0674j(dVar, booleanValue);
                this.f2355C.add(jVar);
                dVar.mo2182a((C0586c) jVar);
                if (booleanValue) {
                    dVar.mo2201f();
                } else {
                    dVar.mo2186a(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, dVar);
                }
                m1838b(bVar);
            }
        }
        return i3;
    }
}
