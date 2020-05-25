package com.p683ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.p030v4.p033b.C0703a;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.widget.C1119r;
import android.support.p030v4.widget.C1119r.C1122a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior */
public class ViewPagerBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public float f57213a;

    /* renamed from: b */
    int f57214b;

    /* renamed from: c */
    boolean f57215c;

    /* renamed from: d */
    public int f57216d;

    /* renamed from: e */
    int f57217e;

    /* renamed from: f */
    int f57218f;

    /* renamed from: g */
    public boolean f57219g;

    /* renamed from: h */
    public boolean f57220h;

    /* renamed from: i */
    public int f57221i = 4;

    /* renamed from: j */
    C1119r f57222j;

    /* renamed from: k */
    int f57223k;

    /* renamed from: l */
    WeakReference<V> f57224l;

    /* renamed from: m */
    WeakReference<View> f57225m;

    /* renamed from: n */
    public C21042a f57226n;

    /* renamed from: o */
    int f57227o;

    /* renamed from: p */
    boolean f57228p;

    /* renamed from: q */
    private float f57229q;

    /* renamed from: r */
    private boolean f57230r;

    /* renamed from: s */
    private boolean f57231s;

    /* renamed from: t */
    private VelocityTracker f57232t;

    /* renamed from: u */
    private int f57233u;

    /* renamed from: v */
    private final C1122a f57234v = new C1122a() {
        /* renamed from: a */
        public final void mo1307a(int i) {
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.mo45061b(1);
            }
        }

        /* renamed from: a */
        public final int mo1305a(View view) {
            if (ViewPagerBottomSheetBehavior.this.f57219g) {
                return ViewPagerBottomSheetBehavior.this.f57223k - ViewPagerBottomSheetBehavior.this.f57217e;
            }
            return ViewPagerBottomSheetBehavior.this.f57218f - ViewPagerBottomSheetBehavior.this.f57217e;
        }

        /* renamed from: a */
        public final boolean mo1310a(View view, int i) {
            if (ViewPagerBottomSheetBehavior.this.f57221i == 1 || ViewPagerBottomSheetBehavior.this.f57228p) {
                return false;
            }
            if (ViewPagerBottomSheetBehavior.this.f57221i == 3 && ViewPagerBottomSheetBehavior.this.f57227o == i) {
                View view2 = (View) ViewPagerBottomSheetBehavior.this.f57225m.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (ViewPagerBottomSheetBehavior.this.f57224l == null || ViewPagerBottomSheetBehavior.this.f57224l.get() != view) {
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
            int i4 = ViewPagerBottomSheetBehavior.this.f57217e;
            if (ViewPagerBottomSheetBehavior.this.f57219g) {
                i3 = ViewPagerBottomSheetBehavior.this.f57223k;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f57218f;
            }
            return C0703a.m2034a(i, i4, i3);
        }

        /* renamed from: a */
        public final void mo1308a(View view, float f, float f2) {
            int i;
            int i2 = 3;
            if (f2 < 0.0f && Math.abs(f2) > ViewPagerBottomSheetBehavior.this.f57213a && Math.abs(f2) > Math.abs(f)) {
                i = ViewPagerBottomSheetBehavior.this.f57217e;
            } else if (!ViewPagerBottomSheetBehavior.this.f57219g || !ViewPagerBottomSheetBehavior.this.mo45060a(view, f2)) {
                if (f2 <= 0.0f || Math.abs(f2) <= ViewPagerBottomSheetBehavior.this.f57213a || Math.abs(f2) <= Math.abs(f)) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f57217e) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f57218f)) {
                        i = ViewPagerBottomSheetBehavior.this.f57217e;
                    }
                }
                i = ViewPagerBottomSheetBehavior.this.f57218f;
                i2 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f57223k;
                i2 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f57222j.mo3573a(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.mo45061b(2);
                C1056u.m3034a(view, (Runnable) new C21043b(view, i2));
                return;
            }
            ViewPagerBottomSheetBehavior.this.mo45061b(i2);
        }

        /* renamed from: a */
        public final void mo1309a(View view, int i, int i2, int i3, int i4) {
            ViewPagerBottomSheetBehavior.this.mo45062c(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior$SavedState */
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
        final int f57239a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f57239a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f57239a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f57239a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior$a */
    public static abstract class C21042a {
        /* renamed from: a */
        public abstract void mo45013a(View view, float f);

        /* renamed from: a */
        public abstract void mo45014a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior$b */
    class C21043b implements Runnable {

        /* renamed from: b */
        private final View f57241b;

        /* renamed from: c */
        private final int f57242c;

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f57222j == null || !ViewPagerBottomSheetBehavior.this.f57222j.mo3576a(true)) {
                ViewPagerBottomSheetBehavior.this.mo45061b(this.f57242c);
            } else {
                C1056u.m3034a(this.f57241b, (Runnable) this);
            }
        }

        C21043b(View view, int i) {
            this.f57241b = view;
            this.f57242c = i;
        }
    }

    /* renamed from: a */
    public final boolean mo935a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f57231s = false;
        return (i & 2) != 0;
    }

    /* renamed from: a */
    public final boolean mo1298a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f57225m.get() && (this.f57221i != 3 || super.mo1298a(coordinatorLayout, v, view, f, f2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo45060a(View view, float f) {
        if (this.f57220h) {
            return true;
        }
        if (view.getTop() >= this.f57218f && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f57218f)) / ((float) this.f57214b) > 0.5f) {
            return true;
        }
        return false;
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* renamed from: a */
    private void m53461a() {
        this.f57227o = -1;
        if (this.f57232t != null) {
            this.f57232t.recycle();
            this.f57232t = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo45061b(int i) {
        if (this.f57221i != i) {
            this.f57221i = i;
            View view = (View) this.f57224l.get();
            if (!(view == null || this.f57226n == null)) {
                this.f57226n.mo45014a(view, i);
            }
        }
    }

    /* renamed from: b */
    public static <V extends View> ViewPagerBottomSheetBehavior<V> m53462b(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0505d) {
            Behavior behavior = ((C0505d) layoutParams).f1693a;
            if (behavior instanceof ViewPagerBottomSheetBehavior) {
                return (ViewPagerBottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with ViewPagerBottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo45057a(View view) {
        if (C1056u.m3078x(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View a = C21067ah.m53528a((ViewPager) view);
            if (a == null) {
                return null;
            }
            View a2 = mo45057a(a);
            if (a2 != null) {
                return a2;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a3 = mo45057a(viewGroup.getChildAt(i));
                if (a3 != null) {
                    return a3;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo45062c(int i) {
        View view = (View) this.f57224l.get();
        if (!(view == null || this.f57226n == null)) {
            if (i > this.f57218f) {
                this.f57226n.mo45013a(view, ((float) (this.f57218f - i)) / ((float) (this.f57223k - this.f57218f)));
                return;
            }
            this.f57226n.mo45013a(view, ((float) (this.f57218f - i)) / ((float) (this.f57218f - this.f57217e)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45058a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f57215c
            if (r4 != 0) goto L_0x0015
            r3.f57215c = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f57215c
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f57214b
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f57215c = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f57214b = r1
            int r1 = r3.f57223k
            int r1 = r1 - r4
            r3.f57218f = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f57221i
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f57224l
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f57224l
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.mo45058a(int):void");
    }

    /* renamed from: b */
    public final Parcelable mo1215b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1215b(coordinatorLayout, v), this.f57221i);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.c7, R.attr.c8, R.attr.c_, R.attr.ca});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo45058a(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo45058a(peekValue.data);
        }
        this.f57219g = obtainStyledAttributes.getBoolean(1, false);
        this.f57220h = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f57229q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
        this.f57213a = (float) viewConfiguration.getScaledMinimumFlingVelocity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo45059a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f57218f;
        } else if (i == 3) {
            i2 = this.f57217e;
        } else if (!this.f57219g || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f57223k;
        }
        if (this.f57222j.mo3575a(view, view.getLeft(), i2)) {
            mo45061b(2);
            C1056u.m3034a(view, (Runnable) new C21043b(view, i));
            return;
        }
        mo45061b(i);
    }

    /* renamed from: a */
    public final void mo1206a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1206a(coordinatorLayout, v, savedState.f3119e);
        if (savedState.f57239a == 1 || savedState.f57239a == 2) {
            this.f57221i = 4;
        } else {
            this.f57221i = savedState.f57239a;
        }
    }

    /* renamed from: b */
    public final boolean mo1255b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f57230r = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m53461a();
        }
        if (this.f57232t == null) {
            this.f57232t = VelocityTracker.obtain();
        }
        this.f57232t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f57233u = (int) motionEvent.getY();
                    if (this.f57225m != null) {
                        view = (View) this.f57225m.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1329a(view, x, this.f57233u)) {
                        this.f57227o = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f57228p = true;
                    }
                    if (this.f57227o != -1 || coordinatorLayout.mo1329a((View) v, x, this.f57233u)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f57230r = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f57228p = false;
        this.f57227o = -1;
        if (this.f57230r) {
            this.f57230r = false;
            return false;
        }
        if (!this.f57230r && this.f57222j.mo3574a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f57225m.get();
        if (actionMasked != 2 || view2 == null || this.f57230r || this.f57221i == 1 || coordinatorLayout.mo1329a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f57233u) - motionEvent.getY()) <= ((float) this.f57222j.f3563b)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo1374c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f57217e) {
            mo45061b(3);
        } else if (this.f57225m != null && view == this.f57225m.get() && this.f57231s) {
            this.f57232t.computeCurrentVelocity(1000, this.f57229q);
            float xVelocity = this.f57232t.getXVelocity(this.f57227o);
            float yVelocity = this.f57232t.getYVelocity(this.f57227o);
            if (yVelocity < 0.0f && Math.abs(yVelocity) > this.f57213a && Math.abs(yVelocity) > Math.abs(xVelocity)) {
                i = this.f57217e;
            } else if (!this.f57219g || !mo45060a((View) v, yVelocity)) {
                if (yVelocity <= 0.0f || Math.abs(yVelocity) <= this.f57213a || Math.abs(yVelocity) <= Math.abs(xVelocity)) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f57217e) < Math.abs(top - this.f57218f)) {
                        i = this.f57217e;
                    }
                }
                i = this.f57218f;
                i2 = 4;
            } else {
                i = this.f57223k;
                i2 = 5;
            }
            if (this.f57222j.mo3575a((View) v, v.getLeft(), i)) {
                mo45061b(2);
                C1056u.m3034a((View) v, (Runnable) new C21043b(v, i2));
            } else {
                mo45061b(i2);
            }
            this.f57231s = false;
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
        this.f57223k = coordinatorLayout.getHeight();
        if (this.f57215c) {
            if (this.f57216d == 0) {
                this.f57216d = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.fz);
            }
            i2 = Math.max(this.f57216d, this.f57223k - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f57214b;
        }
        this.f57217e = Math.max(0, this.f57223k - v.getHeight());
        this.f57218f = Math.max(this.f57223k - i2, this.f57217e);
        if (this.f57221i == 3) {
            C1056u.m3058g(v, this.f57217e);
        } else if (this.f57219g && this.f57221i == 5) {
            C1056u.m3058g(v, this.f57223k);
        } else if (this.f57221i == 4) {
            C1056u.m3058g(v, this.f57218f);
        } else if (this.f57221i == 1 || this.f57221i == 2) {
            C1056u.m3058g(v, top - v.getTop());
        }
        if (this.f57222j == null) {
            this.f57222j = C1119r.m3272a((ViewGroup) coordinatorLayout, this.f57234v);
        }
        this.f57224l = new WeakReference<>(v);
        this.f57225m = new WeakReference<>(mo45057a((View) v));
        return true;
    }

    /* renamed from: a */
    public final boolean mo1171a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f57221i == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f57222j != null) {
            this.f57222j.mo3580b(motionEvent);
        }
        if (actionMasked == 0) {
            m53461a();
        }
        if (this.f57232t == null) {
            this.f57232t = VelocityTracker.obtain();
        }
        this.f57232t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f57230r && Math.abs(((float) this.f57233u) - motionEvent.getY()) > ((float) this.f57222j.f3563b)) {
            this.f57222j.mo3571a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f57230r) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1372a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f57225m.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f57217e) {
                    iArr[1] = top - this.f57217e;
                    C1056u.m3058g(v, -iArr[1]);
                    mo45061b(3);
                } else {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo45061b(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i3 <= this.f57218f || this.f57219g) {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo45061b(1);
                } else {
                    iArr[1] = top - this.f57218f;
                    C1056u.m3058g(v, -iArr[1]);
                    mo45061b(4);
                }
            }
            mo45062c(v.getTop());
            this.f57231s = true;
        }
    }
}
