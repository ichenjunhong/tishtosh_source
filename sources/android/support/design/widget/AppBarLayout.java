package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.internal.C0456f;
import android.support.design.p022a.C0389a;
import android.support.design.widget.CoordinatorLayout.C0503b;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.p030v4.p033b.C0703a;
import android.support.p030v4.p038f.C0793j;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1045j;
import android.support.p030v4.view.C1051p;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;

@C0503b(mo1378a = Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f1559a;

    /* renamed from: b */
    int f1560b;

    /* renamed from: c */
    C1018ac f1561c;

    /* renamed from: d */
    public boolean f1562d;

    /* renamed from: e */
    private int f1563e;

    /* renamed from: f */
    private int f1564f;

    /* renamed from: g */
    private int f1565g;

    /* renamed from: h */
    private List<Object> f1566h;

    /* renamed from: i */
    private boolean f1567i;

    /* renamed from: j */
    private boolean f1568j;

    /* renamed from: k */
    private boolean f1569k;

    /* renamed from: l */
    private int[] f1570l;

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: a */
        public int f1572a;

        /* renamed from: c */
        private int f1573c;

        /* renamed from: d */
        private ValueAnimator f1574d;

        /* renamed from: e */
        private int f1575e = -1;

        /* renamed from: f */
        private boolean f1576f;

        /* renamed from: g */
        private float f1577g;

        /* renamed from: h */
        private WeakReference<View> f1578h;

        /* renamed from: i */
        private C0472a f1579i;

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
            int f1583a;

            /* renamed from: b */
            float f1584b;

            /* renamed from: c */
            boolean f1585c;

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                boolean z;
                super(parcel, classLoader);
                this.f1583a = parcel.readInt();
                this.f1584b = parcel.readFloat();
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f1585c = z;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f1583a);
                parcel.writeFloat(this.f1584b);
                parcel.writeByte(this.f1585c ? (byte) 1 : 0);
            }
        }

        /* renamed from: android.support.design.widget.AppBarLayout$BaseBehavior$a */
        public static abstract class C0472a<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo1221a(T t);
        }

        /* renamed from: a */
        private static boolean m1153a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo967a(android.support.design.widget.CoordinatorLayout r2, T r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002a
                boolean r5 = r3.f1562d
                if (r5 != 0) goto L_0x002b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0012
                r5 = 1
                goto L_0x0013
            L_0x0012:
                r5 = 0
            L_0x0013:
                if (r5 == 0) goto L_0x0026
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r6 = 0
            L_0x002b:
                if (r6 == 0) goto L_0x0036
                android.animation.ValueAnimator r2 = r1.f1574d
                if (r2 == 0) goto L_0x0036
                android.animation.ValueAnimator r2 = r1.f1574d
                r2.cancel()
            L_0x0036:
                r2 = 0
                r1.f1578h = r2
                r1.f1573c = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.BaseBehavior.mo967a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }

        /* renamed from: a */
        public void mo1209a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo1454b(coordinatorLayout, t, i2, i5, i4);
                    m1150a(i2, t, view, i3);
                }
            }
        }

        /* renamed from: a */
        public void mo1208a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                mo1454b(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
                m1150a(i4, t, view, i5);
            }
            if (t.f1562d) {
                t.mo1177a(view.getScrollY() > 0);
            }
        }

        /* renamed from: a */
        public void mo1207a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f1573c == 0 || i == 1) {
                mo1205a(coordinatorLayout, t);
            }
            this.f1578h = new WeakReference<>(view);
        }

        /* renamed from: a */
        public boolean mo1213a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((C0505d) t.getLayoutParams()).height != -2) {
                return super.mo1213a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo1326a((View) t, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo934a(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean a = super.mo934a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            if (this.f1575e >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(this.f1575e);
                int i3 = -childAt.getBottom();
                if (this.f1576f) {
                    i2 = i3 + C1056u.m3066l(childAt) + t.getTopInset();
                } else {
                    i2 = i3 + Math.round(((float) childAt.getHeight()) * this.f1577g);
                }
                mo1453a_(coordinatorLayout, t, i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m1151a(coordinatorLayout, t, i4, 0.0f);
                    } else {
                        mo1453a_(coordinatorLayout, t, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m1151a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo1453a_(coordinatorLayout, t, 0);
                    }
                }
            }
            t.f1560b = 0;
            this.f1575e = -1;
            mo1222a(C0703a.m2034a(mo1223b(), -t.getTotalScrollRange(), 0));
            m1152a(coordinatorLayout, t, mo1223b(), 0, true);
            t.mo1175a(mo1223b());
            return a;
        }

        /* renamed from: a */
        public Parcelable mo1215b(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable b = super.mo1215b(coordinatorLayout, t);
            int b2 = mo1223b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(b);
                    savedState.f1583a = i;
                    if (bottom == C1056u.m3066l(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f1585c = z;
                    savedState.f1584b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return b;
        }

        /* renamed from: a */
        public void mo1206a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo1206a(coordinatorLayout, t, savedState.f3119e);
                this.f1575e = savedState.f1583a;
                this.f1577g = savedState.f1584b;
                this.f1576f = savedState.f1585c;
                return;
            }
            super.mo1206a(coordinatorLayout, t, parcelable);
            this.f1575e = -1;
        }

        public BaseBehavior() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo1197a() {
            return mo1223b() + this.f1572a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ int mo1214b(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        /* renamed from: a */
        private static View m1149a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof C1045j) {
                    return childAt;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final /* synthetic */ boolean mo1216c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f1579i != null) {
                return this.f1579i.mo1221a(appBarLayout);
            }
            if (this.f1578h != null) {
                View view2 = (View) this.f1578h.get();
                if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ int mo1199a(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private static int m1148a(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m1153a(layoutParams.f1586a, 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: b */
        private static View m1154b(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: c */
        private static boolean m1156c(CoordinatorLayout coordinatorLayout, T t) {
            List c = coordinatorLayout.mo1334c((View) t);
            int size = c.size();
            int i = 0;
            while (i < size) {
                android.support.design.widget.CoordinatorLayout.Behavior behavior = ((C0505d) ((View) c.get(i)).getLayoutParams()).f1693a;
                if (!(behavior instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) behavior).f1746d != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void mo1205a(CoordinatorLayout coordinatorLayout, T t) {
            int a = mo1197a();
            int a2 = m1148a(t, a);
            if (a2 >= 0) {
                View childAt = t.getChildAt(a2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i = layoutParams.f1586a;
                if ((i & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (a2 == t.getChildCount() - 1) {
                        i3 += t.getTopInset();
                    }
                    if (m1153a(i, 2)) {
                        i3 += C1056u.m3066l(childAt);
                    } else if (m1153a(i, 5)) {
                        int l = C1056u.m3066l(childAt) + i3;
                        if (a < l) {
                            i2 = l;
                        } else {
                            i3 = l;
                        }
                    }
                    if (m1153a(i, 32)) {
                        i2 += layoutParams.topMargin;
                        i3 -= layoutParams.bottomMargin;
                    }
                    if (a < (i3 + i2) / 2) {
                        i2 = i3;
                    }
                    m1151a(coordinatorLayout, t, C0703a.m2034a(i2, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: a */
        private void m1150a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int a = mo1197a();
                if ((i < 0 && a == 0) || (i > 0 && a == (-t.getDownNestedScrollRange()))) {
                    C1056u.m3056f(view, 1);
                }
            }
        }

        /* renamed from: a */
        private void m1151a(final CoordinatorLayout coordinatorLayout, final T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo1197a() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            int a = mo1197a();
            if (a == i) {
                if (this.f1574d != null && this.f1574d.isRunning()) {
                    this.f1574d.cancel();
                }
                return;
            }
            if (this.f1574d == null) {
                this.f1574d = new ValueAnimator();
                this.f1574d.setInterpolator(C0389a.f1271e);
                this.f1574d.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.mo1453a_(coordinatorLayout, t, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                this.f1574d.cancel();
            }
            this.f1574d.setDuration((long) Math.min(i2, 600));
            this.f1574d.setIntValues(new int[]{a, i});
            this.f1574d.start();
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m1152a(android.support.design.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = m1154b(r7, r8)
                if (r0 == 0) goto L_0x006a
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                android.support.design.widget.AppBarLayout$LayoutParams r1 = (android.support.design.widget.AppBarLayout.LayoutParams) r1
                int r1 = r1.f1586a
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003f
                int r2 = android.support.p030v4.view.C1056u.m3066l(r0)
                if (r9 <= 0) goto L_0x002d
                r9 = r1 & 12
                if (r9 == 0) goto L_0x002d
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x003f
            L_0x002b:
                r8 = 1
                goto L_0x0040
            L_0x002d:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x003f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x003f
                goto L_0x002b
            L_0x003f:
                r8 = 0
            L_0x0040:
                boolean r9 = r7.f1562d
                if (r9 == 0) goto L_0x0053
                android.view.View r9 = m1149a(r6)
                if (r9 == 0) goto L_0x0053
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x0052
                r8 = 1
                goto L_0x0053
            L_0x0052:
                r8 = 0
            L_0x0053:
                boolean r8 = r7.mo1177a(r8)
                int r9 = android.os.Build.VERSION.SDK_INT
                r0 = 11
                if (r9 < r0) goto L_0x006a
                if (r10 != 0) goto L_0x0067
                if (r8 == 0) goto L_0x006a
                boolean r6 = m1156c(r6, r7)
                if (r6 == 0) goto L_0x006a
            L_0x0067:
                r7.jumpDrawablesToCurrentState()
            L_0x006a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.BaseBehavior.m1152a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int, int, boolean):void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ int mo1198a(android.support.design.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                r2 = r9
                android.support.design.widget.AppBarLayout r2 = (android.support.design.widget.AppBarLayout) r2
                int r9 = r7.mo1197a()
                r0 = 0
                if (r11 == 0) goto L_0x00ae
                if (r9 < r11) goto L_0x00ae
                if (r9 > r12) goto L_0x00ae
                int r3 = android.support.p030v4.p033b.C0703a.m2034a(r10, r11, r12)
                if (r9 == r3) goto L_0x00b0
                boolean r10 = r2.f1559a
                if (r10 == 0) goto L_0x0085
                int r10 = java.lang.Math.abs(r3)
                int r11 = r2.getChildCount()
                r12 = 0
            L_0x0021:
                if (r12 >= r11) goto L_0x0085
                android.view.View r1 = r2.getChildAt(r12)
                android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
                android.support.design.widget.AppBarLayout$LayoutParams r4 = (android.support.design.widget.AppBarLayout.LayoutParams) r4
                android.view.animation.Interpolator r5 = r4.f1587b
                int r6 = r1.getTop()
                if (r10 < r6) goto L_0x0082
                int r6 = r1.getBottom()
                if (r10 > r6) goto L_0x0082
                if (r5 == 0) goto L_0x0085
                int r11 = r4.f1586a
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0057
                int r12 = r1.getHeight()
                int r6 = r4.topMargin
                int r12 = r12 + r6
                int r4 = r4.bottomMargin
                int r12 = r12 + r4
                int r0 = r0 + r12
                r11 = r11 & 2
                if (r11 == 0) goto L_0x0057
                int r11 = android.support.p030v4.view.C1056u.m3066l(r1)
                int r0 = r0 - r11
            L_0x0057:
                boolean r11 = android.support.p030v4.view.C1056u.m3073s(r1)
                if (r11 == 0) goto L_0x0062
                int r11 = r2.getTopInset()
                int r0 = r0 - r11
            L_0x0062:
                if (r0 <= 0) goto L_0x0085
                int r11 = r1.getTop()
                int r10 = r10 - r11
                float r11 = (float) r0
                float r10 = (float) r10
                float r10 = r10 / r11
                float r10 = r5.getInterpolation(r10)
                float r11 = r11 * r10
                int r10 = java.lang.Math.round(r11)
                int r11 = java.lang.Integer.signum(r3)
                int r12 = r1.getTop()
                int r12 = r12 + r10
                int r10 = r11 * r12
                goto L_0x0086
            L_0x0082:
                int r12 = r12 + 1
                goto L_0x0021
            L_0x0085:
                r10 = r3
            L_0x0086:
                boolean r11 = r7.mo1222a(r10)
                int r12 = r9 - r3
                int r10 = r3 - r10
                r7.f1572a = r10
                if (r11 != 0) goto L_0x0099
                boolean r10 = r2.f1559a
                if (r10 == 0) goto L_0x0099
                r8.mo1324a(r2)
            L_0x0099:
                int r10 = r7.mo1223b()
                r2.mo1175a(r10)
                if (r3 >= r9) goto L_0x00a5
                r9 = -1
                r4 = -1
                goto L_0x00a7
            L_0x00a5:
                r9 = 1
                r4 = 1
            L_0x00a7:
                r5 = 0
                r0 = r7
                r1 = r8
                r0.m1152a(r1, (T) r2, r3, r4, r5)
                goto L_0x00b1
            L_0x00ae:
                r7.f1572a = r0
            L_0x00b0:
                r12 = 0
            L_0x00b1:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.BaseBehavior.mo1198a(android.support.design.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ int mo1223b() {
            return super.mo1223b();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1222a(int i) {
            return super.mo1222a(i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Parcelable mo1200a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo1215b(coordinatorLayout, appBarLayout);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1201a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo1206a(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1210a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo934a(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1202a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo1207a(coordinatorLayout, appBarLayout, view, i);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1211a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo1213a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1212a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo967a(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1204a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo1209a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo1203a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            super.mo1208a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f1586a = 1;

        /* renamed from: b */
        public Interpolator f1587b;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(-1, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.s2, R.attr.s3});
            this.f1586a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f1587b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ int mo1223b() {
            return super.mo1223b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ View mo1225a(List list) {
            return m1190b(list);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1222a(int i) {
            return super.mo1222a(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo1227b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo1227b(view);
        }

        /* renamed from: b */
        private static AppBarLayout m1190b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final float mo1224a(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                android.support.design.widget.CoordinatorLayout.Behavior behavior = ((C0505d) appBarLayout.getLayoutParams()).f1693a;
                if (behavior instanceof BaseBehavior) {
                    i = ((BaseBehavior) behavior).mo1197a();
                } else {
                    i = 0;
                }
                if (downNestedPreScrollRange != 0 && totalScrollRange + i <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i2 = totalScrollRange - downNestedPreScrollRange;
                if (i2 != 0) {
                    return (((float) i) / ((float) i2)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.c9});
            this.f1746d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final boolean mo1157a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo934a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo934a(coordinatorLayout, view, i);
        }

        /* renamed from: b */
        public final boolean mo1159b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z;
            android.support.design.widget.CoordinatorLayout.Behavior behavior = ((C0505d) view2.getLayoutParams()).f1693a;
            if (behavior instanceof BaseBehavior) {
                C1056u.m3058g(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f1572a) + this.f1745c) - mo1457c(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f1562d) {
                    if (view.getScrollY() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    appBarLayout.mo1177a(z);
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo1226a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = m1190b(coordinatorLayout.mo1331b(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f1743a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.mo1176a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo1213a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo1213a(coordinatorLayout, view, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f1560b;
    }

    public float getTargetElevation() {
        return 0.0f;
    }

    /* renamed from: b */
    private static LayoutParams m1142b() {
        return new LayoutParams(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1174a() {
        this.f1563e = -1;
        this.f1564f = -1;
        this.f1565g = -1;
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: 0000 */
    public final int getTopInset() {
        if (this.f1561c != null) {
            return this.f1561c.mo3186b();
        }
        return 0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int i;
        int topInset = getTopInset();
        int l = C1056u.m3066l(this);
        if (l != 0) {
            return (l * 2) + topInset;
        }
        int childCount = getChildCount();
        if (childCount > 0) {
            i = C1056u.m3066l(getChildAt(childCount - 1));
        } else {
            i = 0;
        }
        if (i != 0) {
            return (i * 2) + topInset;
        }
        return getHeight() / 3;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedPreScrollRange() {
        if (this.f1564f != -1) {
            return this.f1564f;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = layoutParams.f1586a;
            if ((i2 & 5) != 5) {
                if (i > 0) {
                    break;
                }
            } else {
                int i3 = i + layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i2 & 8) != 0) {
                    i = i3 + C1056u.m3066l(childAt);
                } else if ((i2 & 2) != 0) {
                    i = i3 + (measuredHeight - C1056u.m3066l(childAt));
                } else {
                    i = i3 + (measuredHeight - getTopInset());
                }
            }
        }
        int max = Math.max(0, i);
        this.f1564f = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        if (this.f1565g != -1) {
            return this.f1565g;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i3 = layoutParams.f1586a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i3 & 2) != 0) {
                i2 -= C1056u.m3066l(childAt) + getTopInset();
                break;
            }
            i++;
        }
        int max = Math.max(0, i2);
        this.f1565g = max;
        return max;
    }

    public final int getTotalScrollRange() {
        if (this.f1563e != -1) {
            return this.f1563e;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.f1586a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((i3 & 2) != 0) {
                i2 -= C1056u.m3066l(childAt);
                break;
            }
            i++;
        }
        int max = Math.max(0, i2 - getTopInset());
        this.f1563e = max;
        return max;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setLiftOnScroll(boolean z) {
        this.f1562d = z;
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public void setExpanded(boolean z) {
        mo1176a(z, C1056u.m3079y(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C0572s.m1570a(this, f);
        }
    }

    /* renamed from: a */
    private static LayoutParams m1140a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1175a(int i) {
        if (this.f1566h != null) {
            int size = this.f1566h.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1566h.get(i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f1570l == null) {
            this.f1570l = new int[4];
        }
        int[] iArr = this.f1570l;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        if (this.f1568j) {
            i2 = R.attr.a3f;
        } else {
            i2 = -2131362947;
        }
        iArr[0] = i2;
        if (!this.f1568j || !this.f1569k) {
            i3 = -2131362948;
        } else {
            i3 = R.attr.a3g;
        }
        iArr[1] = i3;
        if (this.f1568j) {
            i4 = R.attr.a3e;
        } else {
            i4 = -2131362946;
        }
        iArr[2] = i4;
        if (!this.f1568j || !this.f1569k) {
            i5 = -2131362945;
        } else {
            i5 = R.attr.a3d;
        }
        iArr[3] = i5;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1177a(boolean z) {
        if (this.f1569k == z) {
            return false;
        }
        this.f1569k = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo1174a();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1563e = -1;
        this.f1564f = -1;
        this.f1565g = -1;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            C0573t.m1572a(this, attributeSet, 0, R.style.qw);
        }
        TypedArray a = C0456f.m1107a(context, attributeSet, new int[]{16842964, 16843919, 16844096, R.attr.k_, R.attr.l5, R.attr.se}, 0, R.style.qw, new int[0]);
        C1056u.m3030a((View) this, a.getDrawable(0));
        if (a.hasValue(4)) {
            m1141a(a.getBoolean(4, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && a.hasValue(3)) {
            C0572s.m1570a(this, (float) a.getDimensionPixelSize(3, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (a.hasValue(2)) {
                setKeyboardNavigationCluster(a.getBoolean(2, false));
            }
            if (a.hasValue(1)) {
                setTouchscreenBlocksFocus(a.getBoolean(1, false));
            }
        }
        this.f1562d = a.getBoolean(5, false);
        a.recycle();
        C1056u.m3032a((View) this, (C1051p) new C1051p() {
            /* renamed from: a */
            public final C1018ac mo1130a(View view, C1018ac acVar) {
                C1018ac acVar2;
                AppBarLayout appBarLayout = AppBarLayout.this;
                if (C1056u.m3073s(appBarLayout)) {
                    acVar2 = acVar;
                } else {
                    acVar2 = null;
                }
                if (!C0793j.m2264a(appBarLayout.f1561c, acVar2)) {
                    appBarLayout.f1561c = acVar2;
                    appBarLayout.mo1174a();
                }
                return acVar;
            }
        });
    }

    /* renamed from: a */
    public final void mo1176a(boolean z, boolean z2) {
        m1141a(z, z2, true);
    }

    /* renamed from: a */
    private void m1141a(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f1560b = i4 | i3;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r3 != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r1.mo1174a()
            r2 = 0
            r1.f1559a = r2
            int r3 = r1.getChildCount()
            r4 = 0
        L_0x000e:
            r5 = 1
            if (r4 >= r3) goto L_0x0025
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.design.widget.AppBarLayout$LayoutParams r6 = (android.support.design.widget.AppBarLayout.LayoutParams) r6
            android.view.animation.Interpolator r6 = r6.f1587b
            if (r6 == 0) goto L_0x0022
            r1.f1559a = r5
            goto L_0x0025
        L_0x0022:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0025:
            boolean r3 = r1.f1567i
            if (r3 != 0) goto L_0x0060
            boolean r3 = r1.f1562d
            if (r3 != 0) goto L_0x0056
            int r3 = r1.getChildCount()
            r4 = 0
        L_0x0032:
            if (r4 >= r3) goto L_0x0053
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.design.widget.AppBarLayout$LayoutParams r6 = (android.support.design.widget.AppBarLayout.LayoutParams) r6
            int r0 = r6.f1586a
            r0 = r0 & r5
            if (r0 != r5) goto L_0x004b
            int r6 = r6.f1586a
            r6 = r6 & 10
            if (r6 == 0) goto L_0x004b
            r6 = 1
            goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            if (r6 == 0) goto L_0x0050
            r3 = 1
            goto L_0x0054
        L_0x0050:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x0053:
            r3 = 0
        L_0x0054:
            if (r3 == 0) goto L_0x0057
        L_0x0056:
            r2 = 1
        L_0x0057:
            boolean r3 = r1.f1568j
            if (r3 == r2) goto L_0x0060
            r1.f1568j = r2
            r1.refreshDrawableState()
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }
}
