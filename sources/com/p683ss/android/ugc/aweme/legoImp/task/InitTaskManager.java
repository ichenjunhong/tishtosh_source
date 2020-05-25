package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.C23566n.C23568a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitTaskManager */
public class InitTaskManager implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        C23566n.m57766a().mo48751a(new C23568a().mo48753a(C24076h.m58902c()));
    }
}
