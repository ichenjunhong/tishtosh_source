package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.p521a.C9373b;
import com.bytedance.crash.C9610j;
import com.bytedance.geckox.utils.C10154d;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29976e;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.utils.C47737bu;
import com.p683ss.android.ugc.aweme.utils.GeckoXNormalRequestTime;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest */
public final class GeckoCheckInRequest implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest$a */
    static final class C41247a implements Runnable {

        /* renamed from: a */
        public static final C41247a f104692a = new C41247a();

        C41247a() {
        }

        public final void run() {
            boolean z;
            boolean z2;
            String i = C11010c.m22288i();
            CharSequence charSequence = i;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Context a = C11010c.m22280a();
                if (a != null) {
                    try {
                        i = C9373b.m18553a(a, "SS_VERSION_NAME");
                    } catch (Throwable unused) {
                    }
                    CharSequence charSequence2 = i;
                    if (charSequence2 == null || charSequence2.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        try {
                            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
                            i = packageInfo != null ? packageInfo.versionName : null;
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(AppLog.getServerDeviceId())) {
                return;
            }
            if (!C47731bq.f120240b || SystemClock.elapsedRealtime() - C47731bq.f120239a >= 3600000) {
                if (((Set) SharePrefCache.inst().getGeckoChannels().mo47782d()).isEmpty()) {
                    C23794bh.m58383I().addSettingChangeListener(new C47737bu(i));
                } else {
                    C47731bq.m103350e(i);
                }
                C47731bq.m103342c();
                C47731bq.f120240b = true;
                C47731bq.f120239a = SystemClock.elapsedRealtime();
                HashMap hashMap = new HashMap();
                if (C47731bq.m103352f()) {
                    hashMap.put("gecko_version", "2.0.1-rc.8");
                } else {
                    hashMap.put("gecko_version", "1.2.8-alpha.11");
                }
                C9610j.m19135a((Map<? extends String, ? extends String>) hashMap);
            }
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        String str;
        C52711k.m112240b(context, "context");
        try {
            new Handler(Looper.getMainLooper()).postDelayed(C41247a.f104692a, C10193n.m20607a().mo18201a(GeckoXNormalRequestTime.class, "gecko_normal_request_time", C10181b.m20511a().mo18175c().getGeckoNormalRequestTime(), 60000));
            if (C47731bq.m103352f()) {
                str = "offline";
            } else {
                str = "offlineX";
            }
            try {
                C10154d.m20480a(new File(C11010c.m22280a().getFilesDir(), str));
            } catch (Throwable unused) {
            }
        } catch (Exception e) {
            C29976e.f78229a.mo60155a(e);
        }
    }
}
