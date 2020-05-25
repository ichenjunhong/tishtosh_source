package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import com.p683ss.android.ugc.aweme.p1807im.disableim.C33192c;
import com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16Manger;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceHelperImpl */
public final class MainServiceHelperImpl implements IMainServiceHelper {
    public static IMainServiceHelper provideIMainServiceHelper_Monster() {
        if (C27991b.f73525u == null) {
            synchronized (IMainServiceHelper.class) {
                if (C27991b.f73525u == null) {
                    C27991b.f73525u = C27628bo.m66321p();
                }
            }
        }
        return (IMainServiceHelper) C27991b.f73525u;
    }

    public final void goToTipsPage() {
        C33192c.m76259a();
    }

    public final boolean isChatFunOfflineUnder16() {
        return ImUnder16Manger.m76250c();
    }

    public final boolean shouldHideYellowDot() {
        return ImUnder16Manger.m76251d();
    }

    public final boolean shouldRedictToTipsPage() {
        return ImUnder16Manger.m76252e();
    }
}
