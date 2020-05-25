package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask */
public class SharePreferencePreloadForAllProcessTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        C32458a.m75144a("SharePreferencePreloadForAllProcessTask");
        preloadSharedPreferences(context, "app_setting", 0);
        preloadSharedPreferences(context, "use_https", 0);
        preloadSharedPreferences(context, "update_params", 0);
        preloadSharedPreferences(context, "is_allow_oppo_push", 0);
        preloadSharedPreferences(context, "push_setting", 0);
        preloadSharedPreferences(context, "push_multi_process_config", 4);
        preloadSharedPreferences(context, "applog_stats", 0);
    }

    private void preloadSharedPreferences(Context context, String str, int i) {
        C35807d.m80935a(context, str, i).getAll();
    }
}
