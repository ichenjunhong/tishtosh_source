package com.p683ss.android.ugc.aweme.commercialize.views;

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
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.C23583a;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26782d;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26782d.C26785a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior */
public class AdPopUpWebBottomSheetBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public int f70023a;

    /* renamed from: b */
    int f70024b;

    /* renamed from: c */
    int f70025c;

    /* renamed from: d */
    public boolean f70026d;

    /* renamed from: e */
    public boolean f70027e;

    /* renamed from: f */
    public int f70028f = 4;

    /* renamed from: g */
    public C26782d f70029g;

    /* renamed from: h */
    int f70030h;

    /* renamed from: i */
    WeakReference<V> f70031i;

    /* renamed from: j */
    WeakReference<View> f70032j;

    /* renamed from: k */
    public C26605a f70033k;

    /* renamed from: l */
    int f70034l;

    /* renamed from: m */
    boolean f70035m;

    /* renamed from: n */
    public boolean f70036n;

    /* renamed from: o */
    public WebView f70037o;

    /* renamed from: p */
    private float f70038p;

    /* renamed from: q */
    private int f70039q;

    /* renamed from: r */
    private boolean f70040r;

    /* renamed from: s */
    private boolean f70041s;

    /* renamed from: t */
    private int f70042t;

    /* renamed from: u */
    private boolean f70043u;

    /* renamed from: v */
    private VelocityTracker f70044v;

    /* renamed from: w */
    private int f70045w;

    /* renamed from: x */
    private boolean f70046x;

    /* renamed from: y */
    private final C26785a f70047y = new C26785a() {
        /* renamed from: a */
        public final void mo54347a(int i) {
            if (i == 1) {
                AdPopUpWebBottomSheetBehavior.this.mo54342c(1);
            }
        }

        /* renamed from: a */
        public final int mo54345a(View view) {
            if (AdPopUpWebBottomSheetBehavior.this.f70026d) {
                return AdPopUpWebBottomSheetBehavior.this.f70030h - AdPopUpWebBottomSheetBehavior.this.f70024b;
            }
            return AdPopUpWebBottomSheetBehavior.this.f70025c - AdPopUpWebBottomSheetBehavior.this.f70024b;
        }

        /* renamed from: b */
        public final int mo54351b(View view) {
            if (AdPopUpWebBottomSheetBehavior.this.f70026d) {
                return AdPopUpWebBottomSheetBehavior.this.f70030h - AdPopUpWebBottomSheetBehavior.this.f70024b;
            }
            return AdPopUpWebBottomSheetBehavior.this.f70025c - AdPopUpWebBottomSheetBehavior.this.f70024b;
        }

        /* renamed from: a */
        public final boolean mo54350a(View view, int i) {
            if (AdPopUpWebBottomSheetBehavior.this.f70028f == 1 || AdPopUpWebBottomSheetBehavior.this.f70035m) {
                return false;
            }
            if (AdPopUpWebBottomSheetBehavior.this.f70028f == 3 && AdPopUpWebBottomSheetBehavior.this.f70034l == i) {
                View view2 = (View) AdPopUpWebBottomSheetBehavior.this.f70032j.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (AdPopUpWebBottomSheetBehavior.this.f70031i == null || AdPopUpWebBottomSheetBehavior.this.f70031i.get() != view) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final int mo54352b(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: a */
        public final int mo54346a(View view, int i, int i2) {
            int i3;
            int i4 = AdPopUpWebBottomSheetBehavior.this.f70024b;
            if (AdPopUpWebBottomSheetBehavior.this.f70026d) {
                i3 = AdPopUpWebBottomSheetBehavior.this.f70030h;
            } else {
                i3 = AdPopUpWebBottomSheetBehavior.this.f70025c;
            }
            return C0703a.m2034a(i, i4, i3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo54348a(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 0
                int r4 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r4 >= 0) goto L_0x0012
                int r4 = com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70535d
                if (r4 != r2) goto L_0x0012
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r8 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                int r8 = r8.f70024b
            L_0x0010:
                r0 = 3
                goto L_0x0051
            L_0x0012:
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r4 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                boolean r4 = r4.f70026d
                if (r4 == 0) goto L_0x0026
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r4 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                boolean r8 = r4.mo54340a(r7, r9, r8)
                if (r8 == 0) goto L_0x0026
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r8 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                int r8 = r8.f70030h
                r0 = 5
                goto L_0x0051
            L_0x0026:
                int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r8 != 0) goto L_0x004d
                int r8 = r7.getTop()
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r9 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                int r9 = r9.f70024b
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r3 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                int r3 = r3.f70025c
                int r8 = r8 - r3
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0048
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r8 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                int r8 = r8.f70024b
                goto L_0x0010
            L_0x0048:
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r8 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                int r8 = r8.f70025c
                goto L_0x0051
            L_0x004d:
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r8 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                int r8 = r8.f70025c
            L_0x0051:
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r9 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d r9 = r9.f70029g
                int r1 = r7.getLeft()
                boolean r3 = r9.f70576p
                if (r3 == 0) goto L_0x008b
                android.view.VelocityTracker r3 = r9.f70569i
                int r4 = r9.f70563c
                float r3 = r3.getXVelocity(r4)
                int r3 = (int) r3
                android.view.VelocityTracker r4 = r9.f70569i
                int r5 = r9.f70563c
                float r4 = r4.getYVelocity(r5)
                int r4 = (int) r4
                boolean r8 = r9.mo54680a(r1, r8, r3, r4)
                if (r8 == 0) goto L_0x0085
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r8 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                r8.mo54342c(r2)
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior$b r8 = new com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior$b
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r9 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                r8.<init>(r7, r0)
                android.support.p030v4.view.C1056u.m3034a(r7, r8)
                return
            L_0x0085:
                com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior r7 = com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.this
                r7.mo54342c(r0)
                return
            L_0x008b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.C266032.mo54348a(android.view.View, float, float):void");
        }

        /* renamed from: a */
        public final void mo54349a(View view, int i, int i2, int i3, int i4) {
            AdPopUpWebBottomSheetBehavior.this.mo54343d(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior$SavedState */
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
        final int f70052a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f70052a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f70052a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f70052a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior$a */
    public static abstract class C26605a {
        /* renamed from: a */
        public abstract void mo54356a(View view, float f);

        /* renamed from: a */
        public abstract void mo54357a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior$b */
    class C26606b implements Runnable {

        /* renamed from: b */
        private final View f70054b;

        /* renamed from: c */
        private final int f70055c;

        public final void run() {
            if (AdPopUpWebBottomSheetBehavior.this.f70029g != null) {
                C26782d dVar = AdPopUpWebBottomSheetBehavior.this.f70029g;
                boolean z = false;
                if (dVar.f70561a == 2) {
                    boolean computeScrollOffset = dVar.f70573m.computeScrollOffset();
                    int currX = dVar.f70573m.getCurrX();
                    int currY = dVar.f70573m.getCurrY();
                    int left = currX - dVar.f70575o.getLeft();
                    int top = currY - dVar.f70575o.getTop();
                    if (left != 0) {
                        C1056u.m3060h(dVar.f70575o, left);
                    }
                    if (top != 0) {
                        C1056u.m3058g(dVar.f70575o, top);
                    }
                    if (!(left == 0 && top == 0)) {
                        dVar.f70574n.mo54349a(dVar.f70575o, currX, currY, left, top);
                    }
                    if (computeScrollOffset && currX == dVar.f70573m.getFinalX() && currY == dVar.f70573m.getFinalY()) {
                        dVar.f70573m.abortAnimation();
                        computeScrollOffset = false;
                    }
                    if (!computeScrollOffset) {
                        dVar.f70577q.post(dVar.f70578r);
                    }
                }
                if (dVar.f70561a == 2) {
                    z = true;
                }
                if (z) {
                    C1056u.m3034a(this.f70054b, (Runnable) this);
                    return;
                }
            }
            AdPopUpWebBottomSheetBehavior.this.mo54342c(this.f70055c);
        }

        C26606b(View view, int i) {
            this.f70054b = view;
            this.f70055c = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0221 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0222 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1171a(android.support.design.widget.CoordinatorLayout r13, V r14, android.view.MotionEvent r15) {
        /*
            r12 = this;
            boolean r13 = r14.isShown()
            r0 = 0
            if (r13 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r13 = r15.getActionMasked()
            int r1 = r12.f70028f
            r2 = 1
            if (r1 != r2) goto L_0x0014
            if (r13 != 0) goto L_0x0014
            return r2
        L_0x0014:
            int r1 = r15.getAction()
            r3 = 2
            if (r1 == r3) goto L_0x0022
            int r1 = r15.getAction()
            r4 = 6
            if (r1 != r4) goto L_0x0038
        L_0x0022:
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d r1 = r12.f70029g
            int r1 = r1.f70563c
            int r1 = r15.findPointerIndex(r1)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d r4 = r12.f70029g
            if (r4 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d r4 = r12.f70029g
            int r4 = r4.f70561a
            if (r4 != r2) goto L_0x0038
            if (r1 >= 0) goto L_0x0038
            r1 = 0
            goto L_0x0039
        L_0x0038:
            r1 = 1
        L_0x0039:
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d r4 = r12.f70029g
            if (r4 == 0) goto L_0x01e1
            if (r1 == 0) goto L_0x01e1
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d r1 = r12.f70029g
            int r4 = r15.getActionMasked()
            int r5 = r15.getActionIndex()
            if (r4 != 0) goto L_0x004e
            r1.mo54674a()
        L_0x004e:
            android.view.VelocityTracker r6 = r1.f70569i
            if (r6 != 0) goto L_0x0058
            android.view.VelocityTracker r6 = android.view.VelocityTracker.obtain()
            r1.f70569i = r6
        L_0x0058:
            android.view.VelocityTracker r6 = r1.f70569i
            r6.addMovement(r15)
            switch(r4) {
                case 0: goto L_0x01c2;
                case 1: goto L_0x01b7;
                case 2: goto L_0x00fe;
                case 3: goto L_0x00f1;
                case 4: goto L_0x0060;
                case 5: goto L_0x00a9;
                case 6: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x01e1
        L_0x0062:
            int r4 = r15.getPointerId(r5)
            int r5 = r1.f70561a
            if (r5 != r2) goto L_0x00a4
            int r5 = r1.f70563c
            if (r4 != r5) goto L_0x00a4
            int r5 = r15.getPointerCount()
            r6 = 0
        L_0x0073:
            r7 = -1
            if (r6 >= r5) goto L_0x009e
            int r8 = r15.getPointerId(r6)
            int r9 = r1.f70563c
            if (r8 == r9) goto L_0x009b
            float r9 = r15.getX(r6)
            float r10 = r15.getY(r6)
            int r9 = (int) r9
            int r10 = (int) r10
            android.view.View r9 = r1.mo54673a(r9, r10)
            android.view.View r10 = r1.f70575o
            if (r9 != r10) goto L_0x009b
            android.view.View r9 = r1.f70575o
            boolean r8 = r1.mo54688b(r9, r8)
            if (r8 == 0) goto L_0x009b
            int r5 = r1.f70563c
            goto L_0x009f
        L_0x009b:
            int r6 = r6 + 1
            goto L_0x0073
        L_0x009e:
            r5 = -1
        L_0x009f:
            if (r5 != r7) goto L_0x00a4
            r1.mo54684b()
        L_0x00a4:
            r1.mo54677a(r4)
            goto L_0x01e1
        L_0x00a9:
            int r4 = r15.getPointerId(r5)
            float r6 = r15.getX(r5)
            float r5 = r15.getY(r5)
            r1.mo54676a(r6, r5, r4)
            int r7 = r1.f70561a
            if (r7 != 0) goto L_0x00c7
            int r6 = (int) r6
            int r5 = (int) r5
            android.view.View r5 = r1.mo54673a(r6, r5)
            r1.mo54688b(r5, r4)
            goto L_0x01e1
        L_0x00c7:
            int r6 = (int) r6
            int r5 = (int) r5
            android.view.View r7 = r1.f70575o
            if (r7 == 0) goto L_0x00e7
            int r8 = r7.getLeft()
            if (r6 < r8) goto L_0x00e7
            int r8 = r7.getRight()
            if (r6 >= r8) goto L_0x00e7
            int r6 = r7.getTop()
            if (r5 < r6) goto L_0x00e7
            int r6 = r7.getBottom()
            if (r5 >= r6) goto L_0x00e7
            r5 = 1
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            if (r5 == 0) goto L_0x01e1
            android.view.View r5 = r1.f70575o
            r1.mo54688b(r5, r4)
            goto L_0x01e1
        L_0x00f1:
            int r4 = r1.f70561a
            if (r4 != r2) goto L_0x00f9
            r4 = 0
            r1.mo54675a(r4, r4)
        L_0x00f9:
            r1.mo54674a()
            goto L_0x01e1
        L_0x00fe:
            int r4 = r1.f70561a
            if (r4 != r2) goto L_0x0172
            int r4 = r1.f70563c
            boolean r4 = r1.mo54689c(r4)
            if (r4 == 0) goto L_0x01e1
            int r4 = r1.f70563c
            int r4 = r15.findPointerIndex(r4)
            float r5 = r15.getX(r4)
            float r4 = r15.getY(r4)
            float[] r6 = r1.f70566f
            int r7 = r1.f70563c
            r6 = r6[r7]
            float r5 = r5 - r6
            int r5 = (int) r5
            float[] r6 = r1.f70567g
            int r7 = r1.f70563c
            r6 = r6[r7]
            float r4 = r4 - r6
            int r4 = (int) r4
            float r6 = (float) r5
            float r7 = (float) r4
            boolean r8 = com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70534c
            if (r8 == 0) goto L_0x013c
            float r6 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x013c
            r6 = 1
            goto L_0x013d
        L_0x013c:
            r6 = 0
        L_0x013d:
            if (r6 == 0) goto L_0x015b
            com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70535d = r2
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70533b
            if (r6 != 0) goto L_0x016e
            android.view.View r6 = r1.f70575o
            int r6 = r6.getLeft()
            int r6 = r6 + r5
            android.view.View r7 = r1.f70575o
            int r7 = r7.getTop()
            int r8 = com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70539h
            int r8 = r8 * r5
            int r7 = r7 + r8
            r1.mo54687b(r6, r7, r5, r4)
            goto L_0x016e
        L_0x015b:
            com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70535d = r3
            android.view.View r6 = r1.f70575o
            int r6 = r6.getLeft()
            int r6 = r6 + r5
            android.view.View r7 = r1.f70575o
            int r7 = r7.getTop()
            int r7 = r7 + r4
            r1.mo54687b(r6, r7, r5, r4)
        L_0x016e:
            r1.mo54678a(r15)
            goto L_0x01e1
        L_0x0172:
            int r4 = r15.getPointerCount()
            r5 = 0
        L_0x0177:
            if (r5 >= r4) goto L_0x01b3
            int r6 = r15.getPointerId(r5)
            boolean r7 = r1.mo54689c(r6)
            if (r7 == 0) goto L_0x01b0
            float r7 = r15.getX(r5)
            float r8 = r15.getY(r5)
            float[] r9 = r1.f70564d
            r9 = r9[r6]
            float r9 = r7 - r9
            float[] r10 = r1.f70565e
            r10 = r10[r6]
            float r10 = r8 - r10
            r1.mo54685b(r9, r10, r6)
            int r11 = r1.f70561a
            if (r11 == r2) goto L_0x01b3
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r1.mo54673a(r7, r8)
            boolean r8 = r1.mo54681a(r7, r9, r10)
            if (r8 == 0) goto L_0x01b0
            boolean r6 = r1.mo54688b(r7, r6)
            if (r6 != 0) goto L_0x01b3
        L_0x01b0:
            int r5 = r5 + 1
            goto L_0x0177
        L_0x01b3:
            r1.mo54678a(r15)
            goto L_0x01e1
        L_0x01b7:
            int r4 = r1.f70561a
            if (r4 != r2) goto L_0x01be
            r1.mo54684b()
        L_0x01be:
            r1.mo54674a()
            goto L_0x01e1
        L_0x01c2:
            float r4 = r15.getX()
            float r5 = r15.getY()
            int r6 = r15.getPointerId(r0)
            int r7 = (int) r4
            int r8 = (int) r5
            android.view.View r7 = r1.mo54673a(r7, r8)
            r1.mo54676a(r4, r5, r6)
            r1.mo54688b(r7, r6)
            int[] r4 = r1.f70568h
            r4 = r4[r6]
            int r1 = r1.f70572l
            r1 = r1 & r4
        L_0x01e1:
            if (r13 != 0) goto L_0x01e6
            r12.m64361a()
        L_0x01e6:
            android.view.VelocityTracker r1 = r12.f70044v
            if (r1 != 0) goto L_0x01f0
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r12.f70044v = r1
        L_0x01f0:
            android.view.VelocityTracker r1 = r12.f70044v
            r1.addMovement(r15)
            if (r13 != r3) goto L_0x021d
            boolean r13 = r12.f70041s
            if (r13 != 0) goto L_0x021d
            int r13 = r12.f70045w
            float r13 = (float) r13
            float r1 = r15.getY()
            float r13 = r13 - r1
            float r13 = java.lang.Math.abs(r13)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d r1 = r12.f70029g
            int r1 = r1.f70562b
            float r1 = (float) r1
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 <= 0) goto L_0x021d
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d r13 = r12.f70029g
            int r1 = r15.getActionIndex()
            int r15 = r15.getPointerId(r1)
            r13.mo54679a(r14, r15)
        L_0x021d:
            boolean r13 = r12.f70041s
            if (r13 != 0) goto L_0x0222
            return r2
        L_0x0222:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.mo1171a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final boolean mo935a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f70042t = 0;
        this.f70043u = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1298a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f70032j.get() && (this.f70028f != 3 || super.mo1298a(coordinatorLayout, v, view, f, f2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo54340a(View view, float f, float f2) {
        if (C26779b.f70534c) {
            return m64363b(view, f, f2);
        }
        return m64362a(view, f);
    }

    public AdPopUpWebBottomSheetBehavior() {
    }

    /* renamed from: a */
    private void m64361a() {
        this.f70034l = -1;
        if (this.f70044v != null) {
            this.f70044v.recycle();
            this.f70044v = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo54342c(int i) {
        if (this.f70028f != i) {
            this.f70028f = i;
            View view = (View) this.f70031i.get();
            if (!(view == null || this.f70033k == null)) {
                this.f70033k.mo54357a(view, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo54343d(int i) {
        View view = (View) this.f70031i.get();
        if (!(view == null || this.f70033k == null)) {
            if (i > this.f70025c) {
                this.f70033k.mo54356a(view, ((float) (this.f70025c - i)) / ((float) (this.f70030h - this.f70025c)));
                return;
            }
            this.f70033k.mo54356a(view, ((float) (this.f70025c - i)) / ((float) (this.f70025c - this.f70024b)));
        }
    }

    /* renamed from: a */
    private View m64360a(View view) {
        if (view == null) {
            return null;
        }
        if (this.f70046x) {
            return (View) this.f70032j.get();
        }
        if (C1056u.m3078x(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            return m64360a(C23583a.m57813a((ViewPager) view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View a = m64360a(viewGroup.getChildAt(i));
                    if (a != null) {
                        return a;
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
    public final void mo54338a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f70040r
            if (r4 != 0) goto L_0x0015
            r3.f70040r = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f70040r
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f70039q
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f70040r = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f70039q = r1
            int r1 = r3.f70030h
            int r1 = r1 - r4
            r3.f70025c = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003c
            int r4 = r3.f70028f
            r0 = 4
            if (r4 != r0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f70031i
            if (r4 == 0) goto L_0x003c
            java.lang.ref.WeakReference<V> r4 = r3.f70031i
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003c
            r4.requestLayout()
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.mo54338a(int):void");
    }

    /* renamed from: b */
    public final void mo54341b(final int i) {
        if (i != this.f70028f) {
            if (this.f70031i == null) {
                if (i == 4 || i == 3 || (this.f70026d && i == 5)) {
                    this.f70028f = i;
                }
                return;
            }
            final View view = (View) this.f70031i.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !C1056u.m3018B(view)) {
                    mo54339a(view, i);
                } else {
                    view.post(new Runnable() {
                        public final void run() {
                            AdPopUpWebBottomSheetBehavior.this.mo54339a(view, i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public final Parcelable mo1215b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo1215b(coordinatorLayout, v), this.f70028f);
    }

    /* renamed from: a */
    private boolean m64362a(View view, float f) {
        if (this.f70027e) {
            return true;
        }
        if (view.getTop() >= this.f70025c && Math.abs((((float) view.getTop()) + (f * 0.3f)) - ((float) this.f70025c)) / ((float) this.f70039q) > 0.1f) {
            return true;
        }
        return false;
    }

    public AdPopUpWebBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.c7, R.attr.c8, R.attr.c_, R.attr.ca});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo54338a(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo54338a(peekValue.data);
        }
        this.f70026d = obtainStyledAttributes.getBoolean(1, false);
        this.f70027e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f70038p = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo54339a(View view, int i) {
        int i2;
        boolean z = this.f70036n;
        if (i == 4) {
            i2 = this.f70025c;
            z = false;
        } else if (i == 3) {
            i2 = this.f70024b;
        } else if (!this.f70026d || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f70030h;
        }
        if (this.f70029g.mo54683a(view, view.getLeft(), i2, z)) {
            mo54342c(2);
            C1056u.m3034a(view, (Runnable) new C26606b(view, i));
            return;
        }
        mo54342c(i);
    }

    /* renamed from: a */
    public final void mo1206a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo1206a(coordinatorLayout, v, savedState.f3119e);
        if (savedState.f70052a == 1 || savedState.f70052a == 2) {
            this.f70028f = 4;
        } else {
            this.f70028f = savedState.f70052a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        r3 = true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m64363b(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            boolean r0 = r5.f70027e
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r6.getTop()
            int r2 = r5.f70025c
            r3 = 0
            if (r0 >= r2) goto L_0x0010
            return r3
        L_0x0010:
            int r0 = r6.getTop()
            float r0 = (float) r0
            r2 = 1050253722(0x3e99999a, float:0.3)
            float r4 = r7 * r2
            float r0 = r0 + r4
            int r6 = r6.getTop()
            float r6 = (float) r6
            float r2 = r2 * r8
            float r6 = r6 + r2
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70533b
            if (r2 == 0) goto L_0x0038
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.m64714a(r8, r7)
            if (r2 == 0) goto L_0x0038
            android.webkit.WebView r6 = r5.f70037o
            if (r6 != 0) goto L_0x0032
            return r3
        L_0x0032:
            android.webkit.WebView r6 = r5.f70037o
            r6.goBack()
            return r3
        L_0x0038:
            float r2 = java.lang.Math.abs(r7)
            r4 = 1036831949(0x3dcccccd, float:0.1)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0055
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70533b
            if (r2 != 0) goto L_0x0055
            int r7 = r5.f70025c
            float r7 = (float) r7
            float r6 = r6 - r7
            int r7 = r5.f70039q
            float r7 = (float) r7
            float r6 = r6 / r7
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x006a
        L_0x0053:
            r3 = 1
            goto L_0x006a
        L_0x0055:
            float r6 = java.lang.Math.abs(r8)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x006a
            int r6 = r5.f70025c
            float r6 = (float) r6
            float r0 = r0 - r6
            int r6 = r5.f70039q
            float r6 = (float) r6
            float r0 = r0 / r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x006a
            goto L_0x0053
        L_0x006a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.m64363b(android.view.View, float, float):boolean");
    }

    /* renamed from: c */
    public final void mo1374c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f70024b) {
            mo54342c(3);
        } else if (this.f70032j != null && view == this.f70032j.get() && this.f70043u) {
            if (this.f70042t > 0) {
                i = this.f70024b;
            } else {
                if (this.f70026d) {
                    this.f70044v.computeCurrentVelocity(1000, this.f70038p);
                    float yVelocity = this.f70044v.getYVelocity(this.f70034l);
                    this.f70044v.computeCurrentVelocity(1000, this.f70038p);
                    if (mo54340a((View) v, yVelocity, this.f70044v.getXVelocity(this.f70034l))) {
                        i = this.f70030h;
                        i2 = 5;
                    }
                }
                if (this.f70042t == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f70024b) < Math.abs(top - this.f70025c)) {
                        i = this.f70024b;
                    } else {
                        i = this.f70025c;
                    }
                } else {
                    i = this.f70025c;
                }
                i2 = 4;
            }
            if (this.f70029g.mo54682a((View) v, v.getLeft(), i)) {
                mo54342c(2);
                C1056u.m3034a((View) v, (Runnable) new C26606b(v, i2));
            } else {
                mo54342c(i2);
            }
            this.f70043u = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e8, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01eb, code lost:
        if (r6.f70561a != 1) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ed, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ef, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f0, code lost:
        if (r0 == false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016c, code lost:
        if (r1 == r4) goto L_0x016e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1255b(android.support.design.widget.CoordinatorLayout r22, V r23, android.view.MotionEvent r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            boolean r3 = r23.isShown()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0011
            r0.f70041s = r5
            return r4
        L_0x0011:
            int r3 = r24.getActionMasked()
            if (r3 != 0) goto L_0x001a
            r21.m64361a()
        L_0x001a:
            android.view.VelocityTracker r6 = r0.f70044v
            if (r6 != 0) goto L_0x0024
            android.view.VelocityTracker r6 = android.view.VelocityTracker.obtain()
            r0.f70044v = r6
        L_0x0024:
            android.view.VelocityTracker r6 = r0.f70044v
            r6.addMovement(r2)
            r6 = 3
            r7 = -1
            if (r3 == r6) goto L_0x0075
            switch(r3) {
                case 0: goto L_0x0031;
                case 1: goto L_0x0075;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0080
        L_0x0031:
            float r6 = r24.getX()
            int r6 = (int) r6
            float r8 = r24.getY()
            int r8 = (int) r8
            r0.f70045w = r8
            java.lang.ref.WeakReference<android.view.View> r8 = r0.f70032j
            if (r8 == 0) goto L_0x004a
            java.lang.ref.WeakReference<android.view.View> r8 = r0.f70032j
            java.lang.Object r8 = r8.get()
            android.view.View r8 = (android.view.View) r8
            goto L_0x004b
        L_0x004a:
            r8 = 0
        L_0x004b:
            if (r8 == 0) goto L_0x0061
            int r9 = r0.f70045w
            boolean r8 = r1.mo1329a(r8, r6, r9)
            if (r8 == 0) goto L_0x0061
            int r8 = r24.getActionIndex()
            int r8 = r2.getPointerId(r8)
            r0.f70034l = r8
            r0.f70035m = r5
        L_0x0061:
            int r8 = r0.f70034l
            if (r8 != r7) goto L_0x0071
            int r7 = r0.f70045w
            r8 = r23
            boolean r6 = r1.mo1329a(r8, r6, r7)
            if (r6 != 0) goto L_0x0071
            r6 = 1
            goto L_0x0072
        L_0x0071:
            r6 = 0
        L_0x0072:
            r0.f70041s = r6
            goto L_0x0080
        L_0x0075:
            r0.f70035m = r4
            r0.f70034l = r7
            boolean r6 = r0.f70041s
            if (r6 == 0) goto L_0x0080
            r0.f70041s = r4
            return r4
        L_0x0080:
            boolean r6 = r0.f70041s
            r7 = 2
            if (r6 != 0) goto L_0x01f3
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d r6 = r0.f70029g
            int r8 = r24.getActionMasked()
            int r9 = r24.getActionIndex()
            if (r8 != 0) goto L_0x0094
            r6.mo54674a()
        L_0x0094:
            android.view.VelocityTracker r10 = r6.f70569i
            if (r10 != 0) goto L_0x009e
            android.view.VelocityTracker r10 = android.view.VelocityTracker.obtain()
            r6.f70569i = r10
        L_0x009e:
            android.view.VelocityTracker r10 = r6.f70569i
            r10.addMovement(r2)
            switch(r8) {
                case 0: goto L_0x01bf;
                case 1: goto L_0x01b9;
                case 2: goto L_0x00d7;
                case 3: goto L_0x01b9;
                case 4: goto L_0x00a6;
                case 5: goto L_0x00b2;
                case 6: goto L_0x00aa;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            r19 = r3
            goto L_0x01e8
        L_0x00aa:
            int r8 = r2.getPointerId(r9)
            r6.mo54677a(r8)
            goto L_0x00a6
        L_0x00b2:
            int r8 = r2.getPointerId(r9)
            float r10 = r2.getX(r9)
            float r9 = r2.getY(r9)
            r6.mo54676a(r10, r9, r8)
            int r11 = r6.f70561a
            if (r11 == 0) goto L_0x00a6
            int r11 = r6.f70561a
            if (r11 != r7) goto L_0x00a6
            int r10 = (int) r10
            int r9 = (int) r9
            android.view.View r9 = r6.mo54673a(r10, r9)
            android.view.View r10 = r6.f70575o
            if (r9 != r10) goto L_0x00a6
            r6.mo54688b(r9, r8)
            goto L_0x00a6
        L_0x00d7:
            float[] r8 = r6.f70564d
            if (r8 == 0) goto L_0x00a6
            float[] r8 = r6.f70565e
            if (r8 == 0) goto L_0x00a6
            int r8 = r24.getPointerCount()
            r9 = 0
        L_0x00e4:
            if (r9 >= r8) goto L_0x01b3
            int r10 = r2.getPointerId(r9)
            boolean r11 = r6.mo54689c(r10)
            if (r11 == 0) goto L_0x01a0
            float r11 = r2.getX(r9)
            float r12 = r2.getY(r9)
            float[] r13 = r6.f70564d
            r13 = r13[r10]
            float r13 = r11 - r13
            float[] r14 = r6.f70565e
            r14 = r14[r10]
            float r14 = r12 - r14
            float[] r15 = r6.f70566f
            r15 = r15[r10]
            float r15 = r11 - r15
            float[] r7 = r6.f70567g
            r7 = r7[r10]
            float r7 = r12 - r7
            int r11 = (int) r11
            int r12 = (int) r12
            android.view.View r11 = r6.mo54673a(r11, r12)
            if (r11 == 0) goto L_0x0120
            boolean r12 = r6.mo54681a(r11, r13, r14)
            if (r12 == 0) goto L_0x0120
            r12 = 1
            goto L_0x0121
        L_0x0120:
            r12 = 0
        L_0x0121:
            if (r12 == 0) goto L_0x0175
            int r4 = r11.getLeft()
            int r5 = (int) r13
            r18 = r8
            int r8 = r4 + r5
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d$a r1 = r6.f70574n
            int r1 = r1.mo54352b(r11, r8, r5)
            int r5 = r11.getTop()
            int r8 = (int) r14
            r19 = r3
            int r3 = r5 + r8
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d$a r0 = r6.f70574n
            int r0 = r0.mo54346a(r11, r3, r8)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d$a r3 = r6.f70574n
            int r3 = r3.mo54351b(r11)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d$a r8 = r6.f70574n
            int r8 = r8.mo54345a(r11)
            boolean r20 = com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70534c
            if (r20 == 0) goto L_0x0160
            float r20 = java.lang.Math.abs(r14)
            int r20 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r20 <= 0) goto L_0x0160
            r17 = 1
            com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70540i = r17
            r20 = 1
            goto L_0x0166
        L_0x0160:
            r16 = 0
            com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70540i = r16
            r20 = 0
        L_0x0166:
            if (r20 != 0) goto L_0x0179
            if (r3 == 0) goto L_0x016e
            if (r3 <= 0) goto L_0x0179
            if (r1 != r4) goto L_0x0179
        L_0x016e:
            if (r8 == 0) goto L_0x01b5
            if (r8 <= 0) goto L_0x0179
            if (r0 == r5) goto L_0x01b5
            goto L_0x0179
        L_0x0175:
            r19 = r3
            r18 = r8
        L_0x0179:
            r6.mo54685b(r13, r14, r10)
            int r0 = r6.f70561a
            r1 = 1
            if (r0 == r1) goto L_0x01b5
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer$c r0 = com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer.f70456k
            float r0 = java.lang.Math.abs(r7)
            float r1 = java.lang.Math.abs(r15)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0194
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer.C26746c.m64664a()
            goto L_0x0195
        L_0x0194:
            r5 = 1
        L_0x0195:
            if (r5 == 0) goto L_0x01b5
            if (r12 == 0) goto L_0x01a4
            boolean r0 = r6.mo54688b(r11, r10)
            if (r0 != 0) goto L_0x01b5
            goto L_0x01a4
        L_0x01a0:
            r19 = r3
            r18 = r8
        L_0x01a4:
            int r9 = r9 + 1
            r8 = r18
            r3 = r19
            r0 = r21
            r1 = r22
            r4 = 0
            r5 = 1
            r7 = 2
            goto L_0x00e4
        L_0x01b3:
            r19 = r3
        L_0x01b5:
            r6.mo54678a(r2)
            goto L_0x01e8
        L_0x01b9:
            r19 = r3
            r6.mo54674a()
            goto L_0x01e8
        L_0x01bf:
            r19 = r3
            float r0 = r24.getX()
            float r1 = r24.getY()
            r3 = 0
            int r4 = r2.getPointerId(r3)
            r6.mo54676a(r0, r1, r4)
            int r0 = (int) r0
            int r1 = (int) r1
            android.view.View r0 = r6.mo54673a(r0, r1)
            android.view.View r1 = r6.f70575o
            if (r0 != r1) goto L_0x01e3
            int r1 = r6.f70561a
            r3 = 2
            if (r1 != r3) goto L_0x01e3
            r6.mo54688b(r0, r4)
        L_0x01e3:
            r0 = 0
            com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70540i = r0
            com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26779b.f70536e = r0
        L_0x01e8:
            int r0 = r6.f70561a
            r1 = 1
            if (r0 != r1) goto L_0x01ef
            r0 = 1
            goto L_0x01f0
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            if (r0 == 0) goto L_0x01f6
            return r1
        L_0x01f3:
            r19 = r3
            r1 = 1
        L_0x01f6:
            r0 = r21
            java.lang.ref.WeakReference<android.view.View> r3 = r0.f70032j
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            r4 = r19
            r5 = 2
            if (r4 != r5) goto L_0x0238
            if (r3 == 0) goto L_0x0238
            boolean r4 = r0.f70041s
            if (r4 != 0) goto L_0x0238
            int r4 = r0.f70028f
            if (r4 == r1) goto L_0x0238
            float r1 = r24.getX()
            int r1 = (int) r1
            float r4 = r24.getY()
            int r4 = (int) r4
            r5 = r22
            boolean r1 = r5.mo1329a(r3, r1, r4)
            if (r1 != 0) goto L_0x0238
            int r1 = r0.f70045w
            float r1 = (float) r1
            float r2 = r24.getY()
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.d r2 = r0.f70029g
            int r2 = r2.f70562b
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0238
            r1 = 1
            return r1
        L_0x0238:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.mo1255b(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final boolean mo934a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        if (C1056u.m3073s(coordinatorLayout) && !C1056u.m3073s(v)) {
            C1056u.m3045b((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.mo1325a((View) v, i);
        this.f70030h = coordinatorLayout.getHeight();
        if (this.f70040r) {
            if (this.f70023a == 0) {
                this.f70023a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.fz);
            }
            i2 = Math.max(this.f70023a, this.f70030h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f70039q;
        }
        this.f70024b = Math.max(0, this.f70030h - v.getHeight());
        this.f70025c = Math.max(this.f70030h - i2, this.f70024b);
        if (this.f70028f == 3) {
            C1056u.m3058g(v, this.f70024b);
        } else if (this.f70026d && this.f70028f == 5) {
            C1056u.m3058g(v, this.f70030h);
        } else if (this.f70028f == 4) {
            C1056u.m3058g(v, this.f70025c);
        } else if (this.f70028f == 1 || this.f70028f == 2) {
            C1056u.m3058g(v, top - v.getTop());
        }
        if (this.f70029g == null) {
            this.f70029g = new C26782d(coordinatorLayout.getContext(), coordinatorLayout, this.f70047y);
        }
        this.f70031i = new WeakReference<>(v);
        this.f70032j = new WeakReference<>(m64360a((View) v));
        return true;
    }

    /* renamed from: a */
    public final void mo1372a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f70032j.get())) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                if (i3 < this.f70024b) {
                    iArr[1] = top - this.f70024b;
                    C1056u.m3058g(v, -iArr[1]);
                    mo54342c(3);
                } else {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo54342c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                if (i3 <= this.f70025c || this.f70026d) {
                    iArr[1] = i2;
                    C1056u.m3058g(v, -i2);
                    mo54342c(1);
                } else {
                    iArr[1] = top - this.f70025c;
                    C1056u.m3058g(v, -iArr[1]);
                    mo54342c(4);
                }
            }
            mo54343d(v.getTop());
            this.f70042t = i2;
            this.f70043u = true;
        }
    }
}
