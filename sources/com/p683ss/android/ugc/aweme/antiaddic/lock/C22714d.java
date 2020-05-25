package com.p683ss.android.ugc.aweme.antiaddic.lock;

import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.app.C23033au;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.d */
public final class C22714d {

    /* renamed from: a */
    public static final C22714d f60914a = new C22714d();

    /* renamed from: b */
    private static final Keva f60915b;

    /* renamed from: c */
    private static C41686c f60916c;

    /* renamed from: d */
    private static C41686c f60917d;

    private C22714d() {
    }

    /* renamed from: a */
    public static C41686c m55950a() {
        if (f60916c == null) {
            return f60917d;
        }
        return f60916c;
    }

    /* renamed from: c */
    public final boolean mo47120c() {
        int i;
        C41686c a = m55950a();
        if (a != null) {
            i = a.f105479V;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo47121d() {
        int i;
        C41686c a = m55950a();
        if (a != null) {
            i = a.f105480W;
        } else {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m55952e() {
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf guardianChildScheme = inst.getGuardianChildScheme();
        C52711k.m112236a((Object) guardianChildScheme, "SharePrefCache.inst().guardianChildScheme");
        String str = (String) guardianChildScheme.mo47782d();
        if (str != null) {
            if (!(!TextUtils.isEmpty(str))) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return C23033au.m56551b();
    }

    /* renamed from: f */
    public static String m55953f() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            FeConfigCollection feConfigCollection = b.getFeConfigCollection();
            C52711k.m112236a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
            FEConfig guardianEntrance = feConfigCollection.getGuardianEntrance();
            C52711k.m112236a((Object) guardianEntrance, "SettingsReader.get().feC…llection.guardianEntrance");
            return guardianEntrance.getSchema();
        } catch (C10174a unused) {
            return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fmain%2Fguardian_entrance%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
        }
    }

    static {
        Keva repoSync = Keva.getRepoSync("repo_parental_platform", 0);
        C52711k.m112236a((Object) repoSync, "Keva.getRepoSync(REPO_NA…ants.MODE_SINGLE_PROCESS)");
        f60915b = repoSync;
        if (repoSync.getBoolean("valid", false)) {
            C41686c cVar = new C41686c();
            cVar.f105479V = f60915b.getInt("teen_mode", 0);
            cVar.f105458A = f60915b.getBoolean("chatSettingOpenEveryone", false);
            cVar.f105481X = f60915b.getInt("parentalGuardianMode", 0);
            cVar.f105480W = f60915b.getInt("screenTimeManagement", 0);
            cVar.f105482Y = f60915b.getInt("parentalGuardianEntrance", 0);
            f60917d = cVar;
        }
    }

    /* renamed from: b */
    public final C22687a mo47119b() {
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin() || m55950a() == null) {
            return C22687a.CLOSE;
        }
        return m55951b(m55950a());
    }

    /* renamed from: b */
    public static C22687a m55951b(C41686c cVar) {
        if (cVar == null) {
            return C22687a.CLOSE;
        }
        switch (cVar.f105481X) {
            case 0:
                return C22687a.CLOSE;
            case 1:
                return C22687a.NONE;
            case 2:
                return C22687a.CHILD;
            case 3:
                return C22687a.PARENT;
            case 4:
                return C22687a.UNLINK_LOCKED;
            default:
                return C22687a.CLOSE;
        }
    }

    /* renamed from: a */
    public final void mo47118a(C41686c cVar) {
        f60916c = cVar;
        f60917d = cVar;
        if (cVar == null) {
            f60915b.storeBoolean("valid", false);
            return;
        }
        f60915b.storeBoolean("valid", true);
        f60915b.storeInt("teen_mode", cVar.f105479V);
        f60915b.storeBoolean("chatSettingOpenEveryone", cVar.f105458A);
        f60915b.storeInt("parentalGuardianMode", cVar.f105481X);
        f60915b.storeInt("screenTimeManagement", cVar.f105480W);
        f60915b.storeInt("parentalGuardianEntrance", cVar.f105482Y);
    }
}
