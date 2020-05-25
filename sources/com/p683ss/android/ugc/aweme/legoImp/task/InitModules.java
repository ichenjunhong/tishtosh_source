package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitModules */
public class InitModules implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    private void initAccount() {
        if (C20854a.m53167g().isLogin()) {
            AppLog.setUserId(Long.parseLong(C20854a.m53167g().getCurUserId()));
            AppLog.setSessionKey(C20854a.m53167g().getSessionKey());
        }
    }

    public void run(Context context) {
        C23794bh.m58412z().mo47722f((Application) context);
        initAccount();
    }
}
