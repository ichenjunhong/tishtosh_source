package com.p683ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.C17855b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.task.InitFireBase */
public class InitFireBase implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        C17855b.m43783a(context);
        initFirebase(context);
    }

    public static void initFirebase(Context context) {
        if (C18920g.m46048a(context)) {
            String serverDeviceId = AppLog.getServerDeviceId();
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
            if (!TextUtils.isEmpty(serverDeviceId)) {
                instance.mo34670a(serverDeviceId);
            }
        }
    }
}
