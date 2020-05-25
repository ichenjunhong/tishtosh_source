package android.support.p019b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p019b.C0296m.C0302c;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.b.aj */
public abstract class C0251aj extends C0296m {

    /* renamed from: a */
    private static final String[] f612a = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: p */
    public int f613p = 3;

    /* renamed from: android.support.b.aj$a */
    static class C0253a extends AnimatorListenerAdapter implements C0238a, C0302c {

        /* renamed from: a */
        boolean f617a;

        /* renamed from: b */
        private final View f618b;

        /* renamed from: c */
        private final int f619c;

        /* renamed from: d */
        private final ViewGroup f620d;

        /* renamed from: e */
        private final boolean f621e = true;

        /* renamed from: f */
        private boolean f622f;

        /* renamed from: d */
        public final void mo533d(C0296m mVar) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        private void m527a() {
            if (!this.f617a) {
                C0244ae.m500a(this.f618b, this.f619c);
                if (this.f620d != null) {
                    this.f620d.invalidate();
                }
            }
            m528a(false);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f617a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            m527a();
        }

        /* renamed from: a */
        public final void mo530a(C0296m mVar) {
            m527a();
            mVar.mo602b((C0302c) this);
        }

        /* renamed from: b */
        public final void mo531b(C0296m mVar) {
            m528a(false);
        }

