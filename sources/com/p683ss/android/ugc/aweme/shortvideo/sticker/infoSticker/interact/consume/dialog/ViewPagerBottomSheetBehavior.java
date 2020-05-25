package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior */
public class ViewPagerBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public int f112839a;

    /* renamed from: b */
    int f112840b;

    /* renamed from: c */
    int f112841c;

    /* renamed from: d */
    public boolean f112842d;

    /* renamed from: e */
    public boolean f112843e;

    /* renamed from: f */
    public int f112844f = 4;

    /* renamed from: g */
    C1119r f112845g;

    /* renamed from: h */
    int f112846h;

    /* renamed from: i */
    WeakReference<V> f112847i;

    /* renamed from: j */
    WeakReference<View> f112848j;

    /* renamed from: k */
    public C44608a f112849k;

    /* renamed from: l */
    int f112850l;

    /* renamed from: m */
    boolean f112851m;

    /* renamed from: n */
    private float f112852n;

    /* renamed from: o */
    private int f112853o;

    /* renamed from: p */
    private boolean f112854p;

    /* renamed from: q */
    private boolean f112855q;

    /* renamed from: r */
    private int f112856r;

    /* renamed from: s */
    private boolean f112857s;

    /* renamed from: t */
    private VelocityTracker f112858t;

    /* renamed from: u */
    private int f112859u;

    /* renamed from: v */
    private final C1122a f112860v = new C1122a() {
        /* renamed from: a */
        public final void mo1307a(int i) {
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.mo90553a(1);
            }
        }

        /* renamed from: a */
        public final int mo1305a(View view) {
            if (ViewPagerBottomSheetBehavior.this.f112842d) {
                return ViewPagerBottomSheetBehavior.this.f112846h - ViewPagerBottomSheetBehavior.this.f112840b;
            }
            return ViewPagerBottomSheetBehavior.this.f112841c - ViewPagerBottomSheetBehavior.this.f112840b;
        }

        /* renamed from: a */
        public final boolean mo1310a(View view, int i) {
            if (ViewPagerBottomSheetBehavior.this.f112844f == 1 || ViewPagerBottomSheetBehavior.this.f112851m) {
                return false;
            }
            if (ViewPagerBottomSheetBehavior.this.f112844f == 3 && ViewPagerBottomSheetBehavior.this.f112850l == i) {
                View view2 = (View) ViewPagerBottomSheetBehavior.this.f112848j.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (ViewPagerBottomSheetBehavior.this.f112847i == null || ViewPagerBottomSheetBehavior.this.f112847i.get() != view) {
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
            int i4 = ViewPagerBottomSheetBehavior.this.f112840b;
            if (ViewPagerBottomSheetBehavior.this.f112842d) {
                i3 = ViewPagerBottomSheetBehavior.this.f112846h;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f112841c;
            }
            return C0703a.m2034a(i, i4, i3);
        }

        /* renamed from: a */
        public final void mo1308a(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = ViewPagerBottomSheetBehavior.this.f112840b;
            } else if (!ViewPagerBottomSheetBehavior.this.f112842d || !ViewPagerBottomSheetBehavior.this.mo90555a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f112840b) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f112841c)) {
                        i = ViewPagerBottomSheetBehavior.this.f112840b;
                    } else {
                        i2 = ViewPagerBottomSheetBehavior.this.f112841c;
                    }
                } else {
                    i2 = ViewPagerBottomSheetBehavior.this.f112841c;
                }
                i = i2;
                i3 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f112846h;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f112845g.mo3573a(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.mo90553a(2);
                C1056u.m3034a(view, (Runnable) new C44609b(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.mo90553a(i3);
        }

        /* renamed from: a */
        public final void mo1309a(View view, int i, int i2, int i3, int i4) {
            ViewPagerBottomSheetBehavior.this.mo90556b(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$SavedState */
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
        final int f112865a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f112865a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f112865a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f112865a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$a */
    public static abstract class C44608a {
        /* renamed from: a */
        public abstract void mo90561a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$b */
    class C44609b implements Runnable {

        /* renamed from: b */
        private final View f112867b;

        /* renamed from: c */
        private final int f112868c;

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f112845g == null || !ViewPagerBottomSheetBehavior.this.f112845g.mo3576a(true)) {
                ViewPagerBottomSheetBehavior.this.mo90553a(this.f112868c);
            } else {
                C1056u.m3034a(this.f112867b, (Runnable) this);
            }
        }

        C44609b(View view, int i) {
            this.f112867b = view;
            this.f112868c = i;
        }
    }

    /* renamed from: a */
    public final boolean mo935a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f112856r = 0;
        this.f112857s = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo90555a(View view, float f) {
        if (this.f112843e) {
            return true;
        }
        if (view.getTop() >= this.f112841c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f112841c)) / ((float) this.f112853o) > 0.5f) {
            return true;
        }
        return false;
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* renamed from: a */
    private void m97562a() {
        this.f112850l = -1;
        if (this.f112858t != null) {
            this.f112858t.recycle();
            this.f112858t = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo90556b(int i) {
        this.f112847i.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo90553a(int i) {
        if (this.f112844f != i) {
            this.f112844f = i;
            View view = (View) this.f112847i.get();
            if (!(view == null || this.f112849k == null)) {
                this.f112849k.mo90561a(view, i);
            }
        }
    }

    /* renamed from: b */
    public static <V extends View> ViewPagerBottomSheetBehavior<V> m97563b(V v) {
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m97564c(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f112854p
            if (r4 != 0) goto L_0x0015
            r3.f112854p = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f112854p
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f112853o
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f112854p = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f112853o = r1
            int r1 = r3.f112846h
            int r1 = r1 - r4
            r3.f112841c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f112844f
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f112847i
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f112847i
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.m97564c(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo90552a(View view) {
        if (C1056u.m3078x(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View focusedChild = ((ViewPager) view).getFocusedChild();
            if (focusedChild == null) {
                return null;
            }
            View a = mo90552a(focusedChild);
            if (a != null) {
                return a;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a2 = mo90552a(viewGroup.getChildAt(i));
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final Parcelable mo1215b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1215b(coordinatorLayout, v), this.f112844f);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.c7, R.attr.c8, R.attr.c_, R.attr.ca});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            m97564c(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            m97564c(peekValue.data);
        }
        this.f112842d = obtainStyledAttributes.getBoolean(1, false);
        this.f112843e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f112852n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo90554a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f112841c;
        } else if (i == 3) {
            i2 = this.f112840b;
        } else if (!this.f112842d || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f112846h;
        }
        if (this.f112845g.mo3575a(view, view.getLeft(), i2)) {
            mo90553a(2);
            C1056u.m3034a(view, (Runnable) new C44609b(view, i));
            return;
        }
        mo90553a(i);
    }

    /* renamed from: a */
    public final void mo1206a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1206a(coordinatorLayout, v, savedState.f3119e);
        if (savedState.f112865a == 1 || savedState.f112865a == 2) {
            this.f112844f = 4;
        } else {
            this.f112844f = savedState.f112865a;
        }
    }

    /* renamed from: b */
    public final boolean mo1255b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f112855q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m97562a();
        }
        if (this.f112858t == null) {
            this.f112858t = VelocityTracker.obtain();
        }
        this.f112858t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f112859u = (int) motionEvent.getY();
                    if (this.f112848j != null) {
                        view = (View) this.f112848j.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1329a(view, x, this.f112859u)) {
                        this.f112850l = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f112851m = true;
                    }
                    if (this.f112850l != -1 || coordinatorLayout.mo1329a((View) v, x, this.f112859u)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f112855q = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f112851m = false;
        this.f112850l = -1;
        if (this.f112855q) {
            this.f112855q = false;
            return false;
        }
        if (!this.f112855q && this.f112845g.mo3574a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f112848j.get();
        if (actionMasked != 2 || view2 == null || this.f112855q || this.f112844f == 1 || coordinatorLayout.mo1329a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f112859u) - motionEvent.getY()) <= ((float) this.f112845g.f3563b)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo1374c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f112840b) {
            mo90553a(3);
        } else if (this.f112848j != null && view == this.f112848j.get() && this.f112857s) {
            if (this.f112856r > 0) {
                i = this.f112840b;
            } else {
                if (this.f112842d) {
                    this.f112858t.computeCurrentVelocity(1000, this.f112852n);
                    if (mo90555a((View) v, this.f112858t.getYVelocity(this.f112850l))) {
                        i = this.f112846h;
                        i2 = 5;
                    }
                }
                if (this.f112856r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f112840b) < Math.abs(top - this.f112841c)) {
                        i = this.f112840b;
                    } else {
                        i = this.f112841c;
                    }
                } else {
                    i = this.f112841c;
                }
                i2 = 4;
            }
            if (this.f112845g.mo3575a((View) v, v.getLeft(), i)) {
                mo90553a(2);
                C1056u.m3034a((View) v, (Runnable) new C44609b(v, i2));
            } else {
                mo90553a(i2);
            }
            this.f112857s = false;
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
        this.f112846h = coordinatorLayout.getHeight();
        if (this.f112854p) {
            if (this.f112839a == 0) {
                this.f112839a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.fz);
            }
            i2 = Math.max(this.f112839a, this.f112846h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f112853o;
        }
        this.f112840b = Math.max(0, this.f112846h - v.getHeight());
        this.f112841c = Math.max(this.f112846h - i2, this.f112840b);
        if (this.f112844f == 3) {
            C1056u.m3058g(v, this.f112840b);
        } else if (this.f112842d && this.f112844f == 5) {
            C1056u.m3058g(v, this.f112846h);
        } else if (this.f112844f == 4) {
            C1056u.m3058g(v, this.f112841c);
        } else if (this.f112844f == 1 || this.f112844f == 2) {
            C1056u.m3058g(v, top - v.getTop());
        }
        if (this.f112845g == null) {
            this.f112845g = C1119r.m3272a((ViewGroup) coordinatorLayout, this.f112860v);
        }
        this.f112847i = new WeakReference<>(v);
        this.f112848j = new WeakReference<>(mo90552a((View) v));
        return true;
    }

    /* renamed from: a */
    public final boolean mo1171a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f112844f == 1 && actionMasked == 0) {
            return true;
        }
        if (this.f112845g != null) {
            this.f112845g.mo3580b(motionEvent);
        }
        if (actionMasked == 0) {
            m97562a();
        }
        if (this.f112858t == null) {
            this.f112858t = VelocityTracker.obtain();
        }
        this.f112858t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f112855q && Math.abs(((float) this.f112859u) - motionEvent.getY()) > ((float) this.f112845g.f3563b)) {
            this.f112845g.mo3571a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f112855q) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1298a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view != this.f112848j.get() || (this.f112844f == 3 && !super.mo1298a(coordinatorLayout, v, view, f, f2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1372a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f112848j.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f112840b) {
                    iArr[1] = top - this.f112840b;
                    C1056u.m3058g(v, -iArr[1]);
                    mo90553a(3);
                } else {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo90553a(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i3 <= this.f112841c || this.f112842d) {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo90553a(1);
                } else {
                    iArr[1] = top - this.f112841c;
                    C1056u.m3058g(v, -iArr[1]);
                    mo90553a(4);
                }
            }
            mo90556b(v.getTop());
            this.f112856r = i2;
            this.f112857s = true;
        }
    }
}
