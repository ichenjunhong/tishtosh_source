package com.p683ss.android.ugc.aweme.video.p2394c;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.framework.p1782c.C32462a;

/* renamed from: com.ss.android.ugc.aweme.video.c.a */
public final class C48003a {
    /* renamed from: b */
    public static boolean m103852b() {
        return ((Boolean) SharePrefCache.inst().getVideoPreload().mo47782d()).booleanValue();
    }

    /* renamed from: a */
    public static boolean m103851a() {
        if (!((Boolean) SharePrefCache.inst().getVideoPreload().mo47782d()).booleanValue() || (!C32462a.m75159a(C11010c.m22280a()) && ((Integer) SharePrefCache.inst().getWeakNetPreLoadSwitch().mo47782d()).intValue() != 1)) {
            return false;
        }
        return true;
    }
}
