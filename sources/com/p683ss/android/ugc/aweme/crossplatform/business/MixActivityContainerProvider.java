package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.MainMixActivityContainer;
import com.p683ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider */
public class MixActivityContainerProvider implements IMixActivityContainerProvider {
    public static IMixActivityContainerProvider createIMixActivityContainerProviderbyMonsterPlugin() {
        Object a = C27991b.m66756a(IMixActivityContainerProvider.class);
        if (a != null) {
            return (IMixActivityContainerProvider) a;
        }
        if (C27991b.f73445aB == null) {
            synchronized (IMixActivityContainerProvider.class) {
                if (C27991b.f73445aB == null) {
                    C27991b.f73445aB = new MixActivityContainerProvider();
                }
            }
        }
        return (MixActivityContainerProvider) C27991b.f73445aB;
    }

    public MixActivityContainer createMixActivityContainer(Activity activity, C27182a aVar) {
        return new MainMixActivityContainer(activity, aVar);
    }
}
