package com.p683ss.android.ugc.aweme.antiaddic.lock;

import android.app.Activity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.antiaddic.C22692c;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.app.C23033au;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformServiceImpl */
public final class ParentalPlatformServiceImpl implements IParentalPlatformService {
    public final String getChildScheme() {
        return C22714d.m55952e();
    }

    public final C41686c getPushSettings() {
        return C22714d.m55950a();
    }

    public final C22687a getRole() {
        return C22714d.f60914a.mo47119b();
    }

    public final String getEntranceScheme() {
        String f = C22714d.m55953f();
        C52711k.m112236a((Object) f, "ParentalPlatformConfig.getEntranceScheme()");
        return f;
    }

    public final boolean showChatLockEntrance() {
        C22714d dVar = C22714d.f60914a;
        if (C22714d.m55950a() == null) {
            return true;
        }
        C41686c a = C22714d.m55950a();
        if (a == null || a.f105482Y != 1) {
            return false;
        }
        return true;
    }

    public final String getParentScheme() {
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf guardianParentScheme = inst.getGuardianParentScheme();
        C52711k.m112236a((Object) guardianParentScheme, "SharePrefCache.inst().guardianParentScheme");
        String str = (String) guardianParentScheme.mo47782d();
        if (str != null) {
            if (!(!TextUtils.isEmpty(str))) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return C23033au.m56550a();
    }

    public final void enterDigitalWellbeing(Activity activity) {
        ParentalPlatformManager.m55914a(activity);
    }

    public final void syncParentalData(C22692c cVar) {
        ParentalPlatformManager.m55915a(cVar);
    }

    public final C22687a getRole(C41686c cVar) {
        return C22714d.m55951b(cVar);
    }
}
