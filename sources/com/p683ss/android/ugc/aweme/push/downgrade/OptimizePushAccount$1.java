package com.p683ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import com.p683ss.android.p1159di.push.C19073a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.OptimizePushAccount$1 */
class OptimizePushAccount$1 implements LegoTask {
    OptimizePushAccount$1() {
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        C19073a.m46451a().initPushAccountService(C20854a.m53167g().isLogin());
    }
}
