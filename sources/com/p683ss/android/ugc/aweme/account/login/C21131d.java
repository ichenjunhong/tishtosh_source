package com.p683ss.android.ugc.aweme.account.login;

import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C1000h;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.account.login.d */
public final class C21131d {

    /* renamed from: com.ss.android.ugc.aweme.account.login.d$a */
    static class C21133a extends C1000h {

        /* renamed from: a */
        private final ViewPager f57403a;

        /* renamed from: b */
        private final ViewPagerBottomSheetBehavior<View> f57404b;

        public final void onPageSelected(int i) {
            ViewPager viewPager = this.f57403a;
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.f57404b;
            viewPagerBottomSheetBehavior.getClass();
            viewPager.post(new C21139e(viewPagerBottomSheetBehavior));
        }

        private C21133a(ViewPager viewPager, View view) {
            this.f57403a = viewPager;
            this.f57404b = ViewPagerBottomSheetBehavior.m53462b(view);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.support.v4.view.ViewPager] */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.support.v4.view.ViewPager, code=null, for r4v0, types: [android.support.v4.view.ViewPager] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v5
      assigns: []
      uses: []
      mth insns count: 24
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
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m53617a(android.support.p030v4.view.ViewPager r4) {
        /*
            r0 = r4
        L_0x0001:
            r1 = 0
            if (r0 == 0) goto L_0x0025
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            boolean r3 = r2 instanceof android.support.design.widget.CoordinatorLayout.C0505d
            if (r3 == 0) goto L_0x0015
            android.support.design.widget.CoordinatorLayout$d r2 = (android.support.design.widget.CoordinatorLayout.C0505d) r2
            android.support.design.widget.CoordinatorLayout$Behavior r2 = r2.f1693a
            boolean r2 = r2 instanceof com.p683ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior
            if (r2 == 0) goto L_0x0015
            goto L_0x0026
        L_0x0015:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0 instanceof android.view.View
            if (r2 != 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            android.view.View r0 = (android.view.View) r0
            goto L_0x0001
        L_0x0023:
            r0 = r1
            goto L_0x0001
        L_0x0025:
            r0 = r1
        L_0x0026:
            if (r0 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.account.login.d$a r2 = new com.ss.android.ugc.aweme.account.login.d$a
            r2.<init>(r4, r0)
            r4.addOnPageChangeListener(r2)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.C21131d.m53617a(android.support.v4.view.ViewPager):void");
    }
}
