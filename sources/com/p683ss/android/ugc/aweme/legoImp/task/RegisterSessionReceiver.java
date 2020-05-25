package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.IntentFilter;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.login.SessionExpireReceiver;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.RegisterSessionReceiver */
public class RegisterSessionReceiver implements LegoTask {
    private SessionExpireReceiver mSessionExpireReceiver = new SessionExpireReceiver();

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        context.registerReceiver(this.mSessionExpireReceiver, new IntentFilter("session_expire"));
    }
}
