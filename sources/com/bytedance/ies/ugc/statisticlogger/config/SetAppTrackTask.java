package com.bytedance.ies.ugc.statisticlogger.config;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.deviceregister.p1154a.C19002a;
import com.p683ss.android.p1167g.C19161a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

public final class SetAppTrackTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        try {
            String a = C19161a.m46711a(context.getPackageCodePath());
            if (!TextUtils.isEmpty(a)) {
                AppLog.setAppTrack(new JSONObject(a));
                Editor edit = C35807d.m80935a(context, C19002a.m46175a(), 0).edit();
                edit.putString("app_track", a);
                edit.apply();
            }
        } catch (Throwable unused) {
        }
    }
}
