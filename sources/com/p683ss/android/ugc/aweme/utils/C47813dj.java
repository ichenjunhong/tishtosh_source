package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43911c;

/* renamed from: com.ss.android.ugc.aweme.utils.dj */
public final class C47813dj {
    /* renamed from: a */
    public static boolean m103455a(Activity activity, boolean z, boolean z2, String str) {
        if (activity == null) {
            return false;
        }
        if (z) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C47816dk(activity));
            return true;
        } else if (!z2 || TextUtils.isEmpty(str)) {
            return false;
        } else {
            new C43911c().mo89467a(str, activity, "notification");
            return true;
        }
    }
}
