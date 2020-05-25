package com.p683ss.android.ugc.aweme.homepage.p1801ui.p1802a;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23641a;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C32969a;
import com.p683ss.android.ugc.aweme.optimize.PerformanceAB;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.a.b */
public final class C32994b extends C23641a {

    /* renamed from: a */
    private ScrollSwitchStateManager f85713a;

    /* renamed from: c */
    private boolean f85714c;

    /* renamed from: d */
    private final FragmentActivity f85715d;

    /* renamed from: a */
    private ScrollSwitchStateManager m75930a() {
        if (this.f85713a == null) {
            this.f85713a = C32969a.m75907a(this.f85715d);
            this.f85714c = C10181b.m20511a().mo18172a(PerformanceAB.class, true, "is_performance_poor", 31744, true);
            return this.f85713a;
        } else if (this.f85714c) {
            return this.f85713a;
        } else {
            return C32969a.m75907a(this.f85715d);
        }
    }

    public C32994b(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f85715d = fragmentActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a4 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49061a(int r7) {
        /*
            r6 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r7 != r0) goto L_0x002d
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r3 = r6.m75930a()
            if (r3 != 0) goto L_0x000e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x000e:
            java.lang.String r4 = "page_feed"
            boolean r3 = r3.mo69868b(r4)
            if (r3 == 0) goto L_0x002d
            android.support.v4.app.FragmentActivity r3 = r6.f85715d
            com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r3 = com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C32964a.m75869a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f85656j
            if (r3 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            if (r3 == 0) goto L_0x002d
            return r2
        L_0x002d:
            if (r7 != r0) goto L_0x0070
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r3 = r6.m75930a()
            if (r3 != 0) goto L_0x0038
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0038:
            java.lang.String r4 = "page_feed"
            boolean r3 = r3.mo69868b(r4)
            if (r3 == 0) goto L_0x0070
            android.support.v4.app.FragmentActivity r3 = r6.f85715d
            com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r3 = com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C32964a.m75869a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f85656j
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r4 = r6.m75930a()
            if (r4 != 0) goto L_0x0051
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0051:
            java.lang.String r5 = "page_feed"
            boolean r4 = r4.mo69868b(r5)
            if (r4 == 0) goto L_0x006c
            boolean r3 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72814b(r3)
            if (r3 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.ao r3 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            int r3 = r3.mo47241b()
            r4 = 3
            if (r3 != r4) goto L_0x006c
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            if (r3 == 0) goto L_0x0070
            return r2
        L_0x0070:
            java.lang.String r3 = "HOME"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r4 = r6.m75930a()
            if (r4 != 0) goto L_0x007d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x007d:
            java.lang.String r4 = r4.f85674g
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x00a0
            if (r7 != r0) goto L_0x00a0
            com.ss.android.ugc.aweme.antiaddic.lock.b r7 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            java.lang.String r0 = "LegacyServiceUtils.getTimeLockRulerService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            boolean r7 = r7.mo47103a()
            if (r7 != 0) goto L_0x009e
            boolean r7 = com.p683ss.android.ugc.aweme.main.C36553cd.m82450f()
            if (r7 == 0) goto L_0x00a0
        L_0x009e:
            r7 = 1
            goto L_0x00a1
        L_0x00a0:
            r7 = 0
        L_0x00a1:
            if (r7 != 0) goto L_0x00a4
            return r1
        L_0x00a4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.homepage.p1801ui.p1802a.C32994b.mo49061a(int):boolean");
    }
}
