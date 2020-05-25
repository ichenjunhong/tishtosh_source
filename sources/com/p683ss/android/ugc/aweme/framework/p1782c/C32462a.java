package com.p683ss.android.ugc.aweme.framework.p1782c;

import android.content.Context;
import com.p683ss.android.ugc.aweme.utils.C47810dh;
import com.p683ss.android.ugc.aweme.utils.C47810dh.C47811a;

/* renamed from: com.ss.android.ugc.aweme.framework.c.a */
public final class C32462a {

    /* renamed from: a */
    public static C47811a f84536a;

    /* renamed from: a */
    public static boolean m75159a(Context context) {
        if (f84536a == null || f84536a == C47811a.NONE) {
            f84536a = C47810dh.m103452b(context);
        }
        if (f84536a == C47811a.WIFI) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m75160b(Context context) {
        C47811a aVar;
        if (f84536a == null || f84536a == C47811a.NONE) {
            aVar = C47810dh.m103452b(context);
        } else {
            aVar = f84536a;
        }
        if (C47811a.MOBILE_2G == aVar || C47811a.MOBILE_3G == aVar || C47811a.MOBILE_4G == aVar || C47811a.MOBILE == aVar) {
            return true;
        }
        return false;
    }
}
