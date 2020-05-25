package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
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
import android.support.p030v4.p033b.C0703a;
import android.support.p030v4.p038f.C0793j;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1051p;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39365b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

@C39365b(mo80315a = Behavior.class)
/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout */
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f100599a;

    /* renamed from: b */
    int f100600b;

    /* renamed from: c */
    C1018ac f100601c;

    /* renamed from: d */
    public List<C39361a> f100602d;

    /* renamed from: e */
    public int f100603e;

    /* renamed from: f */
    public int f100604f;

    /* renamed from: g */
    public boolean f100605g;

    /* renamed from: h */
    private int f100606h;

    /* renamed from: i */
    private int f100607i;

    /* renamed from: j */
    private int f100608j;

    /* renamed from: k */
    private boolean f100609k;

    /* renamed from: l */
    private boolean f100610l;

    /* renamed from: m */
    private int[] f100611m;

    /* renamed from: n */
    private int f100612n;

    /* renamed from: o */
    private int f100613o;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$Behavior */
    public static class Behavior extends C39372c<AppBarLayout> {

        /* renamed from: a */
        public int f100615a;

        /* renamed from: b */
        public C39360a f100616b;

        /* renamed from: e */
        private ValueAnimator f100617e;

        /* renamed from: f */
        private int f100618f = -1;

        /* renamed from: g */
        private boolean f100619g;

        /* renamed from: h */
        private float f100620h;

        /* renamed from: i */
        private WeakReference<View> f100621i;

        /* renamed from: j */
        private HashMap<Integer, Object> f100622j = new HashMap<>();

        /* renamed from: k */
        private float f100623k = 0.0f;

        /* renamed from: l */
        private ValueAnimator f100624l;

        /* renamed from: m */
        private boolean f100625m = false;

        /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$Behavior$SavedState */
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
            int f100638a;

            /* renamed from: b */
            float f100639b;

            /* renamed from: c */
            boolean f100640c;

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                boolean z;
                super(parcel, classLoader);
                this.f100638a = parcel.readInt();
                this.f100639b = parcel.readFloat();
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f100640c = z;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f100638a);
                parcel.writeFloat(this.f100639b);
                parcel.writeByte(this.f100640c ? (byte) 1 : 0);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$Behavior$a */
        public static abstract class C39360a {
            /* renamed from: a */
            public abstract boolean mo80251a(AppBarLayout appBarLayout);
        }

        /* renamed from: a */
        private static boolean m87482a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo80226b() {
            this.f100621i = null;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0135  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0138  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ int mo80221a(com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout r9, android.view.View r10, int r11, int r12, int r13, int r14, boolean r15) {
            /*
                r8 = this;
                r0 = r10
                com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout r0 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.AppBarLayout) r0
                int r10 = r8.mo80227c()
                r1 = 0
                if (r12 == 0) goto L_0x0141
                if (r10 < r12) goto L_0x0141
                if (r10 > r13) goto L_0x0141
                int r13 = android.support.p030v4.p033b.C0703a.m2034a(r11, r12, r13)
                if (r10 == r13) goto L_0x0143
                boolean r11 = r0.f100599a
                r12 = 2
                if (r11 == 0) goto L_0x0085
                int r11 = java.lang.Math.abs(r13)
                int r2 = r0.getChildCount()
                r3 = 0
            L_0x0022:
                if (r3 >= r2) goto L_0x0085
                android.view.View r4 = r0.getChildAt(r3)
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$LayoutParams r5 = (com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.AppBarLayout.LayoutParams) r5
                android.view.animation.Interpolator r6 = r5.f100642b
                int r7 = r4.getTop()
                if (r11 < r7) goto L_0x0082
                int r7 = r4.getBottom()
                if (r11 > r7) goto L_0x0082
                if (r6 == 0) goto L_0x0085
                int r2 = r5.f100641a
                r3 = r2 & 1
                if (r3 == 0) goto L_0x0057
                int r3 = r4.getHeight()
                int r7 = r5.topMargin
                int r3 = r3 + r7
                int r5 = r5.bottomMargin
                int r3 = r3 + r5
                int r1 = r1 + r3
                r2 = r2 & r12
                if (r2 == 0) goto L_0x0057
                int r2 = android.support.p030v4.view.C1056u.m3066l(r4)
                int r1 = r1 - r2
            L_0x0057:
                boolean r2 = android.support.p030v4.view.C1056u.m3073s(r4)
                if (r2 == 0) goto L_0x0062
                int r2 = r0.getTopInset()
                int r1 = r1 - r2
            L_0x0062:
                if (r1 <= 0) goto L_0x0085
                int r2 = r4.getTop()
                int r11 = r11 - r2
                float r1 = (float) r1
                float r11 = (float) r11
                float r11 = r11 / r1
                float r11 = r6.getInterpolation(r11)
                float r1 = r1 * r11
                int r11 = java.lang.Math.round(r1)
                int r1 = java.lang.Integer.signum(r13)
                int r2 = r4.getTop()
                int r2 = r2 + r11
                int r11 = r1 * r2
                goto L_0x0086
            L_0x0082:
                int r3 = r3 + 1
                goto L_0x0022
            L_0x0085:
                r11 = r13
            L_0x0086:
                int r1 = r10 - r13
                int r2 = r13 - r11
                r8.f100615a = r2
                boolean r2 = r8.f100625m
                if (r2 == 0) goto L_0x0092
                if (r15 == 0) goto L_0x0143
            L_0x0092:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                java.lang.String r2 = "setHeaderTopBottomOffset+++++curOffset:"
                r15.<init>(r2)
                r15.append(r10)
                java.lang.String r2 = "/newOffset:"
                r15.append(r2)
                r15.append(r13)
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                java.lang.String r2 = "setHeaderTopBottomOffset+++++getTopAndBottomOffset:"
                r15.<init>(r2)
                int r2 = r8.getTopAndBottomOffset()
                r15.append(r2)
                java.lang.String r2 = "/"
                r15.append(r2)
                int r2 = r8.mo80227c()
                r15.append(r2)
                java.lang.String r2 = "/"
                r15.append(r2)
                int r2 = r0.getHeight()
                r15.append(r2)
                int r15 = r0.f100604f
                int r15 = -r15
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "setHeaderTopBottomOffset+++++anchor : "
                r2.<init>(r3)
                r2.append(r15)
                java.lang.String r3 = " / interpolatedOffset : "
                r2.append(r3)
                r2.append(r11)
                java.lang.String r3 = " / touchType : "
                r2.append(r3)
                r2.append(r14)
                r2 = 1
                if (r15 > r11) goto L_0x0102
                if (r14 == r2) goto L_0x00ed
                goto L_0x0102
            L_0x00ed:
                if (r15 >= r11) goto L_0x00fc
                if (r14 != r2) goto L_0x00fc
                int r14 = r8.getTopAndBottomOffset()
                if (r14 <= r15) goto L_0x00fc
                boolean r14 = r8.setTopAndBottomOffset(r11)
                goto L_0x0107
            L_0x00fc:
                boolean r14 = r8.setTopAndBottomOffset(r15)
                r12 = 3
                goto L_0x0107
            L_0x0102:
                boolean r14 = r8.setTopAndBottomOffset(r11)
                r12 = 1
            L_0x0107:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                java.lang.String r3 = "setHeaderTopBottomOffset+++++getTopAndBottomOffset:  interpolatedOffset : "
                r15.<init>(r3)
                r15.append(r11)
                java.lang.String r11 = "****"
                r15.append(r11)
                r15.append(r12)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r12 = "setHeaderTopBottomOffset+++++offsetChanged..."
                r11.<init>(r12)
                r11.append(r14)
                if (r14 != 0) goto L_0x012c
                boolean r11 = r0.f100599a
                if (r11 == 0) goto L_0x012c
                r9.mo80260a(r0)
            L_0x012c:
                int r11 = r8.getTopAndBottomOffset()
                r0.mo80196b(r11)
                if (r13 >= r10) goto L_0x0138
                r10 = -1
                r14 = -1
                goto L_0x0139
            L_0x0138:
                r14 = 1
            L_0x0139:
                r15 = 0
                r10 = r8
                r11 = r9
                r12 = r0
                r10.m87485b(r11, r12, r13, r14, r15)
                goto L_0x0143
            L_0x0141:
                r8.f100615a = r1
            L_0x0143:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.AppBarLayout.Behavior.mo80221a(com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout, android.view.View, int, int, int, int, boolean):int");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo80224a(View view, float f) {
            return m87483a((AppBarLayout) view, -f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo80223a() {
            return !this.f100622j.isEmpty();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo80227c() {
            return getTopAndBottomOffset() + this.f100615a;
        }

        public final /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public final /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ int mo80225b(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        public final /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        public final /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ int mo80220a(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final /* synthetic */ boolean mo80228c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f100616b != null) {
                return this.f100616b.mo80251a(appBarLayout);
            }
            if (!(this.f100621i == null || this.f100621i.get() == null)) {
                View view2 = (View) this.f100621i.get();
                if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        private static int m87477a(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -i;
                if (childAt.getTop() <= i3 && childAt.getBottom() >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: b */
        private static View m87484b(AppBarLayout appBarLayout, int i) {
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

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo80222a(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            m87479a(coordinatorLayout, appBarLayout);
            appBarLayout.mo80198c(2);
        }

        /* renamed from: a */
        private void m87479a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int c = mo80227c();
            int a = m87477a(appBarLayout, c);
            if (a >= 0) {
                View childAt = appBarLayout.getChildAt(a);
                int i = ((LayoutParams) childAt.getLayoutParams()).f100641a;
                if ((i & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (a == appBarLayout.getChildCount() - 1) {
                        i3 += appBarLayout.getTopInset();
                    }
                    if (m87482a(i, 2)) {
                        i3 += C1056u.m3066l(childAt);
                    } else if (m87482a(i, 5)) {
                        int l = C1056u.m3066l(childAt) + i3;
                        if (c < l) {
                            i2 = l;
                        } else {
                            i3 = l;
                        }
                    }
                    int i4 = (i3 + i2) / 2;
                    m87480a(coordinatorLayout, appBarLayout, C0703a.m2034a(i4, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                    new StringBuilder("+++AppBarLayout...snapToChildIfNeeded___executed...").append(i4);
                }
            }
        }

        public final /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(onSaveInstanceState);
                    savedState.f100638a = i;
                    if (bottom == C1056u.m3066l(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.f100640c = z;
                    savedState.f100639b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return onSaveInstanceState;
        }

        /* renamed from: b */
        private static boolean m87486b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List c = coordinatorLayout.mo80265c((View) appBarLayout);
            int size = c.size();
            int i = 0;
            while (i < size) {
                com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.Behavior behavior = ((C39367d) ((View) c.get(i)).getLayoutParams()).f100670a;
                if (!(behavior instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) behavior).mOverlayTop != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: a */
        private boolean m87483a(AppBarLayout appBarLayout, float f) {
            boolean z;
            int i = -appBarLayout.f100604f;
            int topAndBottomOffset = getTopAndBottomOffset();
            StringBuilder sb = new StringBuilder("+++AppBarLayoutTag...onNestedFling...");
            sb.append(topAndBottomOffset);
            sb.append("/velocityY:");
            sb.append(f);
            if (topAndBottomOffset > i) {
                boolean z2 = !appBarLayout.f100605g;
                if (topAndBottomOffset < 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2 || z) {
                    if (f == 0.0f) {
                        if (appBarLayout.f100605g) {
                            if (topAndBottomOffset >= i / 2) {
                                i = 0;
                            }
                            m87478a(appBarLayout, topAndBottomOffset, i, f);
                        } else {
                            m87478a(appBarLayout, topAndBottomOffset, i, f);
                        }
                    } else if (topAndBottomOffset > i / 2) {
                        if (!appBarLayout.f100605g) {
                            m87478a(appBarLayout, topAndBottomOffset, i, f);
                        } else if (f > 2000.0f) {
                            m87478a(appBarLayout, topAndBottomOffset, i, f);
                        } else {
                            m87478a(appBarLayout, topAndBottomOffset, 0, 0.0f);
                        }
                    } else if (!appBarLayout.f100605g) {
                        m87478a(appBarLayout, topAndBottomOffset, i, 0.0f);
                    } else if (f < -2000.0f) {
                        m87478a(appBarLayout, topAndBottomOffset, 0, f);
                    } else {
                        m87478a(appBarLayout, topAndBottomOffset, i, 0.0f);
                    }
                    return true;
                }
            }
            return false;
        }

        public final /* synthetic */ void toggleAppBarLayout(CoordinatorLayout coordinatorLayout, View view, int i) {
            m87481a(coordinatorLayout, (AppBarLayout) view, i, 200, true);
        }

        public final /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, savedState.f3119e);
                this.f100618f = savedState.f100638a;
                this.f100620h = savedState.f100639b;
                this.f100619g = savedState.f100640c;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
            this.f100618f = -1;
        }

        public final /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            boolean z;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            if (this.f100618f >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.f100618f);
                int i2 = -childAt.getBottom();
                if (this.f100619g) {
                    round = i2 + C1056u.m3066l(childAt) + appBarLayout.getTopInset();
                } else {
                    round = i2 + Math.round(((float) childAt.getHeight()) * this.f100620h);
                }
                mo80339a(coordinatorLayout, appBarLayout, round, 0, false);
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i3 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m87480a(coordinatorLayout, appBarLayout, i3, 0.0f);
                    } else {
                        mo80339a(coordinatorLayout, appBarLayout, i3, 0, false);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m87480a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        mo80339a(coordinatorLayout, appBarLayout, 0, 0, false);
                    }
                }
            }
            appBarLayout.f100600b = 0;
            this.f100618f = -1;
            setTopAndBottomOffset(C0703a.m2034a(getTopAndBottomOffset(), -appBarLayout.getTotalScrollRange(), 0));
            m87485b(coordinatorLayout, appBarLayout, getTopAndBottomOffset(), 0, true);
            appBarLayout.mo80196b(getTopAndBottomOffset());
            return onLayoutChild;
        }

        public final /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            new StringBuilder("+++AppBarLayoutTag...onStopNestedScroll...type : ").append(i);
            if (i == 0) {
                m87479a(coordinatorLayout, appBarLayout);
            }
            this.f100621i = new WeakReference<>(view2);
            this.f100622j.remove(Integer.valueOf(i));
            int i2 = 1;
            if (i == 1) {
                if (getTopAndBottomOffset() != 0) {
                    i2 = 0;
                }
                appBarLayout.mo80198c(i2);
                return;
            }
            m87483a(appBarLayout, this.f100623k);
            this.f100623k = 0.0f;
        }

        /* renamed from: a */
        private void m87478a(final AppBarLayout appBarLayout, int i, final int i2, float f) {
            int i3;
            if (this.f100624l == null) {
                int abs = Math.abs(mo80227c() - i2);
                float abs2 = Math.abs(f);
                if (abs2 <= 0.0f || !appBarLayout.f100605g) {
                    i3 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
                } else {
                    i3 = Math.round((((float) abs) / abs2) * 1000.0f) * 1;
                }
                this.f100624l = new ValueAnimator();
                this.f100624l.setDuration((long) i3);
                this.f100624l.setInterpolator(new DecelerateInterpolator());
                this.f100624l.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Behavior.this.setTopAndBottomOffset(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        appBarLayout.mo80196b(Behavior.this.getTopAndBottomOffset());
                    }
                });
            } else if (this.f100624l.isRunning()) {
                this.f100624l.removeAllListeners();
                this.f100624l.cancel();
            }
            this.f100625m = true;
            this.f100624l.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    int i;
                    if (i2 == 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    appBarLayout.mo80198c(i);
                }
            });
            this.f100624l.setIntValues(new int[]{i, i2});
            this.f100624l.start();
        }

        /* renamed from: a */
        private void m87480a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int i2;
            int height;
            if (i == (-appBarLayout.getHeight())) {
                i2 = appBarLayout.f100603e + i;
            } else {
                i2 = i;
            }
            int abs = Math.abs(mo80227c() - i2);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            m87481a(coordinatorLayout, appBarLayout, i, height, false);
        }

        public final /* bridge */ /* synthetic */ boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
            return super.onNestedPreFling(coordinatorLayout, (AppBarLayout) view, view2, f, f2);
        }

        /* renamed from: b */
        private void m87485b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View b = m87484b(appBarLayout, i);
            if (b != null) {
                int i3 = ((LayoutParams) b.getLayoutParams()).f100641a;
                boolean z2 = false;
                if ((i3 & 1) != 0) {
                    int l = C1056u.m3066l(b);
                    if (i2 <= 0 || (i3 & 12) == 0 ? !((i3 & 2) == 0 || (-i) < (b.getBottom() - l) - appBarLayout.getTopInset()) : (-i) >= (b.getBottom() - l) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
                boolean a = appBarLayout.mo80195a(z2);
                if (VERSION.SDK_INT < 11) {
                    return;
                }
                if (z || (a && m87486b(coordinatorLayout, appBarLayout))) {
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: a */
        private void m87481a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final int i, int i2, final boolean z) {
            int c = mo80227c();
            if (c == i) {
                if (this.f100617e != null && this.f100617e.isRunning()) {
                    this.f100617e.cancel();
                }
                return;
            }
            if (this.f100617e == null) {
                this.f100617e = new ValueAnimator();
                this.f100617e.setInterpolator(new DecelerateInterpolator());
                this.f100617e.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i;
                        Behavior behavior = Behavior.this;
                        CoordinatorLayout coordinatorLayout = coordinatorLayout;
                        AppBarLayout appBarLayout = appBarLayout;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (z) {
                            i = -1;
                        } else {
                            i = 1;
                        }
                        behavior.mo80339a(coordinatorLayout, appBarLayout, intValue, i, false);
                        appBarLayout.mo80196b(Behavior.this.getTopAndBottomOffset());
                    }
                });
            } else {
                this.f100617e.removeAllListeners();
                this.f100617e.cancel();
            }
            this.f100617e.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    int i;
                    if (i == 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    appBarLayout.mo80198c(i);
                }
            });
            this.f100625m = false;
            this.f100617e.setDuration((long) Math.min(i2, 600));
            this.f100617e.setIntValues(new int[]{c, i});
            this.f100617e.start();
        }

        public final /* bridge */ /* synthetic */ boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            this.f100623k = f2;
            return super.onNestedFling(coordinatorLayout, appBarLayout, view2, f, f2, z);
        }

        public final /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((C39367d) appBarLayout.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.mo80262a((View) appBarLayout, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public final /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            new StringBuilder("+++AppBarLayoutTag...onStartNestedScroll...").append(i2);
            int i3 = i & 2;
            if (i3 == 0 || !appBarLayout.mo80197b() || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()) {
                z = false;
            } else {
                z = true;
            }
            StringBuilder sb = new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...nestedScrollAxes...");
            if (i3 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...hasScrollableChildren...").append(appBarLayout.mo80197b());
            StringBuilder sb2 = new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...height...");
            if (coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()) {
                z3 = true;
            } else {
                z3 = false;
            }
            sb2.append(z3);
            new StringBuilder("+++CoordinatorLayout...onStartNestedScroll...child...").append(view2.getClass().getName());
            if (z && this.f100617e != null) {
                this.f100617e.cancel();
            }
            this.f100621i = null;
            this.f100625m = false;
            if (this.f100624l != null) {
                if (this.f100624l.isRunning()) {
                    this.f100624l.removeAllListeners();
                    this.f100624l.cancel();
                }
                this.f100624l = null;
            }
            if (z) {
                this.f100622j.put(Integer.valueOf(i2), null);
                if (this.f100720c != null) {
                    appBarLayout.removeCallbacks(this.f100720c);
                    this.f100720c = null;
                }
                if (this.f100721d != null) {
                    this.f100721d.forceFinished(true);
                }
            }
            return z;
        }

        public final /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            StringBuilder sb = new StringBuilder("+++AppBarLayout...onNestedPreScroll...dy : ");
            sb.append(i2);
            sb.append(" type : ");
            sb.append(i3);
            if (i2 != 0) {
                if (this.f100625m) {
                    iArr[1] = i2;
                    return;
                }
                if (i2 < 0) {
                    int i6 = -appBarLayout.getTotalScrollRange();
                    i5 = i6;
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo80340b(coordinatorLayout, appBarLayout, i2, i5, i4, i3, false);
                }
            }
        }

        public final /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            int i6 = i4;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            StringBuilder sb = new StringBuilder("+++AppBarLayout...onNestedScroll...dyUnconsumed : ");
            sb.append(i6);
            sb.append(" type : ");
            sb.append(i5);
            if (i6 >= 0) {
            } else if (!this.f100625m) {
                mo80340b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0, i5, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$LayoutParams */
    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f100641a = 1;

        /* renamed from: b */
        public Interpolator f100642b;

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
            this.f100641a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f100642b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$ScrollingViewBehavior */
    public static class ScrollingViewBehavior extends C39374d {
        public ScrollingViewBehavior() {
        }

        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        /* access modifiers changed from: 0000 */
        public int getScrollRange(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.getScrollRange(view);
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.Behavior behavior = ((C39367d) appBarLayout.getLayoutParams()).f100670a;
            if (behavior instanceof Behavior) {
                return ((Behavior) behavior).mo80227c();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public AppBarLayout findFirstDependency(List<View> list) {
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
        public float getOverlapRatioForOffset(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + appBarLayoutOffset <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) appBarLayoutOffset) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.c9});
            this.mOverlayTop = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            offsetChildAsNeeded(coordinatorLayout, view, view2);
            return false;
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        private void offsetChildAsNeeded(CoordinatorLayout coordinatorLayout, View view, View view2) {
            com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.Behavior behavior = ((C39367d) view2.getLayoutParams()).f100670a;
            if (behavior instanceof Behavior) {
                C1056u.m3058g(view, (((view2.getBottom() - view.getTop()) + ((Behavior) behavior).f100615a) + this.mVerticalLayoutGap) - getOverlapPixelsForOffset(view2));
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.mo80264b(view));
            if (findFirstDependency != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.mTempRect1;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    findFirstDependency.mo80194a(false, !z);
                    return true;
                }
            }
            return false;
        }

        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout$a */
    public interface C39361a {
        /* renamed from: a */
        void mo80147a(AppBarLayout appBarLayout, int i);
    }

    public int getAnchorHeight() {
        return this.f100604f;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f100600b;
    }

    public float getTargetElevation() {
        return 0.0f;
    }

    /* renamed from: c */
    private static LayoutParams m87468c() {
        return new LayoutParams(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo80192a() {
        this.f100606h = -1;
        this.f100607i = -1;
        this.f100608j = -1;
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo80197b() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    public final int getTopInset() {
        int i;
        if (this.f100601c != null) {
            i = this.f100601c.mo3186b();
        } else {
            i = 0;
        }
        return i + this.f100612n;
    }

    /* access modifiers changed from: 0000 */
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
        if (this.f100607i != -1) {
            return this.f100607i;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = layoutParams.f100641a;
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
        this.f100607i = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        if (this.f100608j != -1) {
            return this.f100608j;
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
            int i3 = layoutParams.f100641a;
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
        this.f100608j = max;
        return max;
    }

    public final int getTotalScrollRange() {
        if (this.f100606h != -1) {
            return this.f100606h;
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
            int i3 = layoutParams.f100641a;
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
        int max = Math.max(0, i2 - getTopInset()) - this.f100603e;
        this.f100606h = max;
        return max;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setTopInset(int i) {
        this.f100612n = i;
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public void setAnchorHeight(int i) {
        if (i > 0) {
            this.f100604f = i;
        }
    }

    public void setExpanded(boolean z) {
        mo80194a(z, C1056u.m3079y(this));
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
            C39378h.m87558a(this, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo80198c(int i) {
        if (this.f100602d != null) {
            int size = this.f100602d.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f100602d.get(i2);
            }
        }
    }

    /* renamed from: a */
    private static LayoutParams m87466a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo80196b(int i) {
        if (this.f100602d != null) {
            int size = this.f100602d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C39361a aVar = (C39361a) this.f100602d.get(i2);
                if (!(aVar == null || this.f100613o == i)) {
                    aVar.mo80147a(this, i);
                    this.f100613o = i;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f100611m == null) {
            this.f100611m = new int[2];
        }
        int[] iArr = this.f100611m;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        if (this.f100609k) {
            i2 = R.attr.a3e;
        } else {
            i2 = -2131362946;
        }
        iArr[0] = i2;
        if (!this.f100609k || !this.f100610l) {
            i3 = -2131362945;
        } else {
            i3 = R.attr.a3d;
        }
        iArr[1] = i3;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* renamed from: a */
    public final void mo80193a(int i) {
        com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.Behavior behavior = ((C39367d) getLayoutParams()).f100670a;
        if (behavior != null && (behavior instanceof C39372c)) {
            ((C39372c) behavior).mo80339a((CoordinatorLayout) getParent(), this, i, 0, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo80195a(boolean z) {
        if (this.f100610l == z) {
            return false;
        }
        this.f100610l = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo80192a();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f100606h = -1;
        this.f100607i = -1;
        this.f100608j = -1;
        this.f100605g = true;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C39375e.f100728a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!z) {
            if (VERSION.SDK_INT >= 21) {
                setOutlineProvider(ViewOutlineProvider.BOUNDS);
                Context context2 = getContext();
                TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, C39378h.f100734a, 0, R.style.qw);
                try {
                    if (obtainStyledAttributes2.hasValue(0)) {
                        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, obtainStyledAttributes2.getResourceId(0, 0)));
                    }
                } catch (Exception e) {
                    C32458a.m75148a((Throwable) e);
                } catch (Throwable th) {
                    obtainStyledAttributes2.recycle();
                    throw th;
                }
                obtainStyledAttributes2.recycle();
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, new int[]{16842964, 16843919, 16844096, R.attr.k_, R.attr.l5, R.attr.se}, 0, R.style.qw);
            C1056u.m3030a((View) this, obtainStyledAttributes3.getDrawable(0));
            if (obtainStyledAttributes3.hasValue(4)) {
                m87467a(obtainStyledAttributes3.getBoolean(4, false), false, false);
            }
            if (VERSION.SDK_INT >= 21 && obtainStyledAttributes3.hasValue(3)) {
                C39378h.m87558a(this, (float) obtainStyledAttributes3.getDimensionPixelSize(3, 0));
            }
            if (VERSION.SDK_INT >= 26) {
                if (obtainStyledAttributes3.hasValue(2)) {
                    setKeyboardNavigationCluster(obtainStyledAttributes3.getBoolean(2, false));
                }
                if (obtainStyledAttributes3.hasValue(1)) {
                    setTouchscreenBlocksFocus(obtainStyledAttributes3.getBoolean(1, false));
                }
            }
            obtainStyledAttributes3.recycle();
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
                    if (!C0793j.m2264a(appBarLayout.f100601c, acVar2)) {
                        appBarLayout.f100601c = acVar2;
                        appBarLayout.mo80192a();
                    }
                    return acVar;
                }
            });
            return;
        }
        throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }

    /* renamed from: a */
    public final void mo80194a(boolean z, boolean z2) {
        m87467a(z, z2, true);
    }

    /* renamed from: a */
    private void m87467a(boolean z, boolean z2, boolean z3) {
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
        this.f100600b = i4 | i3;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        mo80192a();
        boolean z3 = false;
        this.f100599a = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).f100642b != null) {
                this.f100599a = true;
                break;
            } else {
                i5++;
            }
        }
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
            if ((layoutParams.f100641a & 1) != 1 || (layoutParams.f100641a & 10) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                z3 = true;
                break;
            }
            i6++;
        }
        if (this.f100609k != z3) {
            this.f100609k = z3;
            refreshDrawableState();
        }
    }
}
