package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LoginProxyTask */
public class LoginProxyTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        C27965f.m66727a(new I18nLoginActivityComponent());
    }
}
