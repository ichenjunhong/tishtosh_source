package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.p030v4.p033b.C0703a;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C1000h;
import android.support.p030v4.widget.C1119r;
import android.support.p030v4.widget.C1119r.C1122a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior */
public class ViewPagerBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public int f126009a;

    /* renamed from: b */
    int f126010b;

    /* renamed from: c */
    int f126011c;

    /* renamed from: d */
    public boolean f126012d;

    /* renamed from: e */
    public boolean f126013e;

    /* renamed from: f */
    public int f126014f = 4;

    /* renamed from: g */
    C1119r f126015g;

    /* renamed from: h */
    int f126016h;

    /* renamed from: i */
    WeakReference<V> f126017i;

    /* renamed from: j */
    WeakReference<View> f126018j;

    /* renamed from: k */
    public C50259a f126019k;

    /* renamed from: l */
    int f126020l;

    /* renamed from: m */
    boolean f126021m;

    /* renamed from: n */
    private float f126022n;

    /* renamed from: o */
    private int f126023o;

    /* renamed from: p */
    private boolean f126024p;

    /* renamed from: q */
    private boolean f126025q;

    /* renamed from: r */
    private int f126026r;

    /* renamed from: s */
    private boolean f126027s;

    /* renamed from: t */
    private VelocityTracker f126028t;

    /* renamed from: u */
    private int f126029u;

    /* renamed from: v */
    private boolean f126030v;

    /* renamed from: w */
    private final C1122a f126031w = new C1122a() {
        /* renamed from: a */
        public final void mo1307a(int i) {
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.mo98154b(1);
            }
        }

        /* renamed from: a */
        public final int mo1305a(View view) {
            if (ViewPagerBottomSheetBehavior.this.f126012d) {
                return ViewPagerBottomSheetBehavior.this.f126016h - ViewPagerBottomSheetBehavior.this.f126010b;
            }
            return ViewPagerBottomSheetBehavior.this.f126011c - ViewPagerBottomSheetBehavior.this.f126010b;
        }

        /* renamed from: a */
        public final boolean mo1310a(View view, int i) {
            if (ViewPagerBottomSheetBehavior.this.f126014f == 1 || ViewPagerBottomSheetBehavior.this.f126021m) {
                return false;
            }
            if (ViewPagerBottomSheetBehavior.this.f126014f == 3 && ViewPagerBottomSheetBehavior.this.f126020l == i) {
                View view2 = (View) ViewPagerBottomSheetBehavior.this.f126018j.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (ViewPagerBottomSheetBehavior.this.f126017i == null || ViewPagerBottomSheetBehavior.this.f126017i.get() != view) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final int mo1311b(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: a */
        public final int mo1306a(View view, int i, int i2) {
            int i3;
            int i4 = ViewPagerBottomSheetBehavior.this.f126010b;
            if (ViewPagerBottomSheetBehavior.this.f126012d) {
                i3 = ViewPagerBottomSheetBehavior.this.f126016h;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f126011c;
            }
            return C0703a.m2034a(i, i4, i3);
        }

        /* renamed from: a */
        public final void mo1308a(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = ViewPagerBottomSheetBehavior.this.f126010b;
            } else if (!ViewPagerBottomSheetBehavior.this.f126012d || !ViewPagerBottomSheetBehavior.this.mo98153a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f126010b) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f126011c)) {
                        i = ViewPagerBottomSheetBehavior.this.f126010b;
                    } else {
                        i2 = ViewPagerBottomSheetBehavior.this.f126011c;
                    }
                } else {
                    i2 = ViewPagerBottomSheetBehavior.this.f126011c;
                }
                i = i2;
                i3 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f126016h;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f126015g.mo3573a(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.mo98154b(2);
                C1056u.m3034a(view, (Runnable) new C50262c(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.mo98154b(i3);
        }

        /* renamed from: a */
        public final void mo1309a(View view, int i, int i2, int i3, int i4) {
            ViewPagerBottomSheetBehavior.this.mo98155c(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final int f126036a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f126036a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f126036a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f126036a);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior$a */
    public static abstract class C50259a {
        /* renamed from: a */
        public abstract void mo73929a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior$b */
    public static class C50260b extends C1000h {

        /* renamed from: a */
        public final ViewPagerBottomSheetBehavior f126037a;

        /* renamed from: b */
        private final ViewPager f126038b;

        public final void onPageSelected(int i) {
            this.f126038b.post(new Runnable() {
                public final void run() {
                    if (C50260b.this.f126037a.f126017i != null) {
                        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = C50260b.this.f126037a;
                        viewPagerBottomSheetBehavior.f126018j = new WeakReference<>(viewPagerBottomSheetBehavior.mo98150a((View) viewPagerBottomSheetBehavior.f126017i.get()));
                    }
                }
            });
        }

        private C50260b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f126038b = viewPager;
            this.f126037a = viewPagerBottomSheetBehavior;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior$c */
    class C50262c implements Runnable {

        /* renamed from: b */
        private final View f126041b;

        /* renamed from: c */
        private final int f126042c;

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f126015g == null || !ViewPagerBottomSheetBehavior.this.f126015g.mo3576a(true)) {
                ViewPagerBottomSheetBehavior.this.mo98154b(this.f126042c);
            } else {
                C1056u.m3034a(this.f126041b, (Runnable) this);
            }
        }

        C50262c(View view, int i) {
            this.f126041b = view;
            this.f126042c = i;
        }
    }

    /* renamed from: a */
    public final boolean mo935a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f126026r = 0;
        this.f126027s = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo98153a(View view, float f) {
        if (this.f126013e) {
            return true;
        }
        if (view.getTop() >= this.f126011c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f126011c)) / ((float) this.f126023o) > 0.5f) {
            return true;
        }
        return false;
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* renamed from: a */
    private void m108491a() {
        this.f126020l = -1;
        if (this.f126028t != null) {
            this.f126028t.recycle();
            this.f126028t = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo98155c(int i) {
        this.f126017i.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo98154b(int i) {
        if (this.f126014f != i) {
            this.f126014f = i;
            View view = (View) this.f126017i.get();
            if (!(view == null || this.f126019k == null)) {
                this.f126019k.mo73929a(view, i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m108492d(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f126024p
            if (r4 != 0) goto L_0x0015
            r3.f126024p = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f126024p
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f126023o
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f126024p = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f126023o = r1
            int r1 = r3.f126016h
            int r1 = r1 - r4
            r3.f126011c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f126014f
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f126017i
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f126017i
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.m108492d(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo98150a(View view) {
        if (view == null) {
            return null;
        }
        if (this.f126030v) {
            return (View) this.f126018j.get();
        }
        if (C1056u.m3078x(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View a = mo98150a(C50289m.m108553a((ViewPager) view));
            if (a != null) {
                return a;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View a2 = mo98150a(viewGroup.getChildAt(i));
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo98151a(final int i) {
        if (i != this.f126014f) {
            if (this.f126017i == null) {
                if (i == 4 || i == 3 || (this.f126012d && i == 5)) {
                    this.f126014f = i;
                }
                return;
            }
            final View view = (View) this.f126017i.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !C1056u.m3018B(view)) {
                    mo98152a(view, i);
                } else {
                    view.post(new Runnable() {
                        public final void run() {
                            ViewPagerBottomSheetBehavior.this.mo98152a(view, i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public final Parcelable mo1215b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1215b(coordinatorLayout, v), this.f126014f);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.c7, R.attr.c8, R.attr.c_, R.attr.ca});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            m108492d(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            m108492d(peekValue.data);
        }
        this.f126012d = obtainStyledAttributes.getBoolean(1, false);
        this.f126013e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f126022n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo98152a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f126011c;
        } else if (i == 3) {
            i2 = this.f126010b;
        } else if (!this.f126012d || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f126016h;
        }
        if (this.f126015g.mo3575a(view, view.getLeft(), i2)) {
            mo98154b(2);
            C1056u.m3034a(view, (Runnable) new C50262c(view, i));
            return;
        }
        mo98154b(i);
    }

    /* renamed from: a */
    public final void mo1206a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1206a(coordinatorLayout, v, savedState.f3119e);
        if (savedState.f126036a == 1 || savedState.f126036a == 2) {
            this.f126014f = 4;
        } else {
            this.f126014f = savedState.f126036a;
        }
    }

    /* renamed from: b */
    public final boolean mo1255b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f126025q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m108491a();
        }
        if (this.f126028t == null) {
            this.f126028t = VelocityTracker.obtain();
        }
        this.f126028t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f126029u = (int) motionEvent.getY();
                    if (this.f126018j != null) {
                        view = (View) this.f126018j.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1329a(view, x, this.f126029u)) {
                        this.f126020l = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f126021m = true;
                    }
                    if (this.f126020l != -1 || coordinatorLayout.mo1329a((View) v, x, this.f126029u)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f126025q = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f126021m = false;
        this.f126020l = -1;
        if (this.f126025q) {
            this.f126025q = false;
            return false;
        }
        if (!this.f126025q && this.f126015g.mo3574a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f126018j.get();
        if (actionMasked != 2 || view2 == null || this.f126025q || this.f126014f == 1 || coordinatorLayout.mo1329a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f126029u) - motionEvent.getY()) <= ((float) this.f126015g.f3563b)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo1374c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f126010b) {
            mo98154b(3);
        } else if (this.f126018j != null && view == this.f126018j.get() && this.f126027s) {
            if (this.f126026r > 0) {
                i = this.f126010b;
            } else {
                if (this.f126012d) {
                    this.f126028t.computeCurrentVelocity(1000, this.f126022n);
                    if (mo98153a((View) v, this.f126028t.getYVelocity(this.f126020l))) {
                        i = this.f126016h;
                        i2 = 5;
                    }
                }
                if (this.f126026r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f126010b) < Math.abs(top - this.f126011c)) {
                        i = this.f126010b;
                    } else {
                        i = this.f126011c;
                    }
                } else {
                    i = this.f126011c;
                }
                i2 = 4;
            }
            if (this.f126015g.mo3575a((View) v, v.getLeft(), i)) {
                mo98154b(2);
                C1056u.m3034a((View) v, (Runnable) new C50262c(v, i2));
            } else {
                mo98154b(i2);
            }
            this.f126027s = false;
        }
    }

    /* renamed from: a */
    public final boolean mo934a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        if (C1056u.m3073s(coordinatorLayout) && !C1056u.m3073s(v)) {
            C1056u.m3045b((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.mo1325a((View) v, i);
        this.f126016h = coordinatorLayout.getHeight();
        if (this.f126024p) {
            if (this.f126009a == 0) {
                this.f126009a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.fz);
            }
            i2 = Math.max(this.f126009a, this.f126016h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f126023o;
        }
        this.f126010b = Math.max(0, this.f126016h - v.getHeight());
        this.f126011c = Math.max(this.f126016h - i2, this.f126010b);
        if (this.f126014f == 3) {
            C1056u.m3058g(v, this.f126010b);
        } else if (this.f126012d && this.f126014f == 5) {
            C1056u.m3058g(v, this.f126016h);
        } else if (this.f126014f == 4) {
            C1056u.m3058g(v, this.f126011c);
        } else if (this.f126014f == 1 || this.f126014f == 2) {
            C1056u.m3058g(v, top - v.getTop());
        }
        if (this.f126015g == null) {
            this.f126015g = C1119r.m3272a((ViewGroup) coordinatorLayout, this.f126031w);
        }
        this.f126017i = new WeakReference<>(v);
        this.f126018j = new WeakReference<>(mo98150a((View) v));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1171a(android.support.design.widget.CoordinatorLayout r6, V r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            boolean r6 = r7.isShown()
            r0 = 0
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r6 = r8.getActionMasked()
            int r1 = r5.f126014f
            r2 = 1
            if (r1 != r2) goto L_0x0014
            if (r6 != 0) goto L_0x0014
            return r2
        L_0x0014:
            int r1 = r8.getAction()
            r3 = 2
            if (r1 == r3) goto L_0x0022
            int r1 = r8.getAction()
            r4 = 6
            if (r1 != r4) goto L_0x0038
        L_0x0022:
            android.support.v4.widget.r r1 = r5.f126015g
            int r1 = r1.f3564c
            int r1 = r8.findPointerIndex(r1)
            android.support.v4.widget.r r4 = r5.f126015g
            if (r4 == 0) goto L_0x0038
            android.support.v4.widget.r r4 = r5.f126015g
            int r4 = r4.f3562a
            if (r4 != r2) goto L_0x0038
            if (r1 >= 0) goto L_0x0038
            r1 = 0
            goto L_0x0039
        L_0x0038:
            r1 = 1
        L_0x0039:
            android.support.v4.widget.r r4 = r5.f126015g
            if (r4 == 0) goto L_0x0044
            if (r1 == 0) goto L_0x0044
            android.support.v4.widget.r r1 = r5.f126015g
            r1.mo3580b(r8)
        L_0x0044:
            if (r6 != 0) goto L_0x0049
            r5.m108491a()
        L_0x0049:
            android.view.VelocityTracker r1 = r5.f126028t
            if (r1 != 0) goto L_0x0053
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r5.f126028t = r1
        L_0x0053:
            android.view.VelocityTracker r1 = r5.f126028t
            r1.addMovement(r8)
            if (r6 != r3) goto L_0x0080
            boolean r6 = r5.f126025q
            if (r6 != 0) goto L_0x0080
            int r6 = r5.f126029u
            float r6 = (float) r6
            float r1 = r8.getY()
            float r6 = r6 - r1
            float r6 = java.lang.Math.abs(r6)
            android.support.v4.widget.r r1 = r5.f126015g
            int r1 = r1.f3563b
            float r1 = (float) r1
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0080
            android.support.v4.widget.r r6 = r5.f126015g
            int r1 = r8.getActionIndex()
            int r8 = r8.getPointerId(r1)
            r6.mo3571a(r7, r8)
        L_0x0080:
            boolean r6 = r5.f126025q
            if (r6 != 0) goto L_0x0085
            return r2
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.mo1171a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final boolean mo1298a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view != this.f126018j.get() || (this.f126014f == 3 && !super.mo1298a(coordinatorLayout, v, view, f, f2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1372a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f126018j.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f126010b) {
                    iArr[1] = top - this.f126010b;
                    C1056u.m3058g(v, -iArr[1]);
                    mo98154b(3);
                } else {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo98154b(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i3 <= this.f126011c || this.f126012d) {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo98154b(1);
                } else {
                    iArr[1] = top - this.f126011c;
                    C1056u.m3058g(v, -iArr[1]);
                    mo98154b(4);
                }
            }
            mo98155c(v.getTop());
            this.f126026r = i2;
            this.f126027s = true;
        }
    }
}
