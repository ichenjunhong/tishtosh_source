package com.p683ss.android.ugc.aweme.p1308ad;

import android.os.Build.VERSION;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.p1308ad.services.IDouPlusService;
import com.p683ss.android.ugc.aweme.p1308ad.settings.DouPlusFullProcessConfig;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.DouPlusServiceImpl */
public final class DouPlusServiceImpl implements IDouPlusService {
    public final String appendDeviceIdForLocalTest(String str) {
        C52711k.m112240b(str, "url");
        return str;
    }

    public static IDouPlusService createIDouPlusServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IDouPlusService.class);
        if (a != null) {
            return (IDouPlusService) a;
        }
        return new DouPlusServiceImpl();
    }

    public final boolean enableDouPlusFullProcessMonitor() {
        if (!DouPlusFullProcessConfig.isOpen() || VERSION.SDK_INT < 21 || VERSION.SDK_INT > 28) {
            return false;
        }
        return true;
    }
}
