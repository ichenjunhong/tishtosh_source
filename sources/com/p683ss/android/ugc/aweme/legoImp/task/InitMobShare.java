package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.common.utility.p526f.C9409b;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.share.C42229q;
import com.p683ss.android.ugc.aweme.share.C42230r;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitMobShare */
public class InitMobShare implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        try {
            C42229q qVar = new C42229q(C24095a.m58950g(), C24095a.m58951h(), C24095a.m58952i(), "tiktok", TeaAgent.getInstallId());
            C9409b.m18608a(C42230r.class).mo17050a("sMobKey", (Object) qVar);
        } catch (Exception unused) {
        }
    }
}
