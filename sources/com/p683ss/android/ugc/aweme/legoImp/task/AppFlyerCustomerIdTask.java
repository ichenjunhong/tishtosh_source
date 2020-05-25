package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AppFlyerCustomerIdTask */
public class AppFlyerCustomerIdTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        AppsFlyerLib.getInstance().setCustomerUserId(C20854a.m53167g().getCurUserId());
    }
}
