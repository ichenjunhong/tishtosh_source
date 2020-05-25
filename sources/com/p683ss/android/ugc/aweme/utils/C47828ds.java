package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47460f;

/* renamed from: com.ss.android.ugc.aweme.utils.ds */
final /* synthetic */ class C47828ds implements OnClickListener {

    /* renamed from: a */
    private final boolean f120384a;

    /* renamed from: b */
    private final Context f120385b;

    /* renamed from: c */
    private final Runnable f120386c;

    C47828ds(boolean z, Context context, Runnable runnable) {
        this.f120384a = z;
        this.f120385b = context;
        this.f120386c = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.f120384a;
        Context context = this.f120385b;
        Runnable runnable = this.f120386c;
        dialogInterface.dismiss();
        if (z) {
            C26890h.m65011a("notification_setting_alert_close", C23089d.m56640a().mo47829a("enter_from", "notification_setting_page").f61491a);
        } else {
            C26890h.m65011a("push_pre_permission_deny", C23089d.m56640a().f61491a);
        }
        SharedPreferences a = C35807d.m80935a(context, "NotificationGuide", 0);
        Editor edit = a.edit();
        edit.putInt("guide_show_times", a.getInt("guide_show_times", 0) + 1);
        edit.putLong("guide_last_time", System.currentTimeMillis());
        edit.apply();
        if (runnable != null) {
            runnable.run();
        }
        C47718bf.m103288a(new C47460f(false));
    }
}
