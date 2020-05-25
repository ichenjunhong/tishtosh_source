package com.p683ss.android.ugc.aweme.setting;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.setting.C41528ai.C41529a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.InAppUpdateServiceImpl */
public final class InAppUpdateServiceImpl implements IInAppUpdatesService {
    public final void mobUpdateEvent(String str) {
        C52711k.m112240b(str, "event");
        C41529a.m91360a(str);
    }

    public final void checkForUpdate(Activity activity, boolean z) {
        C52711k.m112240b(activity, "activity");
        C41528ai.f105215g.mo85312a(activity, z, "");
    }
}
