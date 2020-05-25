package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.utils.dr */
final /* synthetic */ class C47827dr implements OnClickListener {

    /* renamed from: a */
    private final Context f120381a;

    /* renamed from: b */
    private final boolean f120382b;

    /* renamed from: c */
    private final Runnable f120383c;

    C47827dr(Context context, boolean z, Runnable runnable) {
        this.f120381a = context;
        this.f120382b = z;
        this.f120383c = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f120381a;
        boolean z = this.f120382b;
        Runnable runnable = this.f120383c;
        try {
            C47818dm.m103459b(context);
        } catch (Exception unused) {
            context.startActivity(new Intent("android.settings.SETTINGS"));
        }
        if (z) {
            C26890h.m65011a("notification_setting_alert_click", C23089d.m56640a().mo47829a("enter_from", "notification_setting_page").f61491a);
        } else {
            C26890h.m65011a("push_pre_permission_auth", C23089d.m56640a().f61491a);
        }
        SharedPreferences a = C35807d.m80935a(context, "NotificationGuide", 0);
        Editor edit = a.edit();
        edit.putInt("guide_show_times", a.getInt("guide_show_times", 0) + 1);
        edit.putLong("guide_last_time", System.currentTimeMillis());
        edit.apply();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
