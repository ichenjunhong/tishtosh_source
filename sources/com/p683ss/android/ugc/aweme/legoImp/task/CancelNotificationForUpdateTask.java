package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.NotificationManager;
import android.content.Context;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CancelNotificationForUpdateTask */
public class CancelNotificationForUpdateTask implements LegoTask {
    private NotificationManager notificationManager;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public CancelNotificationForUpdateTask(NotificationManager notificationManager2) {
        this.notificationManager = notificationManager2;
    }

    public void run(Context context) {
        C32458a.m75144a("CancelNotificationForUpdateTask");
        try {
            this.notificationManager.cancel(R.id.crk);
        } catch (Exception unused) {
        }
    }
}
