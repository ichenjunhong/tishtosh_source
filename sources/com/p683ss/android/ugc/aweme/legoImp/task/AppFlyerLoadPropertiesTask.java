package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AppFlyerLoadPropertiesTask */
public class AppFlyerLoadPropertiesTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        AppsFlyerProperties.getInstance().loadProperties(context);
    }
}