        /* renamed from: c */
        public final void mo532c(C0296m mVar) {
            m528a(true);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f617a) {
                C0244ae.m500a(this.f618b, this.f619c);
            }
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f617a) {
                C0244ae.m500a(this.f618b, 0);
            }
        }

        /* renamed from: a */
        private void m528a(boolean z) {
            if (this.f621e && this.f622f != z && this.f620d != null) {
                this.f622f = z;
                C0319y.m693a(this.f620d, z);
            }
        }

        C0253a(View view, int i, boolean z) {
            this.f618b = view;
            this.f619c = i;
            this.f620d = (ViewGroup) view.getParent();
            m528a(true);
        }
    }

    /* renamed from: android.support.b.aj$b */
    static class C0254b {

        /* renamed from: a */
        boolean f623a;

        /* renamed from: b */
        boolean f624b;

        /* renamed from: c */
        int f625c;

        /* renamed from: d */
        int f626d;

        /* renamed from: e */
        ViewGroup f627e;

        /* renamed from: f */
        ViewGroup f628f;

        C0254b() {
        }
    }

    /* renamed from: a */
    public Animator mo523a(ViewGroup viewGroup, View view, C0312s sVar, C0312s sVar2) {
        return null;
    }

    /* renamed from: b */
    public Animator mo527b(ViewGroup viewGroup, View view, C0312s sVar, C0312s sVar2) {
        return null;
    }

    /* renamed from: a */
    public final String[] mo526a() {
        return f612a;
    }

    /* renamed from: a */
    public void mo524a(C0312s sVar) {
        m519d(sVar);
    }

    /* renamed from: b */
    public void mo528b(C0312s sVar) {
        m519d(sVar);
    }

    /* renamed from: d */
    private static void m519d(C0312s sVar) {
        sVar.f770a.put("android:visibility:visibility", Integer.valueOf(sVar.f771b.getVisibility()));
        sVar.f770a.put("android:visibility:parent", sVar.f771b.getParent());
        int[] iArr = new int[2];
        sVar.f771b.getLocationOnScreen(iArr);
        sVar.f770a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public final boolean mo525a(C0312s sVar, C0312s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f770a.containsKey("android:visibility:visibility") != sVar.f770a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0254b b = m518b(sVar, sVar2);
        if (!b.f623a || (b.f625c != 0 && b.f626d != 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static C0254b m518b(C0312s sVar, C0312s sVar2) {
        C0254b bVar = new C0254b();
        bVar.f623a = false;
        bVar.f624b = false;
        if (sVar == null || !sVar.f770a.containsKey("android:visibility:visibility")) {
            bVar.f625c = -1;
            bVar.f627e = null;
        } else {
            bVar.f625c = ((Integer) sVar.f770a.get("android:visibility:visibility")).intValue();
            bVar.f627e = (ViewGroup) sVar.f770a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f770a.containsKey("android:visibility:visibility")) {
            bVar.f626d = -1;
            bVar.f628f = null;
        } else {
            bVar.f626d = ((Integer) sVar2.f770a.get("android:visibility:visibility")).intValue();
            bVar.f628f = (ViewGroup) sVar2.f770a.get("android:visibility:parent");
        }
        if (sVar == null || sVar2 == null) {
            if (sVar == null && bVar.f626d == 0) {
                bVar.f624b = true;
                bVar.f623a = true;
            } else if (sVar2 == null && bVar.f625c == 0) {
                bVar.f624b = false;
                bVar.f623a = true;
            }
        } else if (bVar.f625c == bVar.f626d && bVar.f627e == bVar.f628f) {
            return bVar;
        } else {
            if (bVar.f625c != bVar.f626d) {
                if (bVar.f625c == 0) {
                    bVar.f624b = false;
                    bVar.f623a = true;
                } else if (bVar.f626d == 0) {
                    bVar.f624b = true;
                    bVar.f623a = true;
                }
            } else if (bVar.f628f == null) {
                bVar.f624b = false;
                bVar.f623a = true;
            } else if (bVar.f627e == null) {
                bVar.f624b = true;
                bVar.f623a = true;
            }
        }
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c4, code lost:
        if (r9.f729k != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0122  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo522a(android.view.ViewGroup r10, android.support.p019b.C0312s r11, android.support.p019b.C0312s r12) {
        /*
            r9 = this;
            android.support.b.aj$b r0 = m518b(r11, r12)
            boolean r1 = r0.f623a
            r2 = 0
            if (r1 == 0) goto L_0x0143
            android.view.ViewGroup r1 = r0.f627e
            if (r1 != 0) goto L_0x0011
            android.view.ViewGroup r1 = r0.f628f
            if (r1 == 0) goto L_0x0143
        L_0x0011:
            boolean r1 = r0.f624b
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0046
            int r1 = r0.f625c
            int r0 = r0.f626d
            int r0 = r9.f613p
            r0 = r0 & r4
            if (r0 != r4) goto L_0x0045
            if (r12 != 0) goto L_0x0023
            goto L_0x0045
        L_0x0023:
            if (r11 != 0) goto L_0x003e
            android.view.View r0 = r12.f771b
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.support.b.s r1 = r9.mo604b(r0, r3)
            android.support.b.s r0 = r9.mo590a(r0, r3)
            android.support.b.aj$b r0 = m518b(r1, r0)
            boolean r0 = r0.f623a
            if (r0 == 0) goto L_0x003e
            return r2
        L_0x003e:
            android.view.View r0 = r12.f771b
            android.animation.Animator r10 = r9.mo523a(r10, r0, r11, r12)
            return r10
        L_0x0045:
            return r2
        L_0x0046:
            int r1 = r0.f625c
            int r0 = r0.f626d
            int r1 = r9.f613p
            r5 = 2
            r1 = r1 & r5
            if (r1 != r5) goto L_0x0142
            if (r11 == 0) goto L_0x0055
            android.view.View r1 = r11.f771b
            goto L_0x0056
        L_0x0055:
            r1 = r2
        L_0x0056:
            if (r12 == 0) goto L_0x005b
            android.view.View r6 = r12.f771b
            goto L_0x005c
        L_0x005b:
            r6 = r2
        L_0x005c:
            if (r6 == 0) goto L_0x007e
            android.view.ViewParent r7 = r6.getParent()
            if (r7 != 0) goto L_0x0065
            goto L_0x007e
        L_0x0065:
            r7 = 4
            if (r0 != r7) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            if (r1 != r6) goto L_0x006e
        L_0x006b:
            r1 = r2
            goto L_0x00cb
        L_0x006e:
            boolean r6 = r9.f729k
            if (r6 == 0) goto L_0x0073
            goto L_0x008b
        L_0x0073:
            android.view.ViewParent r6 = r1.getParent()
            android.view.View r6 = (android.view.View) r6
            android.view.View r1 = android.support.p019b.C0311r.m683a(r10, r1, r6)
            goto L_0x0081
        L_0x007e:
            if (r6 == 0) goto L_0x0083
            r1 = r6
        L_0x0081:
            r6 = r2
            goto L_0x00cb
        L_0x0083:
            if (r1 == 0) goto L_0x00c9
            android.view.ViewParent r6 = r1.getParent()
            if (r6 != 0) goto L_0x008c
        L_0x008b:
            goto L_0x0081
        L_0x008c:
            android.view.ViewParent r6 = r1.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x00c9
            android.view.ViewParent r6 = r1.getParent()
            android.view.View r6 = (android.view.View) r6
            android.support.b.s r7 = r9.mo590a(r6, r4)
            android.support.b.s r8 = r9.mo604b(r6, r4)
            android.support.b.aj$b r7 = m518b(r7, r8)
            boolean r7 = r7.f623a
            if (r7 != 0) goto L_0x00af
            android.view.View r1 = android.support.p019b.C0311r.m683a(r10, r1, r6)
            goto L_0x0081
        L_0x00af:
            android.view.ViewParent r7 = r6.getParent()
            if (r7 != 0) goto L_0x00c7
            int r6 = r6.getId()
            r7 = -1
            if (r6 == r7) goto L_0x00c7
            android.view.View r6 = r10.findViewById(r6)
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r9.f729k
            if (r6 == 0) goto L_0x00c7
            goto L_0x0081
        L_0x00c7:
            r1 = r2
            goto L_0x0081
        L_0x00c9:
            r1 = r2
            r6 = r1
        L_0x00cb:
            if (r1 == 0) goto L_0x0120
            if (r11 == 0) goto L_0x0120
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.f770a
            java.lang.String r2 = "android:visibility:screenLocation"
            java.lang.Object r0 = r0.get(r2)
            int[] r0 = (int[]) r0
            r2 = r0[r3]
            r0 = r0[r4]
            int[] r5 = new int[r5]
            r10.getLocationOnScreen(r5)
            r3 = r5[r3]
            int r2 = r2 - r3
            int r3 = r1.getLeft()
            int r2 = r2 - r3
            r1.offsetLeftAndRight(r2)
            r2 = r5[r4]
            int r0 = r0 - r2
            int r2 = r1.getTop()
            int r0 = r0 - r2
            r1.offsetTopAndBottom(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r0 < r2) goto L_0x0104
            android.support.b.w r0 = new android.support.b.w
            r0.<init>(r10)
            goto L_0x010a
        L_0x0104:
            android.support.b.ab r0 = android.support.p019b.C0240ab.m489c(r10)
            android.support.b.v r0 = (android.support.p019b.C0316v) r0
        L_0x010a:
            r0.mo634a(r1)
            android.animation.Animator r10 = r9.mo527b(r10, r1, r11, r12)
            if (r10 != 0) goto L_0x0117
            r0.mo635b(r1)
            goto L_0x011f
        L_0x0117:
            android.support.b.aj$1 r11 = new android.support.b.aj$1
            r11.<init>(r0, r1)
            r10.addListener(r11)
        L_0x011f:
            return r10
        L_0x0120:
            if (r6 == 0) goto L_0x0142
            int r1 = r6.getVisibility()
            android.support.p019b.C0244ae.m500a(r6, r3)
            android.animation.Animator r10 = r9.mo527b(r10, r6, r11, r12)
            if (r10 == 0) goto L_0x013e
            android.support.b.aj$a r11 = new android.support.b.aj$a
            r11.<init>(r6, r0, r4)
            r10.addListener(r11)
            android.support.p019b.C0237a.m485a(r10, r11)
            r9.mo589a(r11)
            goto L_0x0141
        L_0x013e:
            android.support.p019b.C0244ae.m500a(r6, r1)
        L_0x0141:
            return r10
        L_0x0142:
            return r2
        L_0x0143:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p019b.C0251aj.mo522a(android.view.ViewGroup, android.support.b.s, android.support.b.s):android.animation.Animator");
    }
}
