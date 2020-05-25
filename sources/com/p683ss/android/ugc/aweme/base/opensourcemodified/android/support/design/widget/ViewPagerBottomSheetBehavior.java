package com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

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
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior */
public class ViewPagerBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public int f62707a;

    /* renamed from: b */
    int f62708b;

    /* renamed from: c */
    int f62709c;

    /* renamed from: d */
    public boolean f62710d;

    /* renamed from: e */
    public boolean f62711e;

    /* renamed from: f */
    public int f62712f = 4;

    /* renamed from: g */
    C1119r f62713g;

    /* renamed from: h */
    int f62714h;

    /* renamed from: i */
    public WeakReference<V> f62715i;

    /* renamed from: j */
    WeakReference<View> f62716j;

    /* renamed from: k */
    public C23579a f62717k;

    /* renamed from: l */
    int f62718l;

    /* renamed from: m */
    boolean f62719m;

    /* renamed from: n */
    private float f62720n;

    /* renamed from: o */
    private int f62721o;

    /* renamed from: p */
    private boolean f62722p;

    /* renamed from: q */
    private boolean f62723q;

    /* renamed from: r */
    private int f62724r;

    /* renamed from: s */
    private boolean f62725s;

    /* renamed from: t */
    private VelocityTracker f62726t;

    /* renamed from: u */
    private int f62727u;

    /* renamed from: v */
    private boolean f62728v;

    /* renamed from: w */
    private final C1122a f62729w = new C1122a() {
        /* renamed from: a */
        public final void mo1307a(int i) {
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.mo48765b(1);
            }
        }

        /* renamed from: a */
        public final int mo1305a(View view) {
            if (ViewPagerBottomSheetBehavior.this.f62710d) {
                return ViewPagerBottomSheetBehavior.this.f62714h - ViewPagerBottomSheetBehavior.this.f62708b;
            }
            return ViewPagerBottomSheetBehavior.this.f62709c - ViewPagerBottomSheetBehavior.this.f62708b;
        }

        /* renamed from: a */
        public final boolean mo1310a(View view, int i) {
            if (ViewPagerBottomSheetBehavior.this.f62712f == 1 || ViewPagerBottomSheetBehavior.this.f62719m) {
                return false;
            }
            if (ViewPagerBottomSheetBehavior.this.f62712f == 3 && ViewPagerBottomSheetBehavior.this.f62718l == i) {
                View view2 = (View) ViewPagerBottomSheetBehavior.this.f62716j.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (ViewPagerBottomSheetBehavior.this.f62715i == null || ViewPagerBottomSheetBehavior.this.f62715i.get() != view) {
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
            int i4 = ViewPagerBottomSheetBehavior.this.f62708b;
            if (ViewPagerBottomSheetBehavior.this.f62710d) {
                i3 = ViewPagerBottomSheetBehavior.this.f62714h;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f62709c;
            }
            return C0703a.m2034a(i, i4, i3);
        }

        /* renamed from: a */
        public final void mo1308a(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = ViewPagerBottomSheetBehavior.this.f62708b;
            } else if (!ViewPagerBottomSheetBehavior.this.f62710d || !ViewPagerBottomSheetBehavior.this.mo48764a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f62708b) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f62709c)) {
                        i = ViewPagerBottomSheetBehavior.this.f62708b;
                    } else {
                        i2 = ViewPagerBottomSheetBehavior.this.f62709c;
                    }
                } else {
                    i2 = ViewPagerBottomSheetBehavior.this.f62709c;
                }
                i = i2;
                i3 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f62714h;
                i3 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f62713g.mo3573a(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.mo48765b(2);
                C1056u.m3034a(view, (Runnable) new C23582c(view, i3));
                return;
            }
            ViewPagerBottomSheetBehavior.this.mo48765b(i3);
        }

        /* renamed from: a */
        public final void mo1309a(View view, int i, int i2, int i3, int i4) {
            ViewPagerBottomSheetBehavior.this.mo48767c(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$SavedState */
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
        final int f62734a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f62734a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f62734a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f62734a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$a */
    public static abstract class C23579a {
        /* renamed from: a */
        public abstract void mo48772a(View view, float f);

        /* renamed from: a */
        public abstract void mo48773a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$b */
    static class C23580b extends C1000h {

        /* renamed from: a */
        public final ViewPagerBottomSheetBehavior f62735a;

        /* renamed from: b */
        private final ViewPager f62736b;

        public final void onPageSelected(int i) {
            this.f62736b.post(new Runnable() {
                public final void run() {
                    if (C23580b.this.f62735a.f62715i != null) {
                        C23580b.this.f62735a.mo48760a();
                    }
                }
            });
        }

        private C23580b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f62736b = viewPager;
            this.f62735a = viewPagerBottomSheetBehavior;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$c */
    class C23582c implements Runnable {

        /* renamed from: b */
        private final View f62739b;

        /* renamed from: c */
        private final int f62740c;

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f62713g == null || !ViewPagerBottomSheetBehavior.this.f62713g.mo3576a(true)) {
                ViewPagerBottomSheetBehavior.this.mo48765b(this.f62740c);
            } else {
                C1056u.m3034a(this.f62739b, (Runnable) this);
            }
        }

        C23582c(View view, int i) {
            this.f62739b = view;
            this.f62740c = i;
        }
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
            int r1 = r5.f62712f
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
            android.support.v4.widget.r r1 = r5.f62713g
            int r1 = r1.f3564c
            int r1 = r8.findPointerIndex(r1)
            android.support.v4.widget.r r4 = r5.f62713g
            if (r4 == 0) goto L_0x0038
            android.support.v4.widget.r r4 = r5.f62713g
            int r4 = r4.f3562a
            if (r4 != r2) goto L_0x0038
            if (r1 >= 0) goto L_0x0038
            r1 = 0
            goto L_0x0039
        L_0x0038:
            r1 = 1
        L_0x0039:
            android.support.v4.widget.r r4 = r5.f62713g
            if (r4 == 0) goto L_0x0044
            if (r1 == 0) goto L_0x0044
            android.support.v4.widget.r r1 = r5.f62713g
            r1.mo3580b(r8)
        L_0x0044:
            if (r6 != 0) goto L_0x0049
            r5.m57785b()
        L_0x0049:
            android.view.VelocityTracker r1 = r5.f62726t
            if (r1 != 0) goto L_0x0053
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r5.f62726t = r1
        L_0x0053:
            android.view.VelocityTracker r1 = r5.f62726t
            r1.addMovement(r8)
            if (r6 != r3) goto L_0x0080
            boolean r6 = r5.f62723q
            if (r6 != 0) goto L_0x0080
            int r6 = r5.f62727u
            float r6 = (float) r6
            float r1 = r8.getY()
            float r6 = r6 - r1
            float r6 = java.lang.Math.abs(r6)
            android.support.v4.widget.r r1 = r5.f62713g
            int r1 = r1.f3563b
            float r1 = (float) r1
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0080
            android.support.v4.widget.r r6 = r5.f62713g
            int r1 = r8.getActionIndex()
            int r8 = r8.getPointerId(r1)
            r6.mo3571a(r7, r8)
        L_0x0080:
            boolean r6 = r5.f62723q
            if (r6 != 0) goto L_0x0085
            return r2
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.mo1171a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final boolean mo935a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f62724r = 0;
        this.f62725s = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1298a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f62716j.get() && (this.f62712f != 3 || super.mo1298a(coordinatorLayout, v, view, f, f2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo48764a(View view, float f) {
        if (this.f62711e) {
            return true;
        }
        if (view.getTop() >= this.f62709c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f62709c)) / ((float) this.f62721o) > 0.5f) {
            return true;
        }
        return false;
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* renamed from: b */
    private void m57785b() {
        this.f62718l = -1;
        if (this.f62726t != null) {
            this.f62726t.recycle();
            this.f62726t = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo48760a() {
        this.f62716j = new WeakReference<>(m57786c((View) this.f62715i.get()));
    }

    /* renamed from: a */
    public final void mo48762a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new C23580b(viewPager, this));
    }

    /* renamed from: a */
    public static <V extends View> ViewPagerBottomSheetBehavior<V> m57784a(V v) {
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
    /* renamed from: b */
    public final void mo48765b(int i) {
        if (this.f62712f != i) {
            this.f62712f = i;
            View view = (View) this.f62715i.get();
            if (!(view == null || this.f62717k == null)) {
                this.f62717k.mo48773a(view, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo48767c(int i) {
        View view = (View) this.f62715i.get();
        if (!(view == null || this.f62717k == null)) {
            if (i > this.f62709c) {
                this.f62717k.mo48772a(view, ((float) (this.f62709c - i)) / ((float) (this.f62714h - this.f62709c)));
                return;
            }
            this.f62717k.mo48772a(view, ((float) (this.f62709c - i)) / ((float) (this.f62709c - this.f62708b)));
        }
    }

    /* renamed from: c */
    private View m57786c(View view) {
        if (view == null) {
            return null;
        }
        if (this.f62728v) {
            return (View) this.f62716j.get();
        }
        if (C1056u.m3078x(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View c = m57786c(C23583a.m57813a((ViewPager) view));
            if (c != null) {
                return c;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View c2 = m57786c(viewGroup.getChildAt(i));
                    if (c2 != null) {
                        return c2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48761a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f62722p
            if (r4 != 0) goto L_0x0015
            r3.f62722p = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f62722p
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f62721o
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f62722p = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f62721o = r1
            int r1 = r3.f62714h
            int r1 = r1 - r4
            r3.f62709c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f62712f
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f62715i
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f62715i
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.mo48761a(int):void");
    }

    /* renamed from: b */
    public final void mo48766b(View view) {
        View view2 = (View) this.f62715i.get();
        if (view2 != null) {
            if (view != null) {
                ViewParent parent = view.getParent();
                while (parent != null && parent != view2) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    view = m57786c(view);
                } else {
                    throw new IllegalArgumentException("child is not a child of current View.");
                }
            }
            if (view != null) {
                this.f62716j = new WeakReference<>(view);
                this.f62728v = true;
                return;
            }
            if (this.f62728v) {
                this.f62728v = false;
                mo48760a();
            }
        }
    }

    /* renamed from: b */
    public final Parcelable mo1215b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1215b(coordinatorLayout, v), this.f62712f);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.c7, R.attr.c8, R.attr.c_, R.attr.ca});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo48761a(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo48761a(peekValue.data);
        }
        this.f62710d = obtainStyledAttributes.getBoolean(1, false);
        this.f62711e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f62720n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    public final void mo48763a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f62709c;
        } else if (i == 3) {
            i2 = this.f62708b;
        } else if (!this.f62710d || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f62714h;
        }
        if (this.f62713g.mo3575a(view, view.getLeft(), i2)) {
            mo48765b(2);
            C1056u.m3034a(view, (Runnable) new C23582c(view, i));
            return;
        }
        mo48765b(i);
    }

    /* renamed from: a */
    public final void mo1206a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1206a(coordinatorLayout, v, savedState.f3119e);
        if (savedState.f62734a == 1 || savedState.f62734a == 2) {
            this.f62712f = 4;
        } else {
            this.f62712f = savedState.f62734a;
        }
    }

    /* renamed from: b */
    public final boolean mo1255b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        boolean z;
        if (!v.isShown()) {
            this.f62723q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m57785b();
        }
        if (this.f62726t == null) {
            this.f62726t = VelocityTracker.obtain();
        }
        this.f62726t.addMovement(motionEvent);
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    int x = (int) motionEvent.getX();
                    this.f62727u = (int) motionEvent.getY();
                    if (this.f62716j != null) {
                        view = (View) this.f62716j.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.mo1329a(view, x, this.f62727u)) {
                        this.f62718l = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f62719m = true;
                    }
                    if (this.f62718l != -1 || coordinatorLayout.mo1329a((View) v, x, this.f62727u)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f62723q = z;
                    break;
                case 1:
                    break;
            }
        }
        this.f62719m = false;
        this.f62718l = -1;
        if (this.f62723q) {
            this.f62723q = false;
            return false;
        }
        if (!this.f62723q && this.f62713g.mo3574a(motionEvent)) {
            return true;
        }
        View view2 = (View) this.f62716j.get();
        if (actionMasked != 2 || view2 == null || this.f62723q || this.f62712f == 1 || coordinatorLayout.mo1329a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f62727u) - motionEvent.getY()) <= ((float) this.f62713g.f3563b)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo1374c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f62708b) {
            mo48765b(3);
        } else if (this.f62716j != null && view == this.f62716j.get() && this.f62725s) {
            if (this.f62724r > 0) {
                i = this.f62708b;
            } else {
                if (this.f62710d) {
                    this.f62726t.computeCurrentVelocity(1000, this.f62720n);
                    if (mo48764a((View) v, this.f62726t.getYVelocity(this.f62718l))) {
                        i = this.f62714h;
                        i2 = 5;
                    }
                }
                if (this.f62724r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f62708b) < Math.abs(top - this.f62709c)) {
                        i = this.f62708b;
                    } else {
                        i = this.f62709c;
                    }
                } else {
                    i = this.f62709c;
                }
                i2 = 4;
            }
            if (this.f62713g.mo3575a((View) v, v.getLeft(), i)) {
                mo48765b(2);
                C1056u.m3034a((View) v, (Runnable) new C23582c(v, i2));
            } else {
                mo48765b(i2);
            }
            this.f62725s = false;
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
        this.f62714h = coordinatorLayout.getHeight();
        if (this.f62722p) {
            if (this.f62707a == 0) {
                this.f62707a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.fz);
            }
            i2 = Math.max(this.f62707a, this.f62714h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f62721o;
        }
        this.f62708b = Math.max(0, this.f62714h - v.getHeight());
        this.f62709c = Math.max(this.f62714h - i2, this.f62708b);
        if (this.f62712f == 3) {
            C1056u.m3058g(v, this.f62708b);
        } else if (this.f62710d && this.f62712f == 5) {
            C1056u.m3058g(v, this.f62714h);
        } else if (this.f62712f == 4) {
            C1056u.m3058g(v, this.f62709c);
        } else if (this.f62712f == 1 || this.f62712f == 2) {
            C1056u.m3058g(v, top - v.getTop());
        }
        if (this.f62713g == null) {
            this.f62713g = C1119r.m3272a((ViewGroup) coordinatorLayout, this.f62729w);
        }
        this.f62715i = new WeakReference<>(v);
        this.f62716j = new WeakReference<>(m57786c((View) v));
        return true;
    }

    /* renamed from: a */
    public void mo1372a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f62716j.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f62708b) {
                    iArr[1] = top - this.f62708b;
                    C1056u.m3058g(v, -iArr[1]);
                    mo48765b(3);
                } else {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo48765b(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i3 <= this.f62709c || this.f62710d) {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo48765b(1);
                } else {
                    iArr[1] = top - this.f62709c;
                    C1056u.m3058g(v, -iArr[1]);
                    mo48765b(4);
                }
            }
            mo48767c(v.getTop());
            this.f62724r = i2;
            this.f62725s = true;
        }
    }
}
