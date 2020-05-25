package com.p683ss.android.ugc.aweme.main.homepageImpl;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30345n;
import com.p683ss.android.ugc.aweme.homepage.api.p1800ui.HomePageUIFrameService;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl */
public abstract class HomePageUIFrameServiceCommonImpl implements HomePageUIFrameService {
    public void setTitleTabVisibility(boolean z) {
        C47718bf.m103288a(new C30345n(z, 1));
    }

    public void runInTabHostRunnable(C11079a aVar) {
        C52711k.m112240b(aVar, "fragment");
        if (aVar.isViewValid()) {
            FragmentActivity activity = aVar.getActivity();
            if (activity != null) {
                ((MainActivity) activity).refreshSlideSwitchCanScrollRight();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getTagForCurrentTabInMainPageFragment(com.p683ss.android.ugc.aweme.main.TabChangeManager r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r3 = "manager"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            java.lang.String r3 = "NOTIFICATION"
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
            if (r3 != 0) goto L_0x0015
            java.lang.String r3 = "USER"
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
            if (r3 == 0) goto L_0x0026
        L_0x0015:
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r0 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
            boolean r3 = r3.isLogin()
            if (r3 != 0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            r0 = 0
            if (r3 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            java.lang.String r0 = r0.handleUnlogin(r2, r4)
            java.lang.String r2 = "ServiceManager.get().get…eUnlogin(manager, setTag)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
        L_0x0039:
            if (r3 == 0) goto L_0x003c
            return r0
        L_0x003c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl.getTagForCurrentTabInMainPageFragment(com.ss.android.ugc.aweme.main.TabChangeManager, java.lang.String, java.lang.String):java.lang.String");
    }
}
