package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

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
import android.support.p030v4.widget.C1119r;
import android.support.p030v4.widget.C1119r.C1122a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.PageBottomSheetBehavior */
public class PageBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public int f90829a;

    /* renamed from: b */
    int f90830b;

    /* renamed from: c */
    int f90831c;

    /* renamed from: d */
    public boolean f90832d;

    /* renamed from: e */
    public boolean f90833e;

    /* renamed from: f */
    public int f90834f = 4;

    /* renamed from: g */
    C1119r f90835g;

    /* renamed from: h */
    int f90836h;

    /* renamed from: i */
    WeakReference<V> f90837i;

    /* renamed from: j */
    WeakReference<View> f90838j;

    /* renamed from: k */
    int f90839k;

    /* renamed from: l */
    boolean f90840l;

    /* renamed from: m */
    public boolean f90841m = true;

    /* renamed from: n */
    private float f90842n;

    /* renamed from: o */
    private int f90843o;

    /* renamed from: p */
    private boolean f90844p;

    /* renamed from: q */
    private boolean f90845q;

    /* renamed from: r */
    private int f90846r;

    /* renamed from: s */
    private boolean f90847s;

    /* renamed from: t */
    private VelocityTracker f90848t;

    /* renamed from: u */
    private int f90849u;

    /* renamed from: v */
    private final C1122a f90850v = new C1122a() {
        /* renamed from: a */
        public final void mo1307a(int i) {
            if (i == 1) {
                PageBottomSheetBehavior.this.mo73599a(1);
            }
        }

        /* renamed from: a */
        public final int mo1305a(View view) {
            if (PageBottomSheetBehavior.this.f90832d) {
                return PageBottomSheetBehavior.this.f90836h - PageBottomSheetBehavior.this.f90830b;
            }
            return PageBottomSheetBehavior.this.f90831c - PageBottomSheetBehavior.this.f90830b;
        }

        /* renamed from: a */
        public final boolean mo1310a(View view, int i) {
            if (PageBottomSheetBehavior.this.f90834f == 1 || PageBottomSheetBehavior.this.f90840l) {
                return false;
            }
            if (PageBottomSheetBehavior.this.f90834f == 3 && PageBottomSheetBehavior.this.f90839k == i) {
                View view2 = (View) PageBottomSheetBehavior.this.f90838j.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (PageBottomSheetBehavior.this.f90837i == null || PageBottomSheetBehavior.this.f90837i.get() != view) {
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
            int i4 = PageBottomSheetBehavior.this.f90830b;
            if (PageBottomSheetBehavior.this.f90832d) {
                i3 = PageBottomSheetBehavior.this.f90836h;
            } else {
                i3 = PageBottomSheetBehavior.this.f90831c;
            }
            return C0703a.m2034a(i, i4, i3);
        }

        /* renamed from: a */
        public final void mo1308a(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = PageBottomSheetBehavior.this.f90830b;
            } else if (!PageBottomSheetBehavior.this.f90832d || !PageBottomSheetBehavior.this.mo73600a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - PageBottomSheetBehavior.this.f90830b) < Math.abs(top - PageBottomSheetBehavior.this.f90831c)) {
                        i = PageBottomSheetBehavior.this.f90830b;
                    } else {
                        i2 = PageBottomSheetBehavior.this.f90831c;
                    }
                } else {
                    i2 = PageBottomSheetBehavior.this.f90831c;
                }
                i = i2;
                i3 = 4;
            } else {
                if (PageBottomSheetBehavior.this.f90841m) {
                    i = PageBottomSheetBehavior.this.f90836h;
                } else {
                    i = view.getTop();
                }
                i3 = 5;
            }
            if (PageBottomSheetBehavior.this.f90835g.mo3573a(view.getLeft(), i)) {
                PageBottomSheetBehavior.this.mo73599a(2);
                C1056u.m3034a(view, (Runnable) new C35364a(view, i3));
                return;
            }
            PageBottomSheetBehavior.this.mo73599a(i3);
        }

        /* renamed from: a */
        public final void mo1309a(View view, int i, int i2, int i3, int i4) {
            PageBottomSheetBehavior.this.mo73601b(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.PageBottomSheetBehavior$SavedState */
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
        final int f90852a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f90852a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f90852a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f90852a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.PageBottomSheetBehavior$a */
    class C35364a implements Runnable {

        /* renamed from: b */
        private final View f90854b;

        /* renamed from: c */
        private final int f90855c;

        public final void run() {
            if (PageBottomSheetBehavior.this.f90835g == null || !PageBottomSheetBehavior.this.f90835g.mo3576a(true)) {
                PageBottomSheetBehavior.this.mo73599a(this.f90855c);
            } else {
                C1056u.m3034a(this.f90854b, (Runnable) this);
            }
        }

        C35364a(View view, int i) {
            this.f90854b = view;
            this.f90855c = i;
        }
    }

    /* renamed from: a */
    public final boolean mo935a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f90846r = 0;
        this.f90847s = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo73600a(View view, float f) {
        if (this.f90833e) {
            return true;
        }
        if (view.getTop() >= this.f90831c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f90831c)) / ((float) this.f90843o) > 0.25f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m79987a() {
        this.f90839k = -1;
        if (this.f90848t != null) {
            this.f90848t.recycle();
            this.f90848t = null;
        }
    }

    public PageBottomSheetBehavior() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo73601b(int i) {
        this.f90837i.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo73599a(int i) {
        if (this.f90834f != i) {
            this.f90834f = i;
            this.f90837i.get();
        }
    }

    /* renamed from: a */
    private View m79986a(View view) {
        if (C1056u.m3078x(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = m79986a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m79988c(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f90844p
            if (r4 != 0) goto L_0x0015
            r3.f90844p = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f90844p
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f90843o
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f90844p = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f90843o = r1
            int r1 = r3.f90836h
            int r1 = r1 - r4
            r3.f90831c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f90834f
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f90837i
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f90837i
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.widget.PageBottomSheetBehavior.m79988c(int):void");
    }

    /* renamed from: b */
    public final Parcelable mo1215b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1215b(coordinatorLayout, v), this.f90834f);
    }

    public PageBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.c7, R.attr.c8, R.attr.c_, R.attr.ca});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            m79988c(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            m79988c(peekValue.data);
        }
        this.f90832d = obtainStyledAttributes.getBoolean(1, false);
        this.f90833e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f90842n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    public final void mo1206a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1206a(coordinatorLayout, v, savedState.f3119e);
        if (savedState.f90852a == 1 || savedState.f90852a == 2) {
            this.f90834f = 4;
        } else {
            this.f90834f = savedState.f90852a;
        }
    }

    /* renamed from: b */
    public final boolean mo1255b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f90845q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m79987a();
        }
        if (this.f90848t == null) {
            this.f90848t = VelocityTracker.obtain();
        }
        this.f90848t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f90849u = (int) motionEvent.getY();
                    if (this.f90838j != null) {
                        view = (View) this.f90838j.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1329a(view, x, this.f90849u)) {
                        this.f90839k = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f90840l = true;
                    }
                    if (this.f90839k != -1 || coordinatorLayout.mo1329a((View) v, x, this.f90849u)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f90845q = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f90840l = false;
        this.f90839k = -1;
        if (this.f90845q) {
            this.f90845q = false;
            return false;
        }
        if (!this.f90845q && this.f90835g.mo3574a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f90838j.get();
        if (actionMasked != 2 || view2 == null || this.f90845q || this.f90834f == 1 || coordinatorLayout.mo1329a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f90849u) - motionEvent.getY()) <= ((float) this.f90835g.f3563b)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo1374c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f90830b) {
            mo73599a(3);
        } else if (this.f90838j != null && view == this.f90838j.get() && this.f90847s) {
            if (this.f90846r > 0) {
                i = this.f90830b;
            } else {
                if (this.f90832d) {
                    this.f90848t.computeCurrentVelocity(1000, this.f90842n);
                    if (mo73600a(v, this.f90848t.getYVelocity(this.f90839k))) {
                        i = this.f90836h;
                        i2 = 5;
                    }
                }
                if (this.f90846r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f90830b) < Math.abs(top - this.f90831c)) {
                        i = this.f90830b;
                    } else {
                        i = this.f90831c;
                    }
                } else {
                    i = this.f90831c;
                }
                i2 = 4;
            }
            if (this.f90835g.mo3575a((View) v, v.getLeft(), i)) {
                mo73599a(2);
                C1056u.m3034a((View) v, (Runnable) new C35364a(v, i2));
            } else {
                mo73599a(i2);
            }
            this.f90847s = false;
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
        this.f90836h = coordinatorLayout.getHeight();
        if (this.f90844p) {
            if (this.f90829a == 0) {
                this.f90829a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.fz);
            }
            i2 = Math.max(this.f90829a, this.f90836h);
        } else {
            i2 = this.f90843o;
        }
        this.f90830b = Math.max(0, this.f90836h - v.getHeight());
        this.f90831c = Math.max(this.f90836h - i2, this.f90830b);
        if (this.f90834f == 3) {
            C1056u.m3058g(v, this.f90830b);
        } else if (this.f90832d && this.f90834f == 5) {
            C1056u.m3058g(v, this.f90836h);
        } else if (this.f90834f == 4) {
            C1056u.m3058g(v, this.f90831c);
        } else if (this.f90834f == 1 || this.f90834f == 2) {
            C1056u.m3058g(v, top - v.getTop());
        }
        if (this.f90835g == null) {
            this.f90835g = C1119r.m3272a((ViewGroup) coordinatorLayout, this.f90850v);
        }
        this.f90837i = new WeakReference<>(v);
        this.f90838j = new WeakReference<>(m79986a((View) v));
        return true;
    }

    /* renamed from: a */
    public final boolean mo1171a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f90834f == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f90835g != null) {
            this.f90835g.mo3580b(motionEvent);
        }
        if (actionMasked == 0) {
            m79987a();
        }
        if (this.f90848t == null) {
            this.f90848t = VelocityTracker.obtain();
        }
        this.f90848t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f90845q && Math.abs(((float) this.f90849u) - motionEvent.getY()) > ((float) this.f90835g.f3563b)) {
            this.f90835g.mo3571a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f90845q) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1298a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view != this.f90838j.get() || (this.f90834f == 3 && !super.mo1298a(coordinatorLayout, v, view, f, f2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1372a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f90838j.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f90830b) {
                    iArr[1] = top - this.f90830b;
                    C1056u.m3058g(v, -iArr[1]);
                    mo73599a(3);
                } else {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo73599a(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i3 <= this.f90831c || this.f90832d) {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo73599a(1);
                } else {
                    iArr[1] = top - this.f90831c;
                    C1056u.m3058g(v, -iArr[1]);
                    mo73599a(4);
                }
            }
            mo73601b(v.getTop());
            this.f90846r = i2;
            this.f90847s = true;
        }
    }
}
