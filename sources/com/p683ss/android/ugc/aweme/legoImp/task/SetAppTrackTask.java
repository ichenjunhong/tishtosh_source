package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.p1167g.C19161a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SetAppTrackTask */
public class SetAppTrackTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        C32458a.m75144a("SetAppTrackTask");
        setAppTrack(context);
    }

    private static void setAppTrack(Context context) {
        try {
            String a = C19161a.m46711a(context.getPackageCodePath());
            if (!TextUtils.isEmpty(a)) {
                AppLog.setAppTrack(new JSONObject(a));
                Editor edit = C35807d.m80935a(context, "applog_stats", 0).edit();
                edit.putString("app_track", a);
                edit.apply();
            }
        } catch (Throwable unused) {
        }
    }
}
